package ru.ozon.android.messenger.blocks.chat.ai;

import Sc.r;
import Sc.s;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chat.common.h;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.utils.f;

/* loaded from: classes10.dex */
public final class d extends h<AiAssistantDTO, ru.ozon.android.messenger.blocks.chat.ai.b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonParser f84485a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, AiAssistantDTO> f84486b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f84487c;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.chat.ai.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f84488b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.chat.ai.a invoke() {
            return new ru.ozon.android.messenger.blocks.chat.ai.a();
        }
    }

    /* synthetic */ class b extends C7735q implements Function1<String, AiAssistantDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final AiAssistantDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (AiAssistantDTO) ((JsonParser) this.receiver).fromJson(p02, AiAssistantDTO.class);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84485a = deserializer;
        this.f84486b = new b(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f84487c = f.b(a.f84488b);
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 a(e modifier, ru.ozon.android.messenger.blocks.chat.ai.b bVar, ru.ozon.android.messenger.framework.core.d references) {
        ru.ozon.android.messenger.blocks.chat.ai.b blockVO = bVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(references, "references");
        return new C4912a(true, 605696412, new c(modifier));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        Object a11;
        if (!(obj instanceof BlockDTO)) {
            return false;
        }
        try {
            r.Companion companion = r.INSTANCE;
            a11 = (AiAssistantDTO) this.f84485a.fromJson(((BlockDTO) obj).getState(), AiAssistantDTO.class);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        return !(a11 instanceof r.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.chat.ai.a) this.f84487c.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AiAssistantDTO> getParser() {
        return this.f84486b;
    }
}
