package com.blaze.blazesdk.features.moments.container.tabs;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.delegates.BlazePlayerContainerTabsDelegate;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.moments.container.tabs.models.BlazeMomentsContainerTabItem;
import com.blaze.blazesdk.features.moments.container.tabs.models.BlazeMomentsContainerTabPreparableArgs;
import com.blaze.blazesdk.features.moments.inline.BlazeMomentsInlinePlayer;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.shared.results.p0;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.players.tabs.BlazePlayerTabsStyle;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.brl;
import defpackage.duf;
import defpackage.g49;
import defpackage.g7h;
import defpackage.h49;
import defpackage.hzl;
import defpackage.j1m;
import defpackage.joa;
import defpackage.k13;
import defpackage.ly3;
import defpackage.qtk;
import defpackage.rsm;
import defpackage.stk;
import defpackage.sub;
import defpackage.ttk;
import defpackage.u6b;
import defpackage.ufa;
import defpackage.yim;
import defpackage.yj1;
import defpackage.ypa;
import defpackage.zgm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u00014\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PB_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0007¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u0017H\u0007¢\u0006\u0004\b#\u0010\u0019J\u000f\u0010$\u001a\u00020\u0017H\u0007¢\u0006\u0004\b$\u0010\u0019J\u000f\u0010%\u001a\u00020\u0017H\u0007¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u0017H\u0007¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0017H\u0007¢\u0006\u0004\b'\u0010\u0019J\u0019\u0010(\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0002H\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00100J\u000f\u00103\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010\u0019J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010AR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010BR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/blaze/blazesdk/features/moments/container/tabs/BlazeMomentsPlayerContainerTabs;", "", "", "containerSourceId", "Landroid/widget/FrameLayout;", "containerTabsView", "Lcom/blaze/blazesdk/delegates/BlazePlayerContainerTabsDelegate;", "containerTabsDelegate", "", "Lcom/blaze/blazesdk/features/moments/container/tabs/models/BlazeMomentsContainerTabItem;", "tabs", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "playerStyle", "Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;", "tabsStyle", "Lu6b;", "lifecycleOwner", "Lttk;", "storeOwner", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "playbackConfiguration", "<init>", "(Ljava/lang/String;Landroid/widget/FrameLayout;Lcom/blaze/blazesdk/delegates/BlazePlayerContainerTabsDelegate;Ljava/util/List;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;Lu6b;Lttk;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "", "startPlaying", "()V", "dismissPlayer", "upsertTabs", "(Ljava/util/List;)V", "updateTabsStyle", "(Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;)V", "ids", "removeTabs", "resumePlayer", "pausePlayer", "onVolumeChanged", "blockPlayerInteraction", "unblockPlayerInteraction", "blockTabsInteraction", "unblockTabsInteraction", "updatePlaybackConfiguration", "(Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "containerId", "selectTab", "(Ljava/lang/String;)V", "", "index", "selectTabAt", "(I)V", "position", "startPlayingAt", "setupTabsView", "brl", "createTabsProvider", "()Lbrl;", "getSourceIdForTabsDelegate", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "Landroid/widget/FrameLayout;", "Lcom/blaze/blazesdk/delegates/BlazePlayerContainerTabsDelegate;", "Lu6b;", "Lttk;", "currentPlaybackConfiguration", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "", "Ljava/util/List;", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "Lcom/blaze/blazesdk/style/players/tabs/BlazePlayerTabsStyle;", "Lzgm;", "tabsView", "Lzgm;", "Lyim;", "tabsViewModel$delegate", "Ljoa;", "getTabsViewModel", "()Lyim;", "tabsViewModel", "getVisibleTabs", "()Ljava/util/List;", "visibleTabs", "Companion", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeMomentsPlayerContainerTabs {

    @NotNull
    private final String containerSourceId;

    @NotNull
    private final BlazePlayerContainerTabsDelegate containerTabsDelegate;

    @NotNull
    private final FrameLayout containerTabsView;

    @Nullable
    private BlazeMomentsPlaybackConfiguration currentPlaybackConfiguration;

    @NotNull
    private final u6b lifecycleOwner;

    @NotNull
    private BlazeMomentsPlayerStyle playerStyle;

    @NotNull
    private final ttk storeOwner;

    @NotNull
    private List<BlazeMomentsContainerTabItem> tabs;

    @NotNull
    private BlazePlayerTabsStyle tabsStyle;

    @Nullable
    private zgm tabsView;

    /* renamed from: tabsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa tabsViewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements g49 {
        public final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // defpackage.g49
        public final Object a(Object obj) {
            return ((BlazeMomentsContainerTabItem) obj).getContainerId();
        }

        @Override // defpackage.g49
        public final Iterator l() {
            return this.a.iterator();
        }
    }

    @Keep
    public BlazeMomentsPlayerContainerTabs(@NotNull String str, @NotNull FrameLayout frameLayout, @NotNull BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, @NotNull List<BlazeMomentsContainerTabItem> list, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazePlayerTabsStyle blazePlayerTabsStyle, @NotNull u6b u6bVar, @NotNull ttk ttkVar, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        str.getClass();
        frameLayout.getClass();
        blazePlayerContainerTabsDelegate.getClass();
        list.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazePlayerTabsStyle.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
        this.containerSourceId = str;
        this.containerTabsView = frameLayout;
        this.containerTabsDelegate = blazePlayerContainerTabsDelegate;
        this.lifecycleOwner = u6bVar;
        this.storeOwner = ttkVar;
        this.currentPlaybackConfiguration = blazeMomentsPlaybackConfiguration;
        this.tabs = new ArrayList();
        this.tabsViewModel = ypa.b(new yj1(this, 8));
        Map a2 = h49.a(new a(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a2.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        if (keySet.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.tabs.add(BlazeMomentsContainerTabItem.copy$default((BlazeMomentsContainerTabItem) it.next(), null, null, null, false, null, null, false, null, 255, null));
            }
        } else {
            j1m j1mVar = j1m.a;
            p0 p0Var = new p0();
            int c = sub.c(k13.r(keySet, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(c < 16 ? 16 : c);
            for (Object obj : keySet) {
                linkedHashMap2.put(obj, "duplicateContainerId");
            }
            p0Var.g = linkedHashMap2;
            j1m.a(p0Var);
        }
        this.playerStyle = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeMomentsPlayerStyle);
        this.tabsStyle = (BlazePlayerTabsStyle) ParcelableExtensionKt.blazeDeepCopy(blazePlayerTabsStyle);
    }

    private final brl createTabsProvider() {
        return new brl(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSourceIdForTabsDelegate(String containerId) {
        return this.containerSourceId + '_' + containerId;
    }

    private final yim getTabsViewModel() {
        return (yim) this.tabsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BlazeMomentsContainerTabItem> getVisibleTabs() {
        List<BlazeMomentsContainerTabItem> list = this.tabs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((BlazeMomentsContainerTabItem) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void setupTabsView() {
        this.containerTabsView.removeAllViews();
        Context context = this.containerTabsView.getContext();
        context.getClass();
        zgm zgmVar = new zgm(context, null, 0, this.lifecycleOwner, this.storeOwner, 6, null);
        this.tabsView = zgmVar;
        zgmVar.m((BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(this.playerStyle), this.containerTabsDelegate, this.containerSourceId, createTabsProvider(), this.currentPlaybackConfiguration);
        this.containerTabsView.addView(this.tabsView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r3 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r1 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void startPlayingAt(int position) {
        int i;
        zgm zgmVar;
        zgm zgmVar2;
        String str = getTabsViewModel().c;
        Integer num = null;
        if (str != null) {
            Iterator<T> it = getVisibleTabs().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                if (Intrinsics.c(((BlazeMomentsContainerTabItem) next).getContainerId(), str)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (num != null) {
            if (b.h(getVisibleTabs()).d(num.intValue())) {
                i = num.intValue();
                setupTabsView();
                if (i >= 0 && i < getVisibleTabs().size()) {
                    position = i;
                }
                zgmVar = this.tabsView;
                if (zgmVar != null) {
                    zgmVar.v(position);
                }
                zgmVar2 = this.tabsView;
                if (zgmVar2 == null) {
                    zgmVar2.j(position);
                    return;
                }
                return;
            }
            getVisibleTabs().size();
        }
        i = position;
        setupTabsView();
        if (i >= 0) {
            position = i;
        }
        zgmVar = this.tabsView;
        if (zgmVar != null) {
        }
        zgmVar2 = this.tabsView;
        if (zgmVar2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yim tabsViewModel_delegate$lambda$1(BlazeMomentsPlayerContainerTabs blazeMomentsPlayerContainerTabs) {
        ttk ttkVar = blazeMomentsPlayerContainerTabs.storeOwner;
        String str = blazeMomentsPlayerContainerTabs.containerSourceId;
        ttkVar.getClass();
        str.getClass();
        stk viewModelStore = ttkVar.getViewModelStore();
        qtk s = ufa.s(ttkVar);
        ly3 r = ufa.r(ttkVar);
        viewModelStore.getClass();
        s.getClass();
        r.getClass();
        return (yim) new g7h(viewModelStore, s, r).u(str, duf.a.getOrCreateKotlinClass(yim.class));
    }

    @Keep
    public final void blockPlayerInteraction() {
        hzl hzlVar;
        hzl.b bVar;
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer;
        zgm zgmVar = this.tabsView;
        if (zgmVar == null || (hzlVar = zgmVar.d) == null || (bVar = (hzl.b) hzlVar.j.get(hzlVar.k)) == null || (blazeMomentsInlinePlayer = bVar.c) == null) {
            return;
        }
        blazeMomentsInlinePlayer.blockInteraction();
    }

    @Keep
    public final void blockTabsInteraction() {
        zgm zgmVar = this.tabsView;
        if (zgmVar != null) {
            zgmVar.i = true;
            zgmVar.c.b.setUserInputEnabled(false);
        }
    }

    @Keep
    public final void dismissPlayer() {
        hzl hzlVar;
        zgm zgmVar = this.tabsView;
        if (zgmVar != null && (hzlVar = zgmVar.d) != null) {
            Iterator it = hzlVar.j.values().iterator();
            while (it.hasNext()) {
                BlazeMomentsInlinePlayer blazeMomentsInlinePlayer = ((hzl.b) it.next()).c;
                if (blazeMomentsInlinePlayer != null) {
                    blazeMomentsInlinePlayer.disposeContainer();
                }
            }
        }
        this.containerTabsView.removeView(this.tabsView);
        this.tabsView = null;
    }

    @Keep
    public final void onVolumeChanged() {
        hzl hzlVar;
        zgm zgmVar = this.tabsView;
        if (zgmVar == null || (hzlVar = zgmVar.d) == null) {
            return;
        }
        Iterator it = hzlVar.j.values().iterator();
        while (it.hasNext()) {
            BlazeMomentsInlinePlayer blazeMomentsInlinePlayer = ((hzl.b) it.next()).c;
            if (blazeMomentsInlinePlayer != null) {
                blazeMomentsInlinePlayer.onVolumeChanged();
            }
        }
    }

    @Keep
    public final void pausePlayer() {
        hzl hzlVar;
        hzl.b bVar;
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer;
        zgm zgmVar = this.tabsView;
        if (zgmVar == null || (hzlVar = zgmVar.d) == null || (bVar = (hzl.b) hzlVar.j.get(hzlVar.k)) == null || (blazeMomentsInlinePlayer = bVar.c) == null) {
            return;
        }
        blazeMomentsInlinePlayer.pausePlayer();
    }

    @Keep
    public final void removeTabs(@NotNull List<String> ids) {
        ids.getClass();
        if (ids.isEmpty()) {
            return;
        }
        List<BlazeMomentsContainerTabItem> list = this.tabs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!ids.contains(((BlazeMomentsContainerTabItem) obj).getContainerId())) {
                arrayList.add(obj);
            }
        }
        this.tabs = new ArrayList(arrayList);
        startPlayingAt(0);
    }

    @Keep
    public final void resumePlayer() {
        hzl hzlVar;
        hzl.b bVar;
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer;
        zgm zgmVar = this.tabsView;
        if (zgmVar == null || (hzlVar = zgmVar.d) == null || (bVar = (hzl.b) hzlVar.j.get(hzlVar.k)) == null || (blazeMomentsInlinePlayer = bVar.c) == null) {
            return;
        }
        blazeMomentsInlinePlayer.resumePlayer();
    }

    @Keep
    public final void selectTab(@NotNull String containerId) {
        containerId.getClass();
        zgm zgmVar = this.tabsView;
        if (zgmVar != null) {
            zgmVar.q(containerId);
        }
    }

    @Keep
    public final void selectTabAt(int index) {
        zgm zgmVar = this.tabsView;
        if (zgmVar != null) {
            zgmVar.s(index);
        }
    }

    @Keep
    public final void startPlaying() {
        startPlayingAt(0);
    }

    @Keep
    public final void unblockPlayerInteraction() {
        hzl hzlVar;
        hzl.b bVar;
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer;
        zgm zgmVar = this.tabsView;
        if (zgmVar == null || (hzlVar = zgmVar.d) == null || (bVar = (hzl.b) hzlVar.j.get(hzlVar.k)) == null || (blazeMomentsInlinePlayer = bVar.c) == null) {
            return;
        }
        blazeMomentsInlinePlayer.unblockInteraction();
    }

    @Keep
    public final void unblockTabsInteraction() {
        zgm zgmVar = this.tabsView;
        if (zgmVar != null) {
            zgmVar.i = false;
            zgmVar.c.b.setUserInputEnabled(true);
        }
    }

    @Keep
    public final void updatePlaybackConfiguration(@Nullable BlazeMomentsPlaybackConfiguration playbackConfiguration) {
        hzl hzlVar;
        this.currentPlaybackConfiguration = playbackConfiguration;
        zgm zgmVar = this.tabsView;
        if (zgmVar == null || (hzlVar = zgmVar.d) == null) {
            return;
        }
        hzlVar.i = playbackConfiguration;
        Iterator it = hzlVar.j.values().iterator();
        while (it.hasNext()) {
            BlazeMomentsInlinePlayer blazeMomentsInlinePlayer = ((hzl.b) it.next()).c;
            if (blazeMomentsInlinePlayer != null) {
                blazeMomentsInlinePlayer.updatePlaybackConfiguration(playbackConfiguration);
            }
        }
    }

    @Keep
    public final void updateTabsStyle(@NotNull BlazePlayerTabsStyle tabsStyle) {
        tabsStyle.getClass();
        this.tabsStyle = (BlazePlayerTabsStyle) ParcelableExtensionKt.blazeDeepCopy(tabsStyle);
        zgm zgmVar = this.tabsView;
        if (zgmVar != null) {
            zgmVar.u();
        }
    }

    @Keep
    public final void upsertTabs(@NotNull List<BlazeMomentsContainerTabItem> tabs) {
        tabs.getClass();
        if (tabs.isEmpty()) {
            return;
        }
        List<BlazeMomentsContainerTabItem> list = this.tabs;
        int c = sub.c(k13.r(list, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (Object obj : list) {
            linkedHashMap.put(((BlazeMomentsContainerTabItem) obj).getContainerId(), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (BlazeMomentsContainerTabItem blazeMomentsContainerTabItem : tabs) {
            linkedHashMap2.put(blazeMomentsContainerTabItem.getContainerId(), BlazeMomentsContainerTabItem.copy$default(blazeMomentsContainerTabItem, null, null, null, false, null, null, false, null, 255, null));
        }
        this.tabs = CollectionsKt.U0(linkedHashMap2.values());
        startPlayingAt(0);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/features/moments/container/tabs/BlazeMomentsPlayerContainerTabs$Companion;", "", "<init>", "()V", "prepareSingleTab", "", "preparableArgs", "Lcom/blaze/blazesdk/features/moments/container/tabs/models/BlazeMomentsContainerTabPreparableArgs;", "prepareTabs", "preparableArgsList", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void prepareSingleTab(BlazeMomentsContainerTabPreparableArgs preparableArgs) {
            BlazeMomentsInlinePlayer.INSTANCE.prepareMoments(preparableArgs.getContainerId(), preparableArgs.getDataSource(), preparableArgs.getShouldOrderMomentsByReadStatus(), preparableArgs.getCachePolicyLevel());
        }

        @Keep
        public final void prepareTabs(@NotNull List<BlazeMomentsContainerTabPreparableArgs> preparableArgsList) {
            preparableArgsList.getClass();
            Iterator<T> it = preparableArgsList.iterator();
            while (it.hasNext()) {
                BlazeMomentsPlayerContainerTabs.INSTANCE.prepareSingleTab((BlazeMomentsContainerTabPreparableArgs) it.next());
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainerTabs(@NotNull String str, @NotNull FrameLayout frameLayout, @NotNull BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, @NotNull List<BlazeMomentsContainerTabItem> list, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        this(str, frameLayout, blazePlayerContainerTabsDelegate, list, blazeMomentsPlayerStyle, null, u6bVar, ttkVar, null, 288, null);
        str.getClass();
        frameLayout.getClass();
        blazePlayerContainerTabsDelegate.getClass();
        list.getClass();
        blazeMomentsPlayerStyle.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainerTabs(@NotNull String str, @NotNull FrameLayout frameLayout, @NotNull BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, @NotNull List<BlazeMomentsContainerTabItem> list, @NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazePlayerTabsStyle blazePlayerTabsStyle, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        this(str, frameLayout, blazePlayerContainerTabsDelegate, list, blazeMomentsPlayerStyle, blazePlayerTabsStyle, u6bVar, ttkVar, null, NotificationCompat.FLAG_LOCAL_ONLY, null);
        str.getClass();
        frameLayout.getClass();
        blazePlayerContainerTabsDelegate.getClass();
        list.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazePlayerTabsStyle.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsPlayerContainerTabs(@NotNull String str, @NotNull FrameLayout frameLayout, @NotNull BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, @NotNull List<BlazeMomentsContainerTabItem> list, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        this(str, frameLayout, blazePlayerContainerTabsDelegate, list, null, null, u6bVar, ttkVar, null, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, null);
        str.getClass();
        frameLayout.getClass();
        blazePlayerContainerTabsDelegate.getClass();
        list.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
    }

    public BlazeMomentsPlayerContainerTabs(String str, FrameLayout frameLayout, BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, List list, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazePlayerTabsStyle blazePlayerTabsStyle, u6b u6bVar, ttk ttkVar, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, frameLayout, blazePlayerContainerTabsDelegate, list, (i & 16) != 0 ? rsm.b : blazeMomentsPlayerStyle, (i & 32) != 0 ? BlazePlayerTabsStyle.INSTANCE.base() : blazePlayerTabsStyle, u6bVar, ttkVar, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : blazeMomentsPlaybackConfiguration);
    }
}
