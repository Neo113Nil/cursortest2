package defpackage;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzpl;
import com.google.android.gms.internal.measurement.zzpm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ito implements ListenerHolder.Notifier {
    public final /* synthetic */ byte[] a;

    public ito(sto stoVar, byte[] bArr) {
        this.a = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void a(Object obj) {
        zzpm zzpmVar = (zzpm) obj;
        try {
            byte[] bArr = this.a;
            zzadf zzadfVar = zzadf.b;
            int i = j8n.a;
            zzpmVar.a(zzpl.z(bArr, zzadf.c));
        } catch (zzaeh unused) {
            zzpmVar.getClass();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void b() {
    }
}
