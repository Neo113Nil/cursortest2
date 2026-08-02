package pl;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.di.ActionComponentFactoryModule;

/* renamed from: pl.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C8940a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        ActionComponentApi provideActionComponent$lambda$0;
        provideActionComponent$lambda$0 = ActionComponentFactoryModule.provideActionComponent$lambda$0(c6740b);
        return provideActionComponent$lambda$0;
    }
}
