package com.sofascore.results.firebase;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.a70;
import defpackage.b19;
import defpackage.de0;
import defpackage.jdb;
import defpackage.lu3;
import defpackage.m6k;
import defpackage.mha;
import defpackage.oog;
import defpackage.r38;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.sz8;
import defpackage.x09;
import defpackage.y6a;
import defpackage.yq5;
import defpackage.z9a;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/results/firebase/GoogleMobileWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogleMobileWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMobileWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(rq3 rq3Var) {
        b19 b19Var;
        int i;
        FirebaseMessaging firebaseMessaging;
        Task task;
        String str;
        String O;
        if (rq3Var instanceof b19) {
            b19Var = (b19) rq3Var;
            int i2 = b19Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b19Var.t = i2 - Integer.MIN_VALUE;
                Object obj = b19Var.r;
                lu3 lu3Var = lu3.a;
                i = b19Var.t;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    if (b.j(0, 2, 18).contains(Integer.valueOf(GoogleApiAvailability.e.b(applicationContext, GoogleApiAvailabilityLight.a)))) {
                        b19Var.t = 1;
                        oog oogVar = new oog(z9a.b(b19Var));
                        synchronized (FirebaseMessaging.class) {
                            firebaseMessaging = FirebaseMessaging.getInstance(r38.c());
                        }
                        if (firebaseMessaging.d.n()) {
                            task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                        } else {
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            firebaseMessaging.g.execute(new yq5(5, firebaseMessaging, taskCompletionSource));
                            task = taskCompletionSource.getTask();
                        }
                        task.addOnSuccessListener(new sz8(new x09(oogVar, i3), 27)).addOnFailureListener(new de0(oogVar, 23));
                        obj = oogVar.b();
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return jdb.a();
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                str = (String) obj;
                if (str != null && str.length() != 0) {
                    O = m6k.O(getApplicationContext());
                    m6k.c0(getApplicationContext(), str);
                    if (!Intrinsics.c(O, str)) {
                        Context applicationContext2 = getApplicationContext();
                        applicationContext2.getClass();
                        mha.F(applicationContext2);
                    }
                }
                return jdb.a();
            }
        }
        b19Var = new b19(this, (sq3) rq3Var);
        Object obj2 = b19Var.r;
        lu3 lu3Var2 = lu3.a;
        i = b19Var.t;
        int i32 = 1;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
            O = m6k.O(getApplicationContext());
            m6k.c0(getApplicationContext(), str);
            if (!Intrinsics.c(O, str)) {
            }
        }
        return jdb.a();
    }
}
