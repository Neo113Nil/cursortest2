package ru.ozon.android.messenger.blocks.travelOrders;

import a1.C4912a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes10.dex */
public final class s extends ru.ozon.android.messenger.blocks.chat.common.h<TravelOrdersDTO, p> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, TravelOrdersDTO> f86548a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f86549b;

    static final class a extends AbstractC7737t implements Function0<o> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f86550b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final o invoke() {
            return new o();
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, TravelOrdersDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86551b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f86551b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final TravelOrdersDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (TravelOrdersDTO) this.f86551b.fromJson(state, TravelOrdersDTO.class);
        }
    }

    public s(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86548a = new b(deserializer);
        this.f86549b = ru.ozon.android.messenger.utils.f.b(a.f86550b);
    }

    @Override // ru.ozon.android.messenger.blocks.chat.common.h
    public final Function2 a(androidx.compose.ui.e modifier, p pVar, ru.ozon.android.messenger.framework.core.d references) {
        p blockVO = pVar;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(references, "references");
        return new C4912a(true, 312004742, new r(blockVO, references));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (o) this.f86549b.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, TravelOrdersDTO> getParser() {
        return this.f86548a;
    }
}
