package yr;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.di.RestrictionsComponentApi;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.di.RestrictionsComponentFactoryModule;

/* renamed from: yr.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C10936a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        RestrictionsComponentApi bindCartComponentFactory$lambda$0;
        bindCartComponentFactory$lambda$0 = RestrictionsComponentFactoryModule.bindCartComponentFactory$lambda$0(c6740b);
        return bindCartComponentFactory$lambda$0;
    }
}
