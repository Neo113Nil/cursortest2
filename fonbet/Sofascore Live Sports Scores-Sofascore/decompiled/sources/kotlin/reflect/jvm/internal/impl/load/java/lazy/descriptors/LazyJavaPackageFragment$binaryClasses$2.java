package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.tub;
import defpackage.xka;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaPackageFragment$binaryClasses$2 extends xka implements Function0<Map<String, ? extends KotlinJvmBinaryClass>> {
    final /* synthetic */ LazyJavaPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$binaryClasses$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.this$0 = lazyJavaPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<String, KotlinJvmBinaryClass> invoke() {
        LazyJavaResolverContext lazyJavaResolverContext;
        LazyJavaResolverContext lazyJavaResolverContext2;
        JvmMetadataVersion jvmMetadataVersion;
        lazyJavaResolverContext = this.this$0.c;
        PackagePartProvider packagePartProvider = lazyJavaResolverContext.getComponents().getPackagePartProvider();
        String asString = this.this$0.getFqName().asString();
        asString.getClass();
        List<String> findPackageParts = packagePartProvider.findPackageParts(asString);
        LazyJavaPackageFragment lazyJavaPackageFragment = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (String str : findPackageParts) {
            ClassId classId = ClassId.topLevel(JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars());
            classId.getClass();
            lazyJavaResolverContext2 = lazyJavaPackageFragment.c;
            KotlinClassFinder kotlinClassFinder = lazyJavaResolverContext2.getComponents().getKotlinClassFinder();
            jvmMetadataVersion = lazyJavaPackageFragment.jvmMetadataVersion;
            KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, classId, jvmMetadataVersion);
            Pair pair = findKotlinClass != null ? new Pair(str, findKotlinClass) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return tub.o(arrayList);
    }
}
