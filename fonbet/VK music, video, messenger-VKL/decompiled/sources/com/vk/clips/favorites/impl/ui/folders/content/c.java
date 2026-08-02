package com.vk.clips.favorites.impl.ui.folders.content;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ClipsFavoriteFolderContentListParams.kt */
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: ClipsFavoriteFolderContentListParams.kt */
    public static final class a implements c {
        public final UserId a;
        public final FavoriteFolderId b;
        public final String c;
        public final FavoriteFolderId d;
        public final String e;

        public a(UserId userId, FavoriteFolderId favoriteFolderId, String str, FavoriteFolderId favoriteFolderId2, String str2) {
            this.a = userId;
            this.b = favoriteFolderId;
            this.c = str;
            this.d = favoriteFolderId2;
            this.e = str2;
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.c
        public final String a() {
            return this.c;
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.c
        public final FavoriteFolderId b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + urd0.a((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31, this.c)) * 31);
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.c
        public final UserId q() {
            return this.a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsPicker(ownerId=");
            sb.append(this.a);
            sb.append(", folderId=");
            sb.append(this.b);
            sb.append(", folderName=");
            sb.append(this.c);
            sb.append(", targetFolderId=");
            sb.append(this.d);
            sb.append(", targetFolderName=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListParams.kt */
    public static final class b implements c {
        public final UserId a;
        public final FavoriteFolderId b;
        public final String c;

        public b(UserId userId, FavoriteFolderId favoriteFolderId, String str) {
            this.a = userId;
            this.b = favoriteFolderId;
            this.c = str;
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.c
        public final String a() {
            return this.c;
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.c
        public final FavoriteFolderId b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.c
        public final UserId q() {
            return this.a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(ownerId=");
            sb.append(this.a);
            sb.append(", folderId=");
            sb.append(this.b);
            sb.append(", folderName=");
            return ho8.a(sb, this.c, ')');
        }
    }

    String a();

    FavoriteFolderId b();

    UserId q();
}
