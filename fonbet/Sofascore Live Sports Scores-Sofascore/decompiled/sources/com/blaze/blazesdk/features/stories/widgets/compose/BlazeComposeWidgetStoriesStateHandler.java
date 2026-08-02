package com.blaze.blazesdk.features.stories.widgets.compose;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickHandlerState;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickParams;
import com.blaze.blazesdk.features.stories.widgets.WidgetStoriesContract;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
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
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020\u0010H\u0007J\u001a\u0010;\u001a\u0002092\u0006\u0010<\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\u0010H\u0007J\u0010\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020?H\u0007J(\u0010@\u001a\u0002092\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\b\b\u0002\u0010A\u001a\u00020\u0010H\u0007J\b\u0010B\u001a\u000209H\u0007J\b\u0010C\u001a\u000209H\u0007J\b\u0010D\u001a\u000209H\u0007J\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020FH\u0007J\n\u0010G\u001a\u0004\u0018\u00010\u0005H\u0007J\n\u0010H\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010I\u001a\u0002092\u0006\u0010J\u001a\u00020\u0005H\u0007J\u0010\u0010K\u001a\u0002092\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006L"}, d2 = {"Lcom/blaze/blazesdk/features/stories/widgets/compose/BlazeComposeWidgetStoriesStateHandler;", "", "widgetId", "", "widgetLayout", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "playerStyle", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;", "dataSourceType", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "cachingLevel", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "widgetDelegate", "Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;", "widgetRemoteId", "shouldOrderWidgetByReadStatus", "", "perItemStyleOverrides", "", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "onWidgetItemClickHandler", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickParams;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickHandlerState;", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;Ljava/lang/String;ZLjava/util/Map;Lkotlin/jvm/functions/Function1;)V", "getWidgetId", "()Ljava/lang/String;", "getWidgetLayout$blazesdk_release", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getPlayerStyle$blazesdk_release", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;", "getDataSourceType$blazesdk_release", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "setDataSourceType$blazesdk_release", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;)V", "getCachingLevel$blazesdk_release", "()Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "getWidgetDelegate$blazesdk_release", "()Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;", "getWidgetRemoteId$blazesdk_release", "getShouldOrderWidgetByReadStatus$blazesdk_release", "()Z", "getPerItemStyleOverrides$blazesdk_release", "()Ljava/util/Map;", "setPerItemStyleOverrides$blazesdk_release", "(Ljava/util/Map;)V", "getOnWidgetItemClickHandler$blazesdk_release", "()Lkotlin/jvm/functions/Function1;", "widgetNativeView", "Lcom/blaze/blazesdk/features/stories/widgets/WidgetStoriesContract;", "getWidgetNativeView$blazesdk_release", "()Lcom/blaze/blazesdk/features/stories/widgets/WidgetStoriesContract;", "setWidgetNativeView$blazesdk_release", "(Lcom/blaze/blazesdk/features/stories/widgets/WidgetStoriesContract;)V", "reloadData", "", "isSilentRefresh", "updateDataSource", "dataSource", "updateAdsConfigType", "storiesAdsConfigType", "Lcom/blaze/blazesdk/ads/models/ui/BlazeStoriesAdsConfigType;", "updateOverrideStyles", "shouldUpdateUi", "resetOverriddenStyles", "updateWidgetsUi", "play", "from", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "getCurrentWidgetLayout", "getCurrentPlayerStyle", "updateWidgetLayout", "blazeWidgetLayout", "updatePlayerStyle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeComposeWidgetStoriesStateHandler {
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
    private final BlazeStoryPlayerStyle playerStyle;
    private final boolean shouldOrderWidgetByReadStatus;

    @NotNull
    private final BlazeWidgetDelegate widgetDelegate;

    @NotNull
    private final String widgetId;

    @NotNull
    private final BlazeWidgetLayout widgetLayout;

    @Nullable
    private WidgetStoriesContract widgetNativeView;

    @Nullable
    private final String widgetRemoteId;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public BlazeComposeWidgetStoriesStateHandler(java.lang.String r14, com.blaze.blazesdk.style.widgets.BlazeWidgetLayout r15, com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle r16, com.blaze.blazesdk.data_source.BlazeDataSourceType r17, com.blaze.blazesdk.prefetch.models.BlazeCachingLevel r18, com.blaze.blazesdk.delegates.BlazeWidgetDelegate r19, java.lang.String r20, boolean r21, java.util.Map r22, kotlin.jvm.functions.Function1 r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 4
            if (r1 == 0) goto La
            com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle r1 = defpackage.bxm.b
            r5 = r1
            goto Lc
        La:
            r5 = r16
        Lc:
            r1 = r0 & 16
            if (r1 == 0) goto L14
            com.blaze.blazesdk.prefetch.models.BlazeCachingLevel r1 = com.blaze.blazesdk.prefetch.models.BlazeCachingLevel.DEFAULT
            r7 = r1
            goto L16
        L14:
            r7 = r18
        L16:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L1d
            r9 = r2
            goto L1f
        L1d:
            r9 = r20
        L1f:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L26
            r1 = 1
            r10 = r1
            goto L28
        L26:
            r10 = r21
        L28:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L33
            lm5 r1 = defpackage.lm5.a
            r1.getClass()
            r11 = r1
            goto L35
        L33:
            r11 = r22
        L35:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L42
            r12 = r2
            r3 = r14
            r4 = r15
            r6 = r17
            r8 = r19
            r2 = r13
            goto L4b
        L42:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            r8 = r19
        L4b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler.<init>(java.lang.String, com.blaze.blazesdk.style.widgets.BlazeWidgetLayout, com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle, com.blaze.blazesdk.data_source.BlazeDataSourceType, com.blaze.blazesdk.prefetch.models.BlazeCachingLevel, com.blaze.blazesdk.delegates.BlazeWidgetDelegate, java.lang.String, boolean, java.util.Map, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ void reloadData$default(BlazeComposeWidgetStoriesStateHandler blazeComposeWidgetStoriesStateHandler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        blazeComposeWidgetStoriesStateHandler.reloadData(z);
    }

    public static /* synthetic */ void updateDataSource$default(BlazeComposeWidgetStoriesStateHandler blazeComposeWidgetStoriesStateHandler, BlazeDataSourceType blazeDataSourceType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        blazeComposeWidgetStoriesStateHandler.updateDataSource(blazeDataSourceType, z);
    }

    public static /* synthetic */ void updateOverrideStyles$default(BlazeComposeWidgetStoriesStateHandler blazeComposeWidgetStoriesStateHandler, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        blazeComposeWidgetStoriesStateHandler.updateOverrideStyles(map, z);
    }

    @NotNull
    /* renamed from: getCachingLevel$blazesdk_release, reason: from getter */
    public final BlazeCachingLevel getCachingLevel() {
        return this.cachingLevel;
    }

    @Keep
    @Nullable
    public final BlazeStoryPlayerStyle getCurrentPlayerStyle() {
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            return widgetStoriesContract.getCurrentPlayerStyle();
        }
        return null;
    }

    @Keep
    @Nullable
    public final BlazeWidgetLayout getCurrentWidgetLayout() {
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            return widgetStoriesContract.getCurrentWidgetLayout();
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
    public final BlazeStoryPlayerStyle getPlayerStyle() {
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
    public final WidgetStoriesContract getWidgetNativeView() {
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
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.play(from);
        }
    }

    @Keep
    public final void reloadData(boolean isSilentRefresh) {
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.reloadData(isSilentRefresh);
        }
    }

    @Keep
    public final void resetOverriddenStyles() {
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.resetOverriddenStyles();
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

    public final void setWidgetNativeView$blazesdk_release(@Nullable WidgetStoriesContract widgetStoriesContract) {
        this.widgetNativeView = widgetStoriesContract;
    }

    @Keep
    public final void updateAdsConfigType(@NotNull BlazeStoriesAdsConfigType storiesAdsConfigType) {
        storiesAdsConfigType.getClass();
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.updateAdsConfigType(storiesAdsConfigType);
        }
    }

    @Keep
    public final void updateDataSource(@NotNull BlazeDataSourceType dataSource, boolean isSilentRefresh) {
        dataSource.getClass();
        this.dataSourceType = dataSource;
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.updateDataSource(dataSource, isSilentRefresh);
        }
    }

    @Keep
    public final void updateOverrideStyles(@NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides, boolean shouldUpdateUi) {
        perItemStyleOverrides.getClass();
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.updateOverrideStyles(perItemStyleOverrides, shouldUpdateUi);
        }
    }

    @Keep
    public final void updatePlayerStyle(@NotNull BlazeStoryPlayerStyle playerStyle) {
        playerStyle.getClass();
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.updatePlayerStyle(playerStyle);
        }
    }

    @Keep
    public final void updateWidgetLayout(@NotNull BlazeWidgetLayout blazeWidgetLayout) {
        blazeWidgetLayout.getClass();
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.updateWidgetLayout(blazeWidgetLayout);
        }
    }

    @Keep
    public final void updateWidgetsUi() {
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.updateWidgetsUi();
        }
    }

    @Keep
    public final void reloadData() {
        reloadData$default(this, false, 1, null);
    }

    @Keep
    public final void play() {
        WidgetStoriesContract widgetStoriesContract = this.widgetNativeView;
        if (widgetStoriesContract != null) {
            widgetStoriesContract.play();
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
    public BlazeComposeWidgetStoriesStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, null, blazeWidgetDelegate, null, false, null, null, 976, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetStoriesStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, blazeCachingLevel, blazeWidgetDelegate, null, false, null, null, 960, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetStoriesStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @Nullable String str2) {
        this(str, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, blazeCachingLevel, blazeWidgetDelegate, str2, false, null, null, 896, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetStoriesStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @Nullable String str2, boolean z) {
        this(str, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, blazeCachingLevel, blazeWidgetDelegate, str2, z, null, null, 768, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetStoriesStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @Nullable String str2, boolean z, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map) {
        this(str, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, blazeCachingLevel, blazeWidgetDelegate, str2, z, map, null, 512, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    public BlazeComposeWidgetStoriesStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @Nullable String str2, boolean z, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map, @Nullable Function1<? super BlazeWidgetItemClickParams, ? extends BlazeWidgetItemClickHandlerState> function1) {
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeStoryPlayerStyle.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        this.widgetId = str;
        this.widgetLayout = blazeWidgetLayout;
        this.playerStyle = blazeStoryPlayerStyle;
        this.dataSourceType = blazeDataSourceType;
        this.cachingLevel = blazeCachingLevel;
        this.widgetDelegate = blazeWidgetDelegate;
        this.widgetRemoteId = str2;
        this.shouldOrderWidgetByReadStatus = z;
        this.perItemStyleOverrides = map;
        this.onWidgetItemClickHandler = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeComposeWidgetStoriesStateHandler(@NotNull String str, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        this(str, blazeWidgetLayout, null, blazeDataSourceType, null, blazeWidgetDelegate, null, false, null, null, 980, null);
        str.getClass();
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeWidgetDelegate.getClass();
    }
}
