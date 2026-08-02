package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 extends mf.h implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1305a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1306b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f1307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(View view, Continuation continuation) {
        super(2, continuation);
        this.f1307c = view;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        e1 e1Var = new e1(this.f1307c, continuation);
        e1Var.f1306b = obj;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((bg.j) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f1305a;
        if (i5 == 0) {
            h8.b.B(obj);
            bg.j jVar = (bg.j) this.f1306b;
            View view = this.f1307c;
            this.f1306b = jVar;
            this.f1305a = 1;
            jVar.c(view, this);
            return aVar;
        }
        if (i5 == 1) {
            bg.j jVar2 = (bg.j) this.f1306b;
            h8.b.B(obj);
            View view2 = this.f1307c;
            if (view2 instanceof ViewGroup) {
                this.f1306b = null;
                this.f1305a = 2;
                jVar2.getClass();
                Object d10 = jVar2.d(new g0(new d1((ViewGroup) view2)), this);
                if (d10 != aVar) {
                    d10 = Unit.f19194a;
                }
                if (d10 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }
}
