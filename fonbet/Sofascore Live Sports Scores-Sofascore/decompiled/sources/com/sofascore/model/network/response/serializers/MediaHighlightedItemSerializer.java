package com.sofascore.model.network.response.serializers;

import com.sofascore.model.network.response.MediaHighlightedItem;
import com.sofascore.model.network.response.MediaHighlightedItemResponseKt;
import com.sofascore.model.newNetwork.EventMediaNews;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.LiveStreamHighlightItem;
import com.sofascore.model.newNetwork.UnknownMediaItem;
import com.sofascore.model.newNetwork.VideoHighlight;
import com.sofascore.model.newNetwork.WSCStory;
import defpackage.duf;
import defpackage.dy4;
import defpackage.hfa;
import defpackage.qfa;
import kotlin.Metadata;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/network/response/serializers/MediaHighlightedItemSerializer;", "Lhfa;", "Lcom/sofascore/model/network/response/MediaHighlightedItem;", "<init>", "()V", "Lkotlinx/serialization/json/b;", "element", "Ldy4;", "selectDeserializer", "(Lkotlinx/serialization/json/b;)Ldy4;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaHighlightedItemSerializer extends hfa {

    @NotNull
    public static final MediaHighlightedItemSerializer INSTANCE = new MediaHighlightedItemSerializer();

    private MediaHighlightedItemSerializer() {
        super(duf.a.getOrCreateKotlinClass(MediaHighlightedItem.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.hfa
    @NotNull
    public dy4 selectDeserializer(@NotNull b element) {
        element.getClass();
        b bVar = (b) qfa.g(element).get("type");
        String c = bVar != null ? qfa.h(bVar).c() : null;
        if (c != null) {
            switch (c.hashCode()) {
                case -681210700:
                    if (c.equals(MediaHighlightedItemResponseKt.HIGHLIGHT)) {
                        return MediaHighlightedItem.INSTANCE.serializer(Highlight.INSTANCE.serializer());
                    }
                    break;
                case 684103331:
                    if (c.equals(MediaHighlightedItemResponseKt.NEWS_ARTICLE)) {
                        return MediaHighlightedItem.INSTANCE.serializer(EventMediaNews.INSTANCE.serializer());
                    }
                    break;
                case 870812556:
                    if (c.equals(MediaHighlightedItemResponseKt.LIVE_STREAM)) {
                        return MediaHighlightedItem.INSTANCE.serializer(LiveStreamHighlightItem.INSTANCE.serializer());
                    }
                    break;
                case 905136909:
                    if (c.equals(MediaHighlightedItemResponseKt.SPORT_VIDEO_HIGHLIGHT)) {
                        return MediaHighlightedItem.INSTANCE.serializer(WSCStory.INSTANCE.serializer());
                    }
                    break;
                case 1913026328:
                    if (c.equals(MediaHighlightedItemResponseKt.YOUTUBE_VIDEO)) {
                        return MediaHighlightedItem.INSTANCE.serializer(VideoHighlight.INSTANCE.serializer());
                    }
                    break;
            }
        }
        return MediaHighlightedItem.INSTANCE.serializer(UnknownMediaItem.INSTANCE.serializer());
    }
}
