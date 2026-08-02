package oe0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Unit;
import kotlin.time.b;
import oe0.z;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$startListening$$inlined$flatMapLatest$1", f = "FusedSubscribeLocationUpdates.kt", l = {193}, m = "invokeSuspend")
/* renamed from: oe0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8717h extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super z.b.c>, List<? extends String>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f78192d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC2397i f78193e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f78194f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C8711b f78195g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8717h(kotlin.coroutines.d dVar, C8711b c8711b) {
        super(3, dVar);
        this.f78195g = c8711b;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super z.b.c> interfaceC2397i, List<? extends String> list, kotlin.coroutines.d<? super Unit> dVar) {
        C8717h c8717h = new C8717h(dVar, this.f78195g);
        c8717h.f78193e = interfaceC2397i;
        c8717h.f78194f = list;
        return c8717h.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78192d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i = this.f78193e;
            InterfaceC2395h A11 = C2399j.A(new C8719j(this.f78195g, (List) this.f78194f, null));
            b.Companion companion = kotlin.time.b.INSTANCE;
            Ae.G I11 = C2399j.I(C2399j.P(A11, kotlin.time.c.h(15000L, EnumC10311b.MILLISECONDS)), new C8718i(2, null));
            this.f78192d = 1;
            if (C2399j.r(interfaceC2397i, I11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
