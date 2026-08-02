package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class CapturedTypeConstructorKt$createCapturedIfNeeded$1 extends xka implements Function0<KotlinType> {
    final /* synthetic */ TypeProjection $this_createCapturedIfNeeded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturedTypeConstructorKt$createCapturedIfNeeded$1(TypeProjection typeProjection) {
        super(0);
        this.$this_createCapturedIfNeeded = typeProjection;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final KotlinType invoke() {
        KotlinType type = this.$this_createCapturedIfNeeded.getType();
        type.getClass();
        return type;
    }
}
