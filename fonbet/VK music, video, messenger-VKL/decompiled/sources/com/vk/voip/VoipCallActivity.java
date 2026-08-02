package com.vk.voip;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ironsource.X3;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.log.L;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.picture_in_picture.view.PictureInPictureViewMode;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.utils.Logger;
import xsna.a000;
import xsna.a201;
import xsna.a740;
import xsna.ad0;
import xsna.aka0;
import xsna.asu0;
import xsna.awi0;
import xsna.b8j0;
import xsna.bpn0;
import xsna.bzb0;
import xsna.cbv;
import xsna.cn70;
import xsna.d9j;
import xsna.dcj;
import xsna.dhr0;
import xsna.do3;
import xsna.e7q0;
import xsna.eeh0;
import xsna.egt0;
import xsna.eh8;
import xsna.eka0;
import xsna.eki0;
import xsna.evw0;
import xsna.fh8;
import xsna.g600;
import xsna.ghw0;
import xsna.gvw0;
import xsna.gzs;
import xsna.h6m0;
import xsna.hh8;
import xsna.i0q0;
import xsna.ifg;
import xsna.ifw0;
import xsna.ihr;
import xsna.ihw0;
import xsna.ivw0;
import xsna.izs;
import xsna.jfw0;
import xsna.jhu;
import xsna.jhw0;
import xsna.jvw0;
import xsna.kb40;
import xsna.kfw0;
import xsna.kun;
import xsna.kvp;
import xsna.l7s;
import xsna.l8u0;
import xsna.lbv;
import xsna.lmc;
import xsna.lqs0;
import xsna.lw20;
import xsna.mij;
import xsna.mjw0;
import xsna.mlu0;
import xsna.mn0;
import xsna.mvl;
import xsna.naa;
import xsna.nfc0;
import xsna.nij;
import xsna.nq4;
import xsna.nsn;
import xsna.o3y;
import xsna.ou3;
import xsna.p490;
import xsna.p9w0;
import xsna.pch0;
import xsna.pex;
import xsna.pq;
import xsna.puq0;
import xsna.q090;
import xsna.q9w0;
import xsna.qqt0;
import xsna.qr0;
import xsna.r350;
import xsna.r99;
import xsna.rah0;
import xsna.rjd;
import xsna.s3q0;
import xsna.s440;
import xsna.s9j0;
import xsna.t440;
import xsna.tja0;
import xsna.tl30;
import xsna.u5p0;
import xsna.u66;
import xsna.ugm0;
import xsna.uk40;
import xsna.ukv0;
import xsna.vj0;
import xsna.vja0;
import xsna.vt30;
import xsna.wcg;
import xsna.wf8;
import xsna.wja0;
import xsna.wks0;
import xsna.xf8;
import xsna.xja0;
import xsna.yf8;
import xsna.yjs0;
import xsna.yoa0;
import xsna.ysg0;
import xsna.yv2;
import xsna.yzz;
import xsna.zjw0;

/* compiled from: VoipCallActivity.kt */
/* loaded from: classes7.dex */
public final class VoipCallActivity extends VKActivity implements evw0 {
    public static final /* synthetic */ int P = 0;
    public gvw0 A;
    public io.reactivex.rxjava3.disposables.c B;
    public mjw0 C;
    public vja0 D;
    public eka0 E;
    public io.reactivex.rxjava3.disposables.c F;
    public c G;
    public aka0 H;
    public ihr K;
    public kvp L;
    public yzz M;
    public LayoutInflater O;
    public ViewGroup w;
    public ViewGroup x;
    public pch0 y;
    public bzb0 z;
    public final lmc v = new lmc();
    public final p490 I = r99.a.a();
    public final Handler J = new Handler(Looper.getMainLooper());
    public final ivw0 N = new ivw0();

    /* compiled from: VoipCallActivity.kt */
    public static final class a {
    }

