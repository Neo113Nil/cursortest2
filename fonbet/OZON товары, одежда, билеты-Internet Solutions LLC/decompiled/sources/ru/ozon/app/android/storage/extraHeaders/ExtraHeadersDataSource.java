package ru.ozon.app.android.storage.extraHeaders;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R$\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storage/extraHeaders/ExtraHeadersDataSource;", "", "extraHeaders", "", "", "getExtraHeaders", "()Ljava/util/Map;", "setExtraHeaders", "(Ljava/util/Map;)V", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExtraHeadersDataSource {
    @NotNull
    Map<String, String> getExtraHeaders();

    void setExtraHeaders(@NotNull Map<String, String> map);
}
