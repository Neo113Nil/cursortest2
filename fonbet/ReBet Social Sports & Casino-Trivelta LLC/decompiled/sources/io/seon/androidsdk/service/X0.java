package io.seon.androidsdk.service;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f53198a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53199b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53200c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f53201d = new ArrayList();

    public X0(int i10, int i11, float[] fArr, int i12) {
        this.f53198a = i10;
        this.f53199b = i11;
        for (float f10 : fArr) {
            this.f53201d.add(Float.valueOf(f10));
        }
        this.f53200c = i12;
    }
}
