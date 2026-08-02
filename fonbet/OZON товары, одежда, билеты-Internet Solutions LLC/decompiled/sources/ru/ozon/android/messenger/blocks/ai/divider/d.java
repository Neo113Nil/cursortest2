package ru.ozon.android.messenger.blocks.ai.divider;

import a1.C4912a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chat.common.h;
import ru.ozon.android.messenger.utils.f;

/* loaded from: classes10.dex */
public final class d extends h<AiDividerDTO, ru.ozon.android.messenger.blocks.ai.divider.b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, AiDividerDTO> f84099a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f84100b;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.ai.divider.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f84101b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.ai.divider.a invoke() {
            return new ru.ozon.android.messenger.blocks.ai.divider.a();
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, AiDividerDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84102b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f84102b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final AiDividerDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (AiDividerDTO) this.f84102b.fromJson(state, AiDividerDTO.class);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84099a = new b(deserializer);
        this.f84100b = f.b(a.f84101b);
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 a(androidx.compose.ui.e modifier, ru.ozon.android.messenger.blocks.ai.divider.b bVar, ru.ozon.android.messenger.framework.core.d references) {
        ru.ozon.android.messenger.blocks.ai.divider.b blockVO = bVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(references, "references");
        return new C4912a(true, 1748170836, new c(modifier, blockVO));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.ai.divider.a) this.f84100b.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AiDividerDTO> getParser() {
        return this.f84099a;
    }
}
