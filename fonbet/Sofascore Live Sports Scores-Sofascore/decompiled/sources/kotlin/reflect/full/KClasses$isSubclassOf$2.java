package kotlin.reflect.full;

import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0016\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/reflect/KClass;", "invoke", "(Lkotlin/reflect/KClass;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KClasses$isSubclassOf$2 extends xka implements Function1<KClass<?>, Boolean> {
    final /* synthetic */ KClass<?> $base;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClasses$isSubclassOf$2(KClass<?> kClass) {
        super(1);
        this.$base = kClass;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(KClass<?> kClass) {
        return Boolean.valueOf(Intrinsics.c(kClass, this.$base));
    }
}
