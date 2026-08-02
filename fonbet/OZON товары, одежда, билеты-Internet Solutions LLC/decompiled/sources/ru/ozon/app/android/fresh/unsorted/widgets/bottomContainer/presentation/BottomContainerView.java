package ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.presentation;

import Hj.C3143a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.placeholdersUtils.PlaceholderContainer;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.presentation.BottomContainerView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/presentation/BottomContainerView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/PlaceholderContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "customAddView", "(Landroid/view/View;)V", "customRemoveAllViews", "()V", "", "borderColorToken", "backgroundColorToken", "setupBackground", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/drawable/GradientDrawable;", "borderShape$delegate", "LSc/j;", "getBorderShape", "()Landroid/graphics/drawable/GradientDrawable;", "borderShape", "Landroid/widget/LinearLayout;", "linearLayout", "Landroid/widget/LinearLayout;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BottomContainerView extends FrameLayout implements PlaceholderContainer {

    @NotNull
    private static final float[] borderCorners;

    /* renamed from: borderShape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j borderShape;

    @NotNull
    private final LinearLayout linearLayout;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float defaultCornerRadius = UiExtKt.toPxF(24.0f);
    private static final float defaultBorderWidth = UiExtKt.toPxF(1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/presentation/BottomContainerView$Companion;", "", "<init>", "()V", "defaultCornerRadius", "", "getDefaultCornerRadius", "()F", "defaultBorderWidth", "getDefaultBorderWidth", "borderCorners", "", "getBorderCorners", "()[F", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final float[] getBorderCorners() {
            return BottomContainerView.borderCorners;
        }

        public final float getDefaultBorderWidth() {
            return BottomContainerView.defaultBorderWidth;
        }

        public final float getDefaultCornerRadius() {
            return BottomContainerView.defaultCornerRadius;
        }

        private Companion() {
        }
    }

    static {
        float[] fArr = new float[8];
        int i11 = 0;
        while (i11 < 8) {
            fArr[i11] = i11 < 4 ? defaultCornerRadius : 0.0f;
            i11++;
        }
        borderCorners = fArr;
    }

    public /* synthetic */ BottomContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final GradientDrawable getBorderShape() {
        return (GradientDrawable) this.borderShape.getValue();
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.placeholdersUtils.PlaceholderContainer
    public void customAddView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.linearLayout.addView(view);
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.placeholdersUtils.PlaceholderContainer
    public void customRemoveAllViews() {
        this.linearLayout.removeAllViews();
    }

    public final void setupBackground(String borderColorToken, String backgroundColorToken) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, backgroundColorToken, UniColors.LAYER_FLOOR_2.getResId());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor2 = styleParser.parseColor(context2, borderColorToken, UniColors.GRAPHIC_NEUTRAL.getResId());
        GradientDrawable borderShape = getBorderShape();
        borderShape.setColor(parseColor2);
        setBackground(borderShape);
        this.linearLayout.setBackgroundColor(parseColor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.borderShape = LazyUtilsKt.unsafeLazy(BottomContainerView$borderShape$2.INSTANCE);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int) defaultBorderWidth, 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClipToOutline(true);
        linearLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.presentation.BottomContainerView$linearLayout$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                BottomContainerView.Companion companion;
                BottomContainerView.Companion companion2;
                BottomContainerView.Companion companion3;
                int f7 = C3143a.f(view, "view", outline, "outline");
                float height = view.getHeight();
                companion = BottomContainerView.Companion;
                int defaultCornerRadius2 = (int) (height + companion.getDefaultCornerRadius());
                companion2 = BottomContainerView.Companion;
                float defaultCornerRadius3 = companion2.getDefaultCornerRadius();
                companion3 = BottomContainerView.Companion;
                outline.setRoundRect(0, 0, f7, defaultCornerRadius2, defaultCornerRadius3 + companion3.getDefaultBorderWidth());
            }
        });
        addView(linearLayout);
        this.linearLayout = linearLayout;
    }
}
