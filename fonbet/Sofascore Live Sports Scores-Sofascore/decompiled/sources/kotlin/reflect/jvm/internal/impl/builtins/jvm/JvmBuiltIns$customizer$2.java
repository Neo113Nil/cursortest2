package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import defpackage.a70;
import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmBuiltIns$customizer$2 extends xka implements Function0<JvmBuiltInsCustomizer> {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltIns this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends xka implements Function0<JvmBuiltIns.Settings> {
        final /* synthetic */ JvmBuiltIns this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JvmBuiltIns jvmBuiltIns) {
            super(0);
            this.this$0 = jvmBuiltIns;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final JvmBuiltIns.Settings invoke() {
            Function0 function0;
            function0 = this.this$0.settingsComputation;
            if (function0 == null) {
                a70.j("JvmBuiltins instance has not been initialized properly");
                return null;
            }
            JvmBuiltIns.Settings settings = (JvmBuiltIns.Settings) function0.invoke();
            this.this$0.settingsComputation = null;
            return settings;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$customizer$2(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        super(0);
        this.this$0 = jvmBuiltIns;
        this.$storageManager = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final JvmBuiltInsCustomizer invoke() {
        ModuleDescriptorImpl builtInsModule = this.this$0.getBuiltInsModule();
        builtInsModule.getClass();
        return new JvmBuiltInsCustomizer(builtInsModule, this.$storageManager, new AnonymousClass1(this.this$0));
    }
}
