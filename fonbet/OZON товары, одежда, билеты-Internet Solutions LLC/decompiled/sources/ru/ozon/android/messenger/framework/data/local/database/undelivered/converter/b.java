package ru.ozon.android.messenger.framework.data.local.database.undelivered.converter;

import com.squareup.moshi.JsonAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonAdapter<CustomBlockDTO> f87555a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.database.core.a f87556b;

    public b(@NotNull JsonAdapter customBlockDTOJsonAdapter, @NotNull ru.ozon.android.messenger.framework.data.local.database.core.a customBlockDTOJsonResolver) {
        Intrinsics.checkNotNullParameter(customBlockDTOJsonAdapter, "customBlockDTOJsonAdapter");
        Intrinsics.checkNotNullParameter(customBlockDTOJsonResolver, "customBlockDTOJsonResolver");
        this.f87555a = customBlockDTOJsonAdapter;
        this.f87556b = customBlockDTOJsonResolver;
    }

    public final UndeliveredMessageEntity.UndeliveredMessage a(@NotNull JsonAdapter<UndeliveredMessageEntity.UndeliveredMessage> jsonAdapter, @NotNull String jsonDto) {
        Intrinsics.checkNotNullParameter(jsonAdapter, "jsonAdapter");
        Intrinsics.checkNotNullParameter(jsonDto, "jsonDto");
        UndeliveredMessageEntity.UndeliveredMessage fromJson = jsonAdapter.fromJson(jsonDto);
        if (!(fromJson instanceof UndeliveredMessageEntity.UndeliveredMessage.Text)) {
            return fromJson;
        }
        UndeliveredMessageEntity.UndeliveredMessage.Text text = (UndeliveredMessageEntity.UndeliveredMessage.Text) fromJson;
        if (text.getCustomBlockDTO() == null) {
            return text;
        }
        String jSONObject = new JSONObject(jsonDto).getJSONObject("customBlockDTO").toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return UndeliveredMessageEntity.UndeliveredMessage.Text.copy$default(text, null, (CustomBlockDTO) this.f87556b.b(this.f87555a, jSONObject), null, null, 13, null);
    }
}
