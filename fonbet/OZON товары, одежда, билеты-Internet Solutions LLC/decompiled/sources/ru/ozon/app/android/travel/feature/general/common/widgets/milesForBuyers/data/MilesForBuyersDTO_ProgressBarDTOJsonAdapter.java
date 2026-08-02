package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO_ProgressBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressBarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersDTO$ProgressDTO;", "progressDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersDTO_ProgressBarDTOJsonAdapter extends JsonAdapter<MilesForBuyersDTO.ProgressBarDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<MilesForBuyersDTO.ProgressDTO> progressDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public MilesForBuyersDTO_ProgressBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "progressBar", "progressBarDescription", "rightImage", "common", "borderColor", "subtitleBadge");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.progressDTOAdapter = moshi.f(MilesForBuyersDTO.ProgressDTO.class, m11, "progressBar");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "progressBarDescription");
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "rightImage");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableStringAdapter = moshi.f(String.class, m11, "borderColor");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "subtitleBadge");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(MilesForBuyersDTO.ProgressBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MilesForBuyersDTO.ProgressBarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        MilesForBuyersDTO.ProgressDTO progressDTO = null;
        TextDTO textDTO3 = null;
        ImageDTO imageDTO = null;
        CommonControlSettings commonControlSettings = null;
        String str = null;
        BadgeDTO badgeDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    break;
                case 2:
                    progressDTO = this.progressDTOAdapter.fromJson(reader);
                    if (progressDTO == null) {
                        throw c.q("progressBar", "progressBar", reader);
                    }
                    break;
                case 3:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("rightImage", "rightImage", reader);
                    }
                    break;
                case 5:
                    commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings == null) {
                        throw c.q("common", "common", reader);
                    }
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (textDTO2 == null) {
            throw c.j("subtitle", "subtitle", reader);
        }
        if (progressDTO == null) {
            throw c.j("progressBar", "progressBar", reader);
        }
        if (imageDTO == null) {
            throw c.j("rightImage", "rightImage", reader);
        }
        if (commonControlSettings != null) {
            return new MilesForBuyersDTO.ProgressBarDTO(textDTO, textDTO2, progressDTO, textDTO3, imageDTO, commonControlSettings, str, badgeDTO);
        }
        throw c.j("common", "common", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MilesForBuyersDTO.ProgressBarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("progressBar");
        this.progressDTOAdapter.mo44toJson(writer, (x) value.getProgressBar());
        writer.w("progressBarDescription");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getProgressBarDescription());
        writer.w("rightImage");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getRightImage());
        writer.w("common");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("subtitleBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getSubtitleBadge());
        writer.p();
    }
}
