package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyWrappedType$refine$1 extends xka implements Function0<KotlinType> {
    final /* synthetic */ KotlinTypeRefiner $kotlinTypeRefiner;
    final /* synthetic */ LazyWrappedType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyWrappedType$refine$1(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        super(0);
        this.$kotlinTypeRefiner = kotlinTypeRefiner;
        this.this$0 = lazyWrappedType;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final KotlinType invoke() {
        Function0 function0;
        KotlinTypeRefiner kotlinTypeRefiner = this.$kotlinTypeRefiner;
        function0 = this.this$0.computation;
        return kotlinTypeRefiner.refineType((KotlinTypeMarker) function0.invoke());
    }
}
