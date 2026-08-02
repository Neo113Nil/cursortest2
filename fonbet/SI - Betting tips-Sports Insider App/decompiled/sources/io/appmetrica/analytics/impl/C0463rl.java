package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463rl {

    /* renamed from: a, reason: collision with root package name */
    public final Cc f14579a;

    /* renamed from: b, reason: collision with root package name */
    public final Bc f14580b;

    public C0463rl(PublicLogger publicLogger, String str) {
        this(new Cc(str, publicLogger), new Bc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Fc fc2, String str, String str2) {
        try {
            int size = fc2.size();
            int i5 = this.f14579a.f12103c.f14228a;
            if (size >= i5 && (i5 != fc2.size() || !fc2.containsKey(str))) {
                Cc cc2 = this.f14579a;
                cc2.f12104d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", cc2.f12105e, Integer.valueOf(cc2.f12103c.f14228a), str);
                return false;
            }
            this.f14580b.getClass();
            int i10 = fc2.f12223a;
            if (str2 != null) {
                i10 += str2.length();
            }
            if (fc2.containsKey(str)) {
                String str3 = (String) fc2.get(str);
                if (str3 != null) {
                    i10 -= str3.length();
                }
            } else {
                i10 += str.length();
            }
            if (i10 <= 4500) {
                fc2.put(str, str2);
                return true;
            }
            Bc bc2 = this.f14580b;
            bc2.f12051b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", bc2.f12050a, 4500, str);
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean b(Fc fc2, String str, String str2) {
        if (fc2 == null) {
            return false;
        }
        String a7 = this.f14579a.f12101a.a(str);
        String a10 = this.f14579a.f12102b.a(str2);
        if (!fc2.containsKey(a7)) {
            if (a10 != null) {
                return a(fc2, a7, a10);
            }
            return false;
        }
        String str3 = (String) fc2.get(a7);
        if (a10 == null || !a10.equals(str3)) {
            return a(fc2, a7, a10);
        }
        return false;
    }

    public C0463rl(Cc cc2, Bc bc2) {
        this.f14579a = cc2;
        this.f14580b = bc2;
    }
}
