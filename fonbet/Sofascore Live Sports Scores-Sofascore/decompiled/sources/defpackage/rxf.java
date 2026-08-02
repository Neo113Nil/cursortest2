package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rxf extends BaseAdapter {
    public final List a;

    public rxf(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        View view2 = view;
        if (view == null) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.edit_player_spinner_row, viewGroup, false);
            inflate.getClass();
            TextView textView = (TextView) inflate;
            textView.setTag(new qxf(textView));
            view2 = textView;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        int s = ao2.s(8, context);
        Context context2 = viewGroup.getContext();
        context2.getClass();
        int s2 = ao2.s(12, context2);
        Object tag = view2.getTag();
        tag.getClass();
        TextView textView2 = ((qxf) tag).a;
        textView2.setText((String) this.a.get(i));
        textView2.setPadding(s2, s, s2, s);
        return view2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (String) this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        View view2 = view;
        if (view == null) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.edit_player_spinner_row, viewGroup, false);
            inflate.getClass();
            TextView textView = (TextView) inflate;
            textView.setTag(new qxf(textView));
            view2 = textView;
        }
        Object tag = view2.getTag();
        tag.getClass();
        ((qxf) tag).a.setText(viewGroup.getContext().getResources().getString(R.string.quick_find));
        return view2;
    }
}
