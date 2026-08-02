package com.blaze.blazesdk.features.videos.players.ui;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.videos.models.args.b;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.features.videos.models.ui.h;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.players.ui.k;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.a99;
import defpackage.av8;
import defpackage.bkh;
import defpackage.bqm;
import defpackage.bum;
import defpackage.bwl;
import defpackage.bxm;
import defpackage.cnb;
import defpackage.d0m;
import defpackage.de;
import defpackage.di;
import defpackage.drm;
import defpackage.duf;
import defpackage.eq3;
import defpackage.eqf;
import defpackage.evl;
import defpackage.fam;
import defpackage.frk;
import defpackage.g28;
import defpackage.grk;
import defpackage.haa;
import defpackage.inm;
import defpackage.mwj;
import defpackage.n0n;
import defpackage.n4m;
import defpackage.nf3;
import defpackage.nmi;
import defpackage.of3;
import defpackage.pnm;
import defpackage.rcm;
import defpackage.rsm;
import defpackage.sd;
import defpackage.sim;
import defpackage.sxm;
import defpackage.t0m;
import defpackage.tc3;
import defpackage.td4;
import defpackage.twl;
import defpackage.v3m;
import defpackage.vom;
import defpackage.w3m;
import defpackage.y0m;
import defpackage.zb3;
import defpackage.zsl;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/blaze/blazesdk/features/videos/players/ui/VideosPlayerActivity;", "Lcom/blaze/blazesdk/players/ui/k;", "Lsim;", "Ltwl;", "<init>", "()V", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideosPlayerActivity extends k implements twl {
    public static final a u = new a(null);
    public com.blaze.blazesdk.features.videos.players.ui.a m;
    public com.blaze.blazesdk.features.videos.models.args.a n;
    public final t0m o;
    public final zsl p;
    public boolean q;
    public String r;
    public boolean s;
    public boolean t;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(Context context, View view, com.blaze.blazesdk.features.videos.models.args.a aVar, de deVar) {
            context.getClass();
            view.getClass();
            aVar.getClass();
            Intent addFlags = new Intent(context, (Class<?>) VideosPlayerActivity.class).putExtra("videosPlayerActivityArgs", aVar).addFlags(131072);
            addFlags.getClass();
            ActivityOptions makeScaleUpAnimation = ActivityOptions.makeScaleUpAnimation(view, 0, 0, view.getWidth(), view.getHeight());
            sd sdVar = new sd(makeScaleUpAnimation);
            n0n n0nVar = n0n.a;
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            evl.dispatchOnMain$default(blazeSDK, null, new sxm(null), 1, null);
            if (deVar != null) {
                deVar.a(addFlags, sdVar);
            } else {
                context.startActivity(addFlags, makeScaleUpAnimation.toBundle());
            }
            bxm bxmVar = bxm.a;
            evl.dispatchOnMain$default(blazeSDK, null, new bum(null), 1, null);
            rsm rsmVar = rsm.a;
            evl.dispatchOnMain$default(blazeSDK, null, new pnm(null), 1, null);
        }

        public static void b(Context context, com.blaze.blazesdk.features.videos.models.args.a aVar) {
            context.getClass();
            n0n n0nVar = n0n.a;
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            evl.dispatchOnMain$default(blazeSDK, null, new sxm(null), 1, null);
            context.startActivity(new Intent(context, (Class<?>) VideosPlayerActivity.class).putExtra("videosPlayerActivityArgs", aVar).addFlags(131072));
            bxm bxmVar = bxm.a;
            evl.dispatchOnMain$default(blazeSDK, null, new bum(null), 1, null);
            rsm rsmVar = rsm.a;
            evl.dispatchOnMain$default(blazeSDK, null, new pnm(null), 1, null);
        }

        public static /* synthetic */ void startScaledUpActivityAndDismissOtherPlayers$default(a aVar, Context context, View view, com.blaze.blazesdk.features.videos.models.args.a aVar2, de deVar, int i, Object obj) {
            if ((i & 8) != 0) {
                deVar = null;
            }
            aVar.getClass();
            a(context, view, aVar2, deVar);
        }
    }

    public VideosPlayerActivity() {
        super(bwl.b);
        this.o = new t0m();
        this.p = new zsl();
        this.s = true;
    }

    @Override // com.blaze.blazesdk.players.ui.k, com.blaze.blazesdk.base_classes.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.blaze.blazesdk.features.videos.models.args.a aVar;
        Parcelable parcelable;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT > 33) {
                parcelable = (Parcelable) extras.getParcelable("videosPlayerActivityArgs", com.blaze.blazesdk.features.videos.models.args.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("videosPlayerActivityArgs");
                if (!(parcelable2 instanceof com.blaze.blazesdk.features.videos.models.args.a)) {
                    parcelable2 = null;
                }
                parcelable = (com.blaze.blazesdk.features.videos.models.args.a) parcelable2;
            }
            aVar = (com.blaze.blazesdk.features.videos.models.args.a) parcelable;
        } else {
            aVar = null;
        }
        this.n = aVar;
        com.blaze.blazesdk.features.videos.models.ui.a aVar2 = aVar != null ? aVar.a : null;
        int i = 0;
        boolean z = (aVar2 != null ? h.c(aVar2) : false) && cnb.h(this);
        if (z) {
            com.blaze.blazesdk.features.videos.models.args.a aVar3 = this.n;
            i iVar = aVar3 != null ? aVar3.o : null;
            if (iVar != null && iVar.b) {
                setRequestedOrientation(11);
            }
        }
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this, new d0m(this));
        this.k = new frk(this, i);
        if (!this.q) {
            zsl.a.getClass();
            zsl.b = new WeakReference(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.blaze.blazesdk.pip.ACTION_PLAY");
            intentFilter.addAction("com.blaze.blazesdk.pip.ACTION_PAUSE");
            eq3.K(this, this.p, intentFilter, null, 4);
            this.q = true;
        }
        zb3.a(this, new tc3(-1602912570, new v3m(this, bundle, z), true));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (this.q) {
            zsl.a.getClass();
            zsl.b = null;
            unregisterReceiver(this.p);
            this.q = false;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null || !intent.getBooleanExtra("exitPipToFullscreen", false)) {
            setIntent(intent);
            com.blaze.blazesdk.features.videos.players.ui.a aVar = this.m;
            if (aVar != null) {
                aVar.x();
            }
            com.blaze.blazesdk.features.videos.players.ui.a r = r(null);
            if (r == null) {
                return;
            }
            ((sim) p()).b.addView(r);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        super.onPictureInPictureModeChanged(z, configuration);
        if (z) {
            this.t = true;
        }
        if (!z && isFinishing()) {
            com.blaze.blazesdk.features.videos.players.ui.a aVar = this.m;
            if (aVar != null) {
                aVar.K();
                return;
            }
            return;
        }
        String str = null;
        if (!z) {
            String str2 = this.r;
            this.r = null;
            str = str2;
        }
        com.blaze.blazesdk.features.videos.players.ui.a aVar2 = this.m;
        if (aVar2 != null) {
            int i = configuration.orientation;
            if (aVar2.t()) {
                ((w3m) aVar2.getViewModel()).b0(i, str, z);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        com.blaze.blazesdk.features.videos.players.ui.a aVar;
        if (this.t) {
            this.o.getClass();
            if (isInPictureInPictureMode() && (aVar = this.m) != null) {
                aVar.K();
            }
        }
        this.t = false;
        super.onStop();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onUserLeaveHint() {
        i iVar;
        BlazeVideosPlaybackConfiguration.BlazeVideosPipConfiguration blazeVideosPipConfiguration;
        super.onUserLeaveHint();
        com.blaze.blazesdk.features.videos.models.args.a aVar = this.n;
        if ((aVar == null || (iVar = aVar.o) == null || (blazeVideosPipConfiguration = iVar.c) == null) ? true : blazeVideosPipConfiguration.getEnterPipOnAppBackground()) {
            if (this.s) {
                v();
            } else {
                this.s = true;
            }
        }
    }

    @Override // com.blaze.blazesdk.players.ui.k
    public final boolean q(y0m y0mVar) {
        y0mVar.getClass();
        return y0mVar == y0m.DISMISS_VIDEOS_PLAYER;
    }

    public final com.blaze.blazesdk.features.videos.players.ui.a r(Bundle bundle) {
        Parcelable parcelable;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT > 33) {
                parcelable = (Parcelable) extras.getParcelable("videosPlayerActivityArgs", com.blaze.blazesdk.features.videos.models.args.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("videosPlayerActivityArgs");
                if (!(parcelable2 instanceof com.blaze.blazesdk.features.videos.models.args.a)) {
                    parcelable2 = null;
                }
                parcelable = (com.blaze.blazesdk.features.videos.models.args.a) parcelable2;
            }
            com.blaze.blazesdk.features.videos.models.args.a aVar = (com.blaze.blazesdk.features.videos.models.args.a) parcelable;
            if (aVar != null) {
                com.blaze.blazesdk.features.videos.players.ui.a aVar2 = new com.blaze.blazesdk.features.videos.players.ui.a(this, new b(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o), bundle, this, this);
                this.m = aVar2;
                aVar2.setOnForceRotationRequested(new grk(this, 0));
                int i = 1;
                aVar2.setOnPipRequested(new grk(this, i));
                aVar2.setOnPlaybackStateChangedInPip(new frk(this, i));
                aVar2.setOnHardExitRequested(new grk(this, 2));
                aVar2.setOnExitPipToFullscreenRequested(new grk(this, 3));
                return aVar2;
            }
        }
        return null;
    }

    public final void s(Bundle bundle, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2111666318);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(bundle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(this) ? 32 : 16;
        }
        int i3 = 19;
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            g28 g28Var = bkh.c;
            av8Var.d0(-1728545622);
            boolean i4 = av8Var.i(this) | av8Var.i(bundle);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new mwj(23, this, bundle);
                av8Var.n0(O);
            }
            av8Var.s(false);
            td4.a((Function1) O, g28Var, null, av8Var, 48, 4);
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new nmi(this, bundle, i, i3);
        }
    }

    public final void t(Bundle bundle, boolean z, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1535961033);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (av8Var.i(bundle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.d0(-1035160327);
            if (z) {
                av8Var.d0(-1035154418);
                boolean i4 = av8Var.i(this);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (i4 || O == a99Var) {
                    O = new grk(this, i3);
                    av8Var.n0(O);
                }
                Function0 function0 = (Function0) O;
                av8Var.s(false);
                av8Var.d0(-1035145843);
                boolean i5 = av8Var.i(this);
                Object O2 = av8Var.O();
                if (i5 || O2 == a99Var) {
                    O2 = new grk(this, 5);
                    av8Var.n0(O2);
                }
                av8Var.s(false);
                haa.l(function0, (Function0) O2, av8Var, 0);
            }
            av8Var.s(false);
            s(bundle, av8Var, ((i2 >> 3) & 112) | (i2 & 14));
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new di(this, bundle, z, i, 18);
        }
    }

    public final void u(boolean z) {
        t0m t0mVar = this.o;
        t0mVar.getClass();
        if (isInPictureInPictureMode()) {
            t0mVar.getClass();
            try {
                setPictureInPictureParams(t0m.a(this, null, z));
            } catch (Exception e) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0004, B:5:0x000d, B:8:0x0015, B:10:0x0019, B:12:0x001e, B:14:0x0024, B:16:0x0030, B:17:0x0034, B:21:0x004e, B:23:0x0055, B:26:0x0064, B:29:0x0069, B:32:0x0072, B:34:0x0085, B:36:0x008a, B:38:0x0094, B:40:0x009e, B:43:0x00a6, B:45:0x00ac, B:48:0x00b4, B:55:0x00b7), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0004, B:5:0x000d, B:8:0x0015, B:10:0x0019, B:12:0x001e, B:14:0x0024, B:16:0x0030, B:17:0x0034, B:21:0x004e, B:23:0x0055, B:26:0x0064, B:29:0x0069, B:32:0x0072, B:34:0x0085, B:36:0x008a, B:38:0x0094, B:40:0x009e, B:43:0x00a6, B:45:0x00ac, B:48:0x00b4, B:55:0x00b7), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v() {
        boolean z;
        String str;
        fam famVar;
        fam famVar2;
        t0m t0mVar = this.o;
        try {
            t0mVar.getClass();
            if (isInPictureInPictureMode()) {
                this.r = "Already in PIP mode";
                return false;
            }
            com.blaze.blazesdk.features.videos.players.ui.a aVar = this.m;
            if (aVar == null) {
                this.r = "No player view available";
                return false;
            }
            if (aVar.t()) {
                w3m w3mVar = (w3m) aVar.getViewModel();
                n4m D = w3mVar.D();
                boolean z2 = (D != null ? D.c : null) instanceof n4m.a.b;
                drm drmVar = w3mVar.P0;
                boolean K = w3mVar.K();
                if (Intrinsics.c(drmVar.a.getValue(), vom.a) && !K && z2) {
                    boolean z3 = true;
                    if (aVar.t()) {
                        w3m w3mVar2 = (w3m) aVar.getViewModel();
                        n4m D2 = w3mVar2.D();
                        drm drmVar2 = w3mVar2.P0;
                        if (D2 != null && (famVar2 = w3mVar2.e) != null) {
                            drmVar2.a(rcm.a, famVar2.isPlaying());
                            z = ((bqm) drmVar2.a.getValue()) instanceof inm;
                            if (z) {
                                this.r = "Failed to prepare for PIP mode";
                                return false;
                            }
                            View playerSourceView = aVar.getPlayerSourceView();
                            if (!aVar.t() || (famVar = ((w3m) aVar.getViewModel()).e) == null || !famVar.isPlaying()) {
                                z3 = false;
                            }
                            boolean b = t0mVar.b(this, playerSourceView, z3);
                            if (b) {
                                str = null;
                            } else {
                                str = t0mVar.a;
                                if (str == null) {
                                    str = "System denied PIP entry";
                                }
                            }
                            this.r = str;
                            return b;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
            }
            this.r = "PIP not eligible (casting, ads, or wrong state)";
            return false;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = duf.a.getOrCreateKotlinClass(e.getClass()).getSimpleName();
            }
            this.r = String.valueOf(message);
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            return false;
        }
    }
}
