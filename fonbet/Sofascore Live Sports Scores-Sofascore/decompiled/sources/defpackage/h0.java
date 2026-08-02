package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.settings.about.AboutActivity;
import com.sofascore.results.settings.developer.DeveloperOptionsFullScreenDialog;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class h0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                dd ddVar = (dd) obj2;
                AboutActivity aboutActivity = (AboutActivity) obj;
                int i3 = AboutActivity.O;
                String valueOf = String.valueOf(((TextInputEditText) ddVar.d).getText());
                String valueOf2 = String.valueOf(((TextInputEditText) ddVar.c).getText());
                int i4 = 0;
                if (!ph0.a0(new String[]{"4389242e76424ec7c3b8d8a9b62be00b", "7ed895f49e509c3f36430333bd9a5da6"}).contains(tgj.u(valueOf.getBytes()))) {
                    Calendar calendar = ke0.a;
                    ke0.g(aboutActivity, "Wrong password", 0);
                    break;
                } else {
                    new DeveloperOptionsFullScreenDialog().p(aboutActivity.k(), "developerOptions");
                    xw3.L(wca.x(aboutActivity.getLifecycle()), null, null, new l0(aboutActivity, valueOf2, null, i4), 3);
                    MenuItem menuItem = aboutActivity.J;
                    if (menuItem != null) {
                        menuItem.setVisible(aboutActivity.D().getDevMod());
                    }
                    aboutActivity.N();
                    Calendar calendar2 = ke0.a;
                    ke0.g(aboutActivity, "DEV mode enabled", 0);
                    break;
                }
            case 1:
                o02.Z((MainActivity) obj2);
                ((AlertDialog) obj).dismiss();
                break;
            case 2:
                Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", "com.sofascore.results");
                ((BaseActivity) obj2).startActivity(intent);
                ((AlertDialog) obj).dismiss();
                break;
            case 3:
                zic.Z((Context) obj2, (Team) obj);
                break;
            case 4:
                zic.a0((Context) obj2, (UniqueStage) obj);
                break;
            case 5:
                zic.I((Context) obj2, (Player) obj);
                break;
            case 6:
                ((ate) obj2).invoke();
                ((AlertDialog) obj).dismiss();
                break;
            case 7:
                ((zbe) obj2).invoke();
                ((AlertDialog) obj).dismiss();
                break;
            case 8:
                ((Function0) obj2).invoke();
                ((AlertDialog) obj).dismiss();
                break;
            case 9:
                bea.G((Context) obj2, ((APIBuzzerTile) obj).getActionValue());
                break;
            case 10:
                Object selectedItem = ((Spinner) ((ez0) ((rd4) obj).e).d).getSelectedItem();
                selectedItem.getClass();
                ((dr6) obj2).invoke((Season) selectedItem);
                break;
            default:
                Context context = (Context) obj;
                ((AlertDialog) obj2).dismiss();
                int i5 = LoginScreenActivity.M;
                context.startActivity(new Intent(context, (Class<?>) LoginScreenActivity.class));
                break;
        }
    }
}
