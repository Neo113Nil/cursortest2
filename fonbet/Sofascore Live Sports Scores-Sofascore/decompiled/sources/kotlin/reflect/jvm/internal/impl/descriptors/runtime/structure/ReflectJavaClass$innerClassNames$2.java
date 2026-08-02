package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ReflectJavaClass$innerClassNames$2 extends xka implements Function1<Class<?>, Name> {
    public static final ReflectJavaClass$innerClassNames$2 INSTANCE = new ReflectJavaClass$innerClassNames$2();

    public ReflectJavaClass$innerClassNames$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Name invoke(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (!Name.isValidIdentifier(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.identifier(simpleName);
        }
        return null;
    }
}
