package com.vk.clips.attachments.impl.views.video;

import android.graphics.Rect;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;
import xsna.vu5;
import xsna.yq;

/* compiled from: ClipsVideoAttachmentAction.kt */
/* loaded from: classes16.dex */
public abstract class a implements kj50 {

    /* compiled from: ClipsVideoAttachmentAction.kt */
    /* renamed from: com.vk.clips.attachments.impl.views.video.a$a, reason: collision with other inner class name */
    public static final class C0549a extends a {
        public final String b;

        public C0549a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0549a) && epx.f(this.b, ((C0549a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ChooseVideo(chosenVideoId="), this.b, ')');
        }
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class d extends a {
        public final VKList<VideoFile> b;

        public d(VKList<VideoFile> vKList) {
            this.b = vKList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LoadVideos(items=" + this.b + ')';
        }
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class f extends a {
        public static final f b = new f();
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class h extends a {
        public final int b;
        public final String c;

        public h(int i, String str) {
            this.b = i;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b == hVar.b && epx.f(this.c, hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetAlbum(id=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class i extends a {
        public final int b;

        public i(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SetClipsPerVideoLimit(clipsPerVideoLimit="), this.b, ')');
        }
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class j extends a {
    }

    /* compiled from: ClipsVideoAttachmentAction.kt */
    public static final class k extends a {
        public final Rect b;

        public k(Rect rect) {
            this.b = rect;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return yq.c(new StringBuilder("ShowAlbumSelector(anchorRect="), this.b, ')');
        }
    }
}
