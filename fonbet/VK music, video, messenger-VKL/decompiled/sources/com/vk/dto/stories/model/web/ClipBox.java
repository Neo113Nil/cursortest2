package com.vk.dto.stories.model.web;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DuetType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.ci7;
import xsna.drm0;
import xsna.epx;
import xsna.fkq0;
import xsna.gzs;
import xsna.j5g;
import xsna.mnh0;
import xsna.pn00;
import xsna.qoy;
import xsna.s3q0;
import xsna.shy;
import xsna.vu5;
import xsna.yh3;

/* compiled from: ClipBox.kt */
/* loaded from: classes18.dex */
public final class ClipBox {
    public static final Object d = pn00.k(new Pair("normal", DuetType.BLUR), new Pair("duet_horizontal", DuetType.HOR), new Pair("duet_vertical", DuetType.VERT), new Pair("duet_card", DuetType.CARD));
    public static final Object e = pn00.k(new Pair("front", Boolean.TRUE), new Pair("back", Boolean.FALSE));
    public static final yh3 f = new yh3(2);
    public final a a;
    public final MusicTrack b;
    public final ClipVideoFile c;

    /* compiled from: ClipBox.kt */
    public static final class ClipBoxException extends Exception {
        public ClipBoxException() {
            super((String) null);
        }
    }

    /* compiled from: ClipBox.kt */
    public static final class a {
        public String a;
        public String b;
        public c c;
        public int d;
        public String e;
        public boolean f;
        public DuetType g;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            c cVar = this.c;
            int a = shy.a(this.d, (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
            String str3 = this.e;
            int b = qoy.b((a + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
            DuetType duetType = this.g;
            return b + (duetType != null ? duetType.hashCode() : 0);
        }

        public final String toString() {
            return "ClipBoxChecked(maskId=" + this.a + ", audioId=" + this.b + ", duetId=" + this.c + ", audioStartTimeMs=" + this.d + ", description=" + this.e + ", frontCamera=" + this.f + ", duetType=" + this.g + ')';
        }
    }

    /* compiled from: ClipBox.kt */
    public static final class b {
        public static c a(String str) throws ClipBoxException {
            List b0 = drm0.b0(str, new char[]{'_'}, 0, 6);
            if (b0.size() != 2) {
                throw new ClipBoxException("A valid vk identity '[owner_id]_[entity_id]' expected");
            }
            try {
                long parseLong = Long.parseLong((String) b0.get(0));
                gzs<s3q0> gzsVar = fkq0.a;
                return new c(new UserId(parseLong), Integer.parseInt((String) b0.get(1)));
            } catch (NumberFormatException e) {
                ClipBoxException clipBoxException = new ClipBoxException("A valid vk identity '[owner_id]_[entity_id]' expected");
                mnh0.d(clipBoxException, e);
                throw clipBoxException;
            }
        }

        public static Object b(String str, Map map) throws ClipBoxException {
            Object obj = map.get(str);
            if (obj != null) {
                return obj;
            }
            throw new ClipBoxException((String) ClipBox.f.invoke(str, j5g.g0(map.keySet(), null, null, null, 0, new ci7(10), 31)));
        }
    }

    /* compiled from: ClipBox.kt */
    public static final class c {
        public final UserId a;
        public final int b;

        public c(UserId userId, int i) {
            this.a = userId;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkIdentity(ownerId=");
            sb.append(this.a);
            sb.append(", entityId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public ClipBox(a aVar, MusicTrack musicTrack, ClipVideoFile clipVideoFile) {
        this.a = aVar;
        this.b = musicTrack;
        this.c = clipVideoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipBox)) {
            return false;
        }
        ClipBox clipBox = (ClipBox) obj;
        return epx.f(this.a, clipBox.a) && epx.f(this.b, clipBox.b) && epx.f(this.c, clipBox.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MusicTrack musicTrack = this.b;
        int hashCode2 = (hashCode + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31;
        ClipVideoFile clipVideoFile = this.c;
        return hashCode2 + (clipVideoFile != null ? clipVideoFile.hashCode() : 0);
    }

    public final String toString() {
        return "ClipBox(clipBoxChecked=" + this.a + ", music=" + this.b + ", duetClip=" + this.c + ')';
    }
}
