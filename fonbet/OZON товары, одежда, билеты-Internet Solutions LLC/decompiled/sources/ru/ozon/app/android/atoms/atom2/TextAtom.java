package ru.ozon.app.android.atoms.atom2;

import Am.C2438a;
import B0.C2454a;
import Kk.C3532b;
import Ql.c;
import Sc.InterfaceC3999a;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.content.res.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.atoms.R$styleable;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.databinding.AtomTextBinding;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.common.ImageLoader;

@InterfaceC3999a
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001?B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J%\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u000f2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\"\u0010!J\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b,\u0010\u001aR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00100\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010&R*\u00106\u001a\u00020\f2\u0006\u00105\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/atoms/atom2/TextAtom;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "styledAttrs", "Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration;", "initConfig", "(Landroid/content/res/TypedArray;)Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration;", "", "onConfigurationChanged", "()V", "updateLinkMovementState", "applyUnderlineToLinksIfNeeded", "", "imageUrl", "textColor", "setImage", "(Ljava/lang/String;Ljava/lang/Integer;)V", "setRightImage", "(Ljava/lang/String;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "maxLines", "setMaxLines", "(Ljava/lang/Integer;)V", "setTextColor", "Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "item", "bind", "(Lru/ozon/app/android/atoms/data/deprecated/CommonText;)V", "Landroid/view/ViewGroup$MarginLayoutParams;", "lp", "changeLayoutParams", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "testId", "setTestId", "Lru/ozon/app/android/atoms/databinding/AtomTextBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/AtomTextBinding;", "commonText", "Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "getCommonText", "()Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "setCommonText", AppMeasurementSdk.ConditionalUserProperty.VALUE, "configuration", "Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration;", "getConfiguration", "()Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration;", "setConfiguration", "(Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration;)V", "", "hasAction", "Z", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextAtom extends FrameLayout {

    @NotNull
    private final AtomTextBinding binding;
    public CommonText commonText;

    @NotNull
    private Configuration configuration;
    private boolean hasAction;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001:\u0001HBÏ\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010 \"\u0004\b'\u0010(R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010%\u001a\u0004\b)\u0010 \"\u0004\b*\u0010(R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b+\u0010 \"\u0004\b,\u0010(R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b-\u0010 \"\u0004\b.\u0010(R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b/\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b0\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b1\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b5\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b9\u00108R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b:\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\bA\u0010 R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\bB\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\bC\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\bG\u00104¨\u0006I"}, d2 = {"Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "titleStyle", "iconSize", "iconTopMargin", "defaultIconDrawable", "textIndent", "", "topSeparator", "useTextIndent", "textVerticalSpace", "Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration$Alignment;", "textAlignment", "", "textLineSpacingMultiplier", "rightIconSize", "rightIconTopMargin", "maxLines", "Landroid/text/method/MovementMethod;", "linkMovement", "customLinkColor", "<init>", "(IIIIIIILjava/lang/Integer;IZZILru/ozon/app/android/atoms/atom2/TextAtom$Configuration$Alignment;Ljava/lang/Float;IILjava/lang/Integer;Landroid/text/method/MovementMethod;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "getTitleStyle", "getIconSize", "getIconTopMargin", "Ljava/lang/Integer;", "getDefaultIconDrawable", "()Ljava/lang/Integer;", "getTextIndent", "Z", "getTopSeparator", "()Z", "getUseTextIndent", "getTextVerticalSpace", "Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration$Alignment;", "getTextAlignment", "()Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration$Alignment;", "Ljava/lang/Float;", "getTextLineSpacingMultiplier", "()Ljava/lang/Float;", "getRightIconSize", "getRightIconTopMargin", "getMaxLines", "Landroid/text/method/MovementMethod;", "getLinkMovement", "()Landroid/text/method/MovementMethod;", "getCustomLinkColor", "Alignment", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final Integer customLinkColor;
        private final Integer defaultIconDrawable;
        private final int iconSize;
        private final int iconTopMargin;
        private final MovementMethod linkMovement;
        private final Integer maxLines;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;
        private final int rightIconSize;
        private final int rightIconTopMargin;

        @NotNull
        private final Alignment textAlignment;
        private final int textIndent;
        private final Float textLineSpacingMultiplier;
        private final int textVerticalSpace;
        private final int titleStyle;
        private final boolean topSeparator;
        private final boolean useTextIndent;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/atom2/TextAtom$Configuration$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "START", "CENTER", "END", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Alignment {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Alignment[] $VALUES;
            public static final Alignment START = new Alignment("START", 0);
            public static final Alignment CENTER = new Alignment("CENTER", 1);
            public static final Alignment END = new Alignment("END", 2);

            private static final /* synthetic */ Alignment[] $values() {
                return new Alignment[]{START, CENTER, END};
            }

            static {
                Alignment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Alignment(String str, int i11) {
            }

            public static Alignment valueOf(String str) {
                return (Alignment) Enum.valueOf(Alignment.class, str);
            }

            public static Alignment[] values() {
                return (Alignment[]) $VALUES.clone();
            }
        }

        public Configuration() {
            this(0, 0, 0, 0, 0, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 524287, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.titleStyle == configuration.titleStyle && this.iconSize == configuration.iconSize && this.iconTopMargin == configuration.iconTopMargin && Intrinsics.d(this.defaultIconDrawable, configuration.defaultIconDrawable) && this.textIndent == configuration.textIndent && this.topSeparator == configuration.topSeparator && this.useTextIndent == configuration.useTextIndent && this.textVerticalSpace == configuration.textVerticalSpace && this.textAlignment == configuration.textAlignment && Intrinsics.d(this.textLineSpacingMultiplier, configuration.textLineSpacingMultiplier) && this.rightIconSize == configuration.rightIconSize && this.rightIconTopMargin == configuration.rightIconTopMargin && Intrinsics.d(this.maxLines, configuration.maxLines) && Intrinsics.d(this.linkMovement, configuration.linkMovement) && Intrinsics.d(this.customLinkColor, configuration.customLinkColor);
        }

        public final Integer getCustomLinkColor() {
            return this.customLinkColor;
        }

        public final Integer getDefaultIconDrawable() {
            return this.defaultIconDrawable;
        }

        public final int getIconSize() {
            return this.iconSize;
        }

        public final int getIconTopMargin() {
            return this.iconTopMargin;
        }

        public final MovementMethod getLinkMovement() {
            return this.linkMovement;
        }

        public final Integer getMaxLines() {
            return this.maxLines;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingEnd() {
            return this.paddingEnd;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingStart() {
            return this.paddingStart;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingTop() {
            return this.paddingTop;
        }

        public final int getRightIconSize() {
            return this.rightIconSize;
        }

        public final int getRightIconTopMargin() {
            return this.rightIconTopMargin;
        }

        @NotNull
        public final Alignment getTextAlignment() {
            return this.textAlignment;
        }

        public final int getTextIndent() {
            return this.textIndent;
        }

        public final Float getTextLineSpacingMultiplier() {
            return this.textLineSpacingMultiplier;
        }

        public final int getTextVerticalSpace() {
            return this.textVerticalSpace;
        }

        public final int getTitleStyle() {
            return this.titleStyle;
        }

        public final boolean getTopSeparator() {
            return this.topSeparator;
        }

        public final boolean getUseTextIndent() {
            return this.useTextIndent;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.iconTopMargin, C2454a.a(this.iconSize, C2454a.a(this.titleStyle, C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31), 31), 31), 31);
            Integer num = this.defaultIconDrawable;
            int hashCode = (this.textAlignment.hashCode() + C2454a.a(this.textVerticalSpace, C3532b.a(C3532b.a(C2454a.a(this.textIndent, (a11 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.topSeparator), 31, this.useTextIndent), 31)) * 31;
            Float f7 = this.textLineSpacingMultiplier;
            int a12 = C2454a.a(this.rightIconTopMargin, C2454a.a(this.rightIconSize, (hashCode + (f7 == null ? 0 : f7.hashCode())) * 31, 31), 31);
            Integer num2 = this.maxLines;
            int hashCode2 = (a12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            MovementMethod movementMethod = this.linkMovement;
            int hashCode3 = (hashCode2 + (movementMethod == null ? 0 : movementMethod.hashCode())) * 31;
            Integer num3 = this.customLinkColor;
            return hashCode3 + (num3 != null ? num3.hashCode() : 0);
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingBottom(int i11) {
            this.paddingBottom = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingEnd(int i11) {
            this.paddingEnd = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingStart(int i11) {
            this.paddingStart = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingTop(int i11) {
            this.paddingTop = i11;
        }

        @NotNull
        public String toString() {
            int i11 = this.paddingStart;
            int i12 = this.paddingEnd;
            int i13 = this.paddingTop;
            int i14 = this.paddingBottom;
            int i15 = this.titleStyle;
            int i16 = this.iconSize;
            int i17 = this.iconTopMargin;
            Integer num = this.defaultIconDrawable;
            int i18 = this.textIndent;
            boolean z11 = this.topSeparator;
            boolean z12 = this.useTextIndent;
            int i19 = this.textVerticalSpace;
            Alignment alignment = this.textAlignment;
            Float f7 = this.textLineSpacingMultiplier;
            int i21 = this.rightIconSize;
            int i22 = this.rightIconTopMargin;
            Integer num2 = this.maxLines;
            MovementMethod movementMethod = this.linkMovement;
            Integer num3 = this.customLinkColor;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            Ek.a.f(i13, i14, ", paddingBottom=", ", titleStyle=", a11);
            Ek.a.f(i15, i16, ", iconSize=", ", iconTopMargin=", a11);
            a11.append(i17);
            a11.append(", defaultIconDrawable=");
            a11.append(num);
            a11.append(", textIndent=");
            c.d(a11, i18, ", topSeparator=", z11, ", useTextIndent=");
            a11.append(z12);
            a11.append(", textVerticalSpace=");
            a11.append(i19);
            a11.append(", textAlignment=");
            a11.append(alignment);
            a11.append(", textLineSpacingMultiplier=");
            a11.append(f7);
            a11.append(", rightIconSize=");
            Ek.a.f(i21, i22, ", rightIconTopMargin=", ", maxLines=", a11);
            a11.append(num2);
            a11.append(", linkMovement=");
            a11.append(movementMethod);
            a11.append(", customLinkColor=");
            return Ep.a.c(a11, num3, ")");
        }

        public Configuration(int i11, int i12, int i13, int i14, int i15, int i16, int i17, Integer num, int i18, boolean z11, boolean z12, int i19, @NotNull Alignment textAlignment, Float f7, int i21, int i22, Integer num2, MovementMethod movementMethod, Integer num3) {
            Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.titleStyle = i15;
            this.iconSize = i16;
            this.iconTopMargin = i17;
            this.defaultIconDrawable = num;
            this.textIndent = i18;
            this.topSeparator = z11;
            this.useTextIndent = z12;
            this.textVerticalSpace = i19;
            this.textAlignment = textAlignment;
            this.textLineSpacingMultiplier = f7;
            this.rightIconSize = i21;
            this.rightIconTopMargin = i22;
            this.maxLines = num2;
            this.linkMovement = movementMethod;
            this.customLinkColor = num3;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, int i15, int i16, int i17, Integer num, int i18, boolean z11, boolean z12, int i19, Alignment alignment, Float f7, int i21, int i22, Integer num2, MovementMethod movementMethod, Integer num3, int i23, DefaultConstructorMarker defaultConstructorMarker) {
            this((i23 & 1) != 0 ? 16 : i11, (i23 & 2) == 0 ? i12 : 16, (i23 & 4) != 0 ? 0 : i13, (i23 & 8) != 0 ? 0 : i14, (i23 & 16) != 0 ? R$style.TextStyle_Body_L : i15, (i23 & 32) != 0 ? 24 : i16, (i23 & 64) != 0 ? 0 : i17, (i23 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num, (i23 & 256) != 0 ? 36 : i18, (i23 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z11, (i23 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z12, (i23 & 2048) != 0 ? 2 : i19, (i23 & 4096) != 0 ? Alignment.START : alignment, (i23 & 8192) != 0 ? null : f7, (i23 & 16384) != 0 ? 24 : i21, (i23 & 32768) != 0 ? 0 : i22, (i23 & 65536) != 0 ? null : num2, (i23 & 131072) != 0 ? null : movementMethod, (i23 & 262144) != 0 ? null : num3);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Configuration.Alignment.values().length];
            try {
                iArr[Configuration.Alignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Configuration.Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Configuration.Alignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAtom(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyUnderlineToLinksIfNeeded() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (UniGlobalConfigKt.getUnderlineLinksFlag(context)) {
            CharSequence text = this.binding.titleTv.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
                Intrinsics.f(clickableSpanArr);
                for (ClickableSpan clickableSpan : clickableSpanArr) {
                    spannable.setSpan(new UnderlineSpan(), spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan), 33);
                }
            }
        }
    }

    private final Configuration initConfig(TypedArray styledAttrs) {
        int i11;
        int i12;
        int integer = styledAttrs.getInteger(R$styleable.TextAtom_configuration, -1);
        int i13 = R$styleable.TextAtom_textStyle;
        i11 = TextAtomKt.DEFAULT_TEXT_STYLE;
        int resourceId = styledAttrs.getResourceId(i13, i11);
        int i14 = styledAttrs.getInt(R$styleable.TextAtom_confPaddingTop, 0);
        int i15 = styledAttrs.getInt(R$styleable.TextAtom_confPaddingBottom, 0);
        boolean z11 = styledAttrs.getBoolean(R$styleable.TextAtom_topSeparator, false);
        int integer2 = styledAttrs.getInteger(R$styleable.TextAtom_imageSize, 24);
        int integer3 = styledAttrs.getInteger(R$styleable.TextAtom_textIndent, 36);
        if (integer == 0) {
            i12 = TextAtomKt.DEFAULT_TEXT_STYLE;
            return new Configuration(0, 0, i14, i15, i12, integer2, 0, null, integer3, z11, false, 0, null, null, 0, 0, null, null, null, 523459, null);
        }
        if (integer == 1) {
            return new Configuration(0, 0, i14, i15, R$style.TextStyle_Caption, integer2, 0, null, integer3, z11, false, 0, null, null, 0, 0, null, null, null, 523459, null);
        }
        if (integer != 2) {
            return new Configuration(0, 0, i14, i15, resourceId, integer2, 0, null, integer3, z11, false, 0, null, null, 0, 0, null, null, null, 523459, null);
        }
        return new Configuration(0, 0, 16, 16, R$style.TextStyle_Body_L_Bold, integer2, 0, null, integer3, true, false, 0, null, null, 0, 0, null, null, null, 523459, null);
    }

    private final void onConfigurationChanged() {
        int i11;
        View rootView = getRootView();
        int paddingBottom = this.configuration.getPaddingBottom();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rootView.setPadding(0, 0, 0, ResourceExtKt.toPx(paddingBottom, context));
        AtomTextBinding atomTextBinding = this.binding;
        View separatorV = atomTextBinding.separatorV;
        Intrinsics.checkNotNullExpressionValue(separatorV, "separatorV");
        ViewExtKt.showOrGone(separatorV, Boolean.valueOf(this.configuration.getTopSeparator()));
        ViewGroup.LayoutParams layoutParams = atomTextBinding.contentTopSpace.getLayoutParams();
        int paddingTop = this.configuration.getPaddingTop();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams.height = ResourceExtKt.toPx(paddingTop, context2);
        ViewGroup.LayoutParams layoutParams2 = atomTextBinding.contentStartSpace.getLayoutParams();
        int paddingStart = this.configuration.getPaddingStart();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        layoutParams2.width = ResourceExtKt.toPx(paddingStart, context3);
        ViewGroup.LayoutParams layoutParams3 = atomTextBinding.contentEndSpace.getLayoutParams();
        int paddingEnd = this.configuration.getPaddingEnd();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        layoutParams3.width = ResourceExtKt.toPx(paddingEnd, context4);
        updateLinkMovementState();
        TextView textView = atomTextBinding.titleTv;
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.configuration.getTextAlignment().ordinal()];
        if (i12 == 1) {
            i11 = 5;
        } else if (i12 == 2) {
            i11 = 4;
        } else {
            if (i12 != 3) {
                throw new o();
            }
            i11 = 6;
        }
        textView.setTextAlignment(i11);
        Float textLineSpacingMultiplier = this.configuration.getTextLineSpacingMultiplier();
        if (textLineSpacingMultiplier != null) {
            float floatValue = textLineSpacingMultiplier.floatValue();
            TextView textView2 = atomTextBinding.titleTv;
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), floatValue);
        }
        TextView textView3 = atomTextBinding.titleTv;
        Integer maxLines = this.configuration.getMaxLines();
        textView3.setMaxLines(maxLines != null ? maxLines.intValue() : Integer.MAX_VALUE);
        atomTextBinding.titleTv.setTextAppearance(this.configuration.getTitleStyle());
        ViewGroup.LayoutParams layoutParams4 = atomTextBinding.titleTv.getLayoutParams();
        Intrinsics.g(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
        int textVerticalSpace = this.configuration.getTextVerticalSpace();
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        marginLayoutParams.topMargin = ResourceExtKt.toPx(textVerticalSpace, context5);
        int textVerticalSpace2 = this.configuration.getTextVerticalSpace();
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        marginLayoutParams.bottomMargin = ResourceExtKt.toPx(textVerticalSpace2, context6);
        ViewGroup.LayoutParams layoutParams5 = atomTextBinding.textGuidelineSpace.getLayoutParams();
        int textIndent = this.configuration.getTextIndent();
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        layoutParams5.width = ResourceExtKt.toPx(textIndent, context7);
        ViewGroup.LayoutParams layoutParams6 = atomTextBinding.iconIv.getLayoutParams();
        Intrinsics.g(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
        int iconSize = this.configuration.getIconSize();
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        marginLayoutParams2.width = ResourceExtKt.toPx(iconSize, context8);
        int iconSize2 = this.configuration.getIconSize();
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        marginLayoutParams2.height = ResourceExtKt.toPx(iconSize2, context9);
        int iconTopMargin = this.configuration.getIconTopMargin();
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        marginLayoutParams2.topMargin = ResourceExtKt.toPx(iconTopMargin, context10);
        ViewGroup.LayoutParams layoutParams7 = atomTextBinding.rightIconIv.getLayoutParams();
        Intrinsics.g(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams7;
        int rightIconSize = this.configuration.getRightIconSize();
        Context context11 = getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        marginLayoutParams3.width = ResourceExtKt.toPx(rightIconSize, context11);
        int rightIconSize2 = this.configuration.getRightIconSize();
        Context context12 = getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        marginLayoutParams3.height = ResourceExtKt.toPx(rightIconSize2, context12);
        int rightIconTopMargin = this.configuration.getRightIconTopMargin();
        Context context13 = getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
        marginLayoutParams3.topMargin = ResourceExtKt.toPx(rightIconTopMargin, context13);
        getRootView().requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setImage(String imageUrl, Integer textColor) {
        boolean z11 = true;
        boolean z12 = ((imageUrl == null || h.K(imageUrl)) && this.configuration.getDefaultIconDrawable() == null) ? false : true;
        if (z12) {
            ImageView iconIv = this.binding.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
            ViewExtKt.show(iconIv);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!ThemeExtKt.isDarkThemeActive(context) || imageUrl == null || h.e0(imageUrl, "ic_", false)) {
                this.binding.iconIv.setBackground(null);
            } else {
                this.binding.iconIv.setBackground(g.d(getContext().getResources(), R$drawable.bg_image_white_overlay, getContext().getTheme()));
            }
            if (imageUrl != null) {
                String str = h.K(imageUrl) ? null : imageUrl;
                if (str != null) {
                    ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
                    ImageView iconIv2 = this.binding.iconIv;
                    Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
                    imageLoader.load(iconIv2, str);
                    if (imageUrl != null) {
                        if (ExtensionsKt.isUrl(imageUrl)) {
                            this.binding.iconIv.clearColorFilter();
                        } else {
                            ImageView iconIv3 = this.binding.iconIv;
                            Intrinsics.checkNotNullExpressionValue(iconIv3, "iconIv");
                            ThemeExtKt.tint(iconIv3, textColor);
                        }
                    }
                }
            }
            Integer defaultIconDrawable = this.configuration.getDefaultIconDrawable();
            if (defaultIconDrawable != null) {
                this.binding.iconIv.setImageDrawable(androidx.core.content.a.getDrawable(getContext(), defaultIconDrawable.intValue()));
            }
            if (imageUrl != null) {
            }
        } else {
            ImageView iconIv4 = this.binding.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv4, "iconIv");
            ViewExtKt.gone(iconIv4);
        }
        Space textGuidelineSpace = this.binding.textGuidelineSpace;
        Intrinsics.checkNotNullExpressionValue(textGuidelineSpace, "textGuidelineSpace");
        if (!z12 && !this.configuration.getUseTextIndent()) {
            z11 = false;
        }
        ViewExtKt.showOrGone(textGuidelineSpace, Boolean.valueOf(z11));
    }

    private final void setMaxLines(Integer maxLines) {
        this.binding.titleTv.setMaxLines((maxLines == null && (maxLines = this.configuration.getMaxLines()) == null) ? Integer.MAX_VALUE : maxLines.intValue());
    }

    private final void setRightImage(String imageUrl) {
        ImageView rightIconIv = this.binding.rightIconIv;
        Intrinsics.checkNotNullExpressionValue(rightIconIv, "rightIconIv");
        ViewExtKt.showOrGone(rightIconIv, Boolean.valueOf(imageUrl != null));
        if (imageUrl != null) {
            ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
            ImageView rightIconIv2 = this.binding.rightIconIv;
            Intrinsics.checkNotNullExpressionValue(rightIconIv2, "rightIconIv");
            imageLoader.load(rightIconIv2, imageUrl);
            ImageView rightIconIv3 = this.binding.rightIconIv;
            Intrinsics.checkNotNullExpressionValue(rightIconIv3, "rightIconIv");
            ThemeExtKt.semanticTint$default(rightIconIv3, 0, 1, null);
        }
    }

    private final void setText(CharSequence text) {
        this.binding.titleTv.setText(text);
    }

    private final void setTextColor(Integer textColor) {
        if (textColor != null) {
            this.binding.titleTv.setTextColor(textColor.intValue());
        }
    }

    private final void updateLinkMovementState() {
        TextView textView = this.binding.titleTv;
        MovementMethod movementMethod = null;
        if (((this.configuration.getLinkMovement() == null || this.hasAction) ? null : this) != null) {
            Integer customLinkColor = this.configuration.getCustomLinkColor();
            int intValue = customLinkColor != null ? customLinkColor.intValue() : R$attr.oz_semantic_accent_primary;
            TextView textView2 = this.binding.titleTv;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView2.setLinkTextColor(ThemeExtKt.themeColor(context, intValue));
            applyUnderlineToLinksIfNeeded();
            movementMethod = this.configuration.getLinkMovement();
        }
        textView.setMovementMethod(movementMethod);
    }

    public final void bind(@NotNull CommonText item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setCommonText(item);
        boolean z11 = item.getAction() != null;
        this.hasAction = z11;
        ClickableCiewKt.switchForegroundClickable(this, z11);
        setRightImage(item.getImageRight());
        setText(item.getText());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, item.getTextColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY);
        setTextColor(Integer.valueOf(parseColor));
        setImage(item.getImage(), Integer.valueOf(parseColor));
        setMaxLines(item.getMaxLines());
        updateLinkMovementState();
    }

    public final void changeLayoutParams(@NotNull ViewGroup.MarginLayoutParams lp) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        if (lp.width != -2) {
            this.binding.titleTv.getLayoutParams().width = 0;
        } else {
            this.binding.titleTv.getLayoutParams().width = -2;
        }
    }

    public final void setCommonText(@NotNull CommonText commonText) {
        Intrinsics.checkNotNullParameter(commonText, "<set-?>");
        this.commonText = commonText;
    }

    public final void setConfiguration(@NotNull Configuration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.configuration = value;
        onConfigurationChanged();
    }

    public final void setTestId(String testId) {
        this.binding.titleTv.setContentDescription(testId);
    }

    public /* synthetic */ TextAtom(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAtom(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int i12;
        Intrinsics.checkNotNullParameter(context, "context");
        i12 = TextAtomKt.DEFAULT_TEXT_STYLE;
        this.configuration = new Configuration(0, 0, 0, 0, i12, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 524271, null);
        this.binding = AtomTextBinding.inflate(LayoutInflater.from(context), this, true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TextAtom, i11, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setConfiguration(initConfig(obtainStyledAttributes));
            String string = obtainStyledAttributes.getString(R$styleable.TextAtom_android_text);
            setText(string == null ? "" : string);
            int color = obtainStyledAttributes.getColor(R$styleable.TextAtom_android_textColor, androidx.core.content.a.getColor(context, R$color.oz_semantic_text_primary));
            setTextColor(Integer.valueOf(color));
            setImage(obtainStyledAttributes.getString(R$styleable.TextAtom_image), Integer.valueOf(color));
            int i13 = R$styleable.TextAtom_android_maxLines;
            Integer maxLines = this.configuration.getMaxLines();
            setMaxLines(Integer.valueOf(obtainStyledAttributes.getInt(i13, maxLines != null ? maxLines.intValue() : Integer.MAX_VALUE)));
            setRightImage(obtainStyledAttributes.getString(R$styleable.TextAtom_rightImage));
            obtainStyledAttributes.recycle();
        }
    }
}
