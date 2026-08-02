package ru.ozon.app.android.commonwidgets.widgets.restrictions.di;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yr.C10936a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u001e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u0004j\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u0006`\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/di/RestrictionsComponentFactoryModule;", "", "<init>", "()V", "Lii/a;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "bindCartComponentFactory", "()Lii/a;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RestrictionsComponentFactoryModule {

    @NotNull
    public static final RestrictionsComponentFactoryModule INSTANCE = new RestrictionsComponentFactoryModule();

    private RestrictionsComponentFactoryModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RestrictionsComponentApi bindCartComponentFactory$lambda$0(C6740b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RestrictionsComponent create = DaggerRestrictionsComponent.create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }

    @NotNull
    public final InterfaceC7081a<? extends InterfaceC6958a> bindCartComponentFactory() {
        return new C10936a();
    }
}
