package s7;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.util.EnumMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final l f22860f = new l((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f22861a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22862b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f22863c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22864d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f22865e;

    public l(Boolean bool, int i5, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(p1.class);
        this.f22865e = enumMap;
        enumMap.put((EnumMap) p1.AD_USER_DATA, (p1) (bool == null ? n1.UNINITIALIZED : bool.booleanValue() ? n1.GRANTED : n1.DENIED));
        this.f22861a = i5;
        this.f22862b = d();
        this.f22863c = bool2;
        this.f22864d = str;
    }

    public static l b(String str) {
        if (str == null || str.length() <= 0) {
            return f22860f;
        }
        String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(p1.class);
        p1[] p1VarArr = o1.DMA.f22928a;
        int length = p1VarArr.length;
        int i5 = 1;
        int i10 = 0;
        while (i10 < length) {
            enumMap.put((EnumMap) p1VarArr[i10], (p1) q1.e(split[i5].charAt(0)));
            i10++;
            i5++;
        }
        return new l(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static l c(int i5, Bundle bundle) {
        if (bundle == null) {
            return new l((Boolean) null, i5, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(p1.class);
        for (p1 p1Var : o1.DMA.f22928a) {
            enumMap.put((EnumMap) p1Var, (p1) q1.d(bundle.getString(p1Var.f22944a)));
        }
        return new l(enumMap, i5, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final n1 a() {
        n1 n1Var = (n1) this.f22865e.get(p1.AD_USER_DATA);
        return n1Var == null ? n1.UNINITIALIZED : n1Var;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22861a);
        for (p1 p1Var : o1.DMA.f22928a) {
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(q1.h((n1) this.f22865e.get(p1Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f22862b.equalsIgnoreCase(lVar.f22862b) && Objects.equals(this.f22863c, lVar.f22863c)) {
            return Objects.equals(this.f22864d, lVar.f22864d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f22863c;
        int i5 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f22864d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f22862b.hashCode() + (i5 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(q1.a(this.f22861a));
        for (p1 p1Var : o1.DMA.f22928a) {
            sb2.append(StringUtils.COMMA);
            sb2.append(p1Var.f22944a);
            sb2.append("=");
            n1 n1Var = (n1) this.f22865e.get(p1Var);
            if (n1Var == null) {
                sb2.append("uninitialized");
            } else {
                int ordinal = n1Var.ordinal();
                if (ordinal == 0) {
                    sb2.append("uninitialized");
                } else if (ordinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb2.append("denied");
                } else if (ordinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f22863c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f22864d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public l(EnumMap enumMap, int i5, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(p1.class);
        this.f22865e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f22861a = i5;
        this.f22862b = d();
        this.f22863c = bool;
        this.f22864d = str;
    }
}
