package ru.ozon.app.android.travel.feature.hotels.shared.review.data;

import G.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.hotels.shared.review.data.ReviewDTO;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.ReviewVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO;", "backgroundTint", "", "containerHeight", "", "widgetId", "", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO$ReviewBlockVO;", "Lru/ozon/app/android/travel/feature/hotels/shared/review/data/ReviewDTO$ReviewBlockDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapperExtKt {
    @NotNull
    public static final ReviewVO toVO(@NotNull ReviewDTO reviewDTO, @NotNull String backgroundTint, int i11, long j11) {
        Intrinsics.checkNotNullParameter(reviewDTO, "<this>");
        Intrinsics.checkNotNullParameter(backgroundTint, "backgroundTint");
        String id2 = reviewDTO.getId();
        Avatar avatar = reviewDTO.getAvatar();
        TextAtom fullName = reviewDTO.getFullName();
        TextAtom date = reviewDTO.getDate();
        List<ReviewDTO.ReviewBlockDTO> reviewBlocks = reviewDTO.getReviewBlocks();
        ArrayList arrayList = new ArrayList(C7714v.z(reviewBlocks, 10));
        Iterator<T> it = reviewBlocks.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((ReviewDTO.ReviewBlockDTO) it.next()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = reviewDTO.getTrackingInfo();
        return new ReviewVO(id2, avatar, fullName, date, arrayList, backgroundTint, i11, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private static final ReviewVO.ReviewBlockVO toVO(ReviewDTO.ReviewBlockDTO reviewBlockDTO) {
        String c11;
        int length;
        int i11;
        boolean z11;
        AtomActionDTO action;
        if (reviewBlockDTO.getExpandButton() == null) {
            c11 = reviewBlockDTO.getText();
            z11 = false;
            i11 = -1;
            length = -1;
        } else {
            c11 = g.c(reviewBlockDTO.getText(), " ", reviewBlockDTO.getExpandButton().getText());
            int length2 = c11.length() - reviewBlockDTO.getExpandButton().getText().length();
            length = c11.length();
            i11 = length2;
            z11 = true;
        }
        String str = c11;
        int hashCode = (((Object) reviewBlockDTO.getTitle().getText()) + " " + str).hashCode();
        TextAtom title = reviewBlockDTO.getTitle();
        ReviewDTO.ExpandButtonDTO expandButton = reviewBlockDTO.getExpandButton();
        AtomAction atomAction = null;
        if (expandButton != null && (action = expandButton.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, null);
        }
        return new ReviewVO.ReviewBlockVO(hashCode, title, str, z11, i11, length, atomAction);
    }
}
