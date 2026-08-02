package ru.ozon.app.android.autopicker.view.productpickersearch.deeplink;

import C.J;
import De.C2860c;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.configurator.ProductPickerSearchParamsConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/deeplink/ProductPickerDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductPickerDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (d.d(route, "route", SelectionItemFormDTO.PRODUCT_PICKER_FIELD_NAME)) {
            if (route.b().getPathSegments().isEmpty()) {
                return true;
            }
            if (!C2860c.c(route, "getPathSegments(...)").isEmpty() && !Co.a.e(route, 0, "diskInstruction")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        h.c.a aVar = new h.c.a(a11, (String) null, (String) (null == true ? 1 : 0), 14);
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(R$drawable.ic_m_cross, false, null, null, null, null, 62, null), 0, 2, null == true ? 1 : 0);
        Set h11 = e0.h(ProductPickerSearchParamsConfigurator.class);
        BackgroundColorResource m682boximpl = BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1));
        m682boximpl.getValue();
        return new ComposerFlowDestination(new ComposerScreenConfig(aVar, toolbarConfig, false, null, true, false, false, false, null, false, false, false, h11, null, null, !AppTypeResolver.INSTANCE.isSelect(context) ? m682boximpl : null, false, null, null, null, false, false, null, null, 16740236, null), a11, 9489, null, false, 24, null);
    }
}
