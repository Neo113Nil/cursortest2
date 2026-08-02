package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sac extends l {
    public final ArrayList a = new ArrayList();
    public final LayoutInflater b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f;
    public final /* synthetic */ tac g;

    public sac(tac tacVar) {
        this.g = tacVar;
        Context context = tacVar.i;
        this.b = LayoutInflater.from(context);
        this.c = hda.D(R.attr.mediaRouteDefaultIconDrawable, context);
        this.d = hda.D(R.attr.mediaRouteTvIconDrawable, context);
        this.e = hda.D(R.attr.mediaRouteSpeakerIconDrawable, context);
        this.f = hda.D(R.attr.mediaRouteSpeakerGroupIconDrawable, context);
        o();
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemViewType(int i) {
        return ((qac) this.a.get(i)).b;
    }

    public final void o() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        tac tacVar = this.g;
        arrayList.add(new qac(tacVar.i.getString(R.string.mr_chooser_title)));
        Iterator it = tacVar.k.iterator();
        while (it.hasNext()) {
            arrayList.add(new qac((obc) it.next()));
        }
        notifyDataSetChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r2 != null) goto L23;
     */
    @Override // androidx.recyclerview.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(u uVar, int i) {
        Drawable createFromStream;
        int itemViewType = getItemViewType(i);
        qac qacVar = (qac) this.a.get(i);
        if (itemViewType == 1) {
            pac pacVar = (pac) uVar;
            pacVar.getClass();
            pacVar.b.setText(qacVar.a.toString());
            return;
        }
        if (itemViewType != 2) {
            return;
        }
        rac racVar = (rac) uVar;
        racVar.getClass();
        obc obcVar = (obc) qacVar.a;
        View view = racVar.b;
        view.setVisibility(0);
        racVar.d.setVisibility(4);
        view.setOnClickListener(new w38(1, racVar, obcVar));
        racVar.e.setText(obcVar.d);
        ImageView imageView = racVar.c;
        sac sacVar = racVar.f;
        Uri uri = obcVar.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(sacVar.g.i.getContentResolver().openInputStream(uri), null);
            } catch (IOException unused) {
                uri.toString();
            }
        }
        int i2 = obcVar.n;
        createFromStream = i2 != 1 ? i2 != 2 ? obcVar.e() ? sacVar.f : sacVar.c : sacVar.e : sacVar.d;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.b;
        if (i != 1) {
            if (i == 2) {
                return new rac(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            zzl.s();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        pac pacVar = new pac(inflate);
        pacVar.b = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return pacVar;
    }
}
