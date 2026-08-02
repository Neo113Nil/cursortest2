package pb;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: pb.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8891b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f80382a;

    public C8891b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f80382a = context;
    }

    @NotNull
    public final String a() {
        String packageName = this.f80382a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }
}
