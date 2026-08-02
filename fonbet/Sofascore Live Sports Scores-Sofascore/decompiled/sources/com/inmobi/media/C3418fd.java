package com.inmobi.media;

import android.webkit.URLUtil;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import defpackage.dmi;
import defpackage.duf;
import defpackage.fc6;
import defpackage.km5;
import defpackage.ljg;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.fd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3418fd {
    public final C3858wd a;
    public final InterfaceC3382e3 b;
    public final L4 c;
    public final C3289ad d;
    public final C3392ed e;
    public final InterfaceC3880x9 f;

    public C3418fd(C3858wd c3858wd, InterfaceC3382e3 interfaceC3382e3, L4 l4, C3289ad c3289ad, C3392ed c3392ed, InterfaceC3880x9 interfaceC3880x9) {
        c3858wd.getClass();
        interfaceC3382e3.getClass();
        l4.getClass();
        c3289ad.getClass();
        c3392ed.getClass();
        this.a = c3858wd;
        this.b = interfaceC3382e3;
        this.c = l4;
        this.d = c3289ad;
        this.e = c3392ed;
        this.f = interfaceC3880x9;
    }

    public final void a(short s, String str, List list) {
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            int size = list.size();
            StringBuilder t = dmi.t(s, "processAssetData: assetType=", ", url=", str, ", assetTrackers count=");
            t.append(size);
            ((C3906y9) interfaceC3880x9).a("NativeClickProcessor", t.toString());
        }
        C3392ed c3392ed = this.e;
        c3392ed.getClass();
        ArrayList a = H4.a("click", c3392ed.b.c);
        ArrayList w0 = CollectionsKt.w0(a, list);
        InterfaceC3880x9 interfaceC3880x92 = this.f;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("NativeClickProcessor", dmi.k(a.size(), w0.size(), "Response click trackers count=", ", combined trackers count="));
        }
        if (O3.a(str)) {
            a = w0;
        } else {
            InterfaceC3880x9 interfaceC3880x93 = this.f;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).a("NativeClickProcessor", "URL is not a network URL, using main link from response");
            }
            MainLink mainLink = this.e.b.b;
            str = mainLink != null ? mainLink.getUrl() : null;
            MainLink mainLink2 = this.e.b.b;
            r4 = mainLink2 != null ? mainLink2.getFallbackUrl() : null;
            InterfaceC3880x9 interfaceC3880x94 = this.f;
            if (interfaceC3880x94 != null) {
                ((C3906y9) interfaceC3880x94).a("NativeClickProcessor", fc6.n("Main link URL=", str, ", fallbackUrl=", r4));
            }
        }
        InterfaceC3880x9 interfaceC3880x95 = this.f;
        if (str == null) {
            if (interfaceC3880x95 != null) {
                ((C3906y9) interfaceC3880x95).a("NativeClickProcessor", "Final URL is null, skipping click processing");
            }
        } else {
            if (interfaceC3880x95 != null) {
                ((C3906y9) interfaceC3880x95).a("NativeClickProcessor", fc6.h(a.size(), " beacons", mz1.s("Handling click: finalUrl=", str, ", fallbackUrl=", r4, ", firing ")));
            }
            this.a.b(str, r4);
            this.d.a(s, a);
        }
    }

    public final void b(short s) {
        List list;
        C3392ed c3392ed = this.e;
        Kl kl = c3392ed.a;
        ArrayList arrayList = null;
        String str = kl != null ? kl.a : null;
        List a = AbstractC3367dd.a(c3392ed);
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            int size = a.size();
            StringBuilder t = dmi.t(s, "processNativeAssetClick: assetId=", ", VAST clickThroughUrl=", str, ", VAST trackers count=");
            t.append(size);
            ((C3906y9) interfaceC3880x9).a("NativeClickProcessor", t.toString());
        }
        if (!O3.a(str)) {
            InterfaceC3880x9 interfaceC3880x92 = this.f;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("NativeClickProcessor", "VAST URL is not a network URL, using response asset click URL");
            }
            C3392ed c3392ed2 = this.e;
            c3392ed2.getClass();
            Xc xc = (Xc) c3392ed2.b.a.get(Short.valueOf(s));
            str = xc != null ? xc.a : null;
            C3392ed c3392ed3 = this.e;
            c3392ed3.getClass();
            Xc xc2 = (Xc) c3392ed3.b.a.get(Short.valueOf(s));
            if (xc2 != null && (list = xc2.b) != null) {
                arrayList = H4.a("click", list);
            }
            a = arrayList == null ? km5.a : arrayList;
            InterfaceC3880x9 interfaceC3880x93 = this.f;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).a("NativeClickProcessor", dmi.l(a.size(), "Response asset URL=", str, ", trackers count="));
            }
        }
        a((short) 0, str, a);
    }

    public final void b() {
        C3392ed c3392ed = this.e;
        Kl kl = c3392ed.a;
        String str = kl != null ? kl.a : null;
        List a = AbstractC3367dd.a(c3392ed);
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("NativeClickProcessor", dmi.l(a.size(), "processVideoClickEvent: VAST clickThroughUrl=", str, ", trackers count="));
        }
        a((short) 0, str, a);
    }

    public final void a(AbstractC3650oc abstractC3650oc) {
        abstractC3650oc.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("NativeClickProcessor", "processIfMediaClickEvent: mediaEvent type=" + duf.a.getOrCreateKotlinClass(abstractC3650oc.getClass()).getSimpleName() + ", isClickEvent=" + ((abstractC3650oc instanceof Hj) || (abstractC3650oc instanceof C3634nm) || (abstractC3650oc instanceof Y3)));
        }
        abstractC3650oc.getClass();
        boolean z = abstractC3650oc instanceof Hj;
        if (z || (abstractC3650oc instanceof C3634nm) || (abstractC3650oc instanceof Y3)) {
            InterfaceC3880x9 interfaceC3880x92 = this.f;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("NativeClickProcessor", "Media click event detected, tracking user interaction");
            }
            this.c.f();
            ((AbstractC3406f1) this.b).a(InteractionType.CLICK);
            if (z) {
                InterfaceC3880x9 interfaceC3880x93 = this.f;
                if (interfaceC3880x93 != null) {
                    ((C3906y9) interfaceC3880x93).a("NativeClickProcessor", "Processing StaticClick event");
                }
                a((Hj) abstractC3650oc);
                return;
            }
            if (abstractC3650oc instanceof C3634nm) {
                InterfaceC3880x9 interfaceC3880x94 = this.f;
                if (interfaceC3880x94 != null) {
                    ((C3906y9) interfaceC3880x94).a("NativeClickProcessor", "Processing VideoClick event");
                }
                b();
                return;
            }
            boolean z2 = abstractC3650oc instanceof Y3;
            InterfaceC3880x9 interfaceC3880x95 = this.f;
            if (z2) {
                if (interfaceC3880x95 != null) {
                    ((C3906y9) interfaceC3880x95).a("NativeClickProcessor", "Processing CompanionClick event");
                }
                a((Y3) abstractC3650oc);
            } else if (interfaceC3880x95 != null) {
                ((C3906y9) interfaceC3880x95).a("NativeClickProcessor", "Unknown media event type, ignoring");
            }
        }
    }

    public final void a() {
        C3392ed c3392ed = this.e;
        c3392ed.getClass();
        Xc xc = (Xc) c3392ed.b.a.get((short) 7);
        String str = xc != null ? xc.a : null;
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("NativeClickProcessor", "processAdChoiceAssetClick: url=" + str + ", isNetworkUrl=" + (str != null ? Boolean.valueOf(URLUtil.isNetworkUrl(str)) : null));
        }
        if (str != null && URLUtil.isNetworkUrl(str)) {
            this.a.b(str, null);
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.f;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("NativeClickProcessor", "AdChoice URL is null or not a network URL, skipping");
        }
    }

    public final void a(Hj hj) {
        C3392ed c3392ed = this.e;
        Kl kl = c3392ed.a;
        String str = kl != null ? kl.a : null;
        List a = AbstractC3367dd.a(c3392ed);
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("NativeClickProcessor", dmi.q("processStaticClickEvent: VAST clickThroughUrl=", str));
        }
        List list = a;
        if (!O3.a(str)) {
            InterfaceC3880x9 interfaceC3880x92 = this.f;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("NativeClickProcessor", "VAST URL is not a network URL, using static click URL");
            }
            str = hj.a;
            ArrayList arrayList = hj.b;
            InterfaceC3880x9 interfaceC3880x93 = this.f;
            list = arrayList;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).a("NativeClickProcessor", dmi.l(arrayList.size(), "Static click URL=", str, ", trackers count="));
                list = arrayList;
            }
        }
        a((short) 0, str, list);
    }

    public final void a(Y3 y3) {
        Kl kl = this.e.a;
        String str = kl != null ? kl.a : null;
        ArrayList arrayList = y3.a;
        boolean isEmpty = arrayList.isEmpty();
        List list = arrayList;
        if (isEmpty) {
            list = AbstractC3367dd.a(this.e);
        }
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            int size = y3.a.size();
            boolean isEmpty2 = y3.a.isEmpty();
            StringBuilder q = mz1.q(size, "processCompanionClick: VAST clickThroughUrl=", str, ", companion trackers count=", ", using VAST trackers=");
            q.append(isEmpty2);
            ((C3906y9) interfaceC3880x9).a("NativeClickProcessor", q.toString());
        }
        a((short) 1, str, list);
    }

    public final void a(short s) {
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("NativeClickProcessor", ljg.j(s, "onAssetClickEvent: assetType="));
        }
        InterfaceC3880x9 interfaceC3880x92 = this.f;
        if (s == 7) {
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("NativeClickProcessor", "Processing AD_CHOICE asset click");
            }
            a();
            return;
        }
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("NativeClickProcessor", "Processing native asset click, tracking user interaction");
        }
        this.c.f();
        ((AbstractC3406f1) this.b).a(InteractionType.CLICK);
        b(s);
    }
}
