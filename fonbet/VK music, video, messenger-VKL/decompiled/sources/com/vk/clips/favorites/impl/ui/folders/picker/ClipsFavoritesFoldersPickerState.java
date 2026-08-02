package com.vk.clips.favorites.impl.ui.folders.picker;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.km50;
import xsna.shy;
import xsna.u2e;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ClipsFavoritesFoldersPickerState.kt */
/* loaded from: classes16.dex */
public interface ClipsFavoritesFoldersPickerState extends km50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsFavoritesFoldersPickerState.kt */
    public static final class BottomSheetVisibility {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BottomSheetVisibility[] $VALUES;
        public static final BottomSheetVisibility HIDDEN;
        public static final BottomSheetVisibility VISIBLE;

        static {
            BottomSheetVisibility bottomSheetVisibility = new BottomSheetVisibility("VISIBLE", 0);
            VISIBLE = bottomSheetVisibility;
            BottomSheetVisibility bottomSheetVisibility2 = new BottomSheetVisibility("HIDDEN", 1);
            HIDDEN = bottomSheetVisibility2;
            BottomSheetVisibility[] bottomSheetVisibilityArr = {bottomSheetVisibility, bottomSheetVisibility2};
            $VALUES = bottomSheetVisibilityArr;
            $ENTRIES = new asp(bottomSheetVisibilityArr);
        }

        public BottomSheetVisibility() {
            throw null;
        }

        public static BottomSheetVisibility valueOf(String str) {
            return (BottomSheetVisibility) Enum.valueOf(BottomSheetVisibility.class, str);
        }

        public static BottomSheetVisibility[] values() {
            return (BottomSheetVisibility[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerState.kt */
    public static final class Content implements ClipsFavoritesFoldersPickerState {
        public final BottomSheetVisibility b;
        public final u2e c;
        public final Set<FavoriteFolderId> d;
        public final List<u2e> e;
        public final a f;
        public final ListLoadingState g;
        public final int h;
        public final int i;
        public final int j;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsFavoritesFoldersPickerState.kt */
        public static final class ListLoadingState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ListLoadingState[] $VALUES;
            public static final ListLoadingState ERROR;
            public static final ListLoadingState LOADING;
            public static final ListLoadingState NONE;

            static {
                ListLoadingState listLoadingState = new ListLoadingState("NONE", 0);
                NONE = listLoadingState;
                ListLoadingState listLoadingState2 = new ListLoadingState("LOADING", 1);
                LOADING = listLoadingState2;
                ListLoadingState listLoadingState3 = new ListLoadingState("ERROR", 2);
                ERROR = listLoadingState3;
                ListLoadingState[] listLoadingStateArr = {listLoadingState, listLoadingState2, listLoadingState3};
                $VALUES = listLoadingStateArr;
                $ENTRIES = new asp(listLoadingStateArr);
            }

            public ListLoadingState() {
                throw null;
            }

            public static ListLoadingState valueOf(String str) {
                return (ListLoadingState) Enum.valueOf(ListLoadingState.class, str);
            }

            public static ListLoadingState[] values() {
                return (ListLoadingState[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipsFavoritesFoldersPickerState.kt */
        public interface a {

            /* compiled from: ClipsFavoritesFoldersPickerState.kt */
            /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerState$Content$a$a, reason: collision with other inner class name */
            public static final class C0603a implements a {
                public static final C0603a a = new C0603a();
            }

            /* compiled from: ClipsFavoritesFoldersPickerState.kt */
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
        public Content(BottomSheetVisibility bottomSheetVisibility, u2e u2eVar, Set<? extends FavoriteFolderId> set, List<u2e> list, a aVar, ListLoadingState listLoadingState, int i, int i2, int i3) {
            this.b = bottomSheetVisibility;
            this.c = u2eVar;
            this.d = set;
            this.e = list;
            this.f = aVar;
            this.g = listLoadingState;
            this.h = i;
            this.i = i2;
            this.j = i3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Content a(Content content, BottomSheetVisibility bottomSheetVisibility, Set set, ArrayList arrayList, a aVar, ListLoadingState listLoadingState, int i, int i2, int i3, int i4) {
            if ((i4 & 1) != 0) {
                bottomSheetVisibility = content.b;
            }
            BottomSheetVisibility bottomSheetVisibility2 = bottomSheetVisibility;
            u2e u2eVar = content.c;
            if ((i4 & 4) != 0) {
                set = content.d;
            }
            Set set2 = set;
            List list = arrayList;
            if ((i4 & 8) != 0) {
                list = content.e;
            }
            List list2 = list;
            if ((i4 & 16) != 0) {
                aVar = content.f;
            }
            a aVar2 = aVar;
            if ((i4 & 32) != 0) {
                listLoadingState = content.g;
            }
            ListLoadingState listLoadingState2 = listLoadingState;
            int i5 = (i4 & 64) != 0 ? content.h : i;
            int i6 = (i4 & 128) != 0 ? content.i : i2;
            int i7 = (i4 & 256) != 0 ? content.j : i3;
            content.getClass();
            return new Content(bottomSheetVisibility2, u2eVar, set2, list2, aVar2, listLoadingState2, i5, i6, i7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.b == content.b && epx.f(this.c, content.c) && epx.f(this.d, content.d) && epx.f(this.e, content.e) && epx.f(this.f, content.f) && this.g == content.g && this.h == content.h && this.i == content.i && this.j == content.j;
        }

        public final int hashCode() {
            return Integer.hashCode(this.j) + shy.a(this.i, shy.a(this.h, (this.g.hashCode() + ((this.f.hashCode() + fw3.a(fw3.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e)) * 31)) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(bottomSheetVisibility=");
            sb.append(this.b);
            sb.append(", allClipsFolder=");
            sb.append(this.c);
            sb.append(", foldersWithClipIds=");
            sb.append(this.d);
            sb.append(", folders=");
            sb.append(this.e);
            sb.append(", paginationState=");
            sb.append(this.f);
            sb.append(", listLoadingState=");
            sb.append(this.g);
            sb.append(", totalFoldersCount=");
            sb.append(this.h);
            sb.append(", maxAllowedFoldersCount=");
            sb.append(this.i);
            sb.append(", maxClipsInFolderCount=");
            return vu5.b(sb, this.j, ')');
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerState.kt */
    public static final class a implements ClipsFavoritesFoldersPickerState {
        public static final a b = new a();
    }

    /* compiled from: ClipsFavoritesFoldersPickerState.kt */
    public static final class b implements ClipsFavoritesFoldersPickerState {
        public static final b b = new b();
    }
}
