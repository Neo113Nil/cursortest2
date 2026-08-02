package io.sentry.util;

import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.sentry.C7133d;
import io.sentry.C7175n1;
import io.sentry.C7209u1;
import io.sentry.U;
import io.sentry.W2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ra0.C9239a;

/* loaded from: classes10.dex */
public final /* synthetic */ class x implements C7209u1.a, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f68606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f68607b;

    public /* synthetic */ x(Object obj, Object obj2) {
        this.f68606a = obj;
        this.f68607b = obj2;
    }

    @Override // io.sentry.C7209u1.a
    public void a(C7175n1 c7175n1) {
        C7133d a11 = c7175n1.a();
        if (a11.f()) {
            a11.j((U) this.f68606a, (W2) this.f68607b);
            a11.a();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            bool = (Boolean) task.getResult();
        } else {
            ApiException apiException = (ApiException) task.getException();
            ((C9239a) this.f68606a).getClass();
            if (apiException != null) {
                Log.d("GooglePayWalletManagerImpl", "Google pay exception while check if tokenized with message: " + apiException.getLocalizedMessage() + " and status code: " + apiException.getStatusCode());
            }
            bool = Boolean.FALSE;
        }
        Intrinsics.f(bool);
        ((Function1) this.f68607b).invoke(bool);
    }
}
