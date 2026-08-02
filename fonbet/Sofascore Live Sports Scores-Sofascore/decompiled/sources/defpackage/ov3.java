package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lov3;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ov3 extends q8 {
    public final SharedPreferences e;
    public final aeh f;
    public final hof g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov3(Application application, SharedPreferences sharedPreferences) {
        super(application);
        sharedPreferences.getClass();
        this.e = sharedPreferences;
        aeh b = beh.b(0, 0, null, 7);
        this.f = b;
        this.g = un0.t(b);
    }
}
