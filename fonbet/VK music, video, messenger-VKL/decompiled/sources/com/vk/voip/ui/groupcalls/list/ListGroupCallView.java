package com.vk.voip.ui.groupcalls.list;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.asr_online.AsrOnlineView;
import com.vk.voip.ui.asr_online.AsrOnlineViewHorizontal;
import com.vk.voip.ui.groupcalls.ControlsBoundsProvider;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.stat.view.TextStatRenderer;
import ru.ok.android.externcalls.sdk.stat.view.TextStatRendererView;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.a000;
import xsna.aad0;
import xsna.asu0;
import xsna.awt0;
import xsna.b15;
import xsna.b1z;
import xsna.bwt0;
import xsna.cad0;
import xsna.cfn;
import xsna.ckj0;
import xsna.cn70;
import xsna.cxu;
import xsna.dad0;
import xsna.dfn;
import xsna.dhw0;
import xsna.drm0;
import xsna.e0a;
import xsna.e43;
import xsna.eiu;
import xsna.el90;
import xsna.epx;
import xsna.f9t;
import xsna.ft80;
import xsna.g4g;
import xsna.gzs;
import xsna.h3x0;
import xsna.h6g;
import xsna.hg1;
import xsna.hv2;
import xsna.i0q0;
import xsna.i6x0;
import xsna.iah0;
import xsna.icx0;
import xsna.iew0;
import xsna.izs;
import xsna.j5g;
import xsna.j6x0;
import xsna.jez;
import xsna.jvw0;
import xsna.kcx0;
import xsna.kiu;
import xsna.l8w;
import xsna.liu;
import xsna.lwt0;
import xsna.m1l;
import xsna.m6a;
import xsna.mc0;
import xsna.mjw0;
import xsna.mnh0;
import xsna.msy;
import xsna.n3t;
import xsna.nfw0;
import xsna.nlk;
import xsna.np3;
import xsna.oey;
import xsna.pf1;
import xsna.pp3;
import xsna.q130;
import xsna.qb3;
import xsna.qcy;
import xsna.qfu;
import xsna.qhj0;
import xsna.qj80;
import xsna.qpj;
import xsna.rl3;
import xsna.s3q0;
import xsna.st0;
import xsna.tad0;
import xsna.tmg0;
import xsna.u2x0;
import xsna.u3k;
import xsna.uez;
import xsna.vam;
import xsna.ven;
import xsna.w65;
import xsna.w7u;
import xsna.w8q;
import xsna.wen;
import xsna.wez;
import xsna.x2y;
import xsna.x680;
import xsna.xez;
import xsna.xj50;
import xsna.xw1;
import xsna.xx40;
import xsna.y990;
import xsna.yen;
import xsna.yro0;
import xsna.ysg0;
import xsna.z27;
import xsna.zpj;
import xsna.zzz;

/* compiled from: ListGroupCallView.kt */
/* loaded from: classes7.dex */
public final class ListGroupCallView extends ConstraintLayout implements ckj0, tmg0, jez, qhj0, ControlsBoundsProvider {
    public final TextStatRenderer A;
    public final OKVoipEngine B;
    public final dad0 C;
    public final RecyclerView D;
    public final FrameLayout E;
    public final ImageView F;
    public final ImageView G;
    public final View H;
    public final TextView I;
    public final TextView J;
    public final AsrOnlineView K;
    public final AsrOnlineViewHorizontal L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final icx0 O;
    public final kcx0 P;
    public final b Q;
    public final c R;
    public boolean S;
    public mjw0 T;
    public ft80.a U;
    public final HashSet<CallMemberId> V;
    public final HashSet<CallMemberId> W;
    public final yro0 a0;
    public long b0;
    public CallMemberId c0;
    public final io.reactivex.rxjava3.disposables.b d0;
    public final com.vk.voip.ui.groupcalls.list.a e0;
    public izs<? super CallMemberId, s3q0> f0;
    public ControlsBoundsProvider g0;
    public boolean h0;
    public final Guideline i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final List<View> m0;
    public final EmptyList n0;
    public final m6a t;
    public final List<VoipViewModelState> u;
    public final j6x0 v;
    public final zzz w;
    public final nfw0 x;
    public final dfn y;
    public final yen z;
    public static final float o0 = cn70.a() * 30.0f;
    public static final float p0 = cn70.a() * 55.0f;
    public static final int q0 = cn70.b(125);
    public static final int r0 = cn70.b(108);
    public static final int s0 = cn70.b(108);
    public static final int t0 = cn70.b(68);
    public static final int u0 = cn70.b(96);
    public static final int v0 = cn70.b(12);
    public static final int w0 = cn70.b(8);
    public static final int x0 = cn70.b(40);
    public static final int y0 = cn70.b(102);
    public static final int z0 = cn70.b(10);
    public static final int A0 = cn70.b(10);

