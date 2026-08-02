package ru.ozon.android.messenger.blocks.input;

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
import ru.ozon.android.messenger.framework.data.remote.models.ActionCurtainDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R(\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/android/messenger/blocks/input/InputDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/input/InputDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/input/InputDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/input/InputDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "stringAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/android/messenger/blocks/input/ConfigDTO;", "configDTOAdapter", "", "Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;", "nullableListOfCustomBlockDTOAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/ActionCurtainDTO;", "nullableActionCurtainDTOAdapter", "Lru/ozon/android/messenger/blocks/input/SendButtonModeDTO;", "nullableListOfSendButtonModeDTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InputDTOJsonAdapter extends JsonAdapter<InputDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ConfigDTO> configDTOAdapter;

    @NotNull
    private final JsonAdapter<ActionCurtainDTO> nullableActionCurtainDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<CustomBlockDTO>> nullableListOfCustomBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<List<SendButtonModeDTO>> nullableListOfSendButtonModeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public InputDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("isDisabled", HammersV3BodyDTO.PLACEHOLDER, "text", "chatId", "lexemes", "config", "customBlocks", "actionCurtain", "sendButtonModes", "currentModeName");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f7 = moshi.f(Boolean.class, m11, "isDisabled");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableBooleanAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, HammersV3BodyDTO.PLACEHOLDER);
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "chatId");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
        JsonAdapter<Map<String, String>> f13 = moshi.f(D.e(Map.class, String.class, String.class), m11, "lexemes");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f13;
        JsonAdapter<ConfigDTO> f14 = moshi.f(ConfigDTO.class, m11, "config");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.configDTOAdapter = f14;
        JsonAdapter<List<CustomBlockDTO>> f15 = moshi.f(D.e(List.class, CustomBlockDTO.class), m11, "customBlocks");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableListOfCustomBlockDTOAdapter = f15;
        JsonAdapter<ActionCurtainDTO> f16 = moshi.f(ActionCurtainDTO.class, m11, "actionCurtain");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableActionCurtainDTOAdapter = f16;
        JsonAdapter<List<SendButtonModeDTO>> f17 = moshi.f(D.e(List.class, SendButtonModeDTO.class), m11, "sendButtonModes");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableListOfSendButtonModeDTOAdapter = f17;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(30, "GeneratedJsonAdapter(InputDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InputDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map<String, String> map = null;
        ConfigDTO configDTO = null;
        List<CustomBlockDTO> list = null;
        ActionCurtainDTO actionCurtainDTO = null;
        List<SendButtonModeDTO> list2 = null;
        String str4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Y9.c.q("chatId", "chatId", reader);
                    }
                    break;
                case 4:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 5:
                    configDTO = this.configDTOAdapter.fromJson(reader);
                    if (configDTO == null) {
                        throw Y9.c.q("config", "config", reader);
                    }
                    break;
                case 6:
                    list = this.nullableListOfCustomBlockDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    actionCurtainDTO = this.nullableActionCurtainDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    list2 = this.nullableListOfSendButtonModeDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str3 == null) {
            throw Y9.c.j("chatId", "chatId", reader);
        }
        if (configDTO != null) {
            return new InputDTO(bool, str, str2, str3, map, configDTO, list, actionCurtainDTO, list2, str4);
        }
        throw Y9.c.j("config", "config", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InputDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isDisabled());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPlaceholder());
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("chatId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getChatId());
        writer.w("lexemes");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getLexemes());
        writer.w("config");
        this.configDTOAdapter.mo44toJson(writer, (x) value_.getConfig());
        writer.w("customBlocks");
        this.nullableListOfCustomBlockDTOAdapter.mo44toJson(writer, (x) value_.getCustomBlocks());
        writer.w("actionCurtain");
        this.nullableActionCurtainDTOAdapter.mo44toJson(writer, (x) value_.getActionCurtain());
        writer.w("sendButtonModes");
        this.nullableListOfSendButtonModeDTOAdapter.mo44toJson(writer, (x) value_.getSendButtonModes());
        writer.w("currentModeName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCurrentModeName());
        writer.p();
    }
}
