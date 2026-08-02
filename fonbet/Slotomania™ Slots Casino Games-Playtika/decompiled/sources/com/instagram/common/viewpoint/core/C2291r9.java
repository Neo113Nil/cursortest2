package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2291r9 {
    public final InterfaceC2295rD A00;
    public final String A01;
    public final Collection<C2304rN> A02;
    public final Collection<C2304rN> A03;
    public final List<Rect> A04;

    public C2291r9(String str, InterfaceC2295rD interfaceC2295rD, List<Rect> rects, Collection<C2304rN> collection, Collection<C2304rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2295rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
