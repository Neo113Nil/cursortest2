package com.google.firebase.installations;

/* loaded from: classes3.dex */
public class i extends eb.k {

    /* renamed from: a, reason: collision with root package name */
    public final a f37818a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public i(a aVar) {
        this.f37818a = aVar;
    }

    public i(String str, a aVar) {
        super(str);
        this.f37818a = aVar;
    }
}
