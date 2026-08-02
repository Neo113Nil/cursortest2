package ru.ozon.android.messenger.blocks.ai.aiCellWrapper;

import a1.C4912a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chat.common.h;

/* loaded from: classes10.dex */
public final class e extends h<AICellWrapperDTO, ru.ozon.android.messenger.blocks.ai.aiCellWrapper.presentation.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, AICellWrapperDTO> f83934a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.ai.aiCellWrapper.a f83935b;

    /* synthetic */ class a extends C7735q implements Function1<String, AICellWrapperDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final AICellWrapperDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (AICellWrapperDTO) ((JsonParser) this.receiver).fromJson(p02, AICellWrapperDTO.class);
        }
    }

    public e(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f83934a = new a(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f83935b = new ru.ozon.android.messenger.blocks.ai.aiCellWrapper.a(0);
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 a(androidx.compose.ui.e modifier, ru.ozon.android.messenger.blocks.ai.aiCellWrapper.presentation.a aVar, ru.ozon.android.messenger.framework.core.d references) {
        ru.ozon.android.messenger.blocks.ai.aiCellWrapper.presentation.a blockVO = aVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(references, "references");
        return new C4912a(true, -1797775060, new d(references, blockVO, modifier));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return this.f83935b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AICellWrapperDTO> getParser() {
        return this.f83934a;
    }
}