    /* compiled from: VoipCallActivity.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
        
            if (r3.s == true) goto L53;
         */
        @Override // xsna.gzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke() {
            wf8 wf8Var;
            VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
            int i = VoipCallActivity.P;
            mjw0 mjw0Var = voipCallActivity.C;
            if (mjw0Var != null) {
                if (mjw0Var != null) {
                    zjw0 zjw0Var = mjw0Var.B0;
                    if (zjw0Var != null && (wf8Var = zjw0Var.e) != null) {
                        yf8 yf8Var = wf8Var.y.c;
                        if ((yf8Var instanceof yf8.c) || (yf8Var instanceof yf8.a)) {
                            wf8Var.d(xf8.e.a);
                        } else if (yf8Var instanceof yf8.b) {
                            yf8.b bVar = (yf8.b) yf8Var;
                            if (bVar.a instanceof mvl.d) {
                                wf8Var.d(xf8.c.a);
                            } else if (bVar.b instanceof s9j0.c) {
                                wf8Var.d(xf8.i.a);
                            } else {
                                wf8Var.d(xf8.a.a);
                            }
                        }
                    }
                    cbv cbvVar = mjw0Var.j0;
                    if (cbvVar != null) {
                        if (cbvVar.s) {
                            cbvVar.p.onNext(lbv.b.a);
                        }
                    }
                    ihw0 ihw0Var = mjw0Var.T0.d;
                    ihw0Var.getClass();
                    if (i0q0.b()) {
                        jhw0 P0 = ihw0Var.b.P0();
                        if ((P0 instanceof jhw0.b) && (((jhw0.b) P0).d instanceof jhw0.f.b)) {
                            ihw0Var.a(ghw0.s.a);
                        }
                    }
                    Iterator it = mjw0Var.e.d.D.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = mjw0Var.f.v.a.iterator();
                            while (it2.hasNext()) {
                                if (((jvw0) it2.next()).f3()) {
                                    break;
                                }
                            }
                        } else if (((jvw0) it.next()).f3()) {
                            break;
                        }
                    }
                }
                voipCallActivity.e2(true, null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallActivity.kt */
    public static final class c extends tja0 {
        public c(OKVoipEngine oKVoipEngine) {
            super(VoipCallActivity.this, oKVoipEngine);
        }

        @Override // xsna.tja0
        public final void e(String str) {
            int i = VoipCallActivity.P;
            if (str.equals("picture_in_picture_finish_call")) {
                L.A("VoipCallActivity", "finishCall declineOrHang");
                com.vk.voip.ui.c.C(com.vk.voip.ui.c.b, null, 500L, false, false, true, null, 197);
            }
        }
    }

    /* compiled from: VoipCallActivity.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
            c cVar = voipCallActivity.G;
            io.reactivex.rxjava3.disposables.b bVar = voipCallActivity.p;
            if (cVar == null) {
                cVar = null;
            }
            if (cVar.c()) {
                voipCallActivity.W1();
            } else {
                voipCallActivity.V1();
            }
            voipCallActivity.T1();
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
            pq pqVar = new pq(29);
            fVar.getClass();
            int i = 1;
            bVar.b(new i0(fVar, pqVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wks0(voipCallActivity, 3), new q9w0(new yjs0(6), i), new pex(i)));
            com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
            cVar2.getClass();
            rah0 rah0Var = com.vk.voip.ui.c.g;
            if (rah0Var == null) {
                rah0Var = null;
            }
            bVar.b(rah0Var.e.subscribe(new eeh0(new ukv0(voipCallActivity, 2), 18)));
            bVar.b(com.vk.voip.ui.c.U.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new mlu0(new ifw0(voipCallActivity, 0), 3), new e7q0(new puq0(9), 11), new nfc0(1)));
            if (cVar2.P().isEnabled()) {
                if (ad0.e == null) {
                    ad0.e = new eh8(com.vk.voip.ui.c.r, ad0.d, new bpn0(new yv2(5)), com.vk.voip.ui.c.I());
                }
                eh8 eh8Var = ad0.e;
                if (eh8Var.b() instanceof hh8.c) {
                    eh8Var.a(fh8.c.a);
                }
            }
            gvw0 gvw0Var = voipCallActivity.A;
            if (gvw0Var == null) {
                gvw0Var = null;
            }
            if (gvw0Var.d()) {
                voipCallActivity.X1();
            }
            voipCallActivity.B = new y(com.vk.voip.ui.c.H0(true).U(new awi0(new p9w0(2), 14)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0.a.d()).subscribe(new uk40(new u5p0(voipCallActivity, 15), 28));
            u66 u66Var = new u66(voipCallActivity);
            qr0 qr0Var = new qr0(voipCallActivity, 15);
            bzb0 bzb0Var = voipCallActivity.z;
            voipCallActivity.K = new ihr(u66Var, qr0Var, bzb0Var == null ? null : bzb0Var, new r350(voipCallActivity), new naa(OKVoipEngine.b));
            voipCallActivity.L = new kvp(new rjd(voipCallActivity, 8));
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallActivity.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
            voipCallActivity.J.removeCallbacksAndMessages(null);
            io.reactivex.rxjava3.disposables.c cVar = voipCallActivity.B;
            if (cVar != null) {
                cVar.dispose();
            }
            voipCallActivity.Y1();
            voipCallActivity.Z1();
            voipCallActivity.I.w();
            bzb0 bzb0Var = voipCallActivity.z;
            (bzb0Var != null ? bzb0Var : null).a();
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallActivity.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
            int i = VoipCallActivity.P;
            voipCallActivity.T1();
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallActivity.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
            int i = VoipCallActivity.P;
            voipCallActivity.getClass();
            com.vk.voip.ui.c.b.getClass();
            if (com.vk.voip.ui.c.v0()) {
                voipCallActivity.U1();
            }
            WeakReference weakReference = new WeakReference(voipCallActivity);
            a000 a000Var = (a000) com.vk.voip.ui.c.T().b;
            a000Var.h = new a740(new q090(0, weakReference, WeakReference.class, "get", "get()Ljava/lang/Object;", 0, 4));
            a000Var.e = Settings.System.getInt(a000Var.b.getContentResolver(), "accelerometer_rotation", 0) == 1;
            a000Var.b.getContentResolver().registerContentObserver(a000Var.f, false, a000Var.g);
            Context context = a000Var.b;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            a000Var.c = new y(new i0(new i0(new c0(new q(new nsn(context, ref$ObjectRef)), io.reactivex.rxjava3.internal.functions.a.d, new eki0(ref$ObjectRef, 0)).v0(100L, TimeUnit.MILLISECONDS), new vj0(new wcg(a000Var, 29), 25)), new do3(new d9j(a000Var, 23), 21)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0.a.d()).subscribe(new o3y(new ifg(a000Var, 28), 2));
            a000Var.e(a000Var.i);
            voipCallActivity.M = a000Var;
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallActivity.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
            int i = VoipCallActivity.P;
            voipCallActivity.getClass();
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.b1(false, false);
            kvp kvpVar = voipCallActivity.L;
            if (kvpVar != null && kvpVar.b != null) {
                voipCallActivity.U1();
            }
            yzz yzzVar = voipCallActivity.M;
            if (yzzVar != null) {
                yzzVar.disable();
            }
            voipCallActivity.M = null;
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallActivity.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements gzs<s3q0> {
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
        
            if (r2 == false) goto L46;
         */
        @Override // xsna.gzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke() {
            boolean z;
            VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
            int i = VoipCallActivity.P;
            voipCallActivity.getClass();
            int i2 = CallParticipantsFragment.W;
            Fragment H = voipCallActivity.getSupportFragmentManager().H("CallSettingsFragment");
            if (H instanceof CallParticipantsFragment ? ((CallParticipantsFragment) H).U : false) {
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.b1(false, false);
            }
            boolean z2 = true;
            if (voipCallActivity.C != null) {
                gvw0 gvw0Var = voipCallActivity.A;
                if (gvw0Var == null) {
                    gvw0Var = null;
                }
                if (!gvw0Var.e()) {
                    Fragment H2 = voipCallActivity.getSupportFragmentManager().H("CallSettingsFragment");
                    if (!(H2 instanceof CallParticipantsFragment ? ((CallParticipantsFragment) H2).U : false)) {
                        com.vk.voip.ui.c.b.getClass();
                        io.reactivex.rxjava3.subjects.d<jhu> dVar = com.vk.voip.ui.c.l0.b.d;
                        jhu P0 = dVar.P0();
                        if (P0 == null) {
                            z = false;
                        } else {
                            z = P0.e && P0.g;
                            jhu P02 = dVar.P0();
                            if (P02 != null) {
                                dVar.onNext(jhu.a(P02, false, false, false, false, false, 0, 47));
                            }
                        }
                        if (!z) {
                            if (!(com.vk.voip.ui.c.K0 == VoipViewModelState.ReceivingCallFromPeer)) {
                                yoa0 yoa0Var = com.vk.voip.ui.c.F0;
                                boolean z3 = yoa0Var.a;
                                yoa0Var.a = false;
                            }
                        }
                    }
                }
            }
            z2 = false;
            if (z2) {
                voipCallActivity.e2(false, null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallActivity.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public static void b2(gzs gzsVar) {
        if (a201.b().b().isInitialized()) {
            gzsVar.invoke();
            return;
        }
        io.reactivex.rxjava3.kotlin.c.d(a201.b().b().a().o(asu0.a.d()), new mn0(3, gzsVar), new j(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0));
    }

    public final void T1() {
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.V0) {
            L.A("VoipCallActivity", "ensurePermissions");
            gvw0 gvw0Var = this.A;
            if (gvw0Var == null) {
                gvw0Var = null;
            }
            gvw0Var.getClass();
            L.A("VoipCallActivity", "ensurePermissions callback true");
            X1();
            com.vk.voip.ui.c.b.B(false);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void U1() {
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.n0(0L);
        finish();
        kvp kvpVar = this.L;
        if (kvpVar != null) {
            kvpVar.b = null;
        }
    }

    public final void V1() {
        if (this.C != null) {
            return;
        }
        dhr0.a.getClass();
        l7s l7sVar = new l7s(this, dhr0.u().c);
        gvw0 gvw0Var = this.A;
        if (gvw0Var == null) {
            gvw0Var = null;
        }
        mjw0 mjw0Var = new mjw0(l7sVar, gvw0Var);
        mjw0Var.setFragmentManagerProvider(new ugm0(this, 6));
        mjw0Var.setPipCallback(new h6m0(this, 27));
        mjw0Var.setOpenChatCallback(new egt0(this, 9));
        mjw0Var.setFinishCallCallback(new qqt0(this, 5));
        mjw0Var.setEnsureMasksPermissionsCallback(new kfw0(this, 0));
        ViewGroup viewGroup = this.w;
        if (viewGroup != null) {
            viewGroup.addView(mjw0Var);
        }
        if (this.w == null) {
            L.l("null containerFullscreenView");
        }
        this.C = mjw0Var;
    }

    public final void W1() {
        io.reactivex.rxjava3.subjects.d<xja0> dVar;
        if (this.D != null) {
            return;
        }
        vja0 vja0Var = new vja0(com.vk.voip.ui.c.b);
        wja0.a aVar = wja0.a.a;
        synchronized (vja0Var) {
            if (!vja0Var.f) {
                throw new IllegalStateException("Instance is destroyed");
            }
            vja0Var.c(aVar);
        }
        this.D = vja0Var;
        this.E = new eka0(this, PictureInPictureViewMode.PICTURE_IN_PICTURE);
        vja0 vja0Var2 = this.D;
        synchronized (vja0Var2) {
            if (!vja0Var2.f) {
                throw new IllegalStateException("Instance is destroyed");
            }
            dVar = vja0Var2.b;
        }
        this.F = dVar.subscribe(new l8u0(new b8j0(this, 26), 2));
        ViewGroup viewGroup = this.x;
        if (viewGroup != null) {
            viewGroup.addView(this.E.b);
        }
    }

    public final void X1() {
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("extra_open_participants_screen_on_start", false)) {
            d2();
        }
    }

    public final void Y1() {
        mjw0 mjw0Var = this.C;
        if (mjw0Var != null) {
            if (mjw0Var != null) {
                ViewGroup viewGroup = this.w;
                if (viewGroup != null) {
                    viewGroup.removeView(mjw0Var);
                }
                mjw0Var.setPipCallback(null);
                mjw0Var.setFinishCallCallback(null);
                mjw0Var.setOpenChatCallback(null);
                mjw0Var.setEnsureMasksPermissionsCallback(null);
            }
            this.C = null;
        }
    }

    public final void Z1() {
        ViewGroup viewGroup;
        if (this.D != null) {
            eka0 eka0Var = this.E;
            ViewGroup viewGroup2 = eka0Var != null ? eka0Var.b : null;
            if (viewGroup2 != null && (viewGroup = this.x) != null) {
                viewGroup.removeView(viewGroup2);
            }
            io.reactivex.rxjava3.disposables.c cVar = this.F;
            if (cVar != null) {
                cVar.dispose();
            }
            this.F = null;
            eka0 eka0Var2 = this.E;
            if (eka0Var2 != null) {
                eka0Var2.u.b(eka0Var2.s);
                eka0Var2.m.b();
                eka0Var2.n.b();
                eka0Var2.q = false;
                eka0Var2.v.dispose();
            }
            this.E = null;
            vja0 vja0Var = this.D;
            if (vja0Var != null) {
                vja0Var.a();
            }
            this.D = null;
        }
    }

    public final void d2() {
        if (com.vk.voip.ui.c.b.L() == null) {
            L.A("VoipCallActivity", "Call info is null");
            return;
        }
        int i2 = CallParticipantsFragment.W;
        if (getSupportFragmentManager().H("CallSettingsFragment") != null) {
            L.A("VoipCallActivity", "Settings already visible");
        } else {
            new CallParticipantsFragment().Td(getSupportFragmentManager(), "CallSettingsFragment");
        }
    }

    public final void e2(boolean z, jfw0 jfw0Var) {
        L.A("VoipCallActivity", "tryLaunchMinimizedMode(" + z + ')');
        c cVar = this.G;
        if (cVar == null) {
            cVar = null;
        }
        if (cVar.d()) {
            ViewGroup viewGroup = this.w;
            com.vk.voip.ui.c.b.getClass();
            int i2 = 0;
            int i3 = 0;
            tja0.e eVar = new tja0.e(viewGroup, (ou3) com.vk.voip.ui.c.s0.a.invoke(), Collections.singletonList(new tja0.a()), z, cn70.b(8), new kun(i3, this, VoipCallActivity.class, "onEnterPictureInPictureModeBefore", "onEnterPictureInPictureModeBefore()V", i2, 5), new mij(i3, this, VoipCallActivity.class, "onEnterPictureInPictureModeAfter", "onEnterPictureInPictureModeAfter()V", i2, 7), jfw0Var);
            c cVar2 = this.G;
            (cVar2 != null ? cVar2 : null).f(eVar);
            return;
        }
        aka0 aka0Var = this.H;
        if (aka0Var == null) {
            aka0Var = null;
        }
        aka0Var.getClass();
        aka0.b bVar = new aka0.b(z, new nij(0, this, VoipCallActivity.class, "onEnterPictureInPictureCommon", "onEnterPictureInPictureCommon()V", 0, 6), jfw0Var);
        aka0 aka0Var2 = this.H;
        aka0 aka0Var3 = aka0Var2 != null ? aka0Var2 : null;
        boolean z2 = aka0Var3.d;
        gvw0 gvw0Var = aka0Var3.b;
        if (z2) {
            return;
        }
        if (Settings.canDrawOverlays(gvw0Var.a)) {
            aka0Var3.a(bVar);
        } else if (z) {
            gvw0.j(gvw0Var, new com.vk.movika.sdk.base.logic.interactor.c(21, aka0Var3, bVar), new vt30(bVar, 13), 12);
        }
    }

    @Override // xsna.evw0
    public final gvw0 getPermissions() {
        gvw0 gvw0Var = this.A;
        if (gvw0Var == null || gvw0Var == null) {
            return null;
        }
        return gvw0Var;
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.O == null) {
            LayoutInflater layoutInflater = (LayoutInflater) super.getSystemService(str);
            dhr0.a.getClass();
            this.O = layoutInflater.cloneInContext(new l7s(this, dhr0.u().c));
        }
        LayoutInflater layoutInflater2 = this.O;
        if (layoutInflater2 == null) {
            return null;
        }
        return layoutInflater2;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
        L.A("VoipCallActivity", "onBackPressed");
        b2(new b(0, this, VoipCallActivity.class, "onBackPressedWhenCallsInitialized", "onBackPressedWhenCallsInitialized()V", 0));
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        L.A("VoipCallActivity", "onCreate");
        dhr0.a.getClass();
        int i2 = dhr0.u().c;
        setTheme(i2);
        super.onCreate(bundle);
        this.y = new pch0(this);
        this.z = new bzb0(new l7s(this, i2));
        this.A = new gvw0(this, this.N);
        dhr0.u0(getWindow(), NavigationBarStyle.DARK);
        setContentView(R.layout.voip_call_activity);
        this.x = (ViewGroup) findViewById(R.id.container_picture_in_picture);
        this.w = (ViewGroup) findViewById(R.id.container_fullscreen);
        setShowWhenLocked(true);
        setTurnScreenOn(true);
        getWindow().setBackgroundDrawable(null);
        getWindow().addFlags(524288);
        getWindow().addFlags(2097152);
        getWindow().addFlags(128);
        getWindow().addFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(CoverVideoUploadTask.y);
        getWindow().getDecorView().setBackground(null);
        this.J.post(new nq4(this, 13));
        this.G = new c(OKVoipEngine.b);
        this.H = new aka0(this);
        b2(new d(0, this, VoipCallActivity.class, "onCreateWhenCallsInitialized", "onCreateWhenCallsInitialized()V", 0));
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        L.A("VoipCallActivity", "onDestroy");
        pch0 pch0Var = this.y;
        pch0 pch0Var2 = pch0Var == null ? null : pch0Var;
        pch0Var2.getClass();
        try {
            pch0Var2.b.dispose();
            pch0Var2.d = false;
            PowerManager.WakeLock wakeLock = pch0Var2.c;
            if (wakeLock != null && wakeLock.isHeld()) {
                wakeLock.release();
            }
            pch0Var2.c = null;
            L.e("ScreenOffWakeLock", "Wake lock reference cleared");
        } catch (Throwable th) {
            try {
                com.vk.metrics.eventtracking.b.a.a(th);
            } finally {
                pch0Var2.c = null;
                L.e("ScreenOffWakeLock", "Wake lock reference cleared");
            }
        }
        b2(new e(0, this, VoipCallActivity.class, "onDestroyWhenCallsInitialized", "onDestroyWhenCallsInitialized()V", 0));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        L.A("VoipCallActivity", "onNewIntent");
        super.onNewIntent(intent);
        b2(new f(0, this, VoipCallActivity.class, "onNewIntentWhenCallsInitialized", "onNewIntentWhenCallsInitialized()V", 0));
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        L.A("VoipCallActivity", X3.i.t0);
        super.onPause();
        pch0 pch0Var = this.y;
        if (pch0Var == null) {
            pch0Var = null;
        }
        if (pch0Var.d) {
            pch0Var.b.e();
            pch0Var.d = false;
            pch0Var.a();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        L.A("VoipCallActivity", "onPictureInPictureModeChanged(" + z + ')');
        b2(new dcj(this, z, 2));
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        L.A("VoipCallActivity", X3.i.u0);
        super.onResume();
        yzz yzzVar = this.M;
        if (yzzVar != null) {
            yzzVar.a();
        }
        pch0 pch0Var = this.y;
        if (pch0Var == null) {
            pch0Var = null;
        }
        io.reactivex.rxjava3.disposables.b bVar = pch0Var.b;
        if (!pch0Var.d) {
            com.vk.voip.ui.c.b.getClass();
            y M0 = com.vk.voip.ui.c.M0();
            asu0 asu0Var = asu0.a;
            int i2 = 21;
            bVar.b(M0.a0(asu0Var.d()).subscribe(new tl30(new lw20(pch0Var, 29), i2)));
            bVar.b(com.vk.voip.ui.c.H0(true).a0(asu0Var.d()).subscribe(new s440(new kb40(pch0Var, i2), 12)));
            bVar.b(com.vk.voip.ui.c.F0().a0(asu0Var.d()).subscribe(new g600(new t440(pch0Var, 21), 22)));
            pch0Var.d = true;
            pch0Var.a();
        }
        b2(new lqs0(this, 12));
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        L.A("VoipCallActivity", "onStart");
        super.onStart();
        this.J.post(new nq4(this, 13));
        b2(new g(0, this, VoipCallActivity.class, "onStartWhenCallsInitialized", "onStartWhenCallsInitialized()V", 0));
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        L.A("VoipCallActivity", "onStop");
        super.onStop();
        b2(new h(0, this, VoipCallActivity.class, "onStopWhenCallsInitialized", "onStopWhenCallsInitialized()V", 0));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onUserLeaveHint() {
        L.A("VoipCallActivity", "onUserLeaveHint");
        b2(new i(0, this, VoipCallActivity.class, "onUserLeaveHintWhenCallsInitialized", "onUserLeaveHintWhenCallsInitialized()V", 0));
    }
}
