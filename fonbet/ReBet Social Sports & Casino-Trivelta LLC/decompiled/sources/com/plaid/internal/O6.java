package com.plaid.internal;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class O6 {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedInputStream f39489a;

    public O6(InputStream inputStream) {
        this.f39489a = new BufferedInputStream(inputStream);
    }

    public final String a() {
        int read;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            read = this.f39489a.read();
            if (read == -1 || read == 10) {
                break;
            }
            if (read != 13) {
                sb2.append((char) read);
            }
        }
        if (read == -1 && sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }
}
