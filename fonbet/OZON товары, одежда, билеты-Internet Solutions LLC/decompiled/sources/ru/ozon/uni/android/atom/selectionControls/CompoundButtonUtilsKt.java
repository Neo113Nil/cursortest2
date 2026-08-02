package ru.ozon.uni.android.atom.selectionControls;

import android.widget.CompoundButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"safeOnRestoreInstanceState", "", "Landroid/widget/CompoundButton;", "superOnRestoreInstanceState", "Lkotlin/Function0;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompoundButtonUtilsKt {
    public static final void safeOnRestoreInstanceState(@NotNull CompoundButton compoundButton, @NotNull Function0<Unit> superOnRestoreInstanceState) {
        Intrinsics.checkNotNullParameter(compoundButton, "<this>");
        Intrinsics.checkNotNullParameter(superOnRestoreInstanceState, "superOnRestoreInstanceState");
        try {
            superOnRestoreInstanceState.invoke();
        } catch (ClassCastException unused) {
        }
    }
}
