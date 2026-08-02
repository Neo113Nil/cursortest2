package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky;

import A00.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.SelectTabEvent;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2UpdateConsumer;", "Lkotlin/Function2;", "LA00/a$J$a;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "<init>", "()V", "oldVO", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/SelectTabEvent;", "update", "processSelectTabEvent", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/SelectTabEvent;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsV2UpdateConsumer implements Function2<a.J.InterfaceC0007a, CatalogTabsV2VO, CatalogTabsV2VO> {
    private final CatalogTabsV2VO processSelectTabEvent(CatalogTabsV2VO oldVO, SelectTabEvent update) {
        TagButtonDTO copy;
        CatalogTabsV2VO.Tab copy$default;
        TagButtonDTO copy2;
        List<CatalogTabsV2VO.Tab> tabs = oldVO.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        int i11 = 0;
        int i12 = 0;
        for (Object obj : tabs) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CatalogTabsV2VO.Tab tab = (CatalogTabsV2VO.Tab) obj;
            if (tab.getWidgetScrollKey() == update.getScrollKey()) {
                copy2 = r14.copy((r34 & 1) != 0 ? r14.styleType : null, (r34 & 2) != 0 ? r14.size : null, (r34 & 4) != 0 ? r14.isSelected : Boolean.TRUE, (r34 & 8) != 0 ? r14.isDisabled : null, (r34 & 16) != 0 ? r14.isClosable : null, (r34 & 32) != 0 ? r14.icon : null, (r34 & 64) != 0 ? r14.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r14.indicator : null, (r34 & 256) != 0 ? r14.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r14.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r14.common : null, (r34 & 2048) != 0 ? r14.closeControlSettings : null, (r34 & 4096) != 0 ? r14.context : null, (r34 & 8192) != 0 ? r14.isStateChangeDisabled : null, (r34 & 16384) != 0 ? r14.image : tab.getTagButton().getImage(), (r34 & 32768) != 0 ? tab.getTagButton().round : null);
                copy$default = CatalogTabsV2VO.Tab.copy$default(tab, 0, false, 0, copy2, null, 23, null);
                i12 = i11;
            } else {
                copy = r14.copy((r34 & 1) != 0 ? r14.styleType : null, (r34 & 2) != 0 ? r14.size : null, (r34 & 4) != 0 ? r14.isSelected : Boolean.FALSE, (r34 & 8) != 0 ? r14.isDisabled : null, (r34 & 16) != 0 ? r14.isClosable : null, (r34 & 32) != 0 ? r14.icon : null, (r34 & 64) != 0 ? r14.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r14.indicator : null, (r34 & 256) != 0 ? r14.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r14.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r14.common : null, (r34 & 2048) != 0 ? r14.closeControlSettings : null, (r34 & 4096) != 0 ? r14.context : null, (r34 & 8192) != 0 ? r14.isStateChangeDisabled : null, (r34 & 16384) != 0 ? r14.image : tab.getTagButton().getImage(), (r34 & 32768) != 0 ? tab.getTagButton().round : null);
                copy$default = CatalogTabsV2VO.Tab.copy$default(tab, 0, false, 0, copy, null, 23, null);
            }
            arrayList.add(copy$default);
            i11 = i13;
        }
        return CatalogTabsV2VO.copy$default(oldVO, 0L, false, arrayList, null, null, 0, null, null, null, i12, 507, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public CatalogTabsV2VO invoke(@NotNull a.J.InterfaceC0007a update, @NotNull CatalogTabsV2VO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        return update instanceof SelectTabEvent ? processSelectTabEvent(oldVO, (SelectTabEvent) update) : oldVO;
    }
}
