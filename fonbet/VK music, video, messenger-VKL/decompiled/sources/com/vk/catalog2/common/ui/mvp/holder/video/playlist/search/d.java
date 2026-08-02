package com.vk.catalog2.common.ui.mvp.holder.video.playlist.search;

import com.vk.dto.common.Image;
import java.util.ArrayList;
import xsna.bh10;
import xsna.dn;
import xsna.epx;
import xsna.fq;
import xsna.ho8;
import xsna.l5g;
import xsna.lg90;
import xsna.qr;
import xsna.shy;
import xsna.urd0;
import xsna.wow;
import xsna.yjo;

/* compiled from: SearchPlaylistCardState.kt */
/* loaded from: classes16.dex */
public final class d {
    public final b a;
    public final Image b;
    public final long c;
    public final int d;
    public final String e;
    public final ArrayList f;

    /* compiled from: SearchPlaylistCardState.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final lg90 c;

        public a(String str, String str2, yjo yjoVar) {
            this.a = str;
            this.b = str2;
            this.c = yjoVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            lg90 lg90Var = this.c;
            return a + (lg90Var == null ? 0 : lg90Var.hashCode());
        }

        public final String toString() {
            return "Author(name=" + this.a + ", profileImageUrl=" + this.b + ", verificationIcon=" + this.c + ')';
        }
    }

    /* compiled from: SearchPlaylistCardState.kt */
    public static final class b {
        public final String a;
        public final a b;
        public final String c;

        public b(String str, a aVar, String str2) {
            this.a = str;
            this.b = aVar;
            this.c = str2;
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
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaylistInfo(title=");
            sb.append(this.a);
            sb.append(", author=");
            sb.append(this.b);
            sb.append(", updatedAtText=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: SearchPlaylistCardState.kt */
    public static final class c {
        public final String a;
        public final Image b;
        public final String c;
        public final String d;
        public final a e;

        public c(String str, Image image, String str2, String str3, a aVar) {
            this.a = str;
            this.b = image;
            this.c = str2;
            this.d = str3;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + urd0.a(urd0.a(fq.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "Video(id=" + this.a + ", previewImage=" + this.b + ", title=" + this.c + ", badgeText=" + this.d + ", author=" + this.e + ')';
        }
    }

    public d(b bVar, Image image, long j, int i, String str, ArrayList arrayList) {
        this.a = bVar;
        this.b = image;
        this.c = j;
        this.d = i;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && epx.f(this.b, dVar.b) && l5g.d(this.c, dVar.c) && this.d == dVar.d && epx.f(this.e, dVar.e) && this.f.equals(dVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Image image = this.b;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        int i = l5g.l;
        return Boolean.hashCode(false) + qr.a(this.f, urd0.a(shy.a(this.d, bh10.a(hashCode2, 31, this.c), 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchPlaylistCardState(playlistInfo=");
        sb.append(this.a);
        sb.append(", coverImage=");
        sb.append(this.b);
        sb.append(", coverColor=");
        dn.h(this.c, ", videosCount=", sb);
        sb.append(this.d);
        sb.append(", badgeText=");
        sb.append(this.e);
        sb.append(", videos=");
        sb.append((Object) wow.c(this.f));
        sb.append(", initiallyExpanded=false)");
        return sb.toString();
    }
}
