package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class e extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f29691a;

    public e(int i10) {
        this("Http request failed", i10);
    }

    public e(String str, int i10) {
        this(str, i10, null);
    }

    public e(String str, int i10, Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.f29691a = i10;
    }
}
