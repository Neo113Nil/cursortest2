package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import defpackage.joa;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    @NotNull
    private final Map<Name, ConstantValue<?>> allValueArguments;

    @NotNull
    private final KotlinBuiltIns builtIns;
    private final boolean forcePropagationDeprecationToOverrides;

    @NotNull
    private final FqName fqName;

    @NotNull
    private final joa type$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull FqName fqName, @NotNull Map<Name, ? extends ConstantValue<?>> map, boolean z) {
        kotlinBuiltIns.getClass();
        fqName.getClass();
        map.getClass();
        this.builtIns = kotlinBuiltIns;
        this.fqName = fqName;
        this.allValueArguments = map;
        this.forcePropagationDeprecationToOverrides = z;
        this.type$delegate = ypa.a(ysa.b, new BuiltInAnnotationDescriptor$type$2(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return this.allValueArguments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        sourceElement.getClass();
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        Object value = this.type$delegate.getValue();
        value.getClass();
        return (KotlinType) value;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i & 8) != 0 ? false : z);
    }
}
