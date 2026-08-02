package ru.ozon.app.android.cscore.orderlist.configurators;

import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.K;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cscore/orderlist/configurators/OrderFiltersConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderFiltersConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        List list;
        InterfaceC7851b controller;
        if (resultCode == -1 && requestCode == 34255 && data != null) {
            String[] stringArrayExtra = data.getStringArrayExtra("ru.ozon.app.android.commonwidgets.widgets.sortsbottomsheetdialog.KEY_SORTS_DEEPLINK_ARRAY");
            String[] stringArrayExtra2 = data.getStringArrayExtra("ru.ozon.app.android.commonwidgets.widgets.sortsbottomsheetdialog.KEY_YEARS_DEEPLINK_ARRAY");
            int intExtra = data.getIntExtra("KEY_SELECTED_POSITION", -1);
            if (intExtra == -1 || stringArrayExtra == null) {
                return;
            }
            String str = (String) C7705l.K(intExtra, stringArrayExtra);
            if (stringArrayExtra2 == null || (list = C7705l.f0(stringArrayExtra2)) == null) {
                list = K.f71697a;
            }
            String generateOrderFilterUrl = OrderFiltersConfiguratorKt.generateOrderFilterUrl(str, list);
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            InterfaceC7851b.a.a(controller, generateOrderFilterUrl, null, null, null, 14);
        }
    }
}
