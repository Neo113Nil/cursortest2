package h3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4434c extends AbstractC4436e {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f47649d;

    public C4434c() {
        super(EnumC4441j.ARRAY);
        this.f47649d = new ArrayList();
    }

    @Override // h3.AbstractC4436e, h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof C4434c) {
            C4434c c4434c = (C4434c) obj;
            if (super.equals(obj) && this.f47649d.equals(c4434c.f47649d)) {
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

    public C4434c h(AbstractC4437f abstractC4437f) {
        this.f47649d.add(abstractC4437f);
        return this;
    }

    @Override // h3.AbstractC4436e, h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ this.f47649d.hashCode();
    }

    public List i() {
        return this.f47649d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        if (f()) {
            sb2.append("_ ");
        }
        sb2.append(Arrays.toString(this.f47649d.toArray()).substring(1));
        return sb2.toString();
    }

    public C4434c(int i10) {
        super(EnumC4441j.ARRAY);
        this.f47649d = new ArrayList(i10);
    }
}
