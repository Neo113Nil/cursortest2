package io.seon.androidsdk.service;

import java.util.Locale;

/* renamed from: io.seon.androidsdk.service.o2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4993o2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f53454a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53455b;

    /* renamed from: c, reason: collision with root package name */
    public C5009q2 f53456c = null;

    /* renamed from: d, reason: collision with root package name */
    public Long f53457d = null;

    public C4993o2(String str, String str2) {
        this.f53454a = str;
        this.f53455b = str2;
    }

    public final String toString() {
        try {
            return String.format(Locale.ENGLISH, "%s;%s;%s;%s", this.f53454a, this.f53455b, this.f53456c, this.f53457d);
        } catch (Throwable unused) {
            return "";
        }
    }
}
