package defpackage;

import com.sofascore.model.mvvm.model.Season;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* loaded from: classes7.dex */
public final class agf extends BasicPermission {
    public final String a;
    public final int b;

    public agf(String str) {
        super("BC", str);
        this.a = str;
        StringTokenizer stringTokenizer = new StringTokenizer(aii.a(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals(Season.YEAR_ALL_TIME)) {
                i = 63;
            }
        }
        if (i != 0) {
            this.b = i;
        } else {
            a70.p("unknown permissions passed to mask");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agf) {
            agf agfVar = (agf) obj;
            if (this.b == agfVar.b && getName().equals(agfVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return this.a;
    }

    public final int hashCode() {
        return getName().hashCode() + this.b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof agf) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = ((agf) permission).b;
        return (this.b & i) == i;
    }
}
