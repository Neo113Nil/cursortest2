package defpackage;

import android.app.Application;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljwi;", "Lynb;", "Liwi;", "Ldwi;", "", "Landroid/app/Application;", "application", "Lfqg;", "savedStateHandle", "<init>", "(Landroid/app/Application;Lfqg;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class jwi extends ynb {
    public final YearMonth l;
    public final YearMonth m;
    public final YearMonth n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwi(@NotNull Application application, @NotNull fqg fqgVar) {
        super(application, tnb.a);
        Object value;
        application.getClass();
        fqgVar.getClass();
        Object a = fqgVar.a("ARG_FIRST_AVAILABLE_MONTH");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.l = (YearMonth) a;
        Object a2 = fqgVar.a("ARG_LAST_AVAILABLE_MONTH");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.m = (YearMonth) a2;
        Object a3 = fqgVar.a("ARG_SELECTED_YEAR_MONTH");
        if (a3 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.n = (YearMonth) a3;
        fdi fdiVar = this.e;
        do {
            value = fdiVar.getValue();
            ((vnb) value).getClass();
        } while (!fdiVar.k(value, new unb(t(this.n.getYear()))));
    }

    public final iwi t(int i) {
        YearMonth now = YearMonth.now();
        now.getClass();
        YearMonth yearMonth = this.l;
        yearMonth.getClass();
        YearMonth yearMonth2 = this.m;
        yearMonth2.getClass();
        YearMonth yearMonth3 = this.n;
        yearMonth3.getClass();
        IntRange intRange = new IntRange(i == yearMonth.getYear() ? yearMonth.getMonthValue() : 1, i == yearMonth2.getYear() ? yearMonth2.getMonthValue() : 12, 1);
        IntRange intRange2 = new IntRange(1, 12, 1);
        ArrayList arrayList = new ArrayList(k13.r(intRange2, 10));
        v6a it = intRange2.iterator();
        while (true) {
            boolean z = false;
            if (!it.c) {
                break;
            }
            int nextInt = it.nextInt();
            String displayName = Month.of(nextInt).getDisplayName(TextStyle.FULL_STANDALONE, dla.d());
            displayName.getClass();
            boolean z2 = nextInt <= intRange.b && intRange.a <= nextInt;
            if (i == yearMonth3.getYear() && nextInt == yearMonth3.getMonthValue()) {
                z = true;
            }
            arrayList.add(new hwi(nextInt, displayName, z2, z));
        }
        return new iwi(i, l6g.W(new IntRange(yearMonth.getYear(), yearMonth2.getYear(), 1)), l6g.W(arrayList), !now.equals(yearMonth3) && now.compareTo(yearMonth) >= 0 && now.compareTo(yearMonth2) <= 0);
    }
}
