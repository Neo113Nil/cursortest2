package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.DateSection;
import com.sofascore.model.Section;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sj4 extends l4 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj4(cbf cbfVar, RecyclerView recyclerView) {
        super(cbfVar, 1, recyclerView);
        this.g = 1;
        cbfVar.getClass();
    }

    @Override // defpackage.l4
    public final void f(Object obj) {
        switch (this.g) {
            case 0:
                ((cr2) h()).b.setText(((Section) obj).getName());
                break;
            case 1:
                oea.f((dx5) h(), (waf) obj);
                break;
            case 2:
                ylf ylfVar = (ylf) obj;
                ((fmf) h()).b.setText(ylfVar.a);
                ((fmf) h()).c.setText(ylfVar.b);
                break;
            default:
                DateSection dateSection = (DateSection) obj;
                String text = dateSection.getText();
                String y = (text == null || text.length() == 0) ? "" : dmi.y(dateSection.getText(), " • ");
                ConstraintLayout constraintLayout = ((w16) h()).a;
                constraintLayout.getClass();
                aba.F(constraintLayout);
                long timestamp = dateSection.getTimestamp();
                int year = LocalDate.now(ZoneId.systemDefault()).getYear();
                LocalDate localDate = Instant.ofEpochSecond(timestamp).atZone(ZoneId.systemDefault()).toLocalDate();
                localDate.getClass();
                bi4 bi4Var = year == localDate.getYear() ? bi4.PATTERN_DMM : bi4.PATTERN_DAY_DMY;
                TextView textView = ((w16) h()).c;
                long timestamp2 = dateSection.getTimestamp();
                Locale locale = Locale.getDefault();
                locale.getClass();
                ZoneId systemDefault = ZoneId.systemDefault();
                systemDefault.getClass();
                String format = DateTimeFormatter.ofPattern(bi4Var.d(), locale).withZone(systemDefault).withDecimalStyle(DecimalStyle.of(locale)).format(Instant.ofEpochSecond(timestamp2));
                format.getClass();
                textView.setText(y.concat(format));
                ((w16) h()).d.setVisibility(8);
                ((w16) h()).b.setVisibility(8);
                break;
        }
    }

    @Override // defpackage.l4
    public final krk g(Context context) {
        switch (this.g) {
            case 0:
                context.getClass();
                return cr2.a(LayoutInflater.from(context), null);
            case 1:
                context.getClass();
                return dx5.a(LayoutInflater.from(context), null);
            case 2:
                context.getClass();
                return fmf.a(LayoutInflater.from(context), null);
            default:
                context.getClass();
                return w16.a(LayoutInflater.from(context), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sj4(vqf vqfVar, int i, RecyclerView recyclerView, int i2) {
        super(vqfVar, i, recyclerView);
        this.g = i2;
    }
}
