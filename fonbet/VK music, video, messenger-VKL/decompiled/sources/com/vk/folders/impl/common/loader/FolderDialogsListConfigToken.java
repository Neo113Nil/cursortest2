package com.vk.folders.impl.common.loader;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dialogslist.api.list.DialogsListConfigToken;
import xsna.vu5;

/* compiled from: FolderDialogsListConfigToken.kt */
/* loaded from: classes18.dex */
public final class FolderDialogsListConfigToken implements DialogsListConfigToken {
    public static final a CREATOR = new a();
    public final int b;

    /* compiled from: FolderDialogsListConfigToken.kt */
    public static final class a implements Parcelable.Creator<FolderDialogsListConfigToken> {
        @Override // android.os.Parcelable.Creator
        public final FolderDialogsListConfigToken createFromParcel(Parcel parcel) {
            return new FolderDialogsListConfigToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FolderDialogsListConfigToken[] newArray(int i) {
            return new FolderDialogsListConfigToken[i];
        }
    }

    public FolderDialogsListConfigToken(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FolderDialogsListConfigToken) && this.b == ((FolderDialogsListConfigToken) obj).b;
    }

    @Override // com.vk.dialogslist.api.list.DialogsListConfigToken
    public final int getId() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("FolderDialogsListConfigToken(id="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }

    public FolderDialogsListConfigToken(Parcel parcel) {
        this(parcel.readInt());
    }
}
