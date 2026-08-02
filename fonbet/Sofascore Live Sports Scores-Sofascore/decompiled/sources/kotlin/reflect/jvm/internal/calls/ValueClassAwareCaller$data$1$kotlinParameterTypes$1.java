package kotlin.reflect.jvm.internal.calls;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u0003*\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", PlayerKt.FOOTBALL_MIDFIELDER, "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "invoke", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ValueClassAwareCaller$data$1$kotlinParameterTypes$1 extends xka implements Function1<ClassDescriptor, Boolean> {
    public static final ValueClassAwareCaller$data$1$kotlinParameterTypes$1 INSTANCE = new ValueClassAwareCaller$data$1$kotlinParameterTypes$1();

    public ValueClassAwareCaller$data$1$kotlinParameterTypes$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        return Boolean.valueOf(InlineClassesUtilsKt.isValueClass(classDescriptor));
    }
}
