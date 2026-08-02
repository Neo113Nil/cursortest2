package kotlin.reflect.jvm.internal.impl.builtins;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PrimitiveType$arrayTypeFqName$2 extends xka implements Function0<FqName> {
    final /* synthetic */ PrimitiveType this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveType$arrayTypeFqName$2(PrimitiveType primitiveType) {
        super(0);
        this.this$0 = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final FqName invoke() {
        FqName child = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(this.this$0.getArrayTypeName());
        child.getClass();
        return child;
    }
}
