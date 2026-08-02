package defpackage;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iz {
    public static final iz a = new iz();

    public final void a(@NotNull View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(@NotNull View view) {
        view.setViewTranslationCallback(hz.a);
    }
}
