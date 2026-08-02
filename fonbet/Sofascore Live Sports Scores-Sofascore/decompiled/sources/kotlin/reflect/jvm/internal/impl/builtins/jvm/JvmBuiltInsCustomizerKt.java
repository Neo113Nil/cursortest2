package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltInsCustomizerKt {

    @NotNull
    private static final Name GET_FIRST_LIST_NAME;

    @NotNull
    private static final Name GET_LAST_LIST_NAME;

    static {
        Name identifier = Name.identifier("getFirst");
        identifier.getClass();
        GET_FIRST_LIST_NAME = identifier;
        Name identifier2 = Name.identifier("getLast");
        identifier2.getClass();
        GET_LAST_LIST_NAME = identifier2;
    }
}
