package com.blaze.blazesdk.features.videos.widgets.compose;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickHandlerState;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickParams;
import com.blaze.blazesdk.features.videos.widgets.WidgetVideosContract;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemCustomMapping;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyleOverrides;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFrom;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import defpackage.lm5;
import defpackage.n0n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bu\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u00020\rH\u0007J\u001a\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\rH\u0007J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0007J&\u0010>\u001a\u0002072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0002\u0010?\u001a\u00020\rH\u0007J\b\u0010@\u001a\u000207H\u0007J\b\u0010A\u001a\u000207H\u0007J\b\u0010B\u001a\u000207H\u0007J\u0010\u0010B\u001a\u0002072\u0006\u0010C\u001a\u00020DH\u0007J\n\u0010E\u001a\u0004\u0018\u00010\u0005H\u0007J\n\u0010F\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010G\u001a\u0002072\u0006\u0010H\u001a\u00020\u0005H\u0007J\u0010\u0010I\u001a\u0002072\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006J"}, d2 = {"Lcom/blaze/blazesdk/features/videos/widgets/compose/BlazeComposeWidgetVideosStateHandler;", "", "widgetId", "", "widgetLayout", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "playerStyle", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "dataSourceType", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "cachingLevel", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "shouldOrderWidgetByReadStatus", "", "widgetDelegate", "Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;", "perItemStyleOverrides", "", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "onWidgetItemClickHandler", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickParams;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickHandlerState;", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;ZLcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "getWidgetId", "()Ljava/lang/String;", "getWidgetLayout$blazesdk_release", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getPlayerStyle$blazesdk_release", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "getDataSourceType$blazesdk_release", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "setDataSourceType$blazesdk_release", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;)V", "getCachingLevel$blazesdk_release", "()Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "getShouldOrderWidgetByReadStatus$blazesdk_release", "()Z", "getWidgetDelegate$blazesdk_release", "()Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;", "getPerItemStyleOverrides$blazesdk_release", "()Ljava/util/Map;", "setPerItemStyleOverrides$blazesdk_release", "(Ljava/util/Map;)V", "getOnWidgetItemClickHandler$blazesdk_release", "()Lkotlin/jvm/functions/Function1;", "widgetNativeView", "Lcom/blaze/blazesdk/features/videos/widgets/WidgetVideosContract;", "getWidgetNativeView$blazesdk_release", "()Lcom/blaze/blazesdk/features/videos/widgets/WidgetVideosContract;", "setWidgetNativeView$blazesdk_release", "(Lcom/blaze/blazesdk/features/videos/widgets/WidgetVideosContract;)V", "reloadData", "", "isSilentRefresh", "updateDataSource", "dataSource", "updateAdsConfigType", "videosAdsConfigType", "Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;", "updateOverrideStyles", "shouldUpdateUi", "resetOverriddenStyles", "updateWidgetsUi", "play", "from", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "getCurrentWidgetLayout", "getCurrentPlayerStyle", "updateWidgetLayout", "blazeWidgetLayout", "updatePlayerStyle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeComposeWidgetVideosStateHandler {
    public static final int $stable = 8;

    @NotNull
    private final BlazeCachingLevel cachingLevel;

    @NotNull
    private BlazeDataSourceType dataSourceType;

    @Nullable
    private final Function1<BlazeWidgetItemClickParams, BlazeWidgetItemClickHandlerState> onWidgetItemClickHandler;

    @NotNull
    private Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides;

    @NotNull
    private final BlazeVideosPlayerStyle playerStyle;
    private final boolean shouldOrderWidgetByReadStatus;

    @NotNull
    private final BlazeWidgetDelegate widgetDelegate;

    @NotNull
    private final String widgetId;

    @NotNull
    private final BlazeWidgetLayout widgetLayout;

    @Nullable
    private WidgetVideosContract widgetNativeView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BlazeComposeWidgetVideosStateHandler(String str, BlazeWidgetLayout blazeWidgetLayout, BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, BlazeWidgetDelegate blazeWidgetDelegate, Map map, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, blazeWidgetLayout, r3, blazeDataSourceType, r5, r6, blazeWidgetDelegate, r8, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : function1);
        Map map2;
        BlazeVideosPlayerStyle blazeVideosPlayerStyle2 = (i & 4) != 0 ? n0n.b : blazeVideosPlayerStyle;
        BlazeCachingLevel blazeCachingLevel2 = (i & 16) != 0 ? BlazeCachingLevel.DEFAULT : blazeCachingLevel;
        boolean z2 = (i & 32) != 0 ? true : z;
        if ((i & 128) != 0) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            map2 = lm5Var;
        } else {
            map2 = map;
        }
    }

    public static /* synthetic */ void reloadData$default(BlazeComposeWidgetVideosStateHandler blazeComposeWidgetVideosStateHandler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        blazeComposeWidgetVideosStateHandler.reloadData(z);
    }

    public static /* synthetic */ void updateDataSource$default(BlazeComposeWidgetVideosStateHandler blazeComposeWidgetVideosStateHandler, BlazeDataSourceType blazeDataSourceType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        blazeComposeWidgetVideosStateHandler.updateDataSource(blazeDataSourceType, z);
    }

    public static /* synthetic */ void updateOverrideStyles$default(BlazeComposeWidgetVideosStateHandler blazeComposeWidgetVideosStateHandler, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        blazeComposeWidgetVideosStateHandler.updateOverrideStyles(map, z);
    }

    @NotNull
    /* renamed from: getCachingLevel$blazesdk_release, reason: from getter */
    public final BlazeCachingLevel getCachingLevel() {
        return this.cachingLevel;
    }

    @Keep
    @Nullable
    public final BlazeVideosPlayerStyle getCurrentPlayerStyle() {
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            return widgetVideosContract.getCurrentPlayerStyle();
        }
        return null;
    }

    @Keep
    @Nullable
    public final BlazeWidgetLayout getCurrentWidgetLayout() {
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            return widgetVideosContract.getCurrentWidgetLayout();
        }
        return null;
    }

    @NotNull
    /* renamed from: getDataSourceType$blazesdk_release, reason: from getter */
    public final BlazeDataSourceType getDataSourceType() {
        return this.dataSourceType;
    }

    @Nullable
    public final Function1<BlazeWidgetItemClickParams, BlazeWidgetItemClickHandlerState> getOnWidgetItemClickHandler$blazesdk_release() {
        return this.onWidgetItemClickHandler;
    }

    @NotNull
    public final Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> getPerItemStyleOverrides$blazesdk_release() {
        return this.perItemStyleOverrides;
    }

    @NotNull
    /* renamed from: getPlayerStyle$blazesdk_release, reason: from getter */
    public final BlazeVideosPlayerStyle getPlayerStyle() {
        return this.playerStyle;
    }

    /* renamed from: getShouldOrderWidgetByReadStatus$blazesdk_release, reason: from getter */
    public final boolean getShouldOrderWidgetByReadStatus() {
        return this.shouldOrderWidgetByReadStatus;
    }

    @NotNull
    /* renamed from: getWidgetDelegate$blazesdk_release, reason: from getter */
    public final BlazeWidgetDelegate getWidgetDelegate() {
        return this.widgetDelegate;
    }

    @NotNull
    public final String getWidgetId() {
        return this.widgetId;
    }

    @NotNull
    /* renamed from: getWidgetLayout$blazesdk_release, reason: from getter */
    public final BlazeWidgetLayout getWidgetLayout() {
        return this.widgetLayout;
    }

    @Nullable
    /* renamed from: getWidgetNativeView$blazesdk_release, reason: from getter */
    public final WidgetVideosContract getWidgetNativeView() {
        return this.widgetNativeView;
    }

    @Keep
    public final void play(@NotNull BlazeWidgetPlayFrom from) {
        from.getClass();
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.play(from);
        }
    }

    @Keep
    public final void reloadData(boolean isSilentRefresh) {
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.reloadData(isSilentRefresh);
        }
    }

    @Keep
    public final void resetOverriddenStyles() {
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.resetOverriddenStyles();
        }
    }

    public final void setDataSourceType$blazesdk_release(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        this.dataSourceType = blazeDataSourceType;
    }

    public final void setPerItemStyleOverrides$blazesdk_release(@NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map) {
        map.getClass();
        this.perItemStyleOverrides = map;
    }

    public final void setWidgetNativeView$blazesdk_release(@Nullable WidgetVideosContract widgetVideosContract) {
        this.widgetNativeView = widgetVideosContract;
    }

    @Keep
    public final void updateAdsConfigType(@NotNull BlazeVideosAdsConfigType videosAdsConfigType) {
        videosAdsConfigType.getClass();
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.updateAdsConfigType(videosAdsConfigType);
        }
    }

    @Keep
    public final void updateDataSource(@NotNull BlazeDataSourceType dataSource, boolean isSilentRefresh) {
        dataSource.getClass();
        this.dataSourceType = dataSource;
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.updateDataSource(dataSource, isSilentRefresh);
        }
    }

    @Keep
    public final void updateOverrideStyles(@NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides, boolean shouldUpdateUi) {
        perItemStyleOverrides.getClass();
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.updateOverrideStyles(perItemStyleOverrides, shouldUpdateUi);
        }
    }

    @Keep
    public final void updatePlayerStyle(@NotNull BlazeVideosPlayerStyle playerStyle) {
        playerStyle.getClass();
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.updatePlayerStyle(playerStyle);
        }
    }

    @Keep
    public final void updateWidgetLayout(@NotNull BlazeWidgetLayout blazeWidgetLayout) {
        blazeWidgetLayout.getClass();
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.updateWidgetLayout(blazeWidgetLayout);
        }
    }

    @Keep
    public final void updateWidgetsUi() {
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.updateWidgetsUi();
        }
    }

    @Keep
    public final void reloadData() {
        reloadData$default(this, false, 1, null);
    }

    @Keep
    public final void play() {
        WidgetVideosContract widgetVideosContract = this.widgetNativeView;
        if (widgetVideosContract != null) {
            widgetVideosContract.play();
        }
    }

    @Keep
    public final void updateOverrideStyles(@NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map) {
        map.getClass();
        updateOverrideStyles$default(this, map, false, 2, null);
    }

    @Keep
    public final void updateDataSource(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        updateDataSource$default(this, blazeDataSourceType, false, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetVideosStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, null, false, blazeWidgetDelegate, null, null, 432, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetVideosStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, blazeCachingLevel, false, blazeWidgetDelegate, null, null, TTAdConstant.PACKAGE_NAME_CODE, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetVideosStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, blazeCachingLevel, z, blazeWidgetDelegate, null, null, 384, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetVideosStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map) {
        this(str, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, blazeCachingLevel, z, blazeWidgetDelegate, map, null, NotificationCompat.FLAG_LOCAL_ONLY, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    public BlazeComposeWidgetVideosStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map, @Nullable Function1<? super BlazeWidgetItemClickParams, ? extends BlazeWidgetItemClickHandlerState> function1) {
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeVideosPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        this.widgetId = str;
        this.widgetLayout = blazeWidgetLayout;
        this.playerStyle = blazeVideosPlayerStyle;
        this.dataSourceType = blazeDataSourceType;
        this.cachingLevel = blazeCachingLevel;
        this.shouldOrderWidgetByReadStatus = z;
        this.widgetDelegate = blazeWidgetDelegate;
        this.perItemStyleOverrides = map;
        this.onWidgetItemClickHandler = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetVideosStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, null, blazeDataSourceType, null, false, blazeWidgetDelegate, null, null, 436, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeWidgetDelegate.getClass();
    }
}
