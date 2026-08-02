package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaStaticClassScope$computeMemberIndex$1 extends xka implements Function1<JavaMember, Boolean> {
    public static final LazyJavaStaticClassScope$computeMemberIndex$1 INSTANCE = new LazyJavaStaticClassScope$computeMemberIndex$1();

    public LazyJavaStaticClassScope$computeMemberIndex$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull JavaMember javaMember) {
        javaMember.getClass();
        return Boolean.valueOf(javaMember.isStatic());
    }
}
