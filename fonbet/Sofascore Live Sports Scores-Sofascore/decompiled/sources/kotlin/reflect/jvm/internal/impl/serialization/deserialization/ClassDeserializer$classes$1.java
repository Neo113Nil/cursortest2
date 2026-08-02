package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ClassDeserializer$classes$1 extends xka implements Function1<ClassDeserializer.ClassKey, ClassDescriptor> {
    final /* synthetic */ ClassDeserializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDeserializer$classes$1(ClassDeserializer classDeserializer) {
        super(1);
        this.this$0 = classDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ClassDescriptor invoke(@NotNull ClassDeserializer.ClassKey classKey) {
        ClassDescriptor createClass;
        classKey.getClass();
        createClass = this.this$0.createClass(classKey);
        return createClass;
    }
}
