package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.component.reward.pcc.tmg;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.qy;
import com.bytedance.sdk.openadsdk.core.model.tsz;
import com.bytedance.sdk.openadsdk.core.model.zti;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.erf;
import defpackage.nem;
import defpackage.nwm;
import defpackage.p03;
import defpackage.qrf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends com.bytedance.sdk.openadsdk.activity.single.gm implements Handler.Callback {
    private boolean atb;
    private boolean bg;
    private final boolean dax;
    private boolean erj;
    private boolean ew;
    private long fmh;
    private boolean fum;
    private final HashSet<String> gbb;
    private boolean gd;
    private final ArrayList<Message> gpj;
    private final AtomicBoolean hc;
    private wh hoh;
    private JSONObject hpk;
    private FrameLayout iv;
    private final boolean jr;
    private boolean jsj;
    private final LinearLayoutManager kj;
    private int kun;
    private long kz;
    private final boolean lo;
    private kj lq;
    private boolean lrr;
    private final PAGLogoView lu;
    private boolean mk;
    private int mu;
    private final HashSet<Integer> nac;
    private com.bytedance.sdk.openadsdk.activity.single.vj nn;
    private int of;
    private final Handler ork;
    private int pq;
    private Message ptr;
    private boolean qcw;
    private final pcc qf;
    private int qy;
    private JSONObject ri;
    private JSONObject rj;
    private boolean rnn;
    private boolean se;
    private final boolean tmg;
    private qy.pcc tsx;
    private int tsz;
    private int tz;
    private final FrameLayout vh;
    private View vr;
    private final TopLayoutDislike2 vy;
    private final RecyclerView wh;
    private boolean xb;
    private int ye;
    private boolean yt;
    private long zsj;
    private sf.vj zti;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm extends vj {
        private final TextView pcc;

        public gm(@NonNull View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(view.getContext());
            this.pcc = kjVar;
            kjVar.setTextColor(Color.parseColor("#99FFFFFF"));
            kjVar.setTextSize(14.0f);
            kjVar.setGravity(17);
            kjVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(kjVar, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.oo.vj
        public void pcc(oo ooVar, C0064oo c0064oo, int i) {
            this.pcc.setText(c0064oo.gm);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class vj extends u {
        public vj(@NonNull View view) {
            super(view);
        }

        public abstract void pcc(oo ooVar, C0064oo c0064oo, int i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class wh implements Runnable {
        private long gm;
        private long oo;
        private final Handler pcc = new Handler(Looper.getMainLooper());
        private final long sf;
        private long vj;

        public wh(long j) {
            this.sf = j;
        }

        public void gm() {
            long j = this.sf - this.oo;
            if (j < 0) {
                return;
            }
            this.pcc.removeCallbacks(this);
            this.pcc.postDelayed(this, j);
            this.gm = SystemClock.elapsedRealtime();
        }

        public void oo() {
            this.pcc.removeCallbacks(this);
        }

        public abstract void pcc();

        @Override // java.lang.Runnable
        public void run() {
            pcc();
        }

        public void sf() {
            this.pcc.removeCallbacks(this);
            if (this.vj > this.gm) {
                return;
            }
            this.oo = (SystemClock.elapsedRealtime() - this.gm) + this.oo;
            this.vj = SystemClock.elapsedRealtime();
        }

        public void vj() {
            this.pcc.postDelayed(this, this.sf);
            this.gm = SystemClock.elapsedRealtime();
        }

        public long wh() {
            long j;
            long j2 = this.gm;
            long j3 = this.vj;
            long j4 = this.sf;
            if (j2 > j3) {
                j4 -= SystemClock.elapsedRealtime() - this.gm;
                j = this.oo;
            } else {
                j = this.oo;
            }
            long j5 = j4 - j;
            if (j5 < 0) {
                return 0L;
            }
            return j5;
        }
    }

    public oo(final Activity activity, final of ofVar, final com.bytedance.sdk.openadsdk.activity.single.sf sfVar) {
        super(activity, ofVar, sfVar);
        qy vh;
        this.ork = new Handler(Looper.getMainLooper(), this);
        this.hc = new AtomicBoolean(false);
        this.gbb = new HashSet<>();
        this.nac = new HashSet<>();
        this.gpj = new ArrayList<>();
        this.tz = 5;
        this.of = 3;
        this.ye = -1;
        int i = 1;
        this.zti = new sf.vj(1, null);
        boolean z = ofVar.bg() == 44;
        this.jr = z;
        boolean tuy = ofVar.tuy();
        this.tmg = tuy;
        this.dax = tmg.pcc(activity, ofVar) == 1;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(activity) { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                oo.this.ri = null;
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        this.vh = gmVar;
        if (Build.VERSION.SDK_INT >= 35) {
            gmVar.setFitsSystemWindows(true);
        }
        activity.setContentView(gmVar);
        this.vj = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.pcc oo = ofVar.oo();
        if (oo != null && (vh = oo.vh()) != null) {
            this.rnn = vh.jr();
            this.tsx = vh.wh();
            int max = Math.max(0, vh.vy());
            this.pq = max;
            this.mu = max;
            this.mk = vh.gbb();
            this.jsj = vh.vh();
            this.qy = vh.kj();
            this.rj = vh.tmg();
            this.yt = vh.ork();
            this.fum = vh.pcc();
            this.lrr = this.qy > 0;
            this.tz = vh.oo();
            this.of = vh.vj();
            this.ri = vh.sf();
            this.hpk = vh.gm();
            if (!this.jsj) {
                this.rnn = false;
            }
        }
        if (tuy) {
            this.tsz = (int) ((1.0f - (Math.max(0, Math.min(100, ofVar.vgx() < 0 ? lu.oo().tsz(String.valueOf(ofVar.kot())).wh : r3)) / 100.0f)) * this.pq);
        }
        RecyclerView recyclerView = new RecyclerView(activity);
        this.wh = recyclerView;
        qy.pcc pccVar = this.tsx;
        if (pccVar != null) {
            int gm2 = pccVar.gm();
            int oo2 = this.tsx.oo();
            if (gm2 > 0 || oo2 > 0) {
                recyclerView.setPadding(rj.sf(activity, gm2), 0, rj.sf(activity, oo2), 0);
            }
            int sf2 = this.tsx.sf();
            int pcc2 = this.tsx.pcc();
            int vj2 = this.tsx.vj();
            if (sf2 > 0 || vj2 > 0 || pcc2 > 0) {
                final int sf3 = rj.sf(activity, sf2);
                final int sf4 = rj.sf(activity, pcc2);
                final int sf5 = rj.sf(activity, vj2);
                recyclerView.addItemDecoration(new erf() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.11
                    @Override // defpackage.erf
                    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView2, @NonNull qrf qrfVar) {
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (childAdapterPosition == 0) {
                            rect.top = sf3;
                        } else {
                            rect.top = sf5 / 2;
                        }
                        if (childAdapterPosition == itemCount - 1) {
                            rect.bottom = sf4;
                        } else {
                            rect.bottom = sf5 / 2;
                        }
                    }
                });
            }
        }
        gmVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.vy = topLayoutDislike2;
        gmVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(ofVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        boolean lu = lu.oo().lu(String.valueOf(ofVar.kot()));
        this.atb = lu;
        topLayoutDislike2.setSoundMute(lu);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.12
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void gm(View view) {
                sfVar.qf();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc3;
                of ofVar2 = ofVar;
                com.bytedance.sdk.openadsdk.oo.gm.pcc("skip", ofVar2, ofVar2.vj(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.oo gto = ofVar.gto();
                if (gto != null && (pcc3 = gto.pcc()) != null) {
                    pcc3.wh(0L);
                    pcc3.vj(0L);
                }
                oo.this.qy();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                if (oo.this.lq != null) {
                    oo.this.lq.e_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void oo(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                if (oo.this.lq != null) {
                    oo.this.lq.pcc(str);
                    oo.this.atb = !r0.atb;
                }
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, i, r1) { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.13
            {
                super(i, r4);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(@NonNull qrf qrfVar, @NonNull int[] iArr) {
                super.calculateExtraLayoutSpace(qrfVar, iArr);
                int height = oo.this.wh.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.kj = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        pcc pccVar2 = new pcc(this, ofVar.ky());
        this.qf = pccVar2;
        recyclerView.setAdapter(pccVar2);
        if (!this.lrr && !this.yt) {
            pccVar2.pcc(tz.pcc(activity, "tt_list_end_tip"));
        }
        if (z) {
            new i().attachToRecyclerView(recyclerView);
        } else if (this.jsj) {
            new com.bytedance.sdk.openadsdk.component.reward.view.pcc().attachToRecyclerView(recyclerView);
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.14
            private final Rect gm = new Rect();
            private int oo = -1;
            private int vj;

            private void pcc() {
                int oo3;
                View findViewByPosition;
                if (oo.this.fum && (oo3 = oo.this.qf.oo()) != 0) {
                    int findFirstVisibleItemPosition = oo.this.kj.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = oo.this.kj.findLastVisibleItemPosition();
                    if (findLastVisibleItemPosition % oo3 > this.oo) {
                        for (int i2 = findFirstVisibleItemPosition; i2 <= findLastVisibleItemPosition; i2++) {
                            int i3 = i2 % oo3;
                            if (i3 > this.oo) {
                                if ((i2 == findFirstVisibleItemPosition || i2 == findLastVisibleItemPosition) && (findViewByPosition = oo.this.kj.findViewByPosition(i2)) != null) {
                                    this.gm.setEmpty();
                                    findViewByPosition.getGlobalVisibleRect(this.gm);
                                    int height = findViewByPosition.getHeight();
                                    if (height > 0) {
                                        if ((this.gm.height() * 1.0f) / height < 0.5f) {
                                        }
                                    }
                                }
                                u findViewHolderForAdapterPosition = oo.this.wh.findViewHolderForAdapterPosition(i2);
                                if (findViewHolderForAdapterPosition instanceof sf) {
                                    sf sfVar2 = (sf) findViewHolderForAdapterPosition;
                                    if (sfVar2.gm != null) {
                                        sfVar2.gm.kz();
                                    }
                                }
                                if (i3 > this.oo) {
                                    this.oo = i3;
                                }
                            }
                        }
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView2, int i2) {
                super.onScrollStateChanged(recyclerView2, i2);
                if (com.bytedance.sdk.component.utils.sf.pcc(activity)) {
                    return;
                }
                int findFirstCompletelyVisibleItemPosition = oo.this.kj.findFirstCompletelyVisibleItemPosition();
                oo.this.kj.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = oo.this.kj.findLastVisibleItemPosition();
                if (findFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i2 == 0 && findFirstCompletelyVisibleItemPosition != oo.this.ye) {
                    boolean z2 = findFirstCompletelyVisibleItemPosition == oo.this.kun;
                    oo ooVar = oo.this;
                    ooVar.pcc(findFirstCompletelyVisibleItemPosition, ooVar.rnn && z2);
                    if (oo.this.rnn && !z2 && oo.this.mk) {
                        oo.this.rnn = false;
                    }
                    if (oo.this.hoh != null) {
                        oo.this.hoh.oo();
                        oo.this.hoh = null;
                    }
                }
                if (i2 == 0) {
                    oo.this.kun = -1;
                }
                if (!oo.this.lrr || oo.this.qy <= 0 || findLastVisibleItemPosition < oo.this.qf.pcc() - oo.this.qy) {
                    return;
                }
                oo.this.tz();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NonNull RecyclerView recyclerView2, int i2, int i3) {
                super.onScrolled(recyclerView2, i2, i3);
                if (i3 == 0 || com.bytedance.sdk.component.utils.sf.pcc(activity)) {
                    return;
                }
                pcc();
                int findLastVisibleItemPosition = oo.this.kj.findLastVisibleItemPosition();
                if (i3 > 0 && oo.this.lrr && oo.this.qy > 0 && findLastVisibleItemPosition >= oo.this.qf.pcc() - oo.this.qy) {
                    oo.this.tz();
                }
                if (this.vj != findLastVisibleItemPosition) {
                    this.vj = findLastVisibleItemPosition;
                    if (!oo.this.nac.isEmpty() && oo.this.nac.contains(Integer.valueOf(findLastVisibleItemPosition))) {
                        oo.this.nac.remove(Integer.valueOf(findLastVisibleItemPosition));
                        u findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(findLastVisibleItemPosition);
                        if (findViewHolderForAdapterPosition instanceof sf) {
                            sf sfVar2 = (sf) findViewHolderForAdapterPosition;
                            sfVar2.gm.vj(true);
                            sfVar2.gm.tsz();
                            return;
                        }
                        return;
                    }
                    if (oo.this.erj) {
                        oo.this.erj = false;
                        u findViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(findLastVisibleItemPosition);
                        if (findViewHolderForAdapterPosition2 instanceof sf) {
                            sf sfVar3 = (sf) findViewHolderForAdapterPosition2;
                            if (sfVar3.gm != null) {
                                sfVar3.gm.vj(true);
                                sfVar3.gm.jsj();
                            }
                        }
                    }
                }
            }
        });
        lq();
        final int fum = fum();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.15
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.sf.pcc(activity)) {
                    return;
                }
                oo.this.pcc(fum, true);
            }
        });
        PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, ofVar);
        this.lu = createPAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = rj.sf(activity, 16.0f);
        gmVar.addView(createPAGLogoViewByMaterial, layoutParams);
        createPAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                    Context context = view.getContext();
                    of ofVar2 = ofVar;
                    IABLandingPageActivity.pcc(context, ofVar2, ofVar2.vj());
                } else {
                    Context context2 = view.getContext();
                    of ofVar3 = ofVar;
                    TTWebsiteActivity.pcc(context2, ofVar3, ofVar3.vj());
                }
            }
        });
        this.lo = com.bytedance.sdk.openadsdk.yt.vj.pcc("draw_feed_item_reuse", 0) == 1;
    }

    private void atb() {
        if (this.ri == null) {
            return;
        }
        new com.bytedance.sdk.openadsdk.core.hc.vy.pcc(this.pcc).pcc(this.ri, com.bytedance.sdk.openadsdk.core.ork.sf.gm.sf(), this.hpk, new com.bytedance.sdk.openadsdk.core.hc.qf.oo() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.8
            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.oo
            public void pcc(com.bytedance.adsdk.ugeno.sf.gm<View> gmVar) {
                View vh = gmVar.vh();
                ViewGroup viewGroup = (ViewGroup) vh.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(vh);
                }
                oo.this.vr = vh;
                if (oo.this.iv != null) {
                    oo.this.iv.addView(vh, new FrameLayout.LayoutParams(-1, -1));
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.oo
            public void pcc(int i, String str) {
                oo.this.bg = true;
            }
        });
    }

    private int fum() {
        if (!this.yt || this.qf.gm() || this.hc.get() || this.lrr) {
            return 0;
        }
        int pcc2 = pcc(this.ye, this.qf.oo(), 1073741823);
        this.qf.pcc(this.ye, pcc2);
        if (this.ye < 0) {
            this.wh.scrollToPosition(pcc2);
            return pcc2;
        }
        this.ye = pcc2;
        return pcc2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(kj kjVar) {
        kj kjVar2 = this.lq;
        if (kjVar != kjVar2) {
            return;
        }
        if (this.rnn) {
            if (this.ye < this.qf.pcc() - 1) {
                int i = this.ye + 1;
                this.kun = i;
                if (this.jr) {
                    this.wh.smoothScrollToPosition(i);
                } else {
                    sf(i);
                }
            } else {
                this.kun = 0;
                this.wh.scrollToPosition(0);
                this.wh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.utils.sf.pcc(oo.this.pcc)) {
                            return;
                        }
                        oo ooVar = oo.this;
                        ooVar.pcc(ooVar.kun, true);
                    }
                });
            }
        } else if (this.qcw) {
            kjVar2.gm();
        } else {
            kjVar2.nn();
        }
        this.hoh = null;
        this.qcw = false;
    }

    private void jsj() {
        FrameLayout frameLayout = this.iv;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.iv);
        }
        this.iv = null;
        kj kjVar = this.lq;
        if (kjVar instanceof com.bytedance.sdk.openadsdk.activity.single.pcc) {
            ((com.bytedance.sdk.openadsdk.activity.single.pcc) kjVar).atb();
        }
        pq();
        Message message = this.ptr;
        if (message != null) {
            handleMessage(message);
            this.ptr = null;
        }
    }

    private void lq() {
        qy vh;
        com.bytedance.sdk.openadsdk.core.model.pcc oo = this.sf.oo();
        if (oo == null || (vh = oo.vh()) == null || TextUtils.isEmpty(vh.qf())) {
            return;
        }
        this.nn = new com.bytedance.sdk.openadsdk.activity.single.vj(this.oo, this.sf, -1, 1, false, false, true);
    }

    private void mk() {
        if (this.xb || this.ri == null) {
            return;
        }
        this.ork.removeMessages(3);
        this.ork.sendEmptyMessageDelayed(3, this.tz * 1000);
    }

    private void mu() {
        if (this.ew) {
            this.kz = System.currentTimeMillis();
        }
        this.ork.removeMessages(1);
        wh whVar = this.hoh;
        if (whVar != null) {
            whVar.sf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void of() {
        if (this.lrr) {
            return;
        }
        if (this.yt) {
            fum();
        } else {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.18
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.utils.sf.pcc(oo.this.pcc)) {
                        return;
                    }
                    oo.this.qf.pcc(tz.pcc(lu.pcc(), "tt_list_end_tip"));
                }
            });
        }
    }

    private void pq() {
        if (this.kz != 0) {
            kj kjVar = this.lq;
            if (kjVar != null && atb.sf(kjVar.wh)) {
                int currentTimeMillis = this.pq - ((int) ((System.currentTimeMillis() - this.kz) / 1000));
                this.pq = currentTimeMillis;
                if (currentTimeMillis < 0) {
                    this.pq = 0;
                }
            }
            this.kz = 0L;
        }
        if (this.pq >= 0) {
            this.ork.removeMessages(1);
            this.ork.sendEmptyMessage(1);
        }
        wh whVar = this.hoh;
        if (whVar != null) {
            whVar.gm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qy() {
        com.bytedance.sdk.openadsdk.activity.single.vj vjVar = this.nn;
        if (vjVar == null || !vjVar.of()) {
            this.oo.qf();
            return;
        }
        sf(this.nn);
        this.vh.removeView(this.wh);
        this.vy.setVisibility(8);
        this.lu.setVisibility(8);
    }

    private void sf(kj kjVar) {
        Iterator<kj> it = this.qf.sf().iterator();
        while (it.hasNext()) {
            kj next = it.next();
            if (next != kjVar) {
                next.pcc(this.lq, kjVar, this.zti);
            }
        }
        com.bytedance.sdk.openadsdk.activity.single.vj vjVar = this.nn;
        if (vjVar != null && vjVar != kjVar) {
            vjVar.pcc(this.lq, kjVar, this.zti);
        }
        kj kjVar2 = this.lq;
        this.lq = kjVar;
        if (kjVar2 != null) {
            kjVar2.tmg = false;
            kjVar2.gbb();
            kjVar2.oo();
        }
        kjVar.tmg = true;
        kjVar.sf(this.pcc, new sf.vj(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.kj pcc2 = kjVar.pcc();
        if (pcc2.getVisibility() != 0) {
            pcc2.setVisibility(0);
        }
        if (pcc2.getParent() == null) {
            this.vh.addView(pcc2, new FrameLayout.LayoutParams(-1, -1));
        }
        this.oo.sf(kjVar);
        if (kjVar.f_() != this.atb) {
            kjVar.pcc("card_sync");
        }
    }

    private void tsz() {
        kj kjVar;
        if (!this.tmg || this.oo.nac() || (kjVar = this.lq) == null) {
            return;
        }
        kjVar.zsj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tz() {
        if (this.hc.compareAndSet(false, true)) {
            AdSlot gqd = this.sf.gqd();
            tsz tszVar = new tsz();
            tszVar.wh = true;
            if (this.sf.kx() != null || this.sf.uae() != null) {
                tszVar.vy = 2;
            }
            tszVar.qf = this.rj;
            this.qf.pcc(tz.pcc(this.pcc, "tt_loading_more"));
            lu.gm().pcc(gqd, tszVar, this.sf.tqg(), new com.bytedance.sdk.openadsdk.core.tz() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.17
                @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
                public void pcc(int i, String str) {
                    oo.this.pcc(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
                public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                    oo.this.pcc(pccVar, gmVar);
                }
            });
        }
    }

    private void ye() {
        if (this.iv != null || this.ri == null || this.bg) {
            return;
        }
        this.xb = true;
        this.iv = new com.bytedance.sdk.openadsdk.core.wh.gm(this.pcc) { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.9
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                oo.this.ork.removeMessages(4);
                oo.this.ork.sendEmptyMessage(4);
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        View view = this.vr;
        if (view != null && view.getParent() == null) {
            this.iv.addView(this.vr, new FrameLayout.LayoutParams(-1, -1));
        }
        this.vh.addView(this.iv, new FrameLayout.LayoutParams(-1, -1));
        this.ork.sendEmptyMessageDelayed(4, this.of * 1000);
        kj kjVar = this.lq;
        if (kjVar instanceof com.bytedance.sdk.openadsdk.activity.single.pcc) {
            ((com.bytedance.sdk.openadsdk.activity.single.pcc) kjVar).mk();
        }
        mu();
    }

    private void yt() {
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.sf.pcc(oo.this.pcc)) {
                    return;
                }
                oo.this.hc.set(false);
                boolean z = oo.this.yt;
                oo ooVar = oo.this;
                if (!z) {
                    ooVar.qf.pcc(tz.pcc(lu.pcc(), "tt_list_end_tip"));
                } else {
                    ooVar.qf.pcc("");
                    oo.this.of();
                }
            }
        });
    }

    private boolean zti() {
        FrameLayout frameLayout = this.iv;
        return (frameLayout == null || frameLayout.getParent() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void dax() {
        if (this.gd) {
            return;
        }
        this.gd = true;
        final long elapsedRealtime = SystemClock.elapsedRealtime() - this.zsj;
        long currentTimeMillis = System.currentTimeMillis();
        of ofVar = this.sf;
        com.bytedance.sdk.openadsdk.oo.gm.pcc(currentTimeMillis, ofVar, ofVar.vj(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.10
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (this.se) {
            this.gpj.add(this.ork.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i = message.what;
        if (i == 1) {
            int i2 = this.pq;
            if (i2 > 0) {
                if (i2 <= this.tsz) {
                    tsz();
                }
                int i3 = (int) (((r0 - this.pq) * 100.0d) / this.mu);
                TopLayoutDislike2 topLayoutDislike2 = this.vy;
                StringBuilder sb = new StringBuilder();
                int i4 = this.pq;
                this.pq = i4 - 1;
                sb.append(i4);
                sb.append("s");
                topLayoutDislike2.setCountDownFor1InN(sb.toString(), i3);
                if (this.pq >= 0) {
                    this.ork.removeMessages(message.what);
                    this.ork.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                tsz();
                boolean oo = oo();
                TopLayoutDislike2 topLayoutDislike22 = this.vy;
                if (oo) {
                    topLayoutDislike22.showSkipButton();
                } else {
                    topLayoutDislike22.showCloseButton();
                }
            }
        } else if (i == 3) {
            ye();
        } else if (i == 4) {
            jsj();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public List<of> jr() {
        return this.qf.vj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    /* renamed from: lo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.single.pcc hc() {
        u findViewHolderForAdapterPosition = this.wh.findViewHolderForAdapterPosition(this.ye + 1);
        if (!(findViewHolderForAdapterPosition instanceof sf)) {
            return null;
        }
        kj pcc2 = ((sf) findViewHolderForAdapterPosition).pcc();
        if (pcc2 instanceof com.bytedance.sdk.openadsdk.activity.single.pcc) {
            return (com.bytedance.sdk.openadsdk.activity.single.pcc) pcc2;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void nac() {
        super.nac();
        this.ew = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public boolean oo() {
        return this.nn != null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public int ork() {
        return this.gbb.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(Map<String, Object> map, kj kjVar, float f, float f2) {
        Object obj = map.get("pag_json_data");
        if (obj == null) {
            obj = new JSONObject();
        }
        if (obj instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.kj pcc2 = kjVar.pcc();
                ((JSONObject) obj).put("width", pcc2.getWidth());
                ((JSONObject) obj).put("height", pcc2.getHeight());
                int i = kjVar.ork;
                ((JSONObject) obj).put("click_feed_top", i == this.kj.findFirstVisibleItemPosition() ? 1 : 0);
                ((JSONObject) obj).put("click_on_final", i == this.qf.oo() ? 1 : 0);
                ((JSONObject) obj).put("click_countdown_remaining", this.pq);
                ((JSONObject) obj).put("click_user_remaining", i == this.ye ? (SystemClock.elapsedRealtime() - this.fmh) / 1000 : 0L);
                map.put("pag_json_data", obj.toString());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public int kj() {
        return this.pq;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void lu() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public com.bytedance.sdk.openadsdk.component.reward.top.gm tmg() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public kj vh() {
        return this.lq;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public boolean vj() {
        return this.atb;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void gpj() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.oo$oo, reason: collision with other inner class name */
    public static class C0064oo {
        public String gm;
        public int pcc = 0;
        public of sf;

        public C0064oo(of ofVar) {
            this.sf = ofVar;
        }

        public C0064oo(String str) {
            this.gm = str;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends l {
        private final oo gm;
        private boolean oo;
        private final ArrayList<C0064oo> pcc = new ArrayList<>();
        private final ArrayList<kj> sf = new ArrayList<>();
        private boolean vj;

        public pcc(oo ooVar, List<of> list) {
            this.gm = ooVar;
            for (int i = 0; i < list.size(); i++) {
                of ofVar = list.get(i);
                if (ofVar != null && ooVar != null) {
                    ofVar.rnn(ooVar.vj);
                }
                this.pcc.add(new C0064oo(ofVar));
            }
        }

        @Override // androidx.recyclerview.widget.l
        public int getItemCount() {
            if (this.vj) {
                return Integer.MAX_VALUE;
            }
            return this.pcc.size();
        }

        @Override // androidx.recyclerview.widget.l
        public int getItemViewType(int i) {
            C0064oo c0064oo = this.pcc.get(i % this.pcc.size());
            if (c0064oo.pcc != 0) {
                return -1;
            }
            zti uae = c0064oo.sf.uae();
            if (uae == null) {
                return 1;
            }
            return (uae.pcc() + uae.sf()).hashCode();
        }

        @Override // androidx.recyclerview.widget.l
        /* renamed from: gm, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(@NonNull vj vjVar) {
            super.onViewRecycled(vjVar);
            if (vjVar instanceof sf) {
                sf sfVar = (sf) vjVar;
                com.bytedance.sdk.openadsdk.activity.single.pcc pccVar = sfVar.gm;
                if (!this.gm.lo) {
                    pcc(sfVar, false);
                    return;
                }
                boolean sf = sf(pccVar);
                if (pccVar != null) {
                    pcc(sfVar, sf);
                }
            }
        }

        public int oo() {
            boolean z = this.oo;
            int size = this.pcc.size();
            return z ? size - 1 : size;
        }

        @Override // androidx.recyclerview.widget.l
        @NonNull
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public vj onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            if (i == -1) {
                com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(viewGroup.getContext());
                gmVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new gm(gmVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.sf sfVar = new com.bytedance.sdk.openadsdk.component.reward.view.sf(viewGroup.getContext(), this.gm.dax, this.gm.jr, rj.sf(viewGroup.getContext(), 10.0f));
            sfVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new sf(this, sfVar);
        }

        @Override // androidx.recyclerview.widget.l
        /* renamed from: sf, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(@NonNull vj vjVar) {
            com.bytedance.sdk.openadsdk.activity.single.pcc pccVar;
            super.onViewDetachedFromWindow(vjVar);
            if (!(vjVar instanceof sf) || (pccVar = ((sf) vjVar).gm) == null) {
                return;
            }
            pccVar.yt().fum.ri();
        }

        public List<of> vj() {
            ArrayList arrayList = new ArrayList();
            Iterator<C0064oo> it = this.pcc.iterator();
            while (it.hasNext()) {
                C0064oo next = it.next();
                if (next.pcc == 0) {
                    arrayList.add(next.sf);
                }
            }
            return arrayList;
        }

        private boolean sf(kj kjVar) {
            return kjVar != null && kjVar.lq();
        }

        public ArrayList<kj> sf() {
            return this.sf;
        }

        public boolean gm() {
            return this.vj;
        }

        @Override // androidx.recyclerview.widget.l
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull vj vjVar, int i) {
            if (i >= this.pcc.size()) {
                i %= this.pcc.size();
            }
            vjVar.pcc(this.gm, this.pcc.get(i), i);
        }

        @Override // androidx.recyclerview.widget.l
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(@NonNull vj vjVar) {
            super.onViewAttachedToWindow(vjVar);
        }

        public int pcc() {
            int itemCount = getItemCount();
            return this.oo ? itemCount - 1 : itemCount;
        }

        public void pcc(String str) {
            int size = this.pcc.size();
            C0064oo c0064oo = size > 0 ? this.pcc.get(size - 1) : null;
            boolean isEmpty = TextUtils.isEmpty(str);
            if (c0064oo == null || c0064oo.pcc != 1) {
                if (isEmpty) {
                    return;
                }
                this.pcc.add(new C0064oo(str));
                notifyItemInserted(size);
                this.oo = true;
                return;
            }
            if (!isEmpty) {
                c0064oo.gm = str;
                notifyItemChanged(size - 1);
            } else {
                this.pcc.remove(c0064oo);
                notifyItemRemoved(size - 1);
                this.oo = false;
            }
        }

        public void pcc(kj kjVar) {
            this.sf.add(kjVar);
        }

        public void pcc(List<of> list) {
            oo ooVar;
            int size = this.pcc.size();
            if (this.oo) {
                size--;
            }
            for (int i = 0; i < list.size(); i++) {
                of ofVar = list.get(i);
                if (ofVar != null && (ooVar = this.gm) != null) {
                    ofVar.rnn(ooVar.vj);
                }
                this.pcc.add(size + i, new C0064oo(ofVar));
                ofVar.su();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public void pcc(int i, int i2) {
            if (this.vj) {
                return;
            }
            this.vj = true;
            if (i < 0) {
                i = 0;
            }
            int size = this.pcc.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i2) - (size - i));
            notifyItemRangeInserted(0, i2 - i);
        }

        public void pcc(sf sfVar, boolean z) {
            if (sfVar.gm == null) {
                return;
            }
            this.sf.remove(sfVar.gm);
            sfVar.pcc(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void gm() {
        super.gm();
        this.se = true;
        kj kjVar = this.lq;
        if (kjVar != null) {
            kjVar.gbb();
        }
        mu();
        this.qcw = this.hoh != null;
        this.ork.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void sf(Activity activity) {
        super.sf(activity);
        rj.pcc(activity);
    }

    private void sf(int i) {
        u findViewHolderForAdapterPosition;
        int findFirstVisibleItemPosition = this.kj.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.kj.findLastVisibleItemPosition();
        if (i < findFirstVisibleItemPosition) {
            this.wh.smoothScrollToPosition(i);
            return;
        }
        RecyclerView recyclerView = this.wh;
        if (i <= findLastVisibleItemPosition) {
            int i2 = i - findFirstVisibleItemPosition;
            int childCount = recyclerView.getChildCount();
            if (i2 <= 0 || i2 >= childCount || (findViewHolderForAdapterPosition = this.wh.findViewHolderForAdapterPosition(i - 1)) == null) {
                return;
            }
            this.wh.smoothScrollBy(0, findViewHolderForAdapterPosition.itemView.getBottom());
            return;
        }
        recyclerView.smoothScrollToPosition(this.kun);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void sf() {
        super.sf();
        this.se = false;
        this.ew = false;
        kj kjVar = this.lq;
        if (kjVar != null && !this.qcw) {
            kjVar.gm();
        }
        if (this.zsj == 0) {
            this.zsj = SystemClock.elapsedRealtime();
        }
        pq();
        mk();
        Iterator<Message> it = this.gpj.iterator();
        while (it.hasNext()) {
            handleMessage(it.next());
        }
        this.gpj.clear();
    }

    private static int pcc(int i, int i2, int i3) {
        if (i < 0) {
            i = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + i4;
            if (i5 % i2 == i) {
                return i5;
            }
            int i6 = i3 - i4;
            if (i6 % i2 == i) {
                return i6;
            }
        }
        return i3;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(Bundle bundle) {
        super.pcc(bundle);
        atb();
        com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(this.pcc, this.vh, com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(this.sf.qxv()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i, String str) {
        this.lrr = false;
        yt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
        this.lrr = false;
        if (pccVar.vj() != null && !pccVar.vj().isEmpty()) {
            pcc(pccVar);
            return;
        }
        gmVar.pcc(-3);
        gmVar.gm(1);
        com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
        yt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void sf(kj kjVar, int i) {
        kj kjVar2 = this.lq;
        if (kjVar != kjVar2) {
            return;
        }
        if (i == 2) {
            mu();
            return;
        }
        if (i == 1) {
            if (zti()) {
                kj kjVar3 = this.lq;
                if (kjVar3 instanceof com.bytedance.sdk.openadsdk.activity.single.pcc) {
                    ((com.bytedance.sdk.openadsdk.activity.single.pcc) kjVar3).mk();
                    return;
                }
                return;
            }
            pq();
            return;
        }
        if (i == 3 || i == 4) {
            try {
                kjVar2.yt().fum.zti();
            } catch (Throwable th) {
                lo.gm("CardsLayoutManager", th);
            }
        }
    }

    private void pcc(final com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        qy vh = pccVar.vh();
        if (vh != null) {
            this.rj = vh.tmg();
            this.lrr = vh.hc();
        }
        if (!this.jr) {
            for (of ofVar : pccVar.vj()) {
                if (ofVar.kez() != null && of.vj(ofVar)) {
                    com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(((p03) CacheDirFactory.getICacheDir(ofVar.we())).u(), ofVar);
                    pcc2.pcc("material_meta", ofVar);
                    pcc2.pcc("ad_slot", ofVar.gqd());
                    com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc2, new nwm() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.2
                        @Override // defpackage.etm
                        public void pcc(nem nemVar, int i, String str) {
                        }

                        @Override // defpackage.etm
                        public void pcc(nem nemVar, int i) {
                        }
                    });
                }
            }
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.sf.pcc(oo.this.pcc)) {
                    return;
                }
                oo.this.hc.set(false);
                oo.this.qf.pcc("");
                oo.this.qf.pcc(pccVar.vj());
                oo.this.of();
            }
        });
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf extends vj {
        private com.bytedance.sdk.openadsdk.activity.single.pcc gm;
        private final pcc pcc;
        private final com.bytedance.sdk.openadsdk.component.reward.view.sf sf;

        public sf(pcc pccVar, @NonNull View view) {
            super(view);
            this.pcc = pccVar;
            this.sf = (com.bytedance.sdk.openadsdk.component.reward.view.sf) view;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.oo.vj
        public void pcc(oo ooVar, C0064oo c0064oo, int i) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = ooVar.pcc;
            if (com.bytedance.sdk.component.utils.sf.pcc(activity)) {
                return;
            }
            of ofVar = c0064oo.sf;
            com.bytedance.sdk.openadsdk.activity.single.pcc pccVar = this.gm;
            if (pccVar != null) {
                if (pcc(pccVar, ofVar)) {
                    this.gm.pcc(ofVar, bindingAdapterPosition, i);
                } else {
                    this.pcc.pcc(this, false);
                }
            }
            com.bytedance.sdk.openadsdk.activity.single.sf sfVar = ooVar.oo;
            if (this.gm == null) {
                this.gm = ofVar.tuy() ? new qf(sfVar, ofVar, bindingAdapterPosition, i, false) : new com.bytedance.sdk.openadsdk.activity.single.wh(sfVar, ofVar, bindingAdapterPosition, i, false);
            }
            sf.vj vjVar = new sf.vj(1, null);
            vjVar.oo = ooVar.atb;
            this.gm.sf(activity, vjVar);
            this.pcc.pcc(this.gm);
            com.bytedance.sdk.openadsdk.component.reward.view.kj pcc = this.gm.pcc();
            if (pcc == null) {
                return;
            }
            ViewParent parent = pcc.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(pcc);
            }
            if (!ooVar.jr) {
                float nyw = ofVar.nyw();
                com.bytedance.sdk.openadsdk.component.reward.view.sf sfVar2 = this.sf;
                if (nyw > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    sfVar2.setWidthAndHeightRatio(nyw);
                } else {
                    sfVar2.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            this.sf.pcc(pcc, new FrameLayout.LayoutParams(-1, -1));
            this.sf.setScene(this.gm);
        }

        public kj pcc() {
            return this.gm;
        }

        private boolean pcc(kj kjVar, of ofVar) {
            zti uae;
            if (kjVar.lq() && (uae = kjVar.wh.uae()) != null) {
                zti uae2 = ofVar.uae();
                if (TextUtils.equals(uae.pcc(), uae2.pcc()) && TextUtils.equals(uae.sf(), uae2.sf()) && kjVar.zti()) {
                    return true;
                }
            }
            return false;
        }

        public void pcc(boolean z) {
            com.bytedance.sdk.openadsdk.activity.single.pcc pccVar = this.gm;
            if (pccVar == null) {
                return;
            }
            pccVar.wh(z);
            this.gm.gpj();
            if (!z) {
                this.gm = null;
            }
            this.sf.pcc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i, boolean z) {
        int i2;
        u findViewHolderForAdapterPosition = this.wh.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition == null || !(findViewHolderForAdapterPosition instanceof sf) || (i2 = this.ye) == i) {
            return;
        }
        pcc(i2, i, z);
        this.ye = i;
        this.fmh = SystemClock.elapsedRealtime();
        kj pcc2 = ((sf) findViewHolderForAdapterPosition).pcc();
        if (pcc2 == null) {
            return;
        }
        sf(pcc2);
        this.gbb.add(pcc2.wh.hpk());
        if (this.lrr && this.qy > 0 && this.ye >= this.qf.pcc() - this.qy) {
            tz();
        }
        com.bytedance.sdk.openadsdk.activity.single.pcc hc = hc();
        if (hc != null) {
            if (!this.jr && this.kj.findLastVisibleItemPosition() >= this.ye + 1) {
                hc.vj(true);
            }
            this.nac.add(Integer.valueOf(this.ye + 1));
            hc.jsj();
            this.erj = false;
            return;
        }
        this.erj = true;
    }

    private void pcc(int i, int i2, boolean z) {
        String str;
        if (i < 0 || i2 < 0 || i == i2) {
            return;
        }
        if (z) {
            str = "auto_down";
        } else {
            str = i2 > i ? "down" : "up";
        }
        final String str2 = str;
        final long elapsedRealtime = (SystemClock.elapsedRealtime() - this.fmh) / 1000;
        List<of> vj2 = this.qf.vj();
        final int size = i % vj2.size();
        final int size2 = i2 % vj2.size();
        of ofVar = vj2.get(size);
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, ofVar.vj(), "slide", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.5
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", size + 1);
                    jSONObject.put("to", size2 + 1);
                    jSONObject.put("direction", str2);
                    jSONObject.put("click_user_remaining", elapsedRealtime);
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(final kj kjVar, kj kjVar2, sf.vj vjVar) {
        long j;
        if (kjVar != this.lq) {
            return;
        }
        if (kjVar.qy() || atb.sf(kjVar.wh)) {
            j = 500;
        } else {
            j = kjVar.wh.nfv() != null ? r6.oo() * 1000 : 0L;
        }
        wh whVar = this.hoh;
        if (whVar != null) {
            whVar.oo();
        }
        wh whVar2 = new wh(Math.max(500L, j)) { // from class: com.bytedance.sdk.openadsdk.activity.single.oo.6
            @Override // com.bytedance.sdk.openadsdk.activity.single.oo.wh
            public void pcc() {
                if (com.bytedance.sdk.component.utils.sf.pcc(oo.this.pcc)) {
                    return;
                }
                oo.this.gm(kjVar);
            }
        };
        this.hoh = whVar2;
        whVar2.vj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(boolean z) {
        super.pcc(z);
        kj kjVar = this.lq;
        if (kjVar != null) {
            kjVar.gm(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public boolean pcc(kj kjVar, int i) {
        com.bytedance.sdk.openadsdk.activity.single.vj vjVar = this.nn;
        return vjVar != null && vjVar == kjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(View view) {
        super.pcc(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.vh.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(Activity activity) {
        super.pcc(activity);
        kj kjVar = this.lq;
        if (kjVar != null) {
            kjVar.sf(activity);
        }
        com.bytedance.sdk.openadsdk.activity.single.vj vjVar = this.nn;
        if (vjVar != null) {
            vjVar.gpj();
        }
        Iterator<kj> it = this.qf.sf().iterator();
        while (it.hasNext()) {
            it.next().gpj();
        }
        this.ork.removeCallbacksAndMessages(null);
        wh whVar = this.hoh;
        if (whVar != null) {
            whVar.oo();
            this.hoh = null;
        }
        kj kjVar2 = this.lq;
        if (kjVar2 == null || kjVar2.tz() || this.sf.duh()) {
            return;
        }
        jr.sf().post(new sf.gm(this.sf));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.gm
    public void pcc(int i) {
    }
}
