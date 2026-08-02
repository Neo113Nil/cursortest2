package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class htf extends h13 {
    public final KClass b;
    public final sg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htf(KClass kClass, KSerializer kSerializer) {
        super(kSerializer);
        kClass.getClass();
        kSerializer.getClass();
        this.b = kClass;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.c = new sg0(descriptor, 0);
    }

    @Override // defpackage.w2
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.w2
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.w2
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new r4(objArr);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // defpackage.w2
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        KClass kClass = this.b;
        kClass.getClass();
        Object newInstance = Array.newInstance((Class<?>) sha.x(kClass), arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.h13
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
