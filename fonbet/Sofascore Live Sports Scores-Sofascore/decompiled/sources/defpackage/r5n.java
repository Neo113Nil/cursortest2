package defpackage;

import com.google.android.gms.internal.measurement.zzaat;
import com.google.android.gms.internal.measurement.zzabe;
import com.google.android.gms.internal.measurement.zzzj;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r5n extends zzaat {
    public static final r5n b = new r5n(b6n.a);
    public final AtomicReference a;

    public r5n(zzaat zzaatVar) {
        this.a = new AtomicReference(zzaatVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final void a(String str, Level level, boolean z) {
        ((zzaat) this.a.get()).a(str, level, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final zzabe b() {
        return ((zzaat) this.a.get()).b();
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final zzzj c() {
        return ((zzaat) this.a.get()).c();
    }
}
