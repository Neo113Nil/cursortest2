package ru.ozon.app.android.storefront.widgets.cms.captionwidget;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "headerWidgetDTO", "map", "(Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetDTO;)Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/cms/captionwidget/CaptionWidgetDTO;Ll20/d;)Ljava/util/List;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CaptionWidgetMapper implements Function2<CaptionWidgetDTO, d, List<? extends CaptionWidgetVO>> {
    private final CaptionWidgetVO map(CaptionWidgetDTO headerWidgetDTO) {
        long hashCode = headerWidgetDTO.getTitle() != null ? r1.hashCode() : -1L;
        String title = headerWidgetDTO.getTitle();
        if (title == null) {
            title = "";
        }
        String subtitle = headerWidgetDTO.getSubtitle();
        return new CaptionWidgetVO(hashCode, title, subtitle != null ? subtitle : "");
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CaptionWidgetVO> invoke(@NotNull CaptionWidgetDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String title = state.getTitle();
        return (title == null || h.K(title)) ? K.f71697a : C7714v.a0(map(state));
    }
}
