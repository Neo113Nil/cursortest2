package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.sofascore.results.settings.SettingsActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ix4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ix4(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                bea.G(context, "http://stopspillet.dk/");
                break;
            case 1:
                bea.G(context, "http://rofus.nu/");
                break;
            default:
                int i2 = SettingsActivity.L;
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) SettingsActivity.class);
                intent.putExtra("open", "openAdsOddsPreferences");
                context.startActivity(intent);
                break;
        }
    }
}
