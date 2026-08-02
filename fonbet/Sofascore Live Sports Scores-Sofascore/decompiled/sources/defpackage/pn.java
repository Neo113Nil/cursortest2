package defpackage;

import android.content.DialogInterface;
import com.sofascore.results.profile.LoginScreenActivity;
import com.vungle.ads.internal.presenter.w;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class pn implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((e6g) obj).invoke();
                break;
            case 1:
                ((w8f) obj).invoke();
                break;
            case 2:
                ((w8f) obj).invoke();
                break;
            case 3:
                ((zbe) obj).invoke();
                break;
            case 4:
                ((vni) obj).invoke();
                break;
            case 5:
                LoginScreenActivity loginScreenActivity = (LoginScreenActivity) obj;
                int i3 = LoginScreenActivity.M;
                dialogInterface.dismiss();
                rgh rghVar = loginScreenActivity.L;
                fjb fjbVar = new fjb(loginScreenActivity, 1);
                rghVar.getClass();
                rghVar.f(fjbVar);
                break;
            case 6:
                ((qig) obj).b = null;
                dialogInterface.dismiss();
                break;
            default:
                w.a((w) obj, dialogInterface, i);
                break;
        }
    }
}
