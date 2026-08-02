package co.paystack.android.api.request;

import android.provider.Settings;
import i3.AbstractC4521b;

/* loaded from: classes.dex */
public abstract class a {

    @Gb.c("device")
    String device;

    public void a() {
        this.device = "androidsdk_" + Settings.Secure.getString(AbstractC4521b.f48057a.getContentResolver(), "android_id");
    }
}
