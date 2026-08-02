package kotlin.reflect.jvm.internal;

import defpackage.km5;
import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/KType;", "it", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1 extends xka implements Function1<Class<?>, KType> {
    public static final CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1 INSTANCE = new CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1();

    public CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final KType invoke(@NotNull Class<?> cls) {
        cls.getClass();
        KClassImpl orCreateKotlinClass = CachesKt.getOrCreateKotlinClass(cls);
        km5 km5Var = km5.a;
        return KClassifiers.createType(orCreateKotlinClass, km5Var, true, km5Var);
    }
}
