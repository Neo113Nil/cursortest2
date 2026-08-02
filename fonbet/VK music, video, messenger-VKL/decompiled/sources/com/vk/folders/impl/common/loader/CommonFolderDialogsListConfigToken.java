package com.vk.folders.impl.common.loader;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dialogslist.api.list.DialogsListConfigToken;

/* compiled from: CommonFolderDialogsListConfigToken.kt */
/* loaded from: classes18.dex */
public final class CommonFolderDialogsListConfigToken implements DialogsListConfigToken {
    public static final a CREATOR = new a();
    public final int b;

    /* compiled from: CommonFolderDialogsListConfigToken.kt */
    public static final class a implements Parcelable.Creator<CommonFolderDialogsListConfigToken> {
        @Override // android.os.Parcelable.Creator
        public final CommonFolderDialogsListConfigToken createFromParcel(Parcel parcel) {
            return new CommonFolderDialogsListConfigToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommonFolderDialogsListConfigToken[] newArray(int i) {
            return new CommonFolderDialogsListConfigToken[i];
        }
    }

    public CommonFolderDialogsListConfigToken() {
        this.b = -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.dialogslist.api.list.DialogsListConfigToken
    public final int getId() {
        return this.b;
    }

    public CommonFolderDialogsListConfigToken(Parcel parcel) {
        this();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
