package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface Check {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class DefaultImpls {
        @Nullable
        public static String invoke(@NotNull Check check, @NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            if (check.check(functionDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }

    boolean check(@NotNull FunctionDescriptor functionDescriptor);

    @NotNull
    String getDescription();

    @Nullable
    String invoke(@NotNull FunctionDescriptor functionDescriptor);
}
