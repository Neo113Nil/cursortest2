package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4165c;

    public /* synthetic */ f(int i5, Object obj, Object obj2) {
        this.f4163a = i5;
        this.f4164b = obj;
        this.f4165c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4163a) {
            case 0:
                AFb1iSDK.getMonetizationNetwork((AFb1iSDK) this.f4164b, (AFh1qSDK) this.f4165c);
                break;
            case 1:
                ((AFa1ySDK) this.f4164b).getCurrencyIso4217Code((AFh1mSDK) this.f4165c);
                break;
            case 2:
                ((AFj1nSDK) this.f4164b).G_((SensorEvent) this.f4165c);
                break;
            case 3:
                AFj1rSDK.getRevenue((AFj1rSDK) this.f4164b, (Context) this.f4165c);
                break;
            case 4:
                ((AFj1wSDK) this.f4164b).getRevenue((Context) this.f4165c);
                break;
            default:
                AFj1ySDK.getMonetizationNetwork((AFj1ySDK) this.f4164b, (Context) this.f4165c);
                break;
        }
    }
}
