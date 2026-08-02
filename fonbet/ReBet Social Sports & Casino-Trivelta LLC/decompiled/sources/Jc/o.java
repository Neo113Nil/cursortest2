package Jc;

import Ic.D;
import Ic.v;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements D {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEvents.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEvents.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerEvents.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ic.D
    public v a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PointerEvents pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return v.f5697b;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return v.f5696a;
            }
        }
        int i10 = a.$EnumSwitchMapping$0[pointerEvents.ordinal()];
        if (i10 == 1) {
            return v.f5698c;
        }
        if (i10 == 2) {
            return v.f5697b;
        }
        if (i10 == 3) {
            return v.f5696a;
        }
        if (i10 == 4) {
            return v.f5699d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // Ic.D
    public boolean b(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getClipChildren()) {
            return true;
        }
        if (view instanceof ReactScrollView) {
            return !Intrinsics.areEqual(((ReactScrollView) view).getOverflow(), ViewProps.VISIBLE);
        }
        if (view instanceof ReactHorizontalScrollView) {
            return !Intrinsics.areEqual(((ReactHorizontalScrollView) view).getOverflow(), ViewProps.VISIBLE);
        }
        if (view instanceof ReactViewGroup) {
            return Intrinsics.areEqual(((ReactViewGroup) view).getOverflow(), ViewProps.HIDDEN);
        }
        return false;
    }

    @Override // Ic.D
    public View c(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent instanceof ReactViewGroup) {
            View childAt = parent.getChildAt(((ReactViewGroup) parent).getZIndexMappedChildIndex(i10));
            Intrinsics.checkNotNull(childAt);
            return childAt;
        }
        View childAt2 = parent.getChildAt(i10);
        Intrinsics.checkNotNull(childAt2);
        return childAt2;
    }
}
