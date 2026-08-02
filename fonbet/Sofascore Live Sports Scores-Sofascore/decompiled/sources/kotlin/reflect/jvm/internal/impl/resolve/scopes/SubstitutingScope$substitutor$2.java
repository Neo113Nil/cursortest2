package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SubstitutingScope$substitutor$2 extends xka implements Function0<TypeSubstitutor> {
    final /* synthetic */ TypeSubstitutor $givenSubstitutor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutingScope$substitutor$2(TypeSubstitutor typeSubstitutor) {
        super(0);
        this.$givenSubstitutor = typeSubstitutor;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final TypeSubstitutor invoke() {
        return this.$givenSubstitutor.getSubstitution().buildSubstitutor();
    }
}
