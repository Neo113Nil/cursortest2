package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.DateSection;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class as7 extends p8 {
    public final /* synthetic */ int c;
    public final w16 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public as7(w16 w16Var, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                ConstraintLayout constraintLayout = w16Var.a;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = w16Var;
                break;
            default:
                ConstraintLayout constraintLayout2 = w16Var.a;
                constraintLayout2.getClass();
                this.d = w16Var;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        w16 w16Var = this.d;
        switch (i3) {
            case 0:
                DateSection dateSection = (DateSection) obj;
                dateSection.getClass();
                String text = dateSection.getText();
                String y = (text == null || text.length() == 0) ? "" : dmi.y(dateSection.getText(), " • ");
                long timestamp = dateSection.getTimestamp();
                int year = LocalDate.now(ZoneId.systemDefault()).getYear();
                LocalDate localDate = Instant.ofEpochSecond(timestamp).atZone(ZoneId.systemDefault()).toLocalDate();
                localDate.getClass();
                bi4 bi4Var = year == localDate.getYear() ? bi4.PATTERN_DMM : bi4.PATTERN_DAY_DMY;
                TextView textView = w16Var.c;
                long timestamp2 = dateSection.getTimestamp();
                Locale locale = Locale.getDefault();
                locale.getClass();
                ZoneId systemDefault = ZoneId.systemDefault();
                systemDefault.getClass();
                String format = DateTimeFormatter.ofPattern(bi4Var.d(), locale).withZone(systemDefault).withDecimalStyle(DecimalStyle.of(locale)).format(Instant.ofEpochSecond(timestamp2));
                format.getClass();
                textView.setText(y.concat(format));
                w16Var.d.setVisibility(8);
                w16Var.b.setVisibility(8);
                break;
            default:
                ylc ylcVar = (ylc) obj;
                ylcVar.getClass();
                TextView textView2 = w16Var.c;
                textView2.setText(this.b.getString(ylcVar.a));
                textView2.setVisibility(0);
                w16Var.d.setVisibility(8);
                w16Var.b.setVisibility(8);
                break;
        }
    }
}
