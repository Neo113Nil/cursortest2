package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewRender;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemAccessoriesBinding;
import ru.ozon.fintech.wallet.manager.domain.mpay.a;
import t6.C9770e;
import v6.ServiceConnectionC10259c;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f57503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f57504d;

    public /* synthetic */ b(Context context, ServiceConnectionC10259c.InterfaceC2223c interfaceC2223c, a.b bVar) {
        this.f57501a = 2;
        this.f57503c = context;
        this.f57502b = interfaceC2223c;
        this.f57504d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57501a) {
            case 0:
                ((AFb1tSDK) this.f57502b).AFKeystoreWrapper((Context) this.f57503c, (Intent) this.f57504d);
                break;
            case 1:
                AccessoriesViewRender.renderState$lambda$10$lambda$9((WidgetCartSplitV2ItemAccessoriesBinding) this.f57502b, (AccessoriesViewRender) this.f57503c, (AccessoriesAsyncState.Success) this.f57504d);
                break;
            default:
                C9770e.a((Context) this.f57503c, (ServiceConnectionC10259c.InterfaceC2223c) this.f57502b, (a.b) this.f57504d);
                break;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i11) {
        this.f57501a = i11;
        this.f57502b = obj;
        this.f57503c = obj2;
        this.f57504d = obj3;
    }
}
