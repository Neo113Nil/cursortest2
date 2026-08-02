package ru.ozon.android.messenger.framework.data.local.database.draft.converter;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOAdapterFactory;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f87483a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.database.core.a f87484b;

    public b() {
        Moshi.a aVar = new Moshi.a();
        aVar.a(new AtomDTOAdapterFactory());
        Moshi moshi = new Moshi(aVar);
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        this.f87483a = moshi;
        this.f87484b = new ru.ozon.android.messenger.framework.data.local.database.core.a();
    }

    @NotNull
    public final String a(@NotNull CustomBlockDTO customBlockDTO) {
        Intrinsics.checkNotNullParameter(customBlockDTO, "customBlockDTO");
        String json = this.f87483a.c(CustomBlockDTO.class).toJson(customBlockDTO);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    public final CustomBlockDTO b(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return (CustomBlockDTO) this.f87484b.b(this.f87483a.c(CustomBlockDTO.class), json);
    }
}
