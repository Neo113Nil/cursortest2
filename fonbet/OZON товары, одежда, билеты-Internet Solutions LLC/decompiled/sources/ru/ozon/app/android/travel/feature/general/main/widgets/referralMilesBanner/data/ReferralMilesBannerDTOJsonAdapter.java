package ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.data;

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
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/data/ReferralMilesBannerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "textDTOAdapter", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "nullableProgressBarAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferralMilesBannerDTOJsonAdapter extends JsonAdapter<ReferralMilesBannerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ProgressBar> nullableProgressBarAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ReferralMilesBannerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "backgroundToken", "image", "bannerTitle", "userTitle", "userSubtitle", "referralTitle", "referralSubtitle", "progressBar", "progressBackgroundColor", "expectedMilesTitle", "expectedMilesIcon", "shareButton", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, "backgroundToken");
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "bannerTitle");
        this.nullableProgressBarAdapter = moshi.f(ProgressBar.class, m11, "progressBar");
        this.nullableStringAdapter = moshi.f(String.class, m11, "progressBackgroundColor");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "expectedMilesIcon");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "shareButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(ReferralMilesBannerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReferralMilesBannerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        String str = null;
        ImageDTO imageDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        TextDTO textDTO4 = null;
        TextDTO textDTO5 = null;
        TextDTO textDTO6 = null;
        ProgressBar progressBar = null;
        String str2 = null;
        TextDTO textDTO7 = null;
        IconDTO iconDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            TextDTO textDTO8 = textDTO;
            String str3 = str;
            ImageDTO imageDTO2 = imageDTO;
            TextDTO textDTO9 = textDTO2;
            if (!reader.hasNext()) {
                TextDTO textDTO10 = textDTO3;
                reader.endObject();
                if (str3 == null) {
                    throw c.j("backgroundToken", "backgroundToken", reader);
                }
                if (imageDTO2 == null) {
                    throw c.j("image", "image", reader);
                }
                if (textDTO9 == null) {
                    throw c.j("bannerTitle", "bannerTitle", reader);
                }
                if (textDTO10 == null) {
                    throw c.j("userTitle", "userTitle", reader);
                }
                if (textDTO5 == null) {
                    throw c.j("referralTitle", "referralTitle", reader);
                }
                if (buttonV3DTO != null) {
                    return new ReferralMilesBannerDTO(textDTO8, str3, imageDTO2, textDTO9, textDTO10, textDTO4, textDTO5, textDTO6, progressBar, str2, textDTO7, iconDTO, buttonV3DTO, map);
                }
                throw c.j("shareButton", "shareButton", reader);
            }
            TextDTO textDTO11 = textDTO3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 0:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundToken", "backgroundToken", reader);
                    }
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 2:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("image", "image", reader);
                    }
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    textDTO2 = textDTO9;
                case 3:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("bannerTitle", "bannerTitle", reader);
                    }
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                case 4:
                    textDTO3 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO3 == null) {
                        throw c.q("userTitle", "userTitle", reader);
                    }
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 5:
                    textDTO4 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 6:
                    textDTO5 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO5 == null) {
                        throw c.q("referralTitle", "referralTitle", reader);
                    }
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 7:
                    textDTO6 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 8:
                    progressBar = this.nullableProgressBarAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 10:
                    textDTO7 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 11:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 12:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("shareButton", "shareButton", reader);
                    }
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                case 13:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
                default:
                    textDTO3 = textDTO11;
                    textDTO = textDTO8;
                    str = str3;
                    imageDTO = imageDTO2;
                    textDTO2 = textDTO9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReferralMilesBannerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("backgroundToken");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundToken());
        writer.w("image");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("bannerTitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getBannerTitle());
        writer.w("userTitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getUserTitle());
        writer.w("userSubtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getUserSubtitle());
        writer.w("referralTitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getReferralTitle());
        writer.w("referralSubtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getReferralSubtitle());
        writer.w("progressBar");
        this.nullableProgressBarAdapter.mo44toJson(writer, (x) value.getProgressBar());
        writer.w("progressBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getProgressBackgroundColor());
        writer.w("expectedMilesTitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getExpectedMilesTitle());
        writer.w("expectedMilesIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getExpectedMilesIcon());
        writer.w("shareButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getShareButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
