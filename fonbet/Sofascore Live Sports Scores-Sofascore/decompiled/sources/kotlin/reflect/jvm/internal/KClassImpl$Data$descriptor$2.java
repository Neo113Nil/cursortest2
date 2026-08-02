package kotlin.reflect.jvm.internal;

import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KClassImpl$Data$descriptor$2 extends xka implements Function0<ClassDescriptor> {
    final /* synthetic */ KClassImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$descriptor$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ClassDescriptor invoke() {
        ClassId classId;
        classId = this.this$0.getClassId();
        RuntimeModuleData moduleData = ((KClassImpl.Data) this.this$0.getData().invoke()).getModuleData();
        ClassDescriptor deserializeClass = classId.isLocal() ? moduleData.getDeserialization().deserializeClass(classId) : FindClassInModuleKt.findClassAcrossModuleDependencies(moduleData.getModule(), classId);
        if (deserializeClass != null) {
            return deserializeClass;
        }
        this.this$0.reportUnresolvedClass();
        throw null;
    }
}
