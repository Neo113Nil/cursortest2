package com.vk.voip.ui.assessment;

import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import xsna.cow0;

/* compiled from: VoipAssessmentActivityArguments.kt */
/* loaded from: classes7.dex */
public final class VoipAssessmentActivityArguments extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VoipAssessmentActivityArguments> CREATOR = new a();
    public final cow0 b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VoipAssessmentActivityArguments> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VoipAssessmentActivityArguments a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            CallId callId = new CallId(H);
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            long w = serializer.w();
            String H2 = serializer.H();
            if (H2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int u = serializer.u();
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            boolean m3 = serializer.m();
            int u2 = serializer.u();
            Integer valueOf = Integer.valueOf(u2);
            if (u2 == -1) {
                valueOf = null;
            }
            Integer num = valueOf;
            Serializer.StreamParcelable G = serializer.G(VoipCallSource.class.getClassLoader());
            if (G != null) {
                return new VoipAssessmentActivityArguments(new cow0(callId, userId, w, H2, u, m, m2, m3, num, (VoipCallSource) G, serializer.x(), serializer.m()));
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VoipAssessmentActivityArguments[i];
        }
    }

    public VoipAssessmentActivityArguments(cow0 cow0Var) {
        this.b = cow0Var;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        cow0 cow0Var = this.b;
        serializer.j0(cow0Var.a.b);
        serializer.e0(cow0Var.b);
        serializer.Y(cow0Var.c);
        serializer.j0(cow0Var.d);
        serializer.S(cow0Var.e);
        serializer.L(cow0Var.f ? (byte) 1 : (byte) 0);
        serializer.L(cow0Var.g ? (byte) 1 : (byte) 0);
        serializer.L(cow0Var.h ? (byte) 1 : (byte) 0);
        Integer num = cow0Var.i;
        serializer.S(num != null ? num.intValue() : -1);
        serializer.i0(cow0Var.j);
        serializer.b0(cow0Var.k);
        serializer.L(cow0Var.l ? (byte) 1 : (byte) 0);
    }
}
