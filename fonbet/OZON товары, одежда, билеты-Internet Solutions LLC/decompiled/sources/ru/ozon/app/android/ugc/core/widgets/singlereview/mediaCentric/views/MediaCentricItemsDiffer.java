package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import Xc.a;
import Xc.b;
import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemsDiffer;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;)Z", "areContentsTheSame", "", "getChangePayload", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;)Ljava/lang/Object;", "MediaCentricItemPayload", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricItemsDiffer extends i.d<MediaCentricVO.MediaItemVO> {

    @NotNull
    public static final MediaCentricItemsDiffer INSTANCE = new MediaCentricItemsDiffer();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemsDiffer$MediaCentricItemPayload;", "", "<init>", "(Ljava/lang/String;I)V", "POSITION_PAYLOAD", "PLAYBACK_AVAILABLE_PAYLOAD", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaCentricItemPayload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ MediaCentricItemPayload[] $VALUES;
        public static final MediaCentricItemPayload POSITION_PAYLOAD = new MediaCentricItemPayload("POSITION_PAYLOAD", 0);
        public static final MediaCentricItemPayload PLAYBACK_AVAILABLE_PAYLOAD = new MediaCentricItemPayload("PLAYBACK_AVAILABLE_PAYLOAD", 1);

        private static final /* synthetic */ MediaCentricItemPayload[] $values() {
            return new MediaCentricItemPayload[]{POSITION_PAYLOAD, PLAYBACK_AVAILABLE_PAYLOAD};
        }

        static {
            MediaCentricItemPayload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private MediaCentricItemPayload(String str, int i11) {
        }

        public static MediaCentricItemPayload valueOf(String str) {
            return (MediaCentricItemPayload) Enum.valueOf(MediaCentricItemPayload.class, str);
        }

        public static MediaCentricItemPayload[] values() {
            return (MediaCentricItemPayload[]) $VALUES.clone();
        }
    }

    private MediaCentricItemsDiffer() {
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull MediaCentricVO.MediaItemVO oldItem, @NotNull MediaCentricVO.MediaItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if ((oldItem instanceof MediaCentricVO.MediaItemVO.Image) && (newItem instanceof MediaCentricVO.MediaItemVO.Image) && Intrinsics.d(oldItem, newItem)) {
            return true;
        }
        return (oldItem instanceof MediaCentricVO.MediaItemVO.Video) && (newItem instanceof MediaCentricVO.MediaItemVO.Video) && Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull MediaCentricVO.MediaItemVO oldItem, @NotNull MediaCentricVO.MediaItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getId() == newItem.getId() && (oldItem instanceof MediaCentricVO.MediaItemVO.Image) && (newItem instanceof MediaCentricVO.MediaItemVO.Image) && Intrinsics.d(((MediaCentricVO.MediaItemVO.Image) oldItem).getImage(), ((MediaCentricVO.MediaItemVO.Image) newItem).getImage())) {
            return true;
        }
        return (oldItem instanceof MediaCentricVO.MediaItemVO.Video) && (newItem instanceof MediaCentricVO.MediaItemVO.Video) && Intrinsics.d(((MediaCentricVO.MediaItemVO.Video) oldItem).getVideo(), ((MediaCentricVO.MediaItemVO.Video) newItem).getVideo());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r4.getIsSelected() != r3.getIsSelected()) goto L16;
     */
    @Override // androidx.recyclerview.widget.i.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getChangePayload(@NotNull MediaCentricVO.MediaItemVO oldItem, @NotNull MediaCentricVO.MediaItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!(oldItem instanceof MediaCentricVO.MediaItemVO.Image) || !(newItem instanceof MediaCentricVO.MediaItemVO.Image) || !Intrinsics.d(MediaCentricVO.MediaItemVO.Image.copy$default((MediaCentricVO.MediaItemVO.Image) oldItem, 0, null, null, ((MediaCentricVO.MediaItemVO.Image) newItem).getIsSelected(), null, 23, null), newItem)) {
            boolean z11 = oldItem instanceof MediaCentricVO.MediaItemVO.Video;
            if (z11 && (newItem instanceof MediaCentricVO.MediaItemVO.Video)) {
                MediaCentricVO.MediaItemVO.Video video = (MediaCentricVO.MediaItemVO.Video) oldItem;
                MediaCentricVO.MediaItemVO.Video video2 = (MediaCentricVO.MediaItemVO.Video) newItem;
                if (Intrinsics.d(MediaCentricVO.MediaItemVO.Video.copy$default(video, 0, null, null, video2.getIsSelected(), false, null, null, null, null, null, 1015, null), newItem)) {
                }
            }
            if (!z11 || !(newItem instanceof MediaCentricVO.MediaItemVO.Video)) {
                return null;
            }
            MediaCentricVO.MediaItemVO.Video video3 = (MediaCentricVO.MediaItemVO.Video) oldItem;
            MediaCentricVO.MediaItemVO.Video video4 = (MediaCentricVO.MediaItemVO.Video) newItem;
            if (video3.getIsPlaybackAvailable() == video4.getIsPlaybackAvailable() || !Intrinsics.d(MediaCentricVO.MediaItemVO.Video.copy$default(video3, 0, null, null, false, video4.getIsPlaybackAvailable(), null, null, null, null, null, 1007, null), newItem)) {
                return null;
            }
            return MediaCentricItemPayload.PLAYBACK_AVAILABLE_PAYLOAD;
        }
        return MediaCentricItemPayload.POSITION_PAYLOAD;
    }
}
