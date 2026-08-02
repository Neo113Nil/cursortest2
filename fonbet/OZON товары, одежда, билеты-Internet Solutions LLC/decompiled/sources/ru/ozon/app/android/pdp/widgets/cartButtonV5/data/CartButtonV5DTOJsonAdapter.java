package ru.ozon.app.android.pdp.widgets.cartButtonV5.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;", "cartButtonAdapter", "nullableCartButtonAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;", "nullableNotificationBarAdapter", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$RelatedProductsCurtain;", "nullableRelatedProductsCurtainAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5DTOJsonAdapter extends JsonAdapter<CartButtonV5DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV5DTO.CartButton> cartButtonAdapter;
    private volatile Constructor<CartButtonV5DTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV5DTO.CartButton> nullableCartButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV4Dto.NotificationBar> nullableNotificationBarAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV5DTO.RelatedProductsCurtain> nullableRelatedProductsCurtainAdapter;

    @NotNull
    private final n.a options;

    public CartButtonV5DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isStickyTransparent", "stickyCornerRadius", "firstButton", "secondButton", "asyncAction", "notificationBar", "relatedProductsCurtain", "trackingInfo", "isInModal");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isStickyTransparent");
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "stickyCornerRadius");
        this.cartButtonAdapter = moshi.f(CartButtonV5DTO.CartButton.class, m11, "firstButton");
        this.nullableCartButtonAdapter = moshi.f(CartButtonV5DTO.CartButton.class, m11, "secondButton");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "asyncAction");
        this.nullableNotificationBarAdapter = moshi.f(CartButtonV4Dto.NotificationBar.class, m11, "notificationBar");
        this.nullableRelatedProductsCurtainAdapter = moshi.f(CartButtonV5DTO.RelatedProductsCurtain.class, m11, "relatedProductsCurtain");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isInModal");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(CartButtonV5DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartButtonV5DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        CornerRadius cornerRadius = null;
        CartButtonV5DTO.CartButton cartButton = null;
        CartButtonV5DTO.CartButton cartButton2 = null;
        AtomActionDTO atomActionDTO = null;
        CartButtonV4Dto.NotificationBar notificationBar = null;
        CartButtonV5DTO.RelatedProductsCurtain relatedProductsCurtain = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Boolean bool3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isStickyTransparent", "isStickyTransparent", reader);
                    }
                    i11 = -2;
                    break;
                case 1:
                    cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("stickyCornerRadius", "stickyCornerRadius", reader);
                    }
                    break;
                case 2:
                    cartButton = this.cartButtonAdapter.fromJson(reader);
                    if (cartButton == null) {
                        throw c.q("firstButton", "firstButton", reader);
                    }
                    break;
                case 3:
                    cartButton2 = this.nullableCartButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    notificationBar = this.nullableNotificationBarAdapter.fromJson(reader);
                    break;
                case 6:
                    relatedProductsCurtain = this.nullableRelatedProductsCurtainAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 8:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -2) {
            CartButtonV4Dto.NotificationBar notificationBar2 = notificationBar;
            CartButtonV5DTO.CartButton cartButton3 = cartButton2;
            CornerRadius cornerRadius2 = cornerRadius;
            CartButtonV5DTO.RelatedProductsCurtain relatedProductsCurtain2 = relatedProductsCurtain;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            CartButtonV5DTO.CartButton cartButton4 = cartButton;
            boolean booleanValue = bool2.booleanValue();
            if (cornerRadius2 == null) {
                throw c.j("stickyCornerRadius", "stickyCornerRadius", reader);
            }
            if (cartButton4 != null) {
                return new CartButtonV5DTO(booleanValue, cornerRadius2, cartButton4, cartButton3, atomActionDTO2, notificationBar2, relatedProductsCurtain2, map, bool3);
            }
            throw c.j("firstButton", "firstButton", reader);
        }
        CartButtonV4Dto.NotificationBar notificationBar3 = notificationBar;
        CartButtonV5DTO.RelatedProductsCurtain relatedProductsCurtain3 = relatedProductsCurtain;
        CartButtonV5DTO.CartButton cartButton5 = cartButton2;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        CornerRadius cornerRadius3 = cornerRadius;
        CartButtonV5DTO.CartButton cartButton6 = cartButton;
        Constructor<CartButtonV5DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CartButtonV5DTO.class.getDeclaredConstructor(Boolean.TYPE, CornerRadius.class, CartButtonV5DTO.CartButton.class, CartButtonV5DTO.CartButton.class, AtomActionDTO.class, CartButtonV4Dto.NotificationBar.class, CartButtonV5DTO.RelatedProductsCurtain.class, Map.class, Boolean.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (cornerRadius3 == null) {
            throw c.j("stickyCornerRadius", "stickyCornerRadius", reader);
        }
        if (cartButton6 == null) {
            throw c.j("firstButton", "firstButton", reader);
        }
        CartButtonV5DTO newInstance = constructor.newInstance(bool2, cornerRadius3, cartButton6, cartButton5, atomActionDTO3, notificationBar3, relatedProductsCurtain3, map, bool3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartButtonV5DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isStickyTransparent");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isStickyTransparent()));
        writer.w("stickyCornerRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getStickyCornerRadius());
        writer.w("firstButton");
        this.cartButtonAdapter.mo44toJson(writer, (x) value.getFirstButton());
        writer.w("secondButton");
        this.nullableCartButtonAdapter.mo44toJson(writer, (x) value.getSecondButton());
        writer.w("asyncAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAsyncAction());
        writer.w("notificationBar");
        this.nullableNotificationBarAdapter.mo44toJson(writer, (x) value.getNotificationBar());
        writer.w("relatedProductsCurtain");
        this.nullableRelatedProductsCurtainAdapter.mo44toJson(writer, (x) value.getRelatedProductsCurtain());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("isInModal");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isInModal());
        writer.p();
    }
}
