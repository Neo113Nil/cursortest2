package ld0;

import Jc0.a;
import Jc0.b;
import Kb0.K;
import Sc.r;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugMainFragment$switchInstantLogin$1", f = "OzonIdDebugMainFragment.kt", l = {208, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* renamed from: ld0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7927B extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73183d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f73184e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x f73185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7927B(boolean z11, x xVar, kotlin.coroutines.d<? super C7927B> dVar) {
        super(1, dVar);
        this.f73184e = z11;
        this.f73185f = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new C7927B(this.f73184e, this.f73185f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7927B) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r5 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r5 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        String b11;
        OzonIdDebugActivity F11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73183d;
        if (i11 == 0) {
            Sc.s.b(obj);
            if (this.f73184e) {
                K k11 = Tb0.a.f26975d;
                if (k11 == null) {
                    throw new Lb0.a();
                }
                Jc0.c value = k11.D().getValue();
                this.f73183d = 1;
                obj = b.a.a(value, null, null, this, 7);
            } else {
                K k12 = Tb0.a.f26975d;
                if (k12 == null) {
                    throw new Lb0.a();
                }
                Jc0.c value2 = k12.D().getValue();
                this.f73183d = 2;
                a11 = value2.a(U.c(), this);
            }
            return aVar;
        }
        if (i11 == 1) {
            Sc.s.b(obj);
            Jc0.a aVar2 = (Jc0.a) obj;
            b11 = Intrinsics.d(aVar2, a.b.f14579a) ? "Включен" : Nk.a.b("Ошибка ", N.b(aVar2.getClass()).B());
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            a11 = ((Sc.r) obj).getF26106a();
            r.Companion companion = Sc.r.INSTANCE;
            b11 = !(a11 instanceof r.b) ? "Отключен" : "Ошибка";
        }
        F11 = this.f73185f.F();
        if (F11 != null) {
            F11.R("InstantLogin: " + b11);
        }
        return Unit.f71690a;
    }
}
