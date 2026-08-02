package com.vk.stories.design.view.editor.verticalization;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.an10;
import xsna.b8j0;
import xsna.bqr0;
import xsna.bwt0;
import xsna.cqr0;
import xsna.dqr0;
import xsna.f4m;
import xsna.gda0;
import xsna.hz8;
import xsna.iah0;
import xsna.iyd0;
import xsna.iz8;
import xsna.kz8;
import xsna.msy;
import xsna.rxm;
import xsna.w8i;
import xsna.ypr0;

/* compiled from: VerticalizationPickerView.kt */
/* loaded from: classes6.dex */
public final class VerticalizationPickerView extends ConstraintLayout implements w8i {
    public final Object t;
    public final ViewPager2 u;
    public final RecyclerView v;
    public final dqr0 w;
    public final bqr0 x;
    public a y;
    public static final int z = iah0.a(64);
    public static final int A = iah0.a(8);

    /* compiled from: VerticalizationPickerView.kt */
    public interface a {
        void a();

        void b();

        void c(int i);
    }

    /* compiled from: VerticalizationPickerView.kt */
    public final class b extends ViewPager2.g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            super.onPageSelected(i);
            a aVar = VerticalizationPickerView.this.y;
            if (aVar != null) {
                aVar.c(i);
            }
        }
    }

    public VerticalizationPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = msy.a(LazyThreadSafetyMode.NONE, new cqr0(this, 0));
        View.inflate(context, R.layout.layout_story_editor_verticalization_picker_view, this);
        setBackgroundColor(-16777216);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.picker_viewpager);
        this.u = viewPager2;
        ImageView imageView = (ImageView) findViewById(R.id.picker_button_cancel);
        ImageView imageView2 = (ImageView) findViewById(R.id.picker_button_apply);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.picker_recycler);
        this.v = recyclerView;
        dqr0 dqr0Var = new dqr0(new rxm(false));
        this.w = dqr0Var;
        bqr0 bqr0Var = new bqr0(new gda0(this, 25));
        this.x = bqr0Var;
        b bVar = new b();
        bwt0.i0(imageView, new iyd0(this, 15));
        bwt0.i0(imageView2, new b8j0(this, 12));
        viewPager2.setAdapter(dqr0Var);
        viewPager2.setOffscreenPageLimit(4);
        viewPager2.b(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(bqr0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kz8 getCadreUtil() {
        return (kz8) this.t.getValue();
    }

    public final void P4(iz8 iz8Var) {
        int i;
        hz8 c = getCadreUtil().c(iz8Var);
        ViewPager2 viewPager2 = this.u;
        viewPager2.getLayoutParams().height = iz8Var.b;
        f4m.t(an10.b(iz8Var.c), viewPager2);
        viewPager2.setOutlineProvider(c);
        viewPager2.setClipToOutline(true);
        int b2 = an10.b(iz8Var.d);
        int i2 = A;
        int i3 = z;
        if (b2 >= i3) {
            i = b2 - (i3 + i2);
            if (i < 0) {
                i = 0;
            }
        } else {
            i = b2 + i2;
        }
        f4m.q(i, this.v);
    }

    public final void setCallback(a aVar) {
        this.y = aVar;
    }

    public final void setItems(ypr0.c cVar) {
        ArrayList arrayList = cVar.a;
        this.w.submitList(arrayList);
        this.x.submitList(arrayList);
        ViewPager2 viewPager2 = this.u;
        int currentItem = viewPager2.getCurrentItem();
        int i = cVar.b;
        if (currentItem != i) {
            viewPager2.e(i, false);
        }
    }
}
