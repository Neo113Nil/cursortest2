package ru.ozon.uni.atoms.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006,"}, d2 = {"Lru/ozon/uni/atoms/data/AtomTypeImpl;", "Lru/ozon/uni/atoms/data/AtomType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSUPPORTED", "TEXT_ATOM", "PRICE", "PRICE_WITH_DISCOUNT", "PRICE_WITH_POINTS", "RATING", "BADGE", "AVATAR", "TAG", "LINK_TAG", "SMALL_LINK_TAG", "CROSS_TAG", "CROSS_COLOR_TAG", "BUTTON_ICON", "LARGE_ICON_BUTTON", "SMALL_ICON_BUTTON", "LARGE_BUTTON", "LARGE_GRADIENT_BUTTON", "LARGE_BORDERLESS_BUTTON", "SMALL_BUTTON", "RESIZABLE_SMALL_BUTTON", "SMALL_BUTTON_WITH_ICON", "SMALL_BORDERLESS_BUTTON", "SMALL_BORDERLESS_BUTTON_WITH_ICON", "LARGE_PAYMENT_BUTTON", "SMALL_PAYMENT_BUTTON", "GET_BUTTON", "ADD_TO_CART_BUTTON_WITH_QUANTITY", "ADD_TO_CART_BUTTON", "ADD_TO_CART_BUTTON_IMAGE", "ADD_TO_JOINT_PURCHASE_BUTTON", "ADD_TO_CART_WITH_PRICE_BUTTON", "ANNOTATION", "IMAGE", "TOOLTIP", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AtomTypeImpl implements AtomType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AtomTypeImpl[] $VALUES;

    @NotNull
    private final String value;

    @i(name = "unsupported")
    public static final AtomTypeImpl UNSUPPORTED = new AtomTypeImpl("UNSUPPORTED", 0, "unsupported");

    @i(name = "textAtom")
    public static final AtomTypeImpl TEXT_ATOM = new AtomTypeImpl("TEXT_ATOM", 1, "textAtom");

    @i(name = "price")
    public static final AtomTypeImpl PRICE = new AtomTypeImpl("PRICE", 2, "price");

    @i(name = "priceWithDiscount")
    public static final AtomTypeImpl PRICE_WITH_DISCOUNT = new AtomTypeImpl("PRICE_WITH_DISCOUNT", 3, "priceWithDiscount");

    @i(name = "priceWithPoints")
    public static final AtomTypeImpl PRICE_WITH_POINTS = new AtomTypeImpl("PRICE_WITH_POINTS", 4, "priceWithPoints");

    @i(name = "rating")
    public static final AtomTypeImpl RATING = new AtomTypeImpl("RATING", 5, "rating");

    @i(name = "badge")
    public static final AtomTypeImpl BADGE = new AtomTypeImpl("BADGE", 6, "badge");

    @i(name = "avatar")
    public static final AtomTypeImpl AVATAR = new AtomTypeImpl("AVATAR", 7, "avatar");

    @i(name = "tag")
    public static final AtomTypeImpl TAG = new AtomTypeImpl("TAG", 8, "tag");

    @i(name = "linkTag")
    public static final AtomTypeImpl LINK_TAG = new AtomTypeImpl("LINK_TAG", 9, "linkTag");

    @i(name = "smallLinkTag")
    public static final AtomTypeImpl SMALL_LINK_TAG = new AtomTypeImpl("SMALL_LINK_TAG", 10, "smallLinkTag");

    @i(name = "crossTag")
    public static final AtomTypeImpl CROSS_TAG = new AtomTypeImpl("CROSS_TAG", 11, "crossTag");

    @i(name = "crossColorTag")
    public static final AtomTypeImpl CROSS_COLOR_TAG = new AtomTypeImpl("CROSS_COLOR_TAG", 12, "crossColorTag");

    @i(name = "iconButton")
    public static final AtomTypeImpl BUTTON_ICON = new AtomTypeImpl("BUTTON_ICON", 13, "iconButton");

    @i(name = "largeIconButton")
    public static final AtomTypeImpl LARGE_ICON_BUTTON = new AtomTypeImpl("LARGE_ICON_BUTTON", 14, "largeIconButton");

    @i(name = "smallIconButton")
    public static final AtomTypeImpl SMALL_ICON_BUTTON = new AtomTypeImpl("SMALL_ICON_BUTTON", 15, "smallIconButton");

    @i(name = DynamicElementDTO.LARGE_BUTTON)
    public static final AtomTypeImpl LARGE_BUTTON = new AtomTypeImpl("LARGE_BUTTON", 16, DynamicElementDTO.LARGE_BUTTON);

    @i(name = "largeGradientButton")
    public static final AtomTypeImpl LARGE_GRADIENT_BUTTON = new AtomTypeImpl("LARGE_GRADIENT_BUTTON", 17, "largeGradientButton");

    @i(name = "largeBorderlessButton")
    public static final AtomTypeImpl LARGE_BORDERLESS_BUTTON = new AtomTypeImpl("LARGE_BORDERLESS_BUTTON", 18, "largeBorderlessButton");

    @i(name = "smallButton")
    public static final AtomTypeImpl SMALL_BUTTON = new AtomTypeImpl("SMALL_BUTTON", 19, "smallButton");

    @i(name = "resizableSmallButton")
    public static final AtomTypeImpl RESIZABLE_SMALL_BUTTON = new AtomTypeImpl("RESIZABLE_SMALL_BUTTON", 20, "resizableSmallButton");

    @i(name = "smallButtonWithIcon")
    public static final AtomTypeImpl SMALL_BUTTON_WITH_ICON = new AtomTypeImpl("SMALL_BUTTON_WITH_ICON", 21, "smallButtonWithIcon");

    @i(name = DynamicElementDTO.SMALL_BORDERLESS_BUTTON)
    public static final AtomTypeImpl SMALL_BORDERLESS_BUTTON = new AtomTypeImpl("SMALL_BORDERLESS_BUTTON", 22, DynamicElementDTO.SMALL_BORDERLESS_BUTTON);

    @i(name = "smallBorderlessButtonWithIcon")
    public static final AtomTypeImpl SMALL_BORDERLESS_BUTTON_WITH_ICON = new AtomTypeImpl("SMALL_BORDERLESS_BUTTON_WITH_ICON", 23, "smallBorderlessButtonWithIcon");

    @i(name = "largePaymentButton")
    public static final AtomTypeImpl LARGE_PAYMENT_BUTTON = new AtomTypeImpl("LARGE_PAYMENT_BUTTON", 24, "largePaymentButton");

    @i(name = "smallPaymentButton")
    public static final AtomTypeImpl SMALL_PAYMENT_BUTTON = new AtomTypeImpl("SMALL_PAYMENT_BUTTON", 25, "smallPaymentButton");

    @i(name = "getButton")
    public static final AtomTypeImpl GET_BUTTON = new AtomTypeImpl("GET_BUTTON", 26, "getButton");

    @i(name = "addToCartButtonWithQuantity")
    public static final AtomTypeImpl ADD_TO_CART_BUTTON_WITH_QUANTITY = new AtomTypeImpl("ADD_TO_CART_BUTTON_WITH_QUANTITY", 27, "addToCartButtonWithQuantity");

    @i(name = "addToCartButton")
    public static final AtomTypeImpl ADD_TO_CART_BUTTON = new AtomTypeImpl("ADD_TO_CART_BUTTON", 28, "addToCartButton");

    @i(name = "addToCartButtonImage")
    public static final AtomTypeImpl ADD_TO_CART_BUTTON_IMAGE = new AtomTypeImpl("ADD_TO_CART_BUTTON_IMAGE", 29, "addToCartButtonImage");

    @i(name = "addToJointPurchaseButton")
    public static final AtomTypeImpl ADD_TO_JOINT_PURCHASE_BUTTON = new AtomTypeImpl("ADD_TO_JOINT_PURCHASE_BUTTON", 30, "addToJointPurchaseButton");

    @i(name = "addToCartWithPrice")
    public static final AtomTypeImpl ADD_TO_CART_WITH_PRICE_BUTTON = new AtomTypeImpl("ADD_TO_CART_WITH_PRICE_BUTTON", 31, "addToCartWithPrice");

    @i(name = "annotation")
    public static final AtomTypeImpl ANNOTATION = new AtomTypeImpl("ANNOTATION", 32, "annotation");

    @i(name = "image")
    public static final AtomTypeImpl IMAGE = new AtomTypeImpl("IMAGE", 33, "image");

    @i(name = "tooltip")
    public static final AtomTypeImpl TOOLTIP = new AtomTypeImpl("TOOLTIP", 34, "tooltip");

    private static final /* synthetic */ AtomTypeImpl[] $values() {
        return new AtomTypeImpl[]{UNSUPPORTED, TEXT_ATOM, PRICE, PRICE_WITH_DISCOUNT, PRICE_WITH_POINTS, RATING, BADGE, AVATAR, TAG, LINK_TAG, SMALL_LINK_TAG, CROSS_TAG, CROSS_COLOR_TAG, BUTTON_ICON, LARGE_ICON_BUTTON, SMALL_ICON_BUTTON, LARGE_BUTTON, LARGE_GRADIENT_BUTTON, LARGE_BORDERLESS_BUTTON, SMALL_BUTTON, RESIZABLE_SMALL_BUTTON, SMALL_BUTTON_WITH_ICON, SMALL_BORDERLESS_BUTTON, SMALL_BORDERLESS_BUTTON_WITH_ICON, LARGE_PAYMENT_BUTTON, SMALL_PAYMENT_BUTTON, GET_BUTTON, ADD_TO_CART_BUTTON_WITH_QUANTITY, ADD_TO_CART_BUTTON, ADD_TO_CART_BUTTON_IMAGE, ADD_TO_JOINT_PURCHASE_BUTTON, ADD_TO_CART_WITH_PRICE_BUTTON, ANNOTATION, IMAGE, TOOLTIP};
    }

    static {
        AtomTypeImpl[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AtomTypeImpl(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a<AtomTypeImpl> getEntries() {
        return $ENTRIES;
    }

    public static AtomTypeImpl valueOf(String str) {
        return (AtomTypeImpl) Enum.valueOf(AtomTypeImpl.class, str);
    }

    public static AtomTypeImpl[] values() {
        return (AtomTypeImpl[]) $VALUES.clone();
    }

    @Override // ru.ozon.uni.atoms.data.AtomType
    @NotNull
    public String getValue() {
        return this.value;
    }
}
