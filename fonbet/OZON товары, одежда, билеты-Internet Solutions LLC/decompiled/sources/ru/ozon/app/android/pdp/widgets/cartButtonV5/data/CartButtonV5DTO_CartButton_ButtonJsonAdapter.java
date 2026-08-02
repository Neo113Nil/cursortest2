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
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO_CartButton_ButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$AsyncFetchType;", "asyncFetchTypeAdapter", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;", "nullableTooltipAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5DTO_CartButton_ButtonJsonAdapter extends JsonAdapter<CartButtonV5DTO.CartButton.Button> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CartButtonV5DTO.CartButton.Button.AsyncFetchType> asyncFetchTypeAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CartButtonV5DTO.CartButton.Button> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV5DTO.CartButton.Button.Tooltip> nullableTooltipAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public CartButtonV5DTO_CartButton_ButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "cornerRadius", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "icon", "isNonIcon", "badge", "action", "trackingInfo", "animationSubtitle", "asyncFetchType", "borderColor", "showBorder", "tooltip");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "subtitle");
        this.nullableIconAdapter = moshi.f(Icon.class, m11, "icon");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isNonIcon");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.asyncFetchTypeAdapter = moshi.f(CartButtonV5DTO.CartButton.Button.AsyncFetchType.class, m11, "asyncFetchType");
        this.nullableTooltipAdapter = moshi.f(CartButtonV5DTO.CartButton.Button.Tooltip.class, m11, "tooltip");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(CartButtonV5DTO.CartButton.Button)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartButtonV5DTO.CartButton.Button fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        String str = null;
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        TextDTO textDTO = null;
        CartButtonV5DTO.CartButton.Button.AsyncFetchType asyncFetchType = null;
        String str2 = null;
        CornerRadius cornerRadius = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        Icon icon = null;
        BadgeDTO badgeDTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CartButtonV5DTO.CartButton.Button.Tooltip tooltip = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 1:
                    cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("cornerRadius", "cornerRadius", reader);
                    }
                    break;
                case 2:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isNonIcon", "isNonIcon", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    asyncFetchType = this.asyncFetchTypeAdapter.fromJson(reader);
                    if (asyncFetchType == null) {
                        throw c.q("asyncFetchType", "asyncFetchType", reader);
                    }
                    i11 &= -1025;
                    break;
                case 11:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("borderColor", "borderColor", reader);
                    }
                    i11 &= -2049;
                    break;
                case 12:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("showBorder", "showBorder", reader);
                    }
                    i11 &= -4097;
                    break;
                case 13:
                    tooltip = this.nullableTooltipAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -7201) {
            if (str2 == null) {
                throw c.j("backgroundColor", "backgroundColor", reader);
            }
            if (cornerRadius == null) {
                throw c.j("cornerRadius", "cornerRadius", reader);
            }
            if (textDTO2 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            boolean booleanValue = bool2.booleanValue();
            Intrinsics.g(asyncFetchType, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO.CartButton.Button.AsyncFetchType");
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            return new CartButtonV5DTO.CartButton.Button(str2, cornerRadius, textDTO2, textDTO3, icon, booleanValue, badgeDTO, atomActionDTO, map, textDTO, asyncFetchType, str, bool3.booleanValue(), tooltip);
        }
        String str3 = str;
        Constructor<CartButtonV5DTO.CartButton.Button> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = CartButtonV5DTO.CartButton.Button.class.getDeclaredConstructor(String.class, CornerRadius.class, TextDTO.class, TextDTO.class, Icon.class, cls2, BadgeDTO.class, AtomActionDTO.class, Map.class, TextDTO.class, CartButtonV5DTO.CartButton.Button.AsyncFetchType.class, String.class, cls2, CartButtonV5DTO.CartButton.Button.Tooltip.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str2 == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        if (cornerRadius == null) {
            throw c.j("cornerRadius", "cornerRadius", reader);
        }
        if (textDTO2 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        CartButtonV5DTO.CartButton.Button newInstance = constructor.newInstance(str2, cornerRadius, textDTO2, textDTO3, icon, bool2, badgeDTO, atomActionDTO, map, textDTO, asyncFetchType, str3, bool3, tooltip, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartButtonV5DTO.CartButton.Button value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("cornerRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("icon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("isNonIcon");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isNonIcon()));
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("animationSubtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getAnimationSubtitle());
        writer.w("asyncFetchType");
        this.asyncFetchTypeAdapter.mo44toJson(writer, (x) value.getAsyncFetchType());
        writer.w("borderColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("showBorder");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShowBorder()));
        writer.w("tooltip");
        this.nullableTooltipAdapter.mo44toJson(writer, (x) value.getTooltip());
        writer.p();
    }
}
