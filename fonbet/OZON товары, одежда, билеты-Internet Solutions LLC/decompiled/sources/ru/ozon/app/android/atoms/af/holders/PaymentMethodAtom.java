package ru.ozon.app.android.atoms.af.holders;

import Am.C2438a;
import B0.C2454a;
import Ef0.c;
import Ek.a;
import K00.b;
import Sc.InterfaceC3999a;
import android.content.Context;
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
import ru.ozon.app.android.atoms.data.deprecated.PaymentMethod;
import ru.ozon.app.android.atoms.databinding.AtomPaymentMethodBinding;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0002H\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/PaymentMethodAtom;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/data/deprecated/PaymentMethod;", "Lru/ozon/app/android/atoms/af/holders/PaymentMethodAtom$Configuration;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomPaymentMethodBinding;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "getDefaultConfigurations", "()Ljava/util/Map;", "onConfigureView", "", "configuration", "onLayoutParamsChanged", "lp", "Landroid/view/ViewGroup$MarginLayoutParams;", "onBind", "item", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentMethodAtom extends Atom<PaymentMethod, Configuration> {

    @NotNull
    private final AtomPaymentMethodBinding binding;

    @NotNull
    private final Map<Atom.ConfCondition, Configuration> defaultConfigurations;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b&\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b'\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b(\u0010\u0012¨\u0006)"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/PaymentMethodAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "titleStyle", "subTitleStyle", "iconWidth", "iconHeight", "textIndent", "<init>", "(IIIILjava/lang/Integer;Ljava/lang/Integer;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "Ljava/lang/Integer;", "getTitleStyle", "()Ljava/lang/Integer;", "getSubTitleStyle", "getIconWidth", "getIconHeight", "getTextIndent", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final int iconHeight;
        private final int iconWidth;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;
        private final Integer subTitleStyle;
        private final int textIndent;
        private final Integer titleStyle;

        public Configuration() {
            this(0, 0, 0, 0, null, null, 0, 0, 0, 511, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && Intrinsics.d(this.titleStyle, configuration.titleStyle) && Intrinsics.d(this.subTitleStyle, configuration.subTitleStyle) && this.iconWidth == configuration.iconWidth && this.iconHeight == configuration.iconHeight && this.textIndent == configuration.textIndent;
        }

        public final int getIconHeight() {
            return this.iconHeight;
        }

        public final int getIconWidth() {
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

        public final Integer getSubTitleStyle() {
            return this.subTitleStyle;
        }

        public final int getTextIndent() {
            return this.textIndent;
        }

        public final Integer getTitleStyle() {
            return this.titleStyle;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31);
            Integer num = this.titleStyle;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.subTitleStyle;
            return Integer.hashCode(this.textIndent) + C2454a.a(this.iconHeight, C2454a.a(this.iconWidth, (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31), 31);
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
            Integer num = this.titleStyle;
            Integer num2 = this.subTitleStyle;
            int i15 = this.iconWidth;
            int i16 = this.iconHeight;
            int i17 = this.textIndent;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", titleStyle=", a11);
            c.e(a11, num, ", subTitleStyle=", num2, ", iconWidth=");
            a.f(i15, i16, ", iconHeight=", ", textIndent=", a11);
            return b.e(i17, ")", a11);
        }

        public Configuration(int i11, int i12, int i13, int i14, Integer num, Integer num2, int i15, int i16, int i17) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.titleStyle = num;
            this.subTitleStyle = num2;
            this.iconWidth = i15;
            this.iconHeight = i16;
            this.textIndent = i17;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, Integer num, Integer num2, int i15, int i16, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
            this((i18 & 1) != 0 ? 16 : i11, (i18 & 2) != 0 ? 16 : i12, (i18 & 4) != 0 ? 10 : i13, (i18 & 8) != 0 ? 10 : i14, (i18 & 16) != 0 ? null : num, (i18 & 32) != 0 ? null : num2, (i18 & 64) != 0 ? 45 : i15, (i18 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 30 : i16, (i18 & 256) != 0 ? 60 : i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomPaymentMethodBinding bind = AtomPaymentMethodBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(PaymentMethod.class, null, 2, null), new Configuration(0, 0, 0, 0, null, null, 0, 0, 0, 511, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PaymentMethodAtom paymentMethodAtom, View view) {
        PaymentMethod data = paymentMethodAtom.getData();
        paymentMethodAtom.handleAction(AtomActionMapperKt.toAtomAction$default(data.getAction(), data, data.getTrackingInfo(), null, 4, null));
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
            this.binding.subTitleTv.getLayoutParams().width = 0;
        } else {
            this.binding.titleTv.getLayoutParams().width = -2;
            this.binding.subTitleTv.getLayoutParams().width = -2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull PaymentMethod item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ClickableCiewKt.switchClickable(getContainerView(), true);
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
        this.binding.titleTv.setText(item.getText());
        TextView textView = this.binding.subTitleTv;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getSubtextColor());
        if (parseColor != null) {
            textView.setTextColor(parseColor.intValue());
        }
        TextViewExtKt.setTextOrGone(textView, item.getSubtext());
        View checkboxV = this.binding.checkboxV;
        Intrinsics.checkNotNullExpressionValue(checkboxV, "checkboxV");
        ViewExtKt.showOrGone(checkboxV, item.isSelected());
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            sendViewAnalytics(trackingInfo);
        }
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
        Integer titleStyle = configuration.getTitleStyle();
        if (titleStyle != null) {
            this.binding.titleTv.setTextAppearance(titleStyle.intValue());
        }
        Integer subTitleStyle = configuration.getSubTitleStyle();
        if (subTitleStyle != null) {
            this.binding.subTitleTv.setTextAppearance(subTitleStyle.intValue());
        }
        this.binding.textGuideline.a(ResourceExtKt.toPx(configuration.getTextIndent()));
        ViewGroup.LayoutParams layoutParams = this.binding.iconIv.getLayoutParams();
        layoutParams.width = ResourceExtKt.toPx(configuration.getIconWidth());
        layoutParams.height = ResourceExtKt.toPx(configuration.getIconHeight());
        View view = this.binding.checkboxV;
        view.setSelected(true);
        view.setEnabled(true);
        getContainerView().requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentMethodAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_payment_method, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        getContainerView().setOnClickListener(new GS.a(this, 2));
    }
}
