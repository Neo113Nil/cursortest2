package ue;

import androidx.lifecycle.o;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.ui.viewpage.ViewCloudFragment;
import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24244b;

    /* renamed from: c, reason: collision with root package name */
    public int f24245c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewCloudFragment f24246d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewCloudFragment viewCloudFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f24244b = i5;
        this.f24246d = viewCloudFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f24244b) {
            case 0:
                return new a(this.f24246d, continuation, 0);
            default:
                return new a(this.f24246d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f24244b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24244b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f24245c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                m3.f fVar = new m3.f(17);
                Pair[] pairArr = {this.f24246d.f7070h};
                this.f24245c = 1;
                Object A = c0.A(m0.f9201a, new o(pairArr, fVar, (Continuation) null, 9), this);
                return A == aVar ? aVar : A;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f24245c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f24245c = 1;
                ((la.a) y3.m(la.a.class, null, 6)).getClass();
                Object C0 = new bb.b().C0(this);
                return C0 == aVar2 ? aVar2 : C0;
        }
    }
}
