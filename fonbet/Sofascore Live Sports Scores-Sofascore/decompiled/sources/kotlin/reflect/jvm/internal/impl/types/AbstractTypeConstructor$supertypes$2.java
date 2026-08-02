package kotlin.reflect.jvm.internal.impl.types;

import defpackage.xka;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractTypeConstructor$supertypes$2 extends xka implements Function1<Boolean, AbstractTypeConstructor.Supertypes> {
    public static final AbstractTypeConstructor$supertypes$2 INSTANCE = new AbstractTypeConstructor$supertypes$2();

    public AbstractTypeConstructor$supertypes$2() {
        super(1);
    }

    @NotNull
    public final AbstractTypeConstructor.Supertypes invoke(boolean z) {
        return new AbstractTypeConstructor.Supertypes(a.c(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }
}
