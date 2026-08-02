package org.chromium.base;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes10.dex */
public class StreamUtil {
    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
