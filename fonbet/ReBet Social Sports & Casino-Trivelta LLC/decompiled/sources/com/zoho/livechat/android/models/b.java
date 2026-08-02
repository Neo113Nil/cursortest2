package com.zoho.livechat.android.models;

/* loaded from: classes4.dex */
public class b implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public String f42504a;

    /* renamed from: b, reason: collision with root package name */
    public String f42505b;

    public b(String str, String str2) {
        this.f42504a = str;
        this.f42505b = str2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        return c().compareTo(bVar.c());
    }

    public String b() {
        return this.f42504a;
    }

    public String c() {
        return this.f42505b;
    }
}
