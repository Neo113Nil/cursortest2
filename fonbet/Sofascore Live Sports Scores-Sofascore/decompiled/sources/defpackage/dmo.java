package defpackage;

import com.google.android.gms.internal.ads.zzgvb;
import com.google.android.gms.internal.ads.zzhcf;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dmo extends x8a {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ emo g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmo(emo emoVar, Callable callable) {
        super(1);
        this.g = emoVar;
        callable.getClass();
        this.h = callable;
    }

    @Override // defpackage.x8a
    public final Object k() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                zzhcf zzhcfVar = (zzhcf) obj;
                ddb mo10zza = zzhcfVar.mo10zza();
                if (mo10zza != null) {
                    return mo10zza;
                }
                yhk.s(zzgvb.a("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhcfVar));
                return null;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.x8a
    public final String m() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                return ((zzhcf) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    @Override // defpackage.x8a
    public final boolean n() {
        int i = this.f;
        emo emoVar = this.g;
        switch (i) {
        }
        return emoVar.isDone();
    }

    @Override // defpackage.x8a
    public final void o(Object obj) {
        int i = this.f;
        emo emoVar = this.g;
        switch (i) {
            case 0:
                emoVar.m((ddb) obj);
                break;
            default:
                emoVar.d(obj);
                break;
        }
    }

    @Override // defpackage.x8a
    public final void p(Throwable th) {
        int i = this.f;
        emo emoVar = this.g;
        switch (i) {
            case 0:
                emoVar.e(th);
                break;
            default:
                emoVar.e(th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmo(emo emoVar, zzhcf zzhcfVar) {
        super(1);
        this.g = emoVar;
        this.h = zzhcfVar;
    }
}
