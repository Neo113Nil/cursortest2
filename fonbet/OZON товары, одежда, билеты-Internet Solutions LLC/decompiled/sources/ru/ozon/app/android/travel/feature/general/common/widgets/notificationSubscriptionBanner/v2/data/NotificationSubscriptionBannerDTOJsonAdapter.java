package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.data.NotificationSubscriptionBannerDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTOAdapter", "nullableStringAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$MarginsDTO;", "nullableMarginsDTOAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v2/data/NotificationSubscriptionBannerDTO$RationaleDialogDTO;", "rationaleDialogDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerDTOJsonAdapter extends JsonAdapter<NotificationSubscriptionBannerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO> notificationDTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<NotificationSubscriptionBannerDTO.MarginsDTO> nullableMarginsDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<NotificationSubscriptionBannerDTO.RationaleDialogDTO> rationaleDialogDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public NotificationSubscriptionBannerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "subscribeButton", "subscriptionCompletedButton", "emailSubscriptionControlSettings", "notificationSubscriptionControlSettings", "image", "closeButton", "subscriptionCompletedNotification", "backgroundColor", "borderColor", "layoutMargins", "dialog", "trackingInfo");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "subscribeButton");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "emailSubscriptionControlSettings");
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "closeButton");
        this.notificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "subscriptionCompletedNotification");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableMarginsDTOAdapter = moshi.f(NotificationSubscriptionBannerDTO.MarginsDTO.class, m11, "layoutMargins");
        this.rationaleDialogDTOAdapter = moshi.f(NotificationSubscriptionBannerDTO.RationaleDialogDTO.class, m11, "dialog");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(NotificationSubscriptionBannerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NotificationSubscriptionBannerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        CommonControlSettings commonControlSettings = null;
        CommonControlSettings commonControlSettings2 = null;
        ImageDTO imageDTO = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        NotificationDTO notificationDTO = null;
        String str = null;
        String str2 = null;
        NotificationSubscriptionBannerDTO.MarginsDTO marginsDTO = null;
        NotificationSubscriptionBannerDTO.RationaleDialogDTO rationaleDialogDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            TextDTO textDTO3 = textDTO;
            TextDTO textDTO4 = textDTO2;
            ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
            ButtonV3DTO buttonV3DTO4 = buttonV3DTO2;
            CommonControlSettings commonControlSettings3 = commonControlSettings;
            CommonControlSettings commonControlSettings4 = commonControlSettings2;
            ImageDTO imageDTO2 = imageDTO;
            if (!reader.hasNext()) {
                IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
                reader.endObject();
                if (textDTO3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textDTO4 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (buttonV3DTO3 == null) {
                    throw c.j("subscribeButton", "subscribeButton", reader);
                }
                if (buttonV3DTO4 == null) {
                    throw c.j("subscriptionCompletedButton", "subscriptionCompletedButton", reader);
                }
                if (commonControlSettings3 == null) {
                    throw c.j("emailSubscriptionControlSettings", "emailSubscriptionControlSettings", reader);
                }
                if (commonControlSettings4 == null) {
                    throw c.j("notificationSubscriptionControlSettings", "notificationSubscriptionControlSettings", reader);
                }
                if (imageDTO2 == null) {
                    throw c.j("image", "image", reader);
                }
                if (notificationDTO == null) {
                    throw c.j("subscriptionCompletedNotification", "subscriptionCompletedNotification", reader);
                }
                if (rationaleDialogDTO != null) {
                    return new NotificationSubscriptionBannerDTO(textDTO3, textDTO4, buttonV3DTO3, buttonV3DTO4, commonControlSettings3, commonControlSettings4, imageDTO2, iconButtonV3DTO2, notificationDTO, str, str2, marginsDTO, rationaleDialogDTO, map);
                }
                throw c.j("dialog", "dialog", reader);
            }
            IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 1:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 2:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("subscribeButton", "subscribeButton", reader);
                    }
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 3:
                    buttonV3DTO2 = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO2 == null) {
                        throw c.q("subscriptionCompletedButton", "subscriptionCompletedButton", reader);
                    }
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 4:
                    commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings == null) {
                        throw c.q("emailSubscriptionControlSettings", "emailSubscriptionControlSettings", reader);
                    }
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 5:
                    commonControlSettings2 = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings2 == null) {
                        throw c.q("notificationSubscriptionControlSettings", "notificationSubscriptionControlSettings", reader);
                    }
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    imageDTO = imageDTO2;
                case 6:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("image", "image", reader);
                    }
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                case 7:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 8:
                    notificationDTO = this.notificationDTOAdapter.fromJson(reader);
                    if (notificationDTO == null) {
                        throw c.q("subscriptionCompletedNotification", "subscriptionCompletedNotification", reader);
                    }
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 9:
                    str = this.nullableStringAdapter.fromJson(reader);
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 10:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 11:
                    marginsDTO = this.nullableMarginsDTOAdapter.fromJson(reader);
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 12:
                    rationaleDialogDTO = this.rationaleDialogDTOAdapter.fromJson(reader);
                    if (rationaleDialogDTO == null) {
                        throw c.q("dialog", "dialog", reader);
                    }
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                case 13:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
                default:
                    iconButtonV3DTO = iconButtonV3DTO3;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    buttonV3DTO = buttonV3DTO3;
                    buttonV3DTO2 = buttonV3DTO4;
                    commonControlSettings = commonControlSettings3;
                    commonControlSettings2 = commonControlSettings4;
                    imageDTO = imageDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NotificationSubscriptionBannerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("subscribeButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSubscribeButton());
        writer.w("subscriptionCompletedButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSubscriptionCompletedButton());
        writer.w("emailSubscriptionControlSettings");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getEmailSubscriptionControlSettings());
        writer.w("notificationSubscriptionControlSettings");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getNotificationSubscriptionControlSettings());
        writer.w("image");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("closeButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getCloseButton());
        writer.w("subscriptionCompletedNotification");
        this.notificationDTOAdapter.mo44toJson(writer, (x) value.getSubscriptionCompletedNotification());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("layoutMargins");
        this.nullableMarginsDTOAdapter.mo44toJson(writer, (x) value.getLayoutMargins());
        writer.w("dialog");
        this.rationaleDialogDTOAdapter.mo44toJson(writer, (x) value.getDialog());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
