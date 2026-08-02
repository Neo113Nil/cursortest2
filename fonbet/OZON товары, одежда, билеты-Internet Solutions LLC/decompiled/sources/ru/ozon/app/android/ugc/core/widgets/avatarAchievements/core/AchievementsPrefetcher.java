package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$1;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$2;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/core/AchievementsPrefetcher;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefetchAchievements", "", "vo", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;", "isDarkTheme", "", "prefetch", ImagesContract.URL, "", "size", "Lru/ozon/app/android/pikazon/image/ImageSize;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AchievementsPrefetcher {

    @NotNull
    private final Context context;

    public AchievementsPrefetcher(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void prefetch(String url, ImageSize size) {
        ContextExtKt.loadAsBitmapInscribedSize(this.context, url, (r14 & 2) != 0 ? K.f71697a : null, (r14 & 4) != 0 ? null : size, (r14 & 8) != 0 ? LoadPriority.NORMAL : null, (r14 & 16) != 0 ? InscribedUrlProcessor.InscribedNormal.INSTANCE : null, (r14 & 32) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$1.INSTANCE : null, (r14 & 64) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$2.INSTANCE : null);
    }

    public final void prefetchAchievements(@NotNull AvatarAchievementsVO vo, boolean isDarkTheme) {
        AvatarAchievementsVO.AchievementVO achievementVO;
        ImageDTO defaultImage;
        Integer imageWidth;
        Intrinsics.checkNotNullParameter(vo, "vo");
        List<AvatarAchievementsVO.AchievementVO> achievements = vo.getAchievements();
        if (achievements == null || (achievementVO = (AvatarAchievementsVO.AchievementVO) C7714v.M(achievements)) == null || (defaultImage = achievementVO.getDefaultImage()) == null || (imageWidth = defaultImage.getImageWidth()) == null) {
            return;
        }
        int px = ResourceExtKt.toPx(imageWidth.intValue());
        ImageSize imageSize = new ImageSize(px, px);
        for (AvatarAchievementsVO.AchievementVO achievementVO2 : vo.getAchievements()) {
            String image = (!isDarkTheme || achievementVO2.getDarkThemeImage() == null) ? achievementVO2.getDefaultImage().getImage() : achievementVO2.getDarkThemeImage().getImage();
            if (image == null) {
                return;
            } else {
                prefetch(image, imageSize);
            }
        }
    }
}
