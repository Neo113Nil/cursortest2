package g6;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectionResult f9875a;

    public w(ConnectionResult connectionResult) {
        v.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.f4441b == 0 || connectionResult.f4442c == null) ? false : true);
        this.f9875a = connectionResult;
    }
}
