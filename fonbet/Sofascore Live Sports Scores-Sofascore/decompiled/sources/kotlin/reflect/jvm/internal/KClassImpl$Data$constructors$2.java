package kotlin.reflect.jvm.internal;

import defpackage.k13;
import defpackage.xka;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KFunction;", "T", "kotlin.jvm.PlatformType", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KClassImpl$Data$constructors$2<T> extends xka implements Function0<List<? extends KFunction<? extends T>>> {
    final /* synthetic */ KClassImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$constructors$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<KFunction<T>> invoke() {
        Collection<ConstructorDescriptor> constructorDescriptors = this.this$0.getConstructorDescriptors();
        KClassImpl<T> kClassImpl = this.this$0;
        ArrayList arrayList = new ArrayList(k13.r(constructorDescriptors, 10));
        Iterator<T> it = constructorDescriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(new KFunctionImpl(kClassImpl, (ConstructorDescriptor) it.next()));
        }
        return arrayList;
    }
}
