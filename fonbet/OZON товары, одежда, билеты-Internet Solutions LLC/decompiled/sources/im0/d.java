package im0;

import Sc.o;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gm0.C6752a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d {
    @NotNull
    public static final c a(@NotNull C6752a c6752a, @NotNull km0.d downStream, jm0.b bVar) {
        Intrinsics.checkNotNullParameter(c6752a, "<this>");
        Intrinsics.checkNotNullParameter(downStream, "downstream");
        if (c6752a == null) {
            throw new o();
        }
        c6752a.getClass();
        Intrinsics.checkNotNullParameter(downStream, "downStream");
        return new C7091a(downStream, UserVerificationMethods.USER_VERIFY_PATTERN, bVar);
    }
}
