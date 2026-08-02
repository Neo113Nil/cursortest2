package ru.ozon.app.android.storefront.widgets.cms.title;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/title/TitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/cms/title/TitleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/cms/title/TitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/cms/title/TitleDTO;Ll20/d;)Ljava/util/List;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TitleMapper implements Function2<TitleDTO, d, List<? extends TitleVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TitleVO> invoke(@NotNull TitleDTO state, @NotNull d widgetInfo) {
        List<TitleVO> a02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String title = state.getTitle();
        if (title != null) {
            if (h.K(title)) {
                title = null;
            }
            if (title != null && (a02 = C7714v.a0(new TitleVO("TitleVO_".concat(title).hashCode(), title))) != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
