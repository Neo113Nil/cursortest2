package com.sofascore.model.newNetwork;

import defpackage.bf3;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0002;:B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rBi\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\"JT\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010 J\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b\u001d\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b3\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b4\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b7\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b8\u0010\"R\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b9\u0010\"¨\u0006<"}, d2 = {"Lcom/sofascore/model/newNetwork/VideoHighlight;", "Ljava/io/Serializable;", "Lcom/sofascore/model/newNetwork/IHighlightMediaItem;", "", "id", "", "url", "title", "description", "", "embeddable", "thumbnailUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "subtitle", "videoUrl", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/VideoHighlight;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "getId", "()Ljava/lang/Integer;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/VideoHighlight;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "Ljava/lang/String;", "getUrl", "getTitle", "getDescription", "Ljava/lang/Boolean;", "getEmbeddable", "getThumbnailUrl", "getSubtitle", "getVideoUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VideoHighlight implements Serializable, IHighlightMediaItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String description;

    @Nullable
    private final Boolean embeddable;
    private final int id;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String thumbnailUrl;

    @Nullable
    private final String title;

    @NotNull
    private final String url;

    @NotNull
    private final String videoUrl;

    public /* synthetic */ VideoHighlight(int i, int i2, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, VideoHighlight$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.url = str;
        this.title = str2;
        this.description = str3;
        this.embeddable = bool;
        this.thumbnailUrl = str4;
        if ((i & 64) == 0) {
            this.subtitle = str3;
        } else {
            this.subtitle = str5;
        }
        if ((i & 128) == 0) {
            this.videoUrl = str;
        } else {
            this.videoUrl = str6;
        }
    }

    public static /* synthetic */ VideoHighlight copy$default(VideoHighlight videoHighlight, int i, String str, String str2, String str3, Boolean bool, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoHighlight.id;
        }
        if ((i2 & 2) != 0) {
            str = videoHighlight.url;
        }
        if ((i2 & 4) != 0) {
            str2 = videoHighlight.title;
        }
        if ((i2 & 8) != 0) {
            str3 = videoHighlight.description;
        }
        if ((i2 & 16) != 0) {
            bool = videoHighlight.embeddable;
        }
        if ((i2 & 32) != 0) {
            str4 = videoHighlight.thumbnailUrl;
        }
        Boolean bool2 = bool;
        String str5 = str4;
        return videoHighlight.copy(i, str, str2, str3, bool2, str5);
    }

    public static final /* synthetic */ void write$Self$model_release(VideoHighlight self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.url);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.getTitle());
        output.h(serialDesc, 3, uhiVar, self.description);
        output.h(serialDesc, 4, gz1.a, self.embeddable);
        output.h(serialDesc, 5, uhiVar, self.getThumbnailUrl());
        if (output.o(serialDesc) || !Intrinsics.c(self.getSubtitle(), self.description)) {
            output.h(serialDesc, 6, uhiVar, self.getSubtitle());
        }
        if (!output.o(serialDesc) && Intrinsics.c(self.getVideoUrl(), self.url)) {
            return;
        }
        output.y(serialDesc, 7, self.getVideoUrl());
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getEmbeddable() {
        return this.embeddable;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @NotNull
    public final VideoHighlight copy(int id, @NotNull String url, @Nullable String title, @Nullable String description, @Nullable Boolean embeddable, @Nullable String thumbnailUrl) {
        url.getClass();
        return new VideoHighlight(id, url, title, description, embeddable, thumbnailUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoHighlight)) {
            return false;
        }
        VideoHighlight videoHighlight = (VideoHighlight) other;
        return this.id == videoHighlight.id && Intrinsics.c(this.url, videoHighlight.url) && Intrinsics.c(this.title, videoHighlight.title) && Intrinsics.c(this.description, videoHighlight.description) && Intrinsics.c(this.embeddable, videoHighlight.embeddable) && Intrinsics.c(this.thumbnailUrl, videoHighlight.thumbnailUrl);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Boolean getEmbeddable() {
        return this.embeddable;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @NotNull
    /* renamed from: getId */
    public Integer mo689getId() {
        return Integer.valueOf(this.id);
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
    @Nullable
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
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.url);
        String str = this.title;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.embeddable;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.thumbnailUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.url;
        String str2 = this.title;
        String str3 = this.description;
        Boolean bool = this.embeddable;
        String str4 = this.thumbnailUrl;
        StringBuilder t = dmi.t(i, "VideoHighlight(id=", ", url=", str, ", title=");
        bf3.v(t, str2, ", description=", str3, ", embeddable=");
        t.append(bool);
        t.append(", thumbnailUrl=");
        t.append(str4);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/VideoHighlight$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/VideoHighlight;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VideoHighlight$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public final int getId() {
        return this.id;
    }

    public VideoHighlight(int i, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4) {
        str.getClass();
        this.id = i;
        this.url = str;
        this.title = str2;
        this.description = str3;
        this.embeddable = bool;
        this.thumbnailUrl = str4;
        this.subtitle = str3;
        this.videoUrl = str;
    }
}
