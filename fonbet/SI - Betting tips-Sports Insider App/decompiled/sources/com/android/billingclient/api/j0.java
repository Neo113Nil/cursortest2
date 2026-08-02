package com.android.billingclient.api;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4036b;

    public /* synthetic */ j0(int i5, Object obj) {
        this.f4035a = i5;
        this.f4036b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4035a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ((r) this.f4036b).onProductDetailsResponse((k) obj, arrayList);
                break;
            case 1:
                ((e) this.f4036b).e((k) obj, null);
                break;
            default:
                ((e) this.f4036b).a((k) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i5 = this.f4035a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
