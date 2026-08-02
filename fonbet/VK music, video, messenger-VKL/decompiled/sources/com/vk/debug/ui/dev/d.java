package com.vk.debug.ui.dev;

import android.R;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import xsna.a0a;
import xsna.d5l;
import xsna.drm0;
import xsna.epx;

/* compiled from: DebugDevSettingsFragment.java */
/* loaded from: classes17.dex */
public final class d extends ArrayAdapter<String> {
    public final d b;

    /* compiled from: DebugDevSettingsFragment.java */
    public class a extends Filter {
        public a() {
        }

        @Override // android.widget.Filter
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            String charSequence2 = charSequence.toString();
            int length = charSequence2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = epx.g(charSequence2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String obj = charSequence2.subSequence(i, length + 1).toString();
            if (TextUtils.isEmpty(charSequence2) || TextUtils.isEmpty(obj)) {
                arrayList.add("api.".concat(a0a.d));
            } else if (!drm0.D(charSequence2, a0a.d, false)) {
                if (d5l.a.contains(obj)) {
                    arrayList.add("r-" + obj + "");
                    arrayList.add("rk-" + obj + "");
                } else {
                    arrayList.add(obj + "");
                    arrayList.add("tk-" + obj + "");
                    arrayList.add("k-" + obj + "");
                }
            }
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj;
            d dVar = d.this.b;
            if (filterResults == null || (obj = filterResults.values) == null) {
                dVar.clear();
            } else {
                dVar.clear();
                dVar.addAll((ArrayList) obj);
            }
            dVar.notifyDataSetChanged();
        }
    }

    public d(FragmentActivity fragmentActivity, ArrayList arrayList, d5l d5lVar) {
        super(fragmentActivity, R.layout.simple_dropdown_item_1line, arrayList);
        this.b = this;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    @NonNull
    public final Filter getFilter() {
        return new a();
    }
}
