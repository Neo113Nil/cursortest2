package p1;

import java.util.Collections;
import java.util.List;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6031a {

    /* renamed from: a, reason: collision with root package name */
    public final long f62890a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62891b;

    /* renamed from: c, reason: collision with root package name */
    public final List f62892c;

    /* renamed from: d, reason: collision with root package name */
    public final List f62893d;

    /* renamed from: e, reason: collision with root package name */
    public final List f62894e;

    /* renamed from: f, reason: collision with root package name */
    public final List f62895f;

    public C6031a(long j10, int i10, List list, List list2, List list3, List list4) {
        this.f62890a = j10;
        this.f62891b = i10;
        this.f62892c = Collections.unmodifiableList(list);
        this.f62893d = Collections.unmodifiableList(list2);
        this.f62894e = Collections.unmodifiableList(list3);
        this.f62895f = Collections.unmodifiableList(list4);
    }
}
