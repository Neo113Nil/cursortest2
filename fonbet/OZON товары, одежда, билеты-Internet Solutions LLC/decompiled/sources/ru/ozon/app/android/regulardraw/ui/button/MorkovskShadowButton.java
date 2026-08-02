package ru.ozon.app.android.regulardraw.ui.button;

import BE.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.databinding.AtomShadowButtonBinding;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadge;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVOKt;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001FB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J;\u0010\u001a\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\u0011J+\u0010'\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\f0$¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010D\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010AR\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010A¨\u0006G"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButton;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "bindText", "(Ljava/lang/String;)V", "Landroid/graphics/Canvas;", "drawDarkShadow", "(Landroid/graphics/Canvas;)V", "drawLightShadow", "drawMainColorRect", "", "left", "top", "right", "bottom", "rectColor", "drawRoundedRectShadowWithClipPath", "(Landroid/graphics/Canvas;FFFFI)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "canvas", "dispatchDraw", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO$Theme;", "theme", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO$Theme;)V", "Lru/ozon/app/android/regulardraw/databinding/AtomShadowButtonBinding;", "binding", "Lru/ozon/app/android/regulardraw/databinding/AtomShadowButtonBinding;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "Landroid/graphics/BlurMaskFilter;", "blurMaskFilter$delegate", "LSc/j;", "getBlurMaskFilter", "()Landroid/graphics/BlurMaskFilter;", "blurMaskFilter", "Landroid/graphics/Path;", "roundedRectClipPath$delegate", "getRoundedRectClipPath", "()Landroid/graphics/Path;", "roundedRectClipPath", "buttonColor", "I", "lightShadowColor", "darkShadowColor1", "darkShadowColor2", "textColor", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskShadowButton extends LinearLayout {

    @NotNull
    private final AtomShadowButtonBinding binding;

    /* renamed from: blurMaskFilter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j blurMaskFilter;
    private int buttonColor;
    private int darkShadowColor1;
    private int darkShadowColor2;
    private int lightShadowColor;

    @NotNull
    private final Paint paint;

    @NotNull
    private final RectF rectF;

    /* renamed from: roundedRectClipPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j roundedRectClipPath;
    private int textColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float cornerRadius = ResourceExtKt.toPxF(16);
    private static final float shadowBlurRadius = ResourceExtKt.toPxF(8);
    private static final int shadowOffset = ResourceExtKt.toPx(4);
    private static final int viewHeight = ResourceExtKt.toPx(60);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButton$Companion;", "", "<init>", "()V", "", "cornerRadius", "F", "getCornerRadius", "()F", "shadowBlurRadius", "getShadowBlurRadius", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCornerRadius() {
            return MorkovskShadowButton.cornerRadius;
        }

        public final float getShadowBlurRadius() {
            return MorkovskShadowButton.shadowBlurRadius;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MorkovskShadowButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(Function1 function1, MorkovskShadowButtonDTO morkovskShadowButtonDTO, View view) {
        AtomActionDTO action = morkovskShadowButtonDTO.getAction();
        function1.invoke(action != null ? AtomActionMapperKt.toAtomAction(action, morkovskShadowButtonDTO.getTrackingInfo()) : null);
    }

    private final void bindText(String title) {
        AppCompatTextView appCompatTextView = this.binding.buttonText;
        appCompatTextView.setText(title);
        appCompatTextView.setTextColor(this.textColor);
    }

    private final void drawDarkShadow(Canvas canvas) {
        RectF rectF = this.rectF;
        drawRoundedRectShadowWithClipPath(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.darkShadowColor2);
        RectF rectF2 = this.rectF;
        float f7 = rectF2.left;
        int i11 = shadowOffset;
        drawRoundedRectShadowWithClipPath(canvas, f7 + i11, rectF2.top + i11, rectF2.right - i11, rectF2.bottom - i11, this.darkShadowColor1);
    }

    private final void drawLightShadow(Canvas canvas) {
        RectF rectF = this.rectF;
        float f7 = rectF.left;
        int i11 = shadowOffset;
        drawRoundedRectShadowWithClipPath(canvas, f7 - i11, rectF.top - i11, rectF.right - (i11 * 2), rectF.bottom - (i11 * 2), this.lightShadowColor);
    }

    private final void drawMainColorRect(Canvas canvas) {
        RectF rectF = this.rectF;
        float f7 = rectF.left;
        int i11 = shadowOffset;
        drawRoundedRectShadowWithClipPath(canvas, f7 + i11, rectF.top + i11, rectF.right - i11, rectF.bottom - i11, this.buttonColor);
    }

    private final void drawRoundedRectShadowWithClipPath(Canvas canvas, float f7, float f11, float f12, float f13, int i11) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        canvas.clipPath(getRoundedRectClipPath());
        this.paint.setColor(i11);
        this.paint.setMaskFilter(getBlurMaskFilter());
        float f14 = cornerRadius;
        canvas.drawRoundRect(f7, f11, f12, f13, f14, f14, this.paint);
        canvas.restoreToCount(saveLayer);
    }

    private final BlurMaskFilter getBlurMaskFilter() {
        return (BlurMaskFilter) this.blurMaskFilter.getValue();
    }

    private final Path getRoundedRectClipPath() {
        return (Path) this.roundedRectClipPath.getValue();
    }

    public final void bind(@NotNull MorkovskShadowButtonDTO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        theme(item.getTheme());
        bindText(item.getTitle());
        MorkovskCurrencyBadge morkovskCurrencyBadge = this.binding.badge;
        MorkovskCurrencyBadgeDTO balance = item.getBalance();
        MorkovskCurrencyBadge.bindOrInvisible$default(morkovskCurrencyBadge, balance != null ? MorkovskCurrencyBadgeVOKt.map(balance, MorkovskCurrencyBadgeVO.Size.DEFAULT) : null, null, 2, null);
        setOnClickListener(new a(1, onAction, item));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        drawDarkShadow(canvas);
        drawLightShadow(canvas);
        drawMainColorRect(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(viewHeight, 1073741824));
    }

    public final void theme(@NotNull MorkovskShadowButtonDTO.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (theme == MorkovskShadowButtonDTO.Theme.THEME_SECONDARY) {
            int i11 = R$color.shadow_button_secondary;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.buttonColor = UtilKt.parseColor(i11, context);
            int i12 = R$color.shadow_button_light_secondary;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.lightShadowColor = UtilKt.parseColor(i12, context2);
            int i13 = R$color.shadow_button_shadow_color_1_secondary;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            this.darkShadowColor1 = UtilKt.parseColor(i13, context3);
            int i14 = R$color.shadow_button_shadow_color_2_secondary;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            this.darkShadowColor2 = UtilKt.parseColor(i14, context4);
            int i15 = R$color.shadow_button_text_color_secondary;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            this.textColor = UtilKt.parseColor(i15, context5);
        } else {
            int i16 = R$color.shadow_button_primary;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            this.buttonColor = UtilKt.parseColor(i16, context6);
            int i17 = R$color.shadow_button_light_primary;
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            this.lightShadowColor = UtilKt.parseColor(i17, context7);
            int i18 = R$color.shadow_button_shadow_color_1_primary;
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
            this.darkShadowColor1 = UtilKt.parseColor(i18, context8);
            int i19 = R$color.shadow_button_shadow_color_2_primary;
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
            this.darkShadowColor2 = UtilKt.parseColor(i19, context9);
            int i21 = R$color.shadow_button_text_color_primary;
            Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
            this.textColor = UtilKt.parseColor(i21, context10);
        }
        invalidate();
    }

    public /* synthetic */ MorkovskShadowButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorkovskShadowButton(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AtomShadowButtonBinding inflate = AtomShadowButtonBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        this.rectF = new RectF();
        this.blurMaskFilter = k.b(MorkovskShadowButton$blurMaskFilter$2.INSTANCE);
        this.roundedRectClipPath = k.b(new MorkovskShadowButton$roundedRectClipPath$2(this));
        this.buttonColor = UtilKt.parseColor(R$color.shadow_button_primary, context);
        this.lightShadowColor = UtilKt.parseColor(R$color.shadow_button_light_primary, context);
        this.darkShadowColor1 = UtilKt.parseColor(R$color.shadow_button_shadow_color_1_primary, context);
        this.darkShadowColor2 = UtilKt.parseColor(R$color.shadow_button_shadow_color_2_primary, context);
        this.textColor = UtilKt.parseColor(R$color.shadow_button_text_color_primary, context);
        setLayerType(1, null);
        setWillNotDraw(false);
        setGravity(17);
        setOrientation(0);
    }
}
