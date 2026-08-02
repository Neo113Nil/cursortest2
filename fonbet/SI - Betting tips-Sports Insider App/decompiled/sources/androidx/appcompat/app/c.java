package androidx.appcompat.app;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ContextThemeWrapper contextThemeWrapper, int i5, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i5, R.id.text1, charSequenceArr);
        this.f208b = gVar;
        this.f207a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i5, view, viewGroup);
        boolean[] zArr = this.f208b.E;
        if (zArr != null && zArr[i5]) {
            this.f207a.setItemChecked(i5, true);
        }
        return view2;
    }
}
