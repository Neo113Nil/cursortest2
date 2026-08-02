package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeIntersectionScope$getContributedVariables$1 extends xka implements Function1<PropertyDescriptor, CallableDescriptor> {
    public static final TypeIntersectionScope$getContributedVariables$1 INSTANCE = new TypeIntersectionScope$getContributedVariables$1();

    public TypeIntersectionScope$getContributedVariables$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CallableDescriptor invoke(@NotNull PropertyDescriptor propertyDescriptor) {
        propertyDescriptor.getClass();
        return propertyDescriptor;
    }
}
