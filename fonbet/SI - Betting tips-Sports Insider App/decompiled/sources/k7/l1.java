package k7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l1 implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f18893a;

    /* renamed from: f, reason: collision with root package name */
    public final String f18894f;

    public l1(IBinder iBinder, String str) {
        this.f18893a = iBinder;
        this.f18894f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18893a;
    }
}
