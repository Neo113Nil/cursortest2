package com.vk.clips.favorites.api.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;

/* compiled from: ClipsFavoritesFolderRenamingParams.kt */
/* loaded from: classes16.dex */
public interface ClipsFavoritesFolderRenamingParams extends Parcelable {

    /* compiled from: ClipsFavoritesFolderRenamingParams.kt */
    public static final class RenameFolder implements ClipsFavoritesFolderRenamingParams {
        public static final Parcelable.Creator<RenameFolder> CREATOR = new a();
        public final boolean b;
        public final UserId c;
        public final FavoriteFolderId.Id d;
        public final String e;

        /* compiled from: ClipsFavoritesFolderRenamingParams.kt */
        public static final class a implements Parcelable.Creator<RenameFolder> {
            @Override // android.os.Parcelable.Creator
            public final RenameFolder createFromParcel(Parcel parcel) {
                return new RenameFolder(parcel.readInt() != 0, (UserId) parcel.readParcelable(RenameFolder.class.getClassLoader()), (FavoriteFolderId.Id) parcel.readParcelable(RenameFolder.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RenameFolder[] newArray(int i) {
                return new RenameFolder[i];
            }
        }

        public RenameFolder(boolean z, UserId userId, FavoriteFolderId.Id id, String str) {
            this.b = z;
            this.c = userId;
            this.d = id;
            this.e = str;
        }

        @Override // com.vk.clips.favorites.api.params.ClipsFavoritesFolderRenamingParams
        public final boolean J0() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RenameFolder)) {
                return false;
            }
            RenameFolder renameFolder = (RenameFolder) obj;
            return this.b == renameFolder.b && epx.f(this.c, renameFolder.c) && epx.f(this.d, renameFolder.d) && epx.f(this.e, renameFolder.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d.b, bh10.a(Boolean.hashCode(this.b) * 31, 31, this.c.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RenameFolder(forceDarkTheme=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", folderId=");
            sb.append(this.d);
            sb.append(", folderName=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeString(this.e);
        }
    }

    boolean J0();

    /* compiled from: ClipsFavoritesFolderRenamingParams.kt */
    public static final class CreateFolder implements ClipsFavoritesFolderRenamingParams {
        public static final Parcelable.Creator<CreateFolder> CREATOR = new a();
        public final boolean b;
        public final UserId c;
        public final boolean d;

        /* compiled from: ClipsFavoritesFolderRenamingParams.kt */
        public static final class a implements Parcelable.Creator<CreateFolder> {
            @Override // android.os.Parcelable.Creator
            public final CreateFolder createFromParcel(Parcel parcel) {
                return new CreateFolder(parcel.readInt() != 0, (UserId) parcel.readParcelable(CreateFolder.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final CreateFolder[] newArray(int i) {
                return new CreateFolder[i];
            }
        }

        public CreateFolder(boolean z, UserId userId, boolean z2) {
            this.b = z;
            this.c = userId;
            this.d = z2;
        }

        @Override // com.vk.clips.favorites.api.params.ClipsFavoritesFolderRenamingParams
        public final boolean J0() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateFolder)) {
                return false;
            }
            CreateFolder createFolder = (CreateFolder) obj;
            return this.b == createFolder.b && epx.f(this.c, createFolder.c) && this.d == createFolder.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + bh10.a(Boolean.hashCode(this.b) * 31, 31, this.c.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CreateFolder(forceDarkTheme=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", showCreateFolderSnackbar=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeParcelable(this.c, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ CreateFolder(boolean z, UserId userId, boolean z2, int i, zcl zclVar) {
            this(z, userId, (i & 4) != 0 ? true : z2);
        }
    }
}
