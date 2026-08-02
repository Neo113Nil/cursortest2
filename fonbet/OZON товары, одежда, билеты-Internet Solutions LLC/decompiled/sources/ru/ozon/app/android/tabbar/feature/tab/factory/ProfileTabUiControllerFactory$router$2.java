package ru.ozon.app.android.tabbar.feature.tab.factory;

import GZ.g;
import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LGZ/g;", "invoke", "()LGZ/g;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ProfileTabUiControllerFactory$router$2 extends AbstractC7737t implements Function0<g> {
    final /* synthetic */ ProfileTabUiControllerFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileTabUiControllerFactory$router$2(ProfileTabUiControllerFactory profileTabUiControllerFactory) {
        super(0);
        this.this$0 = profileTabUiControllerFactory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final g invoke() {
        Application application;
        application = this.this$0.application;
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        return ((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).getOzonRouter();
    }
}
