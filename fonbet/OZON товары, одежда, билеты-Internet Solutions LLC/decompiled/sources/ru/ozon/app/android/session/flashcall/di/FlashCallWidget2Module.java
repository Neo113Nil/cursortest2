package ru.ozon.app.android.session.flashcall.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.session.flashcall.core.RequestPhoneAccessViewMapper;
import ru.ozon.app.android.session.flashcall.core.RequestPhoneAccessWidgetConfig;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/flashcall/di/FlashCallWidget2Module;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "requestPhoneAccessWidgetConfig", "Lru/ozon/app/android/session/flashcall/core/RequestPhoneAccessWidgetConfig;", "requestPhoneAccessViewMapper", "Lru/ozon/app/android/session/flashcall/core/RequestPhoneAccessViewMapper;", "provideWidgets$session_prodGoogleAllVendorsRelease", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlashCallWidget2Module {
    @NotNull
    public final Set<Widget2> provideWidgets$session_prodGoogleAllVendorsRelease(@NotNull RequestPhoneAccessWidgetConfig requestPhoneAccessWidgetConfig, @NotNull RequestPhoneAccessViewMapper requestPhoneAccessViewMapper) {
        Intrinsics.checkNotNullParameter(requestPhoneAccessWidgetConfig, "requestPhoneAccessWidgetConfig");
        Intrinsics.checkNotNullParameter(requestPhoneAccessViewMapper, "requestPhoneAccessViewMapper");
        return e0.h(new Widget2("csma", "requestPhoneAccess", requestPhoneAccessWidgetConfig, new ViewMapper2[]{requestPhoneAccessViewMapper}));
    }
}
