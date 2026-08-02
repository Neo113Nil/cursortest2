package defpackage;

import java.security.Permission;
import java.util.HashSet;

/* loaded from: classes7.dex */
public final class e74 extends Permission {
    public final HashSet a;

    public e74(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e74) && this.a.equals(((e74) obj).a);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.a.toString();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof e74)) {
            return false;
        }
        e74 e74Var = (e74) permission;
        return getName().equals(e74Var.getName()) || this.a.containsAll(e74Var.a);
    }
}
