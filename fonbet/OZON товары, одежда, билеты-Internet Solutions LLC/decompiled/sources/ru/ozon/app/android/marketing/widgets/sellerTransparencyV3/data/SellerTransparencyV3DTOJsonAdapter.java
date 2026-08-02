package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.data.SellerTransparencyV3DTO;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.badgeList.BadgeListDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R(\u00102\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000201\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019¨\u00066"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "nullableSmallIconButtonAdapter", "Lru/ozon/uni/atoms/data/dsBadge/badgeList/BadgeListDTO;", "nullableBadgeListDTOAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "nullableSisBrandFavoriteButtonAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "nullableNotificationDTOAdapter", "", "nullableIntAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableStringAdapter", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/data/SellerTransparencyV3DTO$Paddings;", "nullablePaddingsAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerTransparencyV3DTOJsonAdapter extends JsonAdapter<SellerTransparencyV3DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeListDTO> nullableBadgeListDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO> nullableNotificationDTOAdapter;

    @NotNull
    private final JsonAdapter<SellerTransparencyV3DTO.Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<SisBrandFavoriteButton> nullableSisBrandFavoriteButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> nullableSmallIconButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public SellerTransparencyV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("avatar", "avatarImage", SelectionItemFormDTO.TITLE_FIELD_NAME, "newTitle", "subtitle", "headerAction", "notificationAction", "shareButton", "badges", "defaultFavoriteButton", "activeFavoriteButton", "isFavorite", "favoriteButton", "defaultSubscribeButton", "activeSubscribeButton", "isSubscribe", "subscribeAction", "errorSubscribeNotification", "isNavBarEmbedded", "rightIcon", "hideRightIcon", "rightMargin", "addExtraMargins", "trackingInfo", "infoIcon", "backgroundColor", "paddings", "avatarV2");
        M m11 = M.f71699a;
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "avatar");
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "avatarImage");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "newTitle");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "headerAction");
        this.nullableSmallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "shareButton");
        this.nullableBadgeListDTOAdapter = moshi.f(BadgeListDTO.class, m11, "badges");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isFavorite");
        this.nullableSisBrandFavoriteButtonAdapter = moshi.f(SisBrandFavoriteButton.class, m11, "favoriteButton");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "defaultSubscribeButton");
        this.nullableNotificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "errorSubscribeNotification");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "rightMargin");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullablePaddingsAdapter = moshi.f(SellerTransparencyV3DTO.Paddings.class, m11, "paddings");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(SellerTransparencyV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SellerTransparencyV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconDTO iconDTO = null;
        ImageDTO imageDTO = null;
        TextAtom textAtom = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        BadgeListDTO badgeListDTO = null;
        ButtonV3Atom.SmallIconButton smallIconButton2 = null;
        ButtonV3Atom.SmallIconButton smallIconButton3 = null;
        Boolean bool = null;
        SisBrandFavoriteButton sisBrandFavoriteButton = null;
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        Boolean bool2 = null;
        AtomActionDTO atomActionDTO3 = null;
        NotificationDTO notificationDTO = null;
        Boolean bool3 = null;
        IconDTO iconDTO2 = null;
        Boolean bool4 = null;
        Integer num = null;
        Boolean bool5 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        IconDTO iconDTO3 = null;
        String str = null;
        SellerTransparencyV3DTO.Paddings paddings = null;
        IconDTO iconDTO4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    smallIconButton = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 8:
                    badgeListDTO = this.nullableBadgeListDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    smallIconButton2 = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 10:
                    smallIconButton3 = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 11:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 12:
                    sisBrandFavoriteButton = this.nullableSisBrandFavoriteButtonAdapter.fromJson(reader);
                    break;
                case 13:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 14:
                    buttonV3DTO2 = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 15:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 16:
                    atomActionDTO3 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 17:
                    notificationDTO = this.nullableNotificationDTOAdapter.fromJson(reader);
                    break;
                case 18:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 19:
                    iconDTO2 = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 20:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 21:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 22:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 23:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 24:
                    iconDTO3 = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    iconDTO4 = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new SellerTransparencyV3DTO(iconDTO, imageDTO, textAtom, textDTO, textDTO2, atomActionDTO, atomActionDTO2, smallIconButton, badgeListDTO, smallIconButton2, smallIconButton3, bool, sisBrandFavoriteButton, buttonV3DTO, buttonV3DTO2, bool2, atomActionDTO3, notificationDTO, bool3, iconDTO2, bool4, num, bool5, map, iconDTO3, str, paddings, iconDTO4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SellerTransparencyV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("avatar");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getAvatar());
        writer.w("avatarImage");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getAvatarImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("newTitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getNewTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("headerAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getHeaderAction());
        writer.w("notificationAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getNotificationAction());
        writer.w("shareButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getShareButton());
        writer.w("badges");
        this.nullableBadgeListDTOAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("defaultFavoriteButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getDefaultFavoriteButton());
        writer.w("activeFavoriteButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getActiveFavoriteButton());
        writer.w("isFavorite");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isFavorite());
        writer.w("favoriteButton");
        this.nullableSisBrandFavoriteButtonAdapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("defaultSubscribeButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getDefaultSubscribeButton());
        writer.w("activeSubscribeButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getActiveSubscribeButton());
        writer.w("isSubscribe");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isSubscribe());
        writer.w("subscribeAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getSubscribeAction());
        writer.w("errorSubscribeNotification");
        this.nullableNotificationDTOAdapter.mo44toJson(writer, (x) value.getErrorSubscribeNotification());
        writer.w("isNavBarEmbedded");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isNavBarEmbedded());
        writer.w("rightIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getRightIcon());
        writer.w("hideRightIcon");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHideRightIcon());
        writer.w("rightMargin");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getRightMargin());
        writer.w("addExtraMargins");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getAddExtraMargins());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("infoIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getInfoIcon());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("paddings");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("avatarV2");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getAvatarV2());
        writer.p();
    }
}
