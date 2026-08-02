package ru.ozon.app.android.ugc.widgets.newquestionform.data;

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
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.newquestionform.data.NewQuestionFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableLongAdapter", "Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Header;", "headerAdapter", "nullableHeaderAdapter", "Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO$Input;", "inputAdapter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "nullableCellWithSubtitleToggleAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "nullableLargeBorderlessButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewQuestionFormDTOJsonAdapter extends JsonAdapter<NewQuestionFormDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<NewQuestionFormDTO.Header> headerAdapter;

    @NotNull
    private final JsonAdapter<NewQuestionFormDTO.Input> inputAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> nullableCellWithSubtitleToggleAdapter;

    @NotNull
    private final JsonAdapter<NewQuestionFormDTO.Header> nullableHeaderAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeBorderlessButton> nullableLargeBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public NewQuestionFormDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("productID", "questionID", CommentV3DTO.HEADER_FIELD_NAME, "secondHeader", "input", "anonymousCell", "policyRulesButton", "sendButton", "trackingInfo");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "productId");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "questionId");
        this.headerAdapter = moshi.f(NewQuestionFormDTO.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderAdapter = moshi.f(NewQuestionFormDTO.Header.class, m11, "secondHeader");
        this.inputAdapter = moshi.f(NewQuestionFormDTO.Input.class, m11, "input");
        this.nullableCellWithSubtitleToggleAdapter = moshi.f(CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.class, m11, "anonymousCell");
        this.nullableLargeBorderlessButtonAdapter = moshi.f(ButtonV3Atom.LargeBorderlessButton.class, m11, "policyRulesButton");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "sendButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(NewQuestionFormDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NewQuestionFormDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Long l12 = null;
        NewQuestionFormDTO.Header header = null;
        NewQuestionFormDTO.Header header2 = null;
        NewQuestionFormDTO.Input input = null;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle = null;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = null;
        ButtonV3Atom.LargeButton largeButton = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Long l13 = l11;
            if (!reader.hasNext()) {
                Long l14 = l12;
                reader.endObject();
                if (l13 == null) {
                    throw c.j("productId", "productID", reader);
                }
                long longValue = l13.longValue();
                if (header == null) {
                    throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
                if (input == null) {
                    throw c.j("input", "input", reader);
                }
                if (largeButton != null) {
                    return new NewQuestionFormDTO(longValue, l14, header, header2, input, cellWithSubtitleToggle, largeBorderlessButton, largeButton, map);
                }
                throw c.j("sendButton", "sendButton", reader);
            }
            Long l15 = l12;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    l11 = l13;
                    l12 = l15;
                case 0:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("productId", "productID", reader);
                    }
                    l12 = l15;
                case 1:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    l11 = l13;
                case 2:
                    header = this.headerAdapter.fromJson(reader);
                    if (header == null) {
                        throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                    }
                    l11 = l13;
                    l12 = l15;
                case 3:
                    header2 = this.nullableHeaderAdapter.fromJson(reader);
                    l11 = l13;
                    l12 = l15;
                case 4:
                    input = this.inputAdapter.fromJson(reader);
                    if (input == null) {
                        throw c.q("input", "input", reader);
                    }
                    l11 = l13;
                    l12 = l15;
                case 5:
                    cellWithSubtitleToggle = this.nullableCellWithSubtitleToggleAdapter.fromJson(reader);
                    l11 = l13;
                    l12 = l15;
                case 6:
                    largeBorderlessButton = this.nullableLargeBorderlessButtonAdapter.fromJson(reader);
                    l11 = l13;
                    l12 = l15;
                case 7:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("sendButton", "sendButton", reader);
                    }
                    l11 = l13;
                    l12 = l15;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    l11 = l13;
                    l12 = l15;
                default:
                    l11 = l13;
                    l12 = l15;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NewQuestionFormDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("productID");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getProductId()));
        writer.w("questionID");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getQuestionId());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("secondHeader");
        this.nullableHeaderAdapter.mo44toJson(writer, (x) value.getSecondHeader());
        writer.w("input");
        this.inputAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("anonymousCell");
        this.nullableCellWithSubtitleToggleAdapter.mo44toJson(writer, (x) value.getAnonymousCell());
        writer.w("policyRulesButton");
        this.nullableLargeBorderlessButtonAdapter.mo44toJson(writer, (x) value.getPolicyRulesButton());
        writer.w("sendButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getSendButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
