package com.vk.video.ui.discovery.catalog;

import com.vk.dto.common.id.UserId;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.i5s;
import xsna.shy;
import xsna.zrp;

/* compiled from: VideoDiscoveryCatalogRepository.kt */
/* loaded from: classes7.dex */
public abstract class VideoDiscoveryCatalogRepository$Params {

    /* compiled from: VideoDiscoveryCatalogRepository.kt */
    public static final class Catalog extends VideoDiscoveryCatalogRepository$Params {
        public final int a;
        public final UserId b;
        public final String c;
        public final String d;
        public final String e;
        public final CatalogType f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoDiscoveryCatalogRepository.kt */
        public static final class CatalogType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ CatalogType[] $VALUES;
            public static final CatalogType MUSIC;
            public static final CatalogType VIDEO;

            static {
                CatalogType catalogType = new CatalogType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
                VIDEO = catalogType;
                CatalogType catalogType2 = new CatalogType("MUSIC", 1);
                MUSIC = catalogType2;
                CatalogType[] catalogTypeArr = {catalogType, catalogType2};
                $VALUES = catalogTypeArr;
                $ENTRIES = new asp(catalogTypeArr);
            }

            public CatalogType() {
                throw null;
            }

            public static CatalogType valueOf(String str) {
                return (CatalogType) Enum.valueOf(CatalogType.class, str);
            }

            public static CatalogType[] values() {
                return (CatalogType[]) $VALUES.clone();
            }
        }

        public Catalog(int i, UserId userId, String str, String str2, String str3, CatalogType catalogType) {
            this.a = i;
            this.b = userId;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = catalogType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Catalog)) {
                return false;
            }
            Catalog catalog = (Catalog) obj;
            return this.a == catalog.a && epx.f(this.b, catalog.b) && epx.f(this.c, catalog.c) && epx.f(this.d, catalog.d) && epx.f(this.e, catalog.e) && this.f == catalog.f;
        }

        public final int hashCode() {
            int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return this.f.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Catalog(videoId=" + this.a + ", videoOwnerId=" + this.b + ", trackCode=" + this.c + ", payload=" + this.d + ", referrer=" + this.e + ", type=" + this.f + ')';
        }
    }

    /* compiled from: VideoDiscoveryCatalogRepository.kt */
    public static final class a {

        /* compiled from: VideoDiscoveryCatalogRepository.kt */
        /* renamed from: com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Params$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1965a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoDiscoveryCatalogSourceArgs.Catalog.CatalogType.values().length];
                try {
                    iArr[VideoDiscoveryCatalogSourceArgs.Catalog.CatalogType.VIDEO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoDiscoveryCatalogSourceArgs.Catalog.CatalogType.MUSIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static VideoDiscoveryCatalogRepository$Params a(VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs, String str) {
            Catalog.CatalogType catalogType;
            if (!(videoDiscoveryCatalogSourceArgs instanceof VideoDiscoveryCatalogSourceArgs.Catalog)) {
                if (videoDiscoveryCatalogSourceArgs instanceof VideoDiscoveryCatalogSourceArgs.OfflineVideos) {
                    return new c(((VideoDiscoveryCatalogSourceArgs.OfflineVideos) videoDiscoveryCatalogSourceArgs).b);
                }
                if (!(videoDiscoveryCatalogSourceArgs instanceof VideoDiscoveryCatalogSourceArgs.MusicMix)) {
                    throw new NoWhenBranchMatchedException();
                }
                VideoDiscoveryCatalogSourceArgs.MusicMix musicMix = (VideoDiscoveryCatalogSourceArgs.MusicMix) videoDiscoveryCatalogSourceArgs;
                return new b(musicMix.b, musicMix.c, musicMix.d, musicMix.e);
            }
            VideoDiscoveryCatalogSourceArgs.Catalog catalog = (VideoDiscoveryCatalogSourceArgs.Catalog) videoDiscoveryCatalogSourceArgs;
            int i = catalog.b;
            UserId userId = catalog.c;
            String str2 = catalog.d;
            String str3 = catalog.e;
            int i2 = C1965a.$EnumSwitchMapping$0[catalog.f.ordinal()];
            if (i2 == 1) {
                catalogType = Catalog.CatalogType.VIDEO;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                catalogType = Catalog.CatalogType.MUSIC;
            }
            return new Catalog(i, userId, str2, str, str3, catalogType);
        }
    }

    /* compiled from: VideoDiscoveryCatalogRepository.kt */
    public static final class b extends VideoDiscoveryCatalogRepository$Params {
        public final UserId a;
        public final int b;
        public final String c;
        public final String d;

        public b(UserId userId, int i, String str, String str2) {
            this.a = userId;
            this.b = i;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicMix(videoOwnerId=");
            sb.append(this.a);
            sb.append(", videoId=");
            sb.append(this.b);
            sb.append(", payload=");
            sb.append(this.c);
            sb.append(", trackCode=");
            return i5s.a(sb, this.d, ", referrer=null)");
        }
    }

    /* compiled from: VideoDiscoveryCatalogRepository.kt */
    public static final class c extends VideoDiscoveryCatalogRepository$Params {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OfflineVideos(referrer="), this.a, ')');
        }
    }
}
