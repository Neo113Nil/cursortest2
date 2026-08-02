package kotlin.reflect.jvm.internal.impl.resolve.constants;

import defpackage.xka;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class IntegerLiteralTypeConstructor$supertypes$2 extends xka implements Function0<List<SimpleType>> {
    final /* synthetic */ IntegerLiteralTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegerLiteralTypeConstructor$supertypes$2(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        super(0);
        this.this$0 = integerLiteralTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<SimpleType> invoke() {
        SimpleType simpleType;
        boolean isContainsOnlyUnsignedTypes;
        SimpleType defaultType = this.this$0.getBuiltIns().getComparable().getDefaultType();
        defaultType.getClass();
        Variance variance = Variance.IN_VARIANCE;
        simpleType = this.this$0.type;
        ArrayList l = b.l(TypeSubstitutionKt.replace$default(defaultType, a.c(new TypeProjectionImpl(variance, simpleType)), null, 2, null));
        isContainsOnlyUnsignedTypes = this.this$0.isContainsOnlyUnsignedTypes();
        if (!isContainsOnlyUnsignedTypes) {
            l.add(this.this$0.getBuiltIns().getNumberType());
        }
        return l;
    }
}
