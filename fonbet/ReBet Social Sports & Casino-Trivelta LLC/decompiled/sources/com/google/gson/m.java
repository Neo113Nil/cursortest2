package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes3.dex */
public final class m {
    public static h b(Jb.a aVar) {
        boolean w02 = aVar.w0();
        aVar.q(true);
        try {
            try {
                return com.google.gson.internal.l.a(aVar);
            } catch (OutOfMemoryError e10) {
                throw new l("Failed parsing JSON source: " + aVar + " to Json", e10);
            } catch (StackOverflowError e11) {
                throw new l("Failed parsing JSON source: " + aVar + " to Json", e11);
            }
        } finally {
            aVar.q(w02);
        }
    }

    public static h c(Reader reader) {
        try {
            Jb.a aVar = new Jb.a(reader);
            h b10 = b(aVar);
            if (!b10.j() && aVar.Y1() != Jb.b.END_DOCUMENT) {
                throw new q("Did not consume the entire document.");
            }
            return b10;
        } catch (Jb.d e10) {
            throw new q(e10);
        } catch (IOException e11) {
            throw new i(e11);
        } catch (NumberFormatException e12) {
            throw new q(e12);
        }
    }

    public static h d(String str) {
        return c(new StringReader(str));
    }

    public h a(String str) {
        return d(str);
    }
}
