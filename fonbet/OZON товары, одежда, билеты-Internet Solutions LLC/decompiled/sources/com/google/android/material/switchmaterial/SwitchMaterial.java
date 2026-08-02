package com.google.android.material.switchmaterial;

import B7.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import i7.C7017a;
import n7.C8448a;
import q7.C8995a;
import s7.C9619n;
import s7.C9621p;

/* loaded from: classes9.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: v0, reason: collision with root package name */
    private static final int[][] f58517v0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: r0, reason: collision with root package name */
    @NonNull
    private final C8995a f58518r0;

    /* renamed from: s0, reason: collision with root package name */
    private ColorStateList f58519s0;

    /* renamed from: t0, reason: collision with root package name */
    private ColorStateList f58520t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f58521u0;

    public SwitchMaterial(@NonNull Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, ru.ozon.app.android.R.attr.switchStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, 0);
        Context context2 = getContext();
        this.f58518r0 = new C8995a(context2);
        TypedArray e11 = C9619n.e(context2, attributeSet, C7017a.f65929M, ru.ozon.app.android.R.attr.switchStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        this.f58521u0 = e11.getBoolean(0, false);
        e11.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int[][] iArr = f58517v0;
        boolean z11 = this.f58521u0;
        if (z11 && f() == null) {
            if (this.f58519s0 == null) {
                int b11 = C8448a.b(ru.ozon.app.android.R.attr.colorSurface, this);
                int b12 = C8448a.b(ru.ozon.app.android.R.attr.colorControlActivated, this);
                float dimension = getResources().getDimension(ru.ozon.app.android.R.dimen.mtrl_switch_thumb_elevation);
                C8995a c8995a = this.f58518r0;
                if (c8995a.c()) {
                    dimension += C9621p.c(this);
                }
                int a11 = c8995a.a(dimension, b11);
                this.f58519s0 = new ColorStateList(iArr, new int[]{C8448a.d(1.0f, b11, b12), a11, C8448a.d(0.38f, b11, b12), a11});
            }
            n(this.f58519s0);
        }
        if (z11 && g() == null) {
            if (this.f58520t0 == null) {
                int b13 = C8448a.b(ru.ozon.app.android.R.attr.colorSurface, this);
                int b14 = C8448a.b(ru.ozon.app.android.R.attr.colorControlActivated, this);
                int b15 = C8448a.b(ru.ozon.app.android.R.attr.colorOnSurface, this);
                this.f58520t0 = new ColorStateList(iArr, new int[]{C8448a.d(0.54f, b13, b14), C8448a.d(0.32f, b13, b15), C8448a.d(0.12f, b13, b14), C8448a.d(0.12f, b13, b15)});
            }
            o(this.f58520t0);
        }
    }
}
