package ru.ozon.app.android.travel.utils.utils;

import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;
import ik0.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/utils/utils/OnSnapPositionChangeListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/D;", "snapHelper", "", "initialPosition", "Lkotlin/Function1;", "", "onSnapPositionChange", "<init>", "(Landroidx/recyclerview/widget/D;ILkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "findSnapPosition", "(Landroidx/recyclerview/widget/RecyclerView;)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "resetPosition", "()V", "Landroidx/recyclerview/widget/D;", "I", "Lkotlin/jvm/functions/Function1;", "snapPosition", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnSnapPositionChangeListener extends RecyclerView.t {
    private final int initialPosition;

    @NotNull
    private final Function1<Integer, Unit> onSnapPositionChange;

    @NotNull
    private final D snapHelper;
    private int snapPosition;

    public /* synthetic */ OnSnapPositionChangeListener(D d11, int i11, Function1 function1, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(d11, (i12 & 2) != 0 ? -1 : i11, function1);
    }

    private final void findSnapPosition(RecyclerView recyclerView) {
        int intValue;
        Integer a11 = b.a(this.snapHelper, recyclerView);
        if (a11 == null || this.snapPosition == (intValue = a11.intValue())) {
            return;
        }
        this.onSnapPositionChange.invoke(a11);
        this.snapPosition = intValue;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        findSnapPosition(recyclerView);
    }

    public final void resetPosition() {
        this.snapPosition = this.initialPosition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSnapPositionChangeListener(@NotNull D snapHelper, int i11, @NotNull Function1<? super Integer, Unit> onSnapPositionChange) {
        Intrinsics.checkNotNullParameter(snapHelper, "snapHelper");
        Intrinsics.checkNotNullParameter(onSnapPositionChange, "onSnapPositionChange");
        this.snapHelper = snapHelper;
        this.initialPosition = i11;
        this.onSnapPositionChange = onSnapPositionChange;
        this.snapPosition = i11;
    }
}
