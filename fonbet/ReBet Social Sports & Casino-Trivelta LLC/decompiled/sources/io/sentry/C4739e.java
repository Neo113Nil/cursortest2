package io.sentry;

import java.util.List;

/* renamed from: io.sentry.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4739e {

    /* renamed from: a, reason: collision with root package name */
    public final String f52021a;

    public C4739e(String str) {
        this.f52021a = str;
    }

    public static C4739e a(C4734d c4734d, List list) {
        String S10 = c4734d.S(C4734d.h(list, true, c4734d.f52015h).r());
        if (S10.isEmpty()) {
            return null;
        }
        return new C4739e(S10);
    }

    public String b() {
        return this.f52021a;
    }
}
