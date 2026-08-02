package gf;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class t extends IOException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final EnumC6726b f64462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@NotNull EnumC6726b errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f64462a = errorCode;
    }
}
