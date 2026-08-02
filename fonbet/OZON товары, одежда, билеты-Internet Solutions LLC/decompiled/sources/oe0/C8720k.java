package oe0;

import Ae.C0;
import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import oe0.z;
import te0.C9867b;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$startListening$2", f = "FusedSubscribeLocationUpdates.kt", l = {230}, m = "invokeSuspend")
/* renamed from: oe0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8720k extends kotlin.coroutines.jvm.internal.j implements Function2<z.b.c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f78201d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f78202e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8711b f78203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8720k(kotlin.coroutines.d dVar, C8711b c8711b) {
        super(2, dVar);
        this.f78203f = c8711b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8720k c8720k = new C8720k(dVar, this.f78203f);
        c8720k.f78202e = obj;
        return c8720k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(z.b.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8720k) create(cVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78201d;
        if (i11 == 0) {
            Sc.s.b(obj);
            z.b.c cVar = (z.b.c) this.f78202e;
            String a11 = cVar.a();
            Location b11 = cVar.b();
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("Receive location updates providerName:" + a11 + " raw value: " + b11, null, 6);
            if (b11 != null) {
                c02 = this.f78203f.f78138d;
                this.f78201d = 1;
                if (c02.emit(b11, this) == aVar) {
                    return aVar;
                }
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
