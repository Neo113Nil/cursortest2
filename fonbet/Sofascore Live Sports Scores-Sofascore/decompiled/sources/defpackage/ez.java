package defpackage;

import android.view.View;
import android.view.ViewStructure;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ez {
    public static final ez a = new ez();

    public final void a(@NotNull ViewStructure viewStructure, @NotNull View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
