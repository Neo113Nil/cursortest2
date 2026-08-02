package ru.ozon.app.android.composer.widgets.v2.di;

import Sc.InterfaceC3999a;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0006\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e*\n\u0010\u0010\"\u00020\u00032\u00020\u0003¨\u0006\u0011"}, d2 = {"Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "T", "Lk20/g;", "Ljava/lang/Class;", "key", "findComponentDependency", "(Lk20/g;Ljava/lang/Class;)Lhi/a;", "Landroid/content/Context;", "getContext", "(Lk20/g;)Landroid/content/Context;", "context", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "getJsonParser", "(Lk20/g;)Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonParser", "ComposerWidgetComponentStorage", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerWidgetComponentStorageKt {
    @InterfaceC3999a
    @NotNull
    public static final <T extends InterfaceC6958a> T findComponentDependency(@NotNull C7475g c7475g, @NotNull Class<T> key) {
        Intrinsics.checkNotNullParameter(c7475g, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) c7475g.getComponent(key);
    }

    @NotNull
    public static final Context getContext(@NotNull C7475g c7475g) {
        Intrinsics.checkNotNullParameter(c7475g, "<this>");
        return ((ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class)).getContext();
    }

    @NotNull
    public static final JsonParser getJsonParser(@NotNull C7475g c7475g) {
        Intrinsics.checkNotNullParameter(c7475g, "<this>");
        return ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getJsonDeserializer();
    }
}
