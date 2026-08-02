package com.vk.clips.favorites.impl.ui.folders.content;

import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.km50;
import xsna.ur;
import xsna.zrp;

/* compiled from: ClipsFavoriteFolderContentListState.kt */
/* loaded from: classes16.dex */
public interface ClipsFavoriteFolderContentListState extends km50 {

    /* compiled from: ClipsFavoriteFolderContentListState.kt */
    public static final class Content implements ClipsFavoriteFolderContentListState {
        public final String b;
        public final c c;
        public final List<VideoFile> d;
        public final a e;
        public final LoadingState f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsFavoriteFolderContentListState.kt */
        public static final class LoadingState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ LoadingState[] $VALUES;
            public static final LoadingState ERROR_NEXT;
            public static final LoadingState LOADING_NEXT;
            public static final LoadingState NONE;
            public static final LoadingState REFRESHING;

            static {
                LoadingState loadingState = new LoadingState("NONE", 0);
                NONE = loadingState;
                LoadingState loadingState2 = new LoadingState("LOADING_NEXT", 1);
                LOADING_NEXT = loadingState2;
                LoadingState loadingState3 = new LoadingState("ERROR_NEXT", 2);
                ERROR_NEXT = loadingState3;
                LoadingState loadingState4 = new LoadingState("REFRESHING", 3);
                REFRESHING = loadingState4;
                LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4};
                $VALUES = loadingStateArr;
                $ENTRIES = new asp(loadingStateArr);
            }

            public LoadingState() {
                throw null;
            }

            public static LoadingState valueOf(String str) {
                return (LoadingState) Enum.valueOf(LoadingState.class, str);
            }

            public static LoadingState[] values() {
                return (LoadingState[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipsFavoriteFolderContentListState.kt */
        public interface a {

            /* compiled from: ClipsFavoriteFolderContentListState.kt */
            /* renamed from: com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState$Content$a$a, reason: collision with other inner class name */
            public static final class C0585a implements a {
                public static final C0585a a = new C0585a();
            }

            /* compiled from: ClipsFavoriteFolderContentListState.kt */
            public static final class b implements a {
                public final String a;

                public b(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("NextFrom(nextFrom="), this.a, ')');
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(String str, c cVar, List<? extends VideoFile> list, a aVar, LoadingState loadingState) {
            this.b = str;
            this.c = cVar;
            this.d = list;
            this.e = aVar;
            this.f = loadingState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Content a(Content content, String str, c cVar, ArrayList arrayList, a aVar, LoadingState loadingState, int i) {
            if ((i & 1) != 0) {
                str = content.b;
            }
            String str2 = str;
            if ((i & 2) != 0) {
                cVar = content.c;
            }
            c cVar2 = cVar;
            List list = arrayList;
            if ((i & 4) != 0) {
                list = content.d;
            }
            List list2 = list;
            if ((i & 8) != 0) {
                aVar = content.e;
            }
            a aVar2 = aVar;
            if ((i & 16) != 0) {
                loadingState = content.f;
            }
            content.getClass();
            return new Content(str2, cVar2, list2, aVar2, loadingState);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return epx.f(this.b, content.b) && epx.f(this.c, content.c) && epx.f(this.d, content.d) && epx.f(this.e, content.e) && this.f == content.f;
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState
        public final c g() {
            return this.c;
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState
        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d)) * 31);
        }

        public final String toString() {
            return "Content(title=" + this.b + ", multiSelectState=" + this.c + ", videoFiles=" + this.d + ", paginationState=" + this.e + ", loadingState=" + this.f + ')';
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListState.kt */
    public static final class a implements ClipsFavoriteFolderContentListState {
        public final String b;
        public final c c;

        public a(String str, c cVar) {
            this.b = str;
            this.c = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState
        public final c g() {
            return this.c;
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState
        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Error(title=" + this.b + ", multiSelectState=" + this.c + ')';
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListState.kt */
    public static final class b implements ClipsFavoriteFolderContentListState {
        public final String b;
        public final c c;

        public b(String str, c cVar) {
            this.b = str;
            this.c = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState
        public final c g() {
            return this.c;
        }

        @Override // com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState
        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Loading(title=" + this.b + ", multiSelectState=" + this.c + ')';
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListState.kt */
    public interface c {

        /* compiled from: ClipsFavoriteFolderContentListState.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: ClipsFavoriteFolderContentListState.kt */
        public static final class b implements c {
            public final Set<String> a;

            public b(Set<String> set) {
                this.a = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ur.c(new StringBuilder("Enabled(selectedVideosUniqueKeys="), this.a, ')');
            }
        }
    }

    c g();

    String getTitle();
}
