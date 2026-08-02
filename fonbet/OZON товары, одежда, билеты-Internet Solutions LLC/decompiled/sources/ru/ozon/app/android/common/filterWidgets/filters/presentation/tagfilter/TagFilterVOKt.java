package ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter;

import WZ.t;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.filterWidgets.filters.data.TagFilterModel;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/TagFilterModel;", "stateId", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagFilterVOKt {
    @NotNull
    public static final TagFilterVO toVo(@NotNull TagFilterModel tagFilterModel, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(tagFilterModel, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        String title = tagFilterModel.getTagFilter().getTitle();
        Icon icon = tagFilterModel.getTagFilter().getIcon();
        AtomActionDTO action = tagFilterModel.getTagFilter().getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = tagFilterModel.getTagFilter().getTrackingInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = tagFilterModel.getTagFilter().getTrackingInfo();
        t tokenizedEvent$default = trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(stateId.hashCode()), null, 2, null) : null;
        ButtonV3Atom.LargeBorderlessButton rightButton = tagFilterModel.getTagFilter().getRightButton();
        List<AtomDTO> tags = tagFilterModel.getTagFilter().getTags();
        ArrayList arrayList = new ArrayList(C7714v.z(tags, 10));
        for (Parcelable parcelable : tags) {
            if (parcelable instanceof TagButtonDTO) {
                parcelable = r13.copy((r34 & 1) != 0 ? r13.styleType : null, (r34 & 2) != 0 ? r13.size : null, (r34 & 4) != 0 ? r13.isSelected : null, (r34 & 8) != 0 ? r13.isDisabled : null, (r34 & 16) != 0 ? r13.isClosable : null, (r34 & 32) != 0 ? r13.icon : null, (r34 & 64) != 0 ? r13.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r13.indicator : null, (r34 & 256) != 0 ? r13.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r13.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r13.common : null, (r34 & 2048) != 0 ? r13.closeControlSettings : null, (r34 & 4096) != 0 ? r13.context : null, (r34 & 8192) != 0 ? r13.isStateChangeDisabled : Boolean.TRUE, (r34 & 16384) != 0 ? r13.image : null, (r34 & 32768) != 0 ? ((TagButtonDTO) parcelable).round : null);
            }
            arrayList.add(parcelable);
        }
        String originalUrl = tagFilterModel.getOriginalUrl();
        boolean hideSeparator = tagFilterModel.getHideSeparator();
        IconDTO rightIcon = tagFilterModel.getTagFilter().getRightIcon();
        Boolean scrollEnabled = tagFilterModel.getTagFilter().getScrollEnabled();
        return new TagFilterVO(hashCode, title, icon, action, trackingInfo, tokenizedEvent$default, rightButton, arrayList, originalUrl, hideSeparator, rightIcon, scrollEnabled != null ? scrollEnabled.booleanValue() : false, tagFilterModel.getTagFilter().getMaxRowsCount(), tagFilterModel.getTagFilter().getTotalValuesCount());
    }
}
