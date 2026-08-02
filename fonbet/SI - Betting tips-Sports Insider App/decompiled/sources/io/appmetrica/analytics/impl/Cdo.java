package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13621c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f13622a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f13623b = 0;

    public Cdo(int[] iArr) {
        for (int i5 : iArr) {
            this.f13622a.put(i5, new HashMap());
        }
    }
}
