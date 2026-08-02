package com.blaze.blazesdk.players.inline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.players.contracts.BlazeInlinePlayerContract;
import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.exceptions.BlazeException;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.i0;
import com.blaze.blazesdk.shared.results.j0;
import com.blaze.blazesdk.shared.results.n0;
import com.blaze.blazesdk.shared.results.o0;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a1n;
import defpackage.a70;
import defpackage.aea;
import defpackage.atl;
import defpackage.bea;
import defpackage.c1m;
import defpackage.d5m;
import defpackage.dqm;
import defpackage.erm;
import defpackage.ful;
import defpackage.g9i;
import defpackage.gfm;
import defpackage.gtl;
import defpackage.gx1;
import defpackage.gzk;
import defpackage.hag;
import defpackage.ham;
import defpackage.hom;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.i9a;
import defpackage.ihm;
import defpackage.ix1;
import defpackage.j1m;
import defpackage.j4;
import defpackage.jnm;
import defpackage.joa;
import defpackage.k6b;
import defpackage.ke;
import defpackage.ku3;
import defpackage.l4m;
import defpackage.ls1;
import defpackage.lu3;
import defpackage.n1n;
import defpackage.nf5;
import defpackage.nsm;
import defpackage.o7m;
import defpackage.ori;
import defpackage.ovm;
import defpackage.qum;
import defpackage.r69;
import defpackage.rob;
import defpackage.rpl;
import defpackage.rq3;
import defpackage.rq4;
import defpackage.rum;
import defpackage.sxl;
import defpackage.t;
import defpackage.tjk;
import defpackage.ttk;
import defpackage.u2;
import defpackage.u6b;
import defpackage.ucm;
import defpackage.v61;
import defpackage.wca;
import defpackage.wlm;
import defpackage.x0m;
import defpackage.xom;
import defpackage.xtm;
import defpackage.xw3;
import defpackage.xwl;
import defpackage.xwm;
import defpackage.y6a;
import defpackage.yda;
import defpackage.ypa;
import defpackage.yql;
import defpackage.z45;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 x*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\b\u0002\u0010\u0006*\u00020\u0005*\b\b\u0003\u0010\b*\u00020\u00072\u00020\t:\u0001yB'\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0002H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0005¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0017¢\u0006\u0004\b!\u0010\u0016J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0017¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0014H\u0017¢\u0006\u0004\b&\u0010\u0016J\u000f\u0010'\u001a\u00020\u0014H\u0017¢\u0006\u0004\b'\u0010\u0016J\u000f\u0010(\u001a\u00020\u0014H\u0017¢\u0006\u0004\b(\u0010\u0016J\u000f\u0010)\u001a\u00020\u0014H\u0017¢\u0006\u0004\b)\u0010\u0016J\u000f\u0010*\u001a\u00020\u0014H\u0017¢\u0006\u0004\b*\u0010\u0016J\u000f\u0010+\u001a\u00020\u0014H\u0017¢\u0006\u0004\b+\u0010\u0016J\u000f\u0010,\u001a\u00020\u0014H\u0017¢\u0006\u0004\b,\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u001a\u00108\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\"8\u0004X\u0084D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010B\u001a\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00018\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R$\u0010_\u001a\u0004\u0018\u00010^8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010f\u001a\u0004\u0018\u00010e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010l\u001a\u0004\u0018\u00018\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010]R\u001b\u0010w\u001a\u00020s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010B\u001a\u0004\bu\u0010v¨\u0006z"}, d2 = {"Lcom/blaze/blazesdk/players/inline/BlazeBaseInlinePlayerContainer;", "Lc1m;", "VM", "Lful;", "PlayerView", "Lhom;", "Args", "Ltjk;", "ContentModel", "Lcom/blaze/blazesdk/players/contracts/BlazeInlinePlayerContract;", "Landroid/widget/FrameLayout;", "containerView", "", "containerId", "Lu6b;", "lifecycleOwner", "Lttk;", "storeOwner", "<init>", "(Landroid/widget/FrameLayout;Ljava/lang/String;Lu6b;Lttk;)V", "", "triggerPlaceholderToPlayerTransition", "()V", "Lrpl;", "wrapperView", "args", "onPlayerWrapperViewAttached", "(Lrpl;Lhom;)V", "onPlayerWrapperViewDetached", "(Lrpl;)V", "handlePlayerAlreadyShown", "internalDismissPlayer", "internalDisposeContainer", "embedPlaceholder", "", "shouldAutoPlayOnStart", "embedPlayer", "(Z)V", "resetToPlaceholder", "disposeContainer", "resumePlayer", "pausePlayer", "blockInteraction", "unblockInteraction", "onVolumeChanged", "Landroid/widget/FrameLayout;", "getContainerView$blazesdk_release", "()Landroid/widget/FrameLayout;", "Ljava/lang/String;", "getContainerId$blazesdk_release", "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "storeOwnerWeak", "Ljava/lang/ref/WeakReference;", "lifecycleOwnerWeak", "Lnsm;", "modeManager", "Lnsm;", "getModeManager$blazesdk_release", "()Lnsm;", "shouldClearRepoAfterSessionEnd", "Z", "getShouldClearRepoAfterSessionEnd", "()Z", "Lyql;", "internalPlayerEventHandler$delegate", "Ljoa;", "getInternalPlayerEventHandler", "()Lyql;", "internalPlayerEventHandler", "Lrq4;", "lifecycleObserver", "Lrq4;", "Lsxl;", "lifecycleObserverCancellable", "Lsxl;", "Lyda;", "preloadJob", "Lyda;", "placeholderUIJob", "playerUIJob", "Lovm;", "transitionManager$delegate", "getTransitionManager", "()Lovm;", "transitionManager", "playerView", "Lful;", "getPlayerView", "()Lful;", "setPlayerView", "(Lful;)V", "playerWrapperView", "Lrpl;", "Landroid/view/ViewGroup;", "placeholderWrapperView", "Landroid/view/ViewGroup;", "getPlaceholderWrapperView", "()Landroid/view/ViewGroup;", "setPlaceholderWrapperView", "(Landroid/view/ViewGroup;)V", "Landroid/widget/ImageView;", "placeholderImageView", "Landroid/widget/ImageView;", "getPlaceholderImageView", "()Landroid/widget/ImageView;", "setPlaceholderImageView", "(Landroid/widget/ImageView;)V", "playerArgs", "Lhom;", "getPlayerArgs", "()Lhom;", "setPlayerArgs", "(Lhom;)V", "middlemanContainerView", "Landroid/content/BroadcastReceiver;", "playerBroadcastReceiver$delegate", "getPlayerBroadcastReceiver", "()Landroid/content/BroadcastReceiver;", "playerBroadcastReceiver", "Companion", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazeBaseInlinePlayerContainer<VM extends c1m, PlayerView extends ful, Args extends hom, ContentModel extends tjk> implements BlazeInlinePlayerContract {

    @NotNull
    private static final String TAG = "BlazeBasePlayerContainer";

    @NotNull
    private final String containerId;

    @NotNull
    private final FrameLayout containerView;

    /* renamed from: internalPlayerEventHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa internalPlayerEventHandler;

    @Nullable
    private rq4 lifecycleObserver;

    @Nullable
    private sxl lifecycleObserverCancellable;

    @NotNull
    private final WeakReference<u6b> lifecycleOwnerWeak;

    @Nullable
    private rpl middlemanContainerView;

    @NotNull
    private final nsm modeManager;

    @Nullable
    private ImageView placeholderImageView;

    @Nullable
    private yda placeholderUIJob;

    @Nullable
    private ViewGroup placeholderWrapperView;

    @Nullable
    private Args playerArgs;

    /* renamed from: playerBroadcastReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa playerBroadcastReceiver;

    @Nullable
    private yda playerUIJob;

    @Nullable
    private PlayerView playerView;

    @Nullable
    private rpl playerWrapperView;

    @Nullable
    private yda preloadJob;
    private final boolean shouldClearRepoAfterSessionEnd;

    @NotNull
    private final WeakReference<ttk> storeOwnerWeak;

    /* renamed from: transitionManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa transitionManager;
    public static final int $stable = 8;

    public BlazeBaseInlinePlayerContainer(@NotNull FrameLayout frameLayout, @NotNull String str, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        frameLayout.getClass();
        str.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
        this.containerView = frameLayout;
        this.containerId = str;
        this.storeOwnerWeak = new WeakReference<>(ttkVar);
        this.lifecycleOwnerWeak = new WeakReference<>(u6bVar);
        this.modeManager = new nsm();
        this.internalPlayerEventHandler = ypa.b(new gx1(this, 2));
        this.transitionManager = ypa.b(new gx1(this, 3));
        this.playerBroadcastReceiver = ypa.b(new gx1(this, 4));
    }

    public static final yql access$getInternalPlayerEventHandler(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer) {
        return (yql) blazeBaseInlinePlayerContainer.internalPlayerEventHandler.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (defpackage.evl.b(r9, r10, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r11.invoke(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (defpackage.xw3.R(r9, r11, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$preloadContentWithEmptyOrFailureHandling(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, boolean z, Function1 function1, Function2 function2, rq3 rq3Var) {
        jnm jnmVar;
        int i;
        gfm gfmVar;
        Function1 function12;
        blazeBaseInlinePlayerContainer.getClass();
        if (rq3Var instanceof jnm) {
            jnmVar = (jnm) rq3Var;
            int i2 = jnmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jnmVar.v = i2 - Integer.MIN_VALUE;
                Object obj = jnmVar.t;
                Object obj2 = lu3.a;
                i = jnmVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    jnmVar.r = function1;
                    jnmVar.s = function2;
                    jnmVar.v = 1;
                    obj = blazeBaseInlinePlayerContainer.preloadContent(z, jnmVar);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            if (i != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            return Unit.a;
                        }
                        gfmVar = (gfm) jnmVar.s;
                        function12 = (Function1) jnmVar.r;
                        y6a.M(obj);
                        if (gfmVar instanceof g0) {
                            g0 g0Var = (g0) gfmVar;
                            j1m.a(g0Var);
                            if (function12 != null) {
                                BlazeResult.Error d = g0Var.d();
                                jnmVar.r = gfmVar;
                                jnmVar.s = null;
                                jnmVar.v = 4;
                            }
                        }
                        return Unit.a;
                    }
                    function2 = (Function2) jnmVar.s;
                    function1 = (Function1) jnmVar.r;
                    y6a.M(obj);
                }
                gfmVar = (gfm) obj;
                if (gfmVar instanceof ihm) {
                    List list = (List) ((ihm) gfmVar).a;
                    if (list.isEmpty()) {
                        hs4 hs4Var = z45.a;
                        r69 r69Var = rob.a;
                        xom xomVar = new xom(function1, null);
                        jnmVar.r = function1;
                        jnmVar.s = gfmVar;
                        jnmVar.v = 3;
                    } else {
                        jnmVar.r = function1;
                        jnmVar.s = gfmVar;
                        jnmVar.v = 2;
                    }
                    if (gfmVar instanceof g0) {
                    }
                    return Unit.a;
                }
                function12 = function1;
                if (gfmVar instanceof g0) {
                }
                return Unit.a;
            }
        }
        jnmVar = new jnm(blazeBaseInlinePlayerContainer, rq3Var);
        Object obj3 = jnmVar.t;
        Object obj22 = lu3.a;
        i = jnmVar.v;
        if (i != 0) {
        }
        gfmVar = (gfm) obj3;
        if (gfmVar instanceof ihm) {
        }
        function12 = function1;
        if (gfmVar instanceof g0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r20.invoke(r4, r1) == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r14.a(r19, r18, r17, r1) == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$prepareViewingRecordWithFailureHandling(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, List list, boolean z, boolean z2, Function0 function0, Function1 function1, Function2 function2, rq3 rq3Var) {
        dqm dqmVar;
        int i;
        blazeBaseInlinePlayerContainer.getClass();
        if (rq3Var instanceof dqm) {
            dqmVar = (dqm) rq3Var;
            int i2 = dqmVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dqmVar.t = i2 - Integer.MIN_VALUE;
                Object obj = dqmVar.r;
                Object obj2 = lu3.a;
                i = dqmVar.t;
                rum rumVar = null;
                if (i != 0) {
                    y6a.M(obj);
                    xwm viewingRecordManager = blazeBaseInlinePlayerContainer.getViewingRecordManager();
                    viewingRecordManager.getClass();
                    String str = viewingRecordManager.a;
                    t tVar = viewingRecordManager.b;
                    list.getClass();
                    if (!list.isEmpty()) {
                        atl atlVar = (atl) tVar;
                        atlVar.getClass();
                        str.getClass();
                        rumVar = (rum) atlVar.a.get(str);
                        if (rumVar == null) {
                            tjk tjkVar = (tjk) CollectionsKt.Y(list);
                            rum rumVar2 = new rum(tjkVar.getId(), 0, 0L, tjkVar.f(), null);
                            atlVar.getClass();
                            atlVar.a.put(str, rumVar2);
                            rumVar = rumVar2;
                        }
                    }
                    if (rumVar != null) {
                        blazeBaseInlinePlayerContainer.createOrUpdatePlayerViewArgs(rumVar.a, z);
                        dqmVar.t = 1;
                    } else {
                        dqmVar.t = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        dqmVar = new dqm(blazeBaseInlinePlayerContainer, rq3Var);
        Object obj3 = dqmVar.r;
        Object obj22 = lu3.a;
        i = dqmVar.t;
        rum rumVar3 = null;
        if (i != 0) {
        }
        return Unit.a;
    }

    public static final void access$registerBroadcastReceivers(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Context context) {
        blazeBaseInlinePlayerContainer.b(context);
        LocalBroadcastManager.getInstance(context).registerReceiver((BroadcastReceiver) blazeBaseInlinePlayerContainer.playerBroadcastReceiver.getValue(), new IntentFilter("player_broadcast"));
    }

    public static final void access$routePlaceholderEmbeddingByState(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, rum rumVar, Function0 function0, ku3 ku3Var) {
        int ordinal = blazeBaseInlinePlayerContainer.modeManager.a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    blazeBaseInlinePlayerContainer.a(rumVar, ku3Var, function0);
                    return;
                } else {
                    zzl.b();
                    return;
                }
            }
            return;
        }
        nsm nsmVar = blazeBaseInlinePlayerContainer.modeManager;
        erm ermVar = erm.PLACEHOLDER;
        nsmVar.getClass();
        ermVar.getClass();
        nsmVar.a = ermVar;
        blazeBaseInlinePlayerContainer.configurePlaceholderWithLatestRecord(rumVar);
        ViewGroup viewGroup = blazeBaseInlinePlayerContainer.placeholderWrapperView;
        if (viewGroup != null) {
            ovm ovmVar = (ovm) blazeBaseInlinePlayerContainer.transitionManager.getValue();
            ovmVar.getClass();
            if (ovmVar.a.a(ermVar)) {
                viewGroup.setAlpha(1.0f);
                viewGroup.setVisibility(0);
            }
        }
    }

    public static final void access$routePlayerEmbeddingByState(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, rum rumVar, u6b u6bVar, ttk ttkVar) {
        int ordinal = blazeBaseInlinePlayerContainer.modeManager.a.ordinal();
        if (ordinal == 0) {
            Args args = blazeBaseInlinePlayerContainer.playerArgs;
            if (args == null) {
                return;
            }
            blazeBaseInlinePlayerContainer.d();
            nsm nsmVar = blazeBaseInlinePlayerContainer.modeManager;
            erm ermVar = erm.PLAYER;
            nsmVar.getClass();
            ermVar.getClass();
            nsmVar.a = ermVar;
            Context context = blazeBaseInlinePlayerContainer.containerView.getContext();
            context.getClass();
            rpl a = blazeBaseInlinePlayerContainer.a(context, u6bVar, args, ttkVar);
            blazeBaseInlinePlayerContainer.playerWrapperView = a;
            rpl rplVar = blazeBaseInlinePlayerContainer.middlemanContainerView;
            if (rplVar != null) {
                rplVar.addView(a, 0);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                blazeBaseInlinePlayerContainer.handlePlayerAlreadyShown();
                return;
            } else {
                zzl.b();
                return;
            }
        }
        Args args2 = blazeBaseInlinePlayerContainer.playerArgs;
        if (args2 == null) {
            return;
        }
        blazeBaseInlinePlayerContainer.d();
        nsm nsmVar2 = blazeBaseInlinePlayerContainer.modeManager;
        erm ermVar2 = erm.PLAYER;
        nsmVar2.getClass();
        ermVar2.getClass();
        nsmVar2.a = ermVar2;
        Context context2 = blazeBaseInlinePlayerContainer.containerView.getContext();
        context2.getClass();
        rpl a2 = blazeBaseInlinePlayerContainer.a(context2, u6bVar, args2, ttkVar);
        blazeBaseInlinePlayerContainer.playerWrapperView = a2;
        rpl rplVar2 = blazeBaseInlinePlayerContainer.middlemanContainerView;
        if (rplVar2 != null) {
            rplVar2.addView(a2, 0);
        }
    }

    public static final BroadcastReceiver c(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer) {
        gzk gzkVar = gzk.a;
        String str = blazeBaseInlinePlayerContainer.containerId;
        ErrorDomain errorDomain = ErrorDomain.CONTAINER;
        BlazePlayerSourceDelegate playerDelegate = blazeBaseInlinePlayerContainer.getPlayerDelegate();
        yql yqlVar = (yql) blazeBaseInlinePlayerContainer.internalPlayerEventHandler.getValue();
        str.getClass();
        errorDomain.getClass();
        return new nf5(str, playerDelegate, errorDomain, yqlVar);
    }

    public static /* synthetic */ void createOrUpdatePlayerViewArgs$default(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: createOrUpdatePlayerViewArgs");
            return;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        blazeBaseInlinePlayerContainer.createOrUpdatePlayerViewArgs(str, z);
    }

    public static /* synthetic */ u6b getLifecycleOwnerOrHandleError$default(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, String str, Function1 function1, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getLifecycleOwnerOrHandleError");
            return null;
        }
        if ((i & 1) != 0) {
            str = "Failed - containerView must have a lifecycle owner";
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return blazeBaseInlinePlayerContainer.a(str, function1);
    }

    public static /* synthetic */ ttk getViewModelStoreOwnerOrHandleError$default(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, String str, Function1 function1, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getViewModelStoreOwnerOrHandleError");
            return null;
        }
        if ((i & 1) != 0) {
            str = "Failed - containerView must have a viewModel store owner";
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return blazeBaseInlinePlayerContainer.b(str, function1);
    }

    public static /* synthetic */ Object handleEmbeddingError$default(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Function1 function1, Function0 function0, boolean z, rq3 rq3Var, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: handleEmbeddingError");
            return null;
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return blazeBaseInlinePlayerContainer.a(function1, function0, z, rq3Var);
    }

    public static /* synthetic */ void internalEmbedPlaceholder$default(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Function1 function1, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: internalEmbedPlaceholder");
            return;
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        blazeBaseInlinePlayerContainer.a(function1);
    }

    public static boolean withLifecycleAndViewModelOwners$default(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Function2 function2, Function1 function1, String str, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: withLifecycleAndViewModelOwners");
            return false;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            str = "preparing player";
        }
        blazeBaseInlinePlayerContainer.getClass();
        u6b a = blazeBaseInlinePlayerContainer.a("Failed " + str + " - containerView must have a lifecycle owner", function1);
        if (a != null) {
            ttk b = blazeBaseInlinePlayerContainer.b("Failed " + str + " - containerView must have a viewModel store owner", function1);
            if (b != null) {
                function2.invoke(a, b);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (defpackage.evl.b(r7, r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (defpackage.xw3.R(r10, r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function1 function1, Function0 function0, boolean z, rq3 rq3Var) {
        x0m x0mVar;
        int i;
        g0 j0Var;
        if (rq3Var instanceof x0m) {
            x0mVar = (x0m) rq3Var;
            int i2 = x0mVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0mVar.w = i2 - Integer.MIN_VALUE;
                Object obj = x0mVar.u;
                lu3 lu3Var = lu3.a;
                i = x0mVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    l4m l4mVar = new l4m(function0, null);
                    x0mVar.r = this;
                    x0mVar.s = function1;
                    x0mVar.t = z;
                    x0mVar.w = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = x0mVar.t;
                    function1 = x0mVar.s;
                    this = x0mVar.r;
                    y6a.M(obj);
                }
                if (z) {
                    j1m j1mVar = j1m.a;
                    j0Var = new j0();
                    j0Var.g = i9a.p("containerId", this.containerId);
                    j1m.a(j0Var);
                } else {
                    j1m j1mVar2 = j1m.a;
                    j0Var = new i0();
                    j0Var.g = i9a.p("containerId", this.containerId);
                    j1m.a(j0Var);
                }
                if (function1 != null) {
                    return Unit.a;
                }
                BlazeResult.Error d = j0Var.d();
                x0mVar.r = null;
                x0mVar.s = null;
                x0mVar.w = 2;
            }
        }
        x0mVar = new x0m(this, rq3Var);
        Object obj2 = x0mVar.u;
        lu3 lu3Var2 = lu3.a;
        i = x0mVar.w;
        if (i != 0) {
        }
        if (z) {
        }
        if (function1 != null) {
        }
    }

    public final ttk b(String str, Function1 function1) {
        ttk ttkVar = this.storeOwnerWeak.get();
        if (ttkVar != null) {
            return ttkVar;
        }
        j1m j1mVar = j1m.a;
        o0 o0Var = new o0();
        o0Var.g = i9a.p("containerId", this.containerId);
        o0Var.b(str);
        j1m.a(o0Var);
        if (function1 == null) {
            return null;
        }
        function1.invoke(o0Var.d());
        return null;
    }

    @Override // com.blaze.blazesdk.players.inline.contracts.BlazePlayerControllerContract
    @Keep
    public void blockInteraction() {
        try {
            PlayerView playerview = this.playerView;
            if (playerview != null) {
                playerview.g(hag.a);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public abstract void cleanupContainerResources();

    public abstract void configurePlaceholderWithLatestRecord(rum rumVar);

    public abstract void createOrUpdatePlayerViewArgs(String str, boolean z);

    public abstract Pair createPlaceholderStructure();

    public abstract void createPlayerViewAndAddToWrapper(Context context, hom homVar, u6b u6bVar, ttk ttkVar, rpl rplVar);

    public final rpl d() {
        rpl rplVar = this.middlemanContainerView;
        if (rplVar != null) {
            return rplVar;
        }
        Context context = this.containerView.getContext();
        context.getClass();
        rpl a = a(context);
        this.containerView.addView(a, new ViewGroup.LayoutParams(-1, -1));
        this.middlemanContainerView = a;
        return a;
    }

    @Override // com.blaze.blazesdk.players.contracts.BlazeInlinePlayerContract
    @Keep
    public void disposeContainer() {
        try {
            internalDisposeContainer();
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
    }

    public final void e() {
        u6b lifecycleOwnerOrHandleError$default = getLifecycleOwnerOrHandleError$default(this, null, null, 3, null);
        if (lifecycleOwnerOrHandleError$default == null) {
            return;
        }
        try {
            boolean z = this.playerUIJob != null;
            if (this.modeManager.a(erm.PLAYER) && z) {
                ovm ovmVar = (ovm) this.transitionManager.getValue();
                rpl rplVar = this.playerWrapperView;
                rpl rplVar2 = this.middlemanContainerView;
                ViewGroup viewGroup = this.placeholderWrapperView;
                k6b x = wca.x(lifecycleOwnerOrHandleError$default.getLifecycle());
                gx1 gx1Var = new gx1(this, 1);
                ovmVar.getClass();
                ovmVar.b = xw3.L(x, null, null, new xtm(ovmVar, rplVar, rplVar2, viewGroup, gx1Var, null), 3);
            }
        } catch (CancellationException unused) {
        } catch (Exception unused2) {
            xw3.L(wca.x(lifecycleOwnerOrHandleError$default.getLifecycle()), null, null, new o7m(this, null), 3);
        }
    }

    @Override // com.blaze.blazesdk.players.contracts.BlazeInlinePlayerContract
    @Keep
    public void embedPlaceholder() {
        a(new ls1(21));
    }

    @Override // com.blaze.blazesdk.players.contracts.BlazeInlinePlayerContract
    @Keep
    public void embedPlayer(boolean shouldAutoPlayOnStart) {
        ttk b;
        ls1 ls1Var = new ls1(20);
        if (!Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw BlazeException.MainThreadRequiredException.INSTANCE;
        }
        u6b a = a("Failed playing videos in container - containerView must have a lifecycle owner", ls1Var);
        if (a == null || (b = b("Failed playing videos in container - containerView must have a viewModel store owner", ls1Var)) == null) {
            return;
        }
        b();
        a();
        d();
        aea a2 = bea.a();
        this.playerUIJob = a2;
        Function0 c = c();
        ucm ucmVar = new ucm(this, a, b, null);
        k6b x = wca.x(a.getLifecycle());
        hs4 hs4Var = z45.a;
        this.preloadJob = xw3.L(x, hq4.c, null, new wlm(this, ls1Var, shouldAutoPlayOnStart, false, c, a, a2, ucmVar, null), 2);
    }

    @NotNull
    /* renamed from: getContainerId$blazesdk_release, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    @NotNull
    /* renamed from: getContainerView$blazesdk_release, reason: from getter */
    public final FrameLayout getContainerView() {
        return this.containerView;
    }

    @NotNull
    /* renamed from: getModeManager$blazesdk_release, reason: from getter */
    public final nsm getModeManager() {
        return this.modeManager;
    }

    @Nullable
    public final ImageView getPlaceholderImageView() {
        return this.placeholderImageView;
    }

    @Nullable
    public final ViewGroup getPlaceholderWrapperView() {
        return this.placeholderWrapperView;
    }

    @Nullable
    public final Args getPlayerArgs() {
        return this.playerArgs;
    }

    public abstract BlazePlayerSourceDelegate getPlayerDelegate();

    @Nullable
    public final PlayerView getPlayerView() {
        return this.playerView;
    }

    public final boolean getShouldClearRepoAfterSessionEnd() {
        return this.shouldClearRepoAfterSessionEnd;
    }

    /* renamed from: getViewingRecordManager$blazesdk_release */
    public abstract xwm getViewingRecordManager();

    public final void internalDismissPlayer() {
        rpl rplVar;
        try {
            PlayerView playerview = this.playerView;
            if (playerview != null) {
                playerview.setVisibility(8);
            }
            rpl rplVar2 = this.playerWrapperView;
            if (rplVar2 != null) {
                rplVar2.setVisibility(8);
            }
            PlayerView playerview2 = this.playerView;
            if (playerview2 != null) {
                playerview2.j(H.INLINE);
            } else {
                ttk viewModelStoreOwnerOrHandleError$default = getViewModelStoreOwnerOrHandleError$default(this, null, null, 3, null);
                if (viewModelStoreOwnerOrHandleError$default != null) {
                    ful.b bVar = ful.o;
                    String str = this.containerId;
                    bVar.getClass();
                    ful.b.a(str, viewModelStoreOwnerOrHandleError$default);
                }
            }
            rpl rplVar3 = this.playerWrapperView;
            if (rplVar3 != null && (rplVar = this.middlemanContainerView) != null) {
                rplVar.removeView(rplVar3);
            }
            this.playerView = null;
            this.playerWrapperView = null;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void internalDisposeContainer() {
        if (!Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw BlazeException.MainThreadRequiredException.INSTANCE;
        }
        try {
            nsm nsmVar = this.modeManager;
            erm ermVar = erm.EMPTY;
            nsmVar.getClass();
            ermVar.getClass();
            nsmVar.a = ermVar;
            yda ydaVar = this.preloadJob;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            this.preloadJob = null;
            a();
            b();
            releasePlaceholderResources();
            internalDismissPlayer();
            rpl rplVar = this.middlemanContainerView;
            if (rplVar != null) {
                rplVar.removeAllViews();
            }
            this.containerView.removeAllViews();
            sxl sxlVar = this.lifecycleObserverCancellable;
            if (sxlVar != null) {
                ((d5m) sxlVar).a();
            }
            this.lifecycleObserverCancellable = null;
            Context context = this.containerView.getContext();
            context.getClass();
            b(context);
            this.middlemanContainerView = null;
            this.playerArgs = null;
            this.playerView = null;
            this.playerWrapperView = null;
            this.placeholderImageView = null;
            this.placeholderWrapperView = null;
            cleanupContainerResources();
            xwm viewingRecordManager = getViewingRecordManager();
            t tVar = viewingRecordManager.b;
            String str = viewingRecordManager.a;
            atl atlVar = (atl) tVar;
            atlVar.getClass();
            str.getClass();
            atlVar.a.remove(str);
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
    }

    public abstract void onContainerMiddlemanViewAttached(rpl rplVar, u6b u6bVar);

    public abstract void onContainerMiddlemanViewDetached(rpl rplVar);

    public void onPlayerWrapperViewAttached(@NotNull rpl wrapperView, @NotNull Args args) {
        wrapperView.getClass();
        args.getClass();
    }

    public void onPlayerWrapperViewDetached(@NotNull rpl wrapperView) {
        wrapperView.getClass();
    }

    @Override // com.blaze.blazesdk.players.inline.contracts.BlazePlayerControllerContract
    @Keep
    public void onVolumeChanged() {
        PlayerView playerview = this.playerView;
        if (playerview != null) {
            playerview.v();
        }
    }

    @Override // com.blaze.blazesdk.players.inline.contracts.BlazePlayerControllerContract
    @Keep
    public void pausePlayer() {
        try {
            PlayerView playerview = this.playerView;
            if (playerview != null) {
                playerview.e(n1n.a, true);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public abstract Object preloadContent(boolean z, rq3 rq3Var);

    public abstract void releasePlaceholderResources();

    @Override // com.blaze.blazesdk.players.contracts.BlazeInlinePlayerContract
    @Keep
    public void resetToPlaceholder() {
        a(new ls1(19));
    }

    @Override // com.blaze.blazesdk.players.inline.contracts.BlazePlayerControllerContract
    @Keep
    public void resumePlayer() {
        try {
            PlayerView playerview = this.playerView;
            if (playerview != null) {
                playerview.e(a1n.a, true);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void setPlaceholderImageView(@Nullable ImageView imageView) {
        this.placeholderImageView = imageView;
    }

    public final void setPlaceholderWrapperView(@Nullable ViewGroup viewGroup) {
        this.placeholderWrapperView = viewGroup;
    }

    public final void setPlayerArgs(@Nullable Args args) {
        this.playerArgs = args;
    }

    public final void setPlayerView(@Nullable PlayerView playerview) {
        this.playerView = playerview;
    }

    public final void triggerPlaceholderToPlayerTransition() {
        u6b lifecycleOwnerOrHandleError$default = getLifecycleOwnerOrHandleError$default(this, null, null, 3, null);
        if (lifecycleOwnerOrHandleError$default == null) {
            return;
        }
        ovm ovmVar = (ovm) this.transitionManager.getValue();
        rpl rplVar = this.playerWrapperView;
        rpl rplVar2 = this.middlemanContainerView;
        ViewGroup viewGroup = this.placeholderWrapperView;
        k6b x = wca.x(lifecycleOwnerOrHandleError$default.getLifecycle());
        gx1 gx1Var = new gx1(this, 0);
        ovmVar.getClass();
        ovmVar.b = xw3.L(x, null, null, new xtm(ovmVar, rplVar, rplVar2, viewGroup, gx1Var, null), 3);
    }

    @Override // com.blaze.blazesdk.players.inline.contracts.BlazePlayerControllerContract
    @Keep
    public void unblockInteraction() {
        try {
            PlayerView playerview = this.playerView;
            if (playerview != null) {
                playerview.g(ori.a);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public void handlePlayerAlreadyShown() {
    }

    public final Function0 c() {
        return new j4(29, new AtomicBoolean(false), this);
    }

    public static final ovm d(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer) {
        return new ovm(blazeBaseInlinePlayerContainer.modeManager);
    }

    public static final Unit c(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    public final void b() {
        g9i g9iVar;
        ovm ovmVar = (ovm) this.transitionManager.getValue();
        g9i g9iVar2 = ovmVar.b;
        if (g9iVar2 != null && g9iVar2.isActive() && (g9iVar = ovmVar.b) != null) {
            g9iVar.e(null);
        }
        ovmVar.b = null;
        yda ydaVar = this.playerUIJob;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.playerUIJob = null;
    }

    public static final Unit b(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Context context, rpl rplVar) {
        rplVar.getClass();
        sxl sxlVar = blazeBaseInlinePlayerContainer.lifecycleObserverCancellable;
        if (sxlVar != null) {
            ((d5m) sxlVar).a();
        }
        blazeBaseInlinePlayerContainer.lifecycleObserverCancellable = null;
        blazeBaseInlinePlayerContainer.b(context);
        blazeBaseInlinePlayerContainer.onContainerMiddlemanViewDetached(rplVar);
        return Unit.a;
    }

    public final void b(Context context) {
        try {
            LocalBroadcastManager.getInstance(context).unregisterReceiver((BroadcastReceiver) this.playerBroadcastReceiver.getValue());
        } catch (Exception unused) {
        }
    }

    public static final yql b(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer) {
        blazeBaseInlinePlayerContainer.getClass();
        return new xwl(blazeBaseInlinePlayerContainer);
    }

    public static final Unit b(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }

    public static final Unit e(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer) {
        blazeBaseInlinePlayerContainer.releasePlaceholderResources();
        return Unit.a;
    }

    public final rpl a(final Context context) {
        final int i = 0;
        final int i2 = 1;
        return new rpl(context, new Function1(this) { // from class: hx1
            public final /* synthetic */ BlazeBaseInlinePlayerContainer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                Context context2 = context;
                BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer = this.b;
                rpl rplVar = (rpl) obj;
                switch (i3) {
                    case 0:
                        return BlazeBaseInlinePlayerContainer.a(blazeBaseInlinePlayerContainer, context2, rplVar);
                    default:
                        return BlazeBaseInlinePlayerContainer.b(blazeBaseInlinePlayerContainer, context2, rplVar);
                }
            }
        }, new Function1(this) { // from class: hx1
            public final /* synthetic */ BlazeBaseInlinePlayerContainer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                Context context2 = context;
                BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer = this.b;
                rpl rplVar = (rpl) obj;
                switch (i3) {
                    case 0:
                        return BlazeBaseInlinePlayerContainer.a(blazeBaseInlinePlayerContainer, context2, rplVar);
                    default:
                        return BlazeBaseInlinePlayerContainer.b(blazeBaseInlinePlayerContainer, context2, rplVar);
                }
            }
        });
    }

    public static final Unit a(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Context context, rpl rplVar) {
        rplVar.getClass();
        u6b lifecycleOwnerOrHandleError$default = getLifecycleOwnerOrHandleError$default(blazeBaseInlinePlayerContainer, "Failed attaching middleman view - containerView must have a lifecycle owner", null, 2, null);
        if (lifecycleOwnerOrHandleError$default == null) {
            return Unit.a;
        }
        blazeBaseInlinePlayerContainer.a(lifecycleOwnerOrHandleError$default);
        blazeBaseInlinePlayerContainer.b(context);
        LocalBroadcastManager.getInstance(context).registerReceiver((BroadcastReceiver) blazeBaseInlinePlayerContainer.playerBroadcastReceiver.getValue(), new IntentFilter("player_broadcast"));
        blazeBaseInlinePlayerContainer.onContainerMiddlemanViewAttached(rplVar, lifecycleOwnerOrHandleError$default);
        return Unit.a;
    }

    public final rpl a(Context context, u6b u6bVar, hom homVar, ttk ttkVar) {
        return new rpl(context, new ke(this, context, homVar, u6bVar, ttkVar, 2), new u2(this, 26));
    }

    public final void a() {
        g9i g9iVar;
        ovm ovmVar = (ovm) this.transitionManager.getValue();
        g9i g9iVar2 = ovmVar.c;
        if (g9iVar2 != null && g9iVar2.isActive() && (g9iVar = ovmVar.c) != null) {
            g9iVar.e(null);
        }
        ovmVar.c = null;
        yda ydaVar = this.placeholderUIJob;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.placeholderUIJob = null;
    }

    public static final Unit a(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, Context context, hom homVar, u6b u6bVar, ttk ttkVar, rpl rplVar) {
        rplVar.getClass();
        blazeBaseInlinePlayerContainer.createPlayerViewAndAddToWrapper(context, homVar, u6bVar, ttkVar, rplVar);
        blazeBaseInlinePlayerContainer.onPlayerWrapperViewAttached(rplVar, homVar);
        return Unit.a;
    }

    public static final Unit a(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, rpl rplVar) {
        PlayerView playerview;
        rplVar.getClass();
        rplVar.removeAllViews();
        yda ydaVar = blazeBaseInlinePlayerContainer.placeholderUIJob;
        if (((ydaVar != null && ydaVar.isActive()) || blazeBaseInlinePlayerContainer.modeManager.a(erm.PLACEHOLDER)) && (playerview = blazeBaseInlinePlayerContainer.playerView) != null) {
            playerview.j(H.INLINE);
        }
        blazeBaseInlinePlayerContainer.playerView = null;
        blazeBaseInlinePlayerContainer.onPlayerWrapperViewDetached(rplVar);
        return Unit.a;
    }

    public final void a(u6b u6bVar) {
        try {
            sxl sxlVar = this.lifecycleObserverCancellable;
            if (sxlVar != null) {
                ((d5m) sxlVar).a();
            }
            this.lifecycleObserverCancellable = null;
            Context context = this.containerView.getContext();
            context.getClass();
            gtl gtlVar = new gtl(this, context);
            u6bVar.getLifecycle().a(gtlVar);
            this.lifecycleObserverCancellable = new d5m(new ix1(0, u6bVar, gtlVar));
            this.lifecycleObserver = gtlVar;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static final Unit a(u6b u6bVar, rq4 rq4Var) {
        u6bVar.getLifecycle().d(rq4Var);
        return Unit.a;
    }

    public final u6b a(String str, Function1 function1) {
        u6b u6bVar = this.lifecycleOwnerWeak.get();
        if (u6bVar != null) {
            return u6bVar;
        }
        j1m j1mVar = j1m.a;
        n0 n0Var = new n0();
        n0Var.g = i9a.p("containerId", this.containerId);
        n0Var.b(str);
        j1m.a(n0Var);
        if (function1 == null) {
            return null;
        }
        function1.invoke(n0Var.d());
        return null;
    }

    public final void a(Function1 function1) {
        if (Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            u6b a = a("Failed playing videos in container - containerView must have a lifecycle owner", function1);
            if (a == null) {
                return;
            }
            b();
            a();
            d();
            ViewGroup viewGroup = this.placeholderWrapperView;
            if (viewGroup == null) {
                Pair createPlaceholderStructure = createPlaceholderStructure();
                ViewGroup viewGroup2 = (ViewGroup) createPlaceholderStructure.a;
                ImageView imageView = (ImageView) createPlaceholderStructure.b;
                this.placeholderWrapperView = viewGroup2;
                this.placeholderImageView = imageView;
                viewGroup = viewGroup2;
            }
            if (viewGroup != null) {
                rpl d = d();
                if (!Intrinsics.c(viewGroup.getParent(), d)) {
                    viewGroup.setVisibility(0);
                    viewGroup.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    d.addView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            aea a2 = bea.a();
            this.placeholderUIJob = a2;
            Function0 c = c();
            ham hamVar = new ham(this, c, null);
            k6b x = wca.x(a.getLifecycle());
            hs4 hs4Var = z45.a;
            this.preloadJob = xw3.L(x, hq4.c, null, new wlm(this, function1, true, true, c, a, a2, hamVar, null), 2);
            return;
        }
        throw BlazeException.MainThreadRequiredException.INSTANCE;
    }

    public final void a(rum rumVar, ku3 ku3Var, Function0 function0) {
        nsm nsmVar = this.modeManager;
        erm ermVar = erm.PLACEHOLDER;
        nsmVar.getClass();
        ermVar.getClass();
        nsmVar.a = ermVar;
        configurePlaceholderWithLatestRecord(rumVar);
        ViewGroup viewGroup = this.placeholderWrapperView;
        if (viewGroup != null) {
            ovm ovmVar = (ovm) this.transitionManager.getValue();
            rpl rplVar = this.middlemanContainerView;
            v61 v61Var = new v61(1, function0);
            ovmVar.getClass();
            ku3Var.getClass();
            hs4 hs4Var = z45.a;
            ovmVar.c = xw3.L(ku3Var, rob.a, null, new qum(ovmVar, rplVar, viewGroup, v61Var, null), 2);
        }
    }

    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.a;
    }

    public static final Unit a(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer) {
        blazeBaseInlinePlayerContainer.releasePlaceholderResources();
        return Unit.a;
    }

    public static final Unit a(AtomicBoolean atomicBoolean, BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer) {
        if (atomicBoolean.compareAndSet(false, true)) {
            blazeBaseInlinePlayerContainer.internalDismissPlayer();
        }
        return Unit.a;
    }

    public static final Unit a(BlazeResult blazeResult) {
        blazeResult.getClass();
        return Unit.a;
    }
}
