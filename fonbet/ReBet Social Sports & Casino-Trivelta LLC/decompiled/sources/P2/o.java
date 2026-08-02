package P2;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f8717c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f8718a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8719b;

    public static class a extends o {
        public a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends o {
        public b(String str, String str2) {
            super(str, str2);
        }
    }

    public o(String str, String str2) {
        this.f8718a = str;
        this.f8719b = str2;
        f8717c.add(this);
    }
}
