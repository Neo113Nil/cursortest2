package defpackage;

import android.app.Application;
import com.sofascore.results.tutorial.AbstractTutorialActivity;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u2k extends q8 {
    public uyf e;
    public Long f;
    public Long g;
    public AbstractTutorialActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2k(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    @Override // defpackage.ltk
    public final void e() {
        uyf uyfVar = this.e;
        if (uyfVar != null) {
            uyfVar.cancel();
        }
    }

    public final void k(long j, Long l, AbstractTutorialActivity abstractTutorialActivity) {
        long longValue = l != null ? j - l.longValue() : j;
        this.g = Long.valueOf(j);
        this.h = abstractTutorialActivity;
        uyf uyfVar = this.e;
        if (uyfVar != null) {
            uyfVar.cancel();
        }
        uyf uyfVar2 = new uyf(longValue, this);
        this.e = uyfVar2;
        uyfVar2.start();
    }
}
