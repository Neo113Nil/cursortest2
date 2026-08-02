package com.vk.dto.reactions;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import xsna.zcl;

/* compiled from: ReactionMeta.kt */
/* loaded from: classes18.dex */
public abstract class ReactionMeta implements Serializer.StreamParcelable {
    public static final Serializer.c<SimpleReactionMeta> CREATOR = new a();
    public final int b;
    public final String c;
    public final ReactionAsset d;
    public final int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SimpleReactionMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SimpleReactionMeta a(Serializer serializer) {
            return new SimpleReactionMeta(serializer.u(), serializer.H(), (ReactionAsset) serializer.G(ReactionAsset.class.getClassLoader()), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleReactionMeta[i];
        }
    }

    public ReactionMeta(int i, String str, ReactionAsset reactionAsset, int i2, zcl zclVar) {
        this.b = i;
        this.c = str;
        this.d = reactionAsset;
        this.e = i2;
    }

    public ReactionAsset d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e(int i) {
        Image image;
        ImageSize Ab;
        ReactionAsset d = d();
        if (d == null || (image = d.c) == null || (Ab = image.Ab(i, false)) == null) {
            return null;
        }
        return Ab.d.d;
    }

    public int f() {
        return this.e;
    }

    public final boolean g() {
        return getId() == 0;
    }

    public int getId() {
        return this.b;
    }

    public String getTitle() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
