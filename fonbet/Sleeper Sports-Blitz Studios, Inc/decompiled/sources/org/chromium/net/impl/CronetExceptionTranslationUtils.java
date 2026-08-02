package org.chromium.net.impl;

import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import retrofit2.Reflection$Java8$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes10.dex */
class CronetExceptionTranslationUtils {

    interface CronetWork<T, E extends Exception> {
        T run() throws Exception;
    }

    public static <T, E extends Exception> T executeTranslatingCronetExceptions(CronetWork<T, E> work, Class<E> nonCronetException) throws CronetException, Exception {
        try {
            return work.run();
        } catch (Exception e) {
            if (isUncheckedAndroidCronetException(e)) {
                throw translateUncheckedAndroidCronetException(e);
            }
            if (isCheckedAndroidCronetException(e)) {
                throw translateCheckedAndroidCronetException(e);
            }
            if (nonCronetException.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static boolean isUncheckedAndroidCronetException(Exception e) {
        return Reflection$Java8$$ExternalSyntheticApiModelOutline0.m$1(e);
    }

    public static boolean isCheckedAndroidCronetException(Exception e) {
        return Reflection$Java8$$ExternalSyntheticApiModelOutline0.m$3(e);
    }

    public static RuntimeException translateUncheckedAndroidCronetException(Exception e) {
        if (!isUncheckedAndroidCronetException(e)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", e);
        }
        if (Reflection$Java8$$ExternalSyntheticApiModelOutline0.m$1(e)) {
            InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
            inlineExecutionProhibitedException.initCause(e);
            return inlineExecutionProhibitedException;
        }
        throw new UnsupportedOperationException("Unchecked exception translation discrepancy", e);
    }

    public static CronetException translateCheckedAndroidCronetException(Exception e) {
        if (!isCheckedAndroidCronetException(e)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", e);
        }
        if (Reflection$Java8$$ExternalSyntheticApiModelOutline0.m15661m((Object) e)) {
            return new AndroidQuicExceptionWrapper(Reflection$Java8$$ExternalSyntheticApiModelOutline0.m15648m((Object) e));
        }
        if (Util$$ExternalSyntheticApiModelOutline0.m$1(e)) {
            return new AndroidNetworkExceptionWrapper(Util$$ExternalSyntheticApiModelOutline0.m9349m((Object) e));
        }
        if (Reflection$Java8$$ExternalSyntheticApiModelOutline0.m$2(e)) {
            return new AndroidCallbackExceptionWrapper(Reflection$Java8$$ExternalSyntheticApiModelOutline0.m((Object) e));
        }
        if (Reflection$Java8$$ExternalSyntheticApiModelOutline0.m$3(e)) {
            return new AndroidHttpExceptionWrapper(Reflection$Java8$$ExternalSyntheticApiModelOutline0.m15647m((Object) e));
        }
        throw new UnsupportedOperationException("Checked exception translation discrepancy", e);
    }

    private CronetExceptionTranslationUtils() {
    }
}
