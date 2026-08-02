package com.vk.dto.user;

import com.vk.core.serialize.Serializer;
import com.vk.dto.user.InvisibleLastSeenStatus;
import xsna.zcl;

/* compiled from: OnlineInfo.kt */
/* loaded from: classes18.dex */
public final class InvisibleStatus extends OnlineInfo {
    public static final Serializer.c<InvisibleStatus> CREATOR = new a();
    public final InvisibleLastSeenStatus b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InvisibleStatus> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InvisibleStatus a(Serializer serializer) {
            return new InvisibleStatus(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvisibleStatus[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvisibleStatus() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.i());
    }

    public /* synthetic */ InvisibleStatus(InvisibleLastSeenStatus invisibleLastSeenStatus, int i, zcl zclVar) {
        this((i & 1) != 0 ? InvisibleLastSeenStatus.NONE : invisibleLastSeenStatus);
    }

    public InvisibleStatus(InvisibleLastSeenStatus invisibleLastSeenStatus) {
        super(null);
        this.b = invisibleLastSeenStatus;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvisibleStatus(Serializer serializer, zcl zclVar) {
        this(InvisibleLastSeenStatus.a.a(r1));
        InvisibleLastSeenStatus.a aVar = InvisibleLastSeenStatus.Companion;
        int u = serializer.u();
        aVar.getClass();
    }
}
