package com.vk.clips.sdk.shared.api.analytics;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.cq;
import xsna.epx;
import xsna.vu5;
import xsna.zrp;

/* compiled from: SdkClipViewerClick.kt */
/* loaded from: classes17.dex */
public abstract class SdkClipViewerClick {
    public final SdkVideoFile a;

    /* compiled from: SdkClipViewerClick.kt */
    public static final class InlineNps extends SdkClipViewerClick {
        public final String b;
        public final String c;
        public final ClickEvent d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SdkClipViewerClick.kt */
        public static final class ClickEvent {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ClickEvent[] $VALUES;
            public static final ClickEvent SKIP;

            static {
                ClickEvent clickEvent = new ClickEvent(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 0);
                SKIP = clickEvent;
                ClickEvent[] clickEventArr = {clickEvent};
                $VALUES = clickEventArr;
                $ENTRIES = new asp(clickEventArr);
            }

            public ClickEvent() {
                throw null;
            }

            public static ClickEvent valueOf(String str) {
                return (ClickEvent) Enum.valueOf(ClickEvent.class, str);
            }

            public static ClickEvent[] values() {
                return (ClickEvent[]) $VALUES.clone();
            }
        }

        public InlineNps(SdkClipVideoFile sdkClipVideoFile, String str, String str2, ClickEvent clickEvent) {
            super(sdkClipVideoFile);
            this.b = str;
            this.c = str2;
            this.d = clickEvent;
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class a extends SdkClipViewerClick {
        public final SdkActionLink b;

        public a(SdkVideoFile sdkVideoFile, SdkActionLink sdkActionLink) {
            super(sdkVideoFile);
            this.b = sdkActionLink;
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class b extends SdkClipViewerClick {
        public final boolean b;

        public b(SdkVideoFile sdkVideoFile, boolean z) {
            super(sdkVideoFile);
            this.b = z;
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class c extends SdkClipViewerClick {
        public c(SdkVideoFile sdkVideoFile) {
            super(sdkVideoFile);
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class d extends SdkClipViewerClick {
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static abstract class e extends SdkClipViewerClick {

        /* compiled from: SdkClipViewerClick.kt */
        public static final class a extends e {
            public final String b;

            public a(SdkClipVideoFile sdkClipVideoFile, String str) {
                super(sdkClipVideoFile);
                this.b = str;
            }
        }

        /* compiled from: SdkClipViewerClick.kt */
        public static final class b extends e {
            public final String b;

            public b(SdkClipVideoFile sdkClipVideoFile, String str) {
                super(sdkClipVideoFile);
                this.b = str;
            }
        }

        /* compiled from: SdkClipViewerClick.kt */
        public static final class c extends e {
            public final String b;

            public c(SdkClipVideoFile sdkClipVideoFile, String str) {
                super(sdkClipVideoFile);
                this.b = str;
            }
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class f extends SdkClipViewerClick {
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class g extends SdkClipViewerClick {
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class h extends SdkClipViewerClick {
        public final boolean b;

        public h(VideoFileAdapter videoFileAdapter, boolean z) {
            super(videoFileAdapter);
            this.b = z;
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class i extends SdkClipViewerClick {
        public final SdkClipVideoFile b;
        public final int c;

        public i(int i, SdkClipVideoFile sdkClipVideoFile) {
            super(sdkClipVideoFile);
            this.b = sdkClipVideoFile;
            this.c = i;
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
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendsCommentsActivitiesClicked(clip=");
            sb.append(this.b);
            sb.append(", commentId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class j extends SdkClipViewerClick {
        public final SdkClipVideoFile b;

        public j(SdkClipVideoFile sdkClipVideoFile) {
            super(sdkClipVideoFile);
            this.b = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("FriendsLikesActivitiesClicked(clip="), this.b, ')');
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class k extends SdkClipViewerClick {
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class l extends SdkClipViewerClick {
        public final boolean b;

        public l(VideoFileAdapter videoFileAdapter, boolean z) {
            super(videoFileAdapter);
            this.b = z;
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class m extends SdkClipViewerClick {
        public final Long b;

        public m(SdkClipVideoFile sdkClipVideoFile, Long l) {
            super(sdkClipVideoFile);
            this.b = l;
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class n extends SdkClipViewerClick {
        public final long b;
        public final long c;

        public n(SdkClipVideoFile sdkClipVideoFile, long j, long j2) {
            super(sdkClipVideoFile);
            this.b = j;
            this.c = j2;
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class o extends SdkClipViewerClick {
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class p extends SdkClipViewerClick {
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class q extends SdkClipViewerClick {
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final String f;
        public final String g;

        public q(SdkClipVideoFile sdkClipVideoFile, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2) {
            super(sdkClipVideoFile);
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = str;
            this.g = str2;
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class r extends SdkClipViewerClick {
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class s extends SdkClipViewerClick {
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class t extends SdkClipViewerClick {
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class u extends SdkClipViewerClick {
        public final boolean b;

        public u(SdkVideoFile sdkVideoFile, boolean z) {
            super(sdkVideoFile);
            this.b = z;
        }
    }

    /* compiled from: SdkClipViewerClick.kt */
    public static final class v extends SdkClipViewerClick {
        public final String b;
        public final String c;

        public v(SdkClipVideoFile sdkClipVideoFile, String str, String str2) {
            super(sdkClipVideoFile);
            this.b = str;
            this.c = str2;
        }
    }

    public SdkClipViewerClick(SdkVideoFile sdkVideoFile) {
        this.a = sdkVideoFile;
    }
}
