package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB}\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,Jh\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010$J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\"J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b\u001f\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b;\u0010$R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b<\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b=\u0010$R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b>\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\bA\u0010$R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\bB\u0010$¨\u0006E"}, d2 = {"Lcom/sofascore/model/newNetwork/EventMediaNews;", "Lcom/sofascore/model/newNetwork/IHighlightMediaItem;", "", "id", "", "thumbnailUrl", "Lcom/sofascore/model/newNetwork/NewsProvider;", "newsProvider", "description", "header", "externalUrl", "contentId", "", "publishedAtTimestamp", "<init>", "(ILjava/lang/String;Lcom/sofascore/model/newNetwork/NewsProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "seen0", "subtitle", "title", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/sofascore/model/newNetwork/NewsProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EventMediaNews;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getId", "()Ljava/lang/Integer;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/sofascore/model/newNetwork/NewsProvider;", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Long;", "copy", "(ILjava/lang/String;Lcom/sofascore/model/newNetwork/NewsProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/sofascore/model/newNetwork/EventMediaNews;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "Ljava/lang/String;", "getThumbnailUrl", "Lcom/sofascore/model/newNetwork/NewsProvider;", "getNewsProvider", "getDescription", "getHeader", "getExternalUrl", "getContentId", "Ljava/lang/Long;", "getPublishedAtTimestamp", "getSubtitle", "getTitle", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventMediaNews implements IHighlightMediaItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String contentId;

    @Nullable
    private final String description;

    @Nullable
    private final String externalUrl;

    @NotNull
    private final String header;
    private final int id;

    @NotNull
    private final NewsProvider newsProvider;

    @Nullable
    private final Long publishedAtTimestamp;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String thumbnailUrl;

    @NotNull
    private final String title;

    public /* synthetic */ EventMediaNews(int i, int i2, String str, NewsProvider newsProvider, String str2, String str3, String str4, String str5, Long l, String str6, String str7, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, EventMediaNews$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.thumbnailUrl = str;
        this.newsProvider = newsProvider;
        this.description = str2;
        this.header = str3;
        this.externalUrl = str4;
        this.contentId = str5;
        this.publishedAtTimestamp = l;
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.subtitle = str2;
        } else {
            this.subtitle = str6;
        }
        if ((i & 512) == 0) {
            this.title = str3;
        } else {
            this.title = str7;
        }
    }

    public static /* synthetic */ EventMediaNews copy$default(EventMediaNews eventMediaNews, int i, String str, NewsProvider newsProvider, String str2, String str3, String str4, String str5, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eventMediaNews.id;
        }
        if ((i2 & 2) != 0) {
            str = eventMediaNews.thumbnailUrl;
        }
        if ((i2 & 4) != 0) {
            newsProvider = eventMediaNews.newsProvider;
        }
        if ((i2 & 8) != 0) {
            str2 = eventMediaNews.description;
        }
        if ((i2 & 16) != 0) {
            str3 = eventMediaNews.header;
        }
        if ((i2 & 32) != 0) {
            str4 = eventMediaNews.externalUrl;
        }
        if ((i2 & 64) != 0) {
            str5 = eventMediaNews.contentId;
        }
        if ((i2 & 128) != 0) {
            l = eventMediaNews.publishedAtTimestamp;
        }
        String str6 = str5;
        Long l2 = l;
        String str7 = str3;
        String str8 = str4;
        return eventMediaNews.copy(i, str, newsProvider, str2, str7, str8, str6, l2);
    }

    public static final /* synthetic */ void write$Self$model_release(EventMediaNews self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 1, uhiVar, self.getThumbnailUrl());
        output.f(serialDesc, 2, NewsProvider$$serializer.INSTANCE, self.newsProvider);
        output.h(serialDesc, 3, uhiVar, self.description);
        output.y(serialDesc, 4, self.header);
        output.h(serialDesc, 5, uhiVar, self.externalUrl);
        output.y(serialDesc, 6, self.contentId);
        output.h(serialDesc, 7, lkb.a, self.publishedAtTimestamp);
        if (output.o(serialDesc) || !Intrinsics.c(self.getSubtitle(), self.description)) {
            output.h(serialDesc, 8, uhiVar, self.getSubtitle());
        }
        if (!output.o(serialDesc) && Intrinsics.c(self.getTitle(), self.header)) {
            return;
        }
        output.y(serialDesc, 9, self.getTitle());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final NewsProvider getNewsProvider() {
        return this.newsProvider;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getExternalUrl() {
        return this.externalUrl;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Long getPublishedAtTimestamp() {
        return this.publishedAtTimestamp;
    }

    @NotNull
    public final EventMediaNews copy(int id, @Nullable String thumbnailUrl, @NotNull NewsProvider newsProvider, @Nullable String description, @NotNull String header, @Nullable String externalUrl, @NotNull String contentId, @Nullable Long publishedAtTimestamp) {
        newsProvider.getClass();
        header.getClass();
        contentId.getClass();
        return new EventMediaNews(id, thumbnailUrl, newsProvider, description, header, externalUrl, contentId, publishedAtTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMediaNews)) {
            return false;
        }
        EventMediaNews eventMediaNews = (EventMediaNews) other;
        return this.id == eventMediaNews.id && Intrinsics.c(this.thumbnailUrl, eventMediaNews.thumbnailUrl) && Intrinsics.c(this.newsProvider, eventMediaNews.newsProvider) && Intrinsics.c(this.description, eventMediaNews.description) && Intrinsics.c(this.header, eventMediaNews.header) && Intrinsics.c(this.externalUrl, eventMediaNews.externalUrl) && Intrinsics.c(this.contentId, eventMediaNews.contentId) && Intrinsics.c(this.publishedAtTimestamp, eventMediaNews.publishedAtTimestamp);
    }

    @NotNull
    public final String getContentId() {
        return this.contentId;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getExternalUrl() {
        return this.externalUrl;
    }

    @NotNull
    public final String getHeader() {
        return this.header;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @NotNull
    /* renamed from: getId, reason: collision with other method in class */
    public Integer mo689getId() {
        return Integer.valueOf(this.id);
    }

    @NotNull
    public final NewsProvider getNewsProvider() {
        return this.newsProvider;
    }

    @Nullable
    public final Long getPublishedAtTimestamp() {
        return this.publishedAtTimestamp;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public String getSubtitle() {
        return this.subtitle;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @NotNull
    public String getTitle() {
        return this.title;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getVideoUrl() {
        return super.getVideoUrl();
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.thumbnailUrl;
        int hashCode2 = (this.newsProvider.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.description;
        int c = dmi.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.header);
        String str3 = this.externalUrl;
        int c2 = dmi.c((c + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.contentId);
        Long l = this.publishedAtTimestamp;
        return c2 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.thumbnailUrl;
        NewsProvider newsProvider = this.newsProvider;
        String str2 = this.description;
        String str3 = this.header;
        String str4 = this.externalUrl;
        String str5 = this.contentId;
        Long l = this.publishedAtTimestamp;
        StringBuilder t = dmi.t(i, "EventMediaNews(id=", ", thumbnailUrl=", str, ", newsProvider=");
        t.append(newsProvider);
        t.append(", description=");
        t.append(str2);
        t.append(", header=");
        bf3.v(t, str3, ", externalUrl=", str4, ", contentId=");
        t.append(str5);
        t.append(", publishedAtTimestamp=");
        t.append(l);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EventMediaNews$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EventMediaNews;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventMediaNews$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public final int getId() {
        return this.id;
    }

    public EventMediaNews(int i, @Nullable String str, @NotNull NewsProvider newsProvider, @Nullable String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, @Nullable Long l) {
        newsProvider.getClass();
        str3.getClass();
        str5.getClass();
        this.id = i;
        this.thumbnailUrl = str;
        this.newsProvider = newsProvider;
        this.description = str2;
        this.header = str3;
        this.externalUrl = str4;
        this.contentId = str5;
        this.publishedAtTimestamp = l;
        this.subtitle = str2;
        this.title = str3;
    }
}
