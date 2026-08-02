package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class V0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Status f32401c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a, reason: collision with root package name */
    public final Set f32402a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b, reason: collision with root package name */
    public final U0 f32403b = new U0(this);

    public final void a(BasePendingResult basePendingResult) {
        this.f32402a.add(basePendingResult);
        basePendingResult.zan(this.f32403b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f32402a.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.f32402a.remove(basePendingResult);
            }
        }
    }
}
