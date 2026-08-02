package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeIntersectionScope$getContributedDescriptors$2 extends xka implements Function1<CallableDescriptor, CallableDescriptor> {
    public static final TypeIntersectionScope$getContributedDescriptors$2 INSTANCE = new TypeIntersectionScope$getContributedDescriptors$2();

    public TypeIntersectionScope$getContributedDescriptors$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CallableDescriptor invoke(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        return callableDescriptor;
    }
}
