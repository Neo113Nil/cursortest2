package ru.ozon.app.android.atoms.atom2;

import Am.C2438a;
import B0.C2454a;
import Ef0.c;
import Ek.a;
import Sc.InterfaceC3999a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.atoms.R$styleable;
import ru.ozon.app.android.atoms.af.extensions.AttrsExtensionKt;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.atoms.databinding.AtomLabelBinding;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0013J#\u0010\u001e\u001a\u00020\u00112\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R*\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010+R\u0016\u0010/\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/atoms/atom2/LabelAtom;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "styledAttrs", "Lru/ozon/app/android/atoms/atom2/LabelAtom$Configuration;", "initConfig", "(Landroid/content/res/TypedArray;)Lru/ozon/app/android/atoms/atom2/LabelAtom$Configuration;", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "data", "", "bindText", "(Lru/ozon/app/android/atoms/data/deprecated/Label;)V", "bindImage", "backgroundColor", "getHorizontalPadding", "(I)I", "applyConfig", "()V", "item", "bind", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/atoms/databinding/AtomLabelBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/AtomLabelBinding;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "configuration", "Lru/ozon/app/android/atoms/atom2/LabelAtom$Configuration;", "getConfiguration", "()Lru/ozon/app/android/atoms/atom2/LabelAtom$Configuration;", "setConfiguration", "(Lru/ozon/app/android/atoms/atom2/LabelAtom$Configuration;)V", "icHPadding", "I", "icVPadding", "defaultTextHorizontalPadding", "defaultTextVerticalPadding", "label", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LabelAtom extends FrameLayout {

    @NotNull
    private final AtomLabelBinding binding;

    @NotNull
    private Configuration configuration;
    private final int defaultTextHorizontalPadding;
    private int defaultTextVerticalPadding;
    private final int icHPadding;
    private final int icVPadding;
    private Label label;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010!R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010!R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010!R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b.\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b/\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b0\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b1\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b2\u0010*¨\u00063"}, d2 = {"Lru/ozon/app/android/atoms/atom2/LabelAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "internalPaddingTop", "internalPaddingBottom", "internalPaddingStart", "internalPaddingEnd", "textStyle", "iconSize", "forceTintColor", "forceBackgroundColor", "forceTextColor", "<init>", "(IIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(IIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/atoms/atom2/LabelAtom$Configuration;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "Ljava/lang/Integer;", "getInternalPaddingTop", "()Ljava/lang/Integer;", "getInternalPaddingBottom", "getInternalPaddingStart", "getInternalPaddingEnd", "getTextStyle", "getIconSize", "getForceTintColor", "getForceBackgroundColor", "getForceTextColor", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final Integer forceBackgroundColor;
        private final Integer forceTextColor;
        private final Integer forceTintColor;
        private final int iconSize;
        private final Integer internalPaddingBottom;
        private final Integer internalPaddingEnd;
        private final Integer internalPaddingStart;
        private final Integer internalPaddingTop;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;
        private final int textStyle;

        public Configuration() {
            this(0, 0, 0, 0, null, null, null, null, 0, 0, null, null, null, 8191, null);
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, int i11, int i12, int i13, int i14, Integer num, Integer num2, Integer num3, Integer num4, int i15, int i16, Integer num5, Integer num6, Integer num7, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                i11 = configuration.paddingStart;
            }
            return configuration.copy(i11, (i17 & 2) != 0 ? configuration.paddingEnd : i12, (i17 & 4) != 0 ? configuration.paddingTop : i13, (i17 & 8) != 0 ? configuration.paddingBottom : i14, (i17 & 16) != 0 ? configuration.internalPaddingTop : num, (i17 & 32) != 0 ? configuration.internalPaddingBottom : num2, (i17 & 64) != 0 ? configuration.internalPaddingStart : num3, (i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? configuration.internalPaddingEnd : num4, (i17 & 256) != 0 ? configuration.textStyle : i15, (i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? configuration.iconSize : i16, (i17 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? configuration.forceTintColor : num5, (i17 & 2048) != 0 ? configuration.forceBackgroundColor : num6, (i17 & 4096) != 0 ? configuration.forceTextColor : num7);
        }

        @NotNull
        public final Configuration copy(int paddingStart, int paddingEnd, int paddingTop, int paddingBottom, Integer internalPaddingTop, Integer internalPaddingBottom, Integer internalPaddingStart, Integer internalPaddingEnd, int textStyle, int iconSize, Integer forceTintColor, Integer forceBackgroundColor, Integer forceTextColor) {
            return new Configuration(paddingStart, paddingEnd, paddingTop, paddingBottom, internalPaddingTop, internalPaddingBottom, internalPaddingStart, internalPaddingEnd, textStyle, iconSize, forceTintColor, forceBackgroundColor, forceTextColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && Intrinsics.d(this.internalPaddingTop, configuration.internalPaddingTop) && Intrinsics.d(this.internalPaddingBottom, configuration.internalPaddingBottom) && Intrinsics.d(this.internalPaddingStart, configuration.internalPaddingStart) && Intrinsics.d(this.internalPaddingEnd, configuration.internalPaddingEnd) && this.textStyle == configuration.textStyle && this.iconSize == configuration.iconSize && Intrinsics.d(this.forceTintColor, configuration.forceTintColor) && Intrinsics.d(this.forceBackgroundColor, configuration.forceBackgroundColor) && Intrinsics.d(this.forceTextColor, configuration.forceTextColor);
        }

        public final Integer getForceBackgroundColor() {
            return this.forceBackgroundColor;
        }

        public final Integer getForceTextColor() {
            return this.forceTextColor;
        }

        public final Integer getForceTintColor() {
            return this.forceTintColor;
        }

        public final int getIconSize() {
            return this.iconSize;
        }

        public final Integer getInternalPaddingBottom() {
            return this.internalPaddingBottom;
        }

        public final Integer getInternalPaddingEnd() {
            return this.internalPaddingEnd;
        }

        public final Integer getInternalPaddingStart() {
            return this.internalPaddingStart;
        }

        public final Integer getInternalPaddingTop() {
            return this.internalPaddingTop;
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

        public final int getTextStyle() {
            return this.textStyle;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31);
            Integer num = this.internalPaddingTop;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.internalPaddingBottom;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.internalPaddingStart;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.internalPaddingEnd;
            int a12 = C2454a.a(this.iconSize, C2454a.a(this.textStyle, (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31, 31), 31);
            Integer num5 = this.forceTintColor;
            int hashCode4 = (a12 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.forceBackgroundColor;
            int hashCode5 = (hashCode4 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.forceTextColor;
            return hashCode5 + (num7 != null ? num7.hashCode() : 0);
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
            Integer num = this.internalPaddingTop;
            Integer num2 = this.internalPaddingBottom;
            Integer num3 = this.internalPaddingStart;
            Integer num4 = this.internalPaddingEnd;
            int i15 = this.textStyle;
            int i16 = this.iconSize;
            Integer num5 = this.forceTintColor;
            Integer num6 = this.forceBackgroundColor;
            Integer num7 = this.forceTextColor;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", internalPaddingTop=", a11);
            c.e(a11, num, ", internalPaddingBottom=", num2, ", internalPaddingStart=");
            c.e(a11, num3, ", internalPaddingEnd=", num4, ", textStyle=");
            a.f(i15, i16, ", iconSize=", ", forceTintColor=", a11);
            c.e(a11, num5, ", forceBackgroundColor=", num6, ", forceTextColor=");
            return Ep.a.c(a11, num7, ")");
        }

        public Configuration(int i11, int i12, int i13, int i14, Integer num, Integer num2, Integer num3, Integer num4, int i15, int i16, Integer num5, Integer num6, Integer num7) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.internalPaddingTop = num;
            this.internalPaddingBottom = num2;
            this.internalPaddingStart = num3;
            this.internalPaddingEnd = num4;
            this.textStyle = i15;
            this.iconSize = i16;
            this.forceTintColor = num5;
            this.forceBackgroundColor = num6;
            this.forceTextColor = num7;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, Integer num, Integer num2, Integer num3, Integer num4, int i15, int i16, Integer num5, Integer num6, Integer num7, int i17, DefaultConstructorMarker defaultConstructorMarker) {
            this((i17 & 1) != 0 ? 16 : i11, (i17 & 2) == 0 ? i12 : 16, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) == 0 ? i14 : 0, (i17 & 16) != 0 ? null : num, (i17 & 32) != 0 ? null : num2, (i17 & 64) != 0 ? null : num3, (i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num4, (i17 & 256) != 0 ? LabelAtomKt.defaultTextStyle : i15, (i17 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 12 : i16, (i17 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : num5, (i17 & 2048) != 0 ? null : num6, (i17 & 4096) != 0 ? null : num7);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelAtom(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyConfig() {
        setPadding(ResourceExtKt.toPx(this.configuration.getPaddingStart()), ResourceExtKt.toPx(this.configuration.getPaddingTop()), ResourceExtKt.toPx(this.configuration.getPaddingEnd()), ResourceExtKt.toPx(this.configuration.getPaddingBottom()));
        ViewGroup.LayoutParams layoutParams = this.binding.imageLabelIv.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = (this.icHPadding * 2) + ResourceExtKt.toPx(this.configuration.getIconSize());
        marginLayoutParams.height = (this.icVPadding * 2) + ResourceExtKt.toPx(this.configuration.getIconSize());
        requestLayout();
    }

    private final void bindImage(Label data) {
        TextView textLabelTv = this.binding.textLabelTv;
        Intrinsics.checkNotNullExpressionValue(textLabelTv, "textLabelTv");
        ViewExtKt.gone(textLabelTv);
        ImageView imageView = this.binding.imageLabelIv;
        Intrinsics.f(imageView);
        ViewExtKt.show(imageView);
        AtomConfig.INSTANCE.getImageLoader().load(imageView, data.getImage());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, data.getTintColor());
        if (parseColor == null) {
            parseColor = this.configuration.getForceTintColor();
        }
        imageView.setImageTintList(parseColor != null ? ColorStateList.valueOf(parseColor.intValue()) : null);
        Drawable background = imageView.getBackground();
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String backgroundColor = data.getBackgroundColor();
        Integer forceBackgroundColor = this.configuration.getForceBackgroundColor();
        background.setColorFilter(styleParser.parseColor(context2, backgroundColor, forceBackgroundColor != null ? forceBackgroundColor.intValue() : R.color.transparent), PorterDuff.Mode.SRC_IN);
    }

    private final void bindText(Label data) {
        ImageView imageLabelIv = this.binding.imageLabelIv;
        Intrinsics.checkNotNullExpressionValue(imageLabelIv, "imageLabelIv");
        ViewExtKt.gone(imageLabelIv);
        TextView textView = this.binding.textLabelTv;
        Intrinsics.f(textView);
        ViewExtKt.show(textView);
        textView.setText(data.getText());
        textView.setTextAppearance(this.configuration.getTextStyle());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String textColor = data.getTextColor();
        Integer forceTextColor = this.configuration.getForceTextColor();
        textView.setTextColor(styleParser.parseColor(context, textColor, forceTextColor != null ? forceTextColor.intValue() : R$color.oz_black));
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String backgroundColor = data.getBackgroundColor();
        Integer forceBackgroundColor = this.configuration.getForceBackgroundColor();
        int parseColor = styleParser.parseColor(context2, backgroundColor, forceBackgroundColor != null ? forceBackgroundColor.intValue() : R.color.transparent);
        textView.getBackground().setColorFilter(parseColor, PorterDuff.Mode.SRC_IN);
        Integer internalPaddingStart = this.configuration.getInternalPaddingStart();
        int px = internalPaddingStart != null ? ResourceExtKt.toPx(internalPaddingStart.intValue()) : getHorizontalPadding(parseColor);
        Integer internalPaddingTop = this.configuration.getInternalPaddingTop();
        int px2 = internalPaddingTop != null ? ResourceExtKt.toPx(internalPaddingTop.intValue()) : this.defaultTextVerticalPadding;
        Integer internalPaddingEnd = this.configuration.getInternalPaddingEnd();
        int px3 = internalPaddingEnd != null ? ResourceExtKt.toPx(internalPaddingEnd.intValue()) : getHorizontalPadding(parseColor);
        Integer internalPaddingBottom = this.configuration.getInternalPaddingBottom();
        textView.setPadding(px, px2, px3, internalPaddingBottom != null ? ResourceExtKt.toPx(internalPaddingBottom.intValue()) : this.defaultTextVerticalPadding);
    }

    private final int getHorizontalPadding(int backgroundColor) {
        if (backgroundColor == 0) {
            return 0;
        }
        return this.defaultTextHorizontalPadding;
    }

    private final Configuration initConfig(TypedArray styledAttrs) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Integer dimensionPixelSize = AttrsExtensionKt.getDimensionPixelSize(styledAttrs, R$styleable.LabelAtom_android_padding);
        if (dimensionPixelSize != null) {
            i11 = Integer.valueOf(ResourceExtKt.toDp(dimensionPixelSize.intValue())).intValue();
            i12 = i11;
            i14 = i12;
            i13 = i14;
        } else {
            i11 = 0;
            i12 = 16;
            i13 = 0;
            i14 = 16;
        }
        Integer dimensionPixelSize2 = AttrsExtensionKt.getDimensionPixelSize(styledAttrs, R$styleable.LabelAtom_android_paddingTop);
        if (dimensionPixelSize2 != null) {
            i11 = ResourceExtKt.toDp(dimensionPixelSize2.intValue());
        }
        int i16 = i11;
        Integer dimensionPixelSize3 = AttrsExtensionKt.getDimensionPixelSize(styledAttrs, R$styleable.LabelAtom_android_paddingStart);
        if (dimensionPixelSize3 != null) {
            i12 = ResourceExtKt.toDp(dimensionPixelSize3.intValue());
        }
        int i17 = i12;
        Integer dimensionPixelSize4 = AttrsExtensionKt.getDimensionPixelSize(styledAttrs, R$styleable.LabelAtom_android_paddingEnd);
        if (dimensionPixelSize4 != null) {
            i14 = ResourceExtKt.toDp(dimensionPixelSize4.intValue());
        }
        int i18 = i14;
        Integer dimensionPixelSize5 = AttrsExtensionKt.getDimensionPixelSize(styledAttrs, R$styleable.LabelAtom_android_paddingBottom);
        if (dimensionPixelSize5 != null) {
            i13 = ResourceExtKt.toDp(dimensionPixelSize5.intValue());
        }
        int i19 = R$styleable.LabelAtom_textStyle;
        i15 = LabelAtomKt.defaultTextStyle;
        return new Configuration(i17, i18, i16, i13, null, null, null, null, styledAttrs.getResourceId(i19, i15), styledAttrs.getInteger(R$styleable.LabelAtom_imageSize, 12), AttrsExtensionKt.getResourceId(styledAttrs, R$styleable.LabelAtom_forceTintColor), AttrsExtensionKt.getResourceId(styledAttrs, R$styleable.LabelAtom_forceBackgroundColor), AttrsExtensionKt.getResourceId(styledAttrs, R$styleable.LabelAtom_forceTextColor), 240, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAction$lambda$3(LabelAtom labelAtom, Function1 function1, View view) {
        Label label = labelAtom.label;
        if (label == null) {
            Intrinsics.n("label");
            throw null;
        }
        AtomActionDTO action = label.getAction();
        if (action != null) {
            Label label2 = labelAtom.label;
            if (label2 == null) {
                Intrinsics.n("label");
                throw null;
            }
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, label2.getTrackingInfo());
            if (atomAction == null || function1 == null) {
                return;
            }
            function1.invoke(atomAction);
        }
    }

    public final void bind(@NotNull Label item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.label = item;
        if (item.getText() != null) {
            bindText(item);
        } else if (item.getImage() != null) {
            bindImage(item);
        }
    }

    @NotNull
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final void onAction(Function1<? super AtomAction, Unit> onAction) {
        setOnClickListener(new Lk.a(1, this, onAction));
    }

    public final void setConfiguration(@NotNull Configuration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.configuration = value;
        applyConfig();
    }

    public /* synthetic */ LabelAtom(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelAtom(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.configuration = new Configuration(0, 0, 0, 0, null, null, null, null, 0, 0, null, null, null, 8191, null);
        int px = ResourceExtKt.toPx(6, context);
        this.icHPadding = px;
        int px2 = ResourceExtKt.toPx(4, context);
        this.icVPadding = px2;
        this.defaultTextHorizontalPadding = ResourceExtKt.toPx(8, context);
        this.defaultTextVerticalPadding = ResourceExtKt.toPx(2, context);
        AtomLabelBinding inflate = AtomLabelBinding.inflate(LayoutInflater.from(context), this);
        this.binding = inflate;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.LabelAtom, i11, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setConfiguration(initConfig(obtainStyledAttributes));
            obtainStyledAttributes.recycle();
        }
        TextView textView = inflate.textLabelTv;
        textView.setBackground(androidx.core.content.a.getDrawable(context, R$drawable.rect_round_white1));
        textView.setIncludeFontPadding(false);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        ImageView imageView = inflate.imageLabelIv;
        imageView.setPadding(px, px2, px, px2);
        imageView.setBackground(androidx.core.content.a.getDrawable(context, R$drawable.rect_round_white1));
    }
}
