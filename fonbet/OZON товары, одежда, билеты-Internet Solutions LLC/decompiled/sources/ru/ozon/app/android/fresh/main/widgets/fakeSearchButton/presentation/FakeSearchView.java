package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation;

import GD.a;
import GD.b;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "color", "", "bindTintColor", "(Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;", "fakeSearchVO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchVO;Lkotlin/jvm/functions/Function1;)V", "", "isSticky", "setLocatorToText", "(Z)V", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Landroid/graphics/drawable/GradientDrawable;", "drawableBackground$delegate", "LSc/j;", "getDrawableBackground", "()Landroid/graphics/drawable/GradientDrawable;", "drawableBackground", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeSearchView extends LinearLayout {

    @NotNull
    private static final float[] cornerRadiiDefault;

    /* renamed from: drawableBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j drawableBackground;

    @NotNull
    private final IconButtonV3View iconButtonView;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View textAtomView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int iconSize = ResourceExtKt.toPx(20);
    private static final float mainRadius = ResourceExtKt.toPxF(16);
    private static final int paddingVertical = ResourceExtKt.toPx(14);
    private static final int paddingHorizontal = ResourceExtKt.toPx(8);
    private static final int paddingVerticalAI = ResourceExtKt.toPx(8);
    private static final int paddingHorizontalAI = ResourceExtKt.toPx(12);
    private static final int defaultHintColor = UniColors.BG_PRIMARY.getResId();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchView$Companion;", "", "<init>", "()V", "", "defaultHintColor", "I", "getDefaultHintColor", "()I", "", "cornerRadiiDefault", "[F", "getCornerRadiiDefault", "()[F", "", "NON_STICKY_INPUT", "Ljava/lang/String;", "STICKY_INPUT", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final float[] getCornerRadiiDefault() {
            return FakeSearchView.cornerRadiiDefault;
        }

        public final int getDefaultHintColor() {
            return FakeSearchView.defaultHintColor;
        }

        private Companion() {
        }
    }

    static {
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = mainRadius;
        }
        cornerRadiiDefault = fArr;
    }

    public /* synthetic */ FakeSearchView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$10$lambda$7(Function1 function1, FakeSearchVO fakeSearchVO, View view) {
        function1.invoke(fakeSearchVO.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$10$lambda$8(Function1 function1, FakeSearchVO fakeSearchVO, View view) {
        function1.invoke(fakeSearchVO.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$10$lambda$9(Function1 function1, FakeSearchVO fakeSearchVO, View view) {
        function1.invoke(fakeSearchVO.getAction());
    }

    private final void bindTintColor(String color) {
        GradientDrawable drawableBackground = getDrawableBackground();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i11 = defaultHintColor;
        int parseColor = styleParser.parseColor(context, color, i11);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        drawableBackground.setColors(new int[]{parseColor, styleParser.parseColor(context2, color, i11)});
    }

    private final GradientDrawable getDrawableBackground() {
        return (GradientDrawable) this.drawableBackground.getValue();
    }

    public final void bind(@NotNull FakeSearchVO fakeSearchVO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        LinearLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(fakeSearchVO, "fakeSearchVO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bindOrGone$default(this.textAtomView, fakeSearchVO.getTitle(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.iconView, fakeSearchVO.getIcon(), null, 2, null);
        bindTintColor(fakeSearchVO.getTintColor());
        if (fakeSearchVO.getRightIconButton() != null) {
            int i11 = paddingHorizontalAI;
            int i12 = paddingVerticalAI;
            setPadding(i11, i12, i11, i12);
            TextAtomV2View textAtomV2View = this.textAtomView;
            ViewGroup.LayoutParams layoutParams2 = textAtomV2View.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            textAtomV2View.setLayoutParams(layoutParams2);
            IconButtonV3HolderKt.bindOrGone(this.iconButtonView, fakeSearchVO.getRightIconButton(), actionHandler);
        } else {
            int i13 = paddingHorizontal;
            int i14 = paddingVertical;
            setPadding(i13, i14, i13, i14);
            TextAtomV2View textAtomV2View2 = this.textAtomView;
            ViewGroup.LayoutParams layoutParams3 = textAtomV2View2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            textAtomV2View2.setLayoutParams(layoutParams3);
            ViewExtKt.gone(this.iconButtonView);
        }
        setOnClickListener(new a(fakeSearchVO, actionHandler));
        this.textAtomView.setOnClickListener(new b(fakeSearchVO, actionHandler));
        this.iconView.setOnClickListener(new Hv.a(3, actionHandler, fakeSearchVO));
    }

    public final void setLocatorToText(boolean isSticky) {
        this.textAtomView.setContentDescription(isSticky ? "fakeSearchStickyInput" : "fakeSearchNonStickyInput");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FakeSearchView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = 0;
        IconView iconView = new IconView(context, null, i12, 6, null);
        iconView.setId(View.generateViewId());
        int i13 = iconSize;
        iconView.setLayoutParams(new LinearLayout.LayoutParams(i13, i13));
        addView(iconView);
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        addView(textAtomV2View);
        this.textAtomView = textAtomV2View;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, i12, 0, 14, null);
        iconButtonV3View.setId(View.generateViewId());
        iconButtonV3View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(iconButtonV3View);
        this.iconButtonView = iconButtonV3View;
        this.drawableBackground = k.b(new FakeSearchView$drawableBackground$2(context));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        setOrientation(0);
        setBackground(getDrawableBackground());
    }
}
