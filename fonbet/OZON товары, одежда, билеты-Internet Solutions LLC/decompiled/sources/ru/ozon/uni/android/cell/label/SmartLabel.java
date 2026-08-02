package ru.ozon.uni.android.cell.label;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.SmartLabelPreset;
import ru.ozon.uni.android.uikitsdk.ext.DrawableResExtKt;
import ru.ozon.uni.android.uikitsdk.ext.SpannableStringBuilderExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b'\u0010&J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R*\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00104\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010<\"\u0004\b=\u0010\u000fR*\u0010>\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0013R\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010G¨\u0006L"}, d2 = {"Lru/ozon/uni/android/cell/label/SmartLabel;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setDrawableSpan", "(Landroid/graphics/drawable/Drawable;)V", "", "text", "setTextInternal", "(Ljava/lang/CharSequence;)V", "maximumWidth", "updateOnEllipsedText", "(Ljava/lang/CharSequence;I)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "side", "imgSrc", "color", "setIcon", "(Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setIconColor", "(I)Landroid/graphics/drawable/Drawable;", "setIconColorInt", "Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;", "preset", "withSmartLabelPreset", "(Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;)Lru/ozon/uni/android/cell/label/SmartLabel;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "iconSide", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "getIconSide", "()Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "setIconSide", "(Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;)V", "padding", "I", "Landroid/graphics/drawable/Drawable;", "setDrawable", "unellipsizedText", "Ljava/lang/CharSequence;", "getUnellipsizedText", "()Ljava/lang/CharSequence;", "setUnellipsizedText", "", "isTextSetInternal", "Z", "getIconPaddingLeft", "()I", "iconPaddingLeft", "getIconPaddingRight", "iconPaddingRight", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SmartLabel extends AppCompatTextView implements AtomLocatableView {
    private Drawable drawable;

    @NotNull
    private AddonSide iconSide;
    private boolean isTextSetInternal;

    @NotNull
    private String locatorTag;
    private int padding;

    @NotNull
    private CharSequence unellipsizedText;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/cell/label/SmartLabel$Companion;", "", "<init>", "()V", "SMART_LABEL_LOCATOR_TAG", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        static {
            int[] iArr = new int[AddonSide.values().length];
            try {
                iArr[AddonSide.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddonSide.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TextUtils.TruncateAt.values().length];
            try {
                iArr2[TextUtils.TruncateAt.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TextUtils.TruncateAt.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TextUtils.TruncateAt.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ SmartLabel(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final int getIconPaddingLeft() {
        if (this.iconSide == AddonSide.START) {
            return UiExtKt.toPx(this.padding);
        }
        return 0;
    }

    private final int getIconPaddingRight() {
        if (this.iconSide == AddonSide.START) {
            return 0;
        }
        return UiExtKt.toPx(this.padding);
    }

    private final void setDrawable(Drawable drawable) {
        if (Intrinsics.d(this.drawable, drawable)) {
            return;
        }
        this.drawable = drawable;
        if (drawable != null) {
            setDrawableSpan(drawable);
        }
    }

    private final void setDrawableSpan(Drawable drawable) {
        CommonAtomLabelDTO.IconPosition iconPosition;
        CharSequence text = getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        SpannableStringBuilder clearSpan = SpannableStringBuilderExtKt.clearSpan(new SpannableStringBuilder(h.z0(text).length() == 0 ? " " : getText()));
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.iconSide.ordinal()];
        if (i11 == 1) {
            iconPosition = CommonAtomLabelDTO.IconPosition.START;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            iconPosition = CommonAtomLabelDTO.IconPosition.END;
        }
        setText(SpannableStringBuilderExtKt.insertIconSpan(clearSpan, drawable, iconPosition, getIconPaddingLeft(), getIconPaddingRight()));
    }

    private final void setTextInternal(CharSequence text) {
        this.isTextSetInternal = true;
        try {
            setText(text);
        } finally {
            this.isTextSetInternal = false;
        }
    }

    private final void updateOnEllipsedText(CharSequence text, int maximumWidth) {
        if (getMaxLines() <= 1) {
            CharSequence ellipsize = TextUtils.ellipsize(text, getPaint(), maximumWidth, getEllipsize());
            Intrinsics.checkNotNullExpressionValue(ellipsize, "ellipsize(...)");
            setTextInternal(ellipsize);
            return;
        }
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), getPaint(), maximumWidth).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (build.getLineCount() > getMaxLines()) {
            TextUtils.TruncateAt ellipsize2 = getEllipsize();
            int i11 = ellipsize2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[ellipsize2.ordinal()];
            if (i11 == 1 || i11 == 2) {
                int lineStart = build.getLineStart(getMaxLines() - 1);
                CharSequence concat = TextUtils.concat(text.subSequence(0, lineStart), TextUtils.ellipsize(text.subSequence(lineStart, text.length()), getPaint(), maximumWidth, getEllipsize()));
                Intrinsics.checkNotNullExpressionValue(concat, "concat(...)");
                setTextInternal(concat);
                return;
            }
            if (i11 != 3) {
                return;
            }
            int lineStart2 = build.getLineStart((build.getLineCount() + 1) - getMaxLines());
            CharSequence concat2 = TextUtils.concat(TextUtils.ellipsize(text.subSequence(0, lineStart2), getPaint(), maximumWidth, getEllipsize()), System.lineSeparator(), text.subSequence(lineStart2, text.length()));
            Intrinsics.checkNotNullExpressionValue(concat2, "concat(...)");
            setTextInternal(concat2);
        }
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
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

    public final void setIcon(@NotNull AddonSide side, Integer imgSrc, Integer color) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(side, "side");
        setIconSide(side);
        if (imgSrc != null) {
            int intValue = imgSrc.intValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawable = DrawableResExtKt.getIconDrawable(intValue, context, (int) getTextSize());
        } else {
            drawable = null;
        }
        setDrawable(drawable);
        if (color != null) {
            setIconColor(color.intValue());
        }
    }

    public final Drawable setIconColor(int color) {
        Drawable drawable = this.drawable;
        if (drawable == null) {
            return null;
        }
        drawable.setTint(a.getColor(getContext(), color));
        setDrawableSpan(drawable);
        return drawable;
    }

    public final Drawable setIconColorInt(int color) {
        Drawable drawable = this.drawable;
        if (drawable == null) {
            return null;
        }
        drawable.setTint(color);
        setDrawableSpan(drawable);
        return drawable;
    }

    public final void setIconSide(@NotNull AddonSide value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.iconSide != value) {
            this.iconSide = value;
            Drawable drawable = this.drawable;
            if (drawable != null) {
                setDrawableSpan(drawable);
            }
        }
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        if (!this.isTextSetInternal) {
            setUnellipsizedText(text == null ? "" : text);
        }
        super.setText(text, type);
    }

    public final void setUnellipsizedText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.unellipsizedText = value;
        setTextInternal(value);
    }

    @NotNull
    public final SmartLabel withSmartLabelPreset(@NotNull SmartLabelPreset preset) {
        Intrinsics.checkNotNullParameter(preset, "preset");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(this, context, preset.getTextAppearanceResId());
        setGravity(preset.getTextAlignment());
        this.padding = preset.getGap();
        Drawable drawable = this.drawable;
        if (drawable != null) {
            setDrawableSpan(drawable);
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartLabel(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "smartLabel";
        this.iconSide = AddonSide.START;
        this.unellipsizedText = "";
        setContentDescription(getLocatorTag());
    }
}
