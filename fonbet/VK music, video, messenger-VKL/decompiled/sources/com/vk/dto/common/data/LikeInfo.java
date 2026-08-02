package com.vk.dto.common.data;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;

/* loaded from: classes18.dex */
public final class LikeInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<LikeInfo> CREATOR = new a();
    public final int b;
    public final Bundle c;
    public final boolean d;

    public class a extends Serializer.c<LikeInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LikeInfo a(@NonNull Serializer serializer) {
            return new LikeInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LikeInfo[i];
        }
    }

    public LikeInfo(int i, @NonNull Bundle bundle, boolean z) {
        this.b = i;
        this.c = bundle;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.K(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    public LikeInfo(Serializer serializer) {
        this.b = serializer.u();
        this.c = serializer.o(LikeInfo.class.getClassLoader());
        this.d = serializer.m();
    }
}
