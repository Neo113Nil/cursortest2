package ru.ozon.android.messenger.framework.data.local.database.undelivered.converter;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;
import ru.ozon.android.messenger.framework.data.remote.parser.SymmetricDataStringAdapter;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOAdapterFactory;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Moshi f87553a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f87554b;

    public a() {
        Moshi.a aVar = new Moshi.a();
        aVar.a(new AtomDTOAdapterFactory());
        aVar.b(new SymmetricDataStringAdapter());
        aVar.a(PolymorphicJsonAdapterFactory.b(UndeliveredMessageEntity.UndeliveredMessage.class).c(UndeliveredMessageEntity.UndeliveredMessage.Text.class, "text").c(UndeliveredMessageEntity.UndeliveredMessage.Image.class, "image").c(UndeliveredMessageEntity.UndeliveredMessage.File.class, "file"));
        Moshi moshi = new Moshi(aVar);
        this.f87553a = moshi;
        JsonAdapter c11 = moshi.c(CustomBlockDTO.class);
        Intrinsics.checkNotNullExpressionValue(c11, "adapter(...)");
        this.f87554b = new b(c11, new ru.ozon.android.messenger.framework.data.local.database.core.a());
    }

    public final UndeliveredMessageEntity.UndeliveredMessage a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f87554b.a(this.f87553a.c(UndeliveredMessageEntity.UndeliveredMessage.class), value);
    }

    @NotNull
    public final String b(@NotNull UndeliveredMessageEntity.UndeliveredMessage value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String json = this.f87553a.c(UndeliveredMessageEntity.UndeliveredMessage.class).toJson(value);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
