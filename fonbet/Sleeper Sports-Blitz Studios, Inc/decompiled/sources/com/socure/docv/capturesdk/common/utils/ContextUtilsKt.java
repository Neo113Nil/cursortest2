package com.socure.docv.capturesdk.common.utils;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextUtils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"getParcelableCompat", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/Intent;", SDKConstants.PARAM_KEY, "", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Object;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContextUtilsKt {
    public static final /* synthetic */ <T> T getParcelableCompat(Intent intent, String key) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            parcelableExtra = intent.getParcelableExtra(key, Object.class);
            return (T) parcelableExtra;
        }
        Parcelable parcelableExtra2 = intent.getParcelableExtra(key);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) parcelableExtra2;
    }

    public static final /* synthetic */ <T> T getParcelableCompat(Bundle bundle, String key) {
        Object parcelable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            parcelable = bundle.getParcelable(key, Object.class);
            return (T) parcelable;
        }
        Parcelable parcelable2 = bundle.getParcelable(key);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) parcelable2;
    }
}
