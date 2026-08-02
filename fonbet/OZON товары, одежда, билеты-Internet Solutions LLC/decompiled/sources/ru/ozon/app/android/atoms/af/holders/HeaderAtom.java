package ru.ozon.app.android.atoms.af.holders;

import Am.C2438a;
import B0.C2454a;
import Ef0.c;
import Ek.a;
import HY.d;
import J0.P;
import Kk.C3532b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.af.utils.HackedTouchDelegate;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.atoms.databinding.AtomHeaderBinding;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001d\u001e\u001fB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0002H\u0014J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0002H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/atoms/af/holders/HeaderAtom;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/data/deprecated/Header;", "Lru/ozon/app/android/atoms/af/holders/HeaderAtom$Configuration;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomHeaderBinding;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "getDefaultConfigurations", "()Ljava/util/Map;", "onConfigureView", "", "configuration", "onLayoutParamsChanged", "lp", "Landroid/view/ViewGroup$MarginLayoutParams;", "onBind", "item", "sendViewAction", "ButtonTapZonePadding", "Configuration", "DefaultButtonTapZonePadding", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeaderAtom extends Atom<Header, Configuration> {

    @NotNull
    private final AtomHeaderBinding binding;

    @NotNull
    private final Map<Atom.ConfCondition, Configuration> defaultConfigurations;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/HeaderAtom$ButtonTapZonePadding;", "", "", "getLeft", "()I", "left", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ButtonTapZonePadding {
        int getLeft();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u001dR\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b)\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/HeaderAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "iconWidth", "iconHeight", "titleStyle", "textVerticalSpace", "", "useButtonForAction", "Lru/ozon/app/android/atoms/af/holders/HeaderAtom$ButtonTapZonePadding;", "buttonTapZonePadding", "<init>", "(IIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IZLru/ozon/app/android/atoms/af/holders/HeaderAtom$ButtonTapZonePadding;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "Ljava/lang/Integer;", "getIconWidth", "()Ljava/lang/Integer;", "getIconHeight", "getTitleStyle", "getTextVerticalSpace", "Z", "getUseButtonForAction", "()Z", "Lru/ozon/app/android/atoms/af/holders/HeaderAtom$ButtonTapZonePadding;", "getButtonTapZonePadding", "()Lru/ozon/app/android/atoms/af/holders/HeaderAtom$ButtonTapZonePadding;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {

        @NotNull
        private final ButtonTapZonePadding buttonTapZonePadding;
        private final Integer iconHeight;
        private final Integer iconWidth;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;
        private final int textVerticalSpace;
        private final Integer titleStyle;
        private final boolean useButtonForAction;

        public Configuration() {
            this(0, 0, 0, 0, null, null, null, 0, false, null, 1023, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && Intrinsics.d(this.iconWidth, configuration.iconWidth) && Intrinsics.d(this.iconHeight, configuration.iconHeight) && Intrinsics.d(this.titleStyle, configuration.titleStyle) && this.textVerticalSpace == configuration.textVerticalSpace && this.useButtonForAction == configuration.useButtonForAction && Intrinsics.d(this.buttonTapZonePadding, configuration.buttonTapZonePadding);
        }

        @NotNull
        public final ButtonTapZonePadding getButtonTapZonePadding() {
            return this.buttonTapZonePadding;
        }

        public final Integer getIconHeight() {
            return this.iconHeight;
        }

        public final Integer getIconWidth() {
            return this.iconWidth;
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

        public final int getTextVerticalSpace() {
            return this.textVerticalSpace;
        }

        public final Integer getTitleStyle() {
            return this.titleStyle;
        }

        public final boolean getUseButtonForAction() {
            return this.useButtonForAction;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31);
            Integer num = this.iconWidth;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.iconHeight;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.titleStyle;
            return this.buttonTapZonePadding.hashCode() + C3532b.a(C2454a.a(this.textVerticalSpace, (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31, 31), 31, this.useButtonForAction);
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
            Integer num = this.iconWidth;
            Integer num2 = this.iconHeight;
            Integer num3 = this.titleStyle;
            int i15 = this.textVerticalSpace;
            boolean z11 = this.useButtonForAction;
            ButtonTapZonePadding buttonTapZonePadding = this.buttonTapZonePadding;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", iconWidth=", a11);
            c.e(a11, num, ", iconHeight=", num2, ", titleStyle=");
            a11.append(num3);
            a11.append(", textVerticalSpace=");
            a11.append(i15);
            a11.append(", useButtonForAction=");
            a11.append(z11);
            a11.append(", buttonTapZonePadding=");
            a11.append(buttonTapZonePadding);
            a11.append(")");
            return a11.toString();
        }

        public Configuration(int i11, int i12, int i13, int i14, Integer num, Integer num2, Integer num3, int i15, boolean z11, @NotNull ButtonTapZonePadding buttonTapZonePadding) {
            Intrinsics.checkNotNullParameter(buttonTapZonePadding, "buttonTapZonePadding");
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.iconWidth = num;
            this.iconHeight = num2;
            this.titleStyle = num3;
            this.textVerticalSpace = i15;
            this.useButtonForAction = z11;
            this.buttonTapZonePadding = buttonTapZonePadding;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, Integer num, Integer num2, Integer num3, int i15, boolean z11, ButtonTapZonePadding buttonTapZonePadding, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? 16 : i11, (i16 & 2) != 0 ? 16 : i12, (i16 & 4) != 0 ? 16 : i13, (i16 & 8) == 0 ? i14 : 16, (i16 & 16) != 0 ? 24 : num, (i16 & 32) != 0 ? 24 : num2, (i16 & 64) != 0 ? null : num3, (i16 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 2 : i15, (i16 & 256) != 0 ? true : z11, (i16 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new DefaultButtonTapZonePadding(0, 0, 0, 0, 15, null) : buttonTapZonePadding);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/HeaderAtom$DefaultButtonTapZonePadding;", "Lru/ozon/app/android/atoms/af/holders/HeaderAtom$ButtonTapZonePadding;", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getTop", "getRight", "getBottom", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DefaultButtonTapZonePadding implements ButtonTapZonePadding {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public DefaultButtonTapZonePadding() {
            this(0, 0, 0, 0, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultButtonTapZonePadding)) {
                return false;
            }
            DefaultButtonTapZonePadding defaultButtonTapZonePadding = (DefaultButtonTapZonePadding) other;
            return this.left == defaultButtonTapZonePadding.left && this.top == defaultButtonTapZonePadding.top && this.right == defaultButtonTapZonePadding.right && this.bottom == defaultButtonTapZonePadding.bottom;
        }

        @Override // ru.ozon.app.android.atoms.af.holders.HeaderAtom.ButtonTapZonePadding
        public int getLeft() {
            return this.left;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.right, C2454a.a(this.top, Integer.hashCode(this.left) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.right, this.bottom, ", bottom=", ")", C2438a.a("DefaultButtonTapZonePadding(left=", this.left, ", top=", ", right=", this.top));
        }

        public DefaultButtonTapZonePadding(int i11, int i12, int i13, int i14) {
            this.left = i11;
            this.top = i12;
            this.right = i13;
            this.bottom = i14;
        }

        public /* synthetic */ DefaultButtonTapZonePadding(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 32 : i11, (i15 & 2) != 0 ? 12 : i12, (i15 & 4) != 0 ? 8 : i13, (i15 & 8) != 0 ? 16 : i14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomHeaderBinding bind = AtomHeaderBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(Header.class, null, 2, 0 == true ? 1 : 0), new Configuration(0, 0, 0, 0, null, null, null, 0, false, null, 1023, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigureView$lambda$4(HeaderAtom headerAtom, View view) {
        Header data = headerAtom.getData();
        AtomActionDTO action = data.getAction();
        if (action != null) {
            headerAtom.handleAction(AtomActionMapperKt.toAtomAction$default(action, data, data.getTrackingInfo(), null, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigureView$lambda$6(HeaderAtom headerAtom, View view) {
        Header data = headerAtom.getData();
        AtomActionDTO action = data.getAction();
        if (action != null) {
            headerAtom.handleAction(AtomActionMapperKt.toAtomAction$default(action, data, data.getTrackingInfo(), null, 4, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigureView$lambda$7(HeaderAtom headerAtom, Configuration configuration) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        headerAtom.getContainerView().getHitRect(rect);
        headerAtom.binding.actionTv.getHitRect(rect2);
        rect2.left -= ResourceExtKt.toPx(configuration.getButtonTapZonePadding().getLeft());
        rect2.top = 0;
        rect2.right = rect.width();
        rect2.bottom = rect.height();
        headerAtom.getContainerView().setTouchDelegate(new HackedTouchDelegate(rect2, headerAtom.binding.actionTv));
    }

    private final void sendViewAction(Header item) {
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            sendViewAnalytics(trackingInfo);
        }
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onLayoutParamsChanged(@NotNull ViewGroup.MarginLayoutParams lp) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        if (lp.width != -2) {
            this.binding.titleTv.getLayoutParams().width = 0;
        } else {
            this.binding.titleTv.getLayoutParams().width = -2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Header item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = this.binding.titleTv;
        Intrinsics.f(textView);
        TextViewExtKt.setTextOrGone(textView, item.getText());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(styleParser.parseColor(context, item.getTextColor(), R$color.oz_semantic_text_primary));
        if (item.getAction() == null) {
            TextView actionTv = this.binding.actionTv;
            Intrinsics.checkNotNullExpressionValue(actionTv, "actionTv");
            ViewExtKt.gone(actionTv);
            ClickableCiewKt.switchClickable(getContainerView(), false);
        } else if (getCurrentConfiguration().getUseButtonForAction()) {
            TextView actionTv2 = this.binding.actionTv;
            Intrinsics.checkNotNullExpressionValue(actionTv2, "actionTv");
            ViewExtKt.show(actionTv2);
            ClickableCiewKt.switchClickable(getContainerView(), false);
        } else {
            TextView actionTv3 = this.binding.actionTv;
            Intrinsics.checkNotNullExpressionValue(actionTv3, "actionTv");
            ViewExtKt.gone(actionTv3);
            ClickableCiewKt.switchClickable(getContainerView(), true);
        }
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ViewExtKt.showOrGone(iconIv, Boolean.valueOf(item.getImage() != null));
        String image = item.getImage();
        if (image != null) {
            ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
            ImageView iconIv2 = this.binding.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
            imageLoader.load(iconIv2, image);
        }
        sendViewAction(item);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
        Integer titleStyle = configuration.getTitleStyle();
        if (titleStyle != null) {
            this.binding.titleTv.setTextAppearance(titleStyle.intValue());
        }
        ViewGroup.LayoutParams layoutParams = this.binding.titleTv.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = ResourceExtKt.toPx(configuration.getTextVerticalSpace());
        marginLayoutParams.bottomMargin = ResourceExtKt.toPx(configuration.getTextVerticalSpace());
        ViewGroup.LayoutParams layoutParams2 = this.binding.iconIv.getLayoutParams();
        Integer iconWidth = configuration.getIconWidth();
        layoutParams2.width = iconWidth != null ? ResourceExtKt.toPx(iconWidth.intValue()) : -2;
        Integer iconHeight = configuration.getIconHeight();
        layoutParams2.height = iconHeight != null ? ResourceExtKt.toPx(iconHeight.intValue()) : -2;
        getContainerView().requestLayout();
        if (configuration.getUseButtonForAction()) {
            this.binding.actionTv.setOnClickListener(new HY.c(this, 1));
        } else {
            getContainerView().setOnClickListener(new d(this, 2));
        }
        getContainerView().post(new BU.a(1, this, configuration));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HeaderAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_header, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
    }
}
