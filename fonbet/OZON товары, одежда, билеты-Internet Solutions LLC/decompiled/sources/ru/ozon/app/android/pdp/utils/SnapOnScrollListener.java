package ru.ozon.app.android.pdp.utils;

import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;
import ik0.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/utils/SnapOnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/D;", "snapHelper", "", "initialPosition", "Lkotlin/Function1;", "", "onSnapPositionChangeListener", "<init>", "(Landroidx/recyclerview/widget/D;ILkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "notifySnapPositionChange", "(Landroidx/recyclerview/widget/RecyclerView;)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Landroidx/recyclerview/widget/D;", "Lkotlin/jvm/functions/Function1;", "snapPosition", "I", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SnapOnScrollListener extends RecyclerView.t {

    @NotNull
    private Function1<? super Integer, Unit> onSnapPositionChangeListener;

    @NotNull
    private final D snapHelper;
    private int snapPosition;

    public /* synthetic */ SnapOnScrollListener(D d11, int i11, Function1 function1, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(d11, (i12 & 2) != 0 ? 0 : i11, function1);
    }

    private final void notifySnapPositionChange(RecyclerView recyclerView) {
        int intValue;
        Integer a11 = b.a(this.snapHelper, recyclerView);
        if (a11 == null || this.snapPosition == (intValue = a11.intValue())) {
            return;
        }
        this.onSnapPositionChangeListener.invoke(a11);
        this.snapPosition = intValue;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (newState == 0) {
            notifySnapPositionChange(recyclerView);
        }
    }

    public SnapOnScrollListener(@NotNull D snapHelper, int i11, @NotNull Function1<? super Integer, Unit> onSnapPositionChangeListener) {
        Intrinsics.checkNotNullParameter(snapHelper, "snapHelper");
        Intrinsics.checkNotNullParameter(onSnapPositionChangeListener, "onSnapPositionChangeListener");
        this.snapHelper = snapHelper;
        this.onSnapPositionChangeListener = onSnapPositionChangeListener;
        this.snapPosition = i11;
    }
}
