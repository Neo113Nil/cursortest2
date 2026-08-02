package com.blaze.blazesdk.features.moments.container.compose;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazePlayerInContainerDelegate;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.rsm;
import defpackage.sx1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u00101\u001a\u0002022\u0006\u0010.\u001a\u00020-J$\u00103\u001a\u0002022\u001c\b\u0002\u00104\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020206\u0012\u0004\u0012\u000202\u0018\u000105J$\u00107\u001a\u0002022\u001a\b\u0002\u00104\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020206\u0012\u0004\u0012\u00020205H\u0007J\b\u00108\u001a\u000202H\u0007J\b\u00109\u001a\u000202H\u0007J\b\u0010:\u001a\u000202H\u0007J\b\u0010;\u001a\u000202H\u0007J\u0012\u0010<\u001a\u0002022\b\u0010=\u001a\u0004\u0018\u00010\u0011H\u0007JI\u0010>\u001a\u0002022\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010BJ\r\u0010C\u001a\u000202H\u0000¢\u0006\u0002\bDR\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010.\u001a\u0004\u0018\u00010-2\b\u0010,\u001a\u0004\u0018\u00010-@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006E"}, d2 = {"Lcom/blaze/blazesdk/features/moments/container/compose/BlazeMomentsPlayerContainerComposeStateHandler;", "", "dataSource", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "playerInContainerDelegate", "Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;", "shouldOrderMomentsByReadStatus", "", "cachePolicyLevel", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "containerId", "", "momentsPlayerStyle", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "momentsAdsConfigType", "Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "momentsPlaybackConfiguration", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "<init>", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;ZLcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Ljava/lang/String;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "getDataSource$blazesdk_release", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "setDataSource$blazesdk_release", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;)V", "getPlayerInContainerDelegate$blazesdk_release", "()Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;", "getShouldOrderMomentsByReadStatus$blazesdk_release", "()Z", "getCachePolicyLevel$blazesdk_release", "()Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "getContainerId$blazesdk_release", "()Ljava/lang/String;", "getMomentsPlayerStyle$blazesdk_release", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "getMomentsAdsConfigType$blazesdk_release", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "getMomentsPlaybackConfiguration$blazesdk_release", "()Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "momentsPlayerContainer", "Lcom/blaze/blazesdk/features/moments/container/BlazeMomentsPlayerContainer;", "getMomentsPlayerContainer$blazesdk_release", "()Lcom/blaze/blazesdk/features/moments/container/BlazeMomentsPlayerContainer;", "setMomentsPlayerContainer$blazesdk_release", "(Lcom/blaze/blazesdk/features/moments/container/BlazeMomentsPlayerContainer;)V", U3.i.X, "Landroid/widget/FrameLayout;", "containerView", "getContainerView$blazesdk_release", "()Landroid/widget/FrameLayout;", "setContainerView", "", "startPlaying", "completion", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/shared/results/BlazeResult;", "prepareMoments", "dismissPlayer", "onVolumeChanged", "pausePlayer", "resumePlayer", "updatePlaybackConfiguration", "playbackConfiguration", "updateContent", "dataSourceType", TtmlNode.TAG_STYLE, "adsConfigType", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Ljava/lang/Boolean;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;)V", "clean", "clean$blazesdk_release", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeMomentsPlayerContainerComposeStateHandler {
    public static final int $stable = 8;

    @NotNull
    private final BlazeCachingLevel cachePolicyLevel;

    @NotNull
    private final String containerId;

    @Nullable
    private FrameLayout containerView;

    @NotNull
    private BlazeDataSourceType dataSource;

    @NotNull
    private final BlazeMomentsAdsConfigType momentsAdsConfigType;

    @Nullable
    private final BlazeMomentsPlaybackConfiguration momentsPlaybackConfiguration;

    @Nullable
    private BlazeMomentsPlayerContainer momentsPlayerContainer;

    @NotNull
    private final BlazeMomentsPlayerStyle momentsPlayerStyle;

    @NotNull
    private final BlazePlayerInContainerDelegate playerInContainerDelegate;
    private final boolean shouldOrderMomentsByReadStatus;

    @Keep
    public BlazeMomentsPlayerContainerComposeStateHandler(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsAdsConfigType.getClass();
        this.dataSource = blazeDataSourceType;
        this.playerInContainerDelegate = blazePlayerInContainerDelegate;
        this.shouldOrderMomentsByReadStatus = z;
        this.cachePolicyLevel = blazeCachingLevel;
        this.containerId = str;
        this.momentsPlayerStyle = blazeMomentsPlayerStyle;
        this.momentsAdsConfigType = blazeMomentsAdsConfigType;
        this.momentsPlaybackConfiguration = blazeMomentsPlaybackConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void prepareMoments$default(BlazeMomentsPlayerContainerComposeStateHandler blazeMomentsPlayerContainerComposeStateHandler, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new sx1(4);
        }
        blazeMomentsPlayerContainerComposeStateHandler.prepareMoments(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareMoments$lambda$1(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startPlaying$default(BlazeMomentsPlayerContainerComposeStateHandler blazeMomentsPlayerContainerComposeStateHandler, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        blazeMomentsPlayerContainerComposeStateHandler.startPlaying(function1);
    }

    public static /* synthetic */ void updateContent$default(BlazeMomentsPlayerContainerComposeStateHandler blazeMomentsPlayerContainerComposeStateHandler, BlazeDataSourceType blazeDataSourceType, Boolean bool, BlazeCachingLevel blazeCachingLevel, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeDataSourceType = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            blazeCachingLevel = null;
        }
        if ((i & 8) != 0) {
            blazeMomentsPlayerStyle = null;
        }
        if ((i & 16) != 0) {
            blazeMomentsAdsConfigType = null;
        }
        blazeMomentsPlayerContainerComposeStateHandler.updateContent(blazeDataSourceType, bool, blazeCachingLevel, blazeMomentsPlayerStyle, blazeMomentsAdsConfigType);
    }

    public final void clean$blazesdk_release() {
        this.momentsPlayerContainer = null;
    }

    @Keep
    public final void dismissPlayer() {
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.momentsPlayerContainer;
        if (blazeMomentsPlayerContainer != null) {
            blazeMomentsPlayerContainer.dismissPlayer();
        }
    }

    @NotNull
    /* renamed from: getCachePolicyLevel$blazesdk_release, reason: from getter */
    public final BlazeCachingLevel getCachePolicyLevel() {
        return this.cachePolicyLevel;
    }

    @NotNull
    /* renamed from: getContainerId$blazesdk_release, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    @Nullable
    /* renamed from: getContainerView$blazesdk_release, reason: from getter */
    public final FrameLayout getContainerView() {
        return this.containerView;
    }

    @NotNull
    /* renamed from: getDataSource$blazesdk_release, reason: from getter */
    public final BlazeDataSourceType getDataSource() {
        return this.dataSource;
    }

    @NotNull
    /* renamed from: getMomentsAdsConfigType$blazesdk_release, reason: from getter */
    public final BlazeMomentsAdsConfigType getMomentsAdsConfigType() {
        return this.momentsAdsConfigType;
    }

    @Nullable
    /* renamed from: getMomentsPlaybackConfiguration$blazesdk_release, reason: from getter */
    public final BlazeMomentsPlaybackConfiguration getMomentsPlaybackConfiguration() {
        return this.momentsPlaybackConfiguration;
    }

    @Nullable
    /* renamed from: getMomentsPlayerContainer$blazesdk_release, reason: from getter */
    public final BlazeMomentsPlayerContainer getMomentsPlayerContainer() {
        return this.momentsPlayerContainer;
    }

    @NotNull
    /* renamed from: getMomentsPlayerStyle$blazesdk_release, reason: from getter */
    public final BlazeMomentsPlayerStyle getMomentsPlayerStyle() {
        return this.momentsPlayerStyle;
    }

    @NotNull
    /* renamed from: getPlayerInContainerDelegate$blazesdk_release, reason: from getter */
    public final BlazePlayerInContainerDelegate getPlayerInContainerDelegate() {
        return this.playerInContainerDelegate;
    }

    /* renamed from: getShouldOrderMomentsByReadStatus$blazesdk_release, reason: from getter */
    public final boolean getShouldOrderMomentsByReadStatus() {
        return this.shouldOrderMomentsByReadStatus;
    }

    @Keep
    public final void onVolumeChanged() {
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.momentsPlayerContainer;
        if (blazeMomentsPlayerContainer != null) {
            blazeMomentsPlayerContainer.onVolumeChanged();
        }
    }

    @Keep
    public final void pausePlayer() {
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.momentsPlayerContainer;
        if (blazeMomentsPlayerContainer != null) {
            blazeMomentsPlayerContainer.pausePlayer();
        }
    }

    @Keep
    public final void prepareMoments(@NotNull Function1<? super BlazeResult<Unit>, Unit> completion) {
        completion.getClass();
        BlazeMomentsPlayerContainer.INSTANCE.prepareMoments(this.containerId, this.dataSource, this.cachePolicyLevel, this.shouldOrderMomentsByReadStatus, completion);
    }

    @Keep
    public final void resumePlayer() {
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.momentsPlayerContainer;
        if (blazeMomentsPlayerContainer != null) {
            blazeMomentsPlayerContainer.resumePlayer();
        }
    }

    public final void setContainerView(@NotNull FrameLayout containerView) {
        containerView.getClass();
        FrameLayout frameLayout = this.containerView;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.containerView = containerView;
        this.momentsPlayerContainer = new BlazeMomentsPlayerContainer(containerView, this.dataSource, this.playerInContainerDelegate, this.shouldOrderMomentsByReadStatus, this.cachePolicyLevel, this.containerId, this.momentsPlayerStyle, this.momentsAdsConfigType, this.momentsPlaybackConfiguration);
    }

    public final void setDataSource$blazesdk_release(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        this.dataSource = blazeDataSourceType;
    }

    public final void setMomentsPlayerContainer$blazesdk_release(@Nullable BlazeMomentsPlayerContainer blazeMomentsPlayerContainer) {
        this.momentsPlayerContainer = blazeMomentsPlayerContainer;
    }

    public final void startPlaying(@Nullable Function1<? super BlazeResult<Unit>, Unit> completion) {
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.momentsPlayerContainer;
        if (blazeMomentsPlayerContainer != null) {
            blazeMomentsPlayerContainer.startPlaying(completion);
        }
    }

    @Keep
    public final void updateContent() {
        updateContent$default(this, null, null, null, null, null, 31, null);
    }

    @Keep
    public final void updatePlaybackConfiguration(@Nullable BlazeMomentsPlaybackConfiguration playbackConfiguration) {
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.momentsPlayerContainer;
        if (blazeMomentsPlayerContainer != null) {
            blazeMomentsPlayerContainer.updatePlaybackConfiguration(playbackConfiguration);
        }
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType blazeDataSourceType) {
        updateContent$default(this, blazeDataSourceType, null, null, null, null, 30, null);
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType blazeDataSourceType, @Nullable Boolean bool) {
        updateContent$default(this, blazeDataSourceType, bool, null, null, null, 28, null);
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType blazeDataSourceType, @Nullable Boolean bool, @Nullable BlazeCachingLevel blazeCachingLevel) {
        updateContent$default(this, blazeDataSourceType, bool, blazeCachingLevel, null, null, 24, null);
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType blazeDataSourceType, @Nullable Boolean bool, @Nullable BlazeCachingLevel blazeCachingLevel, @Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle) {
        updateContent$default(this, blazeDataSourceType, bool, blazeCachingLevel, blazeMomentsPlayerStyle, null, 16, null);
    }

    @Keep
    public final void updateContent(@Nullable BlazeDataSourceType dataSourceType, @Nullable Boolean shouldOrderMomentsByReadStatus, @Nullable BlazeCachingLevel cachePolicyLevel, @Nullable BlazeMomentsPlayerStyle style, @Nullable BlazeMomentsAdsConfigType adsConfigType) {
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.momentsPlayerContainer;
        if (blazeMomentsPlayerContainer != null) {
            blazeMomentsPlayerContainer.updateContent(dataSourceType, shouldOrderMomentsByReadStatus, cachePolicyLevel, style, adsConfigType);
        }
    }

    @Keep
    public final void prepareMoments() {
        prepareMoments$default(this, null, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainerComposeStateHandler(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType) {
        this(blazeDataSourceType, blazePlayerInContainerDelegate, z, blazeCachingLevel, str, blazeMomentsPlayerStyle, blazeMomentsAdsConfigType, null, 128, null);
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsAdsConfigType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainerComposeStateHandler(@NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType) {
        this(blazeDataSourceType, blazePlayerInContainerDelegate, z, blazeCachingLevel, str, null, blazeMomentsAdsConfigType, null, 160, null);
        blazeDataSourceType.getClass();
        blazePlayerInContainerDelegate.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeMomentsAdsConfigType.getClass();
    }

    public BlazeMomentsPlayerContainerComposeStateHandler(BlazeDataSourceType blazeDataSourceType, BlazePlayerInContainerDelegate blazePlayerInContainerDelegate, boolean z, BlazeCachingLevel blazeCachingLevel, String str, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazeDataSourceType, blazePlayerInContainerDelegate, z, blazeCachingLevel, str, (i & 32) != 0 ? rsm.b : blazeMomentsPlayerStyle, blazeMomentsAdsConfigType, (i & 128) != 0 ? null : blazeMomentsPlaybackConfiguration);
    }
}
