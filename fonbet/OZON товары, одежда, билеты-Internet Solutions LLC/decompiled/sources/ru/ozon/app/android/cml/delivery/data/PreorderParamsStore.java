package ru.ozon.app.android.cml.delivery.data;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0003R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cml/delivery/data/PreorderParamsStore;", "", "<init>", "()V", "LAe/M0;", "", "shouldPerformAsyncUpdateFlow", "()LAe/M0;", "shouldUpdate", "", "setShouldAsyncUpdate", "(Z)V", "", "", "params", "savePreorderParams", "(Ljava/util/Map;)V", "geoInfo", "saveGeoInfo", "(Ljava/lang/String;)V", "getSelectedBoxId", "()Ljava/lang/String;", "getSourceId", "getPreorderParams", "()Ljava/util/Map;", "clear", "Ljava/util/concurrent/ConcurrentHashMap;", "preorderParams", "Ljava/util/concurrent/ConcurrentHashMap;", "LAe/x0;", "LAe/x0;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PreorderParamsStore {

    @NotNull
    public static final PreorderParamsStore INSTANCE = new PreorderParamsStore();

    @NotNull
    private static final ConcurrentHashMap<String, String> preorderParams = new ConcurrentHashMap<>();

    @NotNull
    private static final x0<Boolean> shouldPerformAsyncUpdateFlow = O0.a(Boolean.FALSE);

    private PreorderParamsStore() {
    }

    public final void clear() {
        preorderParams.clear();
    }

    @NotNull
    public final Map<String, String> getPreorderParams() {
        return preorderParams;
    }

    public final String getSelectedBoxId() {
        return preorderParams.get("boxId");
    }

    public final String getSourceId() {
        return preorderParams.get("sourceUid");
    }

    public final void saveGeoInfo(@NotNull String geoInfo) {
        Intrinsics.checkNotNullParameter(geoInfo, "geoInfo");
        preorderParams.put("geoInfo", geoInfo);
        setShouldAsyncUpdate(true);
    }

    public final void savePreorderParams(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ConcurrentHashMap<String, String> concurrentHashMap = preorderParams;
        concurrentHashMap.clear();
        concurrentHashMap.putAll(params);
    }

    public final void setShouldAsyncUpdate(boolean shouldUpdate) {
        shouldPerformAsyncUpdateFlow.tryEmit(Boolean.valueOf(shouldUpdate));
    }

    @NotNull
    public final M0<Boolean> shouldPerformAsyncUpdateFlow() {
        return C2399j.b(shouldPerformAsyncUpdateFlow);
    }
}
