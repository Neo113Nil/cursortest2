package q3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f81473a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f81474b = new ArrayList();

    public static void c(l lVar, long j11) {
        lVar.f81473a.put("exo_len", Long.valueOf(j11));
        lVar.f81474b.remove("exo_len");
    }

    public static void d(l lVar, Uri uri) {
        HashMap hashMap = lVar.f81473a;
        ArrayList arrayList = lVar.f81474b;
        if (uri == null) {
            arrayList.add("exo_redir");
            hashMap.remove("exo_redir");
        } else {
            String uri2 = uri.toString();
            uri2.getClass();
            hashMap.put("exo_redir", uri2);
            arrayList.remove("exo_redir");
        }
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap(this.f81473a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final List<String> b() {
        return Collections.unmodifiableList(new ArrayList(this.f81474b));
    }
}
