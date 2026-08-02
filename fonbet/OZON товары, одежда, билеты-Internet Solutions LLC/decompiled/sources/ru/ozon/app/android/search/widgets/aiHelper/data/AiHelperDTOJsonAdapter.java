package ru.ozon.app.android.search.widgets.aiHelper.data;

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
import ru.ozon.app.android.search.widgets.aiHelper.data.AiHelperDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Header;", "headerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$AiTextBlock;", "nullableAiTextBlockAdapter", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;", "nullableFooterAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableLongAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiHelperDTOJsonAdapter extends JsonAdapter<AiHelperDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AiHelperDTO.Header> headerAdapter;

    @NotNull
    private final JsonAdapter<AiHelperDTO.AiTextBlock> nullableAiTextBlockAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<AiHelperDTO.Footer> nullableFooterAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public AiHelperDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "aiTextBlock", CommentV3DTO.FOOTER_FIELD_NAME, "pollingAction", "stopAction", "trackingInfo", "pollingIntervalMs", "maxRetries", "redirectUrl", "testInfo");
        M m11 = M.f71699a;
        this.headerAdapter = moshi.f(AiHelperDTO.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableAiTextBlockAdapter = moshi.f(AiHelperDTO.AiTextBlock.class, m11, "aiTextBlock");
        this.nullableFooterAdapter = moshi.f(AiHelperDTO.Footer.class, m11, CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "pollingAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "pollingIntervalMs");
        this.nullableStringAdapter = moshi.f(String.class, m11, "redirectUrl");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(AiHelperDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AiHelperDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AiHelperDTO.Header header = null;
        AiHelperDTO.AiTextBlock aiTextBlock = null;
        AiHelperDTO.Footer footer = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Long l11 = null;
        Long l12 = null;
        String str = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    header = this.headerAdapter.fromJson(reader);
                    if (header == null) {
                        throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    aiTextBlock = this.nullableAiTextBlockAdapter.fromJson(reader);
                    break;
                case 2:
                    footer = this.nullableFooterAdapter.fromJson(reader);
                    break;
                case 3:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 7:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 8:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (header != null) {
            return new AiHelperDTO(header, aiTextBlock, footer, atomActionDTO, atomActionDTO2, map, l11, l12, str, testInfo);
        }
        throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AiHelperDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("aiTextBlock");
        this.nullableAiTextBlockAdapter.mo44toJson(writer, (x) value.getAiTextBlock());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableFooterAdapter.mo44toJson(writer, (x) value.getFooter());
        writer.w("pollingAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getPollingAction());
        writer.w("stopAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getStopAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("pollingIntervalMs");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getPollingIntervalMs());
        writer.w("maxRetries");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getMaxRetries());
        writer.w("redirectUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRedirectUrl());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
