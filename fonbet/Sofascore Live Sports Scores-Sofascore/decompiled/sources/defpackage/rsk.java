package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rsk extends b50 {
    public final View A;
    public final h9d B;
    public rpg C;
    public Function1 D;
    public Function1 E;
    public Function1 F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rsk(Context context, Function1 function1, a aVar, spg spgVar, int i, ryd rydVar) {
        super(context, aVar, i, r4, r5, rydVar);
        View view = (View) function1.invoke(context);
        h9d h9dVar = new h9d();
        this.A = view;
        this.B = h9dVar;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        Object f = spgVar != null ? spgVar.f(valueOf) : null;
        SparseArray<Parcelable> sparseArray = f instanceof SparseArray ? (SparseArray) f : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (spgVar != null) {
            setSavableRegistryEntry(spgVar.a(valueOf, new a50(this, 2)));
        }
        ry ryVar = ry.v;
        this.D = ryVar;
        this.E = ryVar;
        this.F = ryVar;
    }

    private final void setSavableRegistryEntry(rpg rpgVar) {
        rpg rpgVar2 = this.C;
        if (rpgVar2 != null) {
            ((x6k) rpgVar2).z();
        }
        this.C = rpgVar;
    }

    @NotNull
    public final h9d getDispatcher() {
        return this.B;
    }

    @NotNull
    public final Function1<View, Unit> getReleaseBlock() {
        return this.F;
    }

    @NotNull
    public final Function1<View, Unit> getResetBlock() {
        return this.E;
    }

    @Nullable
    public /* bridge */ /* synthetic */ a3 getSubCompositionView() {
        return null;
    }

    @NotNull
    public final Function1<View, Unit> getUpdateBlock() {
        return this.D;
    }

    public final void n() {
        setSavableRegistryEntry(null);
    }

    public final void setReleaseBlock(@NotNull Function1<View, Unit> function1) {
        this.F = function1;
        setRelease(new a50(this, 3));
    }

    public final void setResetBlock(@NotNull Function1<View, Unit> function1) {
        this.E = function1;
        setReset(new a50(this, 4));
    }

    public final void setUpdateBlock(@NotNull Function1<View, Unit> function1) {
        this.D = function1;
        setUpdate(new a50(this, 5));
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }
}
