package ru.ozon.android.messenger.framework.presentation.chatdetail;

import androidx.fragment.app.ComponentCallbacksC5392m;
import g.InterfaceC6590b;
import zi.C11125b;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements InterfaceC6590b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacksC5392m f89724b;

    public /* synthetic */ c(ComponentCallbacksC5392m componentCallbacksC5392m, int i11) {
        this.f89723a = i11;
        this.f89724b = componentCallbacksC5392m;
    }

    @Override // g.InterfaceC6590b
    public final void onActivityResult(Object obj) {
        switch (this.f89723a) {
            case 0:
                d.v((d) this.f89724b, ((Boolean) obj).booleanValue());
                break;
            default:
                C11125b.t((C11125b) this.f89724b);
                break;
        }
    }
}
