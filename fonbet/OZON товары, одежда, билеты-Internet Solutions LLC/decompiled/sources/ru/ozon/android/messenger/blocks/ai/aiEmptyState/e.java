package ru.ozon.android.messenger.blocks.ai.aiEmptyState;

import a1.C4912a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chat.common.h;

/* loaded from: classes10.dex */
public final class e extends h<AIEmptyStateDTO, ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonParser f83943a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, AIEmptyStateDTO> f83944b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.ai.aiEmptyState.a f83945c;

    /* synthetic */ class a extends C7735q implements Function1<String, AIEmptyStateDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final AIEmptyStateDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (AIEmptyStateDTO) ((JsonParser) this.receiver).fromJson(p02, AIEmptyStateDTO.class);
        }
    }

    public e(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f83943a = deserializer;
        this.f83944b = new a(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f83945c = new ru.ozon.android.messenger.blocks.ai.aiEmptyState.a();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 a(androidx.compose.ui.e modifier, ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a aVar, ru.ozon.android.messenger.framework.core.d references) {
        ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a blockVO = aVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(references, "references");
        return new C4912a(true, 1581517270, new d(modifier, references, blockVO));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return this.f83945c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AIEmptyStateDTO> getParser() {
        return this.f83944b;
    }
}
