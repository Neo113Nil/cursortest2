package com.vk.superapp.common.js.bridge.api.events;

import com.ironsource.X3;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShowSlidesSheet.kt */
/* loaded from: classes6.dex */
public final class ShowSlidesSheet$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("slides")
    private final List<Slides> slides;

    public ShowSlidesSheet$Parameters(List<Slides> list, String str) {
        this.slides = list;
        this.requestId = str;
    }

    public static final ShowSlidesSheet$Parameters a(ShowSlidesSheet$Parameters showSlidesSheet$Parameters) {
        return showSlidesSheet$Parameters.requestId == null ? new ShowSlidesSheet$Parameters(showSlidesSheet$Parameters.slides, "default_request_id") : showSlidesSheet$Parameters;
    }

    public static final void b(ShowSlidesSheet$Parameters showSlidesSheet$Parameters) {
        if (showSlidesSheet$Parameters.slides == null) {
            throw new IllegalArgumentException("Value of non-nullable member slides cannot be\n                        null");
        }
        if (showSlidesSheet$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final List<Slides> c() {
        return this.slides;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowSlidesSheet$Parameters)) {
            return false;
        }
        ShowSlidesSheet$Parameters showSlidesSheet$Parameters = (ShowSlidesSheet$Parameters) obj;
        return epx.f(this.slides, showSlidesSheet$Parameters.slides) && epx.f(this.requestId, showSlidesSheet$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.slides.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(slides=");
        sb.append(this.slides);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    /* compiled from: ShowSlidesSheet.kt */
    public static final class Slides {

        @pmi0(X3.i.I0)
        private final Media media;

        @pmi0("negative_button_text")
        private final String negativeButtonText;

        @pmi0("positive_button_text")
        private final String positiveButtonText;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        public Slides(Media media, String str, String str2, String str3, String str4) {
            this.media = media;
            this.title = str;
            this.subtitle = str2;
            this.positiveButtonText = str3;
            this.negativeButtonText = str4;
        }

        public final Media a() {
            return this.media;
        }

        public final String b() {
            return this.negativeButtonText;
        }

        public final String c() {
            return this.positiveButtonText;
        }

        public final String d() {
            return this.subtitle;
        }

        public final String e() {
            return this.title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Slides)) {
                return false;
            }
            Slides slides = (Slides) obj;
            return epx.f(this.media, slides.media) && epx.f(this.title, slides.title) && epx.f(this.subtitle, slides.subtitle) && epx.f(this.positiveButtonText, slides.positiveButtonText) && epx.f(this.negativeButtonText, slides.negativeButtonText);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(this.media.hashCode() * 31, 31, this.title), 31, this.subtitle);
            String str = this.positiveButtonText;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativeButtonText;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Slides(media=");
            sb.append(this.media);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", positiveButtonText=");
            sb.append(this.positiveButtonText);
            sb.append(", negativeButtonText=");
            return ho8.a(sb, this.negativeButtonText, ')');
        }

        /* compiled from: ShowSlidesSheet.kt */
        public static final class Media {

            @pmi0("blob")
            private final String blob;

            @pmi0("type")
            private final Type type;

            @pmi0("url")
            private final String url;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ShowSlidesSheet.kt */
            public static final class Type {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;

                @pmi0("image")
                public static final Type IMAGE;

                static {
                    Type type = new Type("IMAGE", 0);
                    IMAGE = type;
                    Type[] typeArr = {type};
                    $VALUES = typeArr;
                    $ENTRIES = new asp(typeArr);
                }

                private Type(String str, int i) {
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public Media(Type type, String str, String str2) {
                this.type = type;
                this.url = str;
                this.blob = str2;
            }

            public final String a() {
                return this.blob;
            }

            public final Type b() {
                return this.type;
            }

            public final String c() {
                return this.url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Media)) {
                    return false;
                }
                Media media = (Media) obj;
                return this.type == media.type && epx.f(this.url, media.url) && epx.f(this.blob, media.blob);
            }

            public final int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                String str = this.url;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.blob;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Media(type=");
                sb.append(this.type);
                sb.append(", url=");
                sb.append(this.url);
                sb.append(", blob=");
                return ho8.a(sb, this.blob, ')');
            }

            public /* synthetic */ Media(Type type, String str, String str2, int i, zcl zclVar) {
                this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
            }
        }

        public /* synthetic */ Slides(Media media, String str, String str2, String str3, String str4, int i, zcl zclVar) {
            this(media, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }
}
