package com.vk.dto.newsfeed;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;

/* compiled from: CommentDonut.kt */
/* loaded from: classes18.dex */
public final class CommentDonut extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CommentDonut> CREATOR = new a();
    public final boolean b;
    public final Placeholder c;

    /* compiled from: CommentDonut.kt */
    public static final class Placeholder implements Serializer.StreamParcelable {
        public static final Serializer.c<Placeholder> CREATOR = new a();
        public final String b;
        public final LinkButton c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Placeholder> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Placeholder a(Serializer serializer) {
                return new Placeholder(serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Placeholder[i];
            }
        }

        public Placeholder(String str, LinkButton linkButton) {
            this.b = str;
            this.c = linkButton;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
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

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommentDonut> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommentDonut a(Serializer serializer) {
            return new CommentDonut(serializer.m(), (Placeholder) serializer.G(Placeholder.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommentDonut[i];
        }
    }

    public CommentDonut(boolean z, Placeholder placeholder) {
        this.b = z;
        this.c = placeholder;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.i0(this.c);
    }
}
