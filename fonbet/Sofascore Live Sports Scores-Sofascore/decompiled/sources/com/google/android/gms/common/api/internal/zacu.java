package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import defpackage.o2n;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zacu {
    public static final Status c = new Status(8, "The connection to Google Play services was lost", null, null);
    public final Set a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final o2n b = new o2n(this);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        Set set = this.a;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.g.set(null);
            synchronized (basePendingResult.a) {
                try {
                    if (((GoogleApiClient) basePendingResult.c.get()) != null) {
                        if (!basePendingResult.m) {
                        }
                        synchronized (basePendingResult.a) {
                            z = basePendingResult.k;
                        }
                    }
                    basePendingResult.d();
                    synchronized (basePendingResult.a) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                set.remove(basePendingResult);
            }
        }
    }
}
