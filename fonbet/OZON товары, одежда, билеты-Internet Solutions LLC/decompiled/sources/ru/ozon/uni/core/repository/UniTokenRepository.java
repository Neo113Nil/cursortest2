package ru.ozon.uni.core.repository;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniToken;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/core/repository/UniTokenRepository;", "Lru/ozon/uni/core/models/UniToken;", "T", "", "", "tokenId", "getById", "(Ljava/lang/String;)Lru/ozon/uni/core/models/UniToken;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UniTokenRepository<T extends UniToken> {
    T getById(@NotNull String tokenId);
}
