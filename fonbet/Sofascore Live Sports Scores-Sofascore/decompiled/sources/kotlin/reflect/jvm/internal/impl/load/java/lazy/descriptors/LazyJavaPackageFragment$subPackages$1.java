package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.k13;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaPackageFragment$subPackages$1 extends xka implements Function0<List<? extends FqName>> {
    final /* synthetic */ LazyJavaPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$subPackages$1(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.this$0 = lazyJavaPackageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<FqName> invoke() {
        JavaPackage javaPackage;
        javaPackage = this.this$0.jPackage;
        Collection<JavaPackage> subPackages = javaPackage.getSubPackages();
        ArrayList arrayList = new ArrayList(k13.r(subPackages, 10));
        Iterator<T> it = subPackages.iterator();
        while (it.hasNext()) {
            arrayList.add(((JavaPackage) it.next()).getFqName());
        }
        return arrayList;
    }
}
