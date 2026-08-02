package ru.ozon.app.android.common.taglist.common;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/common/taglist/common/TagListDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "rightOffset", "limitItemOffset", "<init>", "(II)V", "Landroid/graphics/Rect;", "outRect", "itemPosition", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "getItemOffsets", "(Landroid/graphics/Rect;ILandroidx/recyclerview/widget/RecyclerView;)V", "I", "getRightOffset$taglist_prodGoogleAllVendorsRelease", "()I", "setRightOffset$taglist_prodGoogleAllVendorsRelease", "(I)V", "getLimitItemOffset$taglist_prodGoogleAllVendorsRelease", "setLimitItemOffset$taglist_prodGoogleAllVendorsRelease", "Companion", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagListDecorator extends RecyclerView.n {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int TAG_GAP = ResourceExtKt.toPx(8);
    private int limitItemOffset;
    private int rightOffset;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/taglist/common/TagListDecorator$Companion;", "", "<init>", "()V", "TAG_GAP", "", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TagListDecorator(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? TAG_GAP : i11, (i13 & 2) != 0 ? ResourceExtKt.toPx(16) : i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, int itemPosition, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        super.getItemOffsets(outRect, itemPosition, parent);
        RecyclerView.g adapter = parent.getAdapter();
        int cardsCount = (adapter != null ? adapter.getCardsCount() : -1) - 1;
        if (itemPosition == 0) {
            outRect.left = this.limitItemOffset;
            outRect.right = TAG_GAP;
        } else if (cardsCount == -1 || cardsCount != itemPosition) {
            outRect.right = TAG_GAP;
        } else {
            outRect.right = this.rightOffset;
        }
    }

    public final void setLimitItemOffset$taglist_prodGoogleAllVendorsRelease(int i11) {
        this.limitItemOffset = i11;
    }

    public final void setRightOffset$taglist_prodGoogleAllVendorsRelease(int i11) {
        this.rightOffset = i11;
    }

    public TagListDecorator(int i11, int i12) {
        this.rightOffset = i11;
        this.limitItemOffset = i12;
    }
}
