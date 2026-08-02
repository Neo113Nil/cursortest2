package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2 extends xka implements Function1<ClassId, Integer> {
    public static final FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2 INSTANCE = new FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2();

    public FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull ClassId classId) {
        classId.getClass();
        return 0;
    }
}
