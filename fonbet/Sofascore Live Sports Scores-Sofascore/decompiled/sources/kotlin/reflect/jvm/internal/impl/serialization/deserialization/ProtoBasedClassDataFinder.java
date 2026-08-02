package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.k13;
import defpackage.sub;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    @NotNull
    private final Map<ClassId, ProtoBuf.Class> classIdToProto;

    @NotNull
    private final Function1<ClassId, SourceElement> classSource;

    @NotNull
    private final BinaryVersion metadataVersion;

    @NotNull
    private final NameResolver nameResolver;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBasedClassDataFinder(@NotNull ProtoBuf.PackageFragment packageFragment, @NotNull NameResolver nameResolver, @NotNull BinaryVersion binaryVersion, @NotNull Function1<? super ClassId, ? extends SourceElement> function1) {
        packageFragment.getClass();
        nameResolver.getClass();
        binaryVersion.getClass();
        function1.getClass();
        this.nameResolver = nameResolver;
        this.metadataVersion = binaryVersion;
        this.classSource = function1;
        List<ProtoBuf.Class> class_List = packageFragment.getClass_List();
        class_List.getClass();
        int c = sub.c(k13.r(class_List, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c < 16 ? 16 : c);
        for (Object obj : class_List) {
            linkedHashMap.put(NameResolverUtilKt.getClassId(this.nameResolver, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.classIdToProto = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    public ClassData findClassData(@NotNull ClassId classId) {
        classId.getClass();
        ProtoBuf.Class r0 = this.classIdToProto.get(classId);
        if (r0 == null) {
            return null;
        }
        return new ClassData(this.nameResolver, r0, this.metadataVersion, (SourceElement) this.classSource.invoke(classId));
    }

    @NotNull
    public final Collection<ClassId> getAllClassIds() {
        return this.classIdToProto.keySet();
    }
}
