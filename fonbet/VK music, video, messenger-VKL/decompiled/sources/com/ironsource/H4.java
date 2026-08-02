package com.ironsource;

import java.io.InputStream;
import java.net.URL;

/* loaded from: classes13.dex */
final class H4 implements Q3 {
    public static final H4 a = new H4();

    private H4() {
    }

    @Override // com.ironsource.Q3
    public InputStream a(String str) {
        return new URL(str).openStream();
    }
}
