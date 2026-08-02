package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.api.C3117a;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f32650a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public C3171d f32651b;

    public H(C3171d c3171d) {
        AbstractC3191o.m(c3171d);
        this.f32651b = c3171d;
    }

    public final int a(Context context, int i10) {
        return this.f32650a.get(i10, -1);
    }

    public final int b(Context context, C3117a.f fVar) {
        AbstractC3191o.m(context);
        AbstractC3191o.m(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int a10 = a(context, minApkVersion);
        if (a10 != -1) {
            return a10;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f32650a.size()) {
                i10 = -1;
                break;
            }
            int keyAt = this.f32650a.keyAt(i11);
            if (keyAt > minApkVersion && this.f32650a.get(keyAt) == 0) {
                break;
            }
            i11++;
        }
        if (i10 == -1) {
            i10 = this.f32651b.j(context, minApkVersion);
        }
        this.f32650a.put(minApkVersion, i10);
        return i10;
    }

    public final void c() {
        this.f32650a.clear();
    }
}
