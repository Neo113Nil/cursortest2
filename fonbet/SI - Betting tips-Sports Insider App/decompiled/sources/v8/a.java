package v8;

import java.util.Map;
import w8.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24451a;

    @Override // t8.a
    public final void a(Object obj, Object obj2) {
        switch (this.f24451a) {
            case 0:
                throw new t8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                t8.e eVar = (t8.e) obj2;
                eVar.a(f.f25009g, entry.getKey());
                eVar.a(f.f25010h, entry.getValue());
                return;
            default:
                throw new t8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
