package k5;

import androidx.annotation.NonNull;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: k5.q2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7558q2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f70828a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f70829b;

    /* renamed from: c, reason: collision with root package name */
    private Class f70830c;

    /* renamed from: d, reason: collision with root package name */
    private LinkedHashSet<Class> f70831d;

    public C7558q2(@NonNull Class cls, @NonNull String str, @NonNull Throwable th2) {
        LinkedHashSet<Class> linkedHashSet = new LinkedHashSet<>();
        this.f70831d = linkedHashSet;
        Jb.j.b(str, "StartedThreadName is required");
        this.f70828a = str;
        this.f70829b = th2;
        linkedHashSet.add(cls);
    }

    public final void a() {
        if (this.f70831d.add(Y1.class)) {
            return;
        }
        this.f70830c = Y1.class;
        throw new C7482A(this);
    }

    public final void b() {
        this.f70831d.remove(Y1.class);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n\t| Dependency chain (started from thread - ");
        sb2.append(this.f70828a);
        sb2.append(")\n\t| ");
        Iterator<Class> it = this.f70831d.iterator();
        if (it.hasNext()) {
            Class next = it.next();
            sb2.append("\n\t| \t\t");
            sb2.append(next.getName());
        }
        while (it.hasNext()) {
            sb2.append("\n\t| \t\t\t\tdepends on: ");
            sb2.append(it.next().getName());
        }
        if (this.f70830c != null) {
            sb2.append("\n\t| \t\t\t\tdepends on (cycle is here): ");
            sb2.append(this.f70830c.getName());
        }
        sb2.append("\n\n\n\t| Stacktrace:\n");
        Throwable th2 = this.f70829b;
        Jb.j.b(th2, "Not null throwable expected");
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        sb2.append(stringWriter.toString());
        return sb2.toString();
    }
}
