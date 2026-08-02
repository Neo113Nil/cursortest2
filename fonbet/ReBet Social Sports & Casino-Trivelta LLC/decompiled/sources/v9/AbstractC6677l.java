package v9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.C3172e;
import com.google.android.gms.common.C3173f;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.ServiceConnectionC3116a;
import com.google.android.gms.common.internal.AbstractC3182f;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* renamed from: v9.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6677l {
    public static final String[] zza = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: a, reason: collision with root package name */
    public static final String f67122a = "androidPackageName";

    /* renamed from: b, reason: collision with root package name */
    public static final ComponentName f67123b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: c, reason: collision with root package name */
    public static final G9.a f67124c = AbstractC6672g.a("GoogleAuthUtil");

    public static void a(Context context, String str) {
        g(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        p(account);
        return d(context, account, str, bundle, 0L, null).zza();
    }

    public static TokenData d(final Context context, final Account account, final String str, Bundle bundle, long j10, Executor executor) {
        AbstractC3191o.l("Calling this from your main thread can lead to deadlock");
        AbstractC3191o.h(str, "Scope cannot be empty or null.");
        p(account);
        l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        n(context, bundle2);
        zzdc.zzd(context);
        if (zzhw.zze() && q(context)) {
            try {
                Bundle bundle3 = (Bundle) j(zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(context, "getTokenWithDetails", bundle3);
            } catch (com.google.android.gms.common.api.b e10) {
                m(e10, "token retrieval");
            }
        }
        return (TokenData) i(context, f67123b, new InterfaceC6676k() { // from class: v9.i
            @Override // v9.InterfaceC6676k
            public final Object a(IBinder iBinder) {
                return AbstractC6677l.e(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    public static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) {
        Bundle zze = zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return h(context, "getTokenWithDetails", zze);
        }
        throw new IOException("Service call returned null");
    }

    public static /* bridge */ /* synthetic */ Object f(Object obj) {
        k(obj);
        return obj;
    }

    public static void g(Context context, String str, long j10) {
        AbstractC3191o.l("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        zzdc.zzd(context);
        if (zzhw.zze() && q(context)) {
            zzg zza2 = zzh.zza(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.zza(str);
            try {
                j(zza2.zza(zzbwVar), "clear token");
                return;
            } catch (com.google.android.gms.common.api.b e10) {
                m(e10, "clear token");
            }
        }
        i(context, f67123b, new C6675j(str, bundle), 0L, null);
    }

    public static TokenData h(Context context, String str, Bundle bundle) {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new C6666a("Invalid state. Shouldn't happen");
    }

    public static Object i(Context context, ComponentName componentName, InterfaceC6676k interfaceC6676k, long j10, Executor executor) {
        ServiceConnectionC3116a serviceConnectionC3116a = new ServiceConnectionC3116a();
        AbstractC3182f b10 = AbstractC3182f.b(context);
        try {
            try {
                if (!b10.a(componentName, serviceConnectionC3116a, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return interfaceC6676k.a(serviceConnectionC3116a.a());
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } finally {
                b10.d(componentName, serviceConnectionC3116a, "GoogleAuthUtil");
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    public static Object j(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e10) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f67124c.h(format, new Object[0]);
            throw new IOException(format, e10);
        } catch (CancellationException e11) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f67124c.h(format2, new Object[0]);
            throw new IOException(format2, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof com.google.android.gms.common.api.b) {
                throw ((com.google.android.gms.common.api.b) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f67124c.h(format3, new Object[0]);
            throw new IOException(format3, e12);
        }
    }

    public static Object k(Object obj) {
        if (obj != null) {
            return obj;
        }
        f67124c.h("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    public static void l(Context context, int i10) {
        try {
            AbstractC3175h.b(context.getApplicationContext(), i10);
        } catch (GooglePlayServicesIncorrectManifestValueException | C3172e e10) {
            throw new C6666a(e10.getMessage(), e10);
        } catch (C3173f e11) {
            throw new C6668c(e11.b(), e11.getMessage(), e11.a());
        }
    }

    public static void m(com.google.android.gms.common.api.b bVar, String str) {
        f67124c.h("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    public static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f67122a;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) {
        zzby zza2 = zzby.zza(str2);
        G9.a aVar = f67124c;
        aVar.h(String.format("[GoogleAuthUtil] error status:%s with method:%s", zza2, str), new Object[0]);
        if (!zzby.BAD_AUTHENTICATION.equals(zza2) && !zzby.CAPTCHA.equals(zza2) && !zzby.NEED_PERMISSION.equals(zza2) && !zzby.NEED_REMOTE_CONSENT.equals(zza2) && !zzby.NEEDS_BROWSER.equals(zza2) && !zzby.USER_CANCEL.equals(zza2) && !zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zza2) && !zzby.DM_INTERNAL_ERROR.equals(zza2) && !zzby.DM_SYNC_DISABLED.equals(zza2) && !zzby.DM_ADMIN_BLOCKED.equals(zza2) && !zzby.DM_ADMIN_PENDING_APPROVAL.equals(zza2) && !zzby.DM_STALE_SYNC_REQUIRED.equals(zza2) && !zzby.DM_DEACTIVATED.equals(zza2) && !zzby.DM_REQUIRED.equals(zza2) && !zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zza2) && !zzby.DM_SCREENLOCK_REQUIRED.equals(zza2)) {
            if (!zzby.NETWORK_ERROR.equals(zza2) && !zzby.SERVICE_UNAVAILABLE.equals(zza2) && !zzby.INTNERNAL_ERROR.equals(zza2) && !zzby.AUTH_SECURITY_ERROR.equals(zza2) && !zzby.ACCOUNT_NOT_PRESENT.equals(zza2)) {
                throw new C6666a(str2);
            }
            throw new IOException(str2);
        }
        zzdc.zzd(context);
        if (!zzht.zzc()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
        }
        if (GoogleApiAvailability.r().b(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            aVar.c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.MAX_VALUE, str, Integer.MAX_VALUE), new Object[0]);
        }
        if (intent == null) {
            aVar.c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    public static void p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = zza;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    public static boolean q(Context context) {
        if (GoogleApiAvailability.r().j(context, 17895000) != 0) {
            return false;
        }
        List zzq = zzhw.zzb().zzq();
        String str = context.getApplicationInfo().packageName;
        Iterator it = zzq.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
