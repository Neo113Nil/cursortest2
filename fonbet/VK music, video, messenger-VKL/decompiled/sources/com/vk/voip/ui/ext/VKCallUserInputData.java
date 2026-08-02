package com.vk.voip.ui.ext;

import android.util.LruCache;
import com.vk.core.serialize.Serializer;
import com.vk.voip.dto.profiles.VoipFriendStatus;
import xsna.fxj0;
import xsna.ixj0;
import xsna.sew0;
import xsna.whr0;

/* compiled from: VKCallUserInputData.kt */
/* loaded from: classes7.dex */
public final class VKCallUserInputData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VKCallUserInputData> CREATOR = new a();
    public final whr0 b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VKCallUserInputData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VKCallUserInputData a(Serializer serializer) {
            return new VKCallUserInputData(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VKCallUserInputData[i];
        }
    }

    public VKCallUserInputData(whr0 whr0Var) {
        this.b = whr0Var;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        whr0 whr0Var = this.b;
        serializer.j0(whr0Var.a);
        sew0 sew0Var = whr0Var.b;
        if (sew0Var instanceof sew0.b) {
            serializer.L((byte) 1);
            serializer.S(0);
            sew0.b bVar = (sew0.b) sew0Var;
            serializer.j0(bVar.a());
            String h = ixj0.h(bVar.b);
            if (h == null) {
                h = bVar.a();
            }
            serializer.m0(h);
            serializer.L(bVar.c ? (byte) 1 : (byte) 0);
        } else if (sew0Var instanceof sew0.c) {
            serializer.L((byte) 0);
            sew0.c cVar = (sew0.c) sew0Var;
            serializer.S(cVar.c);
            serializer.j0(cVar.b);
        }
        serializer.L(whr0Var.c ? (byte) 1 : (byte) 0);
        serializer.L(whr0Var.d ? (byte) 1 : (byte) 0);
        serializer.L(whr0Var.e ? (byte) 1 : (byte) 0);
        serializer.L(whr0Var.f ? (byte) 1 : (byte) 0);
        serializer.S(whr0Var.g.h());
        serializer.j0(whr0Var.h);
        serializer.j0(whr0Var.i);
        serializer.j0(whr0Var.j);
        serializer.j0(whr0Var.k);
        serializer.j0(whr0Var.l);
        serializer.L(whr0Var.n ? (byte) 1 : (byte) 0);
        serializer.L(whr0Var.p ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VKCallUserInputData(Serializer serializer) {
        this(new whr0(r1, r2, r4, r4, r5, r6, r8, r9, r10, r11, r12, r13 != null ? r13 : "", serializer.m(), serializer.m(), null, serializer.m(), null, null, 212992));
        sew0 cVar;
        String str;
        String H = serializer.H();
        H = H == null ? "" : H;
        if (serializer.m()) {
            serializer.u();
            LruCache<String, fxj0> lruCache = sew0.a;
            String H2 = serializer.H();
            cVar = sew0.a.a(H2 == null ? "" : H2, serializer.I(), serializer.m());
        } else {
            LruCache<String, fxj0> lruCache2 = sew0.a;
            int u = serializer.u();
            String H3 = serializer.H();
            cVar = new sew0.c(H3 == null ? "" : H3, u);
        }
        boolean m = serializer.m();
        sew0 sew0Var = cVar;
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        str = "";
        boolean m4 = serializer.m();
        VoipFriendStatus voipFriendStatus = VoipFriendStatus.values()[serializer.u()];
        String H4 = serializer.H();
        H4 = H4 == null ? str : H4;
        String H5 = serializer.H();
        H5 = H5 == null ? str : H5;
        String H6 = serializer.H();
        H6 = H6 == null ? str : H6;
        String H7 = serializer.H();
        H7 = H7 == null ? str : H7;
        String H8 = serializer.H();
    }
}
