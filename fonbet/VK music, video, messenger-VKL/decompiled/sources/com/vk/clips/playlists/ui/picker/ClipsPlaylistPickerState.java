package com.vk.clips.playlists.ui.picker;

import com.vk.dto.common.VideoFile;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.shy;
import xsna.ur;
import xsna.zrp;

/* compiled from: ClipsPlaylistPickerState.kt */
/* loaded from: classes16.dex */
public interface ClipsPlaylistPickerState extends km50 {

    /* compiled from: ClipsPlaylistPickerState.kt */
    public static final class Content implements ClipsPlaylistPickerState {
        public final c b;
        public final int c;
        public final int d;
        public final List<VideoFile> e;
        public final String f;
        public final LoadingState g;
        public final boolean h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsPlaylistPickerState.kt */
        public static final class LoadingState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ LoadingState[] $VALUES;
            public static final LoadingState LOADING_NEXT;
            public static final LoadingState NONE;

            static {
                LoadingState loadingState = new LoadingState("NONE", 0);
                NONE = loadingState;
                LoadingState loadingState2 = new LoadingState("LOADING_NEXT", 1);
                LOADING_NEXT = loadingState2;
                LoadingState[] loadingStateArr = {loadingState, loadingState2};
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

        /* JADX WARN: Multi-variable type inference failed */
        public Content(c cVar, int i, int i2, List<? extends VideoFile> list, String str, LoadingState loadingState, boolean z) {
            this.b = cVar;
            this.c = i;
            this.d = i2;
            this.e = list;
            this.f = str;
            this.g = loadingState;
            this.h = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Content a(Content content, c cVar, ArrayList arrayList, String str, LoadingState loadingState, boolean z, int i) {
            if ((i & 1) != 0) {
                cVar = content.b;
            }
            c cVar2 = cVar;
            int i2 = content.c;
            int i3 = content.d;
            List list = arrayList;
            if ((i & 8) != 0) {
                list = content.e;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                str = content.f;
            }
            String str2 = str;
            if ((i & 32) != 0) {
                loadingState = content.g;
            }
            LoadingState loadingState2 = loadingState;
            if ((i & 64) != 0) {
                z = content.h;
            }
            content.getClass();
            return new Content(cVar2, i2, i3, list2, str2, loadingState2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return epx.f(this.b, content.b) && this.c == content.c && this.d == content.d && epx.f(this.e, content.e) && epx.f(this.f, content.f) && this.g == content.g && this.h == content.h;
        }

        @Override // com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState
        public final c g() {
            return this.b;
        }

        public final int hashCode() {
            int a = fw3.a(shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e);
            String str = this.f;
            return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(multiSelectState=");
            sb.append(this.b);
            sb.append(", maxCount=");
            sb.append(this.c);
            sb.append(", count=");
            sb.append(this.d);
            sb.append(", videoFiles=");
            sb.append(this.e);
            sb.append(", nextFrom=");
            sb.append(this.f);
            sb.append(", loadingState=");
            sb.append(this.g);
            sb.append(", isActionProgress=");
            return q0.a(sb, this.h, ')');
        }
    }

    /* compiled from: ClipsPlaylistPickerState.kt */
    public static final class a implements ClipsPlaylistPickerState {
        public final c b;

        public a(c cVar) {
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState
        public final c g() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(multiSelectState=" + this.b + ')';
        }
    }

    /* compiled from: ClipsPlaylistPickerState.kt */
    public static final class b implements ClipsPlaylistPickerState {
        public final c b;

        public b(c cVar) {
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState
        public final c g() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loading(multiSelectState=" + this.b + ')';
        }
    }

    /* compiled from: ClipsPlaylistPickerState.kt */
    public interface c {

        /* compiled from: ClipsPlaylistPickerState.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: ClipsPlaylistPickerState.kt */
        public interface b extends c {

            /* compiled from: ClipsPlaylistPickerState.kt */
            public static final class a implements b {
                public final Set<String> a;
                public final Set<String> b;

                public a(Set<String> set, Set<String> set2) {
                    this.a = set;
                    this.b = set2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AddClips(selectedIds=");
                    sb.append(this.a);
                    sb.append(", newSelectedIds=");
                    return ur.c(sb, this.b, ')');
                }
            }

            /* compiled from: ClipsPlaylistPickerState.kt */
            /* renamed from: com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState$c$b$b, reason: collision with other inner class name */
            public static final class C0630b implements b {
                public final Set<String> a;

                public C0630b(Set<String> set) {
                    this.a = set;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0630b) && epx.f(this.a, ((C0630b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ur.c(new StringBuilder("RemoveClips(removedIds="), this.a, ')');
                }
            }
        }
    }

    c g();
}
