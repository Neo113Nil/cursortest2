package com.vk.im.engine.models.dialogs;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.dialogs.FolderType;
import xsna.epx;
import xsna.urd0;

/* compiled from: RecommendedFolder.kt */
/* loaded from: classes2.dex */
public final class RecommendedFolder extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<RecommendedFolder> CREATOR = new a();
    public final int b;
    public final String c;
    public final FolderType d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RecommendedFolder> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RecommendedFolder a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            FolderType.b bVar = FolderType.Companion;
            String H2 = serializer.H();
            bVar.getClass();
            return new RecommendedFolder(u, H, FolderType.b.a(H2));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecommendedFolder[i];
        }
    }

    public RecommendedFolder(int i, String str, FolderType folderType) {
        this.b = i;
        this.c = str;
        this.d = folderType;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d.j());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedFolder)) {
            return false;
        }
        RecommendedFolder recommendedFolder = (RecommendedFolder) obj;
        return this.b == recommendedFolder.b && epx.f(this.c, recommendedFolder.c) && this.d == recommendedFolder.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return "RecommendedFolder(id=" + this.b + ", name=" + this.c + ", type=" + this.d + ')';
    }
}
