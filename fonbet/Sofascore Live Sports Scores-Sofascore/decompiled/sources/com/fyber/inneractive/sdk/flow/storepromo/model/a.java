package com.fyber.inneractive.sdk.flow.storepromo.model;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements Comparable {
    public final b a;
    public final String b;
    public final int c;

    public a(String str, b bVar) {
        this.b = str;
        this.a = bVar;
        this.c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.c - ((a) obj).c;
    }

    public a(String str, b bVar, int i) {
        this.b = str;
        this.a = bVar;
        this.c = i;
    }
}
