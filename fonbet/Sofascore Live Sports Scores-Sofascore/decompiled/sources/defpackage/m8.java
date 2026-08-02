package defpackage;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class m8 extends o8 {
    public Integer d;
    public List e;
    public d5k f;
    public Function2 g;

    @Nullable
    public final Integer getCurrentlySelected() {
        return this.d;
    }

    @NotNull
    public abstract k8 getLayoutProvider();

    @NotNull
    public final d5k getOnClickListener() {
        d5k d5kVar = this.f;
        if (d5kVar != null) {
            return d5kVar;
        }
        Intrinsics.i("onClickListener");
        throw null;
    }

    @Nullable
    public Function2<String, Integer, Unit> getOnSelectedCallback() {
        return this.g;
    }

    @NotNull
    public final List<String> getTypesList() {
        List<String> list = this.e;
        if (list != null) {
            return list;
        }
        Intrinsics.i("typesList");
        throw null;
    }

    public final void j(int i) {
        this.d = Integer.valueOf(i);
        int childCount = ((mvg) ((kvg) getLayoutProvider()).b.getValue()).c.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = ((mvg) ((kvg) getLayoutProvider()).b.getValue()).c.getChildAt(i2);
            childAt.getClass();
            ((kzg) ((n8) childAt)).e.c.setSelected(i2 == i);
            i2++;
        }
    }

    public final void setCurrentlySelected(@Nullable Integer num) {
        this.d = num;
    }

    public final void setOnClickListener(@NotNull d5k d5kVar) {
        d5kVar.getClass();
        this.f = d5kVar;
    }

    public void setOnSelectedCallback(@Nullable Function2<? super String, ? super Integer, Unit> function2) {
        this.g = function2;
    }

    public final void setTypesList(@NotNull List<String> list) {
        list.getClass();
        this.e = list;
    }
}
