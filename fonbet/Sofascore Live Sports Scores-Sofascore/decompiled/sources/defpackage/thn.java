package defpackage;

import com.google.android.gms.internal.ads.zzahv;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzgy;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class thn extends qgi {
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean o;

    public static boolean k(zzeu zzeuVar, byte[] bArr) {
        if (zzeuVar.B() < 8) {
            return false;
        }
        int i = zzeuVar.b;
        byte[] bArr2 = new byte[8];
        zzeuVar.F(0, 8, bArr2);
        zzeuVar.D(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.qgi
    public final void g(boolean z) {
        super.g(z);
        if (z) {
            this.o = false;
        }
    }

    @Override // defpackage.qgi
    public final long h(zzeu zzeuVar) {
        byte[] bArr = zzeuVar.a;
        return (this.f * zzgy.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.qgi
    public final boolean i(zzeu zzeuVar, long j, c0l c0lVar) {
        if (k(zzeuVar, p)) {
            byte[] copyOf = Arrays.copyOf(zzeuVar.a, zzeuVar.c);
            int i = copyOf[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            ArrayList a = zzgy.a(copyOf);
            if (((zzv) c0lVar.b) == null) {
                zzt zztVar = new zzt();
                zztVar.c("audio/ogg");
                zztVar.d(MimeTypes.AUDIO_OPUS);
                zztVar.G = i;
                zztVar.I = 48000;
                zztVar.q = a;
                c0lVar.b = new zzv(zztVar);
                return true;
            }
        } else {
            boolean k = k(zzeuVar, q);
            zzv zzvVar = (zzv) c0lVar.b;
            if (!k) {
                zzvVar.getClass();
                return false;
            }
            zzvVar.getClass();
            if (!this.o) {
                this.o = true;
                zzeuVar.E(8);
                zzap a2 = zzahv.a(zzgxm.y(zzhh.b(zzeuVar, false, false).a));
                if (a2 != null) {
                    zzv zzvVar2 = (zzv) c0lVar.b;
                    zzvVar2.getClass();
                    zzt zztVar2 = new zzt(zzvVar2);
                    zztVar2.k = a2.a(((zzv) c0lVar.b).l);
                    c0lVar.b = new zzv(zztVar2);
                    return true;
                }
            }
        }
        return true;
    }
}
