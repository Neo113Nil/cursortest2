package kotlin.reflect.jvm.internal.impl.types.error;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ErrorModuleDescriptor$builtIns$2 extends xka implements Function0<DefaultBuiltIns> {
    public static final ErrorModuleDescriptor$builtIns$2 INSTANCE = new ErrorModuleDescriptor$builtIns$2();

    public ErrorModuleDescriptor$builtIns$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DefaultBuiltIns invoke() {
        return DefaultBuiltIns.Companion.getInstance();
    }
}
