package g;

import h.AbstractC6755a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: g.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6598j extends AbstractC6592d<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC6595g f63672a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f63673b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6755a<Object, Object> f63674c;

    C6598j(AbstractC6595g abstractC6595g, String str, AbstractC6755a<Object, Object> abstractC6755a) {
        this.f63672a = abstractC6595g;
        this.f63673b = str;
        this.f63674c = abstractC6755a;
    }

    @Override // g.AbstractC6592d
    public final void a(Object obj) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC6595g abstractC6595g = this.f63672a;
        linkedHashMap = abstractC6595g.f63658b;
        String str = this.f63673b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC6755a<Object, Object> abstractC6755a = this.f63674c;
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
        this.f63672a.l(this.f63673b);
    }
}
