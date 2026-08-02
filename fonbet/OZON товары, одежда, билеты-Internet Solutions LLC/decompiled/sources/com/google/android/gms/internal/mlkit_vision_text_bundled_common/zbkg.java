package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class zbkg {
    private final String zba = "\n";

    private zbkg(String str) {
    }

    public static zbkg zba(String str) {
        return new zbkg("\n");
    }

    static final CharSequence zbc(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String zbb(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb2.append(zbc(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.zba);
                    sb2.append(zbc(it.next()));
                }
            }
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}
