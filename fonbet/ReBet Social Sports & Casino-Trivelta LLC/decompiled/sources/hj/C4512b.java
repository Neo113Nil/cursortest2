package hj;

import Aj.h;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* renamed from: hj.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4512b extends BasicPermission {

    /* renamed from: a, reason: collision with root package name */
    public final String f47909a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47910b;

    public C4512b(String str, String str2) {
        super(str, str2);
        this.f47909a = str2;
        this.f47910b = a(str2);
    }

    public final int a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(h.g(str), " ,");
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i10 |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i10 |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i10 |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i10 |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i10 |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i10 |= 32;
            } else if (nextToken.equals("all")) {
                i10 = 63;
            }
        }
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4512b) {
            C4512b c4512b = (C4512b) obj;
            if (this.f47910b == c4512b.f47910b && getName().equals(c4512b.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.f47909a;
    }

    public int hashCode() {
        return getName().hashCode() + this.f47910b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof C4512b) || !getName().equals(permission.getName())) {
            return false;
        }
        int i10 = this.f47910b;
        int i11 = ((C4512b) permission).f47910b;
        return (i10 & i11) == i11;
    }
}
