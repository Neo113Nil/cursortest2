package ru.ozon.fintech.ui.common;

import Xc.a;
import Xc.b;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001(B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001e¨\u0006)"}, d2 = {"Lru/ozon/fintech/ui/common/MidDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "spacing", "leftOffset", "rightOffset", "topOffset", "bottomOffset", "Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "orientation", "<init>", "(IIIIILru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getSpacing", "getLeftOffset", "getRightOffset", "getTopOffset", "getBottomOffset", "Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "getOrientation", "()Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "halfSpacing", "ORIENTATION", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MidDecorator extends RecyclerView.n {
    private final int bottomOffset;
    private int halfSpacing;
    private final int leftOffset;

    @NotNull
    private final ORIENTATION orientation;
    private final int rightOffset;
    private final int spacing;
    private final int topOffset;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/ui/common/MidDecorator$ORIENTATION;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ORIENTATION {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ORIENTATION[] $VALUES;
        public static final ORIENTATION HORIZONTAL = new ORIENTATION("HORIZONTAL", 0);
        public static final ORIENTATION VERTICAL = new ORIENTATION("VERTICAL", 1);

        private static final /* synthetic */ ORIENTATION[] $values() {
            return new ORIENTATION[]{HORIZONTAL, VERTICAL};
        }

        static {
            ORIENTATION[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ORIENTATION(String str, int i11) {
        }

        @NotNull
        public static a<ORIENTATION> getEntries() {
            return $ENTRIES;
        }

        public static ORIENTATION valueOf(String str) {
            return (ORIENTATION) Enum.valueOf(ORIENTATION.class, str);
        }

        public static ORIENTATION[] values() {
            return (ORIENTATION[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MidDecorator(int i11, int i12, int i13, int i14, int i15, ORIENTATION orientation, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, i14, i15, (i16 & 32) != 0 ? ORIENTATION.HORIZONTAL : orientation);
    }

    public boolean equals(Object other) {
        if (other instanceof MidDecorator) {
            MidDecorator midDecorator = (MidDecorator) other;
            if (this.spacing == midDecorator.spacing && this.leftOffset == midDecorator.leftOffset && this.rightOffset == midDecorator.rightOffset && this.topOffset == midDecorator.topOffset && this.bottomOffset == midDecorator.bottomOffset && this.orientation == midDecorator.orientation) {
                return true;
            }
        }
        return false;
    }

    public final int getBottomOffset() {
        return this.bottomOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a11 = Nh.a.a(parent, "parent", state, "state", view);
        boolean z11 = parent.getChildAdapterPosition(view) == state.b() - 1;
        boolean z12 = a11 == 0;
        if (this.orientation == ORIENTATION.HORIZONTAL) {
            if (z12) {
                outRect.left = this.leftOffset;
                outRect.right = this.halfSpacing;
            } else if (z11) {
                outRect.left = this.halfSpacing;
                outRect.right = this.rightOffset;
            } else {
                int i11 = this.halfSpacing;
                outRect.right = i11;
                outRect.left = i11;
            }
            outRect.top = this.topOffset;
            outRect.bottom = this.bottomOffset;
            return;
        }
        if (z12) {
            outRect.top = this.topOffset;
            outRect.bottom = this.halfSpacing;
        } else if (z11) {
            outRect.top = this.halfSpacing;
            outRect.bottom = this.bottomOffset;
        } else {
            int i12 = this.halfSpacing;
            outRect.top = i12;
            outRect.bottom = i12;
        }
        outRect.left = this.leftOffset;
        outRect.right = this.rightOffset;
    }

    public final int getLeftOffset() {
        return this.leftOffset;
    }

    @NotNull
    public final ORIENTATION getOrientation() {
        return this.orientation;
    }

    public final int getRightOffset() {
        return this.rightOffset;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    public final int getTopOffset() {
        return this.topOffset;
    }

    public int hashCode() {
        return this.orientation.ordinal() + (((((((((((this.spacing * 31) + this.leftOffset) * 31) + this.rightOffset) * 31) + this.topOffset) * 31) + this.bottomOffset) * 31) + this.halfSpacing) * 31);
    }

    public MidDecorator(int i11, int i12, int i13, int i14, int i15, @NotNull ORIENTATION orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.spacing = i11;
        this.leftOffset = i12;
        this.rightOffset = i13;
        this.topOffset = i14;
        this.bottomOffset = i15;
        this.orientation = orientation;
        this.halfSpacing = i11 / 2;
    }
}
