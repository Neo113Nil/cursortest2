package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import com.sofascore.results.profile.LoginScreenActivity;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fjb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoginScreenActivity b;

    public /* synthetic */ fjb(LoginScreenActivity loginScreenActivity, int i) {
        this.a = i;
        this.b = loginScreenActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LoginScreenActivity loginScreenActivity = this.b;
        switch (i) {
            case 0:
                int i2 = LoginScreenActivity.M;
                View inflate = loginScreenActivity.getLayoutInflater().inflate(R.layout.activity_login, (ViewGroup) null, false);
                int i3 = R.id.facebook_login_button;
                MaterialButton materialButton = (MaterialButton) nq8.B(R.id.facebook_login_button, inflate);
                if (materialButton != null) {
                    i3 = R.id.login_buttons;
                    View B = nq8.B(R.id.login_buttons, inflate);
                    if (B != null) {
                        MaterialButton materialButton2 = (MaterialButton) nq8.B(R.id.button_login_google, B);
                        if (materialButton2 == null) {
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(R.id.button_login_google)));
                            return null;
                        }
                        ed edVar = new ed((LinearLayout) B, 28, materialButton2);
                        i3 = R.id.scroll_view_login;
                        ScrollView scrollView = (ScrollView) nq8.B(R.id.scroll_view_login, inflate);
                        if (scrollView != null) {
                            i3 = R.id.text_terms_privacy;
                            TextView textView = (TextView) nq8.B(R.id.text_terms_privacy, inflate);
                            if (textView != null) {
                                i3 = R.id.toolbar;
                                View B2 = nq8.B(R.id.toolbar, inflate);
                                if (B2 != null) {
                                    z3f.b(B2);
                                    return new nd((LinearLayout) inflate, materialButton, edVar, scrollView, textView);
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            default:
                int i4 = LoginScreenActivity.M;
                Calendar calendar = ke0.a;
                ke0.g(loginScreenActivity, loginScreenActivity.getString(R.string.error_message_title), 0);
                return Unit.a;
        }
    }
}
