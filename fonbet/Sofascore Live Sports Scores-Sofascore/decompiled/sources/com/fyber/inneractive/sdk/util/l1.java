package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l1 implements Comparable {
    public final k1 a;
    public final Uri b;
    public final List c;

    public l1(k1 k1Var, Uri uri, List list) {
        this.a = k1Var;
        this.b = uri;
        this.c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.mPriority.compareTo(((l1) obj).a.mPriority);
    }
}
