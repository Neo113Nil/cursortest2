package H7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class a implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f4836c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* renamed from: a, reason: collision with root package name */
    public Map f4837a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public m f4838b;

    @Override // n7.InterfaceC5672a
    public void U(String str, Object obj) {
        if (f4836c.contains(str)) {
            this.f4837a.put(str, obj);
        }
    }

    @Override // H7.e
    public boolean V1() {
        return false;
    }

    @Override // H7.l, n7.InterfaceC5672a
    public Map getExtras() {
        return this.f4837a;
    }

    @Override // n7.InterfaceC5672a
    public void m1(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f4836c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f4837a.put(str, obj);
            }
        }
    }

    @Override // H7.e
    public p t1() {
        return o.f4868d;
    }

    @Override // H7.e
    public m w1() {
        if (this.f4838b == null) {
            this.f4838b = new n(getWidth(), getHeight(), o(), t1(), getExtras());
        }
        return this.f4838b;
    }
}
