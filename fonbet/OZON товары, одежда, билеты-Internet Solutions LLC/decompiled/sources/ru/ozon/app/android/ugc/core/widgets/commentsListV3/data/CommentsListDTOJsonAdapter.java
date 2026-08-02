package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

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
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "", "booleanAdapter", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;", "nullableEmptyStateDTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsListDTOJsonAdapter extends JsonAdapter<CommentsListDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CommentsListDTO.EmptyStateDTO> nullableEmptyStateDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public CommentsListDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("itemId", "totalCount", "reviewUuid", SelectionItemFormDTO.TITLE_FIELD_NAME, "countText", "isCommentable", "emptyState", "inputPlaceholder", "inputAnswerPlaceholder", "loadCommentsAction", "createCommentAction", "removeCommentAction", "trackingInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "itemId");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "totalCount");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isCommentable");
        this.nullableEmptyStateDTOAdapter = moshi.f(CommentsListDTO.EmptyStateDTO.class, m11, "emptyState");
        this.nullableStringAdapter = moshi.f(String.class, m11, "inputPlaceholder");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "loadCommentsAction");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "createCommentAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(CommentsListDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommentsListDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        CommentsListDTO.EmptyStateDTO emptyStateDTO = null;
        String str3 = null;
        String str4 = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        AtomActionDTO atomActionDTO3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Integer num2 = num;
            Boolean bool2 = bool;
            String str5 = str;
            String str6 = str2;
            TextDTO textDTO3 = textDTO;
            if (!reader.hasNext()) {
                TextDTO textDTO4 = textDTO2;
                reader.endObject();
                if (str5 == null) {
                    throw c.j("itemId", "itemId", reader);
                }
                if (num2 == null) {
                    throw c.j("totalCount", "totalCount", reader);
                }
                int intValue = num2.intValue();
                if (str6 == null) {
                    throw c.j("reviewUuid", "reviewUuid", reader);
                }
                if (textDTO3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textDTO4 == null) {
                    throw c.j("countText", "countText", reader);
                }
                if (bool2 == null) {
                    throw c.j("isCommentable", "isCommentable", reader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (atomActionDTO != null) {
                    return new CommentsListDTO(str5, intValue, str6, textDTO3, textDTO4, booleanValue, emptyStateDTO, str3, str4, atomActionDTO, atomActionDTO2, atomActionDTO3, map);
                }
                throw c.j("loadCommentsAction", "loadCommentsAction", reader);
            }
            TextDTO textDTO5 = textDTO2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("itemId", "itemId", reader);
                    }
                    num = num2;
                    bool = bool2;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 1:
                    Integer fromJson = this.intAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("totalCount", "totalCount", reader);
                    }
                    num = fromJson;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("reviewUuid", "reviewUuid", reader);
                    }
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                case 3:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                case 4:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("countText", "countText", reader);
                    }
                    num = num2;
                    bool = bool2;
                    str = str5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isCommentable", "isCommentable", reader);
                    }
                    num = num2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 6:
                    emptyStateDTO = this.nullableEmptyStateDTOAdapter.fromJson(reader);
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 9:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("loadCommentsAction", "loadCommentsAction", reader);
                    }
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 10:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 11:
                    atomActionDTO3 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                case 12:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
                default:
                    num = num2;
                    bool = bool2;
                    str = str5;
                    textDTO2 = textDTO5;
                    str2 = str6;
                    textDTO = textDTO3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommentsListDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("itemId");
        this.stringAdapter.mo44toJson(writer, (x) value.getItemId());
        writer.w("totalCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getTotalCount()));
        writer.w("reviewUuid");
        this.stringAdapter.mo44toJson(writer, (x) value.getReviewUuid());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("countText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getCountText());
        writer.w("isCommentable");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isCommentable()));
        writer.w("emptyState");
        this.nullableEmptyStateDTOAdapter.mo44toJson(writer, (x) value.getEmptyState());
        writer.w("inputPlaceholder");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getInputPlaceholder());
        writer.w("inputAnswerPlaceholder");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getInputAnswerPlaceholder());
        writer.w("loadCommentsAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getLoadCommentsAction());
        writer.w("createCommentAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getCreateCommentAction());
        writer.w("removeCommentAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getRemoveCommentAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
