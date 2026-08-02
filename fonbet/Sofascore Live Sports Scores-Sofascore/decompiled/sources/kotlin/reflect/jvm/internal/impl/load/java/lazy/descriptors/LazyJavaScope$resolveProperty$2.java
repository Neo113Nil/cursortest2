package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import defpackage.fsf;
import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyJavaScope$resolveProperty$2 extends xka implements Function0<NullableLazyValue<? extends ConstantValue<?>>> {
    final /* synthetic */ JavaField $field;
    final /* synthetic */ fsf $propertyDescriptor;
    final /* synthetic */ LazyJavaScope this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends xka implements Function0<ConstantValue<?>> {
        final /* synthetic */ JavaField $field;
        final /* synthetic */ fsf $propertyDescriptor;
        final /* synthetic */ LazyJavaScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyJavaScope lazyJavaScope, JavaField javaField, fsf fsfVar) {
            super(0);
            this.this$0 = lazyJavaScope;
            this.$field = javaField;
            this.$propertyDescriptor = fsfVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final ConstantValue<?> invoke() {
            return this.this$0.getC().getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(this.$field, (PropertyDescriptor) this.$propertyDescriptor.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$resolveProperty$2(LazyJavaScope lazyJavaScope, JavaField javaField, fsf fsfVar) {
        super(0);
        this.this$0 = lazyJavaScope;
        this.$field = javaField;
        this.$propertyDescriptor = fsfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NullableLazyValue<ConstantValue<?>> invoke() {
        return this.this$0.getC().getStorageManager().createNullableLazyValue(new AnonymousClass1(this.this$0, this.$field, this.$propertyDescriptor));
    }
}
