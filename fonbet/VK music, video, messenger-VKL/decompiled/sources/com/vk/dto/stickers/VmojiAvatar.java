package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiAvatar.kt */
/* loaded from: classes18.dex */
public final class VmojiAvatar extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiAvatar> CREATOR = new a();

    @pmi0("characterId")
    private final String characterId;

    @pmi0("id")
    private final String id;

    @pmi0("isActive")
    private boolean isActive;

    @pmi0("name")
    private final String name;

    @pmi0("openEditParams")
    private final VmojiConstructorOpenParamsModel openEditParams;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiAvatar> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiAvatar a(Serializer serializer) {
            return new VmojiAvatar(serializer.H(), serializer.H(), serializer.H(), serializer.m(), (VmojiConstructorOpenParamsModel) serializer.G(VmojiConstructorOpenParamsModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiAvatar[i];
        }
    }

    public /* synthetic */ VmojiAvatar(String str, String str2, String str3, boolean z, VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel, int i, zcl zclVar) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : vmojiConstructorOpenParamsModel);
    }

    public static VmojiAvatar zb(VmojiAvatar vmojiAvatar, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = vmojiAvatar.id;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = vmojiAvatar.characterId;
        }
        String str4 = str2;
        String str5 = vmojiAvatar.name;
        if ((i & 8) != 0) {
            z = vmojiAvatar.isActive;
        }
        VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel = vmojiAvatar.openEditParams;
        vmojiAvatar.getClass();
        return new VmojiAvatar(str3, str4, str5, z, vmojiConstructorOpenParamsModel);
    }

    public final String Ab() {
        return this.characterId;
    }

    public final VmojiConstructorOpenParamsModel Bb() {
        return this.openEditParams;
    }

    public final boolean Cb() {
        return this.isActive;
    }

    public final void Db(boolean z) {
        this.isActive = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.id);
        serializer.j0(this.characterId);
        serializer.j0(this.name);
        serializer.L(this.isActive ? (byte) 1 : (byte) 0);
        serializer.i0(this.openEditParams);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VmojiAvatar.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        VmojiAvatar vmojiAvatar = (VmojiAvatar) obj;
        return epx.f(this.id, vmojiAvatar.id) && epx.f(this.characterId, vmojiAvatar.characterId);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.characterId.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        return "VmojiAvatar(id=" + this.id + ", characterId=" + this.characterId + ", name=" + this.name + ", isActive=" + this.isActive + ", openEditParams=" + this.openEditParams + ')';
    }

    public VmojiAvatar(String str, String str2, String str3, boolean z, VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel) {
        this.id = str;
        this.characterId = str2;
        this.name = str3;
        this.isActive = z;
        this.openEditParams = vmojiConstructorOpenParamsModel;
    }
}
