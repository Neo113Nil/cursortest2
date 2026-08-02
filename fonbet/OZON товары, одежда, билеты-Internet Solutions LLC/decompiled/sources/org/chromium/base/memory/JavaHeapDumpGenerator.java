package org.chromium.base.memory;

import Sh.b;
import android.os.Debug;
import android.util.Log;
import internal.org.jni_zero.CalledByNative;
import java.io.IOException;
import org.chromium.base.j;

/* loaded from: classes10.dex */
public final class JavaHeapDumpGenerator {
    private JavaHeapDumpGenerator() {
    }

    @CalledByNative
    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e11) {
            Log.i(j.c("JavaHprofGenerator"), b.c("Error writing to file ", str, ". Error: ", e11.getMessage()));
            return false;
        }
    }
}
