package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.data;

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
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.data.CouponGoalsV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO_CouponGoalItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO$CouponGoalItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO$CouponGoalItem;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO$CouponGoalItem;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponGoalsV2DTO_CouponGoalItemJsonAdapter extends JsonAdapter<CouponGoalsV2DTO.CouponGoalItem> {

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public CouponGoalsV2DTO_CouponGoalItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isCompleted", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "badge", "actionText", "progress", "action", "trackingInfo");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isCompleted");
        this.stringAdapter = moshi.f(String.class, m11, "image");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "progress");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(53, "GeneratedJsonAdapter(CouponGoalsV2DTO.CouponGoalItem)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CouponGoalsV2DTO.CouponGoalItem fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        BadgeDTO badgeDTO = null;
        TextDTO textDTO3 = null;
        Integer num = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Boolean bool2 = bool;
            String str2 = str;
            if (!reader.hasNext()) {
                TextDTO textDTO4 = textDTO;
                reader.endObject();
                if (bool2 == null) {
                    throw c.j("isCompleted", "isCompleted", reader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (str2 == null) {
                    throw c.j("image", "image", reader);
                }
                if (textDTO4 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textDTO2 == null) {
                    throw c.j("description", "description", reader);
                }
                if (badgeDTO == null) {
                    throw c.j("badge", "badge", reader);
                }
                if (textDTO3 == null) {
                    throw c.j("actionText", "actionText", reader);
                }
                if (atomActionDTO != null) {
                    return new CouponGoalsV2DTO.CouponGoalItem(booleanValue, str2, textDTO4, textDTO2, badgeDTO, textDTO3, num, atomActionDTO, map);
                }
                throw c.j("action", "action", reader);
            }
            TextDTO textDTO5 = textDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool2;
                    textDTO = textDTO5;
                    str = str2;
                case 0:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isCompleted", "isCompleted", reader);
                    }
                    textDTO = textDTO5;
                    str = str2;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("image", "image", reader);
                    }
                    bool = bool2;
                    textDTO = textDTO5;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    bool = bool2;
                    str = str2;
                case 3:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("description", "description", reader);
                    }
                    bool = bool2;
                    textDTO = textDTO5;
                    str = str2;
                case 4:
                    badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO == null) {
                        throw c.q("badge", "badge", reader);
                    }
                    bool = bool2;
                    textDTO = textDTO5;
                    str = str2;
                case 5:
                    textDTO3 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO3 == null) {
                        throw c.q("actionText", "actionText", reader);
                    }
                    bool = bool2;
                    textDTO = textDTO5;
                    str = str2;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO5;
                    str = str2;
                case 7:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("action", "action", reader);
                    }
                    bool = bool2;
                    textDTO = textDTO5;
                    str = str2;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool2;
                    textDTO = textDTO5;
                    str = str2;
                default:
                    bool = bool2;
                    textDTO = textDTO5;
                    str = str2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CouponGoalsV2DTO.CouponGoalItem value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isCompleted");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isCompleted()));
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("description");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("badge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("actionText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getActionText());
        writer.w("progress");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getProgress());
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
