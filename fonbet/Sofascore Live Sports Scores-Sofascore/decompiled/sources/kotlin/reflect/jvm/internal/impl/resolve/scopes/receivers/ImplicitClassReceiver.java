package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    @NotNull
    private final ClassDescriptor classDescriptor;

    @NotNull
    private final ClassDescriptor declarationDescriptor;

    @NotNull
    private final ImplicitClassReceiver original;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor, @Nullable ImplicitClassReceiver implicitClassReceiver) {
        classDescriptor.getClass();
        this.classDescriptor = classDescriptor;
        this.original = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.declarationDescriptor = classDescriptor;
    }

    public boolean equals(@Nullable Object obj) {
        ClassDescriptor classDescriptor = this.classDescriptor;
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.c(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.classDescriptor : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    public final ClassDescriptor getClassDescriptor() {
        return this.classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public SimpleType getType() {
        SimpleType defaultType = this.classDescriptor.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    public int hashCode() {
        return this.classDescriptor.hashCode();
    }

    @NotNull
    public String toString() {
        return "Class{" + getType() + '}';
    }
}
