package com.vk.attachpicker.impl.graffiti.presentation;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.photo.editor.markup.view.DrawingView;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.ao50;
import xsna.bwt0;
import xsna.c5g;
import xsna.cws;
import xsna.dwg;
import xsna.edu;
import xsna.fgh;
import xsna.fyt0;
import xsna.gm50;
import xsna.icu;
import xsna.jcu;
import xsna.jf10;
import xsna.jzp0;
import xsna.k7f;
import xsna.km50;
import xsna.l6u;
import xsna.l8;
import xsna.lcu;
import xsna.m1k;
import xsna.mk50;
import xsna.mre;
import xsna.nbu;
import xsna.of10;
import xsna.p8;
import xsna.pwk;
import xsna.qcl;
import xsna.qj80;
import xsna.rop;
import xsna.u4e;
import xsna.vk50;
import xsna.wcg;
import xsna.wje;
import xsna.wpa0;
import xsna.xcd;
import xsna.xn50;
import xsna.xzp0;
import xsna.y8g;
import xsna.zxo;

/* compiled from: GraffitiDrawingFragment.kt */
/* loaded from: classes15.dex */
public final class GraffitiDrawingFragment extends MviImplFragment<lcu, edu, nbu> {
    public static final /* synthetic */ int Q = 0;

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_graffiti_drawing);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        edu eduVar = (edu) ao50Var;
        jcu jcuVar = new jcu(view, getViewLifecycleOwner(), new p8(1, this, GraffitiDrawingFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 5));
        ArrayList arrayList = jcuVar.e;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            y8g.c cVar = (y8g.c) it.next();
            if (cVar.a != -65536) {
                z = false;
            }
            arrayList2.add(new jzp0(cVar, z));
        }
        jf10 jf10Var = jcuVar.f;
        jf10Var.submitList(arrayList2);
        List singletonList = Collections.singletonList(new xzp0(new wpa0.b(false)));
        of10 of10Var = jcuVar.g;
        of10Var.submitList(singletonList);
        y8g.c cVar2 = new y8g.c(-65536);
        ColorButton colorButton = jcuVar.p;
        colorButton.setCurrentColor(cVar2);
        RecyclerView recyclerView = jcuVar.r;
        recyclerView.setClipToOutline(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jcuVar.h);
        jcuVar.b.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        jf10Var.c = new u4e(jcuVar, 25);
        of10Var.c = new l6u(jcuVar, 1);
        bwt0.i0(colorButton, new pwk(jcuVar, 17));
        bwt0.i0(jcuVar.q, new cws(jcuVar, 5));
        bwt0.i0(jcuVar.s, new wcg(jcuVar, 22));
        bwt0.i0(jcuVar.u, new zxo(jcuVar, 13));
        bwt0.i0(jcuVar.v, new dwg(jcuVar, 19));
        int i = Build.VERSION.SDK_INT;
        SizeSeekBarView sizeSeekBarView = jcuVar.A;
        if (i >= 29) {
            fyt0.b(sizeSeekBarView, new xcd(jcuVar, 25));
        }
        View view2 = jcuVar.n;
        qj80.a(view2, new icu(view2, jcuVar));
        bwt0.i0(jcuVar.w, new k7f(jcuVar, 18));
        bwt0.i0(jcuVar.x, new mre(jcuVar, 23));
        DrawingView drawingView = jcuVar.y;
        drawingView.setDrawingSessionTouchListener(jcuVar);
        drawingView.setTouchesEnabled(true);
        jcuVar.t.setListener(jcuVar);
        jcuVar.B.setColorSelectionListener(jcuVar);
        sizeSeekBarView.setListener(jcuVar);
        gm50.a.b(jcuVar, eduVar.a, new wje(jcuVar, 25));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, nbu.a.b);
        return true;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager supportFragmentManager;
        super.onViewCreated(view, bundle);
        getFeature().i.a(new m1k(this, 12), getViewLifecycleOwner());
        getFeature().g.a(new qcl(this, 18), getViewLifecycleOwner());
        getFeature().h.a(new rop(this, 9), getViewLifecycleOwner());
        getFeature().f.a(new fgh(this, 20), getViewLifecycleOwner());
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.l0("GRAFFITI_PREVIEW_SAVE_KEY", getViewLifecycleOwner(), new l8(this, 25));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("graffiti_title") : null;
        Bundle arguments2 = getArguments();
        return new lcu(string, arguments2 != null ? arguments2.getString("graffiti_avatar") : null);
    }
}
