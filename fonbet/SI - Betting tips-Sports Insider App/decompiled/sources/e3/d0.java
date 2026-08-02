package e3;

import androidx.lifecycle.p0;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements u.i, w7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8497e;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f8493a = obj;
        this.f8494b = obj2;
        this.f8495c = obj3;
        this.f8496d = obj4;
        this.f8497e = obj5;
    }

    @Override // u.i
    public Object a(u.h completer) {
        Executor executor = (Executor) this.f8493a;
        l lVar = (l) this.f8494b;
        String str = (String) this.f8495c;
        Function0 function0 = (Function0) this.f8496d;
        p0 p0Var = (p0) this.f8497e;
        Intrinsics.checkNotNullParameter(completer, "completer");
        executor.execute(new e0(lVar, str, function0, p0Var, completer, 0));
        return Unit.f19194a;
    }

    @Override // w7.a
    public Object f(Task task) {
        j9.h hVar = (j9.h) this.f8493a;
        Task task2 = (Task) this.f8494b;
        Task task3 = (Task) this.f8495c;
        Date date = (Date) this.f8496d;
        HashMap hashMap = (HashMap) this.f8497e;
        if (!task2.isSuccessful()) {
            return d5.p(new i9.c("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return d5.p(new i9.c("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            j9.g a7 = hVar.a((String) task2.getResult(), ((b9.a) task3.getResult()).f3092a, date, hashMap);
            return a7.f18312a != 0 ? d5.q(a7) : hVar.f18320e.e(a7.f18313b).l(hVar.f18318c, new io.sentry.android.core.internal.gestures.c(8, a7));
        } catch (i9.d e7) {
            return d5.p(e7);
        }
    }
}
