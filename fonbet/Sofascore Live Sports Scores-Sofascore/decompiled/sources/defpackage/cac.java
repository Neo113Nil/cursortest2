package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sofascore.results.R;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cac extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final LayoutInflater a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;

    public cac(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.b = td4.d0(obtainStyledAttributes.getResourceId(0, 0), context);
        this.c = td4.d0(obtainStyledAttributes.getResourceId(1, 0), context);
        this.d = td4.d0(obtainStyledAttributes.getResourceId(2, 0), context);
        this.e = td4.d0(obtainStyledAttributes.getResourceId(3, 0), context);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r0 != null) goto L30;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable createFromStream;
        if (view == null) {
            view = this.a.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
        }
        obc obcVar = (obc) getItem(i);
        TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
        TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
        textView.setText(obcVar.d);
        String str = obcVar.e;
        int i2 = obcVar.i;
        if ((i2 == 2 || i2 == 1) && !TextUtils.isEmpty(str)) {
            textView.setGravity(80);
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView.setGravity(16);
            textView2.setVisibility(8);
            textView2.setText("");
        }
        view.setEnabled(obcVar.g);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        if (imageView != null) {
            Uri uri = obcVar.f;
            if (uri != null) {
                try {
                    createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                } catch (IOException unused) {
                    uri.toString();
                }
            }
            int i3 = obcVar.n;
            createFromStream = i3 != 1 ? i3 != 2 ? obcVar.e() ? this.e : this.b : this.d : this.c;
            imageView.setImageDrawable(createFromStream);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((obc) getItem(i)).g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        obc obcVar = (obc) getItem(i);
        ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        obcVar.l(true);
    }
}
