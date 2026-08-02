package gk0;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class p extends n {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f64553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(int i11, @NotNull Function0<? extends View> creator) {
        super(i11);
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.f64553b = (AbstractC7737t) creator;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<android.view.View>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function0<View> b() {
        return this.f64553b;
    }
}
