package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28820a;

    /* renamed from: b, reason: collision with root package name */
    public final List f28821b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28822c;

    public q(String str, List list, boolean z10) {
        this.f28820a = str;
        this.f28821b = list;
        this.f28822c = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.d(k10, bVar, this, c2940j);
    }

    public List b() {
        return this.f28821b;
    }

    public String c() {
        return this.f28820a;
    }

    public boolean d() {
        return this.f28822c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f28820a + "' Shapes: " + Arrays.toString(this.f28821b.toArray()) + '}';
    }
}
