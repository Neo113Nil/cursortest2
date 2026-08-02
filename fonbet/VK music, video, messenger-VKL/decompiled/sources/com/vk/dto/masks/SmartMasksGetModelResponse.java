package com.vk.dto.masks;

import com.vk.core.serialize.Serializer;
import xsna.a0a;
import xsna.i5s;

/* compiled from: SmartMasksGetModelResponse.kt */
/* loaded from: classes18.dex */
public final class SmartMasksGetModelResponse extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SmartMasksGetModelResponse> CREATOR = new a();
    public static final SmartMasksGetModelResponse f = new SmartMasksGetModelResponse(1, 1, i5s.a(new StringBuilder("https://"), a0a.d, "/source/masks/android_model.zip"), null);
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SmartMasksGetModelResponse> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SmartMasksGetModelResponse a(Serializer serializer) {
            return new SmartMasksGetModelResponse(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SmartMasksGetModelResponse[i];
        }
    }

    public SmartMasksGetModelResponse(int i, int i2, String str, String str2) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.V(Integer.valueOf(this.c));
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public SmartMasksGetModelResponse(Serializer serializer) {
        this(serializer.u(), serializer.u(), serializer.H(), serializer.H());
    }
}
