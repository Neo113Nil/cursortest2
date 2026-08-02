package com.vk.clips.uploader.impl.model;

import android.os.Parcel;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.lhg;
import xsna.zcl;

/* compiled from: DraftRef.kt */
/* loaded from: classes17.dex */
public abstract class DraftRef implements Serializer.StreamParcelable {
    public static final Serializer.c<DraftRef> CREATOR = new a();

    /* compiled from: DraftRef.kt */
    public static final class Full extends DraftRef {
        public final ClipsDraft b;

        public Full(ClipsDraft clipsDraft) {
            super(null);
            this.b = clipsDraft;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(1);
            serializer.i0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Full) && epx.f(this.b, ((Full) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Full(draft=" + this.b + ')';
        }
    }

    /* compiled from: DraftRef.kt */
    public static final class IdOnly extends DraftRef {
        public final String b;

        public IdOnly(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(2);
            serializer.j0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IdOnly) && epx.f(this.b, ((IdOnly) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("IdOnly(draftId="), this.b, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DraftRef> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DraftRef a(Serializer serializer) {
            int u = serializer.u();
            if (u == 1) {
                return new Full((ClipsDraft) serializer.G(ClipsDraft.class.getClassLoader()));
            }
            if (u == 2) {
                return new IdOnly(serializer.H());
            }
            throw new IllegalStateException(lhg.a(u, "Unknown DraftRef type: "));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DraftRef[i];
        }
    }

    public /* synthetic */ DraftRef(zcl zclVar) {
        this();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public DraftRef() {
    }
}
