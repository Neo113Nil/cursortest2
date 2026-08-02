package ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.unsorted.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.benefitList.data.BenefitListDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation.BenefitListVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0005\u001a\u00020\b*\u00020\u00072\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\t\u001a\u0013\u0010\u0005\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/data/BenefitListDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO;", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/data/BenefitListDTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/data/BenefitListDTO$Badge;", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Badge;", "(Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/data/BenefitListDTO$Badge;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Badge;", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/data/BenefitListDTO$Spacers;", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Spacers;", "(Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/data/BenefitListDTO$Spacers;)Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Spacers;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BenefitListMapperKt {
    @NotNull
    public static final BenefitListVO toVO(@NotNull BenefitListDTO benefitListDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(benefitListDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long id2 = ExtentionsKt.getId(widgetInfo);
        List<BenefitListDTO.Badge> badges = benefitListDTO.getBadges();
        ArrayList arrayList = new ArrayList(C7714v.z(badges, 10));
        Iterator<T> it = badges.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((BenefitListDTO.Badge) it.next(), widgetInfo));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = benefitListDTO.getTrackingInfo();
        t d11 = trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null;
        BenefitListDTO.Spacers spacers = benefitListDTO.getSpacers();
        if (spacers == null) {
            spacers = new BenefitListDTO.Spacers(null, null, null, null, 15, null);
        }
        return new BenefitListVO(id2, arrayList, d11, toVO(spacers));
    }

    private static final BenefitListVO.Badge toVO(BenefitListDTO.Badge badge, d dVar) {
        TextDTO text = badge.getText();
        IconDTO icon = badge.getIcon();
        TextDTO separator = badge.getSeparator();
        AtomActionDTO action = badge.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = badge.getTrackingInfo();
        return new BenefitListVO.Badge(text, icon, separator, atomAction, trackingInfo != null ? x.d(trackingInfo, dVar) : null);
    }

    private static final BenefitListVO.Spacers toVO(BenefitListDTO.Spacers spacers) {
        return new BenefitListVO.Spacers(spacers.getTop().m1867getDpD9Ej5fM(), spacers.getBottom().m1867getDpD9Ej5fM(), spacers.getLeft().m1867getDpD9Ej5fM(), spacers.getRight().m1867getDpD9Ej5fM(), null);
    }
}
