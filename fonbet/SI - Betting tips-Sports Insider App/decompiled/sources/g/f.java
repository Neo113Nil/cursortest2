package g;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f9637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9638c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.a f9639d;

    public /* synthetic */ f(g gVar, String str, h.a aVar, int i5) {
        this.f9636a = i5;
        this.f9637b = gVar;
        this.f9638c = str;
        this.f9639d = aVar;
    }

    @Override // g.b
    public final void a(Object obj) {
        switch (this.f9636a) {
            case 0:
                g gVar = this.f9637b;
                LinkedHashMap linkedHashMap = gVar.f9641b;
                ArrayList arrayList = gVar.f9643d;
                String str = this.f9638c;
                Object obj2 = linkedHashMap.get(str);
                h.a aVar = this.f9639d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    gVar.b(intValue, aVar, obj);
                    return;
                } catch (Exception e7) {
                    arrayList.remove(str);
                    throw e7;
                }
            default:
                g gVar2 = this.f9637b;
                ArrayList arrayList2 = gVar2.f9643d;
                LinkedHashMap linkedHashMap2 = gVar2.f9641b;
                String str2 = this.f9638c;
                Object obj3 = linkedHashMap2.get(str2);
                h.a aVar2 = this.f9639d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    gVar2.b(intValue2, aVar2, obj);
                    return;
                } catch (Exception e9) {
                    arrayList2.remove(str2);
                    throw e9;
                }
        }
    }

    public void b() {
        this.f9637b.f(this.f9638c);
    }
}
