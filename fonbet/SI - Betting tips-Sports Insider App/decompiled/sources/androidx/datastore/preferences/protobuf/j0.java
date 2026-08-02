package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f1631a;

    public j0(s1 s1Var, s1 s1Var2, f1.i iVar) {
        this.f1631a = new i0(s1Var, s1Var2, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(i0 i0Var, Object obj, Object obj2) {
        int g02;
        int size;
        int f02;
        s1 s1Var;
        int size2;
        int f03;
        s1 s1Var2 = i0Var.f1621a;
        int i5 = t.f1698c;
        int i10 = 1;
        int e0 = o.e0(1);
        p1 p1Var = s1.f1693d;
        if (s1Var2 == p1Var) {
            e0 *= 2;
        }
        switch (s1Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                g02 = 8;
                int i11 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e02 = o.e0(2);
                if (s1Var == p1Var) {
                    e02 *= 2;
                }
                switch (s1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i10 = 8;
                        return i10 + e02 + i11;
                    case 1:
                        ((Float) obj2).getClass();
                        i10 = 4;
                        return i10 + e02 + i11;
                    case 2:
                        i10 = o.g0(((Long) obj2).longValue());
                        return i10 + e02 + i11;
                    case 3:
                        i10 = o.g0(((Long) obj2).longValue());
                        return i10 + e02 + i11;
                    case 4:
                        i10 = o.g0(((Integer) obj2).intValue());
                        return i10 + e02 + i11;
                    case 5:
                        ((Long) obj2).getClass();
                        i10 = 8;
                        return i10 + e02 + i11;
                    case 6:
                        ((Integer) obj2).getClass();
                        i10 = 4;
                        return i10 + e02 + i11;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i10 + e02 + i11;
                    case 8:
                        if (!(obj2 instanceof i)) {
                            i10 = o.d0((String) obj2);
                            return i10 + e02 + i11;
                        }
                        size2 = ((i) obj2).size();
                        f03 = o.f0(size2);
                        i10 = f03 + size2;
                        return i10 + e02 + i11;
                    case 9:
                        i10 = ((y) ((a) obj2)).a(null);
                        return i10 + e02 + i11;
                    case 10:
                        size2 = ((y) ((a) obj2)).a(null);
                        f03 = o.f0(size2);
                        i10 = f03 + size2;
                        return i10 + e02 + i11;
                    case 11:
                        if (obj2 instanceof i) {
                            size2 = ((i) obj2).size();
                            f03 = o.f0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            f03 = o.f0(size2);
                        }
                        i10 = f03 + size2;
                        return i10 + e02 + i11;
                    case 12:
                        i10 = o.f0(((Integer) obj2).intValue());
                        return i10 + e02 + i11;
                    case 13:
                        i10 = o.g0(((Integer) obj2).intValue());
                        return i10 + e02 + i11;
                    case 14:
                        ((Integer) obj2).getClass();
                        i10 = 4;
                        return i10 + e02 + i11;
                    case 15:
                        ((Long) obj2).getClass();
                        i10 = 8;
                        return i10 + e02 + i11;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i10 = o.f0((intValue >> 31) ^ (intValue << 1));
                        return i10 + e02 + i11;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i10 = o.g0((longValue >> 63) ^ (longValue << 1));
                        return i10 + e02 + i11;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                g02 = 4;
                int i112 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e022 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 2:
                g02 = o.g0(((Long) obj).longValue());
                int i1122 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e0222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 3:
                g02 = o.g0(((Long) obj).longValue());
                int i11222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e02222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 4:
                g02 = o.g0(((Integer) obj).intValue());
                int i112222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e022222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                g02 = 8;
                int i1122222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e0222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                g02 = 4;
                int i11222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e02222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                g02 = 1;
                int i112222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e022222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 8:
                if (obj instanceof i) {
                    size = ((i) obj).size();
                    f02 = o.f0(size);
                    g02 = size + f02;
                    int i1122222222 = g02 + e0;
                    s1Var = i0Var.f1622b;
                    int e0222222222 = o.e0(2);
                    if (s1Var == p1Var) {
                    }
                    switch (s1Var.ordinal()) {
                    }
                } else {
                    g02 = o.d0((String) obj);
                    int i11222222222 = g02 + e0;
                    s1Var = i0Var.f1622b;
                    int e02222222222 = o.e0(2);
                    if (s1Var == p1Var) {
                    }
                    switch (s1Var.ordinal()) {
                    }
                }
            case 9:
                g02 = ((y) ((a) obj)).a(null);
                int i112222222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e022222222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 10:
                size = ((y) ((a) obj)).a(null);
                f02 = o.f0(size);
                g02 = size + f02;
                int i1122222222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e0222222222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 11:
                if (obj instanceof i) {
                    size = ((i) obj).size();
                    f02 = o.f0(size);
                } else {
                    size = ((byte[]) obj).length;
                    f02 = o.f0(size);
                }
                g02 = size + f02;
                int i11222222222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e02222222222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 12:
                g02 = o.f0(((Integer) obj).intValue());
                int i112222222222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e022222222222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 13:
                g02 = o.g0(((Integer) obj).intValue());
                int i1122222222222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e0222222222222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                g02 = 4;
                int i11222222222222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e02222222222222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                g02 = 8;
                int i112222222222222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e022222222222222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                g02 = o.f0((intValue2 >> 31) ^ (intValue2 << 1));
                int i1122222222222222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e0222222222222222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                g02 = o.g0((longValue2 >> 63) ^ (longValue2 << 1));
                int i11222222222222222222 = g02 + e0;
                s1Var = i0Var.f1622b;
                int e02222222222222222222 = o.e0(2);
                if (s1Var == p1Var) {
                }
                switch (s1Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
