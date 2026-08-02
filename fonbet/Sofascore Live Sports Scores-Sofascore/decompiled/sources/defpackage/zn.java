package defpackage;

import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zn implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ zn(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                nv.l0(context, dv.OTHER, bv.FEED_APP_UPDATE, null);
                break;
            default:
                nv.l0(context, dv.OTHER, bv.RATING_BREAKDOWN, null);
                break;
        }
    }
}
