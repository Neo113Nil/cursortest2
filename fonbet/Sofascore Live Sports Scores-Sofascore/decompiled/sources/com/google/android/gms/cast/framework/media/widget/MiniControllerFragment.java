package com.google.android.gms.cast.framework.media.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzcu;
import com.google.android.gms.internal.cast.zzcv;
import com.google.android.gms.internal.cast.zzda;
import com.google.android.gms.internal.cast.zzdb;
import com.google.android.gms.internal.cast.zzde;
import com.google.android.gms.internal.cast.zzdg;
import com.google.android.gms.internal.cast.zzdi;
import com.google.android.gms.internal.cast.zzdj;
import com.google.android.gms.internal.cast.zzdm;
import com.google.android.gms.internal.cast.zzdn;
import com.google.android.gms.internal.cast.zzdo;
import com.google.android.gms.internal.cast.zzdt;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzr;
import com.sofascore.results.R;
import defpackage.cln;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MiniControllerFragment extends Fragment implements ControlButtonsContainer {
    public Logger a;
    public boolean b;
    public int c;
    public int d;
    public TextView e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int[] j;
    public final ImageView[] k = new ImageView[3];
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public UIMediaController y;

    public final void j(UIMediaController uIMediaController, RelativeLayout relativeLayout, int i, int i2) {
        Activity activity = uIMediaController.a;
        com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar = uIMediaController.e;
        ImageView imageView = (ImageView) relativeLayout.findViewById(i);
        int i3 = this.j[i2];
        if (i3 == R.id.cast_button_type_empty) {
            imageView.setVisibility(4);
            return;
        }
        if (i3 == R.id.cast_button_type_custom) {
            return;
        }
        if (i3 == R.id.cast_button_type_play_pause_toggle) {
            int i4 = this.m;
            int i5 = this.n;
            int i6 = this.o;
            if (this.l == 1) {
                i4 = this.p;
                i5 = this.q;
                i6 = this.r;
            }
            Drawable a = zzo.a(getContext(), this.i, i4);
            Drawable a2 = zzo.a(getContext(), this.i, i5);
            Drawable a3 = zzo.a(getContext(), this.i, i6);
            imageView.setImageDrawable(a2);
            ProgressBar progressBar = new ProgressBar(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(8, i);
            layoutParams.addRule(6, i);
            layoutParams.addRule(5, i);
            layoutParams.addRule(7, i);
            layoutParams.addRule(15);
            progressBar.setLayoutParams(layoutParams);
            progressBar.setVisibility(8);
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            int i7 = this.h;
            if (i7 != 0 && indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
            }
            relativeLayout.addView(progressBar);
            uIMediaController.p(imageView, a, a2, a3, progressBar, true);
            return;
        }
        if (i3 == R.id.cast_button_type_skip_previous) {
            imageView.setImageDrawable(zzo.a(getContext(), this.i, this.s));
            imageView.setContentDescription(getResources().getString(R.string.cast_skip_prev));
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 3));
            uIMediaController.t(imageView, new zzdn(imageView));
            return;
        }
        if (i3 == R.id.cast_button_type_skip_next) {
            imageView.setImageDrawable(zzo.a(getContext(), this.i, this.t));
            imageView.setContentDescription(getResources().getString(R.string.cast_skip_next));
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 2));
            uIMediaController.t(imageView, new zzdm(imageView));
            return;
        }
        if (i3 == R.id.cast_button_type_rewind_30_seconds) {
            imageView.setImageDrawable(zzo.a(getContext(), this.i, this.u));
            imageView.setContentDescription(getResources().getString(R.string.cast_rewind_30));
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 5));
            uIMediaController.t(imageView, new zzdj(imageView, zzaVar));
            return;
        }
        if (i3 == R.id.cast_button_type_forward_30_seconds) {
            imageView.setImageDrawable(zzo.a(getContext(), this.i, this.v));
            imageView.setContentDescription(getResources().getString(R.string.cast_forward_30));
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 4));
            uIMediaController.t(imageView, new zzcv(imageView, zzaVar));
            return;
        }
        if (i3 == R.id.cast_button_type_mute_toggle) {
            imageView.setImageDrawable(zzo.a(getContext(), this.i, this.w));
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 0));
            uIMediaController.t(imageView, new zzdg(imageView, activity));
            return;
        }
        if (i3 == R.id.cast_button_type_closed_caption) {
            imageView.setImageDrawable(zzo.a(getContext(), this.i, this.x));
            Preconditions.e("Must be called from the main thread.");
            imageView.setOnClickListener(new cln(uIMediaController, 7));
            uIMediaController.t(imageView, new zzcu(imageView, activity));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = new Logger("MiniControllerFragment", null);
        UIMediaController uIMediaController = new UIMediaController(getActivity());
        this.y = uIMediaController;
        View inflate = layoutInflater.inflate(R.layout.cast_mini_controller, viewGroup, false);
        inflate.setVisibility(8);
        Preconditions.e("Must be called from the main thread.");
        uIMediaController.t(inflate, new zzdt(inflate));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.container_current);
        int i = this.f;
        if (i != 0) {
            relativeLayout.setBackgroundResource(i);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon_view);
        TextView textView = (TextView) inflate.findViewById(R.id.title_view);
        if (this.c != 0) {
            textView.setTextAppearance(getActivity(), this.c);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.subtitle_view);
        this.e = textView2;
        if (this.d != 0) {
            textView2.setTextAppearance(getActivity(), this.d);
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progressBar);
        if (this.g != 0) {
            ((LayerDrawable) progressBar.getProgressDrawable()).setColorFilter(this.g, PorterDuff.Mode.SRC_IN);
        }
        Preconditions.e("Must be called from the main thread.");
        List singletonList = Collections.singletonList("com.google.android.gms.cast.metadata.TITLE");
        Preconditions.e("Must be called from the main thread.");
        uIMediaController.t(textView, new zzde(textView, singletonList));
        TextView textView3 = this.e;
        Preconditions.e("Must be called from the main thread.");
        uIMediaController.t(textView3, new zzdo(textView3));
        Preconditions.e("Must be called from the main thread.");
        uIMediaController.t(progressBar, new zzdi(progressBar));
        Preconditions.e("Must be called from the main thread.");
        relativeLayout.setOnClickListener(new cln(uIMediaController, 6));
        uIMediaController.t(relativeLayout, new zzdb(relativeLayout));
        if (this.b) {
            ImageHints imageHints = new ImageHints(2, getResources().getDimensionPixelSize(R.dimen.cast_mini_controller_icon_width), getResources().getDimensionPixelSize(R.dimen.cast_mini_controller_icon_height));
            Preconditions.e("Must be called from the main thread.");
            uIMediaController.t(imageView, new zzda(imageView, uIMediaController.a, imageHints, R.drawable.cast_album_art_placeholder, null, null));
        } else {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = (ImageView) relativeLayout.findViewById(R.id.button_0);
        ImageView[] imageViewArr = this.k;
        imageViewArr[0] = imageView2;
        imageViewArr[1] = (ImageView) relativeLayout.findViewById(R.id.button_1);
        imageViewArr[2] = (ImageView) relativeLayout.findViewById(R.id.button_2);
        j(uIMediaController, relativeLayout, R.id.button_0, 0);
        j(uIMediaController, relativeLayout, R.id.button_1, 1);
        j(uIMediaController, relativeLayout, R.id.button_2, 2);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        UIMediaController uIMediaController = this.y;
        if (uIMediaController != null) {
            Preconditions.e("Must be called from the main thread.");
            uIMediaController.s();
            uIMediaController.c.clear();
            SessionManager sessionManager = uIMediaController.b;
            if (sessionManager != null) {
                sessionManager.e(uIMediaController);
            }
            uIMediaController.f = null;
            this.y = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        if (this.j == null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.gms.cast.framework.R.styleable.b, R.attr.castMiniControllerStyle, R.style.CastMiniController);
            this.b = obtainStyledAttributes.getBoolean(14, true);
            this.c = obtainStyledAttributes.getResourceId(19, 0);
            this.d = obtainStyledAttributes.getResourceId(18, 0);
            this.f = obtainStyledAttributes.getResourceId(0, 0);
            int color = obtainStyledAttributes.getColor(12, 0);
            this.g = color;
            this.h = obtainStyledAttributes.getColor(8, color);
            this.i = obtainStyledAttributes.getResourceId(1, 0);
            this.m = obtainStyledAttributes.getResourceId(11, 0);
            this.n = obtainStyledAttributes.getResourceId(10, 0);
            this.o = obtainStyledAttributes.getResourceId(17, 0);
            this.p = obtainStyledAttributes.getResourceId(11, 0);
            this.q = obtainStyledAttributes.getResourceId(10, 0);
            this.r = obtainStyledAttributes.getResourceId(17, 0);
            this.s = obtainStyledAttributes.getResourceId(16, 0);
            this.t = obtainStyledAttributes.getResourceId(15, 0);
            this.u = obtainStyledAttributes.getResourceId(13, 0);
            this.v = obtainStyledAttributes.getResourceId(4, 0);
            this.w = obtainStyledAttributes.getResourceId(9, 0);
            this.x = obtainStyledAttributes.getResourceId(2, 0);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                Preconditions.b(obtainTypedArray.length() == 3);
                this.j = new int[obtainTypedArray.length()];
                for (int i = 0; i < obtainTypedArray.length(); i++) {
                    this.j[i] = obtainTypedArray.getResourceId(i, 0);
                }
                obtainTypedArray.recycle();
                if (this.b) {
                    this.j[0] = R.id.cast_button_type_empty;
                }
                this.l = 0;
                for (int i2 : this.j) {
                    if (i2 != R.id.cast_button_type_empty) {
                        this.l++;
                    }
                }
            } else {
                Logger logger = this.a;
                if (logger != null) {
                    logger.c("Unable to read attribute castControlButtons.", new Object[0]);
                }
                this.j = new int[]{R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty};
            }
            obtainStyledAttributes.recycle();
        }
        zzr.a(zzpm.CAF_MINI_CONTROLLER);
    }
}
