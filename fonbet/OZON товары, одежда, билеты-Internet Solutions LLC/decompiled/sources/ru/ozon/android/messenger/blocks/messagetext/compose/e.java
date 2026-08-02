package ru.ozon.android.messenger.blocks.messagetext.compose;

import a1.C4912a;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO;
import ru.ozon.android.messenger.framework.presentation.models.p;

/* loaded from: classes10.dex */
public final class e extends ru.ozon.android.messenger.blocks.chat.common.h<MessageTextDTO, ru.ozon.android.messenger.blocks.messagetext.f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, MessageTextDTO> f85832a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f85833b;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.messagetext.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f85834b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f85834b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.messagetext.e invoke() {
            return new ru.ozon.android.messenger.blocks.messagetext.e(this.f85834b);
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, MessageTextDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85835b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f85835b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MessageTextDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (MessageTextDTO) this.f85835b.fromJson(state, MessageTextDTO.class);
        }
    }

    public e(@NotNull Context context, @NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85832a = new b(deserializer);
        this.f85833b = ru.ozon.android.messenger.utils.f.b(new a(context));
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 a(androidx.compose.ui.e modifier, ru.ozon.android.messenger.blocks.messagetext.f fVar, ru.ozon.android.messenger.framework.core.d references) {
        ru.ozon.android.messenger.blocks.messagetext.f blockVO = fVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(references, "references");
        return ru.ozon.android.messenger.blocks.messagetext.compose.a.f85821a;
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 b(androidx.compose.ui.e modifier, ru.ozon.android.messenger.blocks.messagetext.f fVar, p itemInfo, ru.ozon.android.messenger.framework.core.d references) {
        ru.ozon.android.messenger.blocks.messagetext.f blockVO = fVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(references, "references");
        return new C4912a(true, 51833195, new d(itemInfo, references, modifier, blockVO));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.messagetext.e) this.f85833b.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, MessageTextDTO> getParser() {
        return this.f85832a;
    }
}
