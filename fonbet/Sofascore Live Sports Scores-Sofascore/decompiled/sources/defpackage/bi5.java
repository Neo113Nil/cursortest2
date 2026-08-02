package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bi5 extends ArrayAdapter {
    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new cl2(3);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String alpha2;
        viewGroup.getClass();
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.edit_player_team_row, viewGroup, false);
        }
        gh5 a = gh5.a(view);
        Venue venue = (Venue) getItem(i);
        if (venue != null) {
            a.d.setText(dmi.r(venue.getStadium().getName(), " (", venue.getCity().getName(), ")"));
            Country country = venue.getCountry();
            if (country != null && (alpha2 = country.getAlpha2()) != null) {
                as9.c(a.c, alpha2, false, null, 6);
            }
        }
        view.getClass();
        return view;
    }
}
