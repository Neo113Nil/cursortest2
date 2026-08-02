package gk0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class o extends n {

    /* renamed from: b, reason: collision with root package name */
    private final int f64551b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f64552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i11, int i12, @NotNull Context context) {
        super(i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f64551b = i11;
        this.f64552c = context;
    }

    @NotNull
    public final Context b() {
        return this.f64552c;
    }

    public final int c() {
        return this.f64551b;
    }
}
