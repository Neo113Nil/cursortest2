package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFk1vSDK {
    public String getCurrencyIso4217Code;
    public final WeakReference<Context> getMonetizationNetwork;

    public AFk1vSDK(@NonNull Context context) {
        this.getMonetizationNetwork = new WeakReference<>(context);
    }
}
