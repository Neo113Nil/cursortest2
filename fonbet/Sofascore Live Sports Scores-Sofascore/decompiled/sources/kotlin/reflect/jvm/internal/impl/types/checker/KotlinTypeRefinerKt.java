package kotlin.reflect.jvm.internal.impl.types.checker;

import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class KotlinTypeRefinerKt {

    @NotNull
    private static final ModuleCapability<Ref<TypeRefinementSupport>> REFINER_CAPABILITY = new ModuleCapability<>("KotlinTypeRefiner");

    @NotNull
    public static final ModuleCapability<Ref<TypeRefinementSupport>> getREFINER_CAPABILITY() {
        return REFINER_CAPABILITY;
    }

    @NotNull
    public static final List<KotlinType> refineTypes(@NotNull KotlinTypeRefiner kotlinTypeRefiner, @NotNull Iterable<? extends KotlinType> iterable) {
        kotlinTypeRefiner.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
        Iterator<? extends KotlinType> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinTypeRefiner.refineType((KotlinTypeMarker) it.next()));
        }
        return arrayList;
    }
}
