package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.i;
import com.ironsource.U3;
import com.sofascore.model.Section;
import com.vungle.ads.internal.protos.Sdk;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ob5 extends p8 {
    public final /* synthetic */ int c;
    public final h04 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ob5(h04 h04Var, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                ConstraintLayout constraintLayout = h04Var.b;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = h04Var;
                break;
            default:
                ConstraintLayout constraintLayout2 = h04Var.b;
                constraintLayout2.getClass();
                this.d = h04Var;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3;
        String c;
        int i4 = this.c;
        h04 h04Var = this.d;
        switch (i4) {
            case 0:
                String str = (String) obj;
                str.getClass();
                TextView textView = h04Var.d;
                textView.setVisibility(0);
                h04Var.c.setVisibility(8);
                textView.setText(str);
                break;
            default:
                Section section = (Section) obj;
                section.getClass();
                TextView textView2 = h04Var.d;
                String name = section.getName();
                name.getClass();
                Locale locale = Locale.US;
                String k = i.k(locale, name, locale);
                switch (k.hashCode()) {
                    case -2029849391:
                        if (k.equals("september")) {
                            i3 = 8;
                            break;
                        }
                        i3 = -1;
                        break;
                    case -1826660246:
                        if (k.equals("january")) {
                            i3 = 0;
                            break;
                        }
                        i3 = -1;
                        break;
                    case -1621487904:
                        if (k.equals("october")) {
                            i3 = 9;
                            break;
                        }
                        i3 = -1;
                        break;
                    case -1406703101:
                        if (k.equals("august")) {
                            i3 = 7;
                            break;
                        }
                        i3 = -1;
                        break;
                    case -263893086:
                        if (k.equals("february")) {
                            i3 = 1;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 107877:
                        if (k.equals("may")) {
                            i3 = 4;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 3273752:
                        if (k.equals("july")) {
                            i3 = 6;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 3273794:
                        if (k.equals("june")) {
                            i3 = 5;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 93031046:
                        if (k.equals("april")) {
                            i3 = 3;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 103666243:
                        if (k.equals("march")) {
                            i3 = 2;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 561839141:
                        if (k.equals("december")) {
                            i3 = 11;
                            break;
                        }
                        i3 = -1;
                        break;
                    case 1639129394:
                        if (k.equals("november")) {
                            i3 = 10;
                            break;
                        }
                        i3 = -1;
                        break;
                    default:
                        i3 = -1;
                        break;
                }
                if (i3 > -1) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL", dla.d());
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(5, 1);
                    calendar.set(2, i3);
                    c = simpleDateFormat.format(calendar.getTime());
                    c.getClass();
                } else {
                    mqi mqiVar = qhi.a;
                    String name2 = section.getName();
                    name2.getClass();
                    Context context = this.b;
                    context.getClass();
                    c = tv3.c(context, c.r(c.r(c.r(name2, U3.j.c, "and", false), "(", "", false), ")", "", false));
                }
                textView2.setText(c);
                haa.D(textView2);
                Context context2 = textView2.getContext();
                context2.getClass();
                textView2.setPaddingRelative(ao2.s(8, context2), textView2.getPaddingTop(), textView2.getPaddingEnd(), textView2.getPaddingBottom());
                ConstraintLayout constraintLayout = h04Var.b;
                constraintLayout.getClass();
                sea.v(constraintLayout, false, i == i2 + (-1), 0, 6, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                break;
        }
    }
}
