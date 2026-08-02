package com.vk.libvideo.design.compose.base.datacontent.presets;

import com.vk.core.compose.generated.VkColorToken;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.at;
import xsna.dai;
import xsna.epx;
import xsna.ho8;
import xsna.mno0;
import xsna.qoy;
import xsna.rmw;
import xsna.vu5;
import xsna.xq;
import xsna.zrp;

/* compiled from: VideoMetaViewState.kt */
/* loaded from: classes2.dex */
public final class VideoMetaViewState {
    public final h a;
    public final g b;
    public final g c;
    public final a d;
    public final a e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoMetaViewState.kt */
    public static final class DownloadStatus implements g {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DownloadStatus[] $VALUES;
        public static final DownloadStatus Downloading;
        public static final DownloadStatus Error;
        public static final DownloadStatus InQueue;
        public static final DownloadStatus Paused;
        public static final DownloadStatus WaitingForNetwork;
        private final VkColorToken color;
        private final rmw icon;
        private final mno0 text;

        static {
            rmw.d dVar = new rmw.d(R.drawable.vk_icon_download_outline_16);
            mno0.i iVar = new mno0.i("Скачивается");
            VkColorToken vkColorToken = VkColorToken.TextAccent;
            DownloadStatus downloadStatus = new DownloadStatus("Downloading", 0, dVar, iVar, vkColorToken);
            Downloading = downloadStatus;
            DownloadStatus downloadStatus2 = new DownloadStatus("Paused", 1, new rmw.d(R.drawable.vk_icon_pause_16), new mno0.i("На паузе"), vkColorToken);
            Paused = downloadStatus2;
            DownloadStatus downloadStatus3 = new DownloadStatus("WaitingForNetwork", 2, new rmw.d(R.drawable.vk_icon_wifi_outline_16), new mno0.i("Ожидание сети"), vkColorToken);
            WaitingForNetwork = downloadStatus3;
            DownloadStatus downloadStatus4 = new DownloadStatus("InQueue", 3, new rmw.d(R.drawable.vk_icon_download_dashed_outline_16), new mno0.i("В очереди"), vkColorToken);
            InQueue = downloadStatus4;
            DownloadStatus downloadStatus5 = new DownloadStatus("Error", 4, null, new mno0.i("Ошибка загрузки"), VkColorToken.TextNegative);
            Error = downloadStatus5;
            DownloadStatus[] downloadStatusArr = {downloadStatus, downloadStatus2, downloadStatus3, downloadStatus4, downloadStatus5};
            $VALUES = downloadStatusArr;
            $ENTRIES = new asp(downloadStatusArr);
        }

        public DownloadStatus(String str, int i, rmw.d dVar, mno0.i iVar, VkColorToken vkColorToken) {
            this.icon = dVar;
            this.text = iVar;
            this.color = vkColorToken;
        }

        public static DownloadStatus valueOf(String str) {
            return (DownloadStatus) Enum.valueOf(DownloadStatus.class, str);
        }

        public static DownloadStatus[] values() {
            return (DownloadStatus[]) $VALUES.clone();
        }

        public final VkColorToken h() {
            return this.color;
        }

        public final rmw i() {
            return this.icon;
        }

        public final mno0 j() {
            return this.text;
        }
    }

    /* compiled from: VideoMetaViewState.kt */
    public static final class a implements g {
        public final c b;
        public final String c;
        public final mno0 d;
        public final boolean e;
        public final mno0 f;
        public final mno0 g;
        public final c h;
        public final int i;
        public final Object j;

        public a() {
            this(null, null, null, false, null, null, null, 0, 255);
        }

