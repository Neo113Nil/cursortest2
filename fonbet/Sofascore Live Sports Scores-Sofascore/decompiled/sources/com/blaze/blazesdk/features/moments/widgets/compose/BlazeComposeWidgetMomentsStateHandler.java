package com.blaze.blazesdk.features.moments.widgets.compose;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickHandlerState;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickParams;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.features.moments.widgets.WidgetMomentsContract;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemCustomMapping;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyleOverrides;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFrom;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\rH\u0007J\u001a\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020\rH\u0007J\u0010\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020CH\u0007J&\u0010D\u001a\u00020=2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\b\b\u0002\u0010E\u001a\u00020\rH\u0007J\b\u0010F\u001a\u00020=H\u0007J\b\u0010G\u001a\u00020=H\u0007J\b\u0010H\u001a\u00020=H\u0007J\u0010\u0010H\u001a\u00020=2\u0006\u0010I\u001a\u00020JH\u0007J\n\u0010K\u001a\u0004\u0018\u00010\u0005H\u0007J\n\u0010L\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020\u0005H\u0007J\u0010\u0010O\u001a\u00020=2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010P\u001a\u00020=2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006Q"}, d2 = {"Lcom/blaze/blazesdk/features/moments/widgets/compose/BlazeComposeWidgetMomentsStateHandler;", "", "widgetId", "", "widgetLayout", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "playerStyle", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "dataSourceType", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "cachingLevel", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "shouldOrderWidgetByReadStatus", "", "widgetDelegate", "Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;", "widgetRemoteId", "perItemStyleOverrides", "", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "playbackConfiguration", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "onWidgetItemClickHandler", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickParams;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickHandlerState;", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;ZLcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;Ljava/lang/String;Ljava/util/Map;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;Lkotlin/jvm/functions/Function1;)V", "getWidgetId", "()Ljava/lang/String;", "getWidgetLayout$blazesdk_release", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getPlayerStyle$blazesdk_release", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "getDataSourceType$blazesdk_release", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "setDataSourceType$blazesdk_release", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;)V", "getCachingLevel$blazesdk_release", "()Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "getShouldOrderWidgetByReadStatus$blazesdk_release", "()Z", "getWidgetDelegate$blazesdk_release", "()Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;", "getWidgetRemoteId$blazesdk_release", "getPerItemStyleOverrides$blazesdk_release", "()Ljava/util/Map;", "setPerItemStyleOverrides$blazesdk_release", "(Ljava/util/Map;)V", "getPlaybackConfiguration$blazesdk_release", "()Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "getOnWidgetItemClickHandler$blazesdk_release", "()Lkotlin/jvm/functions/Function1;", "widgetNativeView", "Lcom/blaze/blazesdk/features/moments/widgets/WidgetMomentsContract;", "getWidgetNativeView$blazesdk_release", "()Lcom/blaze/blazesdk/features/moments/widgets/WidgetMomentsContract;", "setWidgetNativeView$blazesdk_release", "(Lcom/blaze/blazesdk/features/moments/widgets/WidgetMomentsContract;)V", "reloadData", "", "isSilentRefresh", "updateDataSource", "dataSource", "updateAdsConfigType", "momentsAdsConfigType", "Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "updateOverrideStyles", "shouldUpdateUi", "resetOverriddenStyles", "updateWidgetsUi", "play", "from", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "getCurrentWidgetLayout", "getCurrentPlayerStyle", "updateWidgetLayout", "blazeWidgetLayout", "updatePlayerStyle", "updatePlaybackConfiguration", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeComposeWidgetMomentsStateHandler {
    public static final int $stable = 8;

    @NotNull
    private final BlazeCachingLevel cachingLevel;

    @NotNull
    private BlazeDataSourceType dataSourceType;

    @Nullable
    private final Function1<BlazeWidgetItemClickParams, BlazeWidgetItemClickHandlerState> onWidgetItemClickHandler;

    @NotNull
    private Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides;

    @Nullable
    private final BlazeMomentsPlaybackConfiguration playbackConfiguration;

    @NotNull
    private final BlazeMomentsPlayerStyle playerStyle;
    private final boolean shouldOrderWidgetByReadStatus;

    @NotNull
    private final BlazeWidgetDelegate widgetDelegate;

    @NotNull
    private final String widgetId;

    @NotNull
    private final BlazeWidgetLayout widgetLayout;

    @Nullable
    private WidgetMomentsContract widgetNativeView;

    @Nullable
    private final String widgetRemoteId;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public BlazeComposeWidgetMomentsStateHandler(java.lang.String r15, com.blaze.blazesdk.style.widgets.BlazeWidgetLayout r16, com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle r17, com.blaze.blazesdk.data_source.BlazeDataSourceType r18, com.blaze.blazesdk.prefetch.models.BlazeCachingLevel r19, boolean r20, com.blaze.blazesdk.delegates.BlazeWidgetDelegate r21, java.lang.String r22, java.util.Map r23, com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration r24, kotlin.jvm.functions.Function1 r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 4
            if (r1 == 0) goto La
            com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle r1 = defpackage.rsm.b
            r5 = r1
            goto Lc
        La:
            r5 = r17
        Lc:
            r1 = r0 & 16
            if (r1 == 0) goto L14
            com.blaze.blazesdk.prefetch.models.BlazeCachingLevel r1 = com.blaze.blazesdk.prefetch.models.BlazeCachingLevel.DEFAULT
            r7 = r1
            goto L16
        L14:
            r7 = r19
        L16:
            r1 = r0 & 32
            if (r1 == 0) goto L1d
            r1 = 1
            r8 = r1
            goto L1f
        L1d:
            r8 = r20
        L1f:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            if (r1 == 0) goto L26
            r10 = r2
            goto L28
        L26:
            r10 = r22
        L28:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L33
            lm5 r1 = defpackage.lm5.a
            r1.getClass()
            r11 = r1
            goto L35
        L33:
            r11 = r23
        L35:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L3b
            r12 = r2
            goto L3d
        L3b:
            r12 = r24
        L3d:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L4b
            r13 = r2
            r3 = r15
            r4 = r16
            r6 = r18
            r9 = r21
            r2 = r14
            goto L55
        L4b:
            r13 = r25
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r9 = r21
        L55:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blaze.blazesdk.features.moments.widgets.compose.BlazeComposeWidgetMomentsStateHandler.<init>(java.lang.String, com.blaze.blazesdk.style.widgets.BlazeWidgetLayout, com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle, com.blaze.blazesdk.data_source.BlazeDataSourceType, com.blaze.blazesdk.prefetch.models.BlazeCachingLevel, boolean, com.blaze.blazesdk.delegates.BlazeWidgetDelegate, java.lang.String, java.util.Map, com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ void reloadData$default(BlazeComposeWidgetMomentsStateHandler blazeComposeWidgetMomentsStateHandler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        blazeComposeWidgetMomentsStateHandler.reloadData(z);
    }

    public static /* synthetic */ void updateDataSource$default(BlazeComposeWidgetMomentsStateHandler blazeComposeWidgetMomentsStateHandler, BlazeDataSourceType blazeDataSourceType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        blazeComposeWidgetMomentsStateHandler.updateDataSource(blazeDataSourceType, z);
    }

    public static /* synthetic */ void updateOverrideStyles$default(BlazeComposeWidgetMomentsStateHandler blazeComposeWidgetMomentsStateHandler, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        blazeComposeWidgetMomentsStateHandler.updateOverrideStyles(map, z);
    }

    @NotNull
    /* renamed from: getCachingLevel$blazesdk_release, reason: from getter */
    public final BlazeCachingLevel getCachingLevel() {
        return this.cachingLevel;
    }

    @Keep
    @Nullable
    public final BlazeMomentsPlayerStyle getCurrentPlayerStyle() {
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            return widgetMomentsContract.getCurrentPlayerStyle();
        }
        return null;
    }

    @Keep
    @Nullable
    public final BlazeWidgetLayout getCurrentWidgetLayout() {
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            return widgetMomentsContract.getCurrentWidgetLayout();
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

    @Nullable
    /* renamed from: getPlaybackConfiguration$blazesdk_release, reason: from getter */
    public final BlazeMomentsPlaybackConfiguration getPlaybackConfiguration() {
        return this.playbackConfiguration;
    }

    @NotNull
    /* renamed from: getPlayerStyle$blazesdk_release, reason: from getter */
    public final BlazeMomentsPlayerStyle getPlayerStyle() {
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
    public final WidgetMomentsContract getWidgetNativeView() {
        return this.widgetNativeView;
    }

    @Nullable
    /* renamed from: getWidgetRemoteId$blazesdk_release, reason: from getter */
    public final String getWidgetRemoteId() {
        return this.widgetRemoteId;
    }

    @Keep
    public final void play(@NotNull BlazeWidgetPlayFrom from) {
        from.getClass();
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.play(from);
        }
    }

    @Keep
    public final void reloadData(boolean isSilentRefresh) {
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.reloadData(isSilentRefresh);
        }
    }

    @Keep
    public final void resetOverriddenStyles() {
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.resetOverriddenStyles();
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

    public final void setWidgetNativeView$blazesdk_release(@Nullable WidgetMomentsContract widgetMomentsContract) {
        this.widgetNativeView = widgetMomentsContract;
    }

    @Keep
    public final void updateAdsConfigType(@NotNull BlazeMomentsAdsConfigType momentsAdsConfigType) {
        momentsAdsConfigType.getClass();
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.updateAdsConfigType(momentsAdsConfigType);
        }
    }

    @Keep
    public final void updateDataSource(@NotNull BlazeDataSourceType dataSource, boolean isSilentRefresh) {
        dataSource.getClass();
        this.dataSourceType = dataSource;
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.updateDataSource(dataSource, isSilentRefresh);
        }
    }

    @Keep
    public final void updateOverrideStyles(@NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides, boolean shouldUpdateUi) {
        perItemStyleOverrides.getClass();
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.updateOverrideStyles(perItemStyleOverrides, shouldUpdateUi);
        }
    }

    @Keep
    public final void updatePlaybackConfiguration(@Nullable BlazeMomentsPlaybackConfiguration playbackConfiguration) {
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.updatePlaybackConfiguration(playbackConfiguration);
        }
    }

    @Keep
    public final void updatePlayerStyle(@NotNull BlazeMomentsPlayerStyle playerStyle) {
        playerStyle.getClass();
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.updatePlayerStyle(playerStyle);
        }
    }

    @Keep
    public final void updateWidgetLayout(@NotNull BlazeWidgetLayout blazeWidgetLayout) {
        blazeWidgetLayout.getClass();
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.updateWidgetLayout(blazeWidgetLayout);
        }
    }

    @Keep
    public final void updateWidgetsUi() {
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.updateWidgetsUi();
        }
    }

    @Keep
    public final void reloadData() {
        reloadData$default(this, false, 1, null);
    }

    @Keep
    public final void play() {
        WidgetMomentsContract widgetMomentsContract = this.widgetNativeView;
        if (widgetMomentsContract != null) {
            widgetMomentsContract.play();
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
    public BlazeComposeWidgetMomentsStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, null, false, blazeWidgetDelegate, null, null, null, null, 1968, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetMomentsStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, false, blazeWidgetDelegate, null, null, null, null, 1952, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetMomentsStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, z, blazeWidgetDelegate, null, null, null, null, 1920, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetMomentsStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @Nullable String str2) {
        this(str, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, z, blazeWidgetDelegate, str2, null, null, null, 1792, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetMomentsStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @Nullable String str2, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map) {
        this(str, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, z, blazeWidgetDelegate, str2, map, null, null, 1536, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetMomentsStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @Nullable String str2, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        this(str, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, z, blazeWidgetDelegate, str2, map, blazeMomentsPlaybackConfiguration, null, 1024, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    public BlazeComposeWidgetMomentsStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @Nullable String str2, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, @Nullable Function1<? super BlazeWidgetItemClickParams, ? extends BlazeWidgetItemClickHandlerState> function1) {
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        this.widgetId = str;
        this.widgetLayout = blazeWidgetLayout;
        this.playerStyle = blazeMomentsPlayerStyle;
        this.dataSourceType = blazeDataSourceType;
        this.cachingLevel = blazeCachingLevel;
        this.shouldOrderWidgetByReadStatus = z;
        this.widgetDelegate = blazeWidgetDelegate;
        this.widgetRemoteId = str2;
        this.perItemStyleOverrides = map;
        this.playbackConfiguration = blazeMomentsPlaybackConfiguration;
        this.onWidgetItemClickHandler = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetMomentsStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, null, blazeDataSourceType, null, false, blazeWidgetDelegate, null, null, null, null, 1972, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeWidgetDelegate.getClass();
    }
}
