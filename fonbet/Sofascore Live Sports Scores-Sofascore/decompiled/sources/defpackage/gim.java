package defpackage;

import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gim {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends gim {
        public final BlazeGoogleCustomNativeAdModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel) {
            super(null);
            blazeGoogleCustomNativeAdModel.getClass();
            this.a = blazeGoogleCustomNativeAdModel;
        }

        public static a copy$default(a aVar, BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeGoogleCustomNativeAdModel = aVar.a;
            }
            aVar.getClass();
            blazeGoogleCustomNativeAdModel.getClass();
            return new a(blazeGoogleCustomNativeAdModel);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Ad(ad=" + this.a + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends gim {
        public final MomentModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull MomentModel momentModel) {
            super(null);
            momentModel.getClass();
            this.a = momentModel;
        }

        public static b copy$default(b bVar, MomentModel momentModel, int i, Object obj) {
            if ((i & 1) != 0) {
                momentModel = bVar.a;
            }
            bVar.getClass();
            momentModel.getClass();
            return new b(momentModel);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.c(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Moment(moment=" + this.a + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends gim {
        public final pxm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull pxm pxmVar) {
            super(null);
            pxmVar.getClass();
            this.a = pxmVar;
        }

        public static c copy$default(c cVar, pxm pxmVar, int i, Object obj) {
            if ((i & 1) != 0) {
                pxmVar = cVar.a;
            }
            cVar.getClass();
            pxmVar.getClass();
            return new c(pxmVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.c(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Placeholder(placeholder=" + this.a + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d extends gim {
        public final StoryModel a;
        public final srl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull StoryModel storyModel, @NotNull srl srlVar) {
            super(null);
            storyModel.getClass();
            srlVar.getClass();
            this.a = storyModel;
            this.b = srlVar;
        }

        public static d copy$default(d dVar, StoryModel storyModel, srl srlVar, int i, Object obj) {
            if ((i & 1) != 0) {
                storyModel = dVar.a;
            }
            if ((i & 2) != 0) {
                srlVar = dVar.b;
            }
            dVar.getClass();
            storyModel.getClass();
            srlVar.getClass();
            return new d(storyModel, srlVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.c(this.a, dVar.a) && Intrinsics.c(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StoryPage(story=" + this.a + ", page=" + this.b + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class e extends gim {
        public final VideoModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull VideoModel videoModel) {
            super(null);
            videoModel.getClass();
            this.a = videoModel;
        }

        public static e copy$default(e eVar, VideoModel videoModel, int i, Object obj) {
            if ((i & 1) != 0) {
                videoModel = eVar.a;
            }
            eVar.getClass();
            videoModel.getClass();
            return new e(videoModel);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.c(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Video(video=" + this.a + ')';
        }
    }

    public gim(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public final boolean a() {
        return (this instanceof a) || (this instanceof c);
    }
}
