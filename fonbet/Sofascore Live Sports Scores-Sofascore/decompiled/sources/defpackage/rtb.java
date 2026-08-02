package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rtb {
    public final sx2 a;

    public rtb(yal yalVar, yal yalVar2, o5f o5fVar) {
        this.a = new sx2(yalVar, yalVar2, o5fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(sx2 sx2Var, Object obj, Object obj2) {
        int j;
        int size;
        int i;
        yal yalVar;
        int size2;
        int i2;
        yal yalVar2 = (yal) sx2Var.a;
        int i3 = zz7.c;
        int i4 = 1;
        int h = h03.h(1);
        val valVar = yal.d;
        if (yalVar2 == valVar) {
            h *= 2;
        }
        switch (yalVar2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                j = 8;
                int i5 = j + h;
                yalVar = (yal) sx2Var.b;
                int h2 = h03.h(2);
                if (yalVar == valVar) {
                    h2 *= 2;
                }
                switch (yalVar.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i4 = 8;
                        break;
                    case 1:
                        ((Float) obj2).getClass();
                        i4 = 4;
                        break;
                    case 2:
                        i4 = h03.j(((Long) obj2).longValue());
                        break;
                    case 3:
                        i4 = h03.j(((Long) obj2).longValue());
                        break;
                    case 4:
                        i4 = h03.j(((Integer) obj2).intValue());
                        break;
                    case 5:
                        ((Long) obj2).getClass();
                        i4 = 8;
                        break;
                    case 6:
                        ((Integer) obj2).getClass();
                        i4 = 4;
                        break;
                    case 7:
                        ((Boolean) obj2).getClass();
                        break;
                    case 8:
                        if (obj2 instanceof ec2) {
                            size2 = ((ec2) obj2).size();
                            i2 = h03.i(size2);
                            i4 = i2 + size2;
                            break;
                        } else {
                            i4 = h03.g((String) obj2);
                        }
                    case 9:
                        i4 = ((hw8) ((s5) obj2)).a(null);
                        break;
                    case 10:
                        size2 = ((hw8) ((s5) obj2)).a(null);
                        i2 = h03.i(size2);
                        i4 = i2 + size2;
                        break;
                    case 11:
                        if (obj2 instanceof ec2) {
                            size2 = ((ec2) obj2).size();
                            i2 = h03.i(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            i2 = h03.i(size2);
                        }
                        i4 = i2 + size2;
                        break;
                    case 12:
                        i4 = h03.i(((Integer) obj2).intValue());
                        break;
                    case 13:
                        i4 = h03.j(((Integer) obj2).intValue());
                        break;
                    case 14:
                        ((Integer) obj2).getClass();
                        i4 = 4;
                        break;
                    case 15:
                        ((Long) obj2).getClass();
                        i4 = 8;
                        break;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i4 = h03.i((intValue >> 31) ^ (intValue << 1));
                        break;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i4 = h03.j((longValue >> 63) ^ (longValue << 1));
                        break;
                    default:
                        cp4.h("There is no way to get here, but the compiler thinks otherwise.");
                        break;
                }
            case 1:
                ((Float) obj).getClass();
                j = 4;
                int i52 = j + h;
                yalVar = (yal) sx2Var.b;
                int h22 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 2:
                j = h03.j(((Long) obj).longValue());
                int i522 = j + h;
                yalVar = (yal) sx2Var.b;
                int h222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 3:
                j = h03.j(((Long) obj).longValue());
                int i5222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h2222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 4:
                j = h03.j(((Integer) obj).intValue());
                int i52222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h22222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                j = 8;
                int i522222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                j = 4;
                int i5222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h2222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                j = 1;
                int i52222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h22222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 8:
                if (obj instanceof ec2) {
                    size = ((ec2) obj).size();
                    i = h03.i(size);
                    j = size + i;
                    int i522222222 = j + h;
                    yalVar = (yal) sx2Var.b;
                    int h222222222 = h03.h(2);
                    if (yalVar == valVar) {
                    }
                    switch (yalVar.ordinal()) {
                    }
                } else {
                    j = h03.g((String) obj);
                    int i5222222222 = j + h;
                    yalVar = (yal) sx2Var.b;
                    int h2222222222 = h03.h(2);
                    if (yalVar == valVar) {
                    }
                    switch (yalVar.ordinal()) {
                    }
                }
            case 9:
                j = ((hw8) ((s5) obj)).a(null);
                int i52222222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h22222222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 10:
                size = ((hw8) ((s5) obj)).a(null);
                i = h03.i(size);
                j = size + i;
                int i522222222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h222222222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 11:
                if (obj instanceof ec2) {
                    size = ((ec2) obj).size();
                    i = h03.i(size);
                } else {
                    size = ((byte[]) obj).length;
                    i = h03.i(size);
                }
                j = size + i;
                int i5222222222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h2222222222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 12:
                j = h03.i(((Integer) obj).intValue());
                int i52222222222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h22222222222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 13:
                j = h03.j(((Integer) obj).intValue());
                int i522222222222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h222222222222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                j = 4;
                int i5222222222222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h2222222222222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                j = 8;
                int i52222222222222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h22222222222222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                j = h03.i((intValue2 >> 31) ^ (intValue2 << 1));
                int i522222222222222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h222222222222222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                j = h03.j((longValue2 >> 63) ^ (longValue2 << 1));
                int i5222222222222222222 = j + h;
                yalVar = (yal) sx2Var.b;
                int h2222222222222222222 = h03.h(2);
                if (yalVar == valVar) {
                }
                switch (yalVar.ordinal()) {
                }
            default:
                cp4.h("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return 0;
    }
}
