package com.sofascore.model.newNetwork;

import defpackage.ila;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/sofascore/model/newNetwork/LiveStreamHighlightItem;", "Lcom/sofascore/model/newNetwork/IHighlightMediaItem;", "", "streamContentId", "", "", "streamContentGeoRestrictions", "<init>", "(ILjava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/LiveStreamHighlightItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/sofascore/model/newNetwork/LiveStreamHighlightItem;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStreamContentId", "Ljava/util/List;", "getStreamContentGeoRestrictions", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LiveStreamHighlightItem implements IHighlightMediaItem {

    @Nullable
    private final List<String> streamContentGeoRestrictions;
    private final int streamContentId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new ila(28))};

    public /* synthetic */ LiveStreamHighlightItem(int i, int i2, List list, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, LiveStreamHighlightItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.streamContentId = i2;
        this.streamContentGeoRestrictions = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(uhi.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveStreamHighlightItem copy$default(LiveStreamHighlightItem liveStreamHighlightItem, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = liveStreamHighlightItem.streamContentId;
        }
        if ((i2 & 2) != 0) {
            list = liveStreamHighlightItem.streamContentGeoRestrictions;
        }
        return liveStreamHighlightItem.copy(i, list);
    }

    public static final /* synthetic */ void write$Self$model_release(LiveStreamHighlightItem self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.streamContentId, serialDesc);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.streamContentGeoRestrictions);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStreamContentId() {
        return this.streamContentId;
    }

    @Nullable
    public final List<String> component2() {
        return this.streamContentGeoRestrictions;
    }

    @NotNull
    public final LiveStreamHighlightItem copy(int streamContentId, @Nullable List<String> streamContentGeoRestrictions) {
        return new LiveStreamHighlightItem(streamContentId, streamContentGeoRestrictions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveStreamHighlightItem)) {
            return false;
        }
        LiveStreamHighlightItem liveStreamHighlightItem = (LiveStreamHighlightItem) other;
        return this.streamContentId == liveStreamHighlightItem.streamContentId && Intrinsics.c(this.streamContentGeoRestrictions, liveStreamHighlightItem.streamContentGeoRestrictions);
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    /* renamed from: getId */
    public /* bridge */ Integer mo689getId() {
        return super.mo689getId();
    }

    @Nullable
    public final List<String> getStreamContentGeoRestrictions() {
        return this.streamContentGeoRestrictions;
    }

    public final int getStreamContentId() {
        return this.streamContentId;
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getSubtitle() {
        return super.getSubtitle();
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getThumbnailUrl() {
        return super.getThumbnailUrl();
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getTitle() {
        return super.getTitle();
    }

    @Override // com.sofascore.model.newNetwork.IHighlightMediaItem
    @Nullable
    public /* bridge */ String getVideoUrl() {
        return super.getVideoUrl();
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.streamContentId) * 31;
        List<String> list = this.streamContentGeoRestrictions;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "LiveStreamHighlightItem(streamContentId=" + this.streamContentId + ", streamContentGeoRestrictions=" + this.streamContentGeoRestrictions + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/LiveStreamHighlightItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/LiveStreamHighlightItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LiveStreamHighlightItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LiveStreamHighlightItem(int i, @Nullable List<String> list) {
        this.streamContentId = i;
        this.streamContentGeoRestrictions = list;
    }
}
