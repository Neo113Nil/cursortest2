package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class s1c extends v7a {
    public final MeasurementManager h;

    public s1c(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.h = measurementManager;
    }

    public static Object L(s1c s1cVar, dx4 dx4Var, rq3<? super Unit> rq3Var) {
        new lj2(1, z9a.b(rq3Var)).t();
        MeasurementManager measurementManager = s1cVar.h;
        throw null;
    }

    public static Object M(s1c s1cVar, rq3<? super Integer> rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        s1cVar.h.getMeasurementApiStatus(new hg0(1), new uq3(lj2Var));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public static Object O(s1c s1cVar, lwh lwhVar, rq3<? super Unit> rq3Var) {
        Object r = s9a.r(new qa7(s1cVar, (rq3) null, 22), rq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    public static Object P(s1c s1cVar, Uri uri, InputEvent inputEvent, rq3<? super Unit> rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        s1cVar.h.registerSource(uri, inputEvent, new hg0(1), new uq3(lj2Var));
        Object q = lj2Var.q();
        return q == lu3.a ? q : Unit.a;
    }

    public static Object Q(s1c s1cVar, Uri uri, rq3<? super Unit> rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        s1cVar.h.registerTrigger(uri, new hg0(1), new uq3(lj2Var));
        Object q = lj2Var.q();
        return q == lu3.a ? q : Unit.a;
    }

    public static Object S(s1c s1cVar, n0l n0lVar, rq3<? super Unit> rq3Var) {
        new lj2(1, z9a.b(rq3Var)).t();
        MeasurementManager measurementManager = s1cVar.h;
        throw null;
    }

    public static Object U(s1c s1cVar, o0l o0lVar, rq3<? super Unit> rq3Var) {
        new lj2(1, z9a.b(rq3Var)).t();
        MeasurementManager measurementManager = s1cVar.h;
        throw null;
    }

    @Override // defpackage.v7a
    @Nullable
    public Object B(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull rq3<? super Unit> rq3Var) {
        return P(this, uri, inputEvent, rq3Var);
    }

    @Override // defpackage.v7a
    @Nullable
    public Object C(@NotNull Uri uri, @NotNull rq3<? super Unit> rq3Var) {
        return Q(this, uri, rq3Var);
    }

    @Nullable
    public Object K(@NotNull dx4 dx4Var, @NotNull rq3<? super Unit> rq3Var) {
        return L(this, dx4Var, rq3Var);
    }

    @Nullable
    public Object N(@NotNull lwh lwhVar, @NotNull rq3<? super Unit> rq3Var) {
        return O(this, lwhVar, rq3Var);
    }

    @Nullable
    public Object R(@NotNull n0l n0lVar, @NotNull rq3<? super Unit> rq3Var) {
        return S(this, n0lVar, rq3Var);
    }

    @Nullable
    public Object T(@NotNull o0l o0lVar, @NotNull rq3<? super Unit> rq3Var) {
        return U(this, o0lVar, rq3Var);
    }

    @Override // defpackage.v7a
    @Nullable
    public Object t(@NotNull rq3<? super Integer> rq3Var) {
        return M(this, rq3Var);
    }
}
