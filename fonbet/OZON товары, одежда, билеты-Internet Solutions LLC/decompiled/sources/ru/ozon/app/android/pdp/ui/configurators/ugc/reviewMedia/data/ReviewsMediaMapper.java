package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaViewType;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "mediaDTO", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;", "mediaType", "", "size", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "toMediaVO", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$MediaType;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "", ImagesContract.URL, "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State;", "createState", "(Ljava/lang/String;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO$State;", "", "photos", "videos", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaViewType;", "getMediaViewType", "(Ljava/util/List;Ljava/util/List;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaViewType;", "toVideoVO", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "toPhotoVO", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "Landroid/content/Context;", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewsMediaMapper {

    @NotNull
    private final Context context;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/ReviewsMediaMapper$Companion;", "", "<init>", "()V", "DEF_TYPE", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReviewsMediaMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final MediaVO.State createState(String url) {
        return url != null ? new MediaVO.State.Ready(url) : MediaVO.State.Processing.INSTANCE;
    }

    private final MediaVO toMediaVO(MediaDTO mediaDTO, MediaVO.MediaType mediaType, Integer size) {
        int identifier;
        MediaVO.State createState = createState(mediaDTO.getUrl());
        String deeplink = mediaDTO.getDeeplink();
        String supportIcon = mediaDTO.getSupportIcon();
        MediaVO.SupportIcon supportIcon2 = null;
        if (supportIcon != null && (identifier = this.context.getResources().getIdentifier(supportIcon, "drawable", this.context.getPackageName())) != 0) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.context;
            String supportIconTintColor = mediaDTO.getSupportIconTintColor();
            if (supportIconTintColor == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            supportIcon2 = new MediaVO.SupportIcon(identifier, styleParser.parseColor(context, supportIconTintColor, UniColors.TEXT_PRIMARY.getResId()));
        }
        return new MediaVO(createState, deeplink, mediaType, supportIcon2, size);
    }

    static /* synthetic */ MediaVO toMediaVO$default(ReviewsMediaMapper reviewsMediaMapper, MediaDTO mediaDTO, MediaVO.MediaType mediaType, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        return reviewsMediaMapper.toMediaVO(mediaDTO, mediaType, num);
    }

    @NotNull
    public final MediaViewType getMediaViewType(List<MediaDTO> photos, List<MediaDTO> videos) {
        List<MediaDTO> list;
        List<MediaDTO> list2 = videos;
        return (list2 == null || list2.isEmpty()) ? MediaViewType.PHOTO_LIST : (videos.size() == 1 && ((list = photos) == null || list.isEmpty())) ? MediaViewType.SINGLE_VIDEO : MediaViewType.MEDIA_LIST;
    }

    @NotNull
    public final MediaVO toPhotoVO(@NotNull MediaDTO mediaDTO) {
        Intrinsics.checkNotNullParameter(mediaDTO, "mediaDTO");
        return toMediaVO$default(this, mediaDTO, MediaVO.MediaType.PHOTO.INSTANCE, null, 4, null);
    }

    @NotNull
    public final MediaVO toVideoVO(@NotNull MediaDTO mediaDTO, Integer size) {
        Intrinsics.checkNotNullParameter(mediaDTO, "mediaDTO");
        return toMediaVO(mediaDTO, new MediaVO.MediaType.VIDEO(mediaDTO.getVideoInfo()), size);
    }
}
