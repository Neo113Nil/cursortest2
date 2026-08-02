package ru.ozon.app.android.composer.di;

import hi.InterfaceC6958a;
import java.util.Set;
import kotlin.Metadata;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/di/WidgetRegistrationComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "getWidgets", "()Ljava/util/Set;", "Ln20/i;", "getSdkWidgets", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WidgetRegistrationComponentApi extends InterfaceC6958a {
    @NotNull
    Set<i> getSdkWidgets();

    @NotNull
    Set<Widget2> getWidgets();
}
