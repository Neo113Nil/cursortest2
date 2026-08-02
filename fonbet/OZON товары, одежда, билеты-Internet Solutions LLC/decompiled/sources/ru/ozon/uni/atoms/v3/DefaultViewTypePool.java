package ru.ozon.uni.atoms.v3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/v3/DefaultViewTypePool;", "Lru/ozon/uni/atoms/v3/ViewTypePool;", "<init>", "()V", "getViewType", "Ljava/lang/Class;", "dto", "Lru/ozon/uni/atoms/data/AtomDTO;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultViewTypePool implements ViewTypePool {
    @Override // ru.ozon.uni.atoms.v3.ViewTypePool
    @NotNull
    public Class<?> getViewType(@NotNull AtomDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return dto.getClass();
    }
}
