package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.base.BaseActivity;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class jn implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Dialog e;

    public /* synthetic */ jn(Serializable serializable, Object obj, Object obj2, Dialog dialog, int i) {
        this.a = i;
        this.b = serializable;
        this.c = obj;
        this.d = obj2;
        this.e = dialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cv cvVar;
        switch (this.a) {
            case 0:
                asf asfVar = (asf) this.b;
                ed edVar = (ed) this.c;
                BaseActivity baseActivity = (BaseActivity) this.d;
                s01 s01Var = (s01) this.e;
                asfVar.a = true;
                vl vlVar = (vl) vl.g.get(((RadioGroup) edVar.c).indexOfChild((RadioButton) ((RadioGroup) edVar.c).findViewById(((RadioGroup) edVar.c).getCheckedRadioButtonId())));
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = baseActivity.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                SharedPreferences.Editor i2 = dmi.i(sharedPreferences, "SHOULD_ASK_AGE_VERIFICATION", false);
                Unit unit = Unit.a;
                i2.apply();
                bv bvVar = bv.NETHERLANDS_LEGAL_AGE;
                av avVar = av.CTA_CLICK;
                dv dvVar = dv.POPUP_QUEUE;
                cv.b.getClass();
                vlVar.getClass();
                int ordinal = vlVar.ordinal();
                if (ordinal == 0) {
                    cvVar = cv.AGE_25_OR_OLDER;
                } else if (ordinal == 1) {
                    cvVar = cv.AGE_18_TO_24;
                } else {
                    if (ordinal != 2) {
                        zzl.b();
                        return;
                    }
                    cvVar = cv.AGE_UNDER_18;
                }
                nv.k0(baseActivity, bvVar, avVar, dvVar, cvVar, null, 32);
                vl vlVar2 = vlVar == vl.d ? vl.e : vlVar;
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = baseActivity.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences2 = a5f.d(applicationContext2);
                        uic.j = sharedPreferences2;
                    }
                    sharedPreferences2.getClass();
                }
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.getClass();
                edit.putString("PREF_MANAGE_ODDS_ADDS_V2", vlVar2.a);
                edit.apply();
                if (vlVar == vl.c) {
                    SharedPreferences sharedPreferences3 = uic.j;
                    if (sharedPreferences3 == null) {
                        Context applicationContext3 = baseActivity.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences3 = a5f.d(applicationContext3);
                            uic.j = sharedPreferences3;
                        }
                        sharedPreferences3.getClass();
                    }
                    if (!sharedPreferences3.getBoolean("PREF_PROVIDER_ODDS_ENABLE", true)) {
                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                        edit2.getClass();
                        edit2.putString("PREF_PROVIDER_ODDS", null);
                        edit2.apply();
                    }
                }
                s01Var.dismiss();
                return;
            default:
                Highlight highlight = (Highlight) this.b;
                Activity activity = (Activity) this.c;
                Function0 function0 = (Function0) this.d;
                AlertDialog alertDialog = (AlertDialog) this.e;
                rfo.H(highlight, activity, function0, null);
                alertDialog.dismiss();
                return;
        }
    }
}
