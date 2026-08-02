package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PopupStickersSettingsFlags.kt */
/* loaded from: classes18.dex */
public final class PopupStickersSettingsFlags extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PopupStickersSettingsFlags> CREATOR = new a();

    @pmi0("animationInterrupterSettingEnabled")
    private final boolean animationInterrupterSettingEnabled;

    @pmi0("disabledPeerIdsSettingEnabled")
    private final boolean disabledPeerIdsSettingEnabled;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PopupStickersSettingsFlags> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PopupStickersSettingsFlags a(Serializer serializer) {
            return new PopupStickersSettingsFlags(serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PopupStickersSettingsFlags[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PopupStickersSettingsFlags() {
        this(r2, r2, 3, null);
        boolean z = false;
    }

    public final boolean Ab() {
        return this.disabledPeerIdsSettingEnabled;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.disabledPeerIdsSettingEnabled ? (byte) 1 : (byte) 0);
        serializer.L(this.animationInterrupterSettingEnabled ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupStickersSettingsFlags)) {
            return false;
        }
        PopupStickersSettingsFlags popupStickersSettingsFlags = (PopupStickersSettingsFlags) obj;
        return this.disabledPeerIdsSettingEnabled == popupStickersSettingsFlags.disabledPeerIdsSettingEnabled && this.animationInterrupterSettingEnabled == popupStickersSettingsFlags.animationInterrupterSettingEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.animationInterrupterSettingEnabled) + (Boolean.hashCode(this.disabledPeerIdsSettingEnabled) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupStickersSettingsFlags(disabledPeerIdsSettingEnabled=");
        sb.append(this.disabledPeerIdsSettingEnabled);
        sb.append(", animationInterrupterSettingEnabled=");
        return q0.a(sb, this.animationInterrupterSettingEnabled, ')');
    }

    public final boolean zb() {
        return this.animationInterrupterSettingEnabled;
    }

    public /* synthetic */ PopupStickersSettingsFlags(boolean z, boolean z2, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public PopupStickersSettingsFlags(boolean z, boolean z2) {
        this.disabledPeerIdsSettingEnabled = z;
        this.animationInterrupterSettingEnabled = z2;
    }
}
