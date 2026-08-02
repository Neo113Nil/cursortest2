package p1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f62932a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62933b;

    /* renamed from: c, reason: collision with root package name */
    public final List f62934c;

    /* renamed from: d, reason: collision with root package name */
    public final List f62935d;

    /* renamed from: e, reason: collision with root package name */
    public final C6035e f62936e;

    public g(String str, long j10, List list, List list2) {
        this(str, j10, list, list2, null);
    }

    public int a(int i10) {
        int size = this.f62934c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C6031a) this.f62934c.get(i11)).f62891b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List list, List list2, C6035e c6035e) {
        this.f62932a = str;
        this.f62933b = j10;
        this.f62934c = Collections.unmodifiableList(list);
        this.f62935d = Collections.unmodifiableList(list2);
        this.f62936e = c6035e;
    }
}
