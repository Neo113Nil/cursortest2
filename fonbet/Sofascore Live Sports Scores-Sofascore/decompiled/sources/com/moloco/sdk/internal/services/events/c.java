package com.moloco.sdk.internal.services.events;

import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.facebook.appevents.j;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.b4;
import com.moloco.sdk.c4;
import com.moloco.sdk.d3;
import com.moloco.sdk.d4;
import com.moloco.sdk.e3;
import com.moloco.sdk.g3;
import com.moloco.sdk.h3;
import com.moloco.sdk.i3;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.internal.services.m;
import com.moloco.sdk.internal.services.n;
import com.moloco.sdk.internal.services.o;
import com.moloco.sdk.internal.services.p;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.internal.services.t;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.j3;
import com.moloco.sdk.k3;
import com.moloco.sdk.l3;
import com.moloco.sdk.m3;
import com.moloco.sdk.n3;
import com.moloco.sdk.o3;
import com.moloco.sdk.p3;
import com.moloco.sdk.r3;
import com.moloco.sdk.t3;
import com.moloco.sdk.u3;
import com.moloco.sdk.v3;
import com.moloco.sdk.w3;
import com.moloco.sdk.x3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h;
import com.moloco.sdk.y3;
import defpackage.a70;
import defpackage.k13;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    public final u a;
    public final com.moloco.sdk.internal.services.c b;
    public final s c;
    public final com.moloco.sdk.internal.services.g d;
    public final com.moloco.sdk.internal.services.usertracker.c e;
    public final o f;
    public final com.moloco.sdk.internal.services.proto.a g;
    public final e h;

    public c(u uVar, com.moloco.sdk.internal.services.c cVar, s sVar, com.moloco.sdk.internal.services.g gVar, com.moloco.sdk.internal.services.usertracker.c cVar2, o oVar, com.moloco.sdk.internal.services.proto.a aVar, e eVar) {
        uVar.getClass();
        cVar.getClass();
        sVar.getClass();
        gVar.getClass();
        cVar2.getClass();
        oVar.getClass();
        aVar.getClass();
        eVar.getClass();
        this.a = uVar;
        this.b = cVar;
        this.c = sVar;
        this.d = gVar;
        this.e = cVar2;
        this.f = oVar;
        this.g = aVar;
        this.h = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, h0 h0Var, sq3 sq3Var) {
        a aVar;
        int i;
        j3 h;
        j3 j3Var;
        h0 h0Var2;
        j3 j3Var2;
        c cVar;
        j3 j3Var3;
        j a;
        l3 l3Var;
        f1 a2;
        if (sq3Var instanceof a) {
            aVar = (a) sq3Var;
            int i2 = aVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.z = i2 - Integer.MIN_VALUE;
                Object obj = aVar.x;
                lu3 lu3Var = lu3.a;
                i = aVar.z;
                if (i != 0) {
                    y6a.M(obj);
                    h = d4.h();
                    if (!this.h.a.b) {
                        j3Var = h;
                        a = ((p) this.f).a();
                        if (a instanceof m) {
                            h.d(((m) a).a);
                        } else if (!(a instanceof n)) {
                            zzl.b();
                            return null;
                        }
                        h.l(j);
                        u3 h2 = v3.h();
                        h2.i();
                        h.q((v3) h2.build());
                        com.moloco.sdk.internal.services.f a3 = this.d.a();
                        if (h0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.f) {
                            h.n((t3) t3.h().build());
                        } else if (h0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e) {
                            n3 i3 = o3.i();
                            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e) h0Var;
                            i3.h(com.facebook.appevents.n.c(eVar.a));
                            b4 h3 = c4.h();
                            h3.h(a3.b);
                            h3.d(a3.d);
                            GeneratedMessageLite build = h3.build();
                            build.getClass();
                            i3.i((c4) build);
                            h hVar = eVar.c;
                            if (hVar != null) {
                                b4 h4 = c4.h();
                                h4.h(hVar.a);
                                h4.d(hVar.b);
                                GeneratedMessageLite build2 = h4.build();
                                build2.getClass();
                                i3.k((c4) build2);
                            }
                            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar = eVar.b;
                            if (gVar != null) {
                                i3.j(com.facebook.appevents.n.c(gVar));
                            }
                            List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d> list = eVar.d;
                            ArrayList arrayList = new ArrayList(k13.r(list, 10));
                            for (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar : list) {
                                k3 h5 = m3.h();
                                switch (d.a[dVar.a.ordinal()]) {
                                    case 1:
                                        l3Var = l3.NONE;
                                        break;
                                    case 2:
                                        l3Var = l3.CLOSE;
                                        break;
                                    case 3:
                                        l3Var = l3.SKIP;
                                        break;
                                    case 4:
                                        l3Var = l3.DEC_SKIP;
                                        break;
                                    case 5:
                                        l3Var = l3.MUTE;
                                        break;
                                    case 6:
                                        l3Var = l3.UNMUTE;
                                        break;
                                    case 7:
                                        l3Var = l3.CTA;
                                        break;
                                    case 8:
                                        l3Var = l3.REPLAY;
                                        break;
                                    case 9:
                                        l3Var = l3.AD_BADGE;
                                        break;
                                    default:
                                        zzl.b();
                                        return null;
                                }
                                h5.i(l3Var);
                                h5.d(com.facebook.appevents.n.c(dVar.b));
                                h hVar2 = dVar.c;
                                hVar2.getClass();
                                b4 h6 = c4.h();
                                h6.h(hVar2.a);
                                h6.d(hVar2.b);
                                GeneratedMessageLite build3 = h6.build();
                                build3.getClass();
                                h5.h((c4) build3);
                                arrayList.add((m3) h5.build());
                            }
                            i3.d(arrayList);
                            h.k((o3) i3.build());
                        } else if (h0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b) {
                            h3 h7 = i3.h();
                            h7.d(((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b) h0Var).a);
                            h.j((i3) h7.build());
                        } else {
                            if (!(h0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a)) {
                                zzl.b();
                                return null;
                            }
                            h.i((g3) g3.h().build());
                        }
                        t a4 = this.a.a();
                        d3 h8 = e3.h();
                        h8.d(a4.a);
                        h8.h(a4.b);
                        h.h((e3) h8.build());
                        c0 a5 = this.c.a();
                        p3 h9 = r3.h();
                        String str = Build.VERSION.RELEASE;
                        h9.j();
                        h9.d(a5.b);
                        h9.i();
                        h9.k(a5.h);
                        h.m((r3) h9.build());
                        a2 = this.b.a();
                        w3 h10 = y3.h();
                        if (a2 instanceof com.moloco.sdk.internal.services.a) {
                            h10.h(x3.CELLULAR);
                            h10.d(((com.moloco.sdk.internal.services.a) a2).a);
                        } else if (a2.equals(com.moloco.sdk.internal.services.b.a)) {
                            h10.h(x3.UNKNOWN);
                        } else {
                            if (!a2.equals(com.moloco.sdk.internal.services.b.b)) {
                                zzl.b();
                                return null;
                            }
                            h10.h(x3.WIFI);
                        }
                        h.p((y3) h10.build());
                        d4 d4Var = (d4) j3Var.build();
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.debug$default(molocoLogger, "CustomUserEventBuilderServiceImpl", "Encoding protobuf UserAdInteractionExt: " + d4Var, false, 4, null);
                        com.moloco.sdk.internal.services.proto.a aVar2 = this.g;
                        d4Var.getClass();
                        aVar2.getClass();
                        String encodeToString = Base64.encodeToString(d4Var.toByteArray(), 10);
                        encodeToString.getClass();
                        MolocoLogger.debug$default(molocoLogger, "CustomUserEventBuilderServiceImpl", "Successfully built userAdInteractionExt as base64 string: ".concat(encodeToString), false, 4, null);
                        return encodeToString;
                    }
                    aVar.r = this;
                    aVar.s = h0Var;
                    aVar.t = h;
                    aVar.u = h;
                    aVar.v = h;
                    aVar.w = j;
                    aVar.z = 1;
                    Object a6 = this.e.a(aVar);
                    if (a6 == lu3Var) {
                        return lu3Var;
                    }
                    h0Var2 = h0Var;
                    j3Var2 = h;
                    j3Var = j3Var2;
                    obj = a6;
                    cVar = this;
                    j3Var3 = j3Var;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = aVar.w;
                    j3Var3 = aVar.v;
                    j3Var2 = aVar.u;
                    j3Var = aVar.t;
                    h0Var2 = aVar.s;
                    cVar = aVar.r;
                    y6a.M(obj);
                }
                j3Var3.o((String) obj);
                h = j3Var2;
                this = cVar;
                h0Var = h0Var2;
                a = ((p) this.f).a();
                if (a instanceof m) {
                }
                h.l(j);
                u3 h22 = v3.h();
                h22.i();
                h.q((v3) h22.build());
                com.moloco.sdk.internal.services.f a32 = this.d.a();
                if (h0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.f) {
                }
                t a42 = this.a.a();
                d3 h82 = e3.h();
                h82.d(a42.a);
                h82.h(a42.b);
                h.h((e3) h82.build());
                c0 a52 = this.c.a();
                p3 h92 = r3.h();
                String str2 = Build.VERSION.RELEASE;
                h92.j();
                h92.d(a52.b);
                h92.i();
                h92.k(a52.h);
                h.m((r3) h92.build());
                a2 = this.b.a();
                w3 h102 = y3.h();
                if (a2 instanceof com.moloco.sdk.internal.services.a) {
                }
                h.p((y3) h102.build());
                d4 d4Var2 = (d4) j3Var.build();
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.debug$default(molocoLogger2, "CustomUserEventBuilderServiceImpl", "Encoding protobuf UserAdInteractionExt: " + d4Var2, false, 4, null);
                com.moloco.sdk.internal.services.proto.a aVar22 = this.g;
                d4Var2.getClass();
                aVar22.getClass();
                String encodeToString2 = Base64.encodeToString(d4Var2.toByteArray(), 10);
                encodeToString2.getClass();
                MolocoLogger.debug$default(molocoLogger2, "CustomUserEventBuilderServiceImpl", "Successfully built userAdInteractionExt as base64 string: ".concat(encodeToString2), false, 4, null);
                return encodeToString2;
            }
        }
        aVar = new a(this, sq3Var);
        Object obj2 = aVar.x;
        lu3 lu3Var2 = lu3.a;
        i = aVar.z;
        if (i != 0) {
        }
        j3Var3.o((String) obj2);
        h = j3Var2;
        this = cVar;
        h0Var = h0Var2;
        a = ((p) this.f).a();
        if (a instanceof m) {
        }
        h.l(j);
        u3 h222 = v3.h();
        h222.i();
        h.q((v3) h222.build());
        com.moloco.sdk.internal.services.f a322 = this.d.a();
        if (h0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.f) {
        }
        t a422 = this.a.a();
        d3 h822 = e3.h();
        h822.d(a422.a);
        h822.h(a422.b);
        h.h((e3) h822.build());
        c0 a522 = this.c.a();
        p3 h922 = r3.h();
        String str22 = Build.VERSION.RELEASE;
        h922.j();
        h922.d(a522.b);
        h922.i();
        h922.k(a522.h);
        h.m((r3) h922.build());
        a2 = this.b.a();
        w3 h1022 = y3.h();
        if (a2 instanceof com.moloco.sdk.internal.services.a) {
        }
        h.p((y3) h1022.build());
        d4 d4Var22 = (d4) j3Var.build();
        MolocoLogger molocoLogger22 = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger22, "CustomUserEventBuilderServiceImpl", "Encoding protobuf UserAdInteractionExt: " + d4Var22, false, 4, null);
        com.moloco.sdk.internal.services.proto.a aVar222 = this.g;
        d4Var22.getClass();
        aVar222.getClass();
        String encodeToString22 = Base64.encodeToString(d4Var22.toByteArray(), 10);
        encodeToString22.getClass();
        MolocoLogger.debug$default(molocoLogger22, "CustomUserEventBuilderServiceImpl", "Successfully built userAdInteractionExt as base64 string: ".concat(encodeToString22), false, 4, null);
        return encodeToString22;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, h0 h0Var, String str, sq3 sq3Var) {
        b bVar;
        int i;
        if (sq3Var instanceof b) {
            bVar = (b) sq3Var;
            int i2 = bVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.u = i2 - Integer.MIN_VALUE;
                Object obj = bVar.s;
                Object obj2 = lu3.a;
                i = bVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (!this.h.a.a) {
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "CustomUserEventBuilderServiceImpl", "Event reporting config disabled, UserAdInteractionExt not reporting", false, 4, null);
                        return str;
                    }
                    bVar.r = str;
                    bVar.u = 1;
                    obj = a(j, h0Var, bVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = bVar.r;
                    y6a.M(obj);
                }
                String uri = Uri.parse(str).buildUpon().appendQueryParameter("user_ad_interaction_ext", (String) obj).build().toString();
                uri.getClass();
                return uri;
            }
        }
        bVar = new b(this, sq3Var);
        Object obj3 = bVar.s;
        Object obj22 = lu3.a;
        i = bVar.u;
        if (i != 0) {
        }
        String uri2 = Uri.parse(str).buildUpon().appendQueryParameter("user_ad_interaction_ext", (String) obj3).build().toString();
        uri2.getClass();
        return uri2;
    }
}
