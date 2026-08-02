package ru.ozon.android.messenger.blocks.messageimage;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.h;

/* loaded from: classes10.dex */
public final class a implements Function2<ImageDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends c>> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f85732a = h.c(55);

    @NotNull
    public static c a(@NotNull ImageDTO imageDto, @NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId) {
        Intrinsics.checkNotNullParameter(imageDto, "imageDto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        String mime = imageDto.getMime();
        return new c(blockId, imageDto.getUrl(), imageDto.getLocalUrl(), mime, imageDto.getWidth(), imageDto.getHeight(), f85732a, imageDto.getAction(), null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends c> invoke(ImageDTO imageDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        ImageDTO dto = imageDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        return C7714v.a0(a(dto, blockId));
    }
}
