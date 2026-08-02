package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            r9.b bVar = new r9.b(stringWriter);
            bVar.f22343h = 1;
            com.google.gson.internal.bind.e.f6311z.c(bVar, this);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
