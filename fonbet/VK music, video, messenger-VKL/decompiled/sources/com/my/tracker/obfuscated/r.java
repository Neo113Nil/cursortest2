package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.s0;
import java.io.OutputStream;
import ru.ok.android.commons.http.Http;

/* loaded from: classes.dex */
public class r implements s0.a {
    private final q a;

    public r(q qVar) {
        this.a = qVar;
    }

    @Override // com.my.tracker.obfuscated.s0.a
    public String a() {
        return Http.ContentType.APPLICATION_OCTET_STREAM;
    }

    @Override // com.my.tracker.obfuscated.s0.a
    public void a(OutputStream outputStream) {
        this.a.a(outputStream);
    }
}
