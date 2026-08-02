package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer;

import Ih.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.FooterVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/footer/FooterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;", "", "stateId", "toVo", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;Ljava/lang/String;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;", "type", "createStubFooter", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;Ll20/d;)Ljava/util/List;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FooterMapper implements Function2<UniversalWidgetDTO, d, List<? extends FooterVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/footer/FooterMapper$Companion;", "", "<init>", "()V", "UW_FOOTER", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final FooterVO createStubFooter(String stateId, String type) {
        return new FooterVO(type, a.a("uw_footer_", stateId), "", null, Boolean.FALSE, stateId, null);
    }

    static /* synthetic */ FooterVO createStubFooter$default(FooterMapper footerMapper, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "stub";
        }
        return footerMapper.createStubFooter(str, str2);
    }

    private final FooterVO toVo(UniversalWidgetDTO.FooterDTO footerDTO, String str) {
        long a11 = a.a("uw_footer_", str);
        String type = footerDTO.getType();
        String title = footerDTO.getTitle();
        String deeplink = footerDTO.getDeeplink();
        UWDeeplink uWDeeplink = deeplink != null ? OpenNestedPageExtKt.toUWDeeplink(deeplink) : null;
        Boolean disclosure = footerDTO.getDisclosure();
        Map<String, TokenizedTrackingInfo> trackingInfo = footerDTO.getTrackingInfo();
        return new FooterVO(type, a11, title, uWDeeplink, disclosure, str, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FooterVO> invoke(@NotNull UniversalWidgetDTO dto, @NotNull d widgetInfo) {
        String title;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        UniversalWidgetDTO.FooterDTO footer = dto.getFooter();
        return (footer == null || (title = footer.getTitle()) == null || h.K(title)) ? C7714v.a0(createStubFooter$default(this, widgetInfo.d(), null, 2, null)) : C7714v.a0(toVo(footer, widgetInfo.d()));
    }
}
