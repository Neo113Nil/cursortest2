package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import androidx.compose.material.TextFieldImplKt;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.1u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04271u implements InterfaceC0633Al {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC2301rK A01;
    public final InterfaceC2300rJ A02;
    public final C2293rB A03;
    public final C2293rB A04;
    public final List<Rect> A05;
    public final Map<String, C2292rA> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A03() {
        A09 = new byte[]{Ascii.DC4, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, Ascii.DLE, Ascii.ESC, 9, 45, Ascii.GS, Ascii.US, Ascii.DLE, Base64.padSymbol, 38, 63, 63, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, Ascii.RS, 2, Ascii.VT, Ascii.EM, 63, 8, Ascii.GS, 2, Ascii.US, Ascii.EM};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0633Al
    public final void A6P(List<C2304rN<?, ?>> list) {
        Collection A00;
        Collection A002;
        if (list != null && !list.isEmpty()) {
            A06(list);
        }
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            String obj = toString();
            List<Rect> list2 = this.A05;
            A00 = this.A04.A00();
            A002 = this.A03.A00();
            new C2291r9(obj, this, list2, A00, A002);
            throw new NullPointerException(A02(143, 7, 55));
        }
    }

    static {
        A03();
        A0B = C04271u.class.getSimpleName();
    }

    public C04271u(InterfaceC2300rJ interfaceC2300rJ) {
        this(interfaceC2300rJ, false, false);
    }

    public C04271u(InterfaceC2300rJ interfaceC2300rJ, boolean z, boolean z2) {
        this.A06 = new HashMap();
        this.A04 = new C2293rB();
        this.A03 = new C2293rB();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC2300rJ;
        this.A08 = z;
        this.A07 = z2;
    }

    public static Rect A00(C2292rA c2292rA) {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        if (c2292rA != null) {
            rect = c2292rA.A02;
            if (rect.top != Integer.MIN_VALUE) {
                rect2 = c2292rA.A02;
                if (rect2.left != Integer.MIN_VALUE) {
                    rect3 = c2292rA.A02;
                    if (rect3.right != Integer.MIN_VALUE) {
                        rect4 = c2292rA.A02;
                        if (rect4.bottom != Integer.MIN_VALUE) {
                            rect5 = c2292rA.A02;
                            return rect5;
                        }
                    }
                }
            }
        }
        throw new IllegalStateException(A02(0, 143, 9));
    }

    private C2292rA A01(C2304rN c2304rN, Rect rect, Rect rect2) {
        boolean A06;
        Rect rect3;
        List list;
        C2292rA c2292rA = this.A06.get(c2304rN.A02);
        A06 = this.A04.A06(c2304rN);
        if (A06) {
            if (c2292rA != null) {
                c2292rA.A01 = EnumC2296rE.A04;
            } else {
                c2292rA = C2292rA.A03(this.A00);
                this.A06.put(c2304rN.A02, c2292rA);
            }
        }
        if (c2292rA != null) {
            rect3 = c2292rA.A02;
            rect3.set(rect2);
            list = c2292rA.A03;
            list.add(new Rect(rect));
        }
        return c2292rA;
    }

    private void A04(C2293rB c2293rB) {
        Collection<C2304rN> A01;
        List list;
        A01 = c2293rB.A01();
        for (C2304rN c2304rN : A01) {
            C2292rA c2292rA = this.A06.get(c2304rN.A02);
            if (c2292rA == null) {
                if (0 != 0) {
                    String str = A02(TextFieldImplKt.AnimationDuration, 36, 26) + c2304rN.A02;
                    throw new NullPointerException(A02(186, 10, 36));
                }
            } else {
                c2292rA.A01 = EnumC2296rE.A03;
                list = c2292rA.A03;
                list.clear();
                if (A07(c2304rN)) {
                    c2304rN.A03(this);
                }
                if (this.A08) {
                    this.A06.remove(c2292rA);
                }
            }
        }
    }

    private void A05(C2293rB c2293rB) {
        Collection<C2304rN> A00;
        A00 = c2293rB.A00();
        for (C2304rN visible : A00) {
            if (A07(visible)) {
                visible.A03(this);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(List<C2304rN<?, ?>> list) {
        for (C2304rN<?, ?> c2304rN : list) {
            if (this.A06.get(c2304rN.A02) != null) {
                boolean z = c2304rN.A04;
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[7] = "nPwsVC";
                if (z) {
                    EnumC2296rE enumC2296rE = c2304rN.A01;
                    String[] strArr = A0A;
                    if (strArr[5].length() != strArr[6].length()) {
                        A0A[0] = "zj";
                        if (enumC2296rE != null) {
                            if (c2304rN.A01 == EnumC2296rE.A03) {
                                c2304rN.A03(this);
                            }
                        }
                    } else {
                        String[] strArr2 = A0A;
                        strArr2[4] = "4Gl";
                        strArr2[2] = "t26";
                        if (enumC2296rE != null) {
                            if (c2304rN.A01 == EnumC2296rE.A03) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public static boolean A07(C2304rN<?, ?> c2304rN) {
        if (c2304rN.A04) {
            EnumC2305rO enumC2305rO = c2304rN.A00;
            EnumC2305rO enumC2305rO2 = EnumC2305rO.A04;
            String[] strArr = A0A;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0A[7] = "iICfc1p4CYNR1vFaz";
            if (enumC2305rO == enumC2305rO2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r4 != false) goto L20;
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0633Al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A46(C2304rN c2304rN, Rect rect, Rect rect2, boolean z) {
        boolean A06;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        Rect rect7;
        List list;
        Rect rect8;
        Rect rect9;
        List list2;
        A01(c2304rN, rect, rect2);
        C2304rN c2304rN2 = c2304rN.A05;
        C2304rN parentViewpointData = C2304rN.A0B;
        if (c2304rN2 == parentViewpointData || c2304rN2 == null) {
            return;
        }
        A06 = this.A03.A06(c2304rN2);
        C2292rA c2292rA = this.A06.get(c2304rN2.A02);
        if (A06) {
            if (c2292rA == null) {
                c2292rA = C2292rA.A03(this.A00);
                rect8 = c2292rA.A02;
                rect8.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                this.A06.put(c2304rN2.A02, c2292rA);
            } else {
                list2 = c2292rA.A03;
                list2.clear();
                if (this.A07) {
                    boolean A04 = c2304rN2.A04();
                    if (A0A[0].length() != 2) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0A;
                    strArr[5] = "H54AceamXdthsYm78mtSydojeY2Fx6Sn";
                    strArr[6] = "PVfiJKIqQ6L9JP1UYx1CLIU2NiQOo1Yq";
                }
                EnumC2296rE enumC2296rE = EnumC2296rE.A04;
                if (A0A[7].length() == 26) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[5] = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH";
                strArr2[6] = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE";
                c2292rA.A01 = enumC2296rE;
            }
            if (z) {
                rect9 = c2292rA.A02;
                rect9.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        } else if (z && c2292rA != null) {
            rect3 = c2292rA.A02;
            int i = rect2.left;
            rect4 = c2292rA.A02;
            int min = Math.min(i, rect4.left);
            int i2 = rect2.top;
            rect5 = c2292rA.A02;
            int min2 = Math.min(i2, rect5.top);
            int i3 = rect2.right;
            rect6 = c2292rA.A02;
            int max = Math.max(i3, rect6.right);
            int i4 = rect2.bottom;
            rect7 = c2292rA.A02;
            rect3.set(min, min2, max, Math.max(i4, rect7.bottom));
        }
        if (c2292rA == null) {
            return;
        }
        list = c2292rA.A03;
        list.add(new Rect(rect));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0633Al
    public final void A4h(long j, List<Rect> list) {
        Collection A01;
        Collection<C2304rN> A012;
        List list2;
        this.A00 = j;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (hasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                A01 = this.A04.A01();
                Iterator it2 = A01.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((C2304rN) it2.next()).A02);
                    } else {
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((C2304rN) it2.next()).A02);
                    }
                }
                A012 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (C2304rN viewpointData : A012) {
                    this.A06.remove(viewpointData.A02);
                }
                Iterator<C2292rA> it3 = this.A06.values().iterator();
                while (it3.hasNext()) {
                    list2 = it3.next().A03;
                    list2.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2295rD
    public final void A8D(C2304rN c2304rN, Rect rect) {
        List<Rect> list;
        if (!this.A06.containsKey(c2304rN.A02)) {
            return;
        }
        rect.setEmpty();
        list = this.A06.get(c2304rN.A02).A03;
        for (Rect rect2 : list) {
            if (A0A[7].length() == 26) {
                throw new RuntimeException();
            }
            A0A[7] = "8y";
            rect.union(rect2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2295rD
    public final EnumC2296rE A9U(C2304rN c2304rN) {
        EnumC2296rE enumC2296rE;
        if (!this.A06.containsKey(c2304rN.A02)) {
            return EnumC2296rE.A02;
        }
        enumC2296rE = this.A06.get(c2304rN.A02).A01;
        if (c2304rN.A04) {
            if (c2304rN.A00 == EnumC2305rO.A04) {
                EnumC2296rE viewState = EnumC2296rE.A03;
                return viewState;
            }
            EnumC2296rE viewState2 = EnumC2296rE.A04;
            if (enumC2296rE == viewState2 && !c2304rN.A04()) {
                EnumC2296rE viewState3 = EnumC2296rE.A02;
                return viewState3;
            }
        }
        return enumC2296rE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2295rD
    public final void A9W(Rect rect) {
        rect.setEmpty();
        Iterator<Rect> it = this.A05.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2295rD
    public final float A9X(C2304rN c2304rN) {
        List<Rect> list;
        C2292rA c2292rA = this.A06.get(c2304rN.A02);
        if (c2292rA != null) {
            Rect A00 = A00(c2292rA);
            int height = A00.height() * A00.width();
            int totalVisibleArea = 0;
            list = c2292rA.A03;
            for (Rect rect : list) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / height;
        }
        return 0.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0633Al
    public final void AJu(InterfaceC2301rK interfaceC2301rK) {
        this.A01 = interfaceC2301rK;
    }
}
