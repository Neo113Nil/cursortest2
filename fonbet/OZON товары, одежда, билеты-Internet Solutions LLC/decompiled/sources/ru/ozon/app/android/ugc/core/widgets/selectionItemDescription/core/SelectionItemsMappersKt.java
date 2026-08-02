package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core;

import Kk.c;
import Tc.b;
import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.DescriptionTextVO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle.DescriptionTitleVO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.noui.SelectionItemDescriptionVO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.socialHeader.SocialHeaderVO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a \u0010\u000b\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u001e\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0018"}, d2 = {"toSubDTOList", "", "", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO;", "stateId", "", "applySubListPosition", "item", "subListIndex", "", "subListSize", "getItemsDOList", "getDescriptionTitle", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/DescriptionTitleVO;", "descriptionTitle", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$SelectionItemDescriptionTitleDTO;", "getDescriptionText", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionText/DescriptionTextVO;", CommentV3DTO.EXPANDABLE_TEXT_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "getSocialHeader", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SocialHeaderVO;", "socialHeader", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$SocialHeaderDTO;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionItemsMappersKt {
    private static final Object applySubListPosition(Object obj, int i11, int i12) {
        return obj instanceof DescriptionTitleVO ? DescriptionTitleVO.copy$default((DescriptionTitleVO) obj, 0L, null, null, i11, i12, 7, null) : obj instanceof SocialHeaderVO ? SocialHeaderVO.copy$default((SocialHeaderVO) obj, 0L, null, null, false, i11, i12, 15, null) : obj instanceof DescriptionTextVO ? DescriptionTextVO.copy$default((DescriptionTextVO) obj, 0L, null, null, null, i11, i12, 15, null) : obj;
    }

    private static final DescriptionTextVO getDescriptionText(SelectionItemDescriptionDTO selectionItemDescriptionDTO, ExpandableTextDTO expandableTextDTO, String str) {
        long a11 = c.a(str, "_expandable_description");
        ExpandableTextDTO copy$default = ExpandableTextDTO.copy$default(expandableTextDTO, null, null, null, null, null, false, null, null, null, null, null, null, null, true, null, null, null, null, 253951, null);
        Map<String, TokenizedTrackingInfo> trackingInfo = expandableTextDTO.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(a11), null) : null;
        Map<String, TokenizedTrackingInfo> linkClickTrackingInfo = selectionItemDescriptionDTO.getLinkClickTrackingInfo();
        return new DescriptionTextVO(a11, copy$default, b11, linkClickTrackingInfo != null ? x.b(linkClickTrackingInfo, Long.valueOf(a11), null) : null, 0, 0, 48, null);
    }

    private static final DescriptionTitleVO getDescriptionTitle(SelectionItemDescriptionDTO.SelectionItemDescriptionTitleDTO selectionItemDescriptionTitleDTO) {
        return new DescriptionTitleVO(selectionItemDescriptionTitleDTO.hashCode(), selectionItemDescriptionTitleDTO.getText(), selectionItemDescriptionTitleDTO.getStatus(), 0, 0, 24, null);
    }

    private static final Object getItemsDOList(SelectionItemDescriptionDTO selectionItemDescriptionDTO, Object obj, String str) {
        if (obj instanceof SelectionItemDescriptionDTO.SelectionItemDescriptionTitleDTO) {
            return getDescriptionTitle((SelectionItemDescriptionDTO.SelectionItemDescriptionTitleDTO) obj);
        }
        if (obj instanceof SelectionItemDescriptionDTO.SocialHeaderDTO) {
            return getSocialHeader((SelectionItemDescriptionDTO.SocialHeaderDTO) obj, str);
        }
        if (obj instanceof ExpandableTextDTO) {
            return getDescriptionText(selectionItemDescriptionDTO, (ExpandableTextDTO) obj, str);
        }
        if ((obj instanceof PlainTextDTO) || (obj instanceof SeparatorDTO)) {
            return obj;
        }
        return null;
    }

    private static final SocialHeaderVO getSocialHeader(SelectionItemDescriptionDTO.SocialHeaderDTO socialHeaderDTO, String str) {
        return new SocialHeaderVO(c.a(str, "_socialHeader"), socialHeaderDTO.getSubscribe(), socialHeaderDTO.getSubscribed(), socialHeaderDTO.isSubscribed(), 0, 0, 48, null);
    }

    @NotNull
    public static final List<Object> toSubDTOList(@NotNull SelectionItemDescriptionDTO selectionItemDescriptionDTO, String str) {
        Intrinsics.checkNotNullParameter(selectionItemDescriptionDTO, "<this>");
        b builder = C7714v.B();
        List<Object> items = selectionItemDescriptionDTO.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            Object itemsDOList = getItemsDOList(selectionItemDescriptionDTO, it.next(), str);
            if (itemsDOList != null) {
                arrayList.add(itemsDOList);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                long hashCode = builder.hashCode();
                Map<String, TokenizedTrackingInfo> trackingInfo = selectionItemDescriptionDTO.getTrackingInfo();
                builder.add(new SelectionItemDescriptionVO(hashCode, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(builder.hashCode()), null, 2, null) : null, selectionItemDescriptionDTO.getScrollPosition()));
                Intrinsics.checkNotNullParameter(builder, "builder");
                return builder.B();
            }
            Object next = it2.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            builder.add(applySubListPosition(next, i11, arrayList.size()));
            i11 = i12;
        }
    }
}
