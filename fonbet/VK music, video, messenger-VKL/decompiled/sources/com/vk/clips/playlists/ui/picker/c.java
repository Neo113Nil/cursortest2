package com.vk.clips.playlists.ui.picker;

import defpackage.q0;
import xsna.e8b0;
import xsna.epx;
import xsna.ho8;
import xsna.xl50;
import xsna.xpe;

/* compiled from: ClipsPlaylistPickerPatch.kt */
/* loaded from: classes16.dex */
public interface c extends xl50 {

    /* compiled from: ClipsPlaylistPickerPatch.kt */
    public static final class a implements c {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ActionProgress(isProgress="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistPickerPatch.kt */
    public interface b extends c {

        /* compiled from: ClipsPlaylistPickerPatch.kt */
        public static final class a implements b {
            public static final a b = new a();
        }

        /* compiled from: ClipsPlaylistPickerPatch.kt */
        /* renamed from: com.vk.clips.playlists.ui.picker.c$b$b, reason: collision with other inner class name */
        public static final class C0633b implements b {
            public static final C0633b b = new C0633b();
        }

        /* compiled from: ClipsPlaylistPickerPatch.kt */
        /* renamed from: com.vk.clips.playlists.ui.picker.c$b$c, reason: collision with other inner class name */
        public static final class C0634c implements b {
            public final xpe b;

            public C0634c(xpe xpeVar) {
                this.b = xpeVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0634c) && epx.f(this.b, ((C0634c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "NextSuccess(response=" + this.b + ')';
            }
        }

        /* compiled from: ClipsPlaylistPickerPatch.kt */
        public static final class d implements b {
            public static final d b = new d();
        }

        /* compiled from: ClipsPlaylistPickerPatch.kt */
        public static final class e implements b {
            public final e8b0 b;
            public final xpe c;

            public e(e8b0 e8b0Var, xpe xpeVar) {
                this.b = e8b0Var;
                this.c = xpeVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "Success(counts=" + this.b + ", response=" + this.c + ')';
            }
        }
    }

    /* compiled from: ClipsPlaylistPickerPatch.kt */
    /* renamed from: com.vk.clips.playlists.ui.picker.c$c, reason: collision with other inner class name */
    public interface InterfaceC0635c extends c {

        /* compiled from: ClipsPlaylistPickerPatch.kt */
        /* renamed from: com.vk.clips.playlists.ui.picker.c$c$a */
        public static final class a implements InterfaceC0635c {
            public final String b;

            public a(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("ItemClicked(videoId="), this.b, ')');
            }
        }
    }
}
