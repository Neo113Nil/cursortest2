package ru.ozon.android.messenger.blocks.chat.search;

import Sc.p;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes10.dex */
public final class j extends ru.ozon.android.messenger.blocks.chat.common.h<SearchChatDTO, i> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, SearchChatDTO> f84626a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f84627b;

    static final class a extends AbstractC7737t implements Function0<h> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f84628b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            return new h();
        }
    }

    /* synthetic */ class b extends C7735q implements Function1<String, SearchChatDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final SearchChatDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (SearchChatDTO) ((JsonParser) this.receiver).fromJson(p02, SearchChatDTO.class);
        }
    }

    public j(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84626a = new b(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f84627b = ru.ozon.android.messenger.utils.f.b(a.f84628b);
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 a(androidx.compose.ui.e modifier, i iVar, ru.ozon.android.messenger.framework.core.d references) {
        i blockVO = iVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter("An operation is not implemented: Not yet implemented", "message");
        throw new p("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<SearchChatDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<i>> getMapper() {
        return (Function2) this.f84627b.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, SearchChatDTO> getParser() {
        return this.f84626a;
    }
}
