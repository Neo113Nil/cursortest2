package ru.ozon.app.android.storage.debug;

import io.reactivex.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00168&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storage/debug/DebugToolsService;", "", "Lio/reactivex/p;", "", "onAbVariantSaved", "()Lio/reactivex/p;", "", "onCommitHashSaved", "getMeshValue", "()Ljava/lang/String;", "setMeshValue", "(Ljava/lang/String;)V", "meshValue", "getAbVariant", "setAbVariant", "abVariant", "getInternalHeadersToken", "setInternalHeadersToken", "internalHeadersToken", "getCommitHash", "setCommitHash", "commitHash", "", "getFfRefreshIntervalMinutes", "()Ljava/lang/Long;", "setFfRefreshIntervalMinutes", "(Ljava/lang/Long;)V", "ffRefreshIntervalMinutes", "getResolveOverride", "setResolveOverride", "resolveOverride", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DebugToolsService {
    String getAbVariant();

    String getCommitHash();

    Long getFfRefreshIntervalMinutes();

    String getInternalHeadersToken();

    String getMeshValue();

    String getResolveOverride();

    @NotNull
    p<Boolean> onAbVariantSaved();

    @NotNull
    p<String> onCommitHashSaved();

    void setAbVariant(String str);

    void setCommitHash(String str);

    void setFfRefreshIntervalMinutes(Long l11);

    void setInternalHeadersToken(String str);

    void setMeshValue(String str);

    void setResolveOverride(String str);
}
