package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hz implements ViewTranslationCallback {
    public static final hz a = new hz();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        view.getClass();
        tz contentCaptureManager$ui = ((xy) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.e = oz.a;
        p6a d = contentCaptureManager$ui.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        x0d x0dVar = ((u3h) objArr[(i << 3) + i3]).a.d.a;
                        Object g = x0dVar.g(w3h.E);
                        if (g == null) {
                            g = null;
                        }
                        if (g != null) {
                            Object g2 = x0dVar.g(k3h.n);
                            m9 m9Var = (m9) (g2 != null ? g2 : null);
                            if (m9Var != null && (function0 = (Function0) m9Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        view.getClass();
        tz contentCaptureManager$ui = ((xy) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.e = oz.a;
        p6a d = contentCaptureManager$ui.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        x0d x0dVar = ((u3h) objArr[(i << 3) + i3]).a.d.a;
                        Object g = x0dVar.g(w3h.E);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.c(g, Boolean.TRUE)) {
                            Object g2 = x0dVar.g(k3h.m);
                            m9 m9Var = (m9) (g2 != null ? g2 : null);
                            if (m9Var != null && (function1 = (Function1) m9Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        view.getClass();
        tz contentCaptureManager$ui = ((xy) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.e = oz.b;
        p6a d = contentCaptureManager$ui.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        x0d x0dVar = ((u3h) objArr[(i << 3) + i3]).a.d.a;
                        Object g = x0dVar.g(w3h.E);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.c(g, Boolean.FALSE)) {
                            Object g2 = x0dVar.g(k3h.m);
                            m9 m9Var = (m9) (g2 != null ? g2 : null);
                            if (m9Var != null && (function1 = (Function1) m9Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
