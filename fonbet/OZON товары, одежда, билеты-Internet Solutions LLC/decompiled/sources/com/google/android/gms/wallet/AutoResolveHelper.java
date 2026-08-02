package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class AutoResolveHelper {
    public static final int RESULT_ERROR = 1;
    private static final long zzu = TimeUnit.MINUTES.toMillis(10);
    static long zzv = SystemClock.elapsedRealtime();

    private AutoResolveHelper() {
    }

    public static Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void putStatusIntoIntent(@NonNull Intent intent, Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    public static <TResult extends AutoResolvableResult> void resolveTask(@NonNull Task<TResult> task, @NonNull Activity activity, int i11) {
        zzb zzb2 = zzb.zzb(task);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        Fragment zza2 = zza.zza(zzb2.zzag, i11);
        int i12 = zzb2.zzag;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb2.append(i12);
        beginTransaction.add(zza2, sb2.toString()).commit();
    }

    public static <TResult> void zza(Status status, TResult tresult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Activity activity, int i11, Task<? extends AutoResolvableResult> task) {
        int i12;
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        if (task.getException() instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) task.getException()).startResolutionForResult(activity, i11);
                return;
            } catch (IntentSender.SendIntentException e11) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e11);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (task.isSuccessful()) {
            task.getResult().putIntoIntent(intent);
            i12 = -1;
        } else {
            if (task.getException() instanceof ApiException) {
                ApiException apiException = (ApiException) task.getException();
                putStatusIntoIntent(intent, new Status(apiException.getStatusCode(), apiException.getMessage(), (PendingIntent) null));
            } else {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Unexpected non API exception!", task.getException());
                }
                putStatusIntoIntent(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
            }
            i12 = 1;
        }
        zza(activity, i11, i12, intent);
    }

    static class zzb<TResult extends AutoResolvableResult> implements OnCompleteListener<TResult>, Runnable {
        private static final Handler zzad = new com.google.android.gms.internal.wallet.zzi(Looper.getMainLooper());
        static final SparseArray<zzb<?>> zzae = new SparseArray<>(2);
        private static final AtomicInteger zzaf = new AtomicInteger();
        int zzag;
        private zza zzah;
        private Task<TResult> zzai;

        zzb() {
        }

        public static <TResult extends AutoResolvableResult> zzb<TResult> zzb(Task<TResult> task) {
            zzb<TResult> zzbVar = new zzb<>();
            int incrementAndGet = zzaf.incrementAndGet();
            zzbVar.zzag = incrementAndGet;
            zzae.put(incrementAndGet, zzbVar);
            zzad.postDelayed(zzbVar, AutoResolveHelper.zzu);
            task.addOnCompleteListener(zzbVar);
            return zzbVar;
        }

        private final void zzd() {
            if (this.zzai == null || this.zzah == null) {
                return;
            }
            zzae.delete(this.zzag);
            zzad.removeCallbacks(this);
            this.zzah.zza(this.zzai);
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(@NonNull Task<TResult> task) {
            this.zzai = task;
            zzd();
        }

        @Override // java.lang.Runnable
        public final void run() {
            zzae.delete(this.zzag);
        }

        public final void zza(zza zzaVar) {
            this.zzah = zzaVar;
            zzd();
        }

        public final void zzb(zza zzaVar) {
            if (this.zzah == zzaVar) {
                this.zzah = null;
            }
        }
    }

    public static class zza extends Fragment {
        private static String zzw = "resolveCallId";
        private static String zzx = "requestCode";
        private static String zzy = "initializationElapsedRealtime";
        private static String zzz = "delivered";
        private int zzaa;
        private zzb<?> zzab;
        private boolean zzac;

        /* JADX INFO: Access modifiers changed from: private */
        public static Fragment zza(int i11, int i12) {
            Bundle bundle = new Bundle();
            bundle.putInt(zzw, i11);
            bundle.putInt(zzx, i12);
            bundle.putLong(zzy, AutoResolveHelper.zzv);
            zza zzaVar = new zza();
            zzaVar.setArguments(bundle);
            return zzaVar;
        }

        private final void zzc() {
            zzb<?> zzbVar = this.zzab;
            if (zzbVar != null) {
                zzbVar.zzb(this);
            }
        }

        @Override // android.app.Fragment
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.zzaa = getArguments().getInt(zzx);
            if (AutoResolveHelper.zzv != getArguments().getLong(zzy)) {
                this.zzab = null;
            } else {
                this.zzab = zzb.zzae.get(getArguments().getInt(zzw));
            }
            this.zzac = bundle != null && bundle.getBoolean(zzz);
        }

        @Override // android.app.Fragment
        public final void onPause() {
            super.onPause();
            zzc();
        }

        @Override // android.app.Fragment
        public final void onResume() {
            super.onResume();
            zzb<?> zzbVar = this.zzab;
            if (zzbVar != null) {
                zzbVar.zza(this);
                return;
            }
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
            }
            zza(null);
        }

        @Override // android.app.Fragment
        public final void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean(zzz, this.zzac);
            zzc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(Task<? extends AutoResolvableResult> task) {
            if (this.zzac) {
                return;
            }
            this.zzac = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (task != null) {
                AutoResolveHelper.zza(activity, this.zzaa, task);
            } else {
                AutoResolveHelper.zza(activity, this.zzaa, 0, new Intent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Activity activity, int i11, int i12, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i11, intent, 1073741824);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                createPendingResult.send(i12);
            } catch (PendingIntent.CanceledException e11) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e11);
                }
            }
        }
    }
}
