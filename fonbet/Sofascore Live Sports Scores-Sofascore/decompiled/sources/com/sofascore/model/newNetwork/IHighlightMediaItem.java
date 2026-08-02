package com.sofascore.model.newNetwork;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/sofascore/model/newNetwork/IHighlightMediaItem;", "Ljava/io/Serializable;", "getId", "", "()Ljava/lang/Integer;", "thumbnailUrl", "", "getThumbnailUrl", "()Ljava/lang/String;", "title", "getTitle", "subtitle", "getSubtitle", "videoUrl", "getVideoUrl", "Lcom/sofascore/model/newNetwork/EventMediaNews;", "Lcom/sofascore/model/newNetwork/Highlight;", "Lcom/sofascore/model/newNetwork/LiveStreamHighlightItem;", "Lcom/sofascore/model/newNetwork/UnknownMediaItem;", "Lcom/sofascore/model/newNetwork/VideoHighlight;", "Lcom/sofascore/model/newNetwork/WSCStory;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface IHighlightMediaItem extends Serializable {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static Integer getId(@NotNull IHighlightMediaItem iHighlightMediaItem) {
            return IHighlightMediaItem.super.mo689getId();
        }

        @Deprecated
        @Nullable
        public static String getSubtitle(@NotNull IHighlightMediaItem iHighlightMediaItem) {
            return IHighlightMediaItem.super.getSubtitle();
        }

        @Deprecated
        @Nullable
        public static String getThumbnailUrl(@NotNull IHighlightMediaItem iHighlightMediaItem) {
            return IHighlightMediaItem.super.getThumbnailUrl();
        }

        @Deprecated
        @Nullable
        public static String getTitle(@NotNull IHighlightMediaItem iHighlightMediaItem) {
            return IHighlightMediaItem.super.getTitle();
        }

        @Deprecated
        @Nullable
        public static String getVideoUrl(@NotNull IHighlightMediaItem iHighlightMediaItem) {
            return IHighlightMediaItem.super.getVideoUrl();
        }
    }

    @Nullable
    /* renamed from: getId */
    default Integer mo689getId() {
        return null;
    }

    @Nullable
    default String getSubtitle() {
        return null;
    }

    @Nullable
    default String getThumbnailUrl() {
        return "";
    }

    @Nullable
    default String getTitle() {
        return null;
    }

    @Nullable
    default String getVideoUrl() {
        return null;
    }
}
