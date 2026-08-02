package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ReflectJavaClass$innerClassNames$1 extends xka implements Function1<Class<?>, Boolean> {
    public static final ReflectJavaClass$innerClassNames$1 INSTANCE = new ReflectJavaClass$innerClassNames$1();

    public ReflectJavaClass$innerClassNames$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(Class<?> cls) {
        return Boolean.valueOf(cls.getSimpleName().length() == 0);
    }
}
