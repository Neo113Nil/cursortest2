package defpackage;

import android.app.AlertDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.Country;
import com.sofascore.results.R;
import com.sofascore.results.settings.about.AboutActivity;
import com.sofascore.results.view.SofaTextInputLayout;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AboutActivity b;

    public /* synthetic */ g0(AboutActivity aboutActivity, int i) {
        this.a = i;
        this.b = aboutActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.a;
        AboutActivity aboutActivity = this.b;
        switch (i) {
            case 0:
                int i2 = AboutActivity.O;
                aboutActivity.M("mailto:support@sofascore.com");
                break;
            case 1:
                int i3 = AboutActivity.O;
                Country country = zu3.h;
                int i4 = aboutActivity.K;
                if (country.hasMcc(Integer.valueOf(i4))) {
                    str = "https://x.com/SofascoreBR";
                } else {
                    str = CollectionsKt.w0(zu3.U.getMccList(), CollectionsKt.w0(zu3.O.getMccList(), CollectionsKt.w0(zu3.M.getMccList(), CollectionsKt.w0(zu3.H.getMccList(), CollectionsKt.w0(zu3.K.getMccList(), CollectionsKt.w0(zu3.o0.getMccList(), CollectionsKt.w0(zu3.f0.getMccList(), CollectionsKt.w0(zu3.t0.getMccList(), CollectionsKt.w0(zu3.i0.getMccList(), CollectionsKt.w0(zu3.u.getMccList(), CollectionsKt.w0(zu3.P.getMccList(), CollectionsKt.w0(zu3.q0.getMccList(), zu3.a.getMccList())))))))))))).contains(Integer.valueOf(i4)) ? "https://x.com/SofascoreARB" : "https://x.com/Sofascore";
                }
                aboutActivity.M(str);
                break;
            case 2:
                int i5 = aboutActivity.M + 1;
                aboutActivity.M = i5;
                if (i5 == 5) {
                    int i6 = 0;
                    View inflate = aboutActivity.getLayoutInflater().inflate(R.layout.dialog_dev_mod, (ViewGroup) null, false);
                    int i7 = R.id.input_name;
                    if (((SofaTextInputLayout) nq8.B(R.id.input_name, inflate)) != null) {
                        i7 = R.id.name;
                        TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.name, inflate);
                        if (textInputEditText != null) {
                            i7 = R.id.password;
                            TextInputEditText textInputEditText2 = (TextInputEditText) nq8.B(R.id.password, inflate);
                            if (textInputEditText2 != null) {
                                i7 = R.id.password_input;
                                if (((SofaTextInputLayout) nq8.B(R.id.password_input, inflate)) != null) {
                                    LinearLayout linearLayout = (LinearLayout) inflate;
                                    dd ddVar = new dd(linearLayout, textInputEditText, textInputEditText2, 10);
                                    AlertDialog create = new AlertDialog.Builder(aboutActivity, R.style.RedesignDialog).create();
                                    create.setView(linearLayout);
                                    create.setTitle("Dev mod");
                                    create.setCanceledOnTouchOutside(false);
                                    create.setButton(-1, Payload.RESPONSE_OK, new h0(i6, ddVar, aboutActivity));
                                    create.setButton(-2, create.getContext().getString(R.string.cancel), new i0(create, i6));
                                    create.setOnDismissListener(new j0(aboutActivity, i6));
                                    create.show();
                                    break;
                                }
                            }
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                    break;
                }
                break;
            case 3:
                int i8 = AboutActivity.O;
                vjk[] vjkVarArr = vjk.a;
                aboutActivity.M("https://www.sofascore.com/privacy-policy");
                break;
            case 4:
                int i9 = AboutActivity.O;
                vjk[] vjkVarArr2 = vjk.a;
                aboutActivity.M("https://www.sofascore.com/en-us/cookies-policy");
                break;
            case 5:
                int i10 = AboutActivity.O;
                vjk[] vjkVarArr3 = vjk.a;
                aboutActivity.M("https://www.sofascore.com/en-us/accessibility");
                break;
            case 6:
                int i11 = AboutActivity.O;
                vjk[] vjkVarArr4 = vjk.a;
                aboutActivity.M("https://www.sofascore.com/terms-and-conditions");
                break;
            case 7:
                int i12 = AboutActivity.O;
                vjk[] vjkVarArr5 = vjk.a;
                aboutActivity.M("https://www.sofascore.com/gdpr-and-journalism");
                break;
            case 8:
                int i13 = AboutActivity.O;
                vjk[] vjkVarArr6 = vjk.a;
                aboutActivity.M("https://www.sofascore.com/impressum");
                break;
            case 9:
                int i14 = AboutActivity.O;
                aboutActivity.M("https://facebook.com/SofaScore");
                break;
            case 10:
                int i15 = AboutActivity.O;
                aboutActivity.M("https://www.instagram.com/sofascore_football/");
                break;
            default:
                int i16 = AboutActivity.O;
                aboutActivity.M("https://www.tiktok.com/@sofascore_football");
                break;
        }
    }
}
