package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class s2 {
    public TextView a;
    public TextView b;
    public ImageView c;
    public ImageView d;
    private t2 e;
    private int f;

    public void a(int i) {
        this.f = i;
    }

    public t2 b() {
        return this.e;
    }

    public int a() {
        return this.f;
    }

    public void a(t2 t2Var) {
        this.e = t2Var;
        this.a.setText(t2Var.k());
        this.a.setTextColor(t2Var.l());
        if (this.b != null) {
            if (!TextUtils.isEmpty(t2Var.f())) {
                this.b.setTypeface(null, 0);
                this.b.setVisibility(0);
                this.b.setText(t2Var.f());
                this.b.setTextColor(t2Var.g());
                if (t2Var.p()) {
                    this.b.setTypeface(null, 1);
                }
            } else {
                this.b.setVisibility(8);
            }
        }
        if (this.c != null) {
            if (t2Var.h() > 0) {
                this.c.setImageResource(t2Var.h());
                this.c.setColorFilter(t2Var.i());
                this.c.setVisibility(0);
            } else {
                this.c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (t2Var.d() > 0) {
                this.d.setImageResource(t2Var.d());
                this.d.setColorFilter(t2Var.e());
                this.d.setVisibility(0);
                return;
            }
            this.d.setVisibility(8);
        }
    }
}
