package ru.ozon.app.android.search.aiMessenger.blocks.markdown.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.data.AIMarkdownDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/aiMessenger/blocks/markdown/data/AIMarkdownDTO;", "state", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AIMarkdownViewMapper$parser$1 extends AbstractC7737t implements Function1<String, AIMarkdownDTO> {
    final /* synthetic */ JsonParser $deserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AIMarkdownViewMapper$parser$1(JsonParser jsonParser) {
        super(1);
        this.$deserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AIMarkdownDTO invoke(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return (AIMarkdownDTO) this.$deserializer.fromJson(state, AIMarkdownDTO.class);
    }
}
