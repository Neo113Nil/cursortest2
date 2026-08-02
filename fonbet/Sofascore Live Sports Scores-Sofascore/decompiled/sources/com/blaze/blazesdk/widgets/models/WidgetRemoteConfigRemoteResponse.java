package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import defpackage.b6h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB)\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/WidgetRemoteConfigRemoteResponse;", "", "", "", "Lcom/blaze/blazesdk/widgets/models/WidgetLayoutRemoteDto;", "themeLayoutsMap", "Lcom/blaze/blazesdk/widgets/models/DataSourceRemoteDto;", "dataSource", "<init>", "(Ljava/util/Map;Lcom/blaze/blazesdk/widgets/models/DataSourceRemoteDto;)V", "component1", "()Ljava/util/Map;", "component2", "()Lcom/blaze/blazesdk/widgets/models/DataSourceRemoteDto;", "copy", "(Ljava/util/Map;Lcom/blaze/blazesdk/widgets/models/DataSourceRemoteDto;)Lcom/blaze/blazesdk/widgets/models/WidgetRemoteConfigRemoteResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getThemeLayoutsMap", "Lcom/blaze/blazesdk/widgets/models/DataSourceRemoteDto;", "getDataSource", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WidgetRemoteConfigRemoteResponse {

    @NotNull
    public static final String DEFAULT_LAYOUT_KEY = "light";

    @b6h("dataSource")
    @Nullable
    private final DataSourceRemoteDto dataSource;

    @b6h("themeLayoutsDictionary")
    @Nullable
    private final Map<String, WidgetLayoutRemoteDto> themeLayoutsMap;
    public static final int $stable = 8;

    public WidgetRemoteConfigRemoteResponse(@Nullable Map<String, WidgetLayoutRemoteDto> map, @Nullable DataSourceRemoteDto dataSourceRemoteDto) {
        this.themeLayoutsMap = map;
        this.dataSource = dataSourceRemoteDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WidgetRemoteConfigRemoteResponse copy$default(WidgetRemoteConfigRemoteResponse widgetRemoteConfigRemoteResponse, Map map, DataSourceRemoteDto dataSourceRemoteDto, int i, Object obj) {
        if ((i & 1) != 0) {
            map = widgetRemoteConfigRemoteResponse.themeLayoutsMap;
        }
        if ((i & 2) != 0) {
            dataSourceRemoteDto = widgetRemoteConfigRemoteResponse.dataSource;
        }
        return widgetRemoteConfigRemoteResponse.copy(map, dataSourceRemoteDto);
    }

    @Nullable
    public final Map<String, WidgetLayoutRemoteDto> component1() {
        return this.themeLayoutsMap;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final DataSourceRemoteDto getDataSource() {
        return this.dataSource;
    }

    @NotNull
    public final WidgetRemoteConfigRemoteResponse copy(@Nullable Map<String, WidgetLayoutRemoteDto> themeLayoutsMap, @Nullable DataSourceRemoteDto dataSource) {
        return new WidgetRemoteConfigRemoteResponse(themeLayoutsMap, dataSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetRemoteConfigRemoteResponse)) {
            return false;
        }
        WidgetRemoteConfigRemoteResponse widgetRemoteConfigRemoteResponse = (WidgetRemoteConfigRemoteResponse) other;
        return Intrinsics.c(this.themeLayoutsMap, widgetRemoteConfigRemoteResponse.themeLayoutsMap) && Intrinsics.c(this.dataSource, widgetRemoteConfigRemoteResponse.dataSource);
    }

    @Nullable
    public final DataSourceRemoteDto getDataSource() {
        return this.dataSource;
    }

    @Nullable
    public final Map<String, WidgetLayoutRemoteDto> getThemeLayoutsMap() {
        return this.themeLayoutsMap;
    }

    public int hashCode() {
        Map<String, WidgetLayoutRemoteDto> map = this.themeLayoutsMap;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        DataSourceRemoteDto dataSourceRemoteDto = this.dataSource;
        return hashCode + (dataSourceRemoteDto != null ? dataSourceRemoteDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WidgetRemoteConfigRemoteResponse(themeLayoutsMap=" + this.themeLayoutsMap + ", dataSource=" + this.dataSource + ')';
    }
}
