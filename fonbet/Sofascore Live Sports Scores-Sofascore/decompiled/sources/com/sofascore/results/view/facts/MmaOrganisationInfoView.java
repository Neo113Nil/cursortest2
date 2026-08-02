package com.sofascore.results.view.facts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import defpackage.i3;
import defpackage.kqb;
import defpackage.o8;
import defpackage.tv3;
import defpackage.vm6;
import defpackage.wm6;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/sofascore/results/view/facts/MmaOrganisationInfoView;", "Li3;", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MmaOrganisationInfoView extends i3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MmaOrganisationInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        o8.d(this, 0, 7);
    }

    @Override // defpackage.i3
    public final ArrayList j(Object obj) {
        UniqueTournament uniqueTournament = (UniqueTournament) obj;
        uniqueTournament.getClass();
        ArrayList arrayList = new ArrayList();
        kqb c = kqb.c(LayoutInflater.from(getContext()), getBinding().a);
        c.d.setText(getContext().getString(R.string.info));
        arrayList.add(c.b);
        Country country = uniqueTournament.getCountry();
        if (country != null) {
            Context context = getContext();
            context.getClass();
            vm6 vm6Var = new vm6(context);
            String string = vm6Var.getContext().getString(R.string.country);
            string.getClass();
            vm6Var.j(string, null, true);
            Context context2 = vm6Var.getContext();
            context2.getClass();
            vm6Var.l(new wm6(tv3.c(context2, country.getName()), null, country.getAlpha2(), null, null, 54));
            arrayList.add(vm6Var);
        }
        Integer numberOfDivisions = uniqueTournament.getNumberOfDivisions();
        if (numberOfDivisions != null) {
            int intValue = numberOfDivisions.intValue();
            Context context3 = getContext();
            context3.getClass();
            vm6 vm6Var2 = new vm6(context3);
            String string2 = vm6Var2.getContext().getString(R.string.divisions);
            string2.getClass();
            vm6Var2.j(string2, null, true);
            vm6Var2.setLabelValue(String.valueOf(intValue));
            arrayList.add(vm6Var2);
        }
        Integer numberOfCompetitors = uniqueTournament.getNumberOfCompetitors();
        if (numberOfCompetitors != null) {
            int intValue2 = numberOfCompetitors.intValue();
            Context context4 = getContext();
            context4.getClass();
            vm6 vm6Var3 = new vm6(context4);
            String string3 = vm6Var3.getContext().getString(R.string.number_of_fighters);
            string3.getClass();
            vm6Var3.j(string3, null, true);
            vm6Var3.setLabelValue(String.valueOf(intValue2));
            arrayList.add(vm6Var3);
        }
        Integer yearOfFoundation = uniqueTournament.getYearOfFoundation();
        if (yearOfFoundation != null) {
            int intValue3 = yearOfFoundation.intValue();
            Context context5 = getContext();
            context5.getClass();
            vm6 vm6Var4 = new vm6(context5);
            String string4 = vm6Var4.getContext().getString(R.string.foundation_date);
            string4.getClass();
            vm6Var4.j(string4, null, true);
            vm6Var4.setLabelValue(String.valueOf(intValue3));
            arrayList.add(vm6Var4);
        }
        String chairman = uniqueTournament.getChairman();
        if (chairman != null) {
            Context context6 = getContext();
            context6.getClass();
            vm6 vm6Var5 = new vm6(context6);
            String string5 = vm6Var5.getContext().getString(R.string.current_president);
            string5.getClass();
            vm6Var5.j(string5, null, true);
            vm6Var5.setLabelValue(chairman);
            arrayList.add(vm6Var5);
        }
        String owner = uniqueTournament.getOwner();
        if (owner != null) {
            Context context7 = getContext();
            context7.getClass();
            vm6 vm6Var6 = new vm6(context7);
            String string6 = vm6Var6.getContext().getString(R.string.owner);
            string6.getClass();
            vm6Var6.j(string6, null, true);
            vm6Var6.setLabelValue(owner);
            arrayList.add(vm6Var6);
        }
        return arrayList;
    }
}
