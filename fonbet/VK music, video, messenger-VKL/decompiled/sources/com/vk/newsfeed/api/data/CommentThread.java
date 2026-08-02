package com.vk.newsfeed.api.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.PostAuthor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommentThread.kt */
/* loaded from: classes3.dex */
public final class CommentThread implements Serializer.StreamParcelable {
    public static final Serializer.c<CommentThread> CREATOR = new a();
    public int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List<NewsComment> f;
    public WallNegativeRepliesPlaceholder g;
    public String h;
    public final boolean i;
    public final PostAuthor j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommentThread> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommentThread a(Serializer serializer) {
            int u = serializer.u();
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            boolean m3 = serializer.m();
            ArrayList k = serializer.k(NewsComment.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new CommentThread(u, m, m2, m3, k, (WallNegativeRepliesPlaceholder) serializer.G(WallNegativeRepliesPlaceholder.class.getClassLoader()), serializer.H(), serializer.m(), (PostAuthor) serializer.G(PostAuthor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommentThread[i];
        }
    }

    public CommentThread(int i, boolean z, boolean z2, boolean z3, List<NewsComment> list, WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder, String str, boolean z4, PostAuthor postAuthor) {
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = list;
        this.g = wallNegativeRepliesPlaceholder;
        this.h = str;
        this.i = z4;
        this.j = postAuthor;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.W(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.i0(this.j);
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
