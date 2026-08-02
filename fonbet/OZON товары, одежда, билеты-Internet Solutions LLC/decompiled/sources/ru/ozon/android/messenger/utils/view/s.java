package ru.ozon.android.messenger.utils.view;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class s {
    public static final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void b(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Y.F(view, ColorStateList.valueOf(i11));
    }

    public static void c(View view, Function1 onClick) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        view.setOnClickListener(new r(onClick));
    }

    public static final void d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public static final void e(@NotNull View view, Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(Intrinsics.d(bool, Boolean.TRUE) ? 0 : 8);
    }

    public static final void f(@NotNull View view, @NotNull Function1<? super ViewGroup.MarginLayoutParams, Unit> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        block.invoke(marginLayoutParams);
        view.setLayoutParams(marginLayoutParams);
    }

    public static void g(View view, int i11, int i12, int i13, int i14, int i15) {
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
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i11, i12, i13, i14);
    }

    public static final void h(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i11;
        view.setLayoutParams(layoutParams);
    }
}
