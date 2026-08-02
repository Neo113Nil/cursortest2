package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import com.appsflyer.internal.i;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzelp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class t4o implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzelp b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ zzm d;

    public /* synthetic */ t4o(zzelp zzelpVar, Activity activity, zzm zzmVar, int i) {
        this.a = i;
        this.b = zzelpVar;
        this.c = activity;
        this.d = zzmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        zzm zzmVar = this.d;
        Activity activity = this.c;
        zzelp zzelpVar = this.b;
        switch (i2) {
            case 0:
                zzelpVar.K4(zzelpVar.g, "rtsdc", i.l("dialog_action", "confirm"));
                activity.startActivity(zzt.zzf().zzg(activity));
                zzelpVar.I4();
                if (zzmVar != null) {
                    zzmVar.zza();
                    break;
                }
                break;
            default:
                zzelpVar.K4(zzelpVar.g, "dialog_click", i.l("dialog_action", "confirm"));
                zzelpVar.H4(activity, zzmVar);
                break;
        }
    }
}
