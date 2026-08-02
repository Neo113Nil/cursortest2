package defpackage;

import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzgul;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gfn implements zzgul {
    public static final /* synthetic */ gfn b = new gfn(0);
    public static final /* synthetic */ gfn c = new gfn(1);
    public static final /* synthetic */ gfn d = new gfn(2);
    public final /* synthetic */ int a;

    public /* synthetic */ gfn(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgul
    public final /* synthetic */ boolean zza(Object obj) {
        switch (this.a) {
            case 0:
                zzakb zzakbVar = (zzakb) obj;
                if (zzakbVar.b.equals("com.apple.iTunes") && zzakbVar.c.equals("iTunSMPB")) {
                    break;
                }
                break;
            case 1:
                if (((Map.Entry) obj).getKey() != null) {
                    break;
                }
                break;
            default:
                if (((String) obj) != null) {
                    break;
                }
                break;
        }
        return true;
    }
}
