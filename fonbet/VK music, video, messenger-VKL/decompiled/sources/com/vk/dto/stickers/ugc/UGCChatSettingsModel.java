package com.vk.dto.stickers.ugc;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: UGCChatSettingsModel.kt */
/* loaded from: classes18.dex */
public final class UGCChatSettingsModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<UGCChatSettingsModel> CREATOR = new a();
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UGCChatSettingsModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UGCChatSettingsModel a(Serializer serializer) {
            return new UGCChatSettingsModel(serializer.w(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UGCChatSettingsModel[i];
        }
    }

    public UGCChatSettingsModel() {
        this(0L, false, false, false, false, false, false, 127, null);
    }

    public static UGCChatSettingsModel zb(UGCChatSettingsModel uGCChatSettingsModel, boolean z, int i) {
        long j = uGCChatSettingsModel.b;
        if ((i & 2) != 0) {
            z = uGCChatSettingsModel.c;
        }
        return new UGCChatSettingsModel(j, z, uGCChatSettingsModel.d, (i & 8) != 0 ? uGCChatSettingsModel.e : false, uGCChatSettingsModel.f, uGCChatSettingsModel.g, uGCChatSettingsModel.h);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UGCChatSettingsModel)) {
            return false;
        }
        UGCChatSettingsModel uGCChatSettingsModel = (UGCChatSettingsModel) obj;
        return this.b == uGCChatSettingsModel.b && this.c == uGCChatSettingsModel.c && this.d == uGCChatSettingsModel.d && this.e == uGCChatSettingsModel.e && this.f == uGCChatSettingsModel.f && this.g == uGCChatSettingsModel.g && this.h == uGCChatSettingsModel.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UGCChatSettingsModel(chatId=");
        sb.append(this.b);
        sb.append(", isHiddenInKb=");
        sb.append(this.c);
        sb.append(", isHiddenEverywhere=");
        sb.append(this.d);
        sb.append(", needToShowOnboarding=");
        sb.append(this.e);
        sb.append(", isEditBanned=");
        sb.append(this.f);
        sb.append(", canEdit=");
        sb.append(this.g);
        sb.append(", canHide=");
        return q0.a(sb, this.h, ')');
    }

    public /* synthetic */ UGCChatSettingsModel(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6);
    }

    public UGCChatSettingsModel(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }
}
