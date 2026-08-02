package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.sofascore.results.notifications.NotificationSettingsActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mn implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ mn(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Context context = this.b;
        switch (i2) {
            case 0:
                zic.t(context);
                break;
            case 1:
                zic.Y(context);
                break;
            case 2:
                int i3 = NotificationSettingsActivity.O;
                mx9.y(context);
                break;
            case 3:
                int i4 = NotificationSettingsActivity.O;
                mx9.y(context);
                break;
            case 4:
                int i5 = NotificationSettingsActivity.O;
                mx9.y(context);
                break;
            case 5:
                int i6 = NotificationSettingsActivity.O;
                mx9.y(context);
                break;
            case 6:
                int i7 = NotificationSettingsActivity.O;
                mx9.y(context);
                break;
            case 7:
                int i8 = NotificationSettingsActivity.O;
                mx9.y(context);
                break;
            case 8:
                int i9 = NotificationSettingsActivity.O;
                mx9.y(context);
                break;
            case 9:
                zic.J(context);
                break;
            default:
                int i10 = NotificationSettingsActivity.O;
                mx9.y(context);
                break;
        }
    }
}
