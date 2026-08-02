package ru.ozon.app.android.network.dependency;

import Pc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.debug.ExtraHeadersService;
import ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSource;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/network/dependency/ExtraHeadersServiceImpl;", "Lru/ozon/app/android/network/debug/ExtraHeadersService;", "LPc/a;", "Lru/ozon/app/android/storage/extraHeaders/ExtraHeadersDataSource;", "extraHeadersDataSource", "<init>", "(LPc/a;)V", "LPc/a;", "", "", "getExtraHeaders", "()Ljava/util/Map;", "extraHeaders", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtraHeadersServiceImpl implements ExtraHeadersService {

    @NotNull
    private final a<ExtraHeadersDataSource> extraHeadersDataSource;

    public ExtraHeadersServiceImpl(@NotNull a<ExtraHeadersDataSource> extraHeadersDataSource) {
        Intrinsics.checkNotNullParameter(extraHeadersDataSource, "extraHeadersDataSource");
        this.extraHeadersDataSource = extraHeadersDataSource;
    }

    @Override // ru.ozon.app.android.network.debug.ExtraHeadersService
    @NotNull
    public Map<String, String> getExtraHeaders() {
        return this.extraHeadersDataSource.get().getExtraHeaders();
    }
}
