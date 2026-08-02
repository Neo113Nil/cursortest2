package ru.ozon.android.messenger.blocks.ai.aiMessageActions;

import C.o0;
import a1.C4912a;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.f;
import ru.ozon.android.messenger.blocks.chat.common.h;
import ru.ozon.android.messenger.framework.navigation.controller.d;

/* loaded from: classes10.dex */
public final class c extends h<AiMessageActionsDTO, f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonParser f83965a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, AiMessageActionsDTO> f83966b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.ai.aiMessageActions.a f83967c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends a>> f83968d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.ai.aiMessageActions.b f83969e;

    public static abstract class a implements d.w.a {

        /* renamed from: ru.ozon.android.messenger.blocks.ai.aiMessageActions.c$a$a, reason: collision with other inner class name */
        public static final class C1453a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final int f83970a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f83971b;

            public C1453a(int i11, @NotNull String itemId) {
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                this.f83970a = i11;
                this.f83971b = itemId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1453a)) {
                    return false;
                }
                C1453a c1453a = (C1453a) obj;
                return this.f83970a == c1453a.f83970a && Intrinsics.d(this.f83971b, c1453a.f83971b);
            }

            public final int hashCode() {
                return this.f83971b.hashCode() + (Integer.hashCode(this.f83970a) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("RestoreToggleUpdate(toggleId=");
                sb2.append(this.f83970a);
                sb2.append(", itemId=");
                return o0.c(sb2, this.f83971b, ")");
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final int f83972a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f83973b;

            public b(int i11, @NotNull String itemId) {
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                this.f83972a = i11;
                this.f83973b = itemId;
            }

            @NotNull
            public final String a() {
                return this.f83973b;
            }

            public final int b() {
                return this.f83972a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f83972a == bVar.f83972a && Intrinsics.d(this.f83973b, bVar.f83973b);
            }

            public final int hashCode() {
                return this.f83973b.hashCode() + (Integer.hashCode(this.f83972a) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SelectToggleUpdate(toggleId=");
                sb2.append(this.f83972a);
                sb2.append(", itemId=");
                return o0.c(sb2, this.f83973b, ")");
            }
        }
    }

    /* synthetic */ class b extends C7735q implements Function1<String, AiMessageActionsDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final AiMessageActionsDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (AiMessageActionsDTO) ((JsonParser) this.receiver).fromJson(p02, AiMessageActionsDTO.class);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f83965a = deserializer;
        this.f83966b = new b(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f83967c = new ru.ozon.android.messenger.blocks.ai.aiMessageActions.a();
        this.f83968d = C7714v.b0(a.b.class, a.C1453a.class);
        this.f83969e = new ru.ozon.android.messenger.blocks.ai.aiMessageActions.b();
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 a(androidx.compose.ui.e modifier, f fVar, ru.ozon.android.messenger.framework.core.d references) {
        f blockVO = fVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(references, "references");
        return new C4912a(true, -718680970, new e(modifier, blockVO, references));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return this.f83967c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AiMessageActionsDTO> getParser() {
        return this.f83966b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends a>> getSupportedUpdateKeys() {
        return this.f83968d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, f, f> getUpdateConsumer() {
        return this.f83969e;
    }
}
