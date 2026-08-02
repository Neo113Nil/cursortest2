package defpackage;

import android.os.Trace;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hsj {
    public static final hsj a = new hsj();

    public final void a(@NotNull String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public final void b(@NotNull String str, int i) {
        Trace.endAsyncSection(str, i);
    }
}
