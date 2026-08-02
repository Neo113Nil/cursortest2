package kotlin.reflect.jvm.internal.impl.resolve.constants;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class IntegerLiteralTypeConstructor$valueToString$1 extends xka implements Function1<KotlinType, CharSequence> {
    public static final IntegerLiteralTypeConstructor$valueToString$1 INSTANCE = new IntegerLiteralTypeConstructor$valueToString$1();

    public IntegerLiteralTypeConstructor$valueToString$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.toString();
    }
}
