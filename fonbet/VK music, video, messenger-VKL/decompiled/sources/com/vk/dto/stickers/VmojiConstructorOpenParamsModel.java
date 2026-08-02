package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiConstructorOpenParamsModel.kt */
/* loaded from: classes18.dex */
public final class VmojiConstructorOpenParamsModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiConstructorOpenParamsModel> CREATOR = new a();

    @pmi0("controlId")
    private final String controlId;

    @pmi0("controlItemValue")
    private final String controlItemValue;

    @pmi0("sectionId")
    private final String sectionId;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiConstructorOpenParamsModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiConstructorOpenParamsModel a(Serializer serializer) {
            return new VmojiConstructorOpenParamsModel(serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiConstructorOpenParamsModel[i];
        }
    }

    public VmojiConstructorOpenParamsModel() {
        this(null, null, null, 7, null);
    }

    public final String Ab() {
        return this.controlItemValue;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.sectionId);
        serializer.j0(this.controlId);
        serializer.j0(this.controlItemValue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiConstructorOpenParamsModel)) {
            return false;
        }
        VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel = (VmojiConstructorOpenParamsModel) obj;
        return epx.f(this.sectionId, vmojiConstructorOpenParamsModel.sectionId) && epx.f(this.controlId, vmojiConstructorOpenParamsModel.controlId) && epx.f(this.controlItemValue, vmojiConstructorOpenParamsModel.controlItemValue);
    }

    public final int hashCode() {
        String str = this.sectionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.controlId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.controlItemValue;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiConstructorOpenParamsModel(sectionId=");
        sb.append(this.sectionId);
        sb.append(", controlId=");
        sb.append(this.controlId);
        sb.append(", controlItemValue=");
        return ho8.a(sb, this.controlItemValue, ')');
    }

    public final String v0() {
        return this.sectionId;
    }

    public final String zb() {
        return this.controlId;
    }

    public /* synthetic */ VmojiConstructorOpenParamsModel(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public VmojiConstructorOpenParamsModel(String str, String str2, String str3) {
        this.sectionId = str;
        this.controlId = str2;
        this.controlItemValue = str3;
    }
}
