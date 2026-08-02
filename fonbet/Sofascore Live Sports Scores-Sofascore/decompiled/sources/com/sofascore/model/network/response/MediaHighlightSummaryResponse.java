package com.sofascore.model.network.response;

import com.sofascore.model.network.response.serializers.MediaHighlightedItemSerializer;
import defpackage.a7a;
import defpackage.b1c;
import defpackage.joa;
import defpackage.l98;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BS\u0012\u001b\u0010\u0006\u001a\u0017\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012#\u0010\b\u001a\u001f\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u0017\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001c\u001a\u001f\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJb\u0010 \u001a\u00020\u00002\u001d\b\u0002\u0010\u0006\u001a\u0017\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052%\b\u0002\u0010\b\u001a\u001f\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R,\u0010\u0006\u001a\u0017\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001bR4\u0010\b\u001a\u001f\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, d2 = {"Lcom/sofascore/model/network/response/MediaHighlightSummaryResponse;", "", "Lcom/sofascore/model/network/response/MediaHighlightedItem;", "Lr5h;", "with", "Lcom/sofascore/model/network/response/serializers/MediaHighlightedItemSerializer;", "highlightedItem", "", "mediaItems", "", "itemsCount", "<init>", "(Lcom/sofascore/model/network/response/MediaHighlightedItem;Ljava/util/List;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/MediaHighlightedItem;Ljava/util/List;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/MediaHighlightSummaryResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/network/response/MediaHighlightedItem;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/network/response/MediaHighlightedItem;Ljava/util/List;Ljava/lang/Integer;)Lcom/sofascore/model/network/response/MediaHighlightSummaryResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/network/response/MediaHighlightedItem;", "getHighlightedItem", "Ljava/util/List;", "getMediaItems", "Ljava/lang/Integer;", "getItemsCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MediaHighlightSummaryResponse {

    @Nullable
    private final MediaHighlightedItem<?> highlightedItem;

    @Nullable
    private final Integer itemsCount;

    @Nullable
    private final List<MediaHighlightedItem<?>> mediaItems;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new b1c(3)), null};

    public /* synthetic */ MediaHighlightSummaryResponse(int i, MediaHighlightedItem mediaHighlightedItem, List list, Integer num, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, MediaHighlightSummaryResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.highlightedItem = mediaHighlightedItem;
        this.mediaItems = list;
        this.itemsCount = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(l98.W(MediaHighlightedItemSerializer.INSTANCE), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaHighlightSummaryResponse copy$default(MediaHighlightSummaryResponse mediaHighlightSummaryResponse, MediaHighlightedItem mediaHighlightedItem, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaHighlightedItem = mediaHighlightSummaryResponse.highlightedItem;
        }
        if ((i & 2) != 0) {
            list = mediaHighlightSummaryResponse.mediaItems;
        }
        if ((i & 4) != 0) {
            num = mediaHighlightSummaryResponse.itemsCount;
        }
        return mediaHighlightSummaryResponse.copy(mediaHighlightedItem, list, num);
    }

    public static final /* synthetic */ void write$Self$model_release(MediaHighlightSummaryResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, MediaHighlightedItemSerializer.INSTANCE, self.highlightedItem);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.mediaItems);
        output.h(serialDesc, 2, a7a.a, self.itemsCount);
    }

    @Nullable
    public final MediaHighlightedItem<?> component1() {
        return this.highlightedItem;
    }

    @Nullable
    public final List<MediaHighlightedItem<?>> component2() {
        return this.mediaItems;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getItemsCount() {
        return this.itemsCount;
    }

    @NotNull
    public final MediaHighlightSummaryResponse copy(@Nullable MediaHighlightedItem<?> highlightedItem, @Nullable List<? extends MediaHighlightedItem<?>> mediaItems, @Nullable Integer itemsCount) {
        return new MediaHighlightSummaryResponse(highlightedItem, mediaItems, itemsCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaHighlightSummaryResponse)) {
            return false;
        }
        MediaHighlightSummaryResponse mediaHighlightSummaryResponse = (MediaHighlightSummaryResponse) other;
        return Intrinsics.c(this.highlightedItem, mediaHighlightSummaryResponse.highlightedItem) && Intrinsics.c(this.mediaItems, mediaHighlightSummaryResponse.mediaItems) && Intrinsics.c(this.itemsCount, mediaHighlightSummaryResponse.itemsCount);
    }

    @Nullable
    public final MediaHighlightedItem<?> getHighlightedItem() {
        return this.highlightedItem;
    }

    @Nullable
    public final Integer getItemsCount() {
        return this.itemsCount;
    }

    @Nullable
    public final List<MediaHighlightedItem<?>> getMediaItems() {
        return this.mediaItems;
    }

    public int hashCode() {
        MediaHighlightedItem<?> mediaHighlightedItem = this.highlightedItem;
        int hashCode = (mediaHighlightedItem == null ? 0 : mediaHighlightedItem.hashCode()) * 31;
        List<MediaHighlightedItem<?>> list = this.mediaItems;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.itemsCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        MediaHighlightedItem<?> mediaHighlightedItem = this.highlightedItem;
        List<MediaHighlightedItem<?>> list = this.mediaItems;
        Integer num = this.itemsCount;
        StringBuilder sb = new StringBuilder("MediaHighlightSummaryResponse(highlightedItem=");
        sb.append(mediaHighlightedItem);
        sb.append(", mediaItems=");
        sb.append(list);
        sb.append(", itemsCount=");
        return vxd.n(sb, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/MediaHighlightSummaryResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/MediaHighlightSummaryResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MediaHighlightSummaryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaHighlightSummaryResponse(@Nullable MediaHighlightedItem<?> mediaHighlightedItem, @Nullable List<? extends MediaHighlightedItem<?>> list, @Nullable Integer num) {
        this.highlightedItem = mediaHighlightedItem;
        this.mediaItems = list;
        this.itemsCount = num;
    }
}
