package io.seon.androidsdk.service;

import java.util.HashMap;
import java.util.List;

/* renamed from: io.seon.androidsdk.service.q2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5009q2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f53469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53470b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53471c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f53472d;

    /* renamed from: e, reason: collision with root package name */
    public final List f53473e = C4890b3.C();

    public C5009q2(String str, String str2, String str3, Boolean bool) {
        this.f53469a = str;
        this.f53470b = str2;
        this.f53471c = str3;
        this.f53472d = bool;
    }

    public final HashMap a() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("inst", this.f53469a);
            hashMap.put("init", this.f53470b);
            hashMap.put("orig", this.f53471c);
            hashMap.put("sign", !this.f53473e.contains(this.f53471c) ? this.f53471c : !this.f53473e.contains(this.f53470b) ? this.f53470b : this.f53469a);
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        try {
            return !this.f53473e.contains(this.f53471c) ? this.f53471c : !this.f53473e.contains(this.f53470b) ? this.f53470b : this.f53469a;
        } catch (Throwable unused) {
            return "";
        }
    }
}
