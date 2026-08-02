package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.rN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2304rN<ModelType, StateType> {
    public static byte[] A0A;
    public static final C2304rN A0B;
    public EnumC2305rO A00;
    public EnumC2296rE A01;
    public String A02;
    public boolean A03;
    public final boolean A04;
    public final C2304rN A05;
    public final ModelType A06;
    public final StateType A07;
    public final String A08;
    public final List<ViewpointAction<ModelType, StateType>> A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, 92, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, 83, 91, 70, 66, 79};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A03(InterfaceC2295rD interfaceC2295rD) {
        Iterator<ViewpointAction<ModelType, StateType>> it = this.A09.iterator();
        while (it.hasNext()) {
            it.next().A6R(this, interfaceC2295rD);
        }
        EnumC2296rE A9U = interfaceC2295rD.A9U(this);
        this.A01 = A9U;
        if (A9U == EnumC2296rE.A02) {
            this.A03 = true;
        }
    }

    static {
        A02();
        A0B = new C2304rN(null, null, A01(48, 5, 44), A01(48, 5, 44), Collections.emptyList(), A0B, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2304rN(C2306rP<ModelType, StateType> c2306rP) {
        this(r1, r2, r3, r4, r5, r6, r7);
        Object obj;
        Object obj2;
        String str;
        String str2;
        List list;
        List list2;
        C2304rN c2304rN;
        boolean z;
        obj = c2306rP.A03;
        obj2 = c2306rP.A04;
        str = c2306rP.A06;
        str2 = c2306rP.A06;
        list = c2306rP.A01;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = c2306rP.A01;
        }
        c2304rN = c2306rP.A00;
        z = c2306rP.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C2304rN(ModelType modeltype, StateType statetype, String str, String str2, List<ViewpointAction<ModelType, StateType>> list, C2304rN c2304rN, boolean z) {
        this.A00 = EnumC2305rO.A02;
        if (!(modeltype instanceof View)) {
            this.A06 = modeltype;
            this.A07 = statetype;
            this.A08 = str;
            this.A02 = str2;
            this.A05 = c2304rN;
            this.A03 = false;
            this.A09 = list;
            this.A04 = z;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> C2306rP<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C2306rP<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A03;
    }
}
