package ru.ozon.app.android.barcodecache.push;

import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BarcodePushHandler$jsonDeserializer$2 extends AbstractC7737t implements Function0<JsonParser> {
    final /* synthetic */ Application $application;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodePushHandler$jsonDeserializer$2(Application application) {
        super(0);
        this.$application = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JsonParser invoke() {
        Application application = this.$application;
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        return ((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getJsonDeserializer();
    }
}
