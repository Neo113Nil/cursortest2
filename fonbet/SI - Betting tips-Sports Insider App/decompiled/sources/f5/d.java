package f5;

import android.content.Context;
import androidx.appcompat.app.v0;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import x5.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final h f9468a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f9469b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9470c;

    public d(Context context, v0 v0Var) {
        h hVar = new h(context, 6);
        this.f9470c = new HashMap();
        this.f9468a = hVar;
        this.f9469b = v0Var;
    }

    public final synchronized e a(String str) {
        if (this.f9470c.containsKey(str)) {
            return (e) this.f9470c.get(str);
        }
        CctBackendFactory e7 = this.f9468a.e(str);
        if (e7 == null) {
            return null;
        }
        v0 v0Var = this.f9469b;
        e create = e7.create(new b((Context) v0Var.f364b, (n5.a) v0Var.f365c, (n5.a) v0Var.f366d, str));
        this.f9470c.put(str, create);
        return create;
    }
}
