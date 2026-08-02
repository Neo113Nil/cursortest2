package pb;

import Eb.h;
import android.content.pm.PackageManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PackageManager f80387a;

    public d(@NotNull PackageManager packageManager) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        this.f80387a = packageManager;
    }

    @NotNull
    public final List<String> a() {
        return h.c(this.f80387a);
    }
}
