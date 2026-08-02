package ru.ozon.app.android.regulardraw.ui.currencyBadge;

import Bo.ViewOnClickListenerC2667a;
import Sc.o;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.databinding.MorkovskCurrencyBadgeBinding;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0018\b\u0002\u0010\u001e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001fJ\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0002R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadge;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "bgRadius", "setBgRadius", "(F)V", "timerShape", "Landroid/graphics/drawable/ShapeDrawable;", "binding", "Lru/ozon/app/android/regulardraw/databinding/MorkovskCurrencyBadgeBinding;", "rightImageHeight", "rightImageWidth", "badgeHeight", "leftPadding", "horizontalPadding", "textStyle", "bindOrInvisible", "", "item", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindBackground", "bindIcon", "bindText", "setSizes", "size", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO$Size;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskCurrencyBadge extends ConstraintLayout {
    private int badgeHeight;
    private float bgRadius;

    @NotNull
    private final MorkovskCurrencyBadgeBinding binding;
    private int horizontalPadding;
    private int leftPadding;
    private int rightImageHeight;
    private int rightImageWidth;
    private int textStyle;

    @NotNull
    private ShapeDrawable timerShape;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int sizeRightImageHeightDefault = ResourceExtKt.toPx(40);
    private static final int sizeRightImageWidthDefault = ResourceExtKt.toPx(26);
    private static final int sizeRightImageHeightSmall = ResourceExtKt.toPx(24);
    private static final int sizeRightImageWidthSmall = ResourceExtKt.toPx(16);
    private static final int sizeBadgeHeightDefault = ResourceExtKt.toPx(28);
    private static final int sizeBadgeHeightSmall = ResourceExtKt.toPx(18);
    private static final int textMarginLeftDefault = ResourceExtKt.toPx(6);
    private static final int textMarginLeftSmall = ResourceExtKt.toPx(4);
    private static final int textHorizontalPaddingDefault = ResourceExtKt.toPx(2);
    private static final int textHorizontalPaddingSmall = ResourceExtKt.toPx(0);
    private static final float bgRadiusDefault = ResourceExtKt.toPxF(6);
    private static final float bgRadiusSmall = ResourceExtKt.toPxF(4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadge$Companion;", "", "<init>", "()V", "", "CORNERS_COUNT", "I", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MorkovskCurrencyBadgeVO.Size.values().length];
            try {
                iArr[MorkovskCurrencyBadgeVO.Size.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MorkovskCurrencyBadgeVO.Size.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MorkovskCurrencyBadge(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindBackground(MorkovskCurrencyBadgeVO item) {
        View view = this.binding.background;
        Paint paint = this.timerShape.getPaint();
        String bgColor = item.getBgColor();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(UtilKt.parseColor(bgColor, context));
        view.setBackground(this.timerShape);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.badgeHeight;
        view.setLayoutParams(layoutParams);
    }

    private final void bindIcon(MorkovskCurrencyBadgeVO item) {
        AppCompatImageView appCompatImageView = this.binding.rightIcon;
        Intrinsics.f(appCompatImageView);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.rightImageHeight;
        layoutParams.width = this.rightImageWidth;
        appCompatImageView.setLayoutParams(layoutParams);
        ImageViewExtKt.load$default(appCompatImageView, item.getImage(), null, null, null, new ImageSize(this.rightImageWidth, this.rightImageHeight), false, null, 110, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindOrInvisible$default(MorkovskCurrencyBadge morkovskCurrencyBadge, MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        morkovskCurrencyBadge.bindOrInvisible(morkovskCurrencyBadgeVO, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrInvisible$lambda$0(Function1 function1, MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO, View view) {
        function1.invoke(morkovskCurrencyBadgeVO.getAtomAction());
    }

    private final void bindText(MorkovskCurrencyBadgeVO item) {
        AppCompatTextView appCompatTextView = this.binding.currency;
        Intrinsics.f(appCompatTextView);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context, this.textStyle);
        int i11 = this.leftPadding;
        int i12 = this.horizontalPadding;
        appCompatTextView.setPadding(i11, i12, 0, i12);
        appCompatTextView.setText(item.getValue());
        String textColor = item.getTextColor();
        Context context2 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView.setTextColor(UtilKt.parseColor(textColor, context2));
    }

    private final void setBgRadius(float f7) {
        this.bgRadius = f7;
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = f7;
        }
        this.timerShape = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        invalidate();
    }

    private final void setSizes(MorkovskCurrencyBadgeVO.Size size) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        if (i11 == 1) {
            this.rightImageWidth = sizeRightImageWidthDefault;
            this.rightImageHeight = sizeRightImageHeightDefault;
            this.badgeHeight = sizeBadgeHeightDefault;
            this.leftPadding = textMarginLeftDefault;
            this.horizontalPadding = textHorizontalPaddingDefault;
            this.textStyle = R$style.Text_Body_Large;
            setBgRadius(bgRadiusDefault);
            return;
        }
        if (i11 != 2) {
            throw new o();
        }
        this.rightImageWidth = sizeRightImageWidthSmall;
        this.rightImageHeight = sizeRightImageHeightSmall;
        this.badgeHeight = sizeBadgeHeightSmall;
        this.leftPadding = textMarginLeftSmall;
        this.horizontalPadding = textHorizontalPaddingSmall;
        this.textStyle = R$style.Text_Body_Small;
        setBgRadius(bgRadiusSmall);
    }

    public final void bindOrInvisible(MorkovskCurrencyBadgeVO item, Function1<? super AtomAction, Unit> onAction) {
        setVisibility(item == null ? 4 : 0);
        if (item == null) {
            return;
        }
        setClickable(onAction != null);
        setFocusable(onAction != null);
        setSizes(item.getSize());
        bindText(item);
        bindIcon(item);
        bindBackground(item);
        if (onAction == null || item.getAtomAction() == null) {
            return;
        }
        setOnClickListener(new ViewOnClickListenerC2667a(onAction, item));
    }

    public /* synthetic */ MorkovskCurrencyBadge(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MorkovskCurrencyBadge(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgRadius = bgRadiusDefault;
        float[] fArr = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr[i13] = bgRadiusDefault;
        }
        this.timerShape = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        MorkovskCurrencyBadgeBinding inflate = MorkovskCurrencyBadgeBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        this.textStyle = R$style.Text_Body_Large;
    }
}
