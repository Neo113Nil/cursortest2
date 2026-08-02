package kotlin.reflect.jvm.internal.impl.types;

import defpackage.k13;
import defpackage.tub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeAliasExpansion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final List<TypeProjection> arguments;

    @NotNull
    private final TypeAliasDescriptor descriptor;

    @NotNull
    private final Map<TypeParameterDescriptor, TypeProjection> mapping;

    @Nullable
    private final TypeAliasExpansion parent;

    /* JADX WARN: Multi-variable type inference failed */
    private TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> list, Map<TypeParameterDescriptor, ? extends TypeProjection> map) {
        this.parent = typeAliasExpansion;
        this.descriptor = typeAliasDescriptor;
        this.arguments = list;
        this.mapping = map;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.arguments;
    }

    @NotNull
    public final TypeAliasDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Nullable
    public final TypeProjection getReplacement(@NotNull TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        ClassifierDescriptor mo893getDeclarationDescriptor = typeConstructor.mo893getDeclarationDescriptor();
        if (mo893getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return this.mapping.get(mo893getDeclarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(@NotNull TypeAliasDescriptor typeAliasDescriptor) {
        typeAliasDescriptor.getClass();
        if (Intrinsics.c(this.descriptor, typeAliasDescriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.parent;
        return typeAliasExpansion != null ? typeAliasExpansion.isRecursion(typeAliasDescriptor) : false;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TypeAliasExpansion create(@Nullable TypeAliasExpansion typeAliasExpansion, @NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> list) {
            typeAliasDescriptor.getClass();
            list.getClass();
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.getTypeConstructor().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(k13.r(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getOriginal());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, list, tub.o(CollectionsKt.Y0(arrayList, list)), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeAliasExpansion, typeAliasDescriptor, list, map);
    }
}
