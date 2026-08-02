package com.ironsource;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class E4 implements N3 {

    @NotNull
    public static final E4 a = new E4();

    private E4() {
    }

    @Override // com.ironsource.N3
    @NotNull
    public InputStream a(@NotNull String str) {
        str.getClass();
        InputStream openStream = FirebasePerfUrlConnection.openStream(new URL(str));
        openStream.getClass();
        return openStream;
    }
}
