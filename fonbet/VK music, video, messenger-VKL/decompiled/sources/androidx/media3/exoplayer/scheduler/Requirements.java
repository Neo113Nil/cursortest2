package androidx.media3.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import xsna.fp;

/* loaded from: classes.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();
    public final int b;

    public class a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    }

    public Requirements(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r5.hasCapability(16) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Context context) {
        Intent a2;
        int intExtra;
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        int i = this.b;
        int i2 = 0;
        if ((i & 1) != 0) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && (activeNetwork = connectivityManager.getActiveNetwork()) != null) {
                try {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities != null) {
                    }
                } catch (SecurityException unused) {
                }
            }
            i2 = i & 3;
        }
        if ((i & 8) != 0 && ((a2 = fp.a("android.intent.action.BATTERY_CHANGED", context, null)) == null || ((intExtra = a2.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
            i2 |= 8;
        }
        if ((i & 4) != 0) {
            Object systemService2 = context.getSystemService("power");
            systemService2.getClass();
            if (!((PowerManager) systemService2).isDeviceIdleMode()) {
                i2 |= 4;
            }
        }
        return ((i & 16) == 0 || fp.a("android.intent.action.DEVICE_STORAGE_LOW", context, null) == null) ? i2 : i2 | 16;
        if ((i & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
            i2 = 2;
        }
        if ((i & 8) != 0) {
            i2 |= 8;
        }
        if ((i & 4) != 0) {
        }
        if ((i & 16) == 0) {
            return i2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Requirements.class == obj.getClass()) {
            if (this.b == ((Requirements) obj).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
