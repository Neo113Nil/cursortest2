package com.vk.stories.design.view.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.camera.editor.common.text.views.SnapScrollRecyclerView;
import com.vk.stories.design.view.text.TextStyleFontPicker;
import com.vkontakte.android.R;
import xsna.hmo0;
import xsna.i68;
import xsna.izs;
import xsna.s3q0;
import xsna.smo0;
import xsna.t5s;
import xsna.tf3;
import xsna.xvl0;

/* compiled from: TextStyleFontPicker.kt */
/* loaded from: classes6.dex */
public final class TextStyleFontPicker extends FrameLayout {
    public static final /* synthetic */ int g = 0;
    public final t5s[] b;
    public final SnapScrollRecyclerView c;
    public izs<? super t5s, s3q0> d;
    public t5s e;
    public int f;

    /* compiled from: TextStyleFontPicker.kt */
    public final class a extends RecyclerView.Adapter<b> {
        public final xvl0 c;

        public a(xvl0 xvl0Var) {
            this.c = xvl0Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return TextStyleFontPicker.this.b.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            bVar.l.setImageResource(((hmo0.m) TextStyleFontPicker.this.b[i]).j());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new b(tf3.b(viewGroup, R.layout.item_font_picker, viewGroup, false), this.c);
        }
    }

    /* compiled from: TextStyleFontPicker.kt */
    public static final class b extends RecyclerView.e0 {
        public final ImageView l;

        public b(View view, xvl0 xvl0Var) {
            super(view);
            this.l = (ImageView) this.itemView.findViewById(R.id.font_example);
            this.itemView.setOnClickListener(new i68(5, this, xvl0Var));
        }
    }

    public TextStyleFontPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        t5s[] t5sVarArr = hmo0.c;
        this.b = t5sVarArr;
        this.e = t5sVarArr[0];
        LayoutInflater.from(context).inflate(R.layout.view_style_picker, this);
        SnapScrollRecyclerView snapScrollRecyclerView = (SnapScrollRecyclerView) findViewById(R.id.font_list);
        this.c = snapScrollRecyclerView;
        snapScrollRecyclerView.setAdapter(new a(new xvl0(this, 6)));
        snapScrollRecyclerView.setOnSnapPositionChangeListener(new smo0(this));
        snapScrollRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.rmo0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = TextStyleFontPicker.g;
                int b2 = ((i3 - i) / 2) - cn70.b(24);
                TextStyleFontPicker.this.c.setPadding(b2, 0, b2, 0);
            }
        });
    }

    public final t5s getCurrentFontStyle() {
        return this.e;
    }

    public final int getCurrentFontStylePosition() {
        return this.f;
    }

    public final izs<t5s, s3q0> getOnSnapPositionFontStyle() {
        return this.d;
    }

    public final void setCurrentFontStyle(t5s t5sVar) {
        this.e = t5sVar;
    }

    public final void setCurrentFontStylePosition(int i) {
        this.f = i;
    }

    public final void setCurrentTextFont(int i) {
        SnapScrollRecyclerView snapScrollRecyclerView = this.c;
        snapScrollRecyclerView.e = false;
        RecyclerView.o layoutManager = snapScrollRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.smoothScrollToPosition(snapScrollRecyclerView, null, i);
        }
        this.f = i;
        if (i >= 0) {
            t5s[] t5sVarArr = this.b;
            if (i < t5sVarArr.length) {
                this.e = t5sVarArr[i];
            }
        }
    }

    public final void setOnSnapPositionFontStyle(izs<? super t5s, s3q0> izsVar) {
        this.d = izsVar;
    }
}
