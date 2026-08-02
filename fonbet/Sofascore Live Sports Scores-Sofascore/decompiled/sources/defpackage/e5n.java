package defpackage;

import android.os.Build;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzacr;
import com.google.android.gms.internal.ads.zzgul;
import com.google.android.gms.internal.ads.zzv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class e5n implements zzgul {
    public final /* synthetic */ zzabc a;
    public final /* synthetic */ zzaaq b;

    public /* synthetic */ e5n(zzabc zzabcVar, zzaaq zzaaqVar) {
        this.a = zzabcVar;
        this.b = zzaaqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r0.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 32) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r0 = r3.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r0.b != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        if (r0.equals("audio/ac4") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0043, code lost:
    
        if (r0.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AC3) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r0.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3_JOC) != false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.ads.zzgul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(Object obj) {
        int i;
        zzacr zzacrVar;
        zzv zzvVar = (zzv) obj;
        if (!this.b.A) {
            return true;
        }
        zzabc zzabcVar = this.a;
        Boolean bool = zzabcVar.i;
        if ((bool != null && bool.booleanValue()) || (i = zzvVar.H) == -1 || i <= 2) {
            return true;
        }
        String str = zzvVar.o;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    break;
                case 187078296:
                    break;
                case 187078297:
                    break;
                case 1504578661:
                    break;
            }
        }
        return Build.VERSION.SDK_INT >= 32 && (zzacrVar = zzabcVar.g) != null && zzacrVar.b && zzacrVar.a() && zzabcVar.g.b() && zzabcVar.g.c(zzabcVar.h, zzvVar);
    }
}
