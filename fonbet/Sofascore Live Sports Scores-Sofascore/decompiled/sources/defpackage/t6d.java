package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzpk;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.Unit;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t6d {
    public final String a;
    public final int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Serializable f;

    public t6d(y8d y8dVar, KClass kClass, Map map) {
        String str;
        map.getClass();
        int y = kClass != null ? waa.y(sha.R(kClass)) : -1;
        if (kClass != null) {
            KSerializer R = sha.R(kClass);
            if (R instanceof a0f) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                KClass i0 = k53.i0(((a0f) R).getDescriptor());
                throw new IllegalArgumentException(mz1.o(sb, i0 != null ? i0.getSimpleName() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            ujg ujgVar = new ujg(R);
            pte pteVar = new pte(ujgVar, 14);
            int d = R.getDescriptor().d();
            for (int i = 0; i < d; i++) {
                String e = R.getDescriptor().e(i);
                b8d t = waa.t(R.getDescriptor().g(i), map);
                if (t == null) {
                    a70.p(waa.P(e, R.getDescriptor().g(i).h(), R.getDescriptor().h(), map.toString()));
                    throw null;
                }
                pteVar.invoke(Integer.valueOf(i), e, t);
            }
            str = ((String) ujgVar.c) + ((String) ujgVar.d) + ((String) ujgVar.e);
        } else {
            str = null;
        }
        this.c = y8dVar;
        this.b = y;
        this.a = str;
        this.d = new LinkedHashMap();
        this.f = new ArrayList();
        this.e = new LinkedHashMap();
        if (kClass != null) {
            KSerializer R2 = sha.R(kClass);
            if (R2 instanceof a0f) {
                sw9.o(R2, ". Arguments can only be generated from concrete classes or objects.", "Cannot generate NavArguments for polymorphic serializer ");
                throw null;
            }
            int d2 = R2.getDescriptor().d();
            ArrayList arrayList = new ArrayList(d2);
            for (int i2 = 0; i2 < d2; i2++) {
                String e2 = R2.getDescriptor().e(i2);
                e2.getClass();
                z5d z5dVar = new z5d();
                SerialDescriptor g = R2.getDescriptor().g(i2);
                boolean b = g.b();
                b8d t2 = waa.t(g, map);
                if (t2 == null) {
                    a70.p(waa.P(e2, g.h(), R2.getDescriptor().h(), map.toString()));
                    throw null;
                }
                z5dVar.a = t2;
                z5dVar.b = b;
                if (R2.getDescriptor().i(i2)) {
                    z5dVar.e = true;
                }
                Unit unit = Unit.a;
                arrayList.add(new p3d(e2, z5dVar.a()));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p3d p3dVar = (p3d) it.next();
                ((LinkedHashMap) this.d).put(p3dVar.a, p3dVar.b);
            }
        }
    }

    public static Boolean f(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean g(String str, zzfr zzfrVar, zzgu zzguVar) {
        List D;
        Preconditions.i(zzfrVar);
        if (str != null && zzfrVar.y() && zzfrVar.G() != 1 && (zzfrVar.G() != 7 ? zzfrVar.z() : zzfrVar.E() != 0)) {
            int G = zzfrVar.G();
            boolean C = zzfrVar.C();
            String A = (C || G == 2 || G == 7) ? zzfrVar.A() : zzfrVar.A().toUpperCase(Locale.ENGLISH);
            if (zzfrVar.E() == 0) {
                D = null;
            } else {
                D = zzfrVar.D();
                if (!C) {
                    ArrayList arrayList = new ArrayList(D.size());
                    Iterator it = D.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    D = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = G == 2 ? A : null;
            if (G != 7 ? A != null : D != null && !D.isEmpty()) {
                if (!C && G != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (G - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != C ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (zzguVar != null) {
                                    zzguVar.j.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(A));
                    case 3:
                        return Boolean.valueOf(str.endsWith(A));
                    case 4:
                        return Boolean.valueOf(str.contains(A));
                    case 5:
                        return Boolean.valueOf(str.equals(A));
                    case 6:
                        if (D != null) {
                            return Boolean.valueOf(D.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean h(BigDecimal bigDecimal, zzfl zzflVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.i(zzflVar);
        if (zzflVar.y()) {
            if (zzflVar.I() != 1 && (zzflVar.I() != 5 ? zzflVar.B() : zzflVar.D() && zzflVar.F())) {
                int I = zzflVar.I();
                try {
                    if (zzflVar.I() == 5) {
                        if (zzpk.u0(zzflVar.E()) && zzpk.u0(zzflVar.G())) {
                            BigDecimal bigDecimal5 = new BigDecimal(zzflVar.E());
                            bigDecimal4 = new BigDecimal(zzflVar.G());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (zzpk.u0(zzflVar.C())) {
                        bigDecimal2 = new BigDecimal(zzflVar.C());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (I != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i = I - 1;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d != 0.0d) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                    }
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                            }
                        } else if (bigDecimal2 != null) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public s6d a() {
        s6d b = b();
        b.d = null;
        i3d i3dVar = b.b;
        for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
            String str = (String) entry.getKey();
            a6d a6dVar = (a6d) entry.getValue();
            str.getClass();
            a6dVar.getClass();
            i3dVar.getClass();
            ((LinkedHashMap) i3dVar.f).put(str, a6dVar);
        }
        Iterator it = ((ArrayList) this.f).iterator();
        while (it.hasNext()) {
            b.a((p6d) it.next());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.e).entrySet()) {
            b.p(((Number) entry2.getKey()).intValue(), (y5d) entry2.getValue());
        }
        String str2 = this.a;
        if (str2 != null) {
            b.q(str2);
        }
        int i = this.b;
        if (i != -1) {
            i3dVar.b = i;
            i3dVar.d = null;
        }
        return b;
    }

    public s6d b() {
        return ((y8d) this.c).a();
    }

    public abstract int c();

    public abstract boolean d();

    public abstract boolean e();

    public t6d(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
