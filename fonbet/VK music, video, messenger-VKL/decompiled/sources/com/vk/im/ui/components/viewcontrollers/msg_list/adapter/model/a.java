package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class a {
    public final int a;
    public final e b;
    public final C1165a c;
    public final g d;
    public final d e;
    public final f f;
    public final c g;
    public final b h;

    /* compiled from: ChatListModels.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a$a, reason: collision with other inner class name */
    public static final class C1165a {
        public final int a;
        public final long b;
        public final String c;
        public final String d;

        public C1165a(int i, String str, String str2, long j) {
            this.a = i;
            this.b = j;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1165a)) {
                return false;
            }
            C1165a c1165a = (C1165a) obj;
            return this.a == c1165a.a && this.b == c1165a.b && epx.f(this.c, c1165a.c) && epx.f(this.d, c1165a.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AttachDocMeta(localId=");
            sb.append(this.a);
            sb.append(", size=");
            sb.append(this.b);
            sb.append(", extension=");
            sb.append(this.c);
            sb.append(", title=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("AttachGiftMeta(hasVotes="), this.a, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class c {
        public final Integer a;

        public c(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return uqi.b(new StringBuilder("AttachGraffitiMeta(size="), this.a, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class d {
        public final String a;
        public final String b;

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AttachLinkMeta(title=");
            sb.append(this.a);
            sb.append(", url=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class e {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public e(String str, String str2, boolean z, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return Boolean.hashCode(this.d) + qoy.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AttachPlaylistMeta(playlistTitle=");
            sb.append(this.a);
            sb.append(", playListSubtitle=");
            sb.append(this.b);
            sb.append(", isPlaylistChat=");
            sb.append(this.c);
            sb.append(", isAlbum=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class f {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AttachQuestionMeta(question="), this.a, ')');
        }
    }

    /* compiled from: ChatListModels.kt */
    public static final class g {
        public final String a;

        public g(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AttachWallReplyMeta(text="), this.a, ')');
        }
    }

    public a(int i, e eVar, C1165a c1165a, g gVar, d dVar, f fVar, c cVar, b bVar) {
        this.a = i;
        this.b = eVar;
        this.c = c1165a;
        this.d = gVar;
        this.e = dVar;
        this.f = fVar;
        this.g = cVar;
        this.h = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        e eVar = this.b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        C1165a c1165a = this.c;
        int hashCode3 = (hashCode2 + (c1165a == null ? 0 : c1165a.hashCode())) * 31;
        g gVar = this.d;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.a.hashCode())) * 31;
        d dVar = this.e;
        int hashCode5 = (hashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        f fVar = this.f;
        int hashCode6 = (hashCode5 + (fVar == null ? 0 : fVar.a.hashCode())) * 31;
        c cVar = this.g;
        int hashCode7 = (hashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.h;
        return hashCode7 + (bVar != null ? Boolean.hashCode(bVar.a) : 0);
    }

    public final String toString() {
        return "AttachMeta(localId=" + this.a + ", attachPlaylistMeta=" + this.b + ", attachDocMeta=" + this.c + ", attachWallReply=" + this.d + ", attachLinkMeta=" + this.e + ", attachQuestionMeta=" + this.f + ", attachGraffitiMeta=" + this.g + ", attachGiftMeta=" + this.h + ')';
    }
}
