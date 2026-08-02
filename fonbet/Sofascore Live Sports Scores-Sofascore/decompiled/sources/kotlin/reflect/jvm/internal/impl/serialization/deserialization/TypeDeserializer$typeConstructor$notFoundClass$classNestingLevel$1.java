package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.duf;
import defpackage.nt8;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 extends nt8 implements Function1<ClassId, ClassId> {
    public static final TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 INSTANCE = new TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1();

    public TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1() {
        super(1);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(ClassId.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ClassId invoke(@NotNull ClassId classId) {
        classId.getClass();
        return classId.getOuterClassId();
    }
}
