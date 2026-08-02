package h3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: h3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4442k extends AbstractC4436e {

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f47664d;

    /* renamed from: e, reason: collision with root package name */
    public final List f47665e;

    public C4442k() {
        super(EnumC4441j.MAP);
        this.f47665e = new LinkedList();
        this.f47664d = new LinkedHashMap();
    }

    @Override // h3.AbstractC4436e, h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof C4442k) {
            C4442k c4442k = (C4442k) obj;
            if (super.equals(obj) && this.f47664d.equals(c4442k.f47664d)) {
                return true;
            }
        }
        return false;
    }

    @Override // h3.AbstractC4436e
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    @Override // h3.AbstractC4436e
    public /* bridge */ /* synthetic */ AbstractC4436e g(boolean z10) {
        return super.g(z10);
    }

    public AbstractC4437f h(AbstractC4437f abstractC4437f) {
        return (AbstractC4437f) this.f47664d.get(abstractC4437f);
    }

    @Override // h3.AbstractC4436e, h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ this.f47664d.hashCode();
    }

    public Collection i() {
        return this.f47665e;
    }

    public C4442k j(AbstractC4437f abstractC4437f, AbstractC4437f abstractC4437f2) {
        if (this.f47664d.put(abstractC4437f, abstractC4437f2) == null) {
            this.f47665e.add(abstractC4437f);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (f()) {
            sb2.append("{_ ");
        } else {
            sb2.append("{ ");
        }
        for (AbstractC4437f abstractC4437f : this.f47665e) {
            sb2.append(abstractC4437f);
            sb2.append(": ");
            sb2.append(this.f47664d.get(abstractC4437f));
            sb2.append(", ");
        }
        if (sb2.toString().endsWith(", ")) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public C4442k(int i10) {
        super(EnumC4441j.MAP);
        this.f47665e = new LinkedList();
        this.f47664d = new LinkedHashMap(i10);
    }
}
