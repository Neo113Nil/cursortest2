package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.xka;
import defpackage.zzl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaPackageScope$classes$1 extends xka implements Function1<LazyJavaPackageScope.FindClassRequest, ClassDescriptor> {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaPackageScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$classes$1(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.this$0 = lazyJavaPackageScope;
        this.$c = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ClassDescriptor invoke(@NotNull LazyJavaPackageScope.FindClassRequest findClassRequest) {
        JvmMetadataVersion jvmMetadataVersion;
        KotlinClassFinder.Result findKotlinClassOrContent;
        LazyJavaPackageScope.KotlinClassLookupResult resolveKotlinBinaryClass;
        JvmMetadataVersion jvmMetadataVersion2;
        JvmMetadataVersion jvmMetadataVersion3;
        JvmMetadataVersion jvmMetadataVersion4;
        findClassRequest.getClass();
        ClassId classId = new ClassId(this.this$0.getOwnerDescriptor().getFqName(), findClassRequest.getName());
        JavaClass javaClass = findClassRequest.getJavaClass();
        LazyJavaResolverContext lazyJavaResolverContext = this.$c;
        if (javaClass != null) {
            KotlinClassFinder kotlinClassFinder = lazyJavaResolverContext.getComponents().getKotlinClassFinder();
            JavaClass javaClass2 = findClassRequest.getJavaClass();
            jvmMetadataVersion4 = this.this$0.getJvmMetadataVersion();
            findKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(javaClass2, jvmMetadataVersion4);
        } else {
            KotlinClassFinder kotlinClassFinder2 = lazyJavaResolverContext.getComponents().getKotlinClassFinder();
            jvmMetadataVersion = this.this$0.getJvmMetadataVersion();
            findKotlinClassOrContent = kotlinClassFinder2.findKotlinClassOrContent(classId, jvmMetadataVersion);
        }
        KotlinJvmBinaryClass kotlinJvmBinaryClass = findKotlinClassOrContent != null ? findKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
        ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
        if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
            return null;
        }
        resolveKotlinBinaryClass = this.this$0.resolveKotlinBinaryClass(kotlinJvmBinaryClass);
        if (resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.Found) {
            return ((LazyJavaPackageScope.KotlinClassLookupResult.Found) resolveKotlinBinaryClass).getDescriptor();
        }
        if (resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass) {
            return null;
        }
        if (!(resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.NotFound)) {
            zzl.b();
            return null;
        }
        JavaClass javaClass3 = findClassRequest.getJavaClass();
        if (javaClass3 == null) {
            JavaClassFinder finder = this.$c.getComponents().getFinder();
            KotlinClassFinder.Result result = findKotlinClassOrContent;
            KotlinClassFinder.Result.ClassFileContent classFileContent = result instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) result : null;
            javaClass3 = finder.findClass(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
        }
        JavaClass javaClass4 = javaClass3;
        if ((javaClass4 != null ? javaClass4.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
            FqName fqName = javaClass4 != null ? javaClass4.getFqName() : null;
            if (fqName == null || fqName.isRoot() || !Intrinsics.c(fqName.parent(), this.this$0.getOwnerDescriptor().getFqName())) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.$c, this.this$0.getOwnerDescriptor(), javaClass4, null, 8, null);
            this.$c.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        StringBuilder sb = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
        sb.append(javaClass4);
        sb.append("\nClassId: ");
        sb.append(classId);
        sb.append("\nfindKotlinClass(JavaClass) = ");
        KotlinClassFinder kotlinClassFinder3 = this.$c.getComponents().getKotlinClassFinder();
        jvmMetadataVersion2 = this.this$0.getJvmMetadataVersion();
        sb.append(KotlinClassFinderKt.findKotlinClass(kotlinClassFinder3, javaClass4, jvmMetadataVersion2));
        KotlinClassFinder kotlinClassFinder4 = this.$c.getComponents().getKotlinClassFinder();
        jvmMetadataVersion3 = this.this$0.getJvmMetadataVersion();
        KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(kotlinClassFinder4, classId, jvmMetadataVersion3);
        sb.append("\nfindKotlinClass(ClassId) = ");
        sb.append(findKotlinClass);
        sb.append('\n');
        throw new IllegalStateException(sb.toString());
    }
}
