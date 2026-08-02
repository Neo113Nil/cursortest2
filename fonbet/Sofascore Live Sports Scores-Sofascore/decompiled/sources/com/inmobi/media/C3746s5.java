package com.inmobi.media;

import android.content.Context;
import defpackage.vxd;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.s5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3746s5 {
    public final Context a;
    public final ArrayList b;
    public final int c;
    public final ExecutorService d;

    public C3746s5(Context context, ArrayList arrayList, int i, ExecutorService executorService) {
        arrayList.getClass();
        this.a = context;
        this.b = arrayList;
        this.c = i;
        this.d = executorService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3746s5)) {
            return false;
        }
        C3746s5 c3746s5 = (C3746s5) obj;
        return Intrinsics.c(this.a, c3746s5.a) && Intrinsics.c(this.b, c3746s5.b) && this.c == c3746s5.c && Intrinsics.c(this.d, c3746s5.d);
    }

    public final int hashCode() {
        int a = Ai.a(this.c, vxd.d(this.b, Ai.a(1, (((this.a == null ? 0 : r0.hashCode()) * 31) - 1959053993) * 31, 31), 31), 31);
        ExecutorService executorService = this.d;
        return a + (executorService != null ? executorService.hashCode() : 0);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.a + ", name=com.im_11.3.0.db, version=1, tableInfos=" + this.b + ", journalMode=" + this.c + ", transactionExecutor=" + this.d + ")";
    }
}
