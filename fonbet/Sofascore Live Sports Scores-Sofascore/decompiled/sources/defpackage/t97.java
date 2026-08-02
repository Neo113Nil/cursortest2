package defpackage;

import android.app.Application;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt97;", "Lq8;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t97 extends q8 {
    public final fdi e;
    public final jof f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t97(@NotNull Application application) {
        super(application);
        application.getClass();
        fdi a = gdi.a(new s97(null));
        this.e = a;
        this.f = un0.u(a);
    }

    public final void k(h97 h97Var) {
        fdi fdiVar;
        Object value;
        do {
            fdiVar = this.e;
            value = fdiVar.getValue();
            ((s97) value).getClass();
        } while (!fdiVar.k(value, new s97(h97Var)));
    }
}
