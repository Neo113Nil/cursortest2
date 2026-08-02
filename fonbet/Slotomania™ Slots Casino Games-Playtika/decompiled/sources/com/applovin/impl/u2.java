package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class u2 extends BaseAdapter implements View.OnClickListener {
    protected Context a;
    private List b = new ArrayList();
    private Map c = new HashMap();
    private a d;

    public interface a {
        void a(l2 l2Var, t2 t2Var);
    }

    protected u2(Context context) {
        this.a = context.getApplicationContext();
    }

    protected t2 a() {
        return null;
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t2 getItem(int i) {
        return (t2) this.b.get(i);
    }

    protected abstract List c(int i);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.u2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                u2.this.notifyDataSetChanged();
            }
        });
    }

    protected abstract int d(int i);

    protected abstract t2 e(int i);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        s2 s2Var;
        t2 item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            s2Var = new s2();
            s2Var.a = (TextView) view.findViewById(R.id.text1);
            s2Var.b = (TextView) view.findViewById(R.id.text2);
            s2Var.c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            s2Var.d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(s2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            s2Var = (s2) view.getTag();
        }
        s2Var.a(i);
        s2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return t2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i;
        this.b = new ArrayList();
        int b = b();
        this.c = new HashMap(b);
        t2 a2 = a();
        if (a2 != null) {
            this.b.add(a2);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < b; i2++) {
            int d = d(i2);
            if (d != 0) {
                this.b.add(e(i2));
                this.b.addAll(c(i2));
                this.c.put(Integer.valueOf(i2), Integer.valueOf(i));
                i += d + 1;
            }
        }
        this.b.add(new x4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        s2 s2Var = (s2) view.getTag();
        t2 b = s2Var.b();
        l2 a2 = a(s2Var.a());
        a aVar = this.d;
        if (aVar == null || a2 == null) {
            return;
        }
        aVar.a(a2, b);
    }

    private l2 a(int i) {
        for (int i2 = 0; i2 < b(); i2++) {
            Integer num = (Integer) this.c.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + d(i2)) {
                    return new l2(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.a.getColor(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
