package com.vk.clips.favorites.impl.ui.folders.list;

import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.km50;
import xsna.shy;
import xsna.u2e;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ClipsFavoriteFoldersListState.kt */
/* loaded from: classes16.dex */
public interface ClipsFavoriteFoldersListState extends km50 {

    /* compiled from: ClipsFavoriteFoldersListState.kt */
    public static final class Content implements ClipsFavoriteFoldersListState {
        public final u2e b;
        public final List<u2e> c;
        public final a d;
        public final LoadingState e;
        public final int f;
        public final int g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsFavoriteFoldersListState.kt */
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

        /* compiled from: ClipsFavoriteFoldersListState.kt */
        public interface a {

            /* compiled from: ClipsFavoriteFoldersListState.kt */
            /* renamed from: com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListState$Content$a$a, reason: collision with other inner class name */
            public static final class C0595a implements a {
                public static final C0595a a = new C0595a();
            }

            /* compiled from: ClipsFavoriteFoldersListState.kt */
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

        public Content(u2e u2eVar, List<u2e> list, a aVar, LoadingState loadingState, int i, int i2) {
            this.b = u2eVar;
            this.c = list;
            this.d = aVar;
            this.e = loadingState;
            this.f = i;
            this.g = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Content a(Content content, u2e u2eVar, ArrayList arrayList, a aVar, LoadingState loadingState, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                u2eVar = content.b;
            }
            u2e u2eVar2 = u2eVar;
            List list = arrayList;
            if ((i3 & 2) != 0) {
                list = content.c;
            }
            List list2 = list;
            if ((i3 & 4) != 0) {
                aVar = content.d;
            }
            a aVar2 = aVar;
            if ((i3 & 8) != 0) {
                loadingState = content.e;
            }
            LoadingState loadingState2 = loadingState;
            if ((i3 & 16) != 0) {
                i = content.f;
            }
            int i4 = i;
            if ((i3 & 32) != 0) {
                i2 = content.g;
            }
            content.getClass();
            return new Content(u2eVar2, list2, aVar2, loadingState2, i4, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return epx.f(this.b, content.b) && epx.f(this.c, content.c) && epx.f(this.d, content.d) && this.e == content.e && this.f == content.f && this.g == content.g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.g) + shy.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(allClipsFolder=");
            sb.append(this.b);
            sb.append(", items=");
            sb.append(this.c);
            sb.append(", paginationState=");
            sb.append(this.d);
            sb.append(", loadingState=");
            sb.append(this.e);
            sb.append(", totalFoldersCount=");
            sb.append(this.f);
            sb.append(", maxAllowedFoldersCount=");
            return vu5.b(sb, this.g, ')');
        }
    }

    /* compiled from: ClipsFavoriteFoldersListState.kt */
    public static final class a implements ClipsFavoriteFoldersListState {
        public static final a b = new a();
    }

    /* compiled from: ClipsFavoriteFoldersListState.kt */
    public static final class b implements ClipsFavoriteFoldersListState {
        public static final b b = new b();
    }
}
