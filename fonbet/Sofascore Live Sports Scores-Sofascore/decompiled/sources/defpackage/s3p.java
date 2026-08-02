package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class s3p {
    public final int a;
    public final TaskCompletionSource b = new TaskCompletionSource();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public s3p(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(toString().length() + 16 + String.valueOf(bundle).length());
        }
        this.b.setResult(bundle);
    }

    public final void c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(toString().length() + 14 + zztVar.toString().length());
        }
        this.b.setException(zztVar);
    }

    public final String toString() {
        int i = this.c;
        int length = String.valueOf(i).length();
        int i2 = this.a;
        int length2 = String.valueOf(i2).length();
        boolean a = a();
        StringBuilder sb = new StringBuilder(wt3.h(length, 19, length2, 8, String.valueOf(a).length()) + 1);
        me4.r(sb, "Request { what=", i, " id=", i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
