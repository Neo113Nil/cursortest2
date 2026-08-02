package t8;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import g6.C4357q;
import g6.InterfaceC4354n;

/* renamed from: t8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6450d implements InterfaceC4354n {

    /* renamed from: a, reason: collision with root package name */
    public Promise f65775a;

    public AbstractC6450d(Promise promise) {
        this.f65775a = promise;
    }

    @Override // g6.InterfaceC4354n
    public void a(C4357q c4357q) {
        Promise promise = this.f65775a;
        if (promise != null) {
            promise.reject(c4357q);
            this.f65775a = null;
        }
    }

    @Override // g6.InterfaceC4354n
    public void onCancel() {
        if (this.f65775a != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("isCancelled", true);
            this.f65775a.resolve(createMap);
            this.f65775a = null;
        }
    }
}
