package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w2n {
    public final int a;
    public final ConnectionResult b;

    public w2n(ConnectionResult connectionResult, int i) {
        Preconditions.i(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }
}
