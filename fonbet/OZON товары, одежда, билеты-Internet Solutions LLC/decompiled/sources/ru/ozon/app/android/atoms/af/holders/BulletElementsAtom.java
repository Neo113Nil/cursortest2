package ru.ozon.app.android.atoms.af.holders;

import Am.C2438a;
import B0.C2454a;
import C.o0;
import Ek.a;
import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.BulletElements;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.databinding.AtomBulletElementsBinding;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0002H\u0014J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007H\u0002J\u0012\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/BulletElementsAtom;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements;", "Lru/ozon/app/android/atoms/af/holders/BulletElementsAtom$Configuration;", "view", "Landroid/view/View;", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Lru/ozon/app/android/atoms/databinding/AtomBulletElementsBinding;", "defaultConfigurations", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "getDefaultConfigurations", "()Ljava/util/Map;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "onConfigureView", "", "configuration", "onBind", "item", "makeItem", "Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "style", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "selectTextColor", "Configuration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BulletElementsAtom extends Atom<BulletElements, Configuration> {
    private AtomsAdapter adapter;

    @NotNull
    private final AtomBulletElementsBinding binding;

    @NotNull
    private final Map<Atom.ConfCondition, Configuration> defaultConfigurations;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u001eR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u001eR\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b%\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b&\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b'\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b(\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u0010\u0013¨\u00061"}, d2 = {"Lru/ozon/app/android/atoms/af/holders/BulletElementsAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "itemPaddingStart", "itemPaddingEnd", "bulletDrawable", "itemTextIndent", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;", "overrideStyle", "textStyle", "", "itemTextColor", "<init>", "(IIIIIIIILru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "getItemPaddingStart", "getItemPaddingEnd", "getBulletDrawable", "getItemTextIndent", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;", "getOverrideStyle", "()Lru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;", "Ljava/lang/Integer;", "getTextStyle", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getItemTextColor", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final int bulletDrawable;
        private final int itemPaddingEnd;
        private final int itemPaddingStart;
        private final String itemTextColor;
        private final int itemTextIndent;
        private final BulletElements.BulletStyle overrideStyle;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;
        private final Integer textStyle;

        public Configuration() {
            this(0, 0, 0, 0, 0, 0, 0, 0, null, null, null, 2047, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.itemPaddingStart == configuration.itemPaddingStart && this.itemPaddingEnd == configuration.itemPaddingEnd && this.bulletDrawable == configuration.bulletDrawable && this.itemTextIndent == configuration.itemTextIndent && this.overrideStyle == configuration.overrideStyle && Intrinsics.d(this.textStyle, configuration.textStyle) && Intrinsics.d(this.itemTextColor, configuration.itemTextColor);
        }

        public final int getBulletDrawable() {
            return this.bulletDrawable;
        }

        public final int getItemPaddingEnd() {
            return this.itemPaddingEnd;
        }

        public final int getItemPaddingStart() {
            return this.itemPaddingStart;
        }

        public final String getItemTextColor() {
            return this.itemTextColor;
        }

        public final int getItemTextIndent() {
            return this.itemTextIndent;
        }

        public final BulletElements.BulletStyle getOverrideStyle() {
            return this.overrideStyle;
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

        public final Integer getTextStyle() {
            return this.textStyle;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.itemTextIndent, C2454a.a(this.bulletDrawable, C2454a.a(this.itemPaddingEnd, C2454a.a(this.itemPaddingStart, C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31), 31), 31), 31), 31);
            BulletElements.BulletStyle bulletStyle = this.overrideStyle;
            int hashCode = (a11 + (bulletStyle == null ? 0 : bulletStyle.hashCode())) * 31;
            Integer num = this.textStyle;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.itemTextColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
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
            int i15 = this.itemPaddingStart;
            int i16 = this.itemPaddingEnd;
            int i17 = this.bulletDrawable;
            int i18 = this.itemTextIndent;
            BulletElements.BulletStyle bulletStyle = this.overrideStyle;
            Integer num = this.textStyle;
            String str = this.itemTextColor;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", itemPaddingStart=", a11);
            a.f(i15, i16, ", itemPaddingEnd=", ", bulletDrawable=", a11);
            a.f(i17, i18, ", itemTextIndent=", ", overrideStyle=", a11);
            a11.append(bulletStyle);
            a11.append(", textStyle=");
            a11.append(num);
            a11.append(", itemTextColor=");
            return o0.c(a11, str, ")");
        }

        public Configuration(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, BulletElements.BulletStyle bulletStyle, Integer num, String str) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.itemPaddingStart = i15;
            this.itemPaddingEnd = i16;
            this.bulletDrawable = i17;
            this.itemTextIndent = i18;
            this.overrideStyle = bulletStyle;
            this.textStyle = num;
            this.itemTextColor = str;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, BulletElements.BulletStyle bulletStyle, Integer num, String str, int i19, DefaultConstructorMarker defaultConstructorMarker) {
            this((i19 & 1) != 0 ? 16 : i11, (i19 & 2) != 0 ? 16 : i12, (i19 & 4) != 0 ? 0 : i13, (i19 & 8) != 0 ? 0 : i14, (i19 & 16) != 0 ? 0 : i15, (i19 & 32) != 0 ? 0 : i16, (i19 & 64) != 0 ? R$drawable.bullet : i17, (i19 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 16 : i18, (i19 & 256) != 0 ? null : bulletStyle, (i19 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num, (i19 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BulletElements.BulletStyle.values().length];
            try {
                iArr[BulletElements.BulletStyle.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BulletElements.BulletStyle.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletElementsAtom(@NotNull View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        AtomBulletElementsBinding bind = AtomBulletElementsBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultConfigurations = U.i(new Pair(new Atom.ConfCondition(BulletElements.class, null, 2, null), new Configuration(0, 0, 0, 0, 0, 0, 0, 0, null, null, null, 2047, null)));
    }

    private final CommonText makeItem(BulletElements.BulletStyle style, OzonSpannableString text, String textColor) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i11 == 1) {
            return new CommonText.TextSmall(null, null, text, null, textColor, null, null, null, null, null, 1003, null);
        }
        if (i11 == 2) {
            return new CommonText.TextMedium(null, null, text, null, textColor, null, null, null, null, null, 1003, null);
        }
        throw new o();
    }

    private final String selectTextColor(String textColor) {
        if (textColor != null || getCurrentConfiguration().getItemTextColor() == null) {
            return textColor == null ? CommonText.TextMedium.DEFAULT_TEXT_COLOR : textColor;
        }
        String itemTextColor = getCurrentConfiguration().getItemTextColor();
        Intrinsics.f(itemTextColor);
        return itemTextColor;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, Configuration> getDefaultConfigurations() {
        return this.defaultConfigurations;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull BulletElements item) {
        CommonText makeItem;
        Intrinsics.checkNotNullParameter(item, "item");
        Atom.ConfCondition confCondition = new Atom.ConfCondition(CommonText.TextSmall.class, null, 2, null);
        Integer textStyle = getCurrentConfiguration().getTextStyle();
        Pair pair = new Pair(confCondition, new TextAtom.Configuration(getCurrentConfiguration().getItemPaddingStart(), getCurrentConfiguration().getItemPaddingEnd(), 8, 8, textStyle != null ? textStyle.intValue() : R$style.TextStyle_Body_L, 4, 7, Integer.valueOf(getCurrentConfiguration().getBulletDrawable()), getCurrentConfiguration().getItemTextIndent(), false, false, 0, null, null, 0, 0, null, null, null, 521728, null));
        Atom.ConfCondition confCondition2 = new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null);
        Integer textStyle2 = getCurrentConfiguration().getTextStyle();
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.j(pair, new Pair(confCondition2, new TextAtom.Configuration(getCurrentConfiguration().getItemPaddingStart(), getCurrentConfiguration().getItemPaddingEnd(), 12, 12, textStyle2 != null ? textStyle2.intValue() : R$style.TextStyle_Body_L, 4, 7, Integer.valueOf(getCurrentConfiguration().getBulletDrawable()), getCurrentConfiguration().getItemTextIndent(), false, false, 0, null, null, 0, 0, null, null, null, 521728, null))), null, null, null, 14, null);
        this.adapter = atomsAdapter;
        atomsAdapter.setOnAction(getOnAction());
        VerticalAtomsLayout verticalAtomsLayout = this.binding.itemsVAL;
        AtomsAdapter atomsAdapter2 = this.adapter;
        if (atomsAdapter2 == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        verticalAtomsLayout.setAdapter(atomsAdapter2);
        AtomsAdapter atomsAdapter3 = this.adapter;
        if (atomsAdapter3 == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        Context context = getContext();
        List<BulletElements.Item> items = item.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (BulletElements.Item item2 : items) {
            BulletElements.BulletStyle overrideStyle = getCurrentConfiguration().getOverrideStyle();
            if (overrideStyle == null || (makeItem = makeItem(overrideStyle, item2.getText(), selectTextColor(item.getTextColor()))) == null) {
                makeItem = makeItem(item.getStyle(), item2.getText(), selectTextColor(item.getTextColor()));
            }
            arrayList.add(makeItem);
        }
        atomsAdapter3.bind(context, arrayList);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BulletElementsAtom(@NotNull Context context, String str) {
        this(r3, str);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, R$layout.atom_bullet_elements, null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
    }
}
