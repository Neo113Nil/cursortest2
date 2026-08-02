package com.giphy.sdk.ui.pagination;

import J8.d;
import K8.k;
import N8.j;
import O8.e;
import androidx.annotation.Keep;
import com.giphy.sdk.analytics.models.enums.EventType;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.MediaType;
import com.giphy.sdk.core.models.enums.RatingType;
import com.giphy.sdk.core.network.response.ListMediaResponse;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class GPHContent {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f31771h = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final GPHContent f31772i;

    /* renamed from: j, reason: collision with root package name */
    public static final GPHContent f31773j;

    /* renamed from: k, reason: collision with root package name */
    public static final GPHContent f31774k;

    /* renamed from: l, reason: collision with root package name */
    public static final GPHContent f31775l;

    /* renamed from: m, reason: collision with root package name */
    public static final GPHContent f31776m;

    /* renamed from: n, reason: collision with root package name */
    public static final GPHContent f31777n;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31782e;

    /* renamed from: a, reason: collision with root package name */
    public MediaType f31778a = MediaType.gif;

    /* renamed from: b, reason: collision with root package name */
    public e f31779b = e.trending;

    /* renamed from: c, reason: collision with root package name */
    public RatingType f31780c = RatingType.pg13;

    /* renamed from: d, reason: collision with root package name */
    public String f31781d = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f31783f = true;

    /* renamed from: g, reason: collision with root package name */
    public k f31784g = d.f5962a.d();

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013J\"\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/giphy/sdk/ui/pagination/GPHContent$Companion;", "", "()V", "emoji", "Lcom/giphy/sdk/ui/pagination/GPHContent;", "getEmoji", "()Lcom/giphy/sdk/ui/pagination/GPHContent;", "recents", "getRecents", "trendingGifs", "getTrendingGifs", "trendingStickers", "getTrendingStickers", "trendingText", "getTrendingText", "trendingVideos", "getTrendingVideos", "animate", "input", "", "searchQuery", "search", "mediaType", "Lcom/giphy/sdk/core/models/enums/MediaType;", "ratingType", "Lcom/giphy/sdk/core/models/enums/RatingType;", "trending", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MediaType.values().length];
                try {
                    iArr[MediaType.gif.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MediaType.sticker.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MediaType.text.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MediaType.emoji.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MediaType.video.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ GPHContent searchQuery$default(Companion companion, String str, MediaType mediaType, RatingType ratingType, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                mediaType = MediaType.gif;
            }
            if ((i10 & 4) != 0) {
                ratingType = RatingType.pg13;
            }
            return companion.searchQuery(str, mediaType, ratingType);
        }

        public static /* synthetic */ GPHContent trending$default(Companion companion, MediaType mediaType, RatingType ratingType, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                ratingType = RatingType.pg13;
            }
            return companion.trending(mediaType, ratingType);
        }

        @NotNull
        public final GPHContent animate(@NotNull String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            GPHContent gPHContent = new GPHContent();
            gPHContent.o(false);
            gPHContent.s(input);
            gPHContent.p(MediaType.text);
            gPHContent.r(e.animate);
            return gPHContent;
        }

        @NotNull
        public final GPHContent getEmoji() {
            return GPHContent.f31776m;
        }

        @NotNull
        public final GPHContent getRecents() {
            return GPHContent.f31777n;
        }

        @NotNull
        public final GPHContent getTrendingGifs() {
            return GPHContent.f31773j;
        }

        @NotNull
        public final GPHContent getTrendingStickers() {
            return GPHContent.f31774k;
        }

        @NotNull
        public final GPHContent getTrendingText() {
            return GPHContent.f31775l;
        }

        @NotNull
        public final GPHContent getTrendingVideos() {
            return GPHContent.f31772i;
        }

        @NotNull
        public final GPHContent searchQuery(@NotNull String search, @NotNull MediaType mediaType, @NotNull RatingType ratingType) {
            Intrinsics.checkNotNullParameter(search, "search");
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            Intrinsics.checkNotNullParameter(ratingType, "ratingType");
            GPHContent gPHContent = new GPHContent();
            gPHContent.s(search);
            gPHContent.p(mediaType);
            gPHContent.q(ratingType);
            gPHContent.r(e.search);
            return gPHContent;
        }

        @NotNull
        public final GPHContent trending(@NotNull MediaType mediaType, @NotNull RatingType ratingType) {
            GPHContent trendingGifs;
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            Intrinsics.checkNotNullParameter(ratingType, "ratingType");
            int i10 = a.$EnumSwitchMapping$0[mediaType.ordinal()];
            if (i10 == 1) {
                trendingGifs = getTrendingGifs();
            } else if (i10 == 2) {
                trendingGifs = getTrendingStickers();
            } else if (i10 == 3) {
                trendingGifs = getTrendingText();
            } else if (i10 == 4) {
                trendingGifs = getEmoji();
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                trendingGifs = getTrendingVideos();
            }
            trendingGifs.q(ratingType);
            return trendingGifs;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RatingType.values().length];
            try {
                iArr[RatingType.r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingType.unrated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RatingType.nsfw.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[e.values().length];
            try {
                iArr2[e.trending.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[e.search.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[e.emoji.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[e.recents.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[e.animate.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class b implements K8.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ K8.a f31785a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EventType f31786b;

        public b(K8.a aVar, EventType eventType) {
            this.f31785a = aVar;
            this.f31786b = eventType;
        }

        @Override // K8.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ListMediaResponse listMediaResponse, Throwable th2) {
            List<Media> data;
            if (listMediaResponse != null && (data = listMediaResponse.getData()) != null) {
                EventType eventType = this.f31786b;
                for (Media media : data) {
                    Boolean a10 = j.a(media);
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.areEqual(a10, bool)) {
                        media.setType(MediaType.emoji);
                    } else if (Intrinsics.areEqual(j.b(media), bool)) {
                        media.setType(MediaType.text);
                    } else if (media.getIsSticker()) {
                        media.setType(MediaType.sticker);
                    }
                    media.setEventType(eventType);
                }
            }
            this.f31785a.a(listMediaResponse, th2);
        }
    }

    static {
        GPHContent gPHContent = new GPHContent();
        gPHContent.f31778a = MediaType.video;
        e eVar = e.trending;
        gPHContent.f31779b = eVar;
        f31772i = gPHContent;
        GPHContent gPHContent2 = new GPHContent();
        MediaType mediaType = MediaType.gif;
        gPHContent2.f31778a = mediaType;
        gPHContent2.f31779b = eVar;
        f31773j = gPHContent2;
        GPHContent gPHContent3 = new GPHContent();
        gPHContent3.f31778a = MediaType.sticker;
        gPHContent3.f31779b = eVar;
        f31774k = gPHContent3;
        GPHContent gPHContent4 = new GPHContent();
        gPHContent4.f31778a = MediaType.text;
        gPHContent4.f31779b = eVar;
        f31775l = gPHContent4;
        GPHContent gPHContent5 = new GPHContent();
        gPHContent5.f31778a = MediaType.emoji;
        gPHContent5.f31779b = e.emoji;
        f31776m = gPHContent5;
        GPHContent gPHContent6 = new GPHContent();
        gPHContent6.f31778a = mediaType;
        gPHContent6.f31779b = e.recents;
        gPHContent6.f31783f = false;
        f31777n = gPHContent6;
    }

    public static /* synthetic */ K8.a h(GPHContent gPHContent, K8.a aVar, EventType eventType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eventType = null;
        }
        return gPHContent.g(aVar, eventType);
    }

    public final K8.a g(K8.a aVar, EventType eventType) {
        return new b(aVar, eventType);
    }

    public final boolean i() {
        return this.f31783f;
    }

    public final MediaType j() {
        return this.f31778a;
    }

    public final e k() {
        return this.f31779b;
    }

    public final String l() {
        return this.f31781d;
    }

    public final RatingType m() {
        int i10 = a.$EnumSwitchMapping$0[this.f31780c.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? RatingType.pg13 : this.f31780c;
    }

    public final Future n(int i10, K8.a completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        this.f31782e = true;
        int i11 = a.$EnumSwitchMapping$1[this.f31779b.ordinal()];
        if (i11 == 1) {
            return this.f31784g.y(this.f31778a, 25, Integer.valueOf(i10), m(), h(this, completionHandler, null, 2, null));
        }
        if (i11 == 2) {
            return this.f31784g.x(this.f31781d, this.f31778a, 25, Integer.valueOf(i10), m(), null, h(this, completionHandler, null, 2, null));
        }
        if (i11 == 3) {
            return this.f31784g.j(25, Integer.valueOf(i10), RatingType.pg13, h(this, completionHandler, null, 2, null));
        }
        if (i11 == 4) {
            return this.f31784g.p(O8.k.f8390a.g().c(), g(N8.a.c(completionHandler, false, false, false, 7, null), EventType.GIF_RECENT), "GIF_RECENT");
        }
        if (i11 == 5) {
            return this.f31784g.i(this.f31781d, null, h(this, completionHandler, null, 2, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void o(boolean z10) {
        this.f31783f = z10;
    }

    public final void p(MediaType mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
        this.f31778a = mediaType;
    }

    public final void q(RatingType ratingType) {
        Intrinsics.checkNotNullParameter(ratingType, "<set-?>");
        this.f31780c = ratingType;
    }

    public final void r(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f31779b = eVar;
    }

    public final void s(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f31781d = str;
    }

    public final GPHContent t(k newClient) {
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        this.f31784g = newClient;
        return this;
    }
}
