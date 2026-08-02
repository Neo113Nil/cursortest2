package F0;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
public class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public a f3228a;

    public interface a {
        void a(Cursor cursor);

        Cursor b(CharSequence charSequence);

        Cursor c();

        CharSequence convertToString(Cursor cursor);
    }

    public b(a aVar) {
        this.f3228a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f3228a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor b10 = this.f3228a.b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (b10 != null) {
            filterResults.count = b10.getCount();
            filterResults.values = b10;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c10 = this.f3228a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == c10) {
            return;
        }
        this.f3228a.a((Cursor) obj);
    }
}
