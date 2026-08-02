package kotlin.reflect.full;

import defpackage.xka;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KClassImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KClasses$defaultType$1 extends xka implements Function0<Type> {
    final /* synthetic */ KClass<?> $this_defaultType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClasses$defaultType$1(KClass<?> kClass) {
        super(0);
        this.$this_defaultType = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Type invoke() {
        return ((KClassImpl) this.$this_defaultType).getJClass();
    }
}
