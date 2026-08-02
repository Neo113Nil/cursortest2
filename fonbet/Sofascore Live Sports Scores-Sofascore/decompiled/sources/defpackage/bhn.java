package defpackage;

import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.cast.internal.zzat;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bhn implements zzat {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzat b;
    public final /* synthetic */ zzar c;

    public bhn(zzar zzarVar, zzat zzatVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = zzatVar;
                Objects.requireNonNull(zzarVar);
                this.c = zzarVar;
                break;
            default:
                this.b = zzatVar;
                Objects.requireNonNull(zzarVar);
                this.c = zzarVar;
                break;
        }
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void a(String str, long j, long j2, long j3) {
        switch (this.a) {
            case 0:
                zzat zzatVar = this.b;
                if (zzatVar != null) {
                    zzatVar.a(str, j, j2, j3);
                    break;
                }
                break;
            default:
                zzat zzatVar2 = this.b;
                if (zzatVar2 != null) {
                    zzatVar2.a(str, j, j2, j3);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void b(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        String str2;
        long j4;
        long j5;
        long j6;
        Object obj2;
        int i3 = this.a;
        zzar zzarVar = this.c;
        switch (i3) {
            case 0:
                zzarVar.g = null;
                zzat zzatVar = this.b;
                if (zzatVar != null) {
                    zzatVar.b(str, j, i, obj, j2, j3);
                    break;
                }
                break;
            default:
                zzat zzatVar2 = this.b;
                if (zzatVar2 != null) {
                    if (i == 2001) {
                        zzarVar.a.c("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(zzarVar.i));
                        zzarVar.h.zzm();
                        i2 = 2001;
                        str2 = str;
                        j4 = j;
                        obj2 = obj;
                        j5 = j2;
                        j6 = j3;
                    } else {
                        i2 = i;
                        str2 = str;
                        j4 = j;
                        j5 = j2;
                        j6 = j3;
                        obj2 = obj;
                    }
                    zzatVar2.b(str2, j4, i2, obj2, j5, j6);
                    break;
                }
                break;
        }
    }
}
