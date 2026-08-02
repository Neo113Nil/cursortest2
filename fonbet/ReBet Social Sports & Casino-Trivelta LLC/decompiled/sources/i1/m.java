package i1;

import android.net.Uri;
import e1.AbstractC4134a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final Map f47990a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final List f47991b = new ArrayList();

    public static m g(m mVar, long j10) {
        return mVar.e("exo_len", j10);
    }

    public static m h(m mVar, Uri uri) {
        return uri == null ? mVar.d("exo_redir") : mVar.f("exo_redir", uri.toString());
    }

    public final m a(String str, Object obj) {
        this.f47990a.put((String) AbstractC4134a.e(str), AbstractC4134a.e(obj));
        this.f47991b.remove(str);
        return this;
    }

    public Map b() {
        HashMap hashMap = new HashMap(this.f47990a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public List c() {
        return Collections.unmodifiableList(new ArrayList(this.f47991b));
    }

    public m d(String str) {
        this.f47991b.add(str);
        this.f47990a.remove(str);
        return this;
    }

    public m e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    public m f(String str, String str2) {
        return a(str, str2);
    }
}
