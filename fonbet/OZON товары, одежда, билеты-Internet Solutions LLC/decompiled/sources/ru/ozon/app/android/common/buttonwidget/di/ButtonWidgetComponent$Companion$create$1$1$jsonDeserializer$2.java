package ru.ozon.app.android.common.buttonwidget.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ButtonWidgetComponent$Companion$create$1$1$jsonDeserializer$2 extends AbstractC7737t implements Function0<JsonParser> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonWidgetComponent$Companion$create$1$1$jsonDeserializer$2(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JsonParser invoke() {
        return ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getJsonDeserializer();
    }
}
