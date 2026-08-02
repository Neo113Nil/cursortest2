package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import defpackage.duf;
import defpackage.nt8;
import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class ReflectJavaClass$constructors$2 extends nt8 implements Function1<Constructor<?>, ReflectJavaConstructor> {
    public static final ReflectJavaClass$constructors$2 INSTANCE = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(ReflectJavaConstructor.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final ReflectJavaConstructor invoke(@NotNull Constructor<?> constructor) {
        constructor.getClass();
        return new ReflectJavaConstructor(constructor);
    }
}
