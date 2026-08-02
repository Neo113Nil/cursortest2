package com.bytedance.sdk.openadsdk.core.hc.sf.vj;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.bytedance.adsdk.ugeno.yoga.sf.gm;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends FrameLayout {
    private final C0083pcc gm;
    private oo oo;
    private final RecyclerView pcc;
    private final List<gm> sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf extends u {
        private final ViewGroup pcc;

        public sf(@NonNull View view) {
            super(view);
            this.pcc = (ViewGroup) view;
        }

        public void pcc(gm gmVar) {
            View vh = gmVar.vh();
            ViewParent parent = vh.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(vh);
            }
            this.pcc.removeAllViews();
            this.pcc.addView(vh, new gm.pcc(gmVar.nn(), gmVar.rnn()));
        }
    }

    public pcc(@NonNull Context context) {
        super(context);
        this.sf = new CopyOnWriteArrayList();
        C0083pcc c0083pcc = new C0083pcc();
        this.gm = c0083pcc;
        RecyclerView recyclerView = new RecyclerView(context);
        this.pcc = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0083pcc);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.wh();
        }
        super.onLayout(z, i, i2, i3, i4);
        oo ooVar2 = this.oo;
        if (ooVar2 != null) {
            ooVar2.pcc(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        oo ooVar = this.oo;
        if (ooVar != null) {
            int[] pcc = ooVar.pcc(i, i2);
            super.onMeasure(pcc[0], pcc[1]);
        } else {
            super.onMeasure(i, i2);
        }
        oo ooVar2 = this.oo;
        if (ooVar2 != null) {
            ooVar2.vj();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.hc.sf.vj.sf sfVar) {
        ViewGroup.LayoutParams layoutParams = this.pcc.getLayoutParams();
        layoutParams.width = sfVar.nn();
        layoutParams.height = sfVar.rnn();
        this.pcc.setLayoutParams(layoutParams);
    }

    public void setOrientation(int i) {
        RecyclerView recyclerView = this.pcc;
        if (i == 1) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        } else {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        }
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm<View> gmVar) {
        if (gmVar == null) {
            return;
        }
        this.sf.add(gmVar);
        C0083pcc c0083pcc = this.gm;
        if (c0083pcc != null) {
            c0083pcc.notifyDataSetChanged();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.hc.sf.vj.pcc$pcc, reason: collision with other inner class name */
    public class C0083pcc extends l {
        private C0083pcc() {
        }

        @Override // androidx.recyclerview.widget.l
        public int getItemCount() {
            return pcc.this.sf.size();
        }

        @Override // androidx.recyclerview.widget.l
        @NonNull
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public sf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            com.bytedance.adsdk.ugeno.yoga.sf.gm gmVar = new com.bytedance.adsdk.ugeno.yoga.sf.gm(viewGroup.getContext());
            com.bytedance.adsdk.ugeno.sf.gm gmVar2 = (com.bytedance.adsdk.ugeno.sf.gm) pcc.this.sf.get(i);
            gmVar.setLayoutParams(new ViewGroup.LayoutParams(gmVar2.nn(), gmVar2.rnn()));
            return new sf(gmVar);
        }

        @Override // androidx.recyclerview.widget.l
        public int getItemViewType(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.l
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull sf sfVar, int i) {
            sfVar.pcc((com.bytedance.adsdk.ugeno.sf.gm) pcc.this.sf.get(i));
        }
    }

    public void pcc(oo ooVar) {
        this.oo = ooVar;
    }
}
