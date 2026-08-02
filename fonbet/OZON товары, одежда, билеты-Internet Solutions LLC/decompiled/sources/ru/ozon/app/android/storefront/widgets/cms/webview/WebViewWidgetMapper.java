package ru.ozon.app.android.storefront.widgets.cms.webview;

import B0.A0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "code", "wrapWithTags", "(Ljava/lang/String;)Ljava/lang/String;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetDTO;Ll20/d;)Ljava/util/List;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewWidgetMapper implements Function2<WebViewWidgetDTO, d, List<? extends WebViewWidgetVO>> {
    private final String wrapWithTags(String code) {
        return (h.e0(code, "<!DOCTYPE", true) || h.e0(code, "<html>", true)) ? code : A0.b("<!DOCTYPE html><html><head>", h.X(code, "</style>", "</style></head><body>", false), "</body></html>");
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<WebViewWidgetVO> invoke(@NotNull WebViewWidgetDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Float valueOf = (dto.getWidth() == null || dto.getHeight() == null) ? null : Float.valueOf(dto.getHeight().intValue() / dto.getWidth().intValue());
        String code = dto.getCode();
        Integer width = dto.getWidth();
        Integer height = dto.getHeight();
        return C7714v.a0(new WebViewWidgetVO((code + "." + width + "." + height).hashCode(), valueOf, wrapWithTags(dto.getCode())));
    }
}
