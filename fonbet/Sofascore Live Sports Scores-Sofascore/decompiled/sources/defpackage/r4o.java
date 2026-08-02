package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzelp;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r4o implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzelp b;
    public final /* synthetic */ zzm c;

    public /* synthetic */ r4o(zzelp zzelpVar, zzm zzmVar, int i) {
        this.a = i;
        this.b = zzelpVar;
        this.c = zzmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        zzm zzmVar = this.c;
        zzelp zzelpVar = this.b;
        switch (i2) {
            case 0:
                zzelpVar.f.f(zzelpVar.g);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                zzelpVar.K4(zzelpVar.g, "dialog_click", hashMap);
                if (zzmVar != null) {
                    zzmVar.zza();
                    break;
                }
                break;
            default:
                zzelpVar.f.f(zzelpVar.g);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                zzelpVar.K4(zzelpVar.g, "rtsdc", hashMap2);
                if (zzmVar != null) {
                    zzmVar.zza();
                    break;
                }
                break;
        }
    }
}
