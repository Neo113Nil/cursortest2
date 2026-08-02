package oi;

import java.io.Serializable;
import li.InterfaceC5472f;

/* renamed from: oi.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5909e implements p, Serializable {
    private final int hash;
    private final int identity;
    private final String name;

    public AbstractC5909e(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("Element name is empty or contains only white space.");
        }
        this.name = str;
        int hashCode = str.hashCode();
        this.hash = hashCode;
        if (!w()) {
            hashCode = -1;
        } else if (hashCode == -1) {
            hashCode = ~hashCode;
        }
        this.identity = hashCode;
    }

    @Override // oi.p
    public char a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC5909e abstractC5909e = (AbstractC5909e) obj;
            int i10 = this.identity;
            if (i10 == abstractC5909e.identity && (i10 != -1 || (name().equals(abstractC5909e.name()) && s(abstractC5909e)))) {
                return true;
            }
        }
        return false;
    }

    @Override // oi.p
    public boolean g() {
        return false;
    }

    public final int hashCode() {
        return this.hash;
    }

    @Override // oi.p
    public final String name() {
        return this.name;
    }

    @Override // java.util.Comparator
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compare(o oVar, o oVar2) {
        return ((Comparable) oVar.j(this)).compareTo(oVar2.j(this));
    }

    public z r(x xVar) {
        return null;
    }

    public boolean s(AbstractC5909e abstractC5909e) {
        return true;
    }

    public p t() {
        return null;
    }

    public String toString() {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 32);
        sb2.append(name);
        sb2.append('@');
        sb2.append(this.name);
        return sb2.toString();
    }

    public String u(x xVar) {
        if (!v() || !InterfaceC5472f.class.isAssignableFrom(xVar.r())) {
            return null;
        }
        return "Accessing the local element [" + this.name + "] from a global type requires a timezone.\n- Try to apply a zonal query like \"" + this.name + ".atUTC()\".\n- Or try to first convert the global type to a zonal timestamp: \"moment.toZonalTimestamp(...)\".\n- If used in formatting then consider \"ChronoFormatter.withTimezone(TZID)\".";
    }

    public boolean v() {
        return true;
    }

    public boolean w() {
        return false;
    }
}
