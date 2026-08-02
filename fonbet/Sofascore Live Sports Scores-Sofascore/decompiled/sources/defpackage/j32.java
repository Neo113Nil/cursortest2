package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.chat.BanReason;
import com.sofascore.model.chat.Message;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.view.branding.BrandingHeaderView;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j32 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j32(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.b = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BanReason.Type type;
        int i = this.a;
        String str = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                BrandingHeaderView brandingHeaderView = (BrandingHeaderView) obj5;
                int i2 = BrandingHeaderView.b;
                Context context = brandingHeaderView.getContext();
                context.getClass();
                nv.o(context, (Integer) obj4, (BrandLocation) obj3, ((Brand) obj2).getSlug(), (BrandType) obj);
                Context context2 = brandingHeaderView.getContext();
                context2.getClass();
                bea.G(context2, str);
                break;
            default:
                y11 y11Var = (y11) obj5;
                ez0 ez0Var = (ez0) obj4;
                TextInputEditText textInputEditText = (TextInputEditText) ez0Var.d;
                Message message = (Message) obj3;
                AlertDialog alertDialog = (AlertDialog) obj2;
                Context context3 = (Context) obj;
                ChatInterface chatInterface = ((us2) y11Var).y;
                if (chatInterface != null) {
                    nv.t(context3, "ban", str, chatInterface);
                }
                RadioGroup radioGroup = (RadioGroup) ez0Var.e;
                textInputEditText.clearFocus();
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                radioButton.getClass();
                String lowerCase = radioButton.getText().toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -2060462300:
                        if (lowerCase.equals("advertising")) {
                            type = BanReason.Type.ADVERTISE;
                            break;
                        }
                        type = BanReason.Type.OTHER;
                        break;
                    case 68070259:
                        if (lowerCase.equals("insulting")) {
                            type = BanReason.Type.INSULT;
                            break;
                        }
                        type = BanReason.Type.OTHER;
                        break;
                    case 172135943:
                        if (lowerCase.equals("fake score")) {
                            type = BanReason.Type.FAKE;
                            break;
                        }
                        type = BanReason.Type.OTHER;
                        break;
                    case 1126973647:
                        if (lowerCase.equals("cursing")) {
                            type = BanReason.Type.CURSE;
                            break;
                        }
                        type = BanReason.Type.OTHER;
                        break;
                    default:
                        type = BanReason.Type.OTHER;
                        break;
                }
                xw3.L(un0.z(y11Var), null, null, new w11(y11Var, message, new BanReason(type, String.valueOf(textInputEditText.getText())), null, 0), 3);
                alertDialog.dismiss();
                break;
        }
    }
}
