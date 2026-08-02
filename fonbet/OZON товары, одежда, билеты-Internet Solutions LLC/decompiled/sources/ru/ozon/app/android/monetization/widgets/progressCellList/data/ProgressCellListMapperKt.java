package ru.ozon.app.android.monetization.widgets.progressCellList.data;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.monetization.widgets.progressCellList.data.ProgressCellListDTO;
import ru.ozon.app.android.monetization.widgets.progressCellList.presentation.ProgressCellListVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\t\u001a\u0013\u0010\u0005\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO;", "toVO", "(Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO;Ll20/d;)Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO;", "Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressCellDTO;", "Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressCellVO;", "(Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressCellDTO;)Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressCellVO;", "Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressBarDTO;", "Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressBarVO;", "(Lru/ozon/app/android/monetization/widgets/progressCellList/data/ProgressCellListDTO$ProgressBarDTO;)Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressBarVO;", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProgressCellListMapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @NotNull
    public static final ProgressCellListVO toVO(@NotNull ProgressCellListDTO progressCellListDTO, @NotNull d info) {
        ?? r52;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(progressCellListDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        long hashCode2 = info.d().hashCode();
        List<ProgressCellListDTO.ProgressCellDTO> progressCellList = progressCellListDTO.getProgressCellList();
        t tVar = null;
        if (progressCellList != null) {
            List<ProgressCellListDTO.ProgressCellDTO> list = progressCellList;
            r52 = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r52.add(toVO((ProgressCellListDTO.ProgressCellDTO) it.next()));
            }
        } else {
            r52 = 0;
        }
        if (r52 == 0) {
            r52 = K.f71697a;
        }
        CommonControlSettings settings = progressCellListDTO.getSettings();
        if (settings != null && (trackingInfo = settings.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        }
        return new ProgressCellListVO(hashCode2, r52, tVar);
    }

    private static final ProgressCellListVO.ProgressCellVO toVO(ProgressCellListDTO.ProgressCellDTO progressCellDTO) {
        String backgroundColor = progressCellDTO.getBackgroundColor();
        TextDTO title = progressCellDTO.getTitle();
        IconDTO icon = progressCellDTO.getIcon();
        List<BadgeDTO> badges = progressCellDTO.getBadges();
        ProgressCellListDTO.ProgressBarDTO progressBar = progressCellDTO.getProgressBar();
        return new ProgressCellListVO.ProgressCellVO(backgroundColor, title, icon, badges, progressBar != null ? toVO(progressBar) : null);
    }

    private static final ProgressCellListVO.ProgressBarVO toVO(ProgressCellListDTO.ProgressBarDTO progressBarDTO) {
        return new ProgressCellListVO.ProgressBarVO(progressBarDTO.getProgress() / 100.0f, progressBarDTO.getProgressGradient(), progressBarDTO.getProgressBackgroundColor());
    }
}
