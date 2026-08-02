package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0989Ok implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public C0989Ok A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List<C0989Ok> A04;

    public C0989Ok(int i, String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i;
        this.A03 = str;
        this.A02 = str2;
    }

    public C0989Ok(String str) {
        this(0, null, str);
    }

    private void A00(C0989Ok c0989Ok) {
        this.A00 = c0989Ok;
    }

    public final int A01() {
        return this.A01;
    }

    public final C0989Ok A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<C0989Ok> A05() {
        return this.A04;
    }

    public final void A06(C0989Ok c0989Ok) {
        c0989Ok.A00(this);
        this.A04.add(c0989Ok);
    }
}
