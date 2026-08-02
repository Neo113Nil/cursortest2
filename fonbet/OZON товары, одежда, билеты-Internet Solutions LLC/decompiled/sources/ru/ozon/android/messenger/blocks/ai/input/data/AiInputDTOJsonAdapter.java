package ru.ozon.android.messenger.blocks.ai.input.data;

import Ak.b;
import Y9.c;
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
import ru.ozon.android.messenger.blocks.ai.input.data.AiInputDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO$OutlineColor;", "outlineColorAdapter", "stringAdapter", "Lru/ozon/android/messenger/blocks/ai/input/data/a;", "aiInputModeAdapter", "", "Lru/ozon/android/messenger/blocks/ai/input/data/AiInputButton;", "listOfAiInputButtonAdapter", "Lru/ozon/android/messenger/blocks/ai/input/data/Settings;", "nullableSettingsAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AiInputDTOJsonAdapter extends JsonAdapter<AiInputDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<a> aiInputModeAdapter;

    @NotNull
    private final JsonAdapter<List<AiInputButton>> listOfAiInputButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Settings> nullableSettingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<AiInputDTO.OutlineColor> outlineColorAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public AiInputDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", HammersV3BodyDTO.PLACEHOLDER, "outlineColors", "cursorColor", "mode", "iconButtons", "settings", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<TextDTO> f11 = moshi.f(TextDTO.class, m11, HammersV3BodyDTO.PLACEHOLDER);
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.textDTOAdapter = f11;
        JsonAdapter<AiInputDTO.OutlineColor> f12 = moshi.f(AiInputDTO.OutlineColor.class, m11, "outlineColors");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.outlineColorAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "cursorColor");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.stringAdapter = f13;
        JsonAdapter<a> f14 = moshi.f(a.class, m11, "mode");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.aiInputModeAdapter = f14;
        JsonAdapter<List<AiInputButton>> f15 = moshi.f(D.e(List.class, AiInputButton.class), m11, "iconButtons");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.listOfAiInputButtonAdapter = f15;
        JsonAdapter<Settings> f16 = moshi.f(Settings.class, m11, "settings");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableSettingsAdapter = f16;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(AiInputDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AiInputDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        TextDTO textDTO = null;
        AiInputDTO.OutlineColor outlineColor = null;
        String str2 = null;
        a aVar = null;
        List<AiInputButton> list = null;
        Settings settings = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                    }
                    break;
                case 2:
                    outlineColor = this.outlineColorAdapter.fromJson(reader);
                    if (outlineColor == null) {
                        throw c.q("outlineColors", "outlineColors", reader);
                    }
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("cursorColor", "cursorColor", reader);
                    }
                    break;
                case 4:
                    aVar = this.aiInputModeAdapter.fromJson(reader);
                    if (aVar == null) {
                        throw c.q("mode", "mode", reader);
                    }
                    break;
                case 5:
                    list = this.listOfAiInputButtonAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("iconButtons", "iconButtons", reader);
                    }
                    break;
                case 6:
                    settings = this.nullableSettingsAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw c.j(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
        }
        if (outlineColor == null) {
            throw c.j("outlineColors", "outlineColors", reader);
        }
        if (str2 == null) {
            throw c.j("cursorColor", "cursorColor", reader);
        }
        if (aVar == null) {
            throw c.j("mode", "mode", reader);
        }
        if (list != null) {
            return new AiInputDTO(str, textDTO, outlineColor, str2, aVar, list, settings, map);
        }
        throw c.j("iconButtons", "iconButtons", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AiInputDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getPlaceholder());
        writer.w("outlineColors");
        this.outlineColorAdapter.mo44toJson(writer, (x) value_.getOutlineColors());
        writer.w("cursorColor");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCursorColor());
        writer.w("mode");
        this.aiInputModeAdapter.mo44toJson(writer, (x) value_.getMode());
        writer.w("iconButtons");
        this.listOfAiInputButtonAdapter.mo44toJson(writer, (x) value_.getIconButtons());
        writer.w("settings");
        this.nullableSettingsAdapter.mo44toJson(writer, (x) value_.getSettings());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
