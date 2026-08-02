package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.km5;
import defpackage.xka;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class StaticScopeForKotlinEnum$properties$2 extends xka implements Function0<List<? extends PropertyDescriptor>> {
    final /* synthetic */ StaticScopeForKotlinEnum this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticScopeForKotlinEnum$properties$2(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        super(0);
        this.this$0 = staticScopeForKotlinEnum;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<PropertyDescriptor> invoke() {
        boolean z;
        ClassDescriptor classDescriptor;
        z = this.this$0.enumEntriesCanBeUsed;
        if (!z) {
            return km5.a;
        }
        classDescriptor = this.this$0.containingClass;
        return b.k(DescriptorFactory.createEnumEntriesProperty(classDescriptor));
    }
}