    /* compiled from: ListGroupCallView.kt */
    public final /* synthetic */ class a extends FunctionReferenceImpl implements izs<GroupCallViewModel.GroupCallViewMode, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(GroupCallViewModel.GroupCallViewMode groupCallViewMode) {
            GroupCallViewModel.GroupCallViewMode groupCallViewMode2 = groupCallViewMode;
            ListGroupCallView listGroupCallView = (ListGroupCallView) this.receiver;
            yen yenVar = listGroupCallView.z;
            GroupCallViewModel.GroupCallViewMode groupCallViewMode3 = GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode;
            if (groupCallViewMode2 == groupCallViewMode3) {
                yenVar.a(listGroupCallView);
                listGroupCallView.y.a();
            } else {
                yenVar.b(listGroupCallView);
            }
            b bVar = listGroupCallView.Q;
            boolean z = groupCallViewMode2 == groupCallViewMode3;
            bVar.e = z;
            if (!z) {
                List<kiu> list = bVar.d;
                ListGroupCallView listGroupCallView2 = ListGroupCallView.this;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    RecyclerView.e0 findViewHolderForItemId = listGroupCallView2.D.findViewHolderForItemId(bVar.f.X(((kiu) it.next()).a.a));
                    b.a aVar = findViewHolderForItemId instanceof b.a ? (b.a) findViewHolderForItemId : null;
                    if (aVar != null) {
                        aVar.l.setVideoOn(false);
                    }
                }
            }
            bVar.notifyDataSetChanged();
            return s3q0.a;
        }
    }

    /* compiled from: ListGroupCallView.kt */
    public final class b extends RecyclerView.Adapter<a> {
        public CallMemberId c;
        public List<kiu> d = EmptyList.b;
        public boolean e = true;
        public final e0a f = new e0a(1);

        /* compiled from: ListGroupCallView.kt */
        public final class a extends RecyclerView.e0 {
            public final eiu l;

            public a(eiu eiuVar) {
                super(eiuVar);
                this.l = eiuVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void V5(kiu kiuVar, boolean z) {
                boolean z2;
                StringBuilder sb = new StringBuilder("binding ");
                sb.append(kiuVar != null ? kiuVar.a.a : null);
                L.e(sb.toString());
                eiu eiuVar = this.l;
                eiuVar.setVideoOn(z);
                eiuVar.setViewModel(kiuVar);
                GroupCallViewModel.b.getClass();
                CallMemberId callMemberId = GroupCallViewModel.r.f;
                if (callMemberId != null) {
                    if (epx.f(kiuVar != null ? kiuVar.a.a : null, callMemberId)) {
                        z2 = true;
                        eiuVar.setPinned(z2);
                        com.vk.voip.ui.c.b.getClass();
                        eiuVar.setNameAlwaysVisible(!epx.f(com.vk.voip.ui.c.r.a(), kiuVar == null ? kiuVar.a.a : null));
                        if (kiuVar != null) {
                            eiuVar.setOnClickListener(null);
                            eiuVar.setOnLongClickListener(null);
                            return;
                        }
                        eiuVar.setOnClickListener(new m1l(1, this, ListGroupCallView.this));
                        if (com.vk.voip.ui.c.r0()) {
                            eiuVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.vez
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view) {
                                    ListGroupCallView.b.a.this.l.b5();
                                    return true;
                                }
                            });
                            return;
                        } else {
                            eiuVar.setOnLongClickListener(null);
                            return;
                        }
                    }
                }
                z2 = false;
                eiuVar.setPinned(z2);
                com.vk.voip.ui.c.b.getClass();
                eiuVar.setNameAlwaysVisible(!epx.f(com.vk.voip.ui.c.r.a(), kiuVar == null ? kiuVar.a.a : null));
                if (kiuVar != null) {
                }
            }
        }

        public b() {
            setHasStableIds(true);
            ListGroupCallView.this.L.addOnLayoutChangeListener(new x680(new cxu(ListGroupCallView.this, 1)));
            ListGroupCallView.this.J.addOnLayoutChangeListener(new x680(new uez(ListGroupCallView.this, 0)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return this.f.X(this.d.get(i).a.a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            aVar.V5(this.d.get(i), this.e);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            eiu eiuVar = new eiu(viewGroup.getContext());
            int i2 = ListGroupCallView.y0;
            eiuVar.setLayoutParams(new ConstraintLayout.b(i2, i2));
            eiuVar.setGetPrimaryParticipantId(new g4g(ListGroupCallView.this, 29));
            return new a(eiuVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(a aVar) {
            a aVar2 = aVar;
            super.onViewRecycled(aVar2);
            aVar2.V5(null, this.e);
        }
    }

    /* compiled from: ListGroupCallView.kt */
    public static final class c extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
            try {
                super.onLayoutChildren(vVar, a0Var);
            } catch (IndexOutOfBoundsException e) {
                L.g("Error on ListGroupCallView update", e);
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    /* compiled from: View.kt */
    public static final class d implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ ListGroupCallView d;

        public d(View view, boolean z, ListGroupCallView listGroupCallView) {
            this.b = view;
            this.c = z;
            this.d = listGroupCallView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int m;
            int i = ListGroupCallView.w0;
            boolean z = this.c;
            ListGroupCallView listGroupCallView = this.d;
            View view = this.b;
            if (z) {
                m = awt0.m(view) + Math.max(listGroupCallView.getHalfSpeakersHeight(), cn70.b(19));
            } else {
                int n = awt0.n(view);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                m = n + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            }
            listGroupCallView.i0.setGuidelineEnd(i + m);
            listGroupCallView.f5();
        }
    }

    /* compiled from: ListGroupCallView.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((dfn) this.receiver).a();
            return s3q0.a;
        }
    }

    /* compiled from: ListGroupCallView.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).q(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListGroupCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        bwt0.I(R.layout.voip_call_list_view, this, true);
        m6a m6aVar = new m6a();
        m6aVar.b = new CopyOnWriteArrayList();
        this.t = m6aVar;
        this.u = e43.l(VoipViewModelState.InCall, VoipViewModelState.Connecting, VoipViewModelState.CallingPeer, VoipViewModelState.WaitingRoom);
        j6x0 j6x0Var = new j6x0();
        this.v = j6x0Var;
        com.vk.voip.ui.c.b.getClass();
        a000 a000Var = (a000) com.vk.voip.ui.c.T().a;
        this.w = a000Var;
        this.x = com.vk.voip.ui.c.D0;
        ven venVar = com.vk.voip.ui.c.m0;
        dfn dfnVar = venVar.d;
        this.y = dfnVar;
        yen yenVar = venVar.e;
        this.z = yenVar;
        TextStatRendererView textStatRendererView = (TextStatRendererView) findViewById(R.id.debug_media_stat_list);
        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
        this.B = oKVoipEngine;
        u2x0 u2x0Var = com.vk.voip.ui.c.s0;
        a000 a000Var2 = (a000) com.vk.voip.ui.c.T().a;
        oKVoipEngine.getClass();
        this.C = new dad0(this, u2x0Var, new qfu(a000Var2, dfnVar, yenVar, oKVoipEngine.getVideoController(), OKVoipEngine.f, oKVoipEngine), new mc0(this, j6x0Var, com.vk.voip.ui.c.k0()));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.voip_group_call_list__recycler);
        this.D = recyclerView;
        this.E = (FrameLayout) findViewById(R.id.voip_group_call_list__recycler_container);
        ImageView imageView = (ImageView) findViewById(R.id.voip_group_call_list__collapse_button);
        this.F = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.voip_group_call_list__collapse_button_horizontal);
        this.G = imageView2;
        this.H = findViewById(R.id.voip_group_call_list__collapse_button_horizontal_container);
        TextView textView = (TextView) findViewById(R.id.voip_group_call_list__speakers);
        this.I = textView;
        this.J = (TextView) findViewById(R.id.voip_group_call_list__speakers_horizontal);
        this.K = (AsrOnlineView) findViewById(R.id.asr_online_view);
        AsrOnlineViewHorizontal asrOnlineViewHorizontal = (AsrOnlineViewHorizontal) findViewById(R.id.asr_online_view_horizontal);
        this.L = asrOnlineViewHorizontal;
        this.M = (FrameLayout) findViewById(R.id.voip_group_call_list__speakers_container);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.voip_group_call_list__speakers_horizontal_container);
        this.N = frameLayout;
        this.O = com.vk.voip.ui.c.l0();
        this.P = com.vk.voip.ui.c.k0();
        b bVar = new b();
        this.Q = bVar;
        c cVar = new c();
        cVar.setOrientation(0);
        cVar.l = true;
        this.R = cVar;
        this.V = new HashSet<>();
        this.W = new HashSet<>();
        this.a0 = new yro0(new io.reactivex.rxjava3.android.a(this, 8), i0q0.a(), TimeUnit.MILLISECONDS.toNanos(200L));
        this.b0 = Long.MAX_VALUE;
        io.reactivex.rxjava3.disposables.b bVar2 = new io.reactivex.rxjava3.disposables.b();
        this.d0 = bVar2;
        int i = r0;
        Size size = new Size(i, i);
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        this.e0 = new com.vk.voip.ui.groupcalls.list.a(a000Var, size, new com.vk.voip.ui.groupcalls.list.b(groupCallViewModel));
        ControlsBoundsProvider.c7.getClass();
        this.g0 = ControlsBoundsProvider.a.b;
        int i2 = 3;
        bwt0.i0(imageView, new x2y(this, i2));
        bwt0.i0(imageView2, new h6g(this, 27));
        asrOnlineViewHorizontal.setOrientationDelegate(a000Var);
        recyclerView.setLayoutManager(cVar);
        recyclerView.setAdapter(bVar);
        recyclerView.addItemDecoration(new wez());
        recyclerView.addOnScrollListener(new xez(this));
        recyclerView.setHasFixedSize(true);
        bwt0.h(recyclerView, new h(this, 1));
        u2x0 u2x0Var2 = com.vk.voip.ui.c.s0;
        textStatRendererView.setVisibility(((Boolean) u2x0Var2.h.invoke()).booleanValue() ? 0 : 8);
        if (((Boolean) u2x0Var2.h.invoke()).booleanValue()) {
            TextStatRenderer textStatRenderer = new TextStatRenderer(null, 1, 0 == true ? 1 : 0);
            textStatRenderer.setStatProcessor(OKVoipEngine.D);
            textStatRendererView.setRenderer(textStatRenderer);
            this.A = textStatRenderer;
        }
        bwt0.R(this, new b15(this, i2));
        groupCallViewModel.getClass();
        y i3 = GroupCallViewModel.i();
        asu0 asu0Var = asu0.a;
        int i4 = 2;
        bVar2.b(i3.a0(asu0Var.d()).subscribe(new l8w(new a(1, this, ListGroupCallView.class, "onModeChanged", "onModeChanged(Lcom/vk/voip/ui/groupcalls/GroupCallViewModel$GroupCallViewMode;)V", 0), i4)));
        int i5 = 26;
        hg1.e(bVar2, GroupCallViewModel.j.a0(asu0Var.d()).subscribe(new pf1(new vam(this, 20), i5)));
        this.i0 = (Guideline) findViewById(R.id.voip_participants_info_guideline);
        u3k u3kVar = new u3k(this, i5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j0 = msy.a(lazyThreadSafetyMode, u3kVar);
        this.k0 = msy.a(lazyThreadSafetyMode, new w8q(this, 18));
        this.l0 = msy.a(lazyThreadSafetyMode, new b1z(this, i4));
        this.m0 = e43.l(textView, frameLayout);
        this.n0 = EmptyList.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r3.i == r2.i) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r2 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s3q0 P4(ListGroupCallView listGroupCallView, kiu kiuVar, cfn cfnVar) {
        listGroupCallView.C.a(kiuVar);
        if (listGroupCallView.a5()) {
            kiu primaryViewModel = listGroupCallView.getPrimaryViewModel();
            if (kiuVar != null) {
                if (primaryViewModel != null && kiuVar.a.a.equals(primaryViewModel.a.a)) {
                    CallMember callMember = kiuVar.a;
                    boolean z = callMember.g;
                    CallMember callMember2 = primaryViewModel.a;
                    if (z == callMember2.g) {
                        if (callMember.h == callMember2.h) {
                        }
                    }
                }
                cfnVar.a();
            }
        } else {
            cfnVar.b();
        }
        return s3q0.a;
    }

    public static final int getASR_ONLINE_SIZE() {
        return t0;
    }

    private final AsrOnlineView getAsrOnlineViewByOrientation() {
        return this.w.isHorizontal() ? this.L : this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewPropertyAnimator getCollapseButtonAnimator() {
        return (ViewPropertyAnimator) this.j0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewPropertyAnimator getCollapseButtonHorizontalAnimator() {
        return (ViewPropertyAnimator) this.k0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewPropertyAnimator getCollapseListAnimator() {
        return (ViewPropertyAnimator) this.l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHalfSpeakersHeight() {
        return awt0.n(this.M) / 2;
    }

    private final boolean getHasParticipants() {
        GroupCallViewModel.b.getClass();
        return GroupCallViewModel.g.size() > 1;
    }

    private final int getInfoGuidelineEnd() {
        return ((ConstraintLayout.b) this.i0.getLayoutParams()).b;
    }

    public static final int getMAIN_MENU_SIZE() {
        return s0;
    }

    private final float getParticipantsAnimatedBottomOffset() {
        FrameLayout frameLayout = this.E;
        if (frameLayout.getVisibility() != 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return this.D.getTranslationY() + frameLayout.getTranslationY();
    }

    private final CallMemberId getPrimaryParticipantCandidate() {
        this.B.getClass();
        Conversation conversation = OKVoipEngine.E.getConversation();
        Object obj = null;
        CallMemberId u = conversation != null ? f9t.u(conversation) : null;
        dhw0 L = com.vk.voip.ui.c.b.L();
        if (L != null) {
            CallMemberId callMemberId = L.z;
            if (callMemberId != null || (callMemberId = L.y) != null) {
                return callMemberId;
            }
            Map<CallMemberId, List<Movie>> map = L.q;
            Iterator<T> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List<Movie> list = map.get((CallMemberId) next);
                if (list != null && !list.isEmpty()) {
                    obj = next;
                    break;
                }
            }
            CallMemberId callMemberId2 = (CallMemberId) obj;
            if (callMemberId2 != null || (callMemberId2 = (CallMemberId) j5g.Z(L.r)) != null || (callMemberId2 = L.m) != null) {
                return callMemberId2;
            }
        }
        return u;
    }

    private final kiu getPrimaryViewModel() {
        return this.C.m;
    }

    private final int getSpeakersBottomMargin() {
        return (this.v.b && ((Boolean) this.P.b.invoke()).booleanValue() && this.O.b() != null) ? u0 : v0;
    }

    private final void setAsrOnlineVisible(boolean z) {
        AsrOnlineViewHorizontal asrOnlineViewHorizontal = this.L;
        if (!z) {
            asrOnlineViewHorizontal.setVisibility(z ? 0 : 8);
        }
        zzz zzzVar = this.w;
        if (zzzVar.isHorizontal()) {
            asrOnlineViewHorizontal.setRotation(zzzVar.c());
            Z4();
        }
        if (zzzVar.isHorizontal()) {
            return;
        }
        int i = z ? 0 : 8;
        AsrOnlineView asrOnlineView = this.K;
        asrOnlineView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = asrOnlineView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float f2 = 8;
        marginLayoutParams.topMargin = iah0.a(f2);
        if (this.v.b) {
            f2 = 116;
        }
        marginLayoutParams.bottomMargin = iah0.a(f2);
        asrOnlineView.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T4(boolean z) {
        int i;
        mjw0 mjw0Var;
        CallMemberId callMemberId;
        boolean z2 = getVisibility() == 0;
        if (com.vk.voip.ui.c.b.s0() && this.u.contains(com.vk.voip.ui.c.K0)) {
            GroupCallViewModel.b.getClass();
            if (GroupCallViewModel.e == GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode) {
                i = 0;
                setVisibility(i);
                boolean z3 = z2 == (getVisibility() != 0);
                if (getVisibility() == 0) {
                    b bVar = this.Q;
                    int size = bVar.d.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        CallMember callMember = bVar.d.get(i2).a;
                        if ((callMember.i && !callMember.n) || !callMember.s.isEmpty()) {
                            callMemberId = bVar.d.get(i2).a.a;
                            break;
                        }
                    }
                    callMemberId = null;
                    GroupCallViewModel.b.getClass();
                    liu liuVar = GroupCallViewModel.r;
                    if (liuVar.e == null && liuVar.c == null && !epx.f(callMemberId, liuVar.d)) {
                        liuVar.d = callMemberId;
                        liuVar.f = callMemberId;
                        liuVar.a();
                    }
                    U4();
                    FrameLayout frameLayout = this.E;
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = bVar.d.size() < 4 ? -2 : -1;
                    frameLayout.setLayoutParams(layoutParams);
                    boolean hasParticipants = getHasParticipants();
                    frameLayout.setVisibility(hasParticipants ? 0 : 8);
                    e5(this.w.isHorizontal());
                    qj80.a(frameLayout, new d(frameLayout, hasParticipants, this));
                    h5(hasParticipants);
                    dfn dfnVar = this.y;
                    if (z) {
                        dfnVar.a();
                    } else if (z3) {
                        e eVar = new e(0, dfnVar, dfn.class, "triggerUpdate", "triggerUpdate()V", 0);
                        qcy<Object>[] qcyVarArr = bwt0.a;
                        RecyclerView recyclerView = this.D;
                        recyclerView.addOnLayoutChangeListener(new lwt0(recyclerView, eVar, 200L));
                    }
                }
                mjw0Var = this.T;
                if (mjw0Var == null) {
                    mjw0Var.setHasListRecycler$ui_release(getVisibility() == 0);
                    return;
                }
                return;
            }
        }
        i = 8;
        setVisibility(i);
        if (z2 == (getVisibility() != 0)) {
        }
        if (getVisibility() == 0) {
        }
        mjw0Var = this.T;
        if (mjw0Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U4() {
        boolean z;
        boolean a5;
        kiu primaryViewModel;
        kiu primaryViewModel2;
        CallMemberId primaryId;
        CallMemberId callMemberId;
        ListGroupCallView listGroupCallView;
        TextStatRenderer textStatRenderer;
        CallMemberId primaryParticipantCandidate = getPrimaryParticipantCandidate();
        CallMemberId primaryId2 = getPrimaryId();
        if (primaryId2 != null) {
            GroupCallViewModel.b.getClass();
            if (GroupCallViewModel.b(primaryId2) == null) {
                z = true;
                a5 = a5();
                b bVar = this.Q;
                if (a5) {
                    primaryViewModel = null;
                } else {
                    if (primaryParticipantCandidate != null) {
                        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
                        groupCallViewModel.getClass();
                        if (GroupCallViewModel.b(primaryParticipantCandidate) != null) {
                            groupCallViewModel.getClass();
                            primaryViewModel = GroupCallViewModel.b(primaryParticipantCandidate);
                        }
                    }
                    primaryViewModel = (getPrimaryViewModel() == null || z) ? (kiu) j5g.b0(0, bVar.d) : getPrimaryViewModel();
                }
                if (!epx.f(primaryId2, getPrimaryId())) {
                    this.b0 = Long.MAX_VALUE;
                    this.c0 = null;
                }
                dfn dfnVar = this.y;
                dfnVar.getClass();
                if (i0q0.b()) {
                    P4(this, primaryViewModel, dfnVar);
                } else {
                    dfnVar.c++;
                    P4(this, primaryViewModel, dfnVar);
                    int i = dfnVar.c - 1;
                    dfnVar.c = i;
                    if (i == 0 && dfnVar.b) {
                        dfnVar.a.onNext(cfn.a.a);
                    }
                    dfnVar.b = false;
                }
                primaryViewModel2 = getPrimaryViewModel();
                if (primaryViewModel2 != null) {
                    ft80.a aVar = this.U;
                    if (aVar != null) {
                        aVar.hide();
                    }
                } else {
                    CallMember callMember = primaryViewModel2.a;
                    if (callMember.n) {
                        ft80.a aVar2 = this.U;
                        if (aVar2 != null) {
                            aVar2.hide();
                        }
                    } else {
                        CallMember.NetworkStatus networkStatus = callMember.r;
                        if (networkStatus == CallMember.NetworkStatus.GOOD) {
                            ft80.a aVar3 = this.U;
                            if (aVar3 != null) {
                                aVar3.hide();
                            }
                        } else {
                            if (networkStatus == CallMember.NetworkStatus.MEDIUM) {
                                com.vk.voip.ui.c.b.getClass();
                                if (com.vk.voip.ui.c.o0()) {
                                    ft80.a aVar4 = this.U;
                                    if (aVar4 != null) {
                                        aVar4.show();
                                    }
                                }
                            }
                            if (primaryViewModel2.a.r == CallMember.NetworkStatus.BAD) {
                                com.vk.voip.ui.c.b.getClass();
                                if (com.vk.voip.ui.c.o0()) {
                                    ft80.a aVar5 = this.U;
                                    if (aVar5 != null) {
                                        aVar5.show();
                                    }
                                }
                            }
                            ft80.a aVar6 = this.U;
                            if (aVar6 != null) {
                                aVar6.hide();
                            }
                        }
                    }
                }
                primaryId = getPrimaryId();
                if (primaryId != null && (textStatRenderer = this.A) != null) {
                    TextStatRenderer.setSource$default(textStatRenderer, mnh0.H(primaryId), null, 2, null);
                }
                callMemberId = bVar.c;
                listGroupCallView = ListGroupCallView.this;
                if (epx.f(callMemberId, listGroupCallView.getPrimaryId())) {
                    bVar.c = listGroupCallView.getPrimaryId();
                    Iterator<T> it = bVar.d.iterator();
                    while (it.hasNext()) {
                        RecyclerView.e0 findViewHolderForItemId = listGroupCallView.D.findViewHolderForItemId(bVar.f.X(((kiu) it.next()).a.a));
                        b.a aVar7 = findViewHolderForItemId instanceof b.a ? (b.a) findViewHolderForItemId : null;
                        if (aVar7 != null) {
                            aVar7.l.e5();
                        }
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        a5 = a5();
        b bVar2 = this.Q;
        if (a5) {
        }
        if (!epx.f(primaryId2, getPrimaryId())) {
        }
        dfn dfnVar2 = this.y;
        dfnVar2.getClass();
        if (i0q0.b()) {
        }
        primaryViewModel2 = getPrimaryViewModel();
        if (primaryViewModel2 != null) {
        }
        primaryId = getPrimaryId();
        if (primaryId != null) {
            TextStatRenderer.setSource$default(textStatRenderer, mnh0.H(primaryId), null, 2, null);
        }
        callMemberId = bVar2.c;
        listGroupCallView = ListGroupCallView.this;
        if (epx.f(callMemberId, listGroupCallView.getPrimaryId())) {
        }
    }

    public final void V4() {
        getAsrOnlineViewByOrientation().b.setText("");
    }

    public final void X4(View view) {
        float h = w65.h(view);
        float c2 = this.w.c();
        int i = A0;
        if (c2 == 90.0f) {
            view.setTranslationX((-h) + i);
        } else if (c2 == 270.0f) {
            view.setTranslationX(h - i);
        } else {
            view.setTranslationX(h);
        }
    }

    public final void Y4(View view) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        if (this.w.isHorizontal()) {
            float f2 = -measuredWidth;
            view.setTranslationX(o0 + f2);
            view.setTranslationY(f2 - p0);
        }
    }

    public final void Z4() {
        AsrOnlineViewHorizontal asrOnlineViewHorizontal = this.L;
        ViewGroup.LayoutParams layoutParams = asrOnlineViewHorizontal.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.i = 0;
        bVar.l = 0;
        bVar.t = 0;
        bVar.v = -1;
        asrOnlineViewHorizontal.setLayoutParams(bVar);
        ViewGroup.LayoutParams layoutParams2 = asrOnlineViewHorizontal.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.bottomMargin = q0;
        asrOnlineViewHorizontal.setLayoutParams(marginLayoutParams);
    }

    public final boolean a5() {
        if (getVisibility() != 0) {
            return false;
        }
        GroupCallViewModel.b.getClass();
        return GroupCallViewModel.e == GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode;
    }

    public final void b5(boolean z) {
        setAsrOnlineVisible(z);
        bwt0.d(this.C.b, z ? 40.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (r4 & 2) != 0, (r4 & 4) != 0);
        if (this.w.isHorizontal()) {
            g5(false);
        } else {
            g5(z);
        }
    }

    public final void c5() {
        boolean z = this.S;
        if (z) {
            if (z) {
                this.S = false;
                getCollapseListAnimator().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).withEndAction(new qb3(this, 6));
                getCollapseButtonAnimator().rotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                getCollapseButtonHorizontalAnimator().rotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.S = true;
        getCollapseListAnimator().translationY(this.D.getHeight()).withEndAction(new hv2(this, 7));
        getCollapseButtonAnimator().rotation(180.0f);
        getCollapseButtonHorizontalAnimator().rotation(180.0f);
    }

    public final void d5(int i, int i2) {
        AsrOnlineViewHorizontal asrOnlineViewHorizontal = this.L;
        if (i != 0) {
            asrOnlineViewHorizontal.i += i;
        }
        if (i2 != 0) {
            asrOnlineViewHorizontal.i += -i2;
        }
    }

    public final void e5(boolean z) {
        int i = (z || !getHasParticipants()) ? 8 : 0;
        ImageView imageView = this.F;
        imageView.setVisibility(i);
        int i2 = (z && getHasParticipants()) ? 0 : 8;
        ImageView imageView2 = this.G;
        imageView2.setVisibility(i2);
        int i3 = (z || !this.h0) ? 8 : 0;
        TextView textView = this.I;
        textView.setVisibility(i3);
        int i4 = (z && this.h0) ? 0 : 8;
        TextView textView2 = this.J;
        textView2.setVisibility(i4);
        this.M.setVisibility((imageView.getVisibility() == 0 || textView.getVisibility() == 0) ? 0 : 8);
        this.N.setVisibility((imageView2.getVisibility() == 0 || textView2.getVisibility() == 0) ? 0 : 8);
    }

    public final void f5() {
        float participantsAnimatedBottomOffset = getParticipantsAnimatedBottomOffset();
        this.M.setTranslationY(participantsAnimatedBottomOffset);
        this.N.setTranslationY(participantsAnimatedBottomOffset);
        if (this.x.b.a().b) {
            this.L.setTranslationY(participantsAnimatedBottomOffset / 2);
        }
        Y4(this.J);
        Iterator it = this.v.a.iterator();
        while (it.hasNext()) {
            ((jvw0) it.next()).b();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.t.b).iterator();
        while (it2.hasNext()) {
            ((zpj) it2.next()).b();
        }
    }

    @Override // xsna.ckj0
    public final Collection g3() {
        CallMemberId primaryId = getPrimaryId();
        return primaryId == null ? EmptySet.b : Collections.singleton(primaryId);
    }

    public final void g5(boolean z) {
        int i;
        if (z) {
            boolean z2 = this.v.b;
            i = t0;
            if (z2) {
                i += s0;
            }
        } else {
            i = 0;
        }
        ViewPager2 viewPager2 = this.C.b;
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i;
        viewPager2.setLayoutParams(marginLayoutParams);
        FrameLayout frameLayout = this.E;
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = iah0.a(z ? 8 : 108);
        frameLayout.setLayoutParams(marginLayoutParams2);
    }

    @Override // xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        return this.n0;
    }

    @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
    public int getBottomOffset() {
        int infoGuidelineEnd = getInfoGuidelineEnd() - ((int) getParticipantsAnimatedBottomOffset());
        int halfSpeakersHeight = getHalfSpeakersHeight() + w0;
        return this.w.isHorizontal() ? infoGuidelineEnd - halfSpeakersHeight : infoGuidelineEnd + halfSpeakersHeight;
    }

    public final ControlsBoundsProvider getBoundsProvider() {
        return this.g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017d A[SYNTHETIC] */
    @Override // xsna.wen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wen.a getDisplayLayouts() {
        ArrayList arrayList;
        ConversationDisplayLayoutItem conversationDisplayLayoutItem;
        if (!a5()) {
            return wen.a.C3930a.a;
        }
        yro0 yro0Var = this.a0;
        xw1 xw1Var = yro0Var.e;
        if (xw1Var != null) {
            yro0Var.b.removeCallbacks(xw1Var);
        }
        yro0Var.e = null;
        yro0Var.a.run();
        yro0Var.d = System.nanoTime();
        CallMemberId primaryId = getPrimaryId();
        CallMemberId callMemberId = (CallMemberId) j5g.Z(primaryId == null ? EmptySet.b : Collections.singleton(primaryId));
        com.vk.voip.ui.groupcalls.list.a aVar = this.e0;
        aVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet<CallMemberId> linkedHashSet = new LinkedHashSet();
        HashSet<CallMemberId> hashSet = this.V;
        linkedHashSet.addAll(hashSet);
        HashSet<CallMemberId> hashSet2 = this.W;
        linkedHashSet.addAll(hashSet2);
        if (callMemberId != null) {
            linkedHashSet.add(callMemberId);
        }
        for (CallMemberId callMemberId2 : linkedHashSet) {
            VideoDisplayLayout videoDisplayLayout = aVar.c;
            com.vk.voip.ui.groupcalls.list.b bVar = aVar.b;
            if (epx.f(callMemberId2, callMemberId)) {
                arrayList = new ArrayList();
                kiu a2 = bVar.a(callMemberId2);
                if (a2 != null) {
                    CallMemberId callMemberId3 = a2.a.a;
                    ParticipantId H = mnh0.H(callMemberId3);
                    Movie movie = (Movie) j5g.a0(a2.a.s);
                    if (movie != null) {
                        new el90.e(H, movie);
                    }
                    CallMember callMember = a2.a;
                    if (callMember.i && !callMember.n) {
                        new el90.b(H);
                    }
                    el90.c aVar2 = a2.a.h ? new el90.a(H) : null;
                    el90.c dVar = a2.a.g ? new el90.d(H) : null;
                    if (hashSet2.contains(callMemberId3) || hashSet.contains(callMemberId3)) {
                        if (dVar != null) {
                            aVar2 = dVar;
                        }
                        if (aVar2 != null) {
                            conversationDisplayLayoutItem = new ConversationDisplayLayoutItem(new ConversationVideoTrackParticipantKey.Builder().setType(dVar != null ? VideoTrackType.VIDEO : VideoTrackType.ANIMOJI).setParticipantId(aVar2.b()).build(), videoDisplayLayout);
                            if (conversationDisplayLayoutItem == null) {
                                arrayList.add(conversationDisplayLayoutItem);
                            }
                        }
                    }
                    conversationDisplayLayoutItem = null;
                    if (conversationDisplayLayoutItem == null) {
                    }
                }
            } else {
                arrayList = new ArrayList();
                kiu a3 = bVar.a(callMemberId2);
                if (a3 != null) {
                    ParticipantId H2 = mnh0.H(a3.a.a);
                    Movie movie2 = (Movie) j5g.a0(a3.a.s);
                    el90.e eVar = movie2 == null ? null : new el90.e(H2, movie2);
                    CallMember callMember2 = a3.a;
                    el90 el90Var = (el90) j5g.a0(rl3.I(new el90[]{eVar, (!callMember2.i || callMember2.n) ? null : new el90.b(H2), a3.a.h ? new el90.a(H2) : null, a3.a.g ? new el90.d(H2) : null}));
                    ConversationDisplayLayoutItem conversationDisplayLayoutItem2 = el90Var != null ? new ConversationDisplayLayoutItem(el90Var.a(), videoDisplayLayout) : null;
                    if (conversationDisplayLayoutItem2 != null) {
                        arrayList.add(conversationDisplayLayoutItem2);
                    }
                }
            }
            arrayList2.addAll(arrayList);
        }
        return new wen.a.b(arrayList2);
    }

    public ControlsBoundsProvider.Gravity getHorizontalGravity() {
        return ControlsBoundsProvider.Gravity.LEFT;
    }

    public final ft80.a getOpponentNetworkStatusVisibilityUpdater$ui_release() {
        return this.U;
    }

    public final izs<CallMemberId, s3q0> getPinNotAllowedListener() {
        return this.f0;
    }

    public final i6x0 getPlayerMediator() {
        return this.v;
    }

    public final CallMemberId getPrimaryId() {
        kiu kiuVar = this.C.m;
        if (kiuVar != null) {
            return kiuVar.a.a;
        }
        return null;
    }

    public SpannableStringBuilder getSubtitlesTextSpannable() {
        return this.K.getSubtitlesTextSpannable();
    }

    @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
    public int getTopOffset() {
        return (this.w.isHorizontal() && getHorizontalGravity() == ControlsBoundsProvider.Gravity.LEFT) ? this.g0.getTopOffset() : this.g0.getTopOffset() + w0;
    }

    @Override // xsna.tmg0
    public List<View> getViewsToRotate() {
        return this.m0;
    }

    public final mjw0 getVoipCallView$ui_release() {
        return this.T;
    }

    public final void h5(boolean z) {
        int i = v0;
        int i2 = z ? x0 : i;
        if (this.w.c() != 180.0f) {
            i = i2;
            i2 = i;
        }
        TextView textView = this.I;
        textView.setPaddingRelative(i, textView.getPaddingTop(), i2, textView.getPaddingBottom());
        int a2 = iah0.a(16);
        TextView textView2 = this.J;
        textView2.setPaddingRelative(a2, textView2.getPaddingTop(), textView2.getPaddingEnd(), textView2.getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        T4(false);
        io.reactivex.rxjava3.disposables.c subscribe = ysg0.b.a.b0(h3x0.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new st0(new qpj(this, 24), 22), new n3t(new f(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0), 7));
        io.reactivex.rxjava3.disposables.b bVar = this.d0;
        hg1.e(bVar, subscribe);
        dad0 dad0Var = this.C;
        com.vk.voip.ui.groupcalls.list.primary.tab.a aVar = dad0Var.l;
        if (aVar != null) {
            tad0 tad0Var = dad0Var.k;
            if (tad0Var != null) {
                ViewPager2 viewPager2 = tad0Var.a;
                if (!tad0Var.c) {
                    tad0Var.c = true;
                    if (viewPager2.getAdapter() == null) {
                        throw new IllegalStateException("Attached before view pager has an adapter");
                    }
                    tad0.a aVar2 = new tad0.a(tad0Var.b);
                    tad0Var.d = aVar2;
                    viewPager2.b(aVar2);
                }
            }
            dad0Var.d();
            GroupCallViewModel.b.getClass();
            aVar.setTabsVisible(GroupCallViewModel.e == GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode);
        }
        GroupCallViewModel.b.getClass();
        dad0Var.g.b(GroupCallViewModel.i().U(new aad0(new cad0(1, dad0Var, dad0.class, "areTabsVisible", "areTabsVisible(Lcom/vk/voip/ui/groupcalls/GroupCallViewModel$GroupCallViewMode;)Z", 0), 0)).a0(asu0.a.d()).subscribe(new xj50(new q130(dad0Var, 18), 9)));
        this.w.d(this);
        bVar.b(GroupCallViewModel.m.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new np3(new w7u(this, 5), 28), new pp3(new oey(2), 27)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EmptyList emptyList = EmptyList.b;
        b bVar = this.Q;
        bVar.getClass();
        bVar.d = j5g.O0(emptyList);
        bVar.notifyDataSetChanged();
        getCollapseButtonAnimator().cancel();
        getCollapseButtonHorizontalAnimator().cancel();
        getCollapseListAnimator().cancel();
        this.d0.dispose();
        dad0 dad0Var = this.C;
        dad0Var.b();
        io.reactivex.rxjava3.disposables.c cVar = dad0Var.h;
        if (cVar != null) {
            cVar.dispose();
        }
        dad0Var.h = null;
        dad0Var.b.setAdapter(null);
        dad0Var.g.dispose();
        this.w.b(this);
        TextStatRenderer textStatRenderer = this.A;
        if (textStatRenderer != null) {
            textStatRenderer.setStatProcessor(null);
        }
        this.z.b(this);
    }

    public final void setBoundsProvider(ControlsBoundsProvider controlsBoundsProvider) {
        this.g0 = controlsBoundsProvider;
    }

    public final void setListener(y990 y990Var) {
        this.C.i = y990Var;
    }

    public final void setOpponentNetworkStatusVisibilityUpdater$ui_release(ft80.a aVar) {
        this.U = aVar;
    }

    public final void setPinNotAllowedListener(izs<? super CallMemberId, s3q0> izsVar) {
        this.f0 = izsVar;
    }

    public final void setPrimaryParticipantTabs(com.vk.voip.ui.groupcalls.list.primary.tab.a aVar) {
        dad0 dad0Var = this.C;
        dad0Var.b();
        if (aVar == null) {
            return;
        }
        dad0Var.l = aVar;
        aVar.setListener(new xx40(dad0Var, 6));
        dad0Var.k = new tad0(dad0Var.b, aVar);
    }

    public final void setVoipCallView$ui_release(mjw0 mjw0Var) {
        this.T = mjw0Var;
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f2) {
        super.v0(f2);
        if (this.x.b.a().b) {
            AsrOnlineViewHorizontal asrOnlineViewHorizontal = this.L;
            asrOnlineViewHorizontal.setRotation(f2);
            Z4();
            if (f2 != asrOnlineViewHorizontal.h) {
                bwt0.p0(asrOnlineViewHorizontal, false);
            }
            asrOnlineViewHorizontal.h = f2;
            AsrOnlineView asrOnlineView = this.K;
            if (f2 == 90.0f) {
                g5(false);
                asrOnlineView.setVisibility(8);
                X4(asrOnlineViewHorizontal);
            } else if (f2 == 270.0f) {
                g5(false);
                asrOnlineView.setVisibility(8);
                X4(asrOnlineViewHorizontal);
            } else if (f2 == 180.0f) {
                asrOnlineViewHorizontal.setVisibility(8);
            } else if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                asrOnlineView.setVisibility(0);
                asrOnlineViewHorizontal.setVisibility(8);
                g5(true);
            }
        }
        View view = this.H;
        int i = z0;
        TextView textView = this.J;
        if (f2 == 90.0f) {
            view.setRotation(-90.0f);
            textView.setRotation(f2);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(getSpeakersBottomMargin());
            marginLayoutParams.setMarginEnd(i);
            textView.setLayoutParams(marginLayoutParams);
            e5(true);
        } else if (f2 == 270.0f) {
            view.setRotation(90.0f);
            textView.setRotation(f2);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(i);
            marginLayoutParams2.setMarginEnd(getSpeakersBottomMargin());
            textView.setLayoutParams(marginLayoutParams2);
            e5(true);
        } else {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.setMarginStart(i);
            marginLayoutParams3.setMarginEnd(i);
            textView.setLayoutParams(marginLayoutParams3);
            e5(false);
            h5(getHasParticipants());
        }
        this.y.a();
    }

    @Override // xsna.ckj0
    public final void w2(String str) {
        String str2;
        boolean isHorizontal = this.w.isHorizontal();
        TextView textView = this.J;
        TextView textView2 = this.I;
        if (str == null || drm0.N(str)) {
            kiu primaryViewModel = getPrimaryViewModel();
            if (primaryViewModel == null) {
                this.h0 = false;
                e5(isHorizontal);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!epx.f(this.c0, primaryViewModel.a.a)) {
                this.b0 = currentTimeMillis + 2000;
                this.c0 = primaryViewModel.a.a;
                postDelayed(new z27(nlk.b, 6), 2000L);
            } else if (currentTimeMillis >= this.b0) {
                this.h0 = false;
                e5(isHorizontal);
                return;
            }
            CallMember callMember = primaryViewModel.a;
            int i = callMember.f ? 0 : R.drawable.ic_mic_disabled_shadow_16;
            if (callMember.n) {
                str2 = getContext().getString(R.string.voip_call_own_name);
            } else if (callMember.i) {
                Context context = getContext();
                nlk nlkVar = nlk.b;
                String str3 = primaryViewModel.f;
                String str4 = primaryViewModel.d;
                nlkVar.getClass();
                str2 = context.getString(R.string.voip_current_screen_of, nlk.b(str3, str4));
            } else {
                str2 = primaryViewModel.c + ' ' + primaryViewModel.d;
            }
            textView2.setText(str2);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
            textView.setText(str2);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        } else {
            this.h0 = true;
            textView2.setText(str);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            textView.setText(str);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        e5(isHorizontal);
    }

    @Override // xsna.qhj0
    public final void y3(List<iew0> list) {
        if (!list.isEmpty()) {
            getAsrOnlineViewByOrientation().a(list);
        } else {
            this.K.a(list);
            this.L.a(list);
        }
    }
}
