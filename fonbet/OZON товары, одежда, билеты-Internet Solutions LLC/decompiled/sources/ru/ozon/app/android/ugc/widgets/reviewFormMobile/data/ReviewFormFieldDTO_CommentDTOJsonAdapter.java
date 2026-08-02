package ru.ozon.app.android.ugc.widgets.reviewFormMobile.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO_CommentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO$HintDTO;", "nullableListOfHintDTOAdapter", "", "nullableIntAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO$SuggestsDTO;", "nullableSuggestsDTOAdapter", "intAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "", "nullableBooleanAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormFieldDTO_CommentDTOJsonAdapter extends JsonAdapter<ReviewFormFieldDTO.CommentDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<ReviewFormFieldDTO.CommentDTO.HintDTO>> nullableListOfHintDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<ReviewFormFieldDTO.CommentDTO.SuggestsDTO> nullableSuggestsDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ReviewFormFieldDTO_CommentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("uploadKey", HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.VALUE, "hints", "points", "trackingInfo", SuggestionDTO.TYPE_SUGGEST, "maxLines", "minLines", "maxInputLength", "mediaPickerButton", "isHidden");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "uploadKey");
        this.nullableStringAdapter = moshi.f(String.class, m11, HammersV3BodyDTO.PLACEHOLDER);
        this.nullableListOfHintDTOAdapter = moshi.f(D.e(List.class, ReviewFormFieldDTO.CommentDTO.HintDTO.class), m11, "hints");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "points");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableSuggestsDTOAdapter = moshi.f(ReviewFormFieldDTO.CommentDTO.SuggestsDTO.class, m11, SuggestionDTO.TYPE_SUGGEST);
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxLines");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "mediaPickerButton");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isHidden");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(ReviewFormFieldDTO.CommentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewFormFieldDTO.CommentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<ReviewFormFieldDTO.CommentDTO.HintDTO> list = null;
        Integer num3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        ReviewFormFieldDTO.CommentDTO.SuggestsDTO suggestsDTO = null;
        Integer num4 = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        Boolean bool = null;
        while (true) {
            Integer num5 = num;
            Integer num6 = num2;
            String str4 = str;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str4 == null) {
                    throw c.j("uploadKey", "uploadKey", reader);
                }
                if (num5 == null) {
                    throw c.j("maxLines", "maxLines", reader);
                }
                int intValue = num5.intValue();
                if (num6 == null) {
                    throw c.j("minLines", "minLines", reader);
                }
                int intValue2 = num6.intValue();
                if (num4 != null) {
                    return new ReviewFormFieldDTO.CommentDTO(str4, str2, str3, list, num3, map, suggestsDTO, intValue, intValue2, num4.intValue(), iconButtonV3DTO, bool);
                }
                throw c.j("maxInputLength", "maxInputLength", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num5;
                    num2 = num6;
                    str = str4;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("uploadKey", "uploadKey", reader);
                    }
                    num = num5;
                    num2 = num6;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    num = num5;
                    num2 = num6;
                    str = str4;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    num = num5;
                    num2 = num6;
                    str = str4;
                case 3:
                    list = this.nullableListOfHintDTOAdapter.fromJson(reader);
                    num = num5;
                    num2 = num6;
                    str = str4;
                case 4:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    num = num5;
                    num2 = num6;
                    str = str4;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num5;
                    num2 = num6;
                    str = str4;
                case 6:
                    suggestsDTO = this.nullableSuggestsDTOAdapter.fromJson(reader);
                    num = num5;
                    num2 = num6;
                    str = str4;
                case 7:
                    Integer fromJson = this.intAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("maxLines", "maxLines", reader);
                    }
                    num = fromJson;
                    num2 = num6;
                    str = str4;
                case 8:
                    Integer fromJson2 = this.intAdapter.fromJson(reader);
                    if (fromJson2 == null) {
                        throw c.q("minLines", "minLines", reader);
                    }
                    num2 = fromJson2;
                    num = num5;
                    str = str4;
                case 9:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw c.q("maxInputLength", "maxInputLength", reader);
                    }
                    num = num5;
                    num2 = num6;
                    str = str4;
                case 10:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    num = num5;
                    num2 = num6;
                    str = str4;
                case 11:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    num = num5;
                    num2 = num6;
                    str = str4;
                default:
                    num = num5;
                    num2 = num6;
                    str = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewFormFieldDTO.CommentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("uploadKey");
        this.stringAdapter.mo44toJson(writer, (x) value.getUploadKey());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("hints");
        this.nullableListOfHintDTOAdapter.mo44toJson(writer, (x) value.getHints());
        writer.w("points");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPoints());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w(SuggestionDTO.TYPE_SUGGEST);
        this.nullableSuggestsDTOAdapter.mo44toJson(writer, (x) value.getSuggests());
        writer.w("maxLines");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxLines()));
        writer.w("minLines");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMinLines()));
        writer.w("maxInputLength");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxInputLength()));
        writer.w("mediaPickerButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getMediaPickerButton());
        writer.w("isHidden");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isHidden());
        writer.p();
    }
}
