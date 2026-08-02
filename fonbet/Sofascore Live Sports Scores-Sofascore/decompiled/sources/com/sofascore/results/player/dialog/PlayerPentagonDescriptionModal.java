package com.sofascore.results.player.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.newNetwork.AttributeOverviewData;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.ate;
import defpackage.dti;
import defpackage.k13;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.yhk;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/player/dialog/PlayerPentagonDescriptionModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerPentagonDescriptionModal extends BaseModalBottomSheetDialog {
    public final mqi w = ypa.b(new ate(this, 2));
    public final boolean x = true;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        String str;
        List<String> S0 = CollectionsKt.S0(dti.q((AttributeOverviewData) this.w.getValue()).keySet());
        ArrayList arrayList = new ArrayList(k13.r(S0, 10));
        for (String str2 : S0) {
            Context requireContext = requireContext();
            requireContext.getClass();
            str2.getClass();
            switch (str2.hashCode()) {
                case 64686:
                    if (str2.equals("AER")) {
                        str = requireContext.getString(R.string.player_ability_aerial_reach);
                        str.getClass();
                        break;
                    }
                    str = str2;
                    break;
                case 64967:
                    if (str2.equals("ANT")) {
                        str = requireContext.getString(R.string.player_ability_anticipation);
                        str.getClass();
                        break;
                    }
                    str = str2;
                    break;
                case 65153:
                    if (str2.equals("ATT")) {
                        str = requireContext.getString(R.string.player_ability_attacking);
                        str.getClass();
                        break;
                    }
                    str = str2;
                    break;
                case 65517:
                    if (str2.equals("BAL")) {
                        str = requireContext.getString(R.string.player_ability_ball_distribution);
                        str.getClass();
                        break;
                    }
                    str = str2;
                    break;
                case 66998:
                    if (str2.equals("CRE")) {
                        str = requireContext.getString(R.string.player_ability_creativity);
                        str.getClass();
                        break;
                    }
                    str = str2;
                    break;
                case 67557:
                    if (str2.equals("DEF")) {
                        str = requireContext.getString(R.string.player_ability_defending);
                        str.getClass();
                        break;
                    }
                    str = str2;
                    break;
                case 81864:
                    if (str2.equals("SAV")) {
                        str = requireContext.getString(R.string.player_ability_saves);
                        str.getClass();
                        break;
                    }
                    str = str2;
                    break;
                case 82806:
                    if (str2.equals("TAC")) {
                        str = requireContext.getString(R.string.player_ability_tactical);
                        str.getClass();
                        break;
                    }
                    str = str2;
                    break;
                case 82930:
                    if (str2.equals("TEC")) {
                        str = requireContext.getString(R.string.player_ability_technical);
                        str.getClass();
                        break;
                    }
                    str = str2;
                    break;
                default:
                    str = str2;
                    break;
            }
            arrayList.add(new Pair(str2, str));
        }
        View inflate = layoutInflater.inflate(R.layout.dialog_pentagon_info, (ViewGroup) v().l, false);
        if (((TextView) nq8.B(R.id.info_text, inflate)) == null) {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.info_text)));
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) inflate;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str3 = (String) pair.a;
            String str4 = (String) pair.b;
            View inflate2 = layoutInflater.inflate(R.layout.pentagon_info_attribute_row, (ViewGroup) linearLayout, false);
            linearLayout.addView(inflate2);
            int i = R.id.short_name;
            TextView textView = (TextView) nq8.B(R.id.short_name, inflate2);
            if (textView != null) {
                i = R.id.translated_name;
                TextView textView2 = (TextView) nq8.B(R.id.translated_name, inflate2);
                if (textView2 != null) {
                    textView.setText(str3);
                    textView2.setText(str4);
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
            return null;
        }
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AttributeOverviewModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.football_attribute_overview_title);
        string.getClass();
        return string;
    }
}
