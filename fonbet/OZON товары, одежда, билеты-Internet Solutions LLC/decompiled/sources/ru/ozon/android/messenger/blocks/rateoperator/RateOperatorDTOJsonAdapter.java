package ru.ozon.android.messenger.blocks.rateoperator;

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
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/android/messenger/blocks/rateoperator/RateOperatorDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/rateoperator/RateOperatorDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/rateoperator/RateOperatorDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/rateoperator/RateOperatorDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/android/messenger/blocks/rateoperator/RateDTO;", "listOfRateDTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lru/ozon/android/messenger/blocks/rateoperator/SuccessStateDTO;", "successStateDTOAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RateOperatorDTOJsonAdapter extends JsonAdapter<RateOperatorDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<RateDTO>> listOfRateDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<SuccessStateDTO> successStateDTOAdapter;

    public RateOperatorDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "rates", "rateMessage", "sendButton", "successState", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<List<RateDTO>> f11 = moshi.f(D.e(List.class, RateDTO.class), m11, "rates");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfRateDTOAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "rateMessage");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<ButtonV3Atom.LargeButton> f13 = moshi.f(ButtonV3Atom.LargeButton.class, m11, "sendButton");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.largeButtonAdapter = f13;
        JsonAdapter<SuccessStateDTO> f14 = moshi.f(SuccessStateDTO.class, m11, "successState");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.successStateDTOAdapter = f14;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f15 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f15;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(37, "GeneratedJsonAdapter(RateOperatorDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RateOperatorDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        List<RateDTO> list = null;
        String str2 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        SuccessStateDTO successStateDTO = null;
        Map<String, MessengerTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    list = this.listOfRateDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw Y9.c.q("rates", "rates", reader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw Y9.c.q("sendButton", "sendButton", reader);
                    }
                    break;
                case 4:
                    successStateDTO = this.successStateDTOAdapter.fromJson(reader);
                    if (successStateDTO == null) {
                        throw Y9.c.q("successState", "successState", reader);
                    }
                    break;
                case 5:
                    map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (list == null) {
            throw Y9.c.j("rates", "rates", reader);
        }
        if (largeButton == null) {
            throw Y9.c.j("sendButton", "sendButton", reader);
        }
        if (successStateDTO != null) {
            return new RateOperatorDTO(str, list, str2, largeButton, successStateDTO, map);
        }
        throw Y9.c.j("successState", "successState", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RateOperatorDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("rates");
        this.listOfRateDTOAdapter.mo44toJson(writer, (x) value_.getRates());
        writer.w("rateMessage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRateMessage());
        writer.w("sendButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value_.getSendButton());
        writer.w("successState");
        this.successStateDTOAdapter.mo44toJson(writer, (x) value_.getSuccessState());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