        public final c a() {
            return this.h;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c b() {
            return (dai.c) this.j.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i;
        }

        public final int hashCode() {
            c cVar = this.b;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            mno0 mno0Var = this.d;
            int b = qoy.b((hashCode2 + (mno0Var == null ? 0 : mno0Var.hashCode())) * 31, 31, this.e);
            mno0 mno0Var2 = this.f;
            int hashCode3 = (b + (mno0Var2 == null ? 0 : mno0Var2.hashCode())) * 31;
            mno0 mno0Var3 = this.g;
            int hashCode4 = (hashCode3 + (mno0Var3 == null ? 0 : mno0Var3.hashCode())) * 31;
            c cVar2 = this.h;
            return Integer.hashCode(this.i) + ((hashCode4 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AboutVideo(leadingDonutChip=");
            sb.append(this.b);
            sb.append(", avatarUrl=");
            sb.append(this.c);
            sb.append(", channelName=");
            sb.append(this.d);
            sb.append(", isVerified=");
            sb.append(this.e);
            sb.append(", viewCount=");
            sb.append(this.f);
            sb.append(", date=");
            sb.append(this.g);
            sb.append(", donutChip=");
            sb.append(this.h);
            sb.append(", maxRows=");
            return vu5.b(sb, this.i, ')');
        }

        public a(c cVar, String str, mno0 mno0Var, boolean z, mno0 mno0Var2, mno0 mno0Var3, c cVar2, int i, int i2) {
            cVar = (i2 & 1) != 0 ? null : cVar;
            str = (i2 & 2) != 0 ? null : str;
            mno0Var = (i2 & 4) != 0 ? null : mno0Var;
            z = (i2 & 8) != 0 ? false : z;
            mno0Var2 = (i2 & 16) != 0 ? null : mno0Var2;
            mno0Var3 = (i2 & 32) != 0 ? null : mno0Var3;
            cVar2 = (i2 & 64) != 0 ? null : cVar2;
            i = (i2 & 128) != 0 ? Integer.MAX_VALUE : i;
            this.b = cVar;
            this.c = str;
            this.d = mno0Var;
            this.e = z;
            this.f = mno0Var2;
            this.g = mno0Var3;
            this.h = cVar2;
            this.i = i;
            this.j = at.c(LazyThreadSafetyMode.NONE);
        }
    }

    /* compiled from: VideoMetaViewState.kt */
    public static final class b implements h {
        public final mno0.i b;

        public b(mno0.i iVar) {
            this.b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b.equals(((b) obj).b);
        }

        public final int hashCode() {
            return Integer.hashCode(3) + (this.b.a.hashCode() * 31);
        }

        public final String toString() {
            return "Description(text=" + this.b + ", maxLines=3)";
        }
    }

    /* compiled from: VideoMetaViewState.kt */
    public static final class c {
        public final mno0 a;
        public final String b;
        public final Object c = at.c(LazyThreadSafetyMode.NONE);

        public c(mno0 mno0Var, String str) {
            this.a = mno0Var;
            this.b = str;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final dai.c a() {
            return (dai.c) this.c.getValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutChip(text=");
            sb.append(this.a);
            sb.append(", contentDescription=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoMetaViewState.kt */
    public static final class d implements g {
        public final mno0.i b;
        public final mno0 c;
        public final c d;

        public d(mno0.i iVar, mno0.i iVar2, c cVar, int i) {
            iVar2 = (i & 2) != 0 ? null : iVar2;
            cVar = (i & 4) != 0 ? null : cVar;
            this.b = iVar;
            this.c = iVar2;
            this.d = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b.equals(dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            int hashCode = this.b.a.hashCode() * 31;
            mno0 mno0Var = this.c;
            int hashCode2 = (hashCode + (mno0Var == null ? 0 : mno0Var.hashCode())) * 31;
            c cVar = this.d;
            return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            return "DownloadProgress(size=" + this.b + ", progress=" + this.c + ", donutChip=" + this.d + ')';
        }
    }

    /* compiled from: VideoMetaViewState.kt */
    public static final class e implements g {
        public final mno0.i b;

        public e(mno0.i iVar) {
            this.b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b.equals(((e) obj).b);
        }

        public final int hashCode() {
            return this.b.a.hashCode();
        }

        public final String toString() {
            return "EpisodeTime(text=" + this.b + ')';
        }
    }

    /* compiled from: VideoMetaViewState.kt */
    public static final class f implements h, g {
        public final float b;

        public f() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Float.compare(this.b, ((f) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("Skeleton(fraction="));
        }

        public f(float f) {
            this.b = f;
        }

        public /* synthetic */ f(int i) {
            this(1.0f);
        }
    }

    /* compiled from: VideoMetaViewState.kt */
    public interface g {
    }

    /* compiled from: VideoMetaViewState.kt */
    public interface h {
    }

    /* compiled from: VideoMetaViewState.kt */
    public static final class i implements h {
        public final mno0.i b;
        public final int c;

        public /* synthetic */ i(mno0.i iVar) {
            this(iVar, 2);
        }

        public final mno0 a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.b, iVar.b) && this.c == iVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoName(title=");
            sb.append(this.b);
            sb.append(", maxLines=");
            return vu5.b(sb, this.c, ')');
        }

        public i(mno0.i iVar, int i) {
            this.b = iVar;
            this.c = i;
        }
    }

    public /* synthetic */ VideoMetaViewState(h hVar, g gVar, int i2) {
        this(hVar, (i2 & 2) != 0 ? null : gVar, (g) null);
    }

    public final a a() {
        return this.e;
    }

    public final a b() {
        return this.d;
    }

    public final h c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMetaViewState)) {
            return false;
        }
        VideoMetaViewState videoMetaViewState = (VideoMetaViewState) obj;
        return epx.f(this.a, videoMetaViewState.a) && epx.f(this.b, videoMetaViewState.b) && epx.f(this.c, videoMetaViewState.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g gVar = this.b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        g gVar2 = this.c;
        return hashCode2 + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    public final String toString() {
        return "VideoMetaViewState(title=" + this.a + ", subtitle=" + this.b + ", extraSubtitle=" + this.c + ')';
    }

    public VideoMetaViewState(h hVar, g gVar, g gVar2) {
        this.a = hVar;
        this.b = gVar;
        this.c = gVar2;
        this.d = gVar instanceof a ? (a) gVar : null;
        this.e = gVar2 instanceof a ? (a) gVar2 : null;
    }
}
