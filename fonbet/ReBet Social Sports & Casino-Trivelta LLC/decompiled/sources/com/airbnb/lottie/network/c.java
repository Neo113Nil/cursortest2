package com.airbnb.lottie.network;

/* loaded from: classes.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: a, reason: collision with root package name */
    public final String f28992a;

    c(String str) {
        this.f28992a = str;
    }

    public String b() {
        return ".temp" + this.f28992a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f28992a;
    }
}
