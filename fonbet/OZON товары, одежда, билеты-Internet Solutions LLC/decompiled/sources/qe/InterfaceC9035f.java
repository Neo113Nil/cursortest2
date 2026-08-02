package qe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qe.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9035f {

    /* renamed from: qe.f$a */
    public static final class a {
        public static String a(@NotNull InterfaceC9035f interfaceC9035f, @NotNull Ed.e functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            if (interfaceC9035f.a(functionDescriptor)) {
                return null;
            }
            return interfaceC9035f.getDescription();
        }
    }

    boolean a(@NotNull Ed.e eVar);

    String b(@NotNull Ed.e eVar);

    @NotNull
    String getDescription();
}
