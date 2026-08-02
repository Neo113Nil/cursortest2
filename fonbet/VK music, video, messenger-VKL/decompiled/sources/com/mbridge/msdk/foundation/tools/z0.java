package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: StringSetEncoder.java */
/* loaded from: classes13.dex */
class z0 implements FastKV.b<Set<String>> {
    static final z0 a = new z0();

    private z0() {
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<String> a(byte[] bArr, int i, int i2) {
        int i3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            b0 b0Var = new b0(bArr, i);
            int i4 = i + i2;
            while (true) {
                i3 = b0Var.b;
                if (i3 >= i4) {
                    break;
                }
                linkedHashSet.add(b0Var.e(b0Var.g()));
            }
            if (i3 != i4) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.b
    public byte[] a(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i2 = 0;
        for (String str : set) {
            if (str == null) {
                i += 5;
                iArr[i2] = -1;
            } else {
                int b = b0.b(str);
                strArr[i2] = str;
                iArr[i2] = b;
                i = b0.f(b) + b + i;
            }
            i2++;
        }
        b0 b0Var = new b0(i);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            b0Var.h(i4);
            if (i4 >= 0) {
                b0Var.c(strArr[i3]);
            }
        }
        return b0Var.a;
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.b
    public String a() {
        return "StringSet";
    }
}
