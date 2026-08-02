package ru.ozon.app.android.messenger.widgets.chatList.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.messenger.widgets.chatList.data.ChatListDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "<unused var>", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatListConfig$parser$1 extends AbstractC7737t implements Function2<String, String, List<? extends Object>> {
    final /* synthetic */ JsonParser $deserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatListConfig$parser$1(JsonParser jsonParser) {
        super(2);
        this.$deserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<Object> invoke(String str, String str2) {
        JsonParser jsonParser = this.$deserializer;
        Intrinsics.f(str2);
        return ((ChatListDTO) jsonParser.fromJson(str2, ChatListDTO.class)).getBlocks();
    }
}
