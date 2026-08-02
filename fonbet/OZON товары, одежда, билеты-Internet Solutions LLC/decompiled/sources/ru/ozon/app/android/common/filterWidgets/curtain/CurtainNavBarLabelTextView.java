package ru.ozon.app.android.common.filterWidgets.curtain;

import B90.l0;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0002 !B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ7\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/common/filterWidgets/curtain/CurtainNavBarLabelTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "setLargeTypePaddings", "()V", "setSmallTypePaddings", "switchVisibility", "", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/common/filterWidgets/curtain/CurtainNavBarLabelTextView$Type;", "type", "Lru/ozon/app/android/common/filterWidgets/curtain/CurtainNavBarLabelTextView$Type;", "getType", "()Lru/ozon/app/android/common/filterWidgets/curtain/CurtainNavBarLabelTextView$Type;", "setType", "(Lru/ozon/app/android/common/filterWidgets/curtain/CurtainNavBarLabelTextView$Type;)V", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "treeObserver", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Companion", "Type", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CurtainNavBarLabelTextView extends AppCompatTextView {

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener treeObserver;

    @NotNull
    private Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/curtain/CurtainNavBarLabelTextView$Type;", "", "<init>", "(Ljava/lang/String;I)V", "LARGE", "SMALL", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type LARGE = new Type("LARGE", 0);
        public static final Type SMALL = new Type("SMALL", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{LARGE, SMALL};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurtainNavBarLabelTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.type = Type.SMALL;
        this.treeObserver = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.common.filterWidgets.curtain.CurtainNavBarLabelTextView$treeObserver$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (CurtainNavBarLabelTextView.this.getLayout() != null) {
                    CurtainNavBarLabelTextView.this.switchVisibility();
                } else {
                    CurtainNavBarLabelTextView.this.getExtendedPaddingBottom();
                    if (CurtainNavBarLabelTextView.this.getLayout() != null) {
                        CurtainNavBarLabelTextView.this.switchVisibility();
                    } else {
                        Lm0.a.f17149a.e(new Exception());
                    }
                }
                CurtainNavBarLabelTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        };
    }

    private final void setLargeTypePaddings() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setPadding(px, getPaddingTop(), ResourceExtKt.toPx(16, context2), getPaddingBottom());
    }

    private final void setSmallTypePaddings() {
        Intrinsics.g(getParent(), "null cannot be cast to non-null type android.view.ViewGroup");
        float f7 = 2;
        float measuredWidth = ((ViewGroup) r0).getMeasuredWidth() / f7;
        float min = Math.min(measuredWidth - getLeft(), getRight() - measuredWidth);
        float measureText = getPaint().measureText(getText().toString()) / f7;
        if (min >= measureText) {
            min = measureText;
        }
        setPadding((int) ((measuredWidth - min) - getLeft()), getPaddingTop(), (int) (getRight() - (measuredWidth + min)), getPaddingBottom());
        post(new l0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSmallTypePaddings$lambda$0(CurtainNavBarLabelTextView curtainNavBarLabelTextView) {
        if (curtainNavBarLabelTextView.getLayout() == null) {
            curtainNavBarLabelTextView.getViewTreeObserver().addOnGlobalLayoutListener(curtainNavBarLabelTextView.treeObserver);
        } else {
            curtainNavBarLabelTextView.switchVisibility();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchVisibility() {
        if (getLayout().getEllipsisStart(0) != 0 || getLayout().getEllipsisCount(0) <= 0) {
            ViewExtKt.show(this);
        } else {
            ViewExtKt.gone(this);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i11 == 1) {
            setSmallTypePaddings();
        } else {
            if (i11 != 2) {
                throw new o();
            }
            setLargeTypePaddings();
        }
    }

    public final void setType(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<set-?>");
        this.type = type;
    }
}
