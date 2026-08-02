package g;

import h.AbstractC6755a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6597i extends AbstractC6592d<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC6595g f63669a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f63670b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6755a<Object, Object> f63671c;

    C6597i(AbstractC6595g abstractC6595g, String str, AbstractC6755a<Object, Object> abstractC6755a) {
        this.f63669a = abstractC6595g;
        this.f63670b = str;
        this.f63671c = abstractC6755a;
    }

    @Override // g.AbstractC6592d
    public final void a(Object obj) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC6595g abstractC6595g = this.f63669a;
        linkedHashMap = abstractC6595g.f63658b;
        String str = this.f63670b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC6755a<Object, Object> abstractC6755a = this.f63671c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC6755a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        arrayList = abstractC6595g.f63660d;
        arrayList.add(str);
        try {
            abstractC6595g.f(intValue, abstractC6755a, obj);
        } catch (Exception e11) {
            arrayList2 = abstractC6595g.f63660d;
            arrayList2.remove(str);
            throw e11;
        }
    }

    @Override // g.AbstractC6592d
    public final void b() {
        this.f63669a.l(this.f63670b);
    }
}
