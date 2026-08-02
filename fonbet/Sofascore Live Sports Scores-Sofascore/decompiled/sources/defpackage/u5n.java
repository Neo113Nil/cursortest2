package defpackage;

import com.google.android.gms.internal.measurement.zzaag;
import com.google.android.gms.internal.measurement.zzaal;
import com.google.android.gms.internal.measurement.zzaas;
import com.google.android.gms.internal.measurement.zzxz;
import com.google.android.gms.internal.measurement.zzyw;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u5n extends zzaag {
    public final Level b;
    public final Set c;
    public final pfp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5n(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = zzaas.f;
        this.b = level;
        this.c = zzaas.f;
        this.d = zzaas.g;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean b(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void c(zzxz zzxzVar) {
        String str = (String) zzxzVar.j().d(zzyw.c);
        if (str == null) {
            str = this.a;
        }
        if (str == null) {
            str = zzxzVar.g().a();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        zzaal.a(str);
        zzaas.e(zzxzVar, this.b, this.c, this.d);
    }
}
