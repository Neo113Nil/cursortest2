package com.vk.movika.sdk.utils;

/* loaded from: classes3.dex */
public abstract class d implements Comparable<d> {
    public final int b;

    public static final class a extends d {
        public static final a c = new a(1);
    }

    public static final class b extends d {
        public static final b c = new b(3);
    }

    public d(int i) {
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        return this.b - dVar.b;
    }
}
