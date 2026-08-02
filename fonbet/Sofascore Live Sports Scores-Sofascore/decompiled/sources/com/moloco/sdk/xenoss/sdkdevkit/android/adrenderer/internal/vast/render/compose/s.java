package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.sofascore.results.R;
import defpackage.a10;
import defpackage.a99;
import defpackage.av8;
import defpackage.b1j;
import defpackage.be5;
import defpackage.bkh;
import defpackage.d7e;
import defpackage.ddi;
import defpackage.dh3;
import defpackage.e12;
import defpackage.e1d;
import defpackage.eh3;
import defpackage.ehg;
import defpackage.ema;
import defpackage.eqf;
import defpackage.fdi;
import defpackage.fdl;
import defpackage.ft3;
import defpackage.ft8;
import defpackage.g12;
import defpackage.g28;
import defpackage.gt8;
import defpackage.haa;
import defpackage.hf3;
import defpackage.hsk;
import defpackage.ht8;
import defpackage.hz8;
import defpackage.if3;
import defpackage.io;
import defpackage.ioi;
import defpackage.jof;
import defpackage.joi;
import defpackage.k13;
import defpackage.ku3;
import defpackage.kx4;
import defpackage.luj;
import defpackage.lz;
import defpackage.mv1;
import defpackage.n12;
import defpackage.n7g;
import defpackage.n9e;
import defpackage.nea;
import defpackage.nf3;
import defpackage.nz;
import defpackage.o3h;
import defpackage.of3;
import defpackage.os8;
import defpackage.p23;
import defpackage.p3e;
import defpackage.q23;
import defpackage.qn6;
import defpackage.rfo;
import defpackage.rq3;
import defpackage.s6a;
import defpackage.sea;
import defpackage.t3e;
import defpackage.tc3;
import defpackage.td4;
import defpackage.utc;
import defpackage.uxf;
import defpackage.waa;
import defpackage.wkn;
import defpackage.xtc;
import defpackage.xw3;
import defpackage.y7k;
import defpackage.yqo;
import defpackage.z88;
import defpackage.zg3;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class s {
    public static volatile Context a;

    public static final long a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 76100) {
                if (hashCode != 63085501) {
                    if (hashCode == 347625656 && str.equals("LevelPlay")) {
                        return wkn.R(8, be5.SECONDS);
                    }
                } else if (str.equals(MolocoMediationAdapter.MEDIATION_PLATFORM_NAME)) {
                    return wkn.R(8, be5.SECONDS);
                }
            } else if (str.equals("MAX")) {
                return wkn.R(8, be5.SECONDS);
            }
        }
        return wkn.R(60, be5.SECONDS);
    }

    public static final tc3 b(io ioVar, p3e p3eVar, long j, long j2, long j3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u uVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar, com.moloco.sdk.internal.ortb.model.h0 h0Var, of3 of3Var) {
        ioVar.getClass();
        p3eVar.getClass();
        uVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.e0(-398768076);
        tc3 y = yqo.y(-201776905, av8Var, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i(ioVar, p3eVar, cVar, uVar, j, j2, j3, h0Var));
        av8Var.s(false);
        return y;
    }

    public static final tc3 c(mv1 mv1Var, t3e t3eVar, long j, long j2, long j3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar, com.moloco.sdk.internal.ortb.model.h0 h0Var, of3 of3Var, int i) {
        t3e t3eVar2;
        av8 av8Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.e0(-992573618);
        mv1 mv1Var2 = (i & 1) != 0 ? uxf.e : mv1Var;
        if ((i & 2) != 0) {
            n7g n7gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d;
            t3eVar2 = new t3e(4.0f, 4.0f, 4.0f, 4.0f);
        } else {
            t3eVar2 = t3eVar;
        }
        long b = (i & 4) != 0 ? ((p23) av8Var2.k(q23.a)).b() : j;
        long j4 = (i & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b : j2;
        long j5 = (i & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a : j3;
        if ((i & 32) != 0) {
            sVar2 = g(null, 0L, 0L, av8Var2, 15);
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            sVar2 = sVar;
        }
        tc3 b2 = b(mv1Var2, t3eVar2, b, j4, j5, sVar2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.a, (i & 128) != 0 ? null : h0Var, av8Var);
        av8Var.s(false);
        return b2;
    }

    public static final tc3 d(mv1 mv1Var, t3e t3eVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.e0(-1318345093);
        if ((i & 1) != 0) {
            mv1Var = uxf.i;
        }
        if ((i & 2) != 0) {
            n7g n7gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d;
            t3eVar = new t3e(4.0f, 4.0f, 4.0f, 4.0f);
        }
        tc3 y = yqo.y(-903645392, av8Var, new r(mv1Var, t3eVar));
        av8Var.s(false);
        return y;
    }

    public static final ehg e(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar) {
        context.getClass();
        LinkedHashMap linkedHashMap = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.a;
        Object obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.a.get(Integer.valueOf(pVar.a));
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0)) {
            obj = null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0 h0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0) obj;
        if (h0Var == null) {
            return null;
        }
        ehg ehgVar = new ehg(context, h0Var);
        h0Var.setBackgroundColor(0);
        h0Var.setVisibility(0);
        ehgVar.addView(h0Var, new ViewGroup.LayoutParams(-1, -1));
        return ehgVar;
    }

    public static final Bitmap f(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    byte[] decode = Base64.decode(str, 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    if (decodeByteArray != null) {
                        return decodeByteArray;
                    }
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "BitmapCreationError", "BitmapFactory failed to decode the byte array", null, false, 12, null);
                    return decodeByteArray;
                }
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "BitmapCreationError", "Error creating bitmap from base64", e, false, 8, null);
                return null;
            }
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "BitmapCreationError", "Base64 string is null or empty", false, 4, null);
        return null;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s g(d7e d7eVar, long j, long j2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.e0(571957227);
        if ((i & 1) != 0) {
            d7eVar = haa.t(R.drawable.ic_round_close_24, 0, av8Var);
        }
        d7e d7eVar2 = d7eVar;
        if ((i & 2) != 0) {
            j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b;
        }
        long j3 = j;
        n7g n7gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d;
        if ((i & 8) != 0) {
            j2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.c;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s sVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s(d7eVar2, "Close", j3, n7gVar, j2);
        av8Var.s(false);
        return sVar;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a h(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar) {
        context.getClass();
        int i = 0;
        boolean z = Build.VERSION.SDK_INT >= 31;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a(context, eVar.t, eVar.g, eVar.h, eVar.f, z ? new com.moloco.sdk.internal.ilrd.o(context, eVar, qVar) : null, new o(eVar, i), eVar.A);
    }

    public static final void i(MolocoInitializationListener molocoInitializationListener, MolocoInitStatus molocoInitStatus) {
        molocoInitializationListener.getClass();
        molocoInitStatus.getClass();
        xw3.L(com.moloco.sdk.internal.scheduling.b.a, null, null, new nea(new com.moloco.sdk.internal.b(1, molocoInitializationListener, molocoInitStatus), null, 3), 3);
    }

    public static final void j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b bVar, Function0 function0, gt8 gt8Var, xtc xtcVar, of3 of3Var, int i) {
        xtc z;
        Object obj;
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-595771397);
        int i2 = (av8Var.g(bVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= av8Var.g(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(gt8Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 1171) == 1170 && av8Var.D()) {
            av8Var.W();
        } else {
            Unit unit = Unit.a;
            av8Var.e0(-602684476);
            boolean g = av8Var.g(bVar);
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            rq3 rq3Var = null;
            if (g || O == obj2) {
                O = new luj(bVar, rq3Var, 28);
                av8Var.n0(O);
            }
            av8Var.s(false);
            hz8.o(av8Var, unit, (Function2) O);
            av8Var.e0(733328855);
            g12 e = e12.e(uxf.c, av8Var, 0);
            av8Var.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            hsk hskVar = (hsk) av8Var.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(xtcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            av8Var.y = false;
            waa.K(av8Var, e, hf3.g);
            waa.K(av8Var, kx4Var, hf3.e);
            waa.K(av8Var, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var, hskVar, hf3.i, av8Var), av8Var, 0);
            av8Var.e0(2058660585);
            av8Var.e0(-2137368960);
            xtc J = n9e.J(utc.a, "DECContainer");
            av8Var.e0(491790676);
            boolean g2 = av8Var.g(function0) | av8Var.g(bVar);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj2) {
                O2 = new fdl(function0, bVar, rq3Var, 15);
                av8Var.n0(O2);
            }
            av8Var.s(false);
            z = J.z(new ioi(unit, null, new joi((Function2) O2), 6));
            String str = bVar.h;
            av8Var.e0(491799591);
            Object O3 = av8Var.O();
            if (O3 == obj2) {
                O3 = new com.moloco.sdk.service_locator.h(21);
                av8Var.n0(O3);
            }
            av8Var.s(false);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x.a(z, str, (Function0) O3, bVar.i, av8Var, 384);
            av8Var.e0(491803165);
            if (gt8Var == null) {
                z2 = false;
            } else {
                Object obj3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) sea.l((jof) bVar.j.h, av8Var, 0).getValue();
                av8Var.e0(1423888860);
                boolean g3 = av8Var.g(bVar);
                Object O4 = av8Var.O();
                if (g3 || O4 == obj2) {
                    obj = obj2;
                    z2 = false;
                    Object bVar2 = new com.moloco.sdk.internal.publisher.nativead.b(0, bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0, 11);
                    av8Var.n0(bVar2);
                    O4 = bVar2;
                } else {
                    z2 = false;
                    obj = obj2;
                }
                Object obj4 = (KFunction) O4;
                av8Var.s(z2);
                av8Var.e0(1423890616);
                boolean g4 = av8Var.g(bVar);
                Object O5 = av8Var.O();
                if (g4 || O5 == obj) {
                    Object bVar3 = new com.moloco.sdk.internal.publisher.nativead.b(0, bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0, 12);
                    av8Var.n0(bVar3);
                    O5 = bVar3;
                }
                av8Var.s(z2);
                gt8Var.invoke(n12.a, obj3, obj4, (KFunction) O5, av8Var, 6);
            }
            com.appsflyer.internal.i.p(av8Var, z2, z2, z2, true);
            av8Var.s(z2);
            av8Var.s(z2);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b1j(bVar, function0, gt8Var, xtcVar, i, 7);
        }
    }

    public static final void k(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar, final xtc xtcVar, of3 of3Var, final int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1230364815);
        int i2 = (av8Var.g(pVar) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.e0(-1944708127);
            Object O = av8Var.O();
            if (O == nf3.a) {
                LinkedHashMap linkedHashMap = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.a;
                Object obj = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.a.get(Integer.valueOf(pVar.a));
                if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0)) {
                    obj = null;
                }
                O = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0) obj;
                av8Var.n0(O);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0 h0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0) O;
            final int i3 = 0;
            av8Var.s(false);
            if (h0Var == null) {
                eqf u = av8Var.u();
                if (u != null) {
                    u.d = new Function2(pVar, xtcVar, i, i3) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h1
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p b;
                        public final /* synthetic */ xtc c;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i4 = this.a;
                            xtc xtcVar2 = this.c;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar2 = this.b;
                            of3 of3Var2 = (of3) obj2;
                            ((Integer) obj3).getClass();
                            switch (i4) {
                                case 0:
                                    s.k(pVar2, xtcVar2, of3Var2, 1);
                                    break;
                                default:
                                    s.k(pVar2, xtcVar2, of3Var2, 1);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            com.facebook.appevents.g.e(h0Var, xtcVar, null, av8Var, (i2 & 112) | 384);
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            final int i4 = 1;
            u2.d = new Function2(pVar, xtcVar, i, i4) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h1
                public final /* synthetic */ int a;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p b;
                public final /* synthetic */ xtc c;

                {
                    this.a = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i42 = this.a;
                    xtc xtcVar2 = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p pVar2 = this.b;
                    of3 of3Var2 = (of3) obj2;
                    ((Integer) obj3).getClass();
                    switch (i42) {
                        case 0:
                            s.k(pVar2, xtcVar2, of3Var2, 1);
                            break;
                        default:
                            s.k(pVar2, xtcVar2, of3Var2, 1);
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:35)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:633)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:633)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:372)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void l(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar, Function0 function0, xtc xtcVar, ht8 ht8Var, ft8 ft8Var, gt8 gt8Var, ht8 ht8Var2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q qVar, Function0 function02, of3 of3Var, int i) {
        utc utcVar;
        boolean z;
        final int i2;
        boolean z2;
        av8 av8Var;
        boolean z3;
        Unit unit;
        Object obj;
        e1d e1dVar;
        ?? r11;
        e1d e1dVar2;
        e1d e1dVar3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar2;
        xtc z4;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar3;
        n12 n12Var;
        n12 n12Var2;
        Integer num;
        av8 av8Var2;
        av8 av8Var3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar4;
        av8 av8Var4;
        av8 av8Var5;
        function02.getClass();
        av8 av8Var6 = (av8) of3Var;
        av8Var6.f0(-1913678167);
        int i3 = i | (av8Var6.g(eVar) ? 4 : 2) | (av8Var6.g(function0) ? 32 : 16) | (av8Var6.g(ht8Var) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var6.g(ft8Var) ? 16384 : 8192) | (av8Var6.g(gt8Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var6.g(ht8Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var6.g(qVar) ? 8388608 : 4194304) | (av8Var6.g(function02) ? 67108864 : 33554432);
        if ((i3 & 38347923) == 38347922 && av8Var6.D()) {
            av8Var6.W();
            av8Var5 = av8Var6;
        } else {
            Unit unit2 = Unit.a;
            av8Var6.e0(1664872985);
            boolean g = av8Var6.g(eVar);
            Object O = av8Var6.O();
            Object obj2 = nf3.a;
            rq3 rq3Var = null;
            if (g || O == obj2) {
                O = new luj(eVar, rq3Var, 29);
                av8Var6.n0(O);
            }
            av8Var6.s(false);
            hz8.o(av8Var6, unit2, (Function2) O);
            av8Var6.e0(733328855);
            g12 e = e12.e(uxf.c, av8Var6, 0);
            av8Var6.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var6.k(dh3.h);
            ema emaVar = (ema) av8Var6.k(dh3.n);
            hsk hskVar = (hsk) av8Var6.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(xtcVar);
            av8Var6.h0();
            if (av8Var6.S) {
                av8Var6.l(zg3Var);
            } else {
                av8Var6.q0();
            }
            av8Var6.y = false;
            waa.K(av8Var6, e, hf3.g);
            waa.K(av8Var6, kx4Var, hf3.e);
            waa.K(av8Var6, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var6, hskVar, hf3.i, av8Var6), av8Var6, 0);
            av8Var6.e0(2058660585);
            av8Var6.e0(-2137368960);
            e1d l = sea.l(eVar.p, av8Var6, 0);
            e1d l2 = sea.l(eVar.n, av8Var6, 0);
            av8Var6.e0(1087148963);
            Object O2 = av8Var6.O();
            if (O2 == obj2) {
                O2 = androidx.compose.runtime.e.f(Boolean.FALSE);
                av8Var6.n0(O2);
            }
            final e1d e1dVar4 = (e1d) O2;
            av8Var6.s(false);
            av8Var6.e0(1087151755);
            Object O3 = av8Var6.O();
            if (O3 == obj2) {
                O3 = androidx.compose.runtime.e.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a);
                av8Var6.n0(O3);
            }
            final e1d e1dVar5 = (e1d) O3;
            av8Var6.s(false);
            av8Var6.e0(1087157744);
            Object O4 = av8Var6.O();
            if (O4 == obj2) {
                O4 = androidx.compose.runtime.e.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u(Boolean.TRUE));
                av8Var6.n0(O4);
            }
            e1d e1dVar6 = (e1d) O4;
            av8Var6.s(false);
            Context context = (Context) av8Var6.k(nz.b);
            av8Var6.e0(1087173980);
            boolean g2 = av8Var6.g(eVar);
            Object O5 = av8Var6.O();
            if (g2 || O5 == obj2) {
                O5 = eVar.e ? h(context, eVar, qVar) : null;
                av8Var6.n0(O5);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a) O5;
            av8Var6.s(false);
            av8Var6.e0(1087182676);
            utc utcVar2 = utc.a;
            n12 n12Var3 = n12.a;
            if (aVar == null) {
                utcVar = utcVar2;
                z2 = false;
                i2 = 1;
                av8Var = av8Var6;
            } else {
                av8Var6.e0(1376195898);
                boolean g3 = av8Var6.g(aVar);
                Object O6 = av8Var6.O();
                if (g3 || O6 == obj2) {
                    O6 = new com.moloco.sdk.acm.db.e(aVar, 11);
                    av8Var6.n0(O6);
                }
                av8Var6.s(false);
                utcVar = utcVar2;
                td4.a((Function1) O6, n12Var3.b(utcVar2), null, av8Var6, 0, 4);
                av8 av8Var7 = av8Var6;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) l.getValue();
                av8Var7.e0(1376199957);
                boolean g4 = av8Var7.g(aVar) | av8Var7.g(l);
                Object O7 = av8Var7.O();
                if (g4 || O7 == obj2) {
                    z = false;
                    O7 = new p(aVar, l, null, false ? 1 : 0);
                    av8Var7.n0(O7);
                } else {
                    z = false;
                }
                av8Var7.s(z);
                hz8.o(av8Var7, uVar, (Function2) O7);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) e1dVar6.getValue();
                av8Var7.e0(1376202735);
                boolean g5 = av8Var7.g(e1dVar6) | av8Var7.g(aVar);
                Object O8 = av8Var7.O();
                if (g5 || O8 == obj2) {
                    i2 = 1;
                    O8 = new p(aVar, e1dVar6, null, i2);
                    av8Var7.n0(O8);
                } else {
                    i2 = 1;
                }
                z2 = false;
                av8Var7.s(false);
                hz8.o(av8Var7, uVar2, (Function2) O8);
                av8Var = av8Var7;
            }
            av8Var.s(z2);
            String str = eVar.t;
            boolean z5 = eVar.s;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) e1dVar6.getValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) l.getValue();
            boolean booleanValue = ((Boolean) l2.getValue()).booleanValue();
            av8Var.e0(1087203050);
            boolean g6 = av8Var.g(eVar) | av8Var.g(e1dVar4);
            Object O9 = av8Var.O();
            if (g6 || O9 == obj2) {
                z3 = false;
                final boolean z6 = false ? 1 : 0;
                O9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i4 = z6;
                        e1d e1dVar7 = e1dVar4;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar5 = eVar;
                        switch (i4) {
                            case 0:
                                Boolean bool = (Boolean) obj3;
                                bool.booleanValue();
                                fdi fdiVar = eVar5.z;
                                fdiVar.getClass();
                                fdiVar.m(null, bool);
                                e1dVar7.setValue(bool);
                                break;
                            default:
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj3;
                                oVar.getClass();
                                eVar5.b(oVar);
                                e1dVar7.setValue(oVar);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O9);
            } else {
                z3 = false;
            }
            Function1 function1 = (Function1) O9;
            av8Var.s(z3);
            av8Var.e0(1087206958);
            boolean g7 = av8Var.g(eVar);
            Object O10 = av8Var.O();
            if (g7 || O10 == obj2) {
                O10 = new com.moloco.sdk.acm.db.e(eVar, 12);
                av8Var.n0(O10);
            }
            Function1 function12 = (Function1) O10;
            av8Var.s(false);
            av8Var.e0(1087215240);
            boolean g8 = av8Var.g(eVar) | av8Var.g(e1dVar5);
            Object O11 = av8Var.O();
            if (g8 || O11 == obj2) {
                O11 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i4 = i2;
                        e1d e1dVar7 = e1dVar5;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar5 = eVar;
                        switch (i4) {
                            case 0:
                                Boolean bool = (Boolean) obj3;
                                bool.booleanValue();
                                fdi fdiVar = eVar5.z;
                                fdiVar.getClass();
                                fdiVar.m(null, bool);
                                e1dVar7.setValue(bool);
                                break;
                            default:
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj3;
                                oVar.getClass();
                                eVar5.b(oVar);
                                e1dVar7.setValue(oVar);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O11);
            }
            Function1 function13 = (Function1) O11;
            av8Var.s(false);
            av8Var.e0(1087218847);
            boolean g9 = av8Var.g(eVar);
            Object O12 = av8Var.O();
            if (g9 || O12 == obj2) {
                unit = unit2;
                obj = obj2;
                e1dVar = e1dVar6;
                r11 = 0;
                e1dVar2 = e1dVar5;
                e1dVar3 = e1dVar4;
                Object l0Var = new com.moloco.sdk.internal.publisher.l0(1, eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0, 6);
                eVar2 = eVar;
                av8Var.n0(l0Var);
                O12 = l0Var;
            } else {
                e1dVar = e1dVar6;
                eVar2 = eVar;
                e1dVar3 = e1dVar4;
                e1dVar2 = e1dVar5;
                obj = obj2;
                unit = unit2;
                r11 = 0;
            }
            av8Var.s(r11);
            Function1 function14 = (Function1) ((KFunction) O12);
            xtc b = n12Var3.b(utcVar);
            av8Var.e0(1087223028);
            boolean g10 = av8Var.g(function0) | av8Var.g(eVar2);
            Object O13 = av8Var.O();
            Object obj3 = obj;
            if (g10 || O13 == obj3) {
                O13 = new fdl(function0, eVar2, (rq3) null, 16);
                av8Var.n0(O13);
            }
            av8Var.s(r11);
            z4 = b.z(new ioi(unit, null, new joi((Function2) O13), 6));
            av8 av8Var8 = av8Var;
            com.facebook.appevents.n.k(str, z5, uVar3, uVar4, booleanValue, function1, function12, qVar, function13, function14, z4, av8Var8, i3 & 29360128);
            av8Var8.e0(1087232585);
            if (ht8Var2 == null) {
                n12Var = n12Var3;
                eVar3 = eVar2;
            } else {
                av8Var8.e0(1376244972);
                e1d e1dVar7 = e1dVar;
                boolean g11 = av8Var8.g(e1dVar7);
                Object O14 = av8Var8.O();
                if (g11 || O14 == obj3) {
                    O14 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c(1, e1dVar7);
                    av8Var8.n0(O14);
                }
                av8Var8.s(r11);
                Object obj4 = (Boolean) e1dVar3.getValue();
                obj4.getClass();
                eVar3 = eVar2;
                ht8Var2.invoke(n12Var3, obj4, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) e1dVar2.getValue(), (Function1) O14, function02, av8Var8, Integer.valueOf(((i3 >> 12) & 57344) | 3078));
                n12Var = n12Var3;
            }
            av8Var8.s(r11);
            boolean z7 = (((Boolean) e1dVar3.getValue()).booleanValue() || !(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) e1dVar2.getValue()) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k)) ? true : r11;
            av8Var8.e0(1087251753);
            if (ht8Var == null) {
                n12Var2 = n12Var;
                av8Var2 = av8Var8;
                num = 6;
            } else {
                Boolean valueOf = Boolean.valueOf(z7);
                Boolean bool = (Boolean) l2.getValue();
                bool.getClass();
                av8Var8.e0(1376264408);
                boolean g12 = av8Var8.g(eVar3);
                Object O15 = av8Var8.O();
                if (g12 || O15 == obj3) {
                    O15 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a(eVar3, 3);
                    av8Var8.n0(O15);
                }
                Function2 function2 = (Function2) O15;
                av8Var8.s(r11);
                av8Var8.e0(1376269827);
                boolean g13 = av8Var8.g(eVar3);
                Object O16 = av8Var8.O();
                if (g13 || O16 == obj3) {
                    Object l0Var2 = new com.moloco.sdk.internal.publisher.l0(1, eVar3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.class, "onMuteChange", "onMuteChange(Z)V", 0, 7);
                    av8Var8.n0(l0Var2);
                    O16 = l0Var2;
                }
                KFunction kFunction = (KFunction) O16;
                av8Var8.s(r11);
                n12Var2 = n12Var;
                Object obj5 = av8Var8;
                ht8Var.invoke(n12Var2, valueOf, bool, function2, kFunction, obj5, 6);
                num = 6;
                av8Var2 = obj5;
            }
            av8Var2.s(r11);
            av8Var2.e0(1087260362);
            if (ft8Var == null) {
                av8Var3 = av8Var2;
            } else {
                Boolean bool2 = (Boolean) e1dVar3.getValue();
                bool2.getClass();
                Object obj6 = av8Var2;
                ft8Var.invoke(n12Var2, bool2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) e1dVar2.getValue(), obj6, num);
                av8Var3 = obj6;
            }
            n12 n12Var4 = n12Var2;
            Integer num2 = num;
            av8Var3.s(r11);
            av8Var3.e0(1087263154);
            if (gt8Var == null) {
                av8Var4 = av8Var3;
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) sea.l(eVar3.y, av8Var3, r11).getValue();
                av8Var3.e0(1376279025);
                boolean g14 = av8Var3.g(eVar3);
                Object O17 = av8Var3.O();
                if (g14 || O17 == obj3) {
                    eVar4 = eVar3;
                    Object bVar = new com.moloco.sdk.internal.publisher.nativead.b(0, eVar4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0, 13);
                    av8Var3.n0(bVar);
                    O17 = bVar;
                } else {
                    eVar4 = eVar3;
                }
                KFunction kFunction2 = (KFunction) O17;
                av8Var3.s(r11);
                av8Var3.e0(1376280781);
                boolean g15 = av8Var3.g(eVar4);
                Object O18 = av8Var3.O();
                if (g15 || O18 == obj3) {
                    Object bVar2 = new com.moloco.sdk.internal.publisher.nativead.b(0, eVar4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0, 14);
                    av8Var3.n0(bVar2);
                    O18 = bVar2;
                }
                av8Var3.s(r11);
                Object obj7 = av8Var3;
                gt8Var.invoke(n12Var4, rVar, kFunction2, (KFunction) O18, obj7, num2);
                av8Var4 = obj7;
            }
            com.appsflyer.internal.i.p(av8Var4, r11, r11, r11, true);
            av8Var4.s(r11);
            av8Var4.s(r11);
            av8Var5 = av8Var4;
        }
        eqf u = av8Var5.u();
        if (u != null) {
            u.d = new qn6(eVar, function0, xtcVar, ht8Var, ft8Var, gt8Var, ht8Var2, qVar, function02, i);
        }
    }

    public static final void m(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar, boolean z, Function0 function0, Function0 function02, Function1 function1, os8 os8Var, boolean z2, z88 z88Var, of3 of3Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        av8 av8Var;
        uVar.getClass();
        Object obj = uVar.a;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1211286303);
        int i3 = i & 6;
        Object obj2 = n12.a;
        if (i3 == 0) {
            i2 = (av8Var2.g(obj2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(uVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.h(true) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= av8Var2.h(z3) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.g(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var2.g(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var2.g(function1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var2.g(os8Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            z4 = z2;
            i2 |= av8Var2.h(z4) ? 67108864 : 33554432;
        } else {
            z4 = z2;
        }
        if ((805306368 & i) == 0) {
            i2 |= av8Var2.g(z88Var) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) == 306783378 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
        } else {
            av8Var2.e0(773894976);
            av8Var2.e0(-492369756);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                eh3 eh3Var = new eh3(hz8.G(kotlin.coroutines.g.a, av8Var2));
                av8Var2.n0(eh3Var);
                O = eh3Var;
            }
            av8Var2.s(false);
            ku3 ku3Var = ((eh3) O).a;
            av8Var2.s(false);
            av8Var2.e0(1117957914);
            boolean g = av8Var2.g(uVar) | av8Var2.g(z88Var);
            Object O2 = av8Var2.O();
            if (g || O2 == a99Var) {
                O2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0.a(((y7k) obj).a, ku3Var, z88Var);
                av8Var2.n0(O2);
            }
            av8Var2.s(false);
            e1d x = rfo.x((ddi) O2, av8Var2, 0);
            e1d g2 = androidx.compose.runtime.e.g(function0, av8Var2);
            Unit unit = Unit.a;
            av8Var2.e0(1117966956);
            boolean g3 = av8Var2.g(x) | av8Var2.g(g2);
            Object O3 = av8Var2.O();
            if (g3 || O3 == a99Var) {
                O3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m(x, g2, null, 1);
                av8Var2.n0(O3);
            }
            av8Var2.s(false);
            hz8.o(av8Var2, unit, (Function2) O3);
            Object valueOf = Boolean.valueOf(z3);
            Object obj3 = Boolean.TRUE;
            Object valueOf2 = Boolean.valueOf(z4);
            y7k y7kVar = (y7k) x.getValue();
            int i4 = y7kVar.a;
            int i5 = i2 >> 6;
            av8Var = av8Var2;
            os8Var.invoke(obj2, valueOf, obj3, function02, function1, valueOf2, obj, y7kVar, (Function0) g2.getValue(), av8Var, Integer.valueOf((i2 & 14) | (i5 & 112) | (i2 & 896) | (i5 & 7168) | (i5 & 57344) | ((i2 >> 9) & 458752) | ((i2 << 6) & 1879048192)));
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ft3(uVar, z3, function0, function02, function1, os8Var, z4, z88Var, i);
        }
    }

    public static final void n(final String str, final tc3 tc3Var, of3 of3Var, final int i) {
        final int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(701452993);
        if ((((av8Var.g(str) ? 4 : 2) | i) & 19) == 18 && av8Var.D()) {
            av8Var.W();
            i2 = 1;
        } else {
            av8Var.e0(1831124775);
            boolean g = av8Var.g(str);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                Bitmap f = f(str);
                O = f != null ? new a10(f) : null;
                av8Var.n0(O);
            }
            a10 a10Var = (a10) O;
            final int i3 = 0;
            av8Var.s(false);
            av8Var.e0(1831129055);
            if (a10Var == null) {
                tc3Var.invoke(av8Var, 6);
                av8Var.s(false);
                eqf u = av8Var.u();
                if (u != null) {
                    u.d = new Function2(str, tc3Var, i, i3) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c
                        public final /* synthetic */ int a;
                        public final /* synthetic */ String b;
                        public final /* synthetic */ tc3 c;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            tc3 tc3Var2 = this.c;
                            String str2 = this.b;
                            of3 of3Var2 = (of3) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.n(str2, tc3Var2, of3Var2, 49);
                                    break;
                                default:
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.n(str2, tc3Var2, of3Var2, 49);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            av8Var.s(false);
            g28 g28Var = bkh.c;
            av8Var.e0(1831134328);
            boolean g2 = av8Var.g("Watermark Overlay");
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                O2 = new com.appsflyer.internal.a(12);
                av8Var.n0(O2);
            }
            av8Var.s(false);
            xtc a2 = o3h.a(g28Var, false, (Function1) O2);
            av8Var.e0(733328855);
            g12 e = e12.e(uxf.c, av8Var, 0);
            av8Var.e0(-1323940314);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            hsk hskVar = (hsk) av8Var.k(dh3.t);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            tc3 F = s6a.F(a2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            av8Var.y = false;
            waa.K(av8Var, e, hf3.g);
            waa.K(av8Var, kx4Var, hf3.e);
            waa.K(av8Var, emaVar, hf3.h);
            F.invoke(com.appsflyer.internal.i.f(av8Var, hskVar, hf3.i, av8Var), av8Var, 0);
            av8Var.e0(2058660585);
            av8Var.e0(-2137368960);
            tc3Var.invoke(av8Var, 6);
            av8Var.e0(602585977);
            boolean g3 = av8Var.g(a10Var);
            Object O3 = av8Var.O();
            if (g3 || O3 == a99Var) {
                O3 = new com.moloco.sdk.acm.db.e(a10Var, 4);
                av8Var.n0(O3);
            }
            av8Var.s(false);
            lz.d(6, av8Var, g28Var, (Function1) O3);
            i2 = 1;
            com.appsflyer.internal.i.p(av8Var, false, false, true, false);
            av8Var.s(false);
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(str, tc3Var, i, i2) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ tc3 c;

                {
                    this.a = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = this.a;
                    tc3 tc3Var2 = this.c;
                    String str2 = this.b;
                    of3 of3Var2 = (of3) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.n(str2, tc3Var2, of3Var2, 49);
                            break;
                        default:
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.n(str2, tc3Var2, of3Var2, 49);
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final long o(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 76100) {
                if (hashCode != 63085501) {
                    if (hashCode == 347625656 && str.equals("LevelPlay")) {
                        return wkn.R(26, be5.SECONDS);
                    }
                } else if (str.equals(MolocoMediationAdapter.MEDIATION_PLATFORM_NAME)) {
                    return wkn.R(26, be5.SECONDS);
                }
            } else if (str.equals("MAX")) {
                return wkn.R(26, be5.SECONDS);
            }
        }
        return wkn.R(60, be5.SECONDS);
    }

    public static ArrayList p(List list, HttpURLConnection httpURLConnection, com.facebook.q qVar) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.facebook.g0((com.facebook.d0) it.next(), httpURLConnection, new FacebookRequestError(qVar)));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.g0 q(com.facebook.d0 d0Var, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        FacebookRequestError facebookRequestError;
        AccessToken accessToken;
        AccessToken accessToken2;
        int optInt;
        String str;
        String str2;
        String str3;
        boolean z;
        int optInt2;
        String str4;
        Object obj3 = obj;
        if (obj3 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj3;
            if (jSONObject.has("code")) {
                int i = jSONObject.getInt("code");
                Object u = com.facebook.internal.k0.u(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (u != null && (u instanceof JSONObject)) {
                    if (((JSONObject) u).has("error")) {
                        JSONObject jSONObject2 = (JSONObject) com.facebook.internal.k0.u((JSONObject) u, "error", null);
                        String optString = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                        String optString2 = jSONObject2 != null ? jSONObject2.optString(PglCryptUtils.KEY_MESSAGE, null) : null;
                        int optInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                        int optInt4 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                        str3 = optString2;
                        str2 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                        str = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                        z = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                        optInt2 = optInt4;
                        r14 = true;
                        str4 = optString;
                        optInt = optInt3;
                    } else {
                        if (!((JSONObject) u).has("error_code") && !((JSONObject) u).has("error_msg") && !((JSONObject) u).has("error_reason")) {
                            str3 = null;
                            str = null;
                            str2 = null;
                            z = false;
                            optInt2 = -1;
                            optInt = -1;
                            str4 = null;
                        }
                        String optString3 = ((JSONObject) u).optString("error_reason", null);
                        String optString4 = ((JSONObject) u).optString("error_msg", null);
                        optInt = ((JSONObject) u).optInt("error_code", -1);
                        str = null;
                        str2 = null;
                        str3 = optString4;
                        z = false;
                        optInt2 = ((JSONObject) u).optInt("error_subcode", -1);
                        r14 = true;
                        str4 = optString3;
                    }
                    if (r14) {
                        facebookRequestError = new FacebookRequestError(i, optInt, optInt2, str4, str3, str, str2, obj2, null, z);
                        if (facebookRequestError != null) {
                            facebookRequestError.toString();
                            if (facebookRequestError.b == 190 && (accessToken = d0Var.a) != null) {
                                Date date = AccessToken.l;
                                if (accessToken.equals(com.facebook.appevents.g.p())) {
                                    int i2 = facebookRequestError.c;
                                    com.facebook.b bVar = com.facebook.i.f;
                                    if (i2 != 493) {
                                        bVar.i().c(null, true);
                                    } else {
                                        AccessToken p = com.facebook.appevents.g.p();
                                        if (p != null && !new Date().after(p.a) && (accessToken2 = bVar.i().c) != null) {
                                            bVar.i().c(new AccessToken(accessToken2.e, accessToken2.h, accessToken2.i, accessToken2.b, accessToken2.c, accessToken2.d, accessToken2.f, new Date(), new Date(), accessToken2.j), true);
                                        }
                                    }
                                }
                            }
                            return new com.facebook.g0(d0Var, httpURLConnection, facebookRequestError);
                        }
                        Object u2 = com.facebook.internal.k0.u(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                        if (u2 instanceof JSONObject) {
                            JSONObject jSONObject3 = (JSONObject) u2;
                            return new com.facebook.g0(d0Var, httpURLConnection, jSONObject3.toString(), jSONObject3);
                        }
                        if (u2 instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) u2;
                            String jSONArray2 = jSONArray.toString();
                            d0Var.getClass();
                            jSONArray2.getClass();
                            return new com.facebook.g0(d0Var, httpURLConnection, null, jSONArray, null);
                        }
                        obj3 = JSONObject.NULL;
                        obj3.getClass();
                    }
                }
                if (i > 299 || 200 > i) {
                    if (jSONObject.has("body")) {
                    }
                    facebookRequestError = new FacebookRequestError(i, -1, -1, null, null, null, null, obj2, null, false);
                    if (facebookRequestError != null) {
                    }
                }
            }
            facebookRequestError = null;
            if (facebookRequestError != null) {
            }
        }
        if (obj3 == JSONObject.NULL) {
            return new com.facebook.g0(d0Var, httpURLConnection, obj3.toString(), null);
        }
        throw new com.facebook.q("Got unexpected object type in response, class: ".concat(obj3.getClass().getSimpleName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList r(InputStream inputStream, HttpURLConnection httpURLConnection, com.facebook.f0 f0Var) {
        Object obj;
        String I = com.facebook.internal.k0.I(inputStream);
        com.facebook.b bVar = com.facebook.internal.a0.a;
        synchronized (com.facebook.w.b) {
        }
        Object nextValue = new JSONTokener(I).nextValue();
        nextValue.getClass();
        int size = f0Var.b.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            com.facebook.d0 d0Var = (com.facebook.d0) f0Var.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", nextValue);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e) {
                arrayList.add(new com.facebook.g0(d0Var, httpURLConnection, new FacebookRequestError(e)));
            } catch (JSONException e2) {
                arrayList.add(new com.facebook.g0(d0Var, httpURLConnection, new FacebookRequestError(e2)));
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        com.facebook.d0 d0Var2 = (com.facebook.d0) f0Var.get(i);
                        try {
                            Object obj2 = ((JSONArray) obj).get(i);
                            obj2.getClass();
                            arrayList.add(q(d0Var2, httpURLConnection, obj2, nextValue));
                        } catch (com.facebook.q e3) {
                            arrayList.add(new com.facebook.g0(d0Var2, httpURLConnection, new FacebookRequestError(e3)));
                        } catch (JSONException e4) {
                            arrayList.add(new com.facebook.g0(d0Var2, httpURLConnection, new FacebookRequestError(e4)));
                        }
                    }
                    com.facebook.b bVar2 = com.facebook.internal.a0.a;
                    synchronized (com.facebook.w.b) {
                    }
                    return arrayList;
                }
            }
            com.facebook.t.a("Unexpected number of results");
            return null;
        }
        obj = nextValue;
        if (obj instanceof JSONArray) {
        }
        com.facebook.t.a("Unexpected number of results");
        return null;
    }

    public static com.facebook.login.i s(JSONObject jSONObject) {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            optString2.getClass();
            if (optString2.length() != 0 && !optString2.equals("installed") && (optString = optJSONObject.optString("status")) != null) {
                int hashCode = optString.hashCode();
                if (hashCode != -1309235419) {
                    if (hashCode != 280295099) {
                        if (hashCode == 568196142 && optString.equals("declined")) {
                            arrayList2.add(optString2);
                        }
                    } else if (optString.equals("granted")) {
                        arrayList.add(optString2);
                    }
                } else if (optString.equals("expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        com.facebook.login.i iVar = new com.facebook.login.i();
        iVar.b = arrayList;
        iVar.c = arrayList2;
        iVar.d = arrayList3;
        return iVar;
    }
}
