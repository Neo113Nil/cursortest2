package oe0;

import Sc.r;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import te0.C9867b;
import xe.C10737n;
import xe.M;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.SmartLocationPicker$getCurrentLocationSuspend$jobs$1$1", f = "SmartLocationPicker.kt", l = {106, 107}, m = "invokeSuspend")
/* renamed from: oe0.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8706E extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f78119d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f78120e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f78121f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ L f78122g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f78123h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C11115c f78124i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8706E(J j11, Context context, L l11, String str, C11115c c11115c, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f78120e = j11;
        this.f78121f = context;
        this.f78122g = l11;
        this.f78123h = str;
        this.f78124i = c11115c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C11115c c11115c = this.f78124i;
        return new C8706E(this.f78120e, this.f78121f, this.f78122g, this.f78123h, c11115c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8706E) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ac, code lost:
    
        if (r7.f78124i.n(r8, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r8 == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Executor mainExecutor;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78119d;
        if (i11 == 0) {
            Sc.s.b(obj);
            LocationManager b11 = this.f78122g.b();
            String str = this.f78123h;
            this.f78119d = 1;
            this.f78120e.getClass();
            C10737n c10737n = new C10737n(1, Wc.b.b(this));
            c10737n.o();
            try {
                int i12 = Build.VERSION.SDK_INT;
                Context context = this.f78121f;
                if (i12 >= 30) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    mainExecutor = context.getMainExecutor();
                    b11.getCurrentLocation(str, cancellationSignal, mainExecutor, new C8707F(c10737n));
                    c10737n.q(new C8708G(cancellationSignal));
                } else {
                    I i13 = new I(b11, c10737n);
                    b11.requestSingleUpdate(str, i13, context.getMainLooper());
                    c10737n.q(new C8709H(b11, i13));
                }
            } catch (Exception e11) {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(null);
                C9867b.f99466a.a("SmartLocationPicker", "error getCurrentLocation for provider:" + str, e11);
            }
            obj = c10737n.n();
            if (obj == Wc.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        Location location = (Location) obj;
        if (location != null) {
            this.f78119d = 2;
        }
        return Unit.f71690a;
    }
}
