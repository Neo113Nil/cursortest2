package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.ironsource.W3;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C15709i extends C3171pc implements AnonymousClass24 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C3042nW, C3027nH>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"aGn7PxmzFVI8pseTQREUgmPTmRn3c3Qe", "IWvjCaXZ0UNcR9QsrMbq4cwMoqcNO01w", "zzFjDnJDYUSk81dZD4bwc1a4UEkJCW7c", "AfyHMFnboWczrAj6gDYBkfictlCviIiz", "ZudaxJy5LTgucmpkRl3p1l6eoKWNEQ3P", "dJwbxLQye6WGEEeA8Aa4EZe7IW3A7RwI", "l9ypC7Hglf3jtTkN6zxYkfXofkc9mvwo", "bL7rVgPoAdAWEHuIi5lDma"};
    public static final C15709i A0J = new C3030nK().A0p();

    @Deprecated
    public static final C15709i A0I = A0J;
    public static final String A0W = C5C.A0h(1000);
    public static final String A0Q = C5C.A0h(1001);
    public static final String A0R = C5C.A0h(1002);
    public static final String A0T = C5C.A0h(1003);
    public static final String A0M = C5C.A0h(1004);
    public static final String A0N = C5C.A0h(1005);
    public static final String A0K = C5C.A0h(1006);
    public static final String A0V = C5C.A0h(1007);
    public static final String A0b = C5C.A0h(1008);
    public static final String A0O = C5C.A0h(1009);
    public static final String A0Z = C5C.A0h(1010);
    public static final String A0a = C5C.A0h(1011);
    public static final String A0Y = C5C.A0h(TTAdConstant.IMAGE_MODE_1012);
    public static final String A0X = C5C.A0h(W3.i);
    public static final String A0P = C5C.A0h(W3.j);
    public static final String A0L = C5C.A0h(1015);
    public static final String A0S = C5C.A0h(W3.l);
    public static final String A0U = C5C.A0h(1017);
    public static final AnonymousClass23<C15709i> A0H = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nL
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C15709i A0p;
            A0p = new C3030nK(bundle).A0p();
            return A0p;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0M(SparseArray<Map<C3042nW, C3027nH>> sparseArray, SparseArray<Map<C3042nW, C3027nH>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
            if (indexOfKey < 0 || !A0O(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(Map<C3042nW, C3027nH> map, Map<C3042nW, C3027nH> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<C3042nW, C3027nH> entry : map.entrySet()) {
            C3042nW key = entry.getKey();
            if (!map2.containsKey(key) || !C5C.A1E(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public C15709i(C3030nK c3030nK) {
        super(c3030nK);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        SparseArray<Map<C3042nW, C3027nH>> sparseArray;
        SparseBooleanArray sparseBooleanArray;
        boolean z14;
        z = c3030nK.A0C;
        this.A0C = z;
        z2 = c3030nK.A06;
        this.A06 = z2;
        z3 = c3030nK.A07;
        this.A07 = z3;
        z4 = c3030nK.A05;
        this.A05 = z4;
        z5 = c3030nK.A09;
        this.A09 = z5;
        z6 = c3030nK.A02;
        this.A02 = z6;
        z7 = c3030nK.A03;
        this.A03 = z7;
        z8 = c3030nK.A00;
        this.A00 = z8;
        z9 = c3030nK.A01;
        this.A01 = z9;
        z10 = c3030nK.A08;
        this.A08 = z10;
        z11 = c3030nK.A0B;
        this.A0B = z11;
        z12 = c3030nK.A0D;
        this.A0D = z12;
        z13 = c3030nK.A04;
        this.A04 = z13;
        sparseArray = c3030nK.A0E;
        this.A0E = sparseArray;
        sparseBooleanArray = c3030nK.A0F;
        this.A0F = sparseBooleanArray;
        z14 = c3030nK.A0A;
        this.A0A = z14;
    }

    public static C15709i A02(Context context) {
        return new C3030nK(context).A0p();
    }

    public static /* synthetic */ String A0B() {
        String str = A0Z;
        String[] strArr = A0G;
        if (strArr[0].charAt(18) == strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[2] = "q21ODw35C4tKhNLL23C7ozdatpTCdbhY";
        return str;
    }

    public static /* synthetic */ String A0C() {
        String str = A0a;
        if (A0G[2].charAt(14) == 'E') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "0vyQVqHCYWPXhQOTbdu3xGlynIqeANBb";
        strArr[6] = "GRyh1cWelO50ilzlDGPvyp85W4uMwhgp";
        return str;
    }

    public static /* synthetic */ String A0H() {
        String str = A0P;
        String[] strArr = A0G;
        if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[7] = "pTwWTj5vm";
        return str;
    }

    public static /* synthetic */ String A0J() {
        String str = A0M;
        String[] strArr = A0G;
        if (strArr[3].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A0G[7] = "PzaI";
        return str;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final C3030nK A0P() {
        return new C3030nK(this);
    }

    @Deprecated
    public final C3027nH A0Q(int i, C3042nW c3042nW) {
        Map<C3042nW, C3027nH> map = this.A0E.get(i);
        if (map != null) {
            return map.get(c3042nW);
        }
        return null;
    }

    public final boolean A0R(int i) {
        return this.A0F.get(i);
    }

    @Deprecated
    public final boolean A0S(int i, C3042nW c3042nW) {
        Map<C3042nW, C3027nH> map = this.A0E.get(i);
        return map != null && map.containsKey(c3042nW);
    }

    @Override // com.facebook.ads.redexgen.core.C3171pc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A0G;
            if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[0] = "DcJRbXEfPLE5m3v2P2UTupH85cHshXE1";
            strArr2[1] = "UExlWRKDpxUDxSKj0OTM8Ioa8cI6hcv0";
            if (cls == cls2) {
                C15709i c15709i = (C15709i) obj;
                if (super.equals(c15709i) && this.A0C == c15709i.A0C && this.A06 == c15709i.A06 && this.A07 == c15709i.A07 && this.A05 == c15709i.A05 && this.A09 == c15709i.A09 && this.A02 == c15709i.A02 && this.A03 == c15709i.A03 && this.A00 == c15709i.A00 && this.A01 == c15709i.A01 && this.A08 == c15709i.A08 && this.A0B == c15709i.A0B && this.A0D == c15709i.A0D && this.A04 == c15709i.A04 && A0N(this.A0F, c15709i.A0F) && A0M(this.A0E, c15709i.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.C3171pc
    public final int hashCode() {
        return (((((((((((((((((((((((((((1 * 31) + super.hashCode()) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
