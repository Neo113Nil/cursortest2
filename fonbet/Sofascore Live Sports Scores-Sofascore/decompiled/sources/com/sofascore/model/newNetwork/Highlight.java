package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.j69;
import defpackage.joa;
import defpackage.ljg;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0002XWBw\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015B£\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b0\u0010&J\u0012\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b3\u0010&J\u0096\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b6\u0010&J\u0010\u00107\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b7\u0010$J\u001a\u0010:\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010C\u001a\u00020 2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\b\u001c\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010&R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bG\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bH\u0010&R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bI\u0010&R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bJ\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010\u001fR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010/R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bQ\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bS\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bT\u0010&R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bU\u0010&R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010KR\u0011\u0010V\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bV\u0010\u001f¨\u0006Y"}, d2 = {"Lcom/sofascore/model/newNetwork/Highlight;", "Ljava/io/Serializable;", "Lcom/sofascore/model/newNetwork/IHighlightMediaItem;", "", "id", "", "title", "subtitle", "thumbnailUrl", "url", "mediaType", "", "keyHighlight", "", "forCountries", "", "createdAtTimestamp", "sourceUrl", "livestream", "directStreamUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "videoUrl", "watched", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLt5h;)V", "getId", "()Ljava/lang/Integer;", "isWatched", "()Z", "", "markWatched", "()V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "()J", "component10", "component11", "()Ljava/lang/Boolean;", "component12", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/Highlight;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/Highlight;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "Ljava/lang/String;", "getTitle", "getSubtitle", "getThumbnailUrl", "getUrl", "getMediaType", "Z", "getKeyHighlight", "Ljava/util/List;", "getForCountries", "J", "getCreatedAtTimestamp", "getSourceUrl", "Ljava/lang/Boolean;", "getLivestream", "getDirectStreamUrl", "getVideoUrl", "isDirectStream", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Highlight implements Serializable, IHighlightMediaItem {
    private final long createdAtTimestamp;

    @Nullable
    private final String directStreamUrl;

    @Nullable
    private final List<String> forCountries;
    private final int id;
    private final boolean keyHighlight;

    @Nullable
    private final Boolean livestream;
    private final int mediaType;

    @NotNull
    private final String sourceUrl;

    @NotNull
    private final String subtitle;

    @Nullable
    private final String thumbnailUrl;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    @NotNull
    private final String videoUrl;
    private boolean watched;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, ypa.a(ysa.b, new j69(28)), null, null, null, null, null, null};

    public /* synthetic */ Highlight(int i, int i2, String str, String str2, String str3, String str4, int i3, boolean z, List list, long j, String str5, Boolean bool, String str6, String str7, boolean z2, t5h t5hVar) {
        if (2047 != (i & 2047)) {
            oea.z(i, 2047, Highlight$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.title = str;
        this.subtitle = str2;
        this.thumbnailUrl = str3;
        this.url = str4;
        this.mediaType = i3;
        this.keyHighlight = z;
        this.forCountries = list;
        this.createdAtTimestamp = j;
        this.sourceUrl = str5;
        this.livestream = bool;
        if ((i & a.o) == 0) {
            this.directStreamUrl = null;
        } else {
            this.directStreamUrl = str6;
        }
        if ((i & 4096) == 0) {
            this.videoUrl = str4;
        } else {
            this.videoUrl = str7;
        }
        this.watched = (i & 8192) == 0 ? false : z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(uhi.a, 0);
    }

    public static /* synthetic */ Highlight copy$default(Highlight highlight, int i, String str, String str2, String str3, String str4, int i2, boolean z, List list, long j, String str5, Boolean bool, String str6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = highlight.id;
        }
        return highlight.copy(i, (i3 & 2) != 0 ? highlight.title : str, (i3 & 4) != 0 ? highlight.subtitle : str2, (i3 & 8) != 0 ? highlight.thumbnailUrl : str3, (i3 & 16) != 0 ? highlight.url : str4, (i3 & 32) != 0 ? highlight.mediaType : i2, (i3 & 64) != 0 ? highlight.keyHighlight : z, (i3 & 128) != 0 ? highlight.forCountries : list, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? highlight.createdAtTimestamp : j, (i3 & 512) != 0 ? highlight.sourceUrl : str5, (i3 & 1024) != 0 ? highlight.livestream : bool, (i3 & a.o) != 0 ? highlight.directStreamUrl : str6);
    }

    public static final /* synthetic */ void write$Self$model_release(Highlight self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.getTitle());
        output.y(serialDesc, 2, self.getSubtitle());
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 3, uhiVar, self.getThumbnailUrl());
        output.y(serialDesc, 4, self.url);
        output.u(5, self.mediaType, serialDesc);
        output.x(serialDesc, 6, self.keyHighlight);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.forCountries);
        output.E(serialDesc, 8, self.createdAtTimestamp);
        output.y(serialDesc, 9, self.sourceUrl);
        output.h(serialDesc, 10, gz1.a, self.livestream);
        if (output.o(serialDesc) || self.directStreamUrl != null) {
            output.h(serialDesc, 11, uhiVar, self.directStreamUrl);
        }
        if (output.o(serialDesc) || !Intrinsics.c(self.getVideoUrl(), self.url)) {
            output.y(serialDesc, 12, self.getVideoUrl());
        }
        if (output.o(serialDesc) || self.watched) {
            output.x(serialDesc, 13, self.watched);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Boolean getLivestream() {
        return this.livestream;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getDirectStreamUrl() {
        return this.directStreamUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMediaType() {
        return this.mediaType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getKeyHighlight() {
        return this.keyHighlight;
    }

    @Nullable
    public final List<String> component8() {
        return this.forCountries;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @NotNull
    public final Highlight copy(int id, @NotNull String title, @NotNull String subtitle, @Nullable String thumbnailUrl, @NotNull String url, int mediaType, boolean keyHighlight, @Nullable List<String> forCountries, long createdAtTimestamp, @NotNull String sourceUrl, @Nullable Boolean livestream, @Nullable String directStreamUrl) {
        title.getClass();
        subtitle.getClass();
        url.getClass();
        sourceUrl.getClass();
        return new Highlight(id, title, subtitle, thumbnailUrl, url, mediaType, keyHighlight, forCountries, createdAtTimestamp, sourceUrl, livestream, directStreamUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Highlight)) {
            return false;
        }
        Highlight highlight = (Highlight) other;
        return this.id == highlight.id && Intrinsics.c(this.title, highlight.title) && Intrinsics.c(this.subtitle, highlight.subtitle) && Intrinsics.c(this.thumbnailUrl, highlight.thumbnailUrl) && Intrinsics.c(this.url, highlight.url) && this.mediaType == highlight.mediaType && this.keyHighlight == highlight.keyHighlight && Intrinsics.c(this.forCountries, highlight.forCountries) && this.createdAtTimestamp == highlight.createdAtTimestamp && Intrinsics.c(this.sourceUrl, highlight.sourceUrl) && Intrinsics.c(this.livestream, highlight.livestream) && Intrinsics.c(this.directStreamUrl, highlight.directStreamUrl);
    }

    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Nullable
    public final String getDirectStreamUrl() {
        return this.directStreamUrl;
    }

    @Nullable
    public final List<String> getForCountries() {
        return this.forCountries;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @NotNull
    /* renamed from: getId */
    public Integer mo689getId() {
        return Integer.valueOf(this.id);
    }

    public final boolean getKeyHighlight() {
        return this.keyHighlight;
    }

    @Nullable
    public final Boolean getLivestream() {
        return this.livestream;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @NotNull
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

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @NotNull
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle);
        String str = this.thumbnailUrl;
        int e = dmi.e(wv8.a(this.mediaType, dmi.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.url), 31), 31, this.keyHighlight);
        List<String> list = this.forCountries;
        int c2 = dmi.c(ljg.c((e + (list == null ? 0 : list.hashCode())) * 31, 31, this.createdAtTimestamp), 31, this.sourceUrl);
        Boolean bool = this.livestream;
        int hashCode = (c2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.directStreamUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isDirectStream() {
        String str = this.directStreamUrl;
        return !(str == null || StringsKt.R(str));
    }

    /* renamed from: isWatched, reason: from getter */
    public final boolean getWatched() {
        return this.watched;
    }

    public final void markWatched() {
        this.watched = true;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.thumbnailUrl;
        String str4 = this.url;
        int i2 = this.mediaType;
        boolean z = this.keyHighlight;
        List<String> list = this.forCountries;
        long j = this.createdAtTimestamp;
        String str5 = this.sourceUrl;
        Boolean bool = this.livestream;
        String str6 = this.directStreamUrl;
        StringBuilder t = dmi.t(i, "Highlight(id=", ", title=", str, ", subtitle=");
        bf3.v(t, str2, ", thumbnailUrl=", str3, ", url=");
        w1l.q(i2, str4, ", mediaType=", ", keyHighlight=", t);
        t.append(z);
        t.append(", forCountries=");
        t.append(list);
        t.append(", createdAtTimestamp=");
        t.append(j);
        t.append(", sourceUrl=");
        t.append(str5);
        t.append(", livestream=");
        t.append(bool);
        t.append(", directStreamUrl=");
        t.append(str6);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/Highlight$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/Highlight;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Highlight$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public final int getId() {
        return this.id;
    }

    public Highlight(int i, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, int i2, boolean z, @Nullable List<String> list, long j, @NotNull String str5, @Nullable Boolean bool, @Nullable String str6) {
        w1l.y(str, str2, str4, str5);
        this.id = i;
        this.title = str;
        this.subtitle = str2;
        this.thumbnailUrl = str3;
        this.url = str4;
        this.mediaType = i2;
        this.keyHighlight = z;
        this.forCountries = list;
        this.createdAtTimestamp = j;
        this.sourceUrl = str5;
        this.livestream = bool;
        this.directStreamUrl = str6;
        this.videoUrl = str4;
    }

    public /* synthetic */ Highlight(int i, String str, String str2, String str3, String str4, int i2, boolean z, List list, long j, String str5, Boolean bool, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, i2, z, list, j, str5, bool, (i3 & a.o) != 0 ? null : str6);
    }
}
