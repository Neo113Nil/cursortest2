package D9;

import android.os.Bundle;
import com.twilio.voice.EventKeys;

/* loaded from: classes2.dex */
public final class A extends y {
    public A(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // D9.y
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(EventKeys.DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // D9.y
    public final boolean b() {
        return false;
    }
}
