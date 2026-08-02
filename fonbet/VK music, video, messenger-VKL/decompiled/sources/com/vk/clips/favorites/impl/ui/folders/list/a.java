package com.vk.clips.favorites.impl.ui.folders.list;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: ClipsFavoriteFoldersListAction.kt */
/* loaded from: classes16.dex */
public interface a extends kj50 {

    /* compiled from: ClipsFavoriteFoldersListAction.kt */
    /* renamed from: com.vk.clips.favorites.impl.ui.folders.list.a$a, reason: collision with other inner class name */
    public static final class C0596a implements a {
        public static final C0596a b = new C0596a();
    }

    /* compiled from: ClipsFavoriteFoldersListAction.kt */
    public interface b extends a {

        /* compiled from: ClipsFavoriteFoldersListAction.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.list.a$b$a, reason: collision with other inner class name */
        public static final class C0597a implements b {
            public static final C0597a b = new C0597a();
        }

        /* compiled from: ClipsFavoriteFoldersListAction.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.list.a$b$b, reason: collision with other inner class name */
        public static final class C0598b implements b {
            public static final C0598b b = new C0598b();
        }

        /* compiled from: ClipsFavoriteFoldersListAction.kt */
        public static final class c implements b {
            public final UserId b;
            public final FavoriteFolderId c;
            public final String d;

            public c(UserId userId, FavoriteFolderId favoriteFolderId, String str) {
                this.b = userId;
                this.c = favoriteFolderId;
                this.d = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FolderClick(ownerId=");
                sb.append(this.b);
                sb.append(", folderId=");
                sb.append(this.c);
                sb.append(", folderName=");
                return ho8.a(sb, this.d, ')');
            }
        }
    }

    /* compiled from: ClipsFavoriteFoldersListAction.kt */
    public static final class c implements a {
        public static final c b = new c();
    }

    /* compiled from: ClipsFavoriteFoldersListAction.kt */
    public static final class d implements a {
        public static final d b = new d();
    }

    /* compiled from: ClipsFavoriteFoldersListAction.kt */
    public static final class e implements a {
        public static final e b = new e();
    }

    /* compiled from: ClipsFavoriteFoldersListAction.kt */
    public static final class f implements a {
        public static final f b = new f();
    }
}
