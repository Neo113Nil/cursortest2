package defpackage;

import android.widget.Filter;
import com.sofascore.model.mvvm.model.Team;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cl2 extends Filter {
    public final /* synthetic */ int a;

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.a) {
            case 0:
                return obj instanceof bl2 ? ((bl2) obj).b : "";
            case 1:
                return obj instanceof Team ? ((Team) obj).getName() : "";
            default:
                return super.convertResultToString(obj);
        }
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        switch (this.a) {
            case 4:
                charSequence.getClass();
            case 0:
            case 1:
            case 2:
            case 3:
                return null;
            case 5:
                charSequence.getClass();
                return null;
            default:
                return null;
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        int i = this.a;
    }

    private final void a(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    private final void b(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    private final void c(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    private final void d(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    private final void e(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    private final void f(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    private final void g(CharSequence charSequence, Filter.FilterResults filterResults) {
    }
}
