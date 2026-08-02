package ru.ozon.uni.atoms.v3;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/atoms/v3/ViewTypePool;", "", "getViewType", "Ljava/lang/Class;", "dto", "Lru/ozon/uni/atoms/data/AtomDTO;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ViewTypePool {
    Class<?> getViewType(@NotNull AtomDTO dto);
}
