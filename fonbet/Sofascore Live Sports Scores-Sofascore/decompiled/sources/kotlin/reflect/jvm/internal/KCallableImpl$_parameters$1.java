package kotlin.reflect.jvm.internal;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.n13;
import defpackage.o93;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a,\u0012\u0004\u0012\u00020\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003\"\u0006\b\u0000\u0010\u0005 \u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", PlayerKt.ICE_HOCKEY_RIGHT_WING, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KCallableImpl$_parameters$1 extends xka implements Function0<ArrayList<KParameter>> {
    final /* synthetic */ KCallableImpl<R> this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", PlayerKt.ICE_HOCKEY_RIGHT_WING, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends xka implements Function0<ParameterDescriptor> {
        final /* synthetic */ CallableMemberDescriptor $descriptor;
        final /* synthetic */ int $i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CallableMemberDescriptor callableMemberDescriptor, int i) {
            super(0);
            this.$descriptor = callableMemberDescriptor;
            this.$i = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ParameterDescriptor invoke() {
            ValueParameterDescriptor valueParameterDescriptor = this.$descriptor.getValueParameters().get(this.$i);
            valueParameterDescriptor.getClass();
            return valueParameterDescriptor;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$_parameters$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<KParameter> invoke() {
        int i;
        CallableMemberDescriptor descriptor = this.this$0.getDescriptor();
        ArrayList<KParameter> arrayList = new ArrayList<>();
        int i2 = 0;
        if (this.this$0.isBound()) {
            i = 0;
        } else {
            ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(descriptor);
            if (instanceReceiverParameter != null) {
                arrayList.add(new KParameterImpl(this.this$0, 0, KParameter.Kind.INSTANCE, new AnonymousClass1(instanceReceiverParameter)));
                i = 1;
            } else {
                i = 0;
            }
            ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.EXTENSION_RECEIVER, new AnonymousClass2(extensionReceiverParameter)));
                i++;
            }
        }
        int size = descriptor.getValueParameters().size();
        while (i2 < size) {
            arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.VALUE, new AnonymousClass3(descriptor, i2)));
            i2++;
            i++;
        }
        if (this.this$0.isAnnotationConstructor() && (descriptor instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
            n13.u(new Comparator() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$invoke$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return o93.b(((KParameter) t).getName(), ((KParameter) t2).getName());
                }
            }, arrayList);
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", PlayerKt.ICE_HOCKEY_RIGHT_WING, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends xka implements Function0<ParameterDescriptor> {
        final /* synthetic */ ReceiverParameterDescriptor $instanceReceiver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReceiverParameterDescriptor receiverParameterDescriptor) {
            super(0);
            this.$instanceReceiver = receiverParameterDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ParameterDescriptor invoke() {
            return this.$instanceReceiver;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", PlayerKt.ICE_HOCKEY_RIGHT_WING, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends xka implements Function0<ParameterDescriptor> {
        final /* synthetic */ ReceiverParameterDescriptor $extensionReceiver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ReceiverParameterDescriptor receiverParameterDescriptor) {
            super(0);
            this.$extensionReceiver = receiverParameterDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ParameterDescriptor invoke() {
            return this.$extensionReceiver;
        }
    }
}
