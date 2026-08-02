package com.inmobi.media;

import android.media.MediaPlayer;
import android.webkit.URLUtil;
import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.AbstractC3583ln;
import defpackage.a70;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.lj2;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.oed;
import defpackage.p2g;
import defpackage.sq3;
import defpackage.u2g;
import defpackage.vcc;
import defpackage.vg6;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.z9a;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ln, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3583ln {
    /* JADX WARN: Removed duplicated region for block: B:12:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x014c -> B:10:0x0155). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ExoPlayer exoPlayer, ArrayList arrayList, InterfaceC3880x9 interfaceC3880x9, P2 p2, boolean z, sq3 sq3Var) {
        C3428fn c3428fn;
        int i;
        P2 p22;
        boolean z2;
        Iterator it;
        int i2;
        ExoPlayer exoPlayer2;
        C3428fn c3428fn2;
        InterfaceC3880x9 interfaceC3880x92;
        Object u2gVar;
        if (sq3Var instanceof C3428fn) {
            c3428fn = (C3428fn) sq3Var;
            int i3 = c3428fn.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3428fn.j = i3 - Integer.MIN_VALUE;
                Object obj = c3428fn.i;
                lu3 lu3Var = lu3.a;
                i = c3428fn.j;
                if (i != 0) {
                    y6a.M(obj);
                    if (arrayList.isEmpty()) {
                        if (interfaceC3880x9 != null) {
                            ((C3906y9) interfaceC3880x9).b("VideoLoaderHelper", "No URLs provided to load media");
                        }
                        return new C3542k8(Zm.NO_URL_FOUND);
                    }
                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = S0.iterator();
                    while (true) {
                        boolean z3 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        String str = (String) next;
                        if (!StringsKt.R(str) && URLUtil.isNetworkUrl(str)) {
                            try {
                                p2g p2gVar = w2g.b;
                                u2gVar = new URI(str);
                            } catch (Throwable th) {
                                p2g p2gVar2 = w2g.b;
                                u2gVar = new u2g(th);
                            }
                            z3 = !(u2gVar instanceof u2g);
                        }
                        if (z3) {
                            arrayList2.add(next);
                        }
                    }
                    if (arrayList2.size() != arrayList.size() && interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).a("VideoLoaderHelper", "Filtered invalid or duplicate URLs. Valid set: " + arrayList2);
                    }
                    if (arrayList2.isEmpty()) {
                        if (interfaceC3880x9 != null) {
                            ((C3906y9) interfaceC3880x9).b("VideoLoaderHelper", "All provided URLs were invalid or non-network");
                        }
                        return new C3542k8(Zm.MALFORMED_URL);
                    }
                    if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).a("VideoLoaderHelper", "Attempting to load media from URLs: " + arrayList2);
                    }
                    Iterator it3 = arrayList2.iterator();
                    p22 = p2;
                    z2 = z;
                    it = it3;
                    i2 = 0;
                    exoPlayer2 = exoPlayer;
                    c3428fn2 = c3428fn;
                    interfaceC3880x92 = interfaceC3880x9;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = c3428fn.h;
                    int i5 = c3428fn.g;
                    boolean z4 = c3428fn.f;
                    String str2 = c3428fn.e;
                    it = c3428fn.d;
                    P2 p23 = c3428fn.c;
                    InterfaceC3880x9 interfaceC3880x93 = c3428fn.b;
                    ExoPlayer exoPlayer3 = c3428fn.a;
                    y6a.M(obj);
                    c3428fn2 = c3428fn;
                    interfaceC3880x92 = interfaceC3880x93;
                    int i6 = i5;
                    z2 = z4;
                    AbstractC3594m8 abstractC3594m8 = (AbstractC3594m8) obj;
                    if (abstractC3594m8 instanceof C3620n8) {
                        if (interfaceC3880x92 != null) {
                            ((C3906y9) interfaceC3880x92).b("VideoLoaderHelper", "Failed to load media from URL (" + i4 + "): " + str2);
                        }
                        p22 = p23;
                        i2 = i6;
                        exoPlayer2 = exoPlayer3;
                        if (it.hasNext()) {
                            InterfaceC3880x9 interfaceC3880x94 = interfaceC3880x92;
                            if (interfaceC3880x94 != null) {
                                ((C3906y9) interfaceC3880x94).b("VideoLoaderHelper", "All URLs failed to load");
                            }
                            return new C3542k8(Zm.NETWORK);
                        }
                        Object next2 = it.next();
                        i6 = i2 + 1;
                        if (i2 < 0) {
                            kotlin.collections.b.q();
                            throw null;
                        }
                        String str3 = (String) next2;
                        c3428fn2.a = exoPlayer2;
                        c3428fn2.b = interfaceC3880x92;
                        c3428fn2.c = p22;
                        c3428fn2.d = it;
                        c3428fn2.e = str3;
                        c3428fn2.f = z2;
                        c3428fn2.g = i6;
                        c3428fn2.h = i2;
                        c3428fn2.j = 1;
                        ExoPlayer exoPlayer4 = exoPlayer2;
                        InterfaceC3880x9 interfaceC3880x95 = interfaceC3880x92;
                        P2 p24 = p22;
                        boolean z5 = z2;
                        C3428fn c3428fn3 = c3428fn2;
                        obj = a(exoPlayer4, str3, interfaceC3880x95, p24, z5, c3428fn3);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        int i7 = i2;
                        str2 = str3;
                        interfaceC3880x92 = interfaceC3880x95;
                        i4 = i7;
                        exoPlayer3 = exoPlayer4;
                        z2 = z5;
                        p23 = p24;
                        c3428fn2 = c3428fn3;
                        AbstractC3594m8 abstractC3594m82 = (AbstractC3594m8) obj;
                        if (abstractC3594m82 instanceof C3620n8) {
                            if (interfaceC3880x92 != null) {
                                ((C3906y9) interfaceC3880x92).a("VideoLoaderHelper", dmi.q("Successfully loaded media from URL: ", str2));
                            }
                            return abstractC3594m82;
                        }
                    }
                }
            }
        }
        c3428fn = new C3428fn(sq3Var);
        Object obj2 = c3428fn.i;
        lu3 lu3Var2 = lu3.a;
        i = c3428fn.j;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.inmobi.media.x9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:10:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(MediaPlayer mediaPlayer, ArrayList arrayList, C3906y9 c3906y9, sq3 sq3Var) {
        C3402en c3402en;
        int i;
        Iterator it;
        C3906y9 c3906y92;
        if (sq3Var instanceof C3402en) {
            c3402en = (C3402en) sq3Var;
            int i2 = c3402en.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3402en.f = i2 - Integer.MIN_VALUE;
                Object obj = c3402en.e;
                lu3 lu3Var = lu3.a;
                i = c3402en.f;
                if (i != 0) {
                    y6a.M(obj);
                    a(mediaPlayer, c3906y9);
                    it = arrayList.iterator();
                    c3906y92 = c3906y9;
                    while (it.hasNext()) {
                    }
                    return Ym.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str = c3402en.d;
                it = c3402en.c;
                ?? r9 = c3402en.b;
                MediaPlayer mediaPlayer2 = c3402en.a;
                y6a.M(obj);
                C3906y9 c3906y93 = r9;
                if (!((Boolean) obj).booleanValue()) {
                    return new C3351cn(str);
                }
                mediaPlayer = mediaPlayer2;
                c3906y92 = c3906y93;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (URLUtil.isNetworkUrl(str2)) {
                        if (c3906y92 != null) {
                            c3906y92.a("VideoLoaderHelper", dmi.q("Video Loading for URL: ", str2));
                        }
                        mediaPlayer.reset();
                        c3402en.a = mediaPlayer;
                        c3402en.b = c3906y92;
                        c3402en.c = it;
                        c3402en.d = str2;
                        c3402en.f = 1;
                        Object a = a(mediaPlayer, str2, c3906y92, c3402en);
                        if (a == lu3Var) {
                            return lu3Var;
                        }
                        mediaPlayer2 = mediaPlayer;
                        str = str2;
                        obj = a;
                        c3906y93 = c3906y92;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                }
                return Ym.a;
            }
        }
        c3402en = new C3402en(sq3Var);
        Object obj2 = c3402en.e;
        lu3 lu3Var2 = lu3.a;
        i = c3402en.f;
        if (i != 0) {
        }
    }

    public static final void a(MediaPlayer mediaPlayer, final C3906y9 c3906y9) {
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: com
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i) {
                AbstractC3583ln.a(c3906y9, mediaPlayer2, i);
            }
        });
    }

    public static final void a(InterfaceC3880x9 interfaceC3880x9, MediaPlayer mediaPlayer, int i) {
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("VideoLoaderHelper", ljg.j(i, "Buffering Percentage: "));
        }
    }

    public static final Object a(MediaPlayer mediaPlayer, String str, InterfaceC3880x9 interfaceC3880x9, C3402en c3402en) {
        lj2 lj2Var = new lj2(1, z9a.b(c3402en));
        lj2Var.t();
        lj2Var.v(new C3454gn(mediaPlayer));
        try {
            mediaPlayer.setOnPreparedListener(new C3480hn(interfaceC3880x9, str, lj2Var));
            mediaPlayer.setOnErrorListener(new C3505in(interfaceC3880x9, str, lj2Var));
            mediaPlayer.setDataSource(str);
            mediaPlayer.prepareAsync();
        } catch (IOException e) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("VideoLoaderHelper", dmi.q("Video Load Exception: ", e.getMessage()));
            }
            X4.a(lj2Var, Boolean.FALSE);
        } catch (IllegalStateException e2) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("VideoLoaderHelper", dmi.q("Video Load Exception: ", e2.getMessage()));
            }
            X4.a(lj2Var, Boolean.FALSE);
        }
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public static final Object a(ExoPlayer exoPlayer, String str, InterfaceC3880x9 interfaceC3880x9, P2 p2, boolean z, C3428fn c3428fn) {
        lj2 lj2Var = new lj2(1, z9a.b(c3428fn));
        lj2Var.t();
        C3557kn c3557kn = new C3557kn(lj2Var, p2, str, interfaceC3880x9, exoPlayer);
        lj2Var.v(new C3531jn(exoPlayer, c3557kn));
        if (interfaceC3880x9 != null) {
            try {
                ((C3906y9) interfaceC3880x9).a("VideoLoaderHelper", "Trying URL with cache " + z + ": " + str);
            } catch (Exception e) {
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).b("VideoLoaderHelper", fc6.n("Exception during media source preparation for URL (", str, "): ", e.getMessage()));
                }
                vg6 vg6Var = (vg6) exoPlayer;
                vg6Var.z(c3557kn);
                if (lj2Var.r() instanceof oed) {
                    X4.a(lj2Var, new C3542k8(Zm.UNKNOWN));
                }
                vg6Var.stop();
                vg6Var.t();
            }
        }
        vcc a = p2.a(str, z);
        ((vg6) exoPlayer).m.a(c3557kn);
        vg6 vg6Var2 = (vg6) exoPlayer;
        vg6Var2.j0();
        List singletonList = Collections.singletonList(a);
        vg6Var2.j0();
        vg6Var2.j0();
        vg6Var2.a0(singletonList, true, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -1);
        vg6Var2.a();
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }
}
