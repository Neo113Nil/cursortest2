package ru.ozon.uni.android.atom.text;

import Sc.InterfaceC3999a;
import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.DrawableResExtKt;
import ru.ozon.uni.android.uikitsdk.ext.SpannableStringBuilderExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.util.ContextsKt;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.R$font;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001ZB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u00192\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J(\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\tH\u0016J\u0018\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH\u0016J\u0012\u00107\u001a\u00020+2\b\u00108\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\tH\u0014J(\u0010\u001b\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0007J\u0018\u0010\u001b\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0010\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020\u001dH\u0002J\u0010\u0010@\u001a\u00020+2\u0006\u0010?\u001a\u00020\u001dH\u0002J\u0014\u0010A\u001a\u00020B*\u00020C2\u0006\u0010D\u001a\u00020EH\u0002J\u0018\u0010F\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010G\u001a\u00020\tH\u0002J\u0010\u0010H\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0019H\u0002J\u0099\u0001\u0010I\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010J\u001a\u00020\t2\n\b\u0001\u0010K\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010N\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010O\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020)2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010,\u001a\u00020T2\b\b\u0003\u0010<\u001a\u00020\t2\b\b\u0003\u0010=\u001a\u00020\tH\u0000¢\u0006\u0004\bU\u0010VJ\u001a\u0010W\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010J\u001a\u00020\tH\u0003J\u0018\u0010X\u001a\u00020+2\u0006\u00101\u001a\u00020\t2\u0006\u00103\u001a\u00020\tH\u0002J\u0010\u0010Y\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u0019@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\f\u001a\u0004\u0018\u00010\u001d@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018*\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "locatorTag", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "topPaddingInternal", "bottomPaddingInternal", "topLineHeightPadding", "bottomLineHeightPadding", "truncateAt", "Landroid/text/TextUtils$TruncateAt;", "", "unellipsizedText", "setUnellipsizedText", "(Ljava/lang/CharSequence;)V", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "textGradient", "getTextGradient", "()Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "setTextGradient", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;)V", "styledAttrs", "", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTruncateAt", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)Landroid/text/TextUtils$TruncateAt;", "isTextSetInternal", "", "setText", "", "text", "type", "Landroid/widget/TextView$BufferType;", "setPadding", "left", "top", "right", "bottom", "scrollTo", "x", "y", "setEllipsize", "where", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "leftPadding", "rightPadding", "applyGradient", "gradient", "applyGradientInternal", "getCoordinates", "", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "textWidth", "", "updateOnEllipsedText", "maximumWidth", "setTextInternal", "applyData", "style", "textColor", "Lru/ozon/uni/core/UniGradient;", "numberOfLines", "iconRes", "iconTintColor", "iconPosition", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "isAllCaps", "truncatingMode", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "applyData$uni_release", "(Landroid/content/Context;ILjava/lang/Integer;Lru/ozon/uni/core/UniGradient;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$IconPosition;ZLru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;Lru/ozon/uni/atoms/utils/OzonSpannableString;II)V", "applyStyleWithFontVerticalPaddingCompensation", "setLineHeightPaddings", "getMaxLinesAttrOrDefaultValue", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class TextAtomV2View extends AppCompatTextView implements AtomView, AtomLocatableView {
    private int bottomLineHeightPadding;
    private int bottomPaddingInternal;
    private boolean isTextSetInternal;

    @NotNull
    private String locatorTag;

    @NotNull
    private final int[] styledAttrs;
    private Color.Gradient textGradient;
    private int topLineHeightPadding;
    private int topPaddingInternal;

    @NotNull
    private TextUtils.TruncateAt truncateAt;

    @NotNull
    private CharSequence unellipsizedText;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/atom/text/TextAtomV2View$Companion;", "", "<init>", "()V", "MAX_LINES_WRAP_CONTENT", "", "MAX_LINES_SINGLE_LINE", "TEXT_LOCATOR_TAG", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CommonAtomLabelDTO.TruncatingMode.values().length];
            try {
                iArr[CommonAtomLabelDTO.TruncatingMode.TAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonAtomLabelDTO.TruncatingMode.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GradientDrawable.Orientation.values().length];
            try {
                iArr2[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GradientDrawable.Orientation.TL_BR.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[GradientDrawable.Orientation.TR_BL.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[GradientDrawable.Orientation.BL_TR.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GradientDrawable.Orientation.BR_TL.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TextUtils.TruncateAt.values().length];
            try {
                iArr3[TextUtils.TruncateAt.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[TextUtils.TruncateAt.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[TextUtils.TruncateAt.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtomV2View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyGradient(final Color.Gradient gradient) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: ru.ozon.uni.android.atom.text.TextAtomV2View$applyGradient$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    TextAtomV2View.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (TextAtomV2View.this.getWidth() <= 0 || TextAtomV2View.this.getHeight() <= 0) {
                        return true;
                    }
                    TextAtomV2View.this.applyGradientInternal(gradient);
                    return true;
                }
            });
        } else {
            applyGradientInternal(gradient);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGradientInternal(Color.Gradient gradient) {
        float[] coordinates = getCoordinates(gradient.getOrientation(), getWidth());
        getPaint().setShader(new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], gradient.getColors(), gradient.getPositions(), Shader.TileMode.CLAMP));
    }

    @SuppressLint({"ResourceType"})
    private final void applyStyleWithFontVerticalPaddingCompensation(Context context, int style) {
        int i11;
        int i12;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(style, this.styledAttrs);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(C7705l.L(this.styledAttrs, R.attr.fontFamily), R$font.onest_regular);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7705l.L(this.styledAttrs, R.attr.lineHeight), -1);
        obtainStyledAttributes.recycle();
        setTextAppearance(style);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(style, R$styleable.OzonTextAppearance);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes2.hasValue(R$styleable.OzonTextAppearance_letterSpacingInDP)) {
            setLetterSpacing(TextViewExtKt.calculateLetterSpacing(this, obtainStyledAttributes2.getFloat(R$styleable.OzonTextAppearance_letterSpacingInDP, 0.0f)));
        }
        obtainStyledAttributes2.recycle();
        setTypeface(g.e(resourceId, context));
        if (dimensionPixelSize != -1) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize != fontMetricsInt) {
                int i13 = dimensionPixelSize - fontMetricsInt;
                setLineSpacing(i13, 1.0f);
                i11 = i13 / 2;
                i12 = i13 - i11;
            } else {
                i11 = 0;
                i12 = 0;
            }
            setLineHeightPaddings(i12, i11);
        }
    }

    private final float[] getCoordinates(GradientDrawable.Orientation orientation, float f7) {
        switch (WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()]) {
            case 1:
                return new float[]{0.0f, 0.0f, 0.0f, f7};
            case 2:
                return new float[]{0.0f, f7, 0.0f, 0.0f};
            case 3:
                return new float[]{0.0f, 0.0f, f7, 0.0f};
            case 4:
                return new float[]{f7, 0.0f, 0.0f, 0.0f};
            case 5:
                return new float[]{0.0f, 0.0f, f7, f7};
            case 6:
                return new float[]{f7, 0.0f, 0.0f, f7};
            case 7:
                return new float[]{0.0f, f7, f7, 0.0f};
            case 8:
                return new float[]{f7, f7, 0.0f, 0.0f};
            default:
                throw new o();
        }
    }

    private final int getMaxLinesAttrOrDefaultValue(Context context) {
        int[] iArr = {android.R.attr.maxLines};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int i11 = obtainStyledAttributes.getInt(C7705l.L(iArr, android.R.attr.maxLines), 1);
        obtainStyledAttributes.recycle();
        return i11;
    }

    private final TextUtils.TruncateAt getTruncateAt(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        int i11 = truncatingMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[truncatingMode.ordinal()];
        return i11 != 1 ? i11 != 2 ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.END;
    }

    private final void setLineHeightPaddings(int top, int bottom) {
        this.topLineHeightPadding = top;
        this.bottomLineHeightPadding = bottom;
        super.setPadding(getPaddingLeft(), this.topPaddingInternal + this.topLineHeightPadding, getPaddingRight(), this.bottomPaddingInternal + this.bottomLineHeightPadding);
    }

    private final void setTextInternal(CharSequence text) {
        this.isTextSetInternal = true;
        try {
            setText(text);
        } finally {
            this.isTextSetInternal = false;
        }
    }

    private final void setUnellipsizedText(CharSequence charSequence) {
        this.unellipsizedText = charSequence;
        setTextInternal(charSequence);
    }

    public static /* synthetic */ void setUnellipsizedText$default(TextAtomV2View textAtomV2View, CharSequence charSequence, TextUtils.TruncateAt truncateAt, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUnellipsizedText");
        }
        if ((i11 & 2) != 0) {
            truncateAt = TextUtils.TruncateAt.END;
        }
        textAtomV2View.setUnellipsizedText(charSequence, truncateAt);
    }

    private final void updateOnEllipsedText(CharSequence text, int maximumWidth) {
        if (getMaxLines() <= 1) {
            CharSequence ellipsize = TextUtils.ellipsize(text, getPaint(), maximumWidth, this.truncateAt);
            Intrinsics.checkNotNullExpressionValue(ellipsize, "ellipsize(...)");
            setTextInternal(ellipsize);
            return;
        }
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), getPaint(), maximumWidth).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (build.getLineCount() > getMaxLines()) {
            int i11 = WhenMappings.$EnumSwitchMapping$2[this.truncateAt.ordinal()];
            if (i11 == 1 || i11 == 2) {
                int lineStart = build.getLineStart(getMaxLines() - 1);
                CharSequence concat = TextUtils.concat(text.subSequence(0, lineStart), TextUtils.ellipsize(text.subSequence(lineStart, text.length()), getPaint(), maximumWidth, this.truncateAt));
                Intrinsics.checkNotNullExpressionValue(concat, "concat(...)");
                setTextInternal(concat);
                return;
            }
            if (i11 != 3) {
                return;
            }
            int lineStart2 = build.getLineStart((build.getLineCount() + 1) - getMaxLines());
            CharSequence concat2 = TextUtils.concat(TextUtils.ellipsize(text.subSequence(0, lineStart2), getPaint(), maximumWidth, this.truncateAt), System.lineSeparator(), text.subSequence(lineStart2, text.length()));
            Intrinsics.checkNotNullExpressionValue(concat2, "concat(...)");
            setTextInternal(concat2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, ru.ozon.uni.atoms.utils.OzonSpannableString] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.TextView, ru.ozon.uni.android.atom.text.TextAtomV2View] */
    public final void applyData$uni_release(@NotNull Context context, int style, Integer textColor, UniGradient textGradient, Integer numberOfLines, Integer iconRes, Integer iconTintColor, @NotNull CommonAtomLabelDTO.IconPosition iconPosition, boolean isAllCaps, CommonAtomLabelDTO.TruncatingMode truncatingMode, @NotNull OzonSpannableString text, int leftPadding, int rightPadding) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        Intrinsics.checkNotNullParameter(text, "text");
        applyStyleWithFontVerticalPaddingCompensation(context, style);
        if (textGradient != null) {
            setTextGradient(TokensExtKt.toGradient(textGradient, context));
        } else if (textColor != null) {
            setTextColor(textColor.intValue());
        }
        int intValue = numberOfLines != null ? numberOfLines.intValue() : getMaxLinesAttrOrDefaultValue(context);
        if (intValue == 0) {
            intValue = Integer.MAX_VALUE;
        } else if (intValue == 1) {
            intValue = 1;
        }
        setMaxLines(intValue);
        Drawable iconDrawableResizable = iconRes != null ? DrawableResExtKt.getIconDrawableResizable(iconRes.intValue(), context, (int) getTextSize()) : null;
        if (isAllCaps) {
            String obj = text.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            text = obj.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(text, "toUpperCase(...)");
        }
        SpannableStringBuilder clearSpan = SpannableStringBuilderExtKt.clearSpan(new SpannableStringBuilder(text));
        if (iconDrawableResizable != null) {
            if (iconTintColor != null) {
                iconDrawableResizable.setTint(iconTintColor.intValue());
            }
            clearSpan = SpannableStringBuilderExtKt.insertIconSpan(clearSpan, iconDrawableResizable, iconPosition, 0, 0);
        }
        setUnellipsizedText(clearSpan, getTruncateAt(truncatingMode), leftPadding, rightPadding);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    public final Color.Gradient getTextGradient() {
        return this.textGradient;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int min = Integer.min((getMaxWidth() - getPaddingLeft()) - getPaddingRight(), (mode == Integer.MIN_VALUE || mode == 1073741824) ? (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight() : Integer.MAX_VALUE);
        float desiredWidth = Layout.getDesiredWidth(this.unellipsizedText, getPaint());
        if (getMaxLines() <= 0 || min <= 0 || desiredWidth <= min) {
            setTextInternal(this.unellipsizedText);
        } else {
            updateOnEllipsedText(this.unellipsizedText, min);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void scrollTo(int x11, int y11) {
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt where) {
        if (where == null) {
            where = TextUtils.TruncateAt.END;
        }
        this.truncateAt = where;
        super.setEllipsize(null);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        this.topPaddingInternal = top;
        this.bottomPaddingInternal = bottom;
        super.setPadding(left, top + this.topLineHeightPadding, right, bottom + this.bottomLineHeightPadding);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        if (!this.isTextSetInternal) {
            setUnellipsizedText$default(this, text == null ? "" : text, null, 2, null);
        }
        super.setText(text, type);
    }

    public final void setTextGradient(Color.Gradient gradient) {
        this.textGradient = gradient;
        if (gradient != null) {
            applyGradient(gradient);
        } else {
            getPaint().setShader(null);
        }
    }

    public /* synthetic */ TextAtomV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAtomV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "text";
        this.truncateAt = TextUtils.TruncateAt.END;
        this.unellipsizedText = "";
        int[] iArr = {R.attr.fontFamily, R.attr.lineHeight, android.R.attr.textAppearance};
        C7705l.Z(iArr);
        this.styledAttrs = iArr;
        if (!ContextsKt.isAppOpenOnTV(context)) {
            setTextIsSelectable(true);
        }
        setContentDescription(getLocatorTag());
    }

    @InterfaceC3999a
    public final void setUnellipsizedText(@NotNull CharSequence text, @NotNull TextUtils.TruncateAt truncateAt, int leftPadding, int rightPadding) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(truncateAt, "truncateAt");
        this.truncateAt = truncateAt;
        setPadding(leftPadding, this.topPaddingInternal, rightPadding, this.bottomPaddingInternal);
        setUnellipsizedText(text);
    }

    public final void setUnellipsizedText(@NotNull CharSequence text, @NotNull TextUtils.TruncateAt truncateAt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(truncateAt, "truncateAt");
        this.truncateAt = truncateAt;
        setUnellipsizedText(text);
    }
}
