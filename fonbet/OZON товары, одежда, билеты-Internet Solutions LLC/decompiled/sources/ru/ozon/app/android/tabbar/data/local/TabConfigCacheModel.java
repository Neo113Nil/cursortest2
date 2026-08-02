package ru.ozon.app.android.tabbar.data.local;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/tabbar/data/local/TabConfigCacheModel;", "", "id", "", "config", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/tabbar/data/TabConfigResponse;)V", "getId", "()Ljava/lang/String;", "getConfig", "()Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TabConfigCacheModel {

    @NotNull
    private final TabConfigResponse config;

    @NotNull
    private final String id;

    public TabConfigCacheModel(@NotNull String id2, @NotNull TabConfigResponse config) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(config, "config");
        this.id = id2;
        this.config = config;
    }

    public static /* synthetic */ TabConfigCacheModel copy$default(TabConfigCacheModel tabConfigCacheModel, String str, TabConfigResponse tabConfigResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabConfigCacheModel.id;
        }
        if ((i11 & 2) != 0) {
            tabConfigResponse = tabConfigCacheModel.config;
        }
        return tabConfigCacheModel.copy(str, tabConfigResponse);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TabConfigResponse getConfig() {
        return this.config;
    }

    @NotNull
    public final TabConfigCacheModel copy(@NotNull String id2, @NotNull TabConfigResponse config) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(config, "config");
        return new TabConfigCacheModel(id2, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabConfigCacheModel)) {
            return false;
        }
        TabConfigCacheModel tabConfigCacheModel = (TabConfigCacheModel) other;
        return Intrinsics.d(this.id, tabConfigCacheModel.id) && Intrinsics.d(this.config, tabConfigCacheModel.config);
    }

    @NotNull
    public final TabConfigResponse getConfig() {
        return this.config;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.config.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TabConfigCacheModel(id=" + this.id + ", config=" + this.config + ")";
    }
}
