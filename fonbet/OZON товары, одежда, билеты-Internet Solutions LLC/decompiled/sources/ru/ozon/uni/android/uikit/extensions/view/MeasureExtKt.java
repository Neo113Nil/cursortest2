package ru.ozon.uni.android.uikit.extensions.view;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u001a\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"measure", "", "Landroid/view/View;", "width", "", "widthMode", "height", "heightMode", "measureUnspecified", "measureExactly", "measureAtMost", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MeasureExtKt {
    public static final void measure(@NotNull View view, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, i12), View.MeasureSpec.makeMeasureSpec(i13, i14));
    }

    public static final void measureAtMost(@NotNull View view, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        measure(view, i11, LinearLayoutManager.INVALID_OFFSET, i12, LinearLayoutManager.INVALID_OFFSET);
    }

    public static final void measureExactly(@NotNull View view, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        measure(view, i11, 1073741824, i12, 1073741824);
    }

    public static final void measureUnspecified(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        measure(view, 0, 0, 0, 0);
    }
}
