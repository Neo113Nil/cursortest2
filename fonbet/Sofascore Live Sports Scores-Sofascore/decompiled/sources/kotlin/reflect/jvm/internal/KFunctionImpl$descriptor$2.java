package kotlin.reflect.jvm.internal;

import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KFunctionImpl$descriptor$2 extends xka implements Function0<FunctionDescriptor> {
    final /* synthetic */ String $name;
    final /* synthetic */ KFunctionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$descriptor$2(KFunctionImpl kFunctionImpl, String str) {
        super(0);
        this.this$0 = kFunctionImpl;
        this.$name = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FunctionDescriptor invoke() {
        String str;
        KDeclarationContainerImpl container = this.this$0.getContainer();
        String str2 = this.$name;
        str = this.this$0.signature;
        return container.findFunctionDescriptor(str2, str);
    }
}
