package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

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
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO_CommentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author;", "authorAdapter", "", "nullableListOfCommentDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsDTO_CommentDTOJsonAdapter extends JsonAdapter<CommentsDTO.CommentDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommentsDTO.CommentDTO.Author> authorAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<CommentsDTO.CommentDTO>> nullableListOfCommentDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CommentsDTO_CommentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("commentUuid", "author", "answers", "text", "date", "isPublished", "answerButton", "reportButton", "reportedButton", "deleteButton", "trackingInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "commentUuid");
        this.authorAdapter = moshi.f(CommentsDTO.CommentDTO.Author.class, m11, "author");
        this.nullableListOfCommentDTOAdapter = moshi.f(D.e(List.class, CommentsDTO.CommentDTO.class), m11, "answers");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "text");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isPublished");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "answerButton");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "reportButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(CommentsDTO.CommentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommentsDTO.CommentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        CommentsDTO.CommentDTO.Author author = null;
        List<CommentsDTO.CommentDTO> list = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        ButtonV3DTO buttonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO2 = null;
        IconButtonV3DTO iconButtonV3DTO3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Boolean bool2 = bool;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str == null) {
                    throw c.j("commentUuid", "commentUuid", reader);
                }
                if (author == null) {
                    throw c.j("author", "author", reader);
                }
                if (bool2 != null) {
                    return new CommentsDTO.CommentDTO(str, author, list, textDTO, textDTO2, bool2.booleanValue(), buttonV3DTO, iconButtonV3DTO, iconButtonV3DTO2, iconButtonV3DTO3, map);
                }
                throw c.j("isPublished", "isPublished", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("commentUuid", "commentUuid", reader);
                    }
                    break;
                case 1:
                    author = this.authorAdapter.fromJson(reader);
                    if (author == null) {
                        throw c.q("author", "author", reader);
                    }
                    break;
                case 2:
                    list = this.nullableListOfCommentDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    Boolean fromJson = this.booleanAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("isPublished", "isPublished", reader);
                    }
                    bool = fromJson;
                    continue;
                case 6:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 7:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 8:
                    iconButtonV3DTO2 = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 9:
                    iconButtonV3DTO3 = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
            bool = bool2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommentsDTO.CommentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("commentUuid");
        this.stringAdapter.mo44toJson(writer, (x) value.getCommentUuid());
        writer.w("author");
        this.authorAdapter.mo44toJson(writer, (x) value.getAuthor());
        writer.w("answers");
        this.nullableListOfCommentDTOAdapter.mo44toJson(writer, (x) value.getAnswers());
        writer.w("text");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("date");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDate());
        writer.w("isPublished");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isPublished()));
        writer.w("answerButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getAnswerButton());
        writer.w("reportButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getReportButton());
        writer.w("reportedButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getReportedButton());
        writer.w("deleteButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getDeleteButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
