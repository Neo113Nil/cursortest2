package defpackage;

import com.sofascore.results.player.EditPlayerTransferDialog;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mh5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Calendar b;
    public final /* synthetic */ EditPlayerTransferDialog c;
    public final /* synthetic */ k15 d;

    public /* synthetic */ mh5(int i, k15 k15Var, EditPlayerTransferDialog editPlayerTransferDialog, Calendar calendar) {
        this.a = i;
        this.b = calendar;
        this.c = editPlayerTransferDialog;
        this.d = k15Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        k15 k15Var = this.d;
        EditPlayerTransferDialog editPlayerTransferDialog = this.c;
        Calendar calendar = this.b;
        Long l = (Long) obj;
        switch (i) {
            case 0:
                l.getClass();
                calendar.setTimeInMillis(l.longValue());
                long timeInMillis = calendar.getTimeInMillis() / 1000;
                editPlayerTransferDialog.v().r = timeInMillis;
                bi4 bi4Var = bi4.PATTERN_DMY;
                Locale d = dla.d();
                ZoneId of = ZoneId.of("GMT");
                of.getClass();
                k15Var.k.setText(fc6.i(timeInMillis, DateTimeFormatter.ofPattern(bi4Var.d(), d).withZone(of).withDecimalStyle(DecimalStyle.of(d))));
                break;
            default:
                l.getClass();
                calendar.setTimeInMillis(l.longValue());
                long timeInMillis2 = calendar.getTimeInMillis() / 1000;
                editPlayerTransferDialog.v().s = timeInMillis2;
                bi4 bi4Var2 = bi4.PATTERN_DMY;
                Locale d2 = dla.d();
                ZoneId of2 = ZoneId.of("GMT");
                of2.getClass();
                k15Var.r.setText(fc6.i(timeInMillis2, DateTimeFormatter.ofPattern(bi4Var2.d(), d2).withZone(of2).withDecimalStyle(DecimalStyle.of(d2))));
                break;
        }
        return Unit.a;
    }
}
