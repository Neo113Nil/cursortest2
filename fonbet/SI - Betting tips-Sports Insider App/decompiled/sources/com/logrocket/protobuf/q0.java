package com.logrocket.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i5, Object obj, Object obj2) {
        int q;
        int size;
        int p10;
        f2 f2Var;
        int size2;
        int p11;
        p0 p0Var = (p0) obj;
        o0 o0Var = (o0) obj2;
        int i10 = 0;
        if (p0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : p0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            o0Var.getClass();
            int o3 = p.o(i5);
            com.google.firebase.messaging.x xVar = o0Var.f6764a;
            f2 f2Var2 = (f2) xVar.f6182a;
            int i11 = u.f6789c;
            int i12 = 1;
            int o4 = p.o(1);
            c2 c2Var = f2.f6697d;
            if (f2Var2 == c2Var) {
                o4 *= 2;
            }
            switch (f2Var2.ordinal()) {
                case 0:
                    ((Double) key).getClass();
                    q = 8;
                    int i13 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o7 = p.o(2);
                    if (f2Var == c2Var) {
                        o7 *= 2;
                    }
                    switch (f2Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            i12 = 8;
                            int i14 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i14, i14, o3, i10);
                        case 1:
                            ((Float) value).getClass();
                            i12 = 4;
                            int i142 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i142, i142, o3, i10);
                        case 2:
                            i12 = p.q(((Long) value).longValue());
                            int i1422 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i1422, i1422, o3, i10);
                        case 3:
                            i12 = p.q(((Long) value).longValue());
                            int i14222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i14222, i14222, o3, i10);
                        case 4:
                            i12 = p.l(((Integer) value).intValue());
                            int i142222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i142222, i142222, o3, i10);
                        case 5:
                            ((Long) value).getClass();
                            i12 = 8;
                            int i1422222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i1422222, i1422222, o3, i10);
                        case 6:
                            ((Integer) value).getClass();
                            i12 = 4;
                            int i14222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i14222222, i14222222, o3, i10);
                        case 7:
                            ((Boolean) value).getClass();
                            int i142222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i142222222, i142222222, o3, i10);
                        case 8:
                            if (value instanceof j) {
                                size2 = ((j) value).size();
                                p11 = p.p(size2);
                                i12 = p11 + size2;
                                int i1422222222 = i12 + o7 + i13;
                                i10 = androidx.appcompat.widget.c1.z(i1422222222, i1422222222, o3, i10);
                            } else {
                                i12 = p.n((String) value);
                                int i14222222222 = i12 + o7 + i13;
                                i10 = androidx.appcompat.widget.c1.z(i14222222222, i14222222222, o3, i10);
                            }
                        case 9:
                            i12 = ((z) ((a) value)).b(null);
                            int i142222222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i142222222222, i142222222222, o3, i10);
                        case 10:
                            size2 = ((z) ((a) value)).b(null);
                            p11 = p.p(size2);
                            i12 = p11 + size2;
                            int i1422222222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i1422222222222, i1422222222222, o3, i10);
                        case 11:
                            if (value instanceof j) {
                                size2 = ((j) value).size();
                                p11 = p.p(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                p11 = p.p(size2);
                            }
                            i12 = p11 + size2;
                            int i14222222222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i14222222222222, i14222222222222, o3, i10);
                        case 12:
                            i12 = p.p(((Integer) value).intValue());
                            int i142222222222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i142222222222222, i142222222222222, o3, i10);
                        case 13:
                            i12 = value instanceof eh.d ? p.l(((eh.d) value).a()) : p.l(((Integer) value).intValue());
                            int i1422222222222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i1422222222222222, i1422222222222222, o3, i10);
                        case 14:
                            ((Integer) value).getClass();
                            i12 = 4;
                            int i14222222222222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i14222222222222222, i14222222222222222, o3, i10);
                        case 15:
                            ((Long) value).getClass();
                            i12 = 8;
                            int i142222222222222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i142222222222222222, i142222222222222222, o3, i10);
                        case 16:
                            i12 = p.m(((Integer) value).intValue());
                            int i1422222222222222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i1422222222222222222, i1422222222222222222, o3, i10);
                        case 17:
                            long longValue = ((Long) value).longValue();
                            i12 = p.q((longValue >> 63) ^ (longValue << 1));
                            int i14222222222222222222 = i12 + o7 + i13;
                            i10 = androidx.appcompat.widget.c1.z(i14222222222222222222, i14222222222222222222, o3, i10);
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                case 1:
                    ((Float) key).getClass();
                    q = 4;
                    int i132 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o72 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 2:
                    q = p.q(((Long) key).longValue());
                    int i1322 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o722 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 3:
                    q = p.q(((Long) key).longValue());
                    int i13222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o7222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 4:
                    q = p.l(((Integer) key).intValue());
                    int i132222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o72222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 5:
                    ((Long) key).getClass();
                    q = 8;
                    int i1322222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o722222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 6:
                    ((Integer) key).getClass();
                    q = 4;
                    int i13222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o7222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 7:
                    ((Boolean) key).getClass();
                    q = 1;
                    int i132222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o72222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 8:
                    if (key instanceof j) {
                        size = ((j) key).size();
                        p10 = p.p(size);
                        q = size + p10;
                        int i1322222222 = q + o4;
                        f2Var = (f2) xVar.f6184c;
                        int o722222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    } else {
                        q = p.n((String) key);
                        int i13222222222 = q + o4;
                        f2Var = (f2) xVar.f6184c;
                        int o7222222222 = p.o(2);
                        if (f2Var == c2Var) {
                        }
                        switch (f2Var.ordinal()) {
                        }
                    }
                case 9:
                    q = ((z) ((a) key)).b(null);
                    int i132222222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o72222222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 10:
                    size = ((z) ((a) key)).b(null);
                    p10 = p.p(size);
                    q = size + p10;
                    int i1322222222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o722222222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 11:
                    if (key instanceof j) {
                        size = ((j) key).size();
                        p10 = p.p(size);
                    } else {
                        size = ((byte[]) key).length;
                        p10 = p.p(size);
                    }
                    q = size + p10;
                    int i13222222222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o7222222222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 12:
                    q = p.p(((Integer) key).intValue());
                    int i132222222222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o72222222222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 13:
                    q = key instanceof eh.d ? p.l(((eh.d) key).a()) : p.l(((Integer) key).intValue());
                    int i1322222222222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o722222222222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 14:
                    ((Integer) key).getClass();
                    q = 4;
                    int i13222222222222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o7222222222222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 15:
                    ((Long) key).getClass();
                    q = 8;
                    int i132222222222222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o72222222222222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 16:
                    q = p.m(((Integer) key).intValue());
                    int i1322222222222222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o722222222222222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                case 17:
                    long longValue2 = ((Long) key).longValue();
                    q = p.q((longValue2 << 1) ^ (longValue2 >> 63));
                    int i13222222222222222222 = q + o4;
                    f2Var = (f2) xVar.f6184c;
                    int o7222222222222222222 = p.o(2);
                    if (f2Var == c2Var) {
                    }
                    switch (f2Var.ordinal()) {
                    }
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return i10;
    }
}
