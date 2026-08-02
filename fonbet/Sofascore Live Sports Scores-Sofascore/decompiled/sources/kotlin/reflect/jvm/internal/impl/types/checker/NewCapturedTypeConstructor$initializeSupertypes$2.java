package kotlin.reflect.jvm.internal.impl.types.checker;

import defpackage.xka;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class NewCapturedTypeConstructor$initializeSupertypes$2 extends xka implements Function0<List<? extends UnwrappedType>> {
    final /* synthetic */ List<UnwrappedType> $supertypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewCapturedTypeConstructor$initializeSupertypes$2(List<? extends UnwrappedType> list) {
        super(0);
        this.$supertypes = list;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<UnwrappedType> invoke() {
        return this.$supertypes;
    }
}
