package com.vk.dto.common;

import com.vk.core.serialize.Serializer;

/* compiled from: FriendFolder.kt */
/* loaded from: classes18.dex */
public class FriendFolder extends Serializer.StreamParcelableAdapter {
    public static final a CREATOR = new a();
    public long b;
    public String c = new String();

    /* compiled from: FriendFolder.kt */
    public static final class a extends Serializer.c<FriendFolder> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FriendFolder a(Serializer serializer) {
            FriendFolder friendFolder = new FriendFolder();
            friendFolder.b = serializer.w();
            friendFolder.c = serializer.H();
            return friendFolder;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            FriendFolder[] friendFolderArr = new FriendFolder[i];
            for (int i2 = 0; i2 < i; i2++) {
                friendFolderArr[i2] = new FriendFolder();
            }
            return friendFolderArr;
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
    }

    public final String toString() {
        return this.c;
    }
}
