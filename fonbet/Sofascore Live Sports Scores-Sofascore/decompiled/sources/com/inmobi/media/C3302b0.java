package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.duf;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3302b0 {
    public final WeakReference a;
    public final String b;
    public final boolean c;
    public final AtomicBoolean d;
    public final String e;
    public C3906y9 f;

    public C3302b0(WeakReference weakReference, String str, boolean z) {
        weakReference.getClass();
        str.getClass();
        this.a = weakReference;
        this.b = str;
        this.c = z;
        this.d = new AtomicBoolean(false);
        this.e = String.valueOf(duf.a.getOrCreateKotlinClass(C3302b0.class).getSimpleName());
    }

    public final void a(Fk fk) {
        Xh xh;
        Gk gk;
        AtomicBoolean atomicBoolean;
        if (!this.d.getAndSet(true)) {
            C3605mj c3605mj = C3605mj.a;
            String str = this.b;
            Boolean valueOf = Boolean.valueOf(this.c);
            c3605mj.getClass();
            C3605mj.a(str, valueOf);
            AbstractC3458h1 abstractC3458h1 = (AbstractC3458h1) this.a.get();
            if (abstractC3458h1 != null) {
                abstractC3458h1.a(fk);
            } else if (fk != null) {
                fk.b();
            }
            C3906y9 c3906y9 = this.f;
            if (c3906y9 != null) {
                c3906y9.a(this.e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            C3906y9 c3906y92 = this.f;
            if (c3906y92 == null || (xh = c3906y92.a) == null) {
                return;
            }
            xh.a();
            return;
        }
        C3906y9 c3906y93 = this.f;
        if (c3906y93 != null) {
            c3906y93.c(this.e, "skipping as Impression is already Called");
        }
        if (fk != null) {
            C3742s1 c3742s1 = fk.a;
            if (c3742s1 == null || (gk = c3742s1.b) == null || (atomicBoolean = gk.a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap a = fk.a();
                a.put("networkType", F5.g());
                a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2179);
                String str2 = fk.d;
                if (str2 == null) {
                    str2 = "";
                }
                a.put("impressionId", str2);
                C3839vk c3839vk = C3839vk.a;
                C3839vk.b("AdImpressionSuccessful", a, EnumC3943zk.SDK);
            }
        }
    }
}
