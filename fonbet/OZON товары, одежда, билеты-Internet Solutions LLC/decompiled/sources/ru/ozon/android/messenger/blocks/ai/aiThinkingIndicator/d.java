package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator;

import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chat.common.h;

/* loaded from: classes10.dex */
public final class d extends h<AiThinkingIndicatorDTO, ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonParser f84069a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, AiThinkingIndicatorDTO> f84070b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.a f84071c;

    /* synthetic */ class a extends C7735q implements Function1<String, AiThinkingIndicatorDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final AiThinkingIndicatorDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (AiThinkingIndicatorDTO) ((JsonParser) this.receiver).fromJson(p02, AiThinkingIndicatorDTO.class);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84069a = deserializer;
        this.f84070b = new a(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f84071c = new ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.a();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 a(e modifier, ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a aVar, ru.ozon.android.messenger.framework.core.d references) {
        ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a blockVO = aVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(references, "references");
        return new C4912a(true, 288582284, new c(blockVO, references));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return this.f84071c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AiThinkingIndicatorDTO> getParser() {
        return this.f84070b;
    }
}
