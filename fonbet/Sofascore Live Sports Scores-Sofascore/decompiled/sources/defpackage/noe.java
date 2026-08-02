package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.model.Money;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.newNetwork.NationalTeamStatisticsData;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class noe extends p8 {
    public final /* synthetic */ int c;
    public final xz0 d;
    public final /* synthetic */ ooe e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public noe(ooe ooeVar, xz0 xz0Var, int i) {
        super(r1);
        this.c = i;
        switch (i) {
            case 1:
                this.e = ooeVar;
                ConstraintLayout constraintLayout = (ConstraintLayout) xz0Var.j;
                constraintLayout.getClass();
                super(constraintLayout);
                this.d = xz0Var;
                break;
            default:
                this.e = ooeVar;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) xz0Var.j;
                constraintLayout2.getClass();
                this.d = xz0Var;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        int intValue;
        String fromTeamName;
        String name;
        int i3 = this.c;
        xz0 xz0Var = this.d;
        ooe ooeVar = this.e;
        Context context = this.b;
        String str = "";
        switch (i3) {
            case 0:
                NationalTeamStatisticsData nationalTeamStatisticsData = (NationalTeamStatisticsData) obj;
                nationalTeamStatisticsData.getClass();
                boolean z = CollectionsKt.a0(i + 1, ooeVar.i) instanceof NationalTeamStatisticsData;
                boolean z2 = !z;
                TextView textView = (TextView) xz0Var.g;
                ConstraintLayout constraintLayout = (ConstraintLayout) xz0Var.j;
                textView.setVisibility(8);
                ((TextView) xz0Var.i).setVisibility(8);
                ((Group) xz0Var.l).setVisibility(8);
                ((Group) xz0Var.m).setVisibility(0);
                as9.o(xz0Var.c, nationalTeamStatisticsData.getTeam().getId());
                TextView textView2 = xz0Var.e;
                textView2.setTextAppearance(R.style.BodyMedium);
                textView2.setText(tba.p(context, nationalTeamStatisticsData.getTeam()));
                TextView textView3 = (TextView) xz0Var.h;
                Long debutTimestamp = nationalTeamStatisticsData.getDebutTimestamp();
                if (debutTimestamp != null) {
                    long longValue = debutTimestamp.longValue();
                    bi4 bi4Var = bi4.PATTERN_DMMY;
                    Locale d = dla.d();
                    ZoneId of = ZoneId.of("GMT");
                    of.getClass();
                    String string = context.getString(R.string.national_team_debut, fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var.d(), d).withZone(of).withDecimalStyle(DecimalStyle.of(d))));
                    if (string != null) {
                        str = string;
                    }
                }
                textView3.setText(str);
                xz0Var.b.setText(String.valueOf(nationalTeamStatisticsData.getAppearances()));
                xz0Var.d.setText(String.valueOf(nationalTeamStatisticsData.getGoals()));
                constraintLayout.getClass();
                sea.v(constraintLayout, false, z2, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), !z ? ao2.s(8, context) : 0);
                ((SofaDivider) xz0Var.f).setVisibility(!z ? 8 : 0);
                break;
            default:
                Transfer transfer = (Transfer) obj;
                transfer.getClass();
                boolean z3 = CollectionsKt.a0(i + 1, ooeVar.i) instanceof Transfer;
                boolean z4 = !z3;
                Group group = (Group) xz0Var.m;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) xz0Var.j;
                TextView textView4 = xz0Var.e;
                ImageView imageView = xz0Var.c;
                group.setVisibility(8);
                TextView textView5 = (TextView) xz0Var.g;
                textView5.setVisibility(0);
                TextView textView6 = (TextView) xz0Var.i;
                textView6.setVisibility(0);
                Team transferTo = transfer.getTransferTo();
                if (transferTo != null) {
                    as9.o(imageView, transferTo.getId());
                    Unit unit = Unit.a;
                } else if (Intrinsics.c(transfer.getToTeamName(), "Ban")) {
                    Integer valueOf = Integer.valueOf(R.drawable.ic_block);
                    apf a = ajh.a(imageView.getContext());
                    ht9 ht9Var = new ht9(imageView.getContext());
                    ht9Var.c = valueOf;
                    fc6.w(ht9Var, imageView, a);
                } else {
                    Drawable m = qa5.a.m(context);
                    apf a2 = ajh.a(imageView.getContext());
                    ht9 ht9Var2 = new ht9(imageView.getContext());
                    ht9Var2.c = m;
                    fc6.w(ht9Var2, imageView, a2);
                }
                textView4.setTextAppearance(R.style.BodyMedium);
                textView4.setText(v8a.n(context, transfer.getTransferTo(), transfer.getToTeamName()));
                TextView textView7 = (TextView) xz0Var.h;
                long transferDateTimestamp = transfer.getTransferDateTimestamp();
                bi4 bi4Var2 = bi4.PATTERN_DMMY;
                Locale d2 = dla.d();
                ZoneId of2 = ZoneId.of("GMT");
                of2.getClass();
                String format = DateTimeFormatter.ofPattern(bi4Var2.d(), d2).withZone(of2).withDecimalStyle(DecimalStyle.of(d2)).format(Instant.ofEpochSecond(transferDateTimestamp));
                format.getClass();
                textView7.setText(format);
                if (transfer.getTransferFeeRaw() != null) {
                    Money transferFeeRaw = transfer.getTransferFeeRaw();
                    if ((transferFeeRaw != null ? transferFeeRaw.getValue() : 0) > 0) {
                        Set set = o84.a;
                        Money transferFeeRaw2 = transfer.getTransferFeeRaw();
                        transferFeeRaw2.getClass();
                        textView5.setText(o84.a(context, transferFeeRaw2, transfer.getTransferDateTimestamp(), 8));
                        Integer type = transfer.getType();
                        intValue = type == null ? type.intValue() : 0;
                        String B = v8a.B(intValue, false, context);
                        int color = context.getColor(R.color.secondary_default);
                        qvj qvjVar = qvj.a;
                        if (intValue != 5) {
                            Integer round = transfer.getRound();
                            if (round != null) {
                                String string2 = context.getString(R.string.nba_draft_round);
                                string2.getClass();
                                Locale locale = Locale.getDefault();
                                locale.getClass();
                                String lowerCase = string2.toLowerCase(locale);
                                lowerCase.getClass();
                                str = lowerCase + " " + round;
                            }
                            Integer pick = transfer.getPick();
                            if (pick != null) {
                                if (round != null) {
                                    str = str.concat(", ");
                                }
                                String string3 = context.getString(R.string.nba_draft_pick);
                                string3.getClass();
                                Locale locale2 = Locale.getDefault();
                                locale2.getClass();
                                String lowerCase2 = string3.toLowerCase(locale2);
                                lowerCase2.getClass();
                                str = str + lowerCase2 + " " + pick;
                            }
                            B = lnb.o(B, " ", str);
                        } else if (!z3) {
                            Team transferFrom = transfer.getTransferFrom();
                            if ((transferFrom == null || (fromTeamName = transferFrom.getName()) == null) && (fromTeamName = transfer.getFromTeamName()) == null) {
                                fromTeamName = "";
                            }
                            if (!fromTeamName.equals("No team")) {
                                color = context.getColor(R.color.n_lv_3);
                                Team transferFrom2 = transfer.getTransferFrom();
                                if (transferFrom2 == null || (name = transferFrom2.getName()) == null) {
                                    String fromTeamName2 = transfer.getFromTeamName();
                                    if (fromTeamName2 != null) {
                                        str = fromTeamName2;
                                    }
                                } else {
                                    str = name;
                                }
                                B = context.getString(R.string.first_transfer_from, str);
                                B.getClass();
                            }
                        }
                        textView6.setTextColor(color);
                        textView6.setText(B);
                        constraintLayout2.getClass();
                        sea.v(constraintLayout2, false, z4, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), z3 ? ao2.s(8, context) : 0);
                        ((SofaDivider) xz0Var.f).setVisibility(z3 ? 8 : 0);
                        break;
                    }
                }
                textView5.setText(v8a.y(context, transfer.getTransferFeeDescription()));
                Integer type2 = transfer.getType();
                if (type2 == null) {
                }
                String B2 = v8a.B(intValue, false, context);
                int color2 = context.getColor(R.color.secondary_default);
                qvj qvjVar2 = qvj.a;
                if (intValue != 5) {
                }
                textView6.setTextColor(color2);
                textView6.setText(B2);
                constraintLayout2.getClass();
                sea.v(constraintLayout2, false, z4, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), z3 ? ao2.s(8, context) : 0);
                ((SofaDivider) xz0Var.f).setVisibility(z3 ? 8 : 0);
                break;
        }
    }
}
