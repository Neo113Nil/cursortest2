package ru.ozon.uni.android.uikit.extensions;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a+\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0007\u001a+\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a+\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a+\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\u0007\u001a+\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u0007\u001a+\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0007\u001a\u0019\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "startId", "endId", "margin", "", "topToTop", "(Landroidx/constraintlayout/widget/d;III)V", "topToBottom", "startToStart", "startToEnd", "endToStart", "endToEnd", "bottomToTop", "bottomToBottom", "baselineToBaseline", "id", "clearTop", "(Landroidx/constraintlayout/widget/d;I)V", "clearBottom", "clearHorizontals", "clearStart", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConstraintSetExtKt {
    public static final void baselineToBaseline(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 5, i12, 5, i13);
    }

    public static /* synthetic */ void baselineToBaseline$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        baselineToBaseline(dVar, i11, i12, i13);
    }

    public static final void bottomToBottom(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 4, i12, 4, i13);
    }

    public static /* synthetic */ void bottomToBottom$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        bottomToBottom(dVar, i11, i12, i13);
    }

    public static final void bottomToTop(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 4, i12, 3, i13);
    }

    public static /* synthetic */ void bottomToTop$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        bottomToTop(dVar, i11, i12, i13);
    }

    public static final void clearBottom(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.o(i11, 4);
    }

    public static final void clearHorizontals(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.o(i11, 6);
        dVar.o(i11, 7);
    }

    public static final void clearStart(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.o(i11, 6);
    }

    public static final void clearTop(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.o(i11, 3);
    }

    public static final void endToEnd(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 7, i12, 7, i13);
    }

    public static /* synthetic */ void endToEnd$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        endToEnd(dVar, i11, i12, i13);
    }

    public static final void endToStart(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 7, i12, 6, i13);
    }

    public static /* synthetic */ void endToStart$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        endToStart(dVar, i11, i12, i13);
    }

    public static final void startToEnd(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 6, i12, 7, i13);
    }

    public static /* synthetic */ void startToEnd$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        startToEnd(dVar, i11, i12, i13);
    }

    public static final void startToStart(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 6, i12, 6, i13);
    }

    public static /* synthetic */ void startToStart$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        startToStart(dVar, i11, i12, i13);
    }

    public static final void topToBottom(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 3, i12, 4, i13);
    }

    public static /* synthetic */ void topToBottom$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        topToBottom(dVar, i11, i12, i13);
    }

    public static final void topToTop(@NotNull d dVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.t(i11, 3, i12, 3, i13);
    }

    public static /* synthetic */ void topToTop$default(d dVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        topToTop(dVar, i11, i12, i13);
    }
}
