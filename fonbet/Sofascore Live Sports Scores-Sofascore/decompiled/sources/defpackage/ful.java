package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.d;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.models.InterfaceC1358b;
import com.blaze.blazesdk.players.models.c;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.exceptions.BlazeException;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import com.blaze.blazesdk.shared.results.u;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import com.sofascore.results.R;
import defpackage.gim;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ful extends FrameLayout {
    public static final b o = new b(null);
    public u6b a;
    public ttk b;
    public c1m c;
    public ku3 d;
    public p4m e;
    public List f;
    public w0m g;
    public etl h;
    public AudioFocusRequest i;
    public Function1 j;
    public nf5 k;
    public ie l;
    public final jam m;
    public final wcm n;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends kotlin.coroutines.a implements cu3 {
        public a(bu3 bu3Var) {
            super(bu3Var);
        }

        @Override // defpackage.cu3
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(String str, ttk ttkVar) {
            str.getClass();
            ttkVar.getClass();
            String concat = "playerViewModel: ".concat(str);
            stk viewModelStore = ttkVar.getViewModelStore();
            qtk s = ufa.s(ttkVar);
            ly3 r = ufa.r(ttkVar);
            viewModelStore.getClass();
            s.getClass();
            r.getClass();
            new g7h(viewModelStore, s, r).u(concat, duf.a.getOrCreateKotlinClass(qxl.class));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ful(@NotNull Context context, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        super(context, null, 0);
        context.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
        this.a = u6bVar;
        this.b = ttkVar;
        this.f = new ArrayList();
        setSaveEnabled(true);
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        this.d = s9a.c(hda.E(this.a).b.plus(tz9.o()).plus(new a(bu3.a)));
        this.m = new jam(this);
        this.n = new wcm(this);
    }

    public static void invokeShareChooser$default(ful fulVar, String str, String str2, Map map, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: invokeShareChooser");
            return;
        }
        if ((i & 2) != 0) {
            str2 = "text/plain";
        }
        if ((i & 4) != 0) {
            map = lm5.a;
            map.getClass();
        }
        fulVar.getClass();
        str.getClass();
        str2.getClass();
        map.getClass();
        try {
            ie ieVar = fulVar.l;
            if (ieVar == null) {
                Intrinsics.i("shareChooserLauncher");
                throw null;
            }
            Intent intent = new Intent();
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setAction("android.intent.action.SEND");
            intent.setType(str2);
            Intent createChooser = Intent.createChooser(intent, null);
            createChooser.setFlags(536870912);
            ieVar.a(createChooser, null);
        } catch (Throwable th) {
            Function1 function1 = fulVar.j;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            u uVar = new u();
            uVar.g = map;
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, uVar);
        }
    }

    public static /* synthetic */ void updatePlayPermissionAndApplyPlayPause$blazesdk_release$default(ful fulVar, u uVar, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: updatePlayPermissionAndApplyPlayPause");
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        fulVar.e(uVar, z);
    }

    public static /* synthetic */ void updatePlayerUiInteractionState$blazesdk_release$default(ful fulVar, n7k n7kVar, boolean z, int i, Object obj) {
        if (obj == null) {
            fulVar.g(n7kVar);
        } else {
            a70.m("Super calls with default arguments not supported in this target, function: updatePlayerUiInteractionState");
        }
    }

    public final void A() {
        Context context = getContext();
        if (context != null) {
            LocalBroadcastManager.getInstance(context).registerReceiver(this.m, new IntentFilter(BlazeSDK.DISABLE_UI_INTERACTION_AND_BLOCK_PLAYER_PLAY_PERMISSION));
            LocalBroadcastManager.getInstance(context).registerReceiver(this.n, new IntentFilter(BlazeSDK.ENABLE_UI_INTERACTION_AND_ALLOW_PLAYER_PLAY_PERMISSION));
        }
        try {
            p4m p4mVar = this.e;
            if (p4mVar != null) {
                this.a.getLifecycle().d(p4mVar);
            }
            p4m p4mVar2 = new p4m(this);
            this.a.getLifecycle().a(p4mVar2);
            this.e = p4mVar2;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final Object b(e6b e6bVar, Function2 function2, rq3 rq3Var) {
        Object A = b6a.A(this.a, e6bVar, function2, rq3Var);
        return A == lu3.a ? A : Unit.a;
    }

    public final apm c(Bundle bundle) {
        if (getViewModel().a0 != null) {
            Size size = getViewModel().a0;
            Context context = getContext();
            if (!Intrinsics.c(size, context != null ? new Size(context.getResources().getConfiguration().screenWidthDp, context.getResources().getConfiguration().screenHeightDp) : null)) {
                return apm.SCREEN_SIZE_CHANGED;
            }
        }
        if (bundle != null) {
            return apm.DEFAULT;
        }
        if (Intrinsics.c((sum) getViewModel().V.getValue(), psm.a)) {
            return null;
        }
        return apm.DEFAULT;
    }

    public final void d() {
        Context context;
        try {
            AudioFocusRequest audioFocusRequest = this.i;
            if (audioFocusRequest == null || (context = getContext()) == null) {
                return;
            }
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void e(u uVar, boolean z) {
        uVar.getClass();
        try {
            getViewModel().k(uVar, z);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void g(n7k n7kVar) {
        n7kVar.getClass();
        try {
            getViewModel().l(n7kVar);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @NotNull
    public final FragmentActivity getActivity() {
        Context context = getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        throw BlazeException.FragmentActivityRequiredException.INSTANCE;
    }

    @NotNull
    public final List<sxl> getCancellables$blazesdk_release() {
        return this.f;
    }

    @NotNull
    public final u6b getLifecycleOwner() {
        return this.a;
    }

    @NotNull
    public final w0m getPlayerRendererBridge() {
        w0m w0mVar = this.g;
        if (w0mVar != null) {
            return w0mVar;
        }
        Intrinsics.i("playerRendererBridge");
        throw null;
    }

    @NotNull
    public final ttk getStoreOwner() {
        return this.b;
    }

    @NotNull
    public final etl getVideoManagerFactory() {
        etl etlVar = this.h;
        if (etlVar != null) {
            return etlVar;
        }
        Intrinsics.i("videoManagerFactory");
        throw null;
    }

    @NotNull
    public final c1m getViewModel() {
        c1m c1mVar = this.c;
        if (c1mVar != null) {
            return c1mVar;
        }
        Intrinsics.i("viewModel");
        throw null;
    }

    @NotNull
    public final ku3 getViewScope() {
        return this.d;
    }

    public final void h(BlazePlayerType blazePlayerType) {
        Context context;
        blazePlayerType.getClass();
        if (getViewModel().g0 != null || (context = getContext()) == null) {
            return;
        }
        gzk gzkVar = gzk.a;
        String C = getViewModel().C();
        String str = getViewModel().j;
        try {
            Intent intent = new Intent("player_broadcast");
            intent.putExtra("player_broadcast_client_source_id", str);
            intent.putExtra("on_trigger_key_broadcaster_id", C);
            intent.putExtra("player_type", (Parcelable) blazePlayerType);
            intent.putExtra("player_broadcast_event_type", (Parcelable) d.PLAYER_APPEARED);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            gzk.b.add(intent);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void i(BlazePlayerType blazePlayerType, String str) {
        blazePlayerType.getClass();
        Context context = getContext();
        if (context != null) {
            gzk gzkVar = gzk.a;
            String C = getViewModel().C();
            String str2 = getViewModel().j;
            try {
                Intent intent = new Intent("player_broadcast");
                intent.putExtra("player_broadcast_client_source_id", str2);
                intent.putExtra("on_trigger_key_broadcaster_id", C);
                intent.putExtra("on_trigger_body_text_link_key", str);
                intent.putExtra("player_type", (Parcelable) blazePlayerType);
                intent.putExtra("player_broadcast_event_type", (Parcelable) d.BODY_TEXT_LINK);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                gzk.b.add(intent);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
    }

    public abstract void j(H h);

    public final void k(BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams, BlazePlayerType blazePlayerType) {
        blazePlayerType.getClass();
        Context context = getContext();
        if (context != null) {
            gzk gzkVar = gzk.a;
            String C = getViewModel().C();
            String str = getViewModel().j;
            try {
                Intent intent = new Intent("player_broadcast");
                intent.putExtra("player_broadcast_client_source_id", str);
                intent.putExtra("on_trigger_key_broadcaster_id", C);
                intent.putExtra("on_custom_action_button_params_key", blazePlayerCustomActionButtonParams);
                intent.putExtra("player_type", (Parcelable) blazePlayerType);
                intent.putExtra("player_broadcast_event_type", (Parcelable) d.CUSTOM_ACTION_BUTTON_CLICKED);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                gzk.b.add(intent);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(n4m n4mVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ContentType contentType;
        BlazeContentExtraInfo blazeContentExtraInfo;
        String str7;
        ContentType contentType2;
        BlazeContentExtraInfo y;
        Unit unit;
        n4mVar.getClass();
        c1m viewModel = getViewModel();
        viewModel.getClass();
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        Application application$blazesdk_release = blazeSDK.getApplication$blazesdk_release();
        if (application$blazesdk_release == null || !cnb.g(application$blazesdk_release) || blazeSDK.getImaHandler$blazesdk_release() == null) {
            return;
        }
        c cVar = n4mVar.q;
        gim gimVar = n4mVar.b;
        if (cVar == null || !cVar.b || cVar.a) {
            return;
        }
        if (!(cVar.c instanceof com.blaze.blazesdk.players.models.a)) {
            zzl.b();
            return;
        }
        cVar.a = true;
        cVar.b = false;
        if (viewModel.K()) {
            return;
        }
        c cVar2 = n4mVar.q;
        Unit unit2 = null;
        InterfaceC1358b interfaceC1358b = cVar2 != null ? cVar2.c : null;
        if (!(interfaceC1358b instanceof com.blaze.blazesdk.players.models.a)) {
            if (interfaceC1358b == null) {
                return;
            }
            zzl.b();
            return;
        }
        if (gimVar instanceof gim.d) {
            StoryModel storyModel = ((gim.d) gimVar).a;
            String str8 = storyModel.id;
            String str9 = storyModel.title;
            contentType2 = ContentType.STORY;
            y = y();
            BlazeAdInfoModel blazeAdInfoModel = storyModel.h;
            String str10 = blazeAdInfoModel != null ? blazeAdInfoModel.e : null;
            unit = Unit.a;
            str7 = str10;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str2 = str8;
            str = str9;
        } else if (gimVar instanceof gim.b) {
            MomentModel momentModel = ((gim.b) gimVar).a;
            String str11 = momentModel.id;
            String str12 = momentModel.title;
            contentType2 = ContentType.MOMENT;
            y = y();
            BlazeAdInfoModel blazeAdInfoModel2 = momentModel.q;
            String str13 = blazeAdInfoModel2 != null ? blazeAdInfoModel2.e : null;
            unit = Unit.a;
            str7 = str13;
            str = null;
            str2 = null;
            str5 = null;
            str6 = null;
            str4 = str11;
            str3 = str12;
        } else {
            if (!(gimVar instanceof gim.e)) {
                if (!(gimVar instanceof gim.a) && !(gimVar instanceof gim.c)) {
                    zzl.b();
                    return;
                }
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                contentType = null;
                blazeContentExtraInfo = null;
                str7 = null;
                if (unit2 == null) {
                    getViewModel().M = true;
                    u();
                    getActivity().startActivity(new Intent(getActivity(), (Class<?>) ImaPresenterActivity.class).putExtra("ima_presenter_activity_args", new com.blaze.blazesdk.ads.ima.models.args.a(n4mVar.q, getViewModel().h, getViewModel().H(), getViewModel().k, str, str2, str3, str4, str5, str6, contentType, (String) getViewModel().g.getValue(), blazeContentExtraInfo, str7)));
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        activity.overridePendingTransition(R.anim.blaze_anim_ima_fade_in, R.anim.blaze_anim_ima_fade_out);
                        return;
                    }
                    return;
                }
                return;
            }
            VideoModel videoModel = ((gim.e) gimVar).a;
            String str14 = videoModel.id;
            String str15 = videoModel.title;
            contentType2 = ContentType.VIDEO;
            y = y();
            BlazeAdInfoModel blazeAdInfoModel3 = videoModel.r;
            String str16 = blazeAdInfoModel3 != null ? blazeAdInfoModel3.e : null;
            unit = Unit.a;
            str7 = str16;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str6 = str14;
            str5 = str15;
        }
        contentType = contentType2;
        blazeContentExtraInfo = y;
        unit2 = unit;
        if (unit2 == null) {
        }
    }

    public final void m(n4m n4mVar, BlazePlayerType blazePlayerType) {
        n4mVar.getClass();
        blazePlayerType.getClass();
        Context context = getContext();
        if (context != null) {
            gzk gzkVar = gzk.a;
            String C = getViewModel().C();
            i iVar = n4mVar.i;
            String str = getViewModel().j;
            try {
                Intent intent = new Intent("player_broadcast");
                intent.putExtra("player_broadcast_client_source_id", str);
                intent.putExtra("on_trigger_key_broadcaster_id", C);
                intent.putExtra("on_trigger_cta_key_cta_model", iVar);
                intent.putExtra("player_type", (Parcelable) blazePlayerType);
                intent.putExtra("player_broadcast_event_type", (Parcelable) d.CTA);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                gzk.b.add(intent);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
    }

    public final void n(String str, Class cls) {
        str.getClass();
        ttk ttkVar = this.b;
        o.getClass();
        String concat = "playerViewModel: ".concat(str);
        ttkVar.getClass();
        stk viewModelStore = ttkVar.getViewModelStore();
        qtk s = ufa.s(ttkVar);
        ly3 r = ufa.r(ttkVar);
        viewModelStore.getClass();
        s.getClass();
        r.getClass();
        setViewModel((c1m) new g7h(viewModelStore, s, r).u(concat, duf.a.getOrCreateKotlinClass(cls)));
    }

    public final void o(Function1 function1) {
        xw3.L(this.d, null, null, new r7m(function1, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (this.c != null) {
                A();
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        r();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (t()) {
            c1m viewModel = getViewModel();
            Context context = getContext();
            context.getClass();
            viewModel.a0 = new Size(context.getResources().getConfiguration().screenWidthDp, context.getResources().getConfiguration().screenHeightDp);
        }
        return super.onSaveInstanceState();
    }

    public final void p() {
        c1m viewModel = getViewModel();
        boolean z = viewModel.h0;
        viewModel.h0 = true;
        if (z) {
            return;
        }
        gzk gzkVar = gzk.a;
        String C = getViewModel().C();
        Context context = getContext();
        try {
            Intent intent = new Intent("player_broadcast");
            intent.putExtra("on_trigger_key_broadcaster_id", C);
            intent.putExtra("internal_player_broadcast_event_type", (Parcelable) com.blaze.blazesdk.delegates.models.b.PLAYER_FIRST_FRAME_RENDERED);
            if (context != null) {
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public void q(u6b u6bVar) {
        d();
    }

    public void r() {
        s9a.o(this.d, null);
        getViewModel().h0 = false;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((d5m) ((sxl) it.next())).a();
        }
        this.f.clear();
        p4m p4mVar = this.e;
        if (p4mVar != null) {
            this.a.getLifecycle().d(p4mVar);
            this.e = null;
        }
        Context context = getContext();
        if (context != null) {
            nf5 nf5Var = this.k;
            if (nf5Var != null) {
                LocalBroadcastManager.getInstance(context).unregisterReceiver(nf5Var);
            }
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.m);
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.n);
        }
        if (this.g != null) {
            ((qdm) getPlayerRendererBridge()).b(!getViewModel().f0);
        }
        if (t()) {
            c1m viewModel = getViewModel();
            if (viewModel.y.d() != null) {
                viewModel.y.j(null);
            }
            viewModel.g0 = null;
            viewModel.x();
            viewModel.G.k(new fqm(true, false));
        }
        ie ieVar = this.l;
        if (ieVar != null) {
            ieVar.b();
        }
    }

    public void s(u6b u6bVar) {
        Context context;
        u6bVar.getClass();
        try {
            AudioFocusRequest audioFocusRequest = this.i;
            if (audioFocusRequest == null || (context = getContext()) == null) {
                return;
            }
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                audioManager.requestAudioFocus(audioFocusRequest);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void setCancellables$blazesdk_release(@NotNull List<sxl> list) {
        list.getClass();
        this.f = list;
    }

    public final void setLifecycleOwner(@NotNull u6b u6bVar) {
        u6bVar.getClass();
        this.a = u6bVar;
    }

    public final void setOnShareChooserDismissed(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.j = function1;
    }

    public final void setPlayerRendererBridge(@NotNull w0m w0mVar) {
        w0mVar.getClass();
        this.g = w0mVar;
    }

    public final void setStoreOwner(@NotNull ttk ttkVar) {
        ttkVar.getClass();
        this.b = ttkVar;
    }

    public final void setVideoManagerFactory(@NotNull etl etlVar) {
        etlVar.getClass();
        this.h = etlVar;
    }

    public final void setViewModel(@NotNull c1m c1mVar) {
        c1mVar.getClass();
        this.c = c1mVar;
    }

    public final void setViewScope(@NotNull ku3 ku3Var) {
        ku3Var.getClass();
        this.d = ku3Var;
    }

    public final boolean t() {
        return this.c != null;
    }

    public final void w() {
        Context context;
        if (this.k == null && (context = getContext()) != null) {
            gzk gzkVar = gzk.a;
            String C = getViewModel().C();
            ErrorDomain errorDomain = ErrorDomain.PLAYER;
            a1m a1mVar = new a1m(this);
            errorDomain.getClass();
            nf5 nf5Var = new nf5(C, null, errorDomain, a1mVar);
            LocalBroadcastManager.getInstance(context).registerReceiver(nf5Var, new IntentFilter("player_broadcast"));
            this.k = nf5Var;
        }
    }

    public final void x() {
        if (t()) {
            String H = getViewModel().H();
            ttk ttkVar = this.b;
            o.getClass();
            b.a(H, ttkVar);
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public abstract BlazeContentExtraInfo y();

    public final void z() {
        int i = 3;
        if (this.l == null) {
            try {
                this.l = getActivity().getActivityResultRegistry().c("BlazeBasePlayerView_".concat(getViewModel().H()), new ce(i), new bnk(this, 8));
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
        try {
            setVideoManagerFactory(new etl());
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
        this.i = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(new ytl()).build();
    }

    public void u() {
    }

    public void v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupBase$lambda$6(int i) {
    }

    public void f(u6b u6bVar) {
    }
}
