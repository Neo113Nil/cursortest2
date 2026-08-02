package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zac extends l {
    public final ArrayList a = new ArrayList();
    public final LayoutInflater b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f;
    public yac g;
    public final int h;
    public final AccelerateDecelerateInterpolator i;
    public final /* synthetic */ bbc j;

    public zac(bbc bbcVar) {
        this.j = bbcVar;
        Context context = bbcVar.o;
        this.b = LayoutInflater.from(context);
        this.c = hda.D(R.attr.mediaRouteDefaultIconDrawable, context);
        this.d = hda.D(R.attr.mediaRouteTvIconDrawable, context);
        this.e = hda.D(R.attr.mediaRouteSpeakerIconDrawable, context);
        this.f = hda.D(R.attr.mediaRouteSpeakerGroupIconDrawable, context);
        this.h = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.i = new AccelerateDecelerateInterpolator();
        r();
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return this.a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemViewType(int i) {
        yac yacVar;
        if (i == 0) {
            yacVar = this.g;
        } else {
            yacVar = (yac) this.a.get(i - 1);
        }
        return yacVar.b;
    }

    public final void o(int i, View view) {
        gac gacVar = new gac(i, view.getLayoutParams().height, 1, view);
        gacVar.setAnimationListener(new vg2(this, 3));
        gacVar.setDuration(this.h);
        gacVar.setInterpolator(this.i);
        view.startAnimation(gacVar);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        lbc a;
        cbc cbcVar;
        ArrayList arrayList = this.a;
        int i2 = (i == 0 ? this.g : (yac) arrayList.get(i - 1)).b;
        boolean z = true;
        yac yacVar = i == 0 ? this.g : (yac) arrayList.get(i - 1);
        bbc bbcVar = this.j;
        int i3 = 0;
        if (i2 == 1) {
            bbcVar.w.put(((obc) yacVar.a).c, (e) uVar);
            f fVar = (f) uVar;
            View view = fVar.itemView;
            bbc bbcVar2 = fVar.h.j;
            if (bbcVar2.T && Collections.unmodifiableList(bbcVar2.j.v).size() > 1) {
                i3 = fVar.g;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            obc obcVar = (obc) yacVar.a;
            fVar.a(obcVar);
            fVar.f.setText(obcVar.d);
            return;
        }
        if (i2 == 2) {
            xac xacVar = (xac) uVar;
            xacVar.getClass();
            xacVar.b.setText(yacVar.a.toString());
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                zzl.s();
                return;
            }
            wac wacVar = (wac) uVar;
            View view2 = wacVar.b;
            obc obcVar2 = (obc) yacVar.a;
            wacVar.g = obcVar2;
            ImageView imageView = wacVar.c;
            imageView.setVisibility(0);
            wacVar.d.setVisibility(4);
            zac zacVar = wacVar.h;
            List unmodifiableList = Collections.unmodifiableList(zacVar.j.j.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == obcVar2) ? wacVar.f : 1.0f);
            view2.setOnClickListener(new cb(wacVar, 6));
            imageView.setImageDrawable(zacVar.p(obcVar2));
            wacVar.e.setText(obcVar2.d);
            return;
        }
        bbcVar.w.put(((obc) yacVar.a).c, (e) uVar);
        g gVar = (g) uVar;
        float f = gVar.l;
        cb cbVar = gVar.n;
        ImageView imageView2 = gVar.g;
        View view3 = gVar.f;
        CheckBox checkBox = gVar.k;
        obc obcVar3 = (obc) yacVar.a;
        zac zacVar2 = gVar.o;
        bbc bbcVar3 = zacVar2.j;
        if (obcVar3 == bbcVar3.j && Collections.unmodifiableList(obcVar3.v).size() > 0) {
            Iterator it = Collections.unmodifiableList(obcVar3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obc obcVar4 = (obc) it.next();
                if (!bbcVar3.l.contains(obcVar4)) {
                    obcVar3 = obcVar4;
                    break;
                }
            }
        }
        gVar.a(obcVar3);
        imageView2.setImageDrawable(zacVar2.p(obcVar3));
        gVar.i.setText(obcVar3.d);
        checkBox.setVisibility(0);
        boolean c = gVar.c(obcVar3);
        boolean z2 = !bbcVar3.n.contains(obcVar3) && (!gVar.c(obcVar3) || Collections.unmodifiableList(bbcVar3.j.v).size() >= 2) && !(gVar.c(obcVar3) && ((a = bbcVar3.j.a()) == null || (cbcVar = (cbc) a.x.get(obcVar3.c)) == null || !cbcVar.c));
        checkBox.setChecked(c);
        gVar.h.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z2);
        checkBox.setEnabled(z2);
        gVar.c.setEnabled(z2 || c);
        MediaRouteVolumeSlider mediaRouteVolumeSlider = gVar.d;
        if (!z2 && !c) {
            z = false;
        }
        mediaRouteVolumeSlider.setEnabled(z);
        view3.setOnClickListener(cbVar);
        checkBox.setOnClickListener(cbVar);
        RelativeLayout relativeLayout = gVar.j;
        if (c && !gVar.b.e()) {
            i3 = gVar.m;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i3;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z2 || c) ? 1.0f : f);
        checkBox.setAlpha((z2 || !c) ? 1.0f : f);
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.b;
        if (i == 1) {
            return new f(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new xac(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new g(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i == 4) {
            return new wac(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        zzl.s();
        return null;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewRecycled(u uVar) {
        super.onViewRecycled(uVar);
        this.j.w.values().remove(uVar);
    }

    public final Drawable p(obc obcVar) {
        Uri uri = obcVar.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.j.o.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException unused) {
                uri.toString();
            }
        }
        int i = obcVar.n;
        return i != 1 ? i != 2 ? obcVar.e() ? this.f : this.c : this.e : this.d;
    }

    public final void q() {
        bbc bbcVar = this.j;
        ArrayList arrayList = bbcVar.n;
        arrayList.clear();
        ArrayList arrayList2 = bbcVar.l;
        ArrayList arrayList3 = new ArrayList();
        lbc a = bbcVar.j.a();
        if (a != null) {
            nbc nbcVar = bbcVar.j.a;
            pbc.b();
            for (obc obcVar : Collections.unmodifiableList(nbcVar.b)) {
                if (a.o(obcVar)) {
                    arrayList3.add(obcVar);
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        notifyDataSetChanged();
    }

    public final void r() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        bbc bbcVar = this.j;
        ArrayList arrayList2 = bbcVar.m;
        Context context = bbcVar.o;
        ArrayList arrayList3 = bbcVar.l;
        this.g = new yac(bbcVar.j, 1);
        ArrayList arrayList4 = bbcVar.k;
        if (arrayList4.isEmpty()) {
            arrayList.add(new yac(bbcVar.j, 3));
        } else {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList.add(new yac((obc) it.next(), 3));
            }
        }
        boolean z = false;
        if (!arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                obc obcVar = (obc) it2.next();
                if (!arrayList4.contains(obcVar)) {
                    if (!z2) {
                        bbcVar.j.getClass();
                        dbc b = obc.b();
                        String j = b != null ? b.j() : null;
                        if (TextUtils.isEmpty(j)) {
                            j = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new yac(j, 2));
                        z2 = true;
                    }
                    arrayList.add(new yac(obcVar, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                obc obcVar2 = (obc) it3.next();
                obc obcVar3 = bbcVar.j;
                if (obcVar3 != obcVar2) {
                    if (!z) {
                        obcVar3.getClass();
                        dbc b2 = obc.b();
                        String k = b2 != null ? b2.k() : null;
                        if (TextUtils.isEmpty(k)) {
                            k = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new yac(k, 2));
                        z = true;
                    }
                    arrayList.add(new yac(obcVar2, 4));
                }
            }
        }
        q();
    }
}
