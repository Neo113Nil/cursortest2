package ru.ozon.uni.android.cell;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a'\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u001e\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¨\u0006\u0012"}, d2 = {"toGravity", "", "Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "initSubview", "T", "Landroid/view/View;", "parentLocatorTag", "", "viewMetadata", "Lru/ozon/uni/android/cell/SubviewMetadata;", "(Ljava/lang/String;Lru/ozon/uni/android/cell/SubviewMetadata;)Landroid/view/View;", "setSubviewLocator", "", "findChildViewUnder", "Landroid/view/ViewGroup;", "x", "", "y", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellViewKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CellView.AddonBlock.Alignment.values().length];
            try {
                iArr[CellView.AddonBlock.Alignment.ALIGNMENT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findChildViewUnder(ViewGroup viewGroup, float f7, float f11) {
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getY() && f11 <= childAt.getY() + childAt.getHeight()) {
                return childAt;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> T initSubview(String str, SubviewMetadata subviewMetadata) {
        View invoke = subviewMetadata.getInitBlock().invoke();
        Intrinsics.g(invoke, "null cannot be cast to non-null type T of ru.ozon.uni.android.cell.CellViewKt.initSubview");
        T t2 = (T) invoke;
        setSubviewLocator(t2, str, subviewMetadata);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSubviewLocator(View view, String str, SubviewMetadata subviewMetadata) {
        view.setContentDescription(str + "_" + subviewMetadata.getLocatorTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toGravity(CellView.AddonBlock.Alignment alignment) {
        return WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()] == 1 ? 48 : 16;
    }
}
