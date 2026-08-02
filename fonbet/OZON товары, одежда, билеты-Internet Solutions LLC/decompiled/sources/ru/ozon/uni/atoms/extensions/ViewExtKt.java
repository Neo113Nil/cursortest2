package ru.ozon.uni.atoms.extensions;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a;\u0010\r\u001a\u00020\u0001*\u00020\u00002\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/view/View;", "", "gone", "(Landroid/view/View;)V", "invisible", "show", "enable", "disable", "", "left", "top", "right", "bottom", "updatePadding", "(Landroid/view/View;IIII)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ViewExtKt {
    public static final void disable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(false);
    }

    public static final void enable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(true);
    }

    public static final void gone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void invisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    public static final void show(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public static final void updatePadding(@NotNull View view, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i11, i12, i13, i14);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = view.getPaddingLeft();
        }
        if ((i15 & 2) != 0) {
            i12 = view.getPaddingTop();
        }
        if ((i15 & 4) != 0) {
            i13 = view.getPaddingRight();
        }
        if ((i15 & 8) != 0) {
            i14 = view.getPaddingBottom();
        }
        updatePadding(view, i11, i12, i13, i14);
    }
}
