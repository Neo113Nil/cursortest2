package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import defpackage.duf;
import defpackage.nt8;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class ReflectJavaClass$fields$2 extends nt8 implements Function1<Field, ReflectJavaField> {
    public static final ReflectJavaClass$fields$2 INSTANCE = new ReflectJavaClass$fields$2();

    public ReflectJavaClass$fields$2() {
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
        return duf.a.getOrCreateKotlinClass(ReflectJavaField.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final ReflectJavaField invoke(@NotNull Field field) {
        field.getClass();
        return new ReflectJavaField(field);
    }
}
