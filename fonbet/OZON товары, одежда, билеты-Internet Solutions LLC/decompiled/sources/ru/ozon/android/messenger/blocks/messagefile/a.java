package ru.ozon.android.messenger.blocks.messagefile;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a implements Function2<FileDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends c>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Regex f85691a = new Regex("\\s{2,}\\R*");

    @NotNull
    public static List a(@NotNull FileDTO dto, @NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(new c(blockId, dto.getUrl(), dto.getLocalUrl(), f85691a.replace(dto.getName(), " "), dto.getMime(), dto.getSize(), false, null, null));
    }

    @NotNull
    public static c b(@NotNull FileDTO dto, @NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return new c(blockId, dto.getUrl(), dto.getLocalUrl(), f85691a.replace(dto.getName(), " "), dto.getMime(), dto.getSize(), false, null, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ List<? extends c> invoke(FileDTO fileDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        return a(fileDTO, cVar);
    }
}
