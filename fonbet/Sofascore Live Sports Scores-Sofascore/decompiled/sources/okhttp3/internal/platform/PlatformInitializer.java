package okhttp3.internal.platform;

import android.content.Context;
import defpackage.dq3;
import defpackage.gie;
import defpackage.k3a;
import defpackage.km5;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lk3a;", "Lgie;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlatformInitializer implements k3a {
    @Override // defpackage.k3a
    public final Object create(Context context) {
        context.getClass();
        gie gieVar = gie.a;
        Object obj = gie.a;
        dq3 dq3Var = obj != null ? (dq3) obj : null;
        if (dq3Var != null) {
            dq3Var.b(context);
        }
        return gie.a;
    }

    @Override // defpackage.k3a
    public final List dependencies() {
        return km5.a;
    }
}
