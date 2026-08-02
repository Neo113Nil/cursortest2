package e;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.g1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f8398b;

    public /* synthetic */ c(j jVar, int i5) {
        this.f8397a = i5;
        this.f8398b = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8397a) {
            case 0:
                this.f8398b.reportFullyDrawn();
                return Unit.f19194a;
            case 1:
                j jVar = this.f8398b;
                return new t(jVar.f8421f, new c(jVar, 0));
            case 2:
                d2.a aVar = new d2.a();
                this.f8398b.getOnBackPressedDispatcher().f8404b.b(aVar);
                return aVar;
            case 3:
                j jVar2 = this.f8398b;
                return new g1(jVar2.getApplication(), jVar2, jVar2.getIntent() != null ? jVar2.getIntent().getExtras() : null);
            default:
                j jVar3 = this.f8398b;
                d0 d0Var = new d0(new b(jVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        jVar3.f3250a.a(new a2.g(2, d0Var, jVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new androidx.appcompat.app.t(10, jVar3, d0Var));
                    }
                }
                return d0Var;
        }
    }
}
