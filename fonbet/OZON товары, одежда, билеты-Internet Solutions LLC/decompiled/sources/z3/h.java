package z3;

import D3.r;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class h implements r<h> {

    /* renamed from: a, reason: collision with root package name */
    public final String f107123a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f107124b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f107125c;

    protected h(String str, List<String> list, boolean z11) {
        this.f107123a = str;
        this.f107124b = Collections.unmodifiableList(list);
        this.f107125c = z11;
    }
}
