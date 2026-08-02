package com.blaze.blazesdk.features.moments.container.tabs.compose;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.blaze.blazesdk.delegates.BlazePlayerContainerTabsDelegate;
import com.blaze.blazesdk.features.moments.container.tabs.BlazeMomentsPlayerContainerTabs;
import com.blaze.blazesdk.features.moments.container.tabs.models.BlazeMomentsContainerTabItem;
import com.blaze.blazesdk.features.moments.container.tabs.models.BlazeMomentsContainerTabPreparableArgs;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.players.tabs.BlazePlayerTabsStyle;
import com.ironsource.U3;
import defpackage.ttk;
import defpackage.u6b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0007¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0017H\u0007¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010$\u001a\u00020\u0017H\u0007¢\u0006\u0004\b$\u0010\u001fJ\u000f\u0010%\u001a\u00020\u0017H\u0007¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010&\u001a\u00020\u0017H\u0007¢\u0006\u0004\b&\u0010\u001fJ\u000f\u0010'\u001a\u00020\u0017H\u0007¢\u0006\u0004\b'\u0010\u001fJ\u001d\u0010(\u001a\u00020\u00172\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b(\u0010\u001dJ\u0019\u0010)\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010\u001dJ\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0002H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00172\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u00020\u0017H\u0000¢\u0006\u0004\b6\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010Q\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/blaze/blazesdk/features/moments/container/tabs/compose/BlazeMomentsPlayerContainerTabsComposeStateHandler;", "", "", "containerSourceId", "Lcom/blaze/blazesdk/delegates/BlazePlayerContainerTabsDelegate;", "containerTabsDelegate", "", "Lcom/blaze/blazesdk/features/moments/container/tabs/models/BlazeMomentsContainerTabItem;", "tabs", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "playerStyle", "Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;", "tabsStyle", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "playbackConfiguration", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/delegates/BlazePlayerContainerTabsDelegate;Ljava/util/List;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "Landroid/widget/FrameLayout;", "containerView", "Lu6b;", "lifecycleOwner", "Lttk;", "storeOwner", "", "setContainerView", "(Landroid/widget/FrameLayout;Lu6b;Lttk;)V", "Lcom/blaze/blazesdk/features/moments/container/tabs/models/BlazeMomentsContainerTabPreparableArgs;", "preparableArgsList", "prepareTabs", "(Ljava/util/List;)V", "startPlaying", "()V", "dismissPlayer", "resumePlayer", "pausePlayer", "blockPlayerInteraction", "unblockPlayerInteraction", "blockTabsInteraction", "unblockTabsInteraction", "onVolumeChanged", "upsertTabs", "updatePlaybackConfiguration", "(Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "updateTabsStyle", "(Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;)V", "ids", "removeTabs", "containerId", "selectTab", "(Ljava/lang/String;)V", "", "index", "selectTabAt", "(I)V", "clean$blazesdk_release", "clean", "Ljava/lang/String;", "getContainerSourceId$blazesdk_release", "()Ljava/lang/String;", "Lcom/blaze/blazesdk/delegates/BlazePlayerContainerTabsDelegate;", "getContainerTabsDelegate$blazesdk_release", "()Lcom/blaze/blazesdk/delegates/BlazePlayerContainerTabsDelegate;", "Ljava/util/List;", "getTabs$blazesdk_release", "()Ljava/util/List;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "getPlayerStyle$blazesdk_release", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;", "getTabsStyle$blazesdk_release", "()Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "getPlaybackConfiguration$blazesdk_release", "()Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "Lcom/blaze/blazesdk/features/moments/container/tabs/BlazeMomentsPlayerContainerTabs;", "momentsContainerTabs", "Lcom/blaze/blazesdk/features/moments/container/tabs/BlazeMomentsPlayerContainerTabs;", "getMomentsContainerTabs$blazesdk_release", "()Lcom/blaze/blazesdk/features/moments/container/tabs/BlazeMomentsPlayerContainerTabs;", "setMomentsContainerTabs$blazesdk_release", "(Lcom/blaze/blazesdk/features/moments/container/tabs/BlazeMomentsPlayerContainerTabs;)V", U3.i.X, "Landroid/widget/FrameLayout;", "getContainerView$blazesdk_release", "()Landroid/widget/FrameLayout;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeMomentsPlayerContainerTabsComposeStateHandler {
    public static final int $stable = 8;

    @NotNull
    private final String containerSourceId;

    @NotNull
    private final BlazePlayerContainerTabsDelegate containerTabsDelegate;

    @Nullable
    private FrameLayout containerView;

    @Nullable
    private BlazeMomentsPlayerContainerTabs momentsContainerTabs;

    @Nullable
    private final BlazeMomentsPlaybackConfiguration playbackConfiguration;

    @NotNull
    private final BlazeMomentsPlayerStyle playerStyle;

    @NotNull
    private final List<BlazeMomentsContainerTabItem> tabs;

    @NotNull
    private final BlazePlayerTabsStyle tabsStyle;

    @Keep
    public BlazeMomentsPlayerContainerTabsComposeStateHandler(@NotNull String str, @NotNull BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, @NotNull List<BlazeMomentsContainerTabItem> list, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazePlayerTabsStyle blazePlayerTabsStyle, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        str.getClass();
        blazePlayerContainerTabsDelegate.getClass();
        list.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazePlayerTabsStyle.getClass();
        this.containerSourceId = str;
        this.containerTabsDelegate = blazePlayerContainerTabsDelegate;
        this.tabs = list;
        this.playerStyle = blazeMomentsPlayerStyle;
        this.tabsStyle = blazePlayerTabsStyle;
        this.playbackConfiguration = blazeMomentsPlaybackConfiguration;
    }

    @Keep
    public final void blockPlayerInteraction() {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.blockPlayerInteraction();
        }
    }

    @Keep
    public final void blockTabsInteraction() {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.blockTabsInteraction();
        }
    }

    public final void clean$blazesdk_release() {
        this.momentsContainerTabs = null;
        this.containerView = null;
    }

    @Keep
    public final void dismissPlayer() {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.dismissPlayer();
        }
    }

    @NotNull
    /* renamed from: getContainerSourceId$blazesdk_release, reason: from getter */
    public final String getContainerSourceId() {
        return this.containerSourceId;
    }

    @NotNull
    /* renamed from: getContainerTabsDelegate$blazesdk_release, reason: from getter */
    public final BlazePlayerContainerTabsDelegate getContainerTabsDelegate() {
        return this.containerTabsDelegate;
    }

    @Nullable
    /* renamed from: getContainerView$blazesdk_release, reason: from getter */
    public final FrameLayout getContainerView() {
        return this.containerView;
    }

    @Nullable
    /* renamed from: getMomentsContainerTabs$blazesdk_release, reason: from getter */
    public final BlazeMomentsPlayerContainerTabs getMomentsContainerTabs() {
        return this.momentsContainerTabs;
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

    @NotNull
    public final List<BlazeMomentsContainerTabItem> getTabs$blazesdk_release() {
        return this.tabs;
    }

    @NotNull
    /* renamed from: getTabsStyle$blazesdk_release, reason: from getter */
    public final BlazePlayerTabsStyle getTabsStyle() {
        return this.tabsStyle;
    }

    @Keep
    public final void onVolumeChanged() {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.onVolumeChanged();
        }
    }

    @Keep
    public final void pausePlayer() {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.pausePlayer();
        }
    }

    @Keep
    public final void prepareTabs(@NotNull List<BlazeMomentsContainerTabPreparableArgs> preparableArgsList) {
        preparableArgsList.getClass();
        BlazeMomentsPlayerContainerTabs.INSTANCE.prepareTabs(preparableArgsList);
    }

    @Keep
    public final void removeTabs(@NotNull List<String> ids) {
        ids.getClass();
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.removeTabs(ids);
        }
    }

    @Keep
    public final void resumePlayer() {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.resumePlayer();
        }
    }

    @Keep
    public final void selectTab(@NotNull String containerId) {
        containerId.getClass();
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.selectTab(containerId);
        }
    }

    @Keep
    public final void selectTabAt(int index) {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.selectTabAt(index);
        }
    }

    public final void setContainerView(@NotNull FrameLayout containerView, @NotNull u6b lifecycleOwner, @NotNull ttk storeOwner) {
        containerView.getClass();
        lifecycleOwner.getClass();
        storeOwner.getClass();
        FrameLayout frameLayout = this.containerView;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.containerView = containerView;
        this.momentsContainerTabs = new BlazeMomentsPlayerContainerTabs(this.containerSourceId, containerView, this.containerTabsDelegate, this.tabs, this.playerStyle, this.tabsStyle, lifecycleOwner, storeOwner, this.playbackConfiguration);
        startPlaying();
    }

    public final void setMomentsContainerTabs$blazesdk_release(@Nullable BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs) {
        this.momentsContainerTabs = blazeMomentsPlayerContainerTabs;
    }

    @Keep
    public final void startPlaying() {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.startPlaying();
        }
    }

    @Keep
    public final void unblockPlayerInteraction() {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.unblockPlayerInteraction();
        }
    }

    @Keep
    public final void unblockTabsInteraction() {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.unblockTabsInteraction();
        }
    }

    @Keep
    public final void updatePlaybackConfiguration(@Nullable BlazeMomentsPlaybackConfiguration playbackConfiguration) {
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.updatePlaybackConfiguration(playbackConfiguration);
        }
    }

    @Keep
    public final void updateTabsStyle(@NotNull BlazePlayerTabsStyle tabsStyle) {
        tabsStyle.getClass();
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.updateTabsStyle(tabsStyle);
        }
    }

    @Keep
    public final void upsertTabs(@NotNull List<BlazeMomentsContainerTabItem> tabs) {
        tabs.getClass();
        BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs = this.momentsContainerTabs;
        if (blazeMomentsPlayerContainerTabs != null) {
            blazeMomentsPlayerContainerTabs.upsertTabs(tabs);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainerTabsComposeStateHandler(@NotNull String str, @NotNull BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, @NotNull List<BlazeMomentsContainerTabItem> list, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazePlayerTabsStyle blazePlayerTabsStyle) {
        this(str, blazePlayerContainerTabsDelegate, list, blazeMomentsPlayerStyle, blazePlayerTabsStyle, null, 32, null);
        str.getClass();
        blazePlayerContainerTabsDelegate.getClass();
        list.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazePlayerTabsStyle.getClass();
    }

    public /* synthetic */ BlazeMomentsPlayerContainerTabsComposeStateHandler(String str, BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, List list, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazePlayerTabsStyle blazePlayerTabsStyle, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, blazePlayerContainerTabsDelegate, list, blazeMomentsPlayerStyle, blazePlayerTabsStyle, (i & 32) != 0 ? null : blazeMomentsPlaybackConfiguration);
    }
}
