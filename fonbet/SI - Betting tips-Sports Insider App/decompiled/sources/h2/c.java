package h2;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.internal.measurement.d5;
import eg.c0;
import eg.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c extends d5 {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f10343a;

    public c(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f10343a = mMeasurementManager;
    }

    public static Object q0(c cVar, a aVar, Continuation<? super Unit> continuation) {
        new l(1, lf.d.b(continuation)).s();
        MeasurementManager measurementManager = cVar.f10343a;
        throw null;
    }

    public static Object r0(c cVar, Continuation<? super Integer> frame) {
        l lVar = new l(1, lf.d.b(frame));
        lVar.s();
        cVar.f10343a.getMeasurementApiStatus(new o.a(1), new l0.e(lVar));
        Object r5 = lVar.r();
        if (r5 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5;
    }

    public static Object s0(c cVar, Uri uri, InputEvent inputEvent, Continuation<? super Unit> frame) {
        l lVar = new l(1, lf.d.b(frame));
        lVar.s();
        cVar.f10343a.registerSource(uri, inputEvent, new o.a(1), new l0.e(lVar));
        Object r5 = lVar.r();
        lf.a aVar = lf.a.f20034a;
        if (r5 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5 == aVar ? r5 : Unit.f19194a;
    }

    public static Object t0(c cVar, d dVar, Continuation<? super Unit> continuation) {
        Object i5 = c0.i(new ab.b(cVar, (Continuation) null, 9), continuation);
        return i5 == lf.a.f20034a ? i5 : Unit.f19194a;
    }

    public static Object u0(c cVar, Uri uri, Continuation<? super Unit> frame) {
        l lVar = new l(1, lf.d.b(frame));
        lVar.s();
        cVar.f10343a.registerTrigger(uri, new o.a(1), new l0.e(lVar));
        Object r5 = lVar.r();
        lf.a aVar = lf.a.f20034a;
        if (r5 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5 == aVar ? r5 : Unit.f19194a;
    }

    public static Object v0(c cVar, e eVar, Continuation<? super Unit> continuation) {
        new l(1, lf.d.b(continuation)).s();
        MeasurementManager measurementManager = cVar.f10343a;
        throw null;
    }

    public static Object w0(c cVar, f fVar, Continuation<? super Unit> continuation) {
        new l(1, lf.d.b(continuation)).s();
        MeasurementManager measurementManager = cVar.f10343a;
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    @Nullable
    public Object L(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation) {
        return s0(this, uri, inputEvent, continuation);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    @Nullable
    public Object M(@NotNull d dVar, @NotNull Continuation<? super Unit> continuation) {
        return t0(this, dVar, continuation);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    @Nullable
    public Object N(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation) {
        return u0(this, uri, continuation);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    @Nullable
    public Object O(@NotNull e eVar, @NotNull Continuation<? super Unit> continuation) {
        return v0(this, eVar, continuation);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    @Nullable
    public Object P(@NotNull f fVar, @NotNull Continuation<? super Unit> continuation) {
        return w0(this, fVar, continuation);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    @Nullable
    public Object n(@NotNull a aVar, @NotNull Continuation<? super Unit> continuation) {
        return q0(this, aVar, continuation);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    @Nullable
    public Object v(@NotNull Continuation<? super Integer> continuation) {
        return r0(this, continuation);
    }
}
