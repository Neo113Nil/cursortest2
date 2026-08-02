package s1;

import java.util.Collections;
import java.util.List;
import x1.InterfaceC6777a;

/* loaded from: classes.dex */
public abstract class j implements InterfaceC6777a {

    /* renamed from: a, reason: collision with root package name */
    public final String f64566a;

    /* renamed from: b, reason: collision with root package name */
    public final List f64567b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f64568c;

    public j(String str, List list, boolean z10) {
        this.f64566a = str;
        this.f64567b = Collections.unmodifiableList(list);
        this.f64568c = z10;
    }
}
