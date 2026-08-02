package ru.ozon.app.android.storefront.widgets.profileIconButton.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.ProfileIconButtonComposeWidgetKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/di/ProfileIconButtonWidgetModule;", "", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "provideIconButtonWidget$storefront_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "provideIconButtonWidget", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileIconButtonWidgetModule {
    @NotNull
    public final i provideIconButtonWidget$storefront_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return ProfileIconButtonComposeWidgetKt.profileIconButtonComposeWidget(jsonDeserializer);
    }
}
