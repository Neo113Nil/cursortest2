package oe0;

import Ae.C2399j;
import Ae.C2403l;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oe0.z;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$startListening$1$workLocationFlow$1", f = "FusedSubscribeLocationUpdates.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* renamed from: oe0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8719j extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super z.b.c>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f78197d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f78198e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8711b f78199f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ List<String> f78200g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8719j(C8711b c8711b, List<String> list, kotlin.coroutines.d<? super C8719j> dVar) {
        super(2, dVar);
        this.f78199f = c8711b;
        this.f78200g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8719j c8719j = new C8719j(this.f78199f, this.f78200g, dVar);
        c8719j.f78198e = obj;
        return c8719j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super z.b.c> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8719j) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2395h interfaceC2395h;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78197d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.f78198e;
            C8711b c8711b = this.f78199f;
            List a11 = C8711b.a(c8711b, this.f78200g);
            int size = a11.size();
            if (size != 1) {
                interfaceC2395h = null;
                if (size == 2) {
                    InterfaceC2395h firstFlow = (InterfaceC2395h) C7714v.K(a11);
                    InterfaceC2395h secondFlow = (InterfaceC2395h) C7714v.X(a11);
                    C8721l determineWinner = new C8721l(2, c8711b, C8711b.class, "detektWinnerListOfLocations", "detektWinnerListOfLocations$mapsdk_fullFirebaseOpenglRelease(Ljava/util/List;Ljava/util/List;)Lru/ozon/mapsdk/common/locationcontroller/locationProvider/FusedSubscribeLocationUpdates$Winner;", 0);
                    Intrinsics.checkNotNullParameter(firstFlow, "firstFlow");
                    Intrinsics.checkNotNullParameter(secondFlow, "secondFlow");
                    Intrinsics.checkNotNullParameter(determineWinner, "determineWinner");
                    interfaceC2395h = C2399j.f(new C8714e(firstFlow, secondFlow, determineWinner, null));
                }
            } else {
                interfaceC2395h = (InterfaceC2395h) C7714v.K(a11);
            }
            if (interfaceC2395h == null) {
                interfaceC2395h = new C2403l(new z.b.c[0]);
            }
            this.f78197d = 1;
            if (C2399j.r(interfaceC2397i, interfaceC2395h, this) == aVar) {
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
