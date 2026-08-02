package com.vk.clips.favorites.impl.ui.folders.content;

import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.j3e;
import xsna.ms9;
import xsna.u2e;
import xsna.xl50;

/* compiled from: ClipsFavoriteFolderContentListPatch.kt */
/* loaded from: classes16.dex */
public interface d extends xl50 {

    /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
    public static final class a implements d {
        public final u2e b;

        public a(u2e u2eVar) {
            this.b = u2eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FolderUpdated(folder=" + this.b + ')';
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
    public static final class b implements d {
        public final List<String> b;

        public b(List<String> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ItemsRemoved(videoUniqueKeys="), this.b);
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
    public interface c extends d {

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        public static final class a implements c {
            public static final a b = new a();
        }

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        public static final class b implements c {
            public static final b b = new b();
        }

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.content.d$c$c, reason: collision with other inner class name */
        public static final class C0591c implements c {
            public static final C0591c b = new C0591c();
        }

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.content.d$c$d, reason: collision with other inner class name */
        public static final class C0592d implements c {
            public final j3e b;

            public C0592d(j3e j3eVar) {
                this.b = j3eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0592d) && epx.f(this.b, ((C0592d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "NextSuccess(response=" + this.b + ')';
            }
        }

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        public static final class e implements c {
            public static final e b = new e();
        }

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        public static final class f implements c {
            public static final f b = new f();
        }

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        public static final class g implements c {
            public final j3e b;

            public g(j3e j3eVar) {
                this.b = j3eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(response=" + this.b + ')';
            }
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
    /* renamed from: com.vk.clips.favorites.impl.ui.folders.content.d$d, reason: collision with other inner class name */
    public interface InterfaceC0593d extends d {

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.content.d$d$a */
        public static final class a implements InterfaceC0593d {
            public static final a b = new a();
        }

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.content.d$d$b */
        public static final class b implements InterfaceC0593d {
            public static final b b = new b();
        }

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.content.d$d$c */
        public static final class c implements InterfaceC0593d {
            public final String b;

            public c(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ItemClicked(videoFileUniqueKey="), this.b, ')');
            }
        }

        /* compiled from: ClipsFavoriteFolderContentListPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.content.d$d$d, reason: collision with other inner class name */
        public static final class C0594d implements InterfaceC0593d {
            public static final C0594d b = new C0594d();
        }
    }
}
