package com.vk.dto.reactions;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;

/* compiled from: ReactionSet.kt */
/* loaded from: classes18.dex */
public final class ReactionSet implements Serializer.StreamParcelable {
    public static final Serializer.c<ReactionSet> CREATOR = new a();
    public final String b;
    public final ArrayList<ReactionMeta> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ReactionSet> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ReactionSet a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            ArrayList k = serializer.k(ReactionMeta.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new ReactionSet(H, k);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReactionSet[i];
        }
    }

    public ReactionSet(String str, ArrayList<ReactionMeta> arrayList) {
        this.b = str;
        this.c = arrayList;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.W(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
