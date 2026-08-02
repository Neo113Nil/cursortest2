package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SignatureEnhancement$enhanceTypeParameterBounds$1$1 extends xka implements Function1<UnwrappedType, Boolean> {
    public static final SignatureEnhancement$enhanceTypeParameterBounds$1$1 INSTANCE = new SignatureEnhancement$enhanceTypeParameterBounds$1$1();

    public SignatureEnhancement$enhanceTypeParameterBounds$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull UnwrappedType unwrappedType) {
        unwrappedType.getClass();
        return Boolean.valueOf(unwrappedType instanceof RawType);
    }
}
