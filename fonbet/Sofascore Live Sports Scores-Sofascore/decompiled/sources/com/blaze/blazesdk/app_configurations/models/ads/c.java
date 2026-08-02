package com.blaze.blazesdk.app_configurations.models.ads;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.wv8;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c {
    public final List a;
    public final List b;
    public final List c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public final com.blaze.blazesdk.app_configurations.models.ads.b a;
        public final Date b;
        public final Date c;
        public final int d;

        public a(@NotNull com.blaze.blazesdk.app_configurations.models.ads.b bVar, @NotNull Date date, @NotNull Date date2, int i) {
            bVar.getClass();
            date.getClass();
            date2.getClass();
            this.a = bVar;
            this.b = date;
            this.c = date2;
            this.d = i;
        }

        public static a copy$default(a aVar, com.blaze.blazesdk.app_configurations.models.ads.b bVar, Date date, Date date2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bVar = aVar.a;
            }
            if ((i2 & 2) != 0) {
                date = aVar.b;
            }
            if ((i2 & 4) != 0) {
                date2 = aVar.c;
            }
            if ((i2 & 8) != 0) {
                i = aVar.d;
            }
            aVar.getClass();
            bVar.getClass();
            date.getClass();
            date2.getClass();
            return new a(bVar, date, date2, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b) && Intrinsics.c(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MomentsAdsConfig(type=");
            sb.append(this.a);
            sb.append(", startTime=");
            sb.append(this.b);
            sb.append(", endTime=");
            sb.append(this.c);
            sb.append(", preloadItemsDistance=");
            return wv8.j(sb, this.d, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        public final g a;
        public final Date b;
        public final Date c;
        public final int d;

        public b(@NotNull g gVar, @NotNull Date date, @NotNull Date date2, int i) {
            gVar.getClass();
            date.getClass();
            date2.getClass();
            this.a = gVar;
            this.b = date;
            this.c = date2;
            this.d = i;
        }

        public static b copy$default(b bVar, g gVar, Date date, Date date2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                gVar = bVar.a;
            }
            if ((i2 & 2) != 0) {
                date = bVar.b;
            }
            if ((i2 & 4) != 0) {
                date2 = bVar.c;
            }
            if ((i2 & 8) != 0) {
                i = bVar.d;
            }
            bVar.getClass();
            gVar.getClass();
            date.getClass();
            date2.getClass();
            return new b(gVar, date, date2, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StoryAdsConfig(type=");
            sb.append(this.a);
            sb.append(", startTime=");
            sb.append(this.b);
            sb.append(", endTime=");
            sb.append(this.c);
            sb.append(", preloadItemsDistance=");
            return wv8.j(sb, this.d, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.app_configurations.models.ads.c$c, reason: collision with other inner class name */
    public static final class C0006c {
        public final i a;
        public final Date b;
        public final Date c;

        public C0006c(@NotNull i iVar, @NotNull Date date, @NotNull Date date2) {
            iVar.getClass();
            date.getClass();
            date2.getClass();
            this.a = iVar;
            this.b = date;
            this.c = date2;
        }

        public static C0006c copy$default(C0006c c0006c, i iVar, Date date, Date date2, int i, Object obj) {
            if ((i & 1) != 0) {
                iVar = c0006c.a;
            }
            if ((i & 2) != 0) {
                date = c0006c.b;
            }
            if ((i & 4) != 0) {
                date2 = c0006c.c;
            }
            c0006c.getClass();
            iVar.getClass();
            date.getClass();
            date2.getClass();
            return new C0006c(iVar, date, date2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0006c)) {
                return false;
            }
            C0006c c0006c = (C0006c) obj;
            return Intrinsics.c(this.a, c0006c.a) && Intrinsics.c(this.b, c0006c.b) && Intrinsics.c(this.c, c0006c.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "VideosAdsConfig(type=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ')';
        }
    }

    public c(@NotNull List<b> list, @NotNull List<a> list2, @NotNull List<C0006c> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public static c copy$default(c cVar, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cVar.a;
        }
        if ((i & 2) != 0) {
            list2 = cVar.b;
        }
        if ((i & 4) != 0) {
            list3 = cVar.c;
        }
        cVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new c(list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.c(this.a, cVar.a) && Intrinsics.c(this.b, cVar.b) && Intrinsics.c(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsConfigurations(storyAdsConfigs=");
        sb.append(this.a);
        sb.append(", momentsAdsConfigs=");
        sb.append(this.b);
        sb.append(", videosAdsConfigs=");
        return fc6.p(sb, this.c, ')');
    }
}
