package ru.ozon.app.android.delivery.customActionsHandlers.removeSplit;

import android.content.Intent;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/removeSplit/RemoveSplitConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "dispatcher", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "trackClick", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveSplitConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final CoroutineDispatcherProvider dispatcher;

    @NotNull
    private final JsonParser jsonDeserializer;

    public RemoveSplitConfigurator(@NotNull CoroutineDispatcherProvider dispatcher, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.dispatcher = dispatcher;
        this.jsonDeserializer = jsonDeserializer;
    }

    private final void trackClick(Intent data) {
        C10727i.c(K.a(getOwner()), this.dispatcher.getIO(), null, new RemoveSplitConfigurator$trackClick$1(data, this, null), 2);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        String stringExtra;
        ConfiguratorReferences references;
        ComposerNavigator navigator;
        if (requestCode == 9020 && resultCode == -1) {
            trackClick(data);
            if (data == null || (stringExtra = data.getStringExtra("EXTRA_REMOVE_DEEPLINK")) == null || (references = getReferences()) == null || (navigator = references.getNavigator()) == null) {
                return;
            }
            navigator.popBackStack();
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, stringExtra, null, 2, null);
        }
    }
}
