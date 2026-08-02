package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation;

import WZ.t;
import WZ.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.data.CatalogTabsV2DTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J%\u0010\u000b\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u000b\u0010\u0017J%\u0010\u000b\u001a\u00020\u0016*\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u000b\u0010\u0019J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;J)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$TabPaddings;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$TabPaddings;", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$TabPaddings;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$TabPaddings;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$StickyRoundedCorners;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$StickyRoundedCorners;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "tagCornerRadius", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;JLru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$Tab;", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$Tab;JLru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "state", "info", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsV2Mapper implements Function2<CatalogTabsV2DTO, d, List<? extends CatalogTabsV2VO>> {
    private final CatalogTabsV2VO toVO(CatalogTabsV2DTO catalogTabsV2DTO, long j11) {
        CatalogTabsV2VO.StickyRoundedCorners stickyRoundedCorners;
        boolean z11 = catalogTabsV2DTO.getMoreTab() == null;
        List<CatalogTabsV2DTO.Tab> tabs = catalogTabsV2DTO.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((CatalogTabsV2DTO.Tab) it.next(), j11, catalogTabsV2DTO.getBadgeCornerRadius()));
        }
        String backgroundColor = catalogTabsV2DTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        CatalogTabsV2DTO.TabPaddings paddings = catalogTabsV2DTO.getPaddings();
        t tVar = null;
        if (paddings == null) {
            paddings = new CatalogTabsV2DTO.TabPaddings(null, null, null, null);
        }
        CatalogTabsV2VO.TabPaddings vo = toVO(paddings);
        Integer maxRows = catalogTabsV2DTO.getMaxRows();
        int intValue = maxRows != null ? maxRows.intValue() : Integer.MAX_VALUE;
        TagButtonDTO moreTab = catalogTabsV2DTO.getMoreTab();
        CatalogTabsV2VO.Tab vo2 = moreTab != null ? toVO(moreTab, j11, catalogTabsV2DTO.getBadgeCornerRadius()) : null;
        CatalogTabsV2DTO.StickyRoundedCorners stickyRoundedCorners2 = catalogTabsV2DTO.getStickyRoundedCorners();
        if (stickyRoundedCorners2 == null || (stickyRoundedCorners = toVO(stickyRoundedCorners2)) == null) {
            stickyRoundedCorners = new CatalogTabsV2VO.StickyRoundedCorners(CornerRadius.NO_RADIUS.getPx(), CornerRadius.RADIUS_600.getPx());
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = catalogTabsV2DTO.getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        }
        return new CatalogTabsV2VO(j11, z11, arrayList, str, vo, intValue, vo2, stickyRoundedCorners, tVar, 0);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CatalogTabsV2VO> invoke(@NotNull CatalogTabsV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(info)));
    }

    private final CatalogTabsV2VO.TabPaddings toVO(CatalogTabsV2DTO.TabPaddings tabPaddings) {
        Paddings top = tabPaddings.getTop();
        if (top == null) {
            top = Paddings.NONE;
        }
        int px = top.getPx();
        Paddings horizontal = tabPaddings.getHorizontal();
        if (horizontal == null) {
            horizontal = Paddings.PADDING_300;
        }
        int px2 = horizontal.getPx();
        Paddings between = tabPaddings.getBetween();
        if (between == null) {
            between = Paddings.PADDING_250;
        }
        int px3 = between.getPx();
        Paddings bottom = tabPaddings.getBottom();
        if (bottom == null) {
            bottom = Paddings.PADDING_300;
        }
        return new CatalogTabsV2VO.TabPaddings(px, px2, px3, bottom.getPx());
    }

    private final CatalogTabsV2VO.StickyRoundedCorners toVO(CatalogTabsV2DTO.StickyRoundedCorners stickyRoundedCorners) {
        CornerRadius top = stickyRoundedCorners.getTop();
        if (top == null) {
            top = CornerRadius.NO_RADIUS;
        }
        int px = top.getPx();
        CornerRadius bottom = stickyRoundedCorners.getBottom();
        if (bottom == null) {
            bottom = CornerRadius.RADIUS_600;
        }
        return new CatalogTabsV2VO.StickyRoundedCorners(px, bottom.getPx());
    }

    private final CatalogTabsV2VO.Tab toVO(TagButtonDTO tagButtonDTO, long j11, CornerRadius cornerRadius) {
        TagButtonDTO copy;
        int hashCode = Long.hashCode(j11);
        int px = (cornerRadius == null ? CornerRadius.RADIUS_500 : cornerRadius).getPx();
        copy = tagButtonDTO.copy((r34 & 1) != 0 ? tagButtonDTO.styleType : null, (r34 & 2) != 0 ? tagButtonDTO.size : null, (r34 & 4) != 0 ? tagButtonDTO.isSelected : null, (r34 & 8) != 0 ? tagButtonDTO.isDisabled : null, (r34 & 16) != 0 ? tagButtonDTO.isClosable : null, (r34 & 32) != 0 ? tagButtonDTO.icon : null, (r34 & 64) != 0 ? tagButtonDTO.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButtonDTO.indicator : null, (r34 & 256) != 0 ? tagButtonDTO.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButtonDTO.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButtonDTO.common : null, (r34 & 2048) != 0 ? tagButtonDTO.closeControlSettings : null, (r34 & 4096) != 0 ? tagButtonDTO.context : null, (r34 & 8192) != 0 ? tagButtonDTO.isStateChangeDisabled : Boolean.TRUE, (r34 & 16384) != 0 ? tagButtonDTO.image : tagButtonDTO.getImage(), (r34 & 32768) != 0 ? tagButtonDTO.round : null);
        Map<String, TokenizedTrackingInfo> trackingInfo = tagButtonDTO.getTrackingInfo();
        t tVar = null;
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        }
        return new CatalogTabsV2VO.Tab(hashCode, true, px, copy, tVar);
    }

    private final CatalogTabsV2VO.Tab toVO(CatalogTabsV2DTO.Tab tab, long j11, CornerRadius cornerRadius) {
        TagButtonDTO copy;
        int hashCode = Long.hashCode(j11);
        int px = (cornerRadius == null ? CornerRadius.RADIUS_500 : cornerRadius).getPx();
        copy = r6.copy((r34 & 1) != 0 ? r6.styleType : null, (r34 & 2) != 0 ? r6.size : null, (r34 & 4) != 0 ? r6.isSelected : null, (r34 & 8) != 0 ? r6.isDisabled : null, (r34 & 16) != 0 ? r6.isClosable : null, (r34 & 32) != 0 ? r6.icon : null, (r34 & 64) != 0 ? r6.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r6.indicator : null, (r34 & 256) != 0 ? r6.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r6.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r6.common : null, (r34 & 2048) != 0 ? r6.closeControlSettings : null, (r34 & 4096) != 0 ? r6.context : null, (r34 & 8192) != 0 ? r6.isStateChangeDisabled : Boolean.TRUE, (r34 & 16384) != 0 ? r6.image : tab.getTagButton().getImage(), (r34 & 32768) != 0 ? tab.getTagButton().round : null);
        String widgetScrollKey = tab.getWidgetScrollKey();
        if (widgetScrollKey != null) {
            hashCode = widgetScrollKey.hashCode();
        }
        int i11 = hashCode;
        Map<String, TokenizedTrackingInfo> trackingInfo = tab.getTagButton().getTrackingInfo();
        t tVar = null;
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        }
        return new CatalogTabsV2VO.Tab(i11, false, px, copy, tVar);
    }
}
