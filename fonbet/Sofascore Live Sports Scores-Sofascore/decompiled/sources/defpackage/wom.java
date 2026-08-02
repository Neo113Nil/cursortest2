package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wom {
    public final String a;
    public final ExoPlayer b;
    public final String c;
    public final String d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends wom {
        public final String e;
        public final ExoPlayer f;
        public final String g;
        public final String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @NotNull ExoPlayer exoPlayer, @Nullable String str2, @NotNull String str3) {
            super(str, exoPlayer, str2, str3, null);
            str.getClass();
            exoPlayer.getClass();
            str3.getClass();
            this.e = str;
            this.f = exoPlayer;
            this.g = str2;
            this.h = str3;
        }

        public static a copy$default(a aVar, String str, ExoPlayer exoPlayer, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.e;
            }
            if ((i & 2) != 0) {
                exoPlayer = aVar.f;
            }
            if ((i & 4) != 0) {
                str2 = aVar.g;
            }
            if ((i & 8) != 0) {
                str3 = aVar.h;
            }
            aVar.getClass();
            str.getClass();
            exoPlayer.getClass();
            str3.getClass();
            return new a(str, exoPlayer, str2, str3);
        }

        @Override // defpackage.wom
        public final String a() {
            return this.g;
        }

        @Override // defpackage.wom
        public final String b() {
            return this.e;
        }

        @Override // defpackage.wom
        public final ExoPlayer c() {
            return this.f;
        }

        @Override // defpackage.wom
        public final String d() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.e, aVar.e) && Intrinsics.c(this.f, aVar.f) && Intrinsics.c(this.g, aVar.g) && Intrinsics.c(this.h, aVar.h);
        }

        public final int hashCode() {
            int hashCode = (this.f.hashCode() + (this.e.hashCode() * 31)) * 31;
            String str = this.g;
            return this.h.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EnteringFullscreen(entryId=");
            sb.append(this.e);
            sb.append(", exoPlayer=");
            sb.append(this.f);
            sb.append(", currentPlayableId=");
            sb.append(this.g);
            sb.append(", sessionId=");
            return lnb.q(sb, this.h, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends wom {
        public final String e;
        public final ExoPlayer f;
        public final String g;
        public final String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String str, @NotNull ExoPlayer exoPlayer, @Nullable String str2, @NotNull String str3) {
            super(str, exoPlayer, str2, str3, null);
            str.getClass();
            exoPlayer.getClass();
            str3.getClass();
            this.e = str;
            this.f = exoPlayer;
            this.g = str2;
            this.h = str3;
        }

        public static b copy$default(b bVar, String str, ExoPlayer exoPlayer, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.e;
            }
            if ((i & 2) != 0) {
                exoPlayer = bVar.f;
            }
            if ((i & 4) != 0) {
                str2 = bVar.g;
            }
            if ((i & 8) != 0) {
                str3 = bVar.h;
            }
            bVar.getClass();
            str.getClass();
            exoPlayer.getClass();
            str3.getClass();
            return new b(str, exoPlayer, str2, str3);
        }

        @Override // defpackage.wom
        public final String a() {
            return this.g;
        }

        @Override // defpackage.wom
        public final String b() {
            return this.e;
        }

        @Override // defpackage.wom
        public final ExoPlayer c() {
            return this.f;
        }

        @Override // defpackage.wom
        public final String d() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.c(this.e, bVar.e) && Intrinsics.c(this.f, bVar.f) && Intrinsics.c(this.g, bVar.g) && Intrinsics.c(this.h, bVar.h);
        }

        public final int hashCode() {
            int hashCode = (this.f.hashCode() + (this.e.hashCode() * 31)) * 31;
            String str = this.g;
            return this.h.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExitingFullscreen(entryId=");
            sb.append(this.e);
            sb.append(", exoPlayer=");
            sb.append(this.f);
            sb.append(", currentPlayableId=");
            sb.append(this.g);
            sb.append(", sessionId=");
            return lnb.q(sb, this.h, ')');
        }
    }

    public wom(String str, ExoPlayer exoPlayer, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = str;
        this.b = exoPlayer;
        this.c = str2;
        this.d = str3;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public ExoPlayer c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }
}
