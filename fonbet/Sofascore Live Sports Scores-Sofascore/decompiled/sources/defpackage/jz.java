package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jz {
    public static final jz a = new jz();

    public final void a(@NotNull View view, @Nullable kze kzeVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = kzeVar instanceof k20 ? PointerIcon.getSystemIcon(context, ((k20) kzeVar).b) : PointerIcon.getSystemIcon(context, 1000);
        if (Intrinsics.c(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
