package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.RelativeLayout;
import com.inmobi.media.C3652oe;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b1d;
import defpackage.ku3;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.oe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3652oe {
    public final RelativeLayout a;
    public final ku3 b;
    public final MediaPlayer c;
    public final C3687pn d;
    public final b1d e;
    public final U1 f;
    public final RelativeLayout g;
    public final float h;
    public boolean i;
    public final C3720r5 j;
    public final C3720r5 k;
    public final An l;

    public C3652oe(RelativeLayout relativeLayout, ku3 ku3Var, MediaPlayer mediaPlayer, C3687pn c3687pn, b1d b1dVar) {
        relativeLayout.getClass();
        ku3Var.getClass();
        mediaPlayer.getClass();
        c3687pn.getClass();
        b1dVar.getClass();
        this.a = relativeLayout;
        this.b = ku3Var;
        this.c = mediaPlayer;
        this.d = c3687pn;
        this.e = b1dVar;
        Context context = relativeLayout.getContext();
        context.getClass();
        U1 u1 = new U1(context);
        this.f = u1;
        RelativeLayout relativeLayout2 = new RelativeLayout(relativeLayout.getContext());
        this.g = relativeLayout2;
        this.h = R5.b();
        this.l = new An(ku3Var, relativeLayout2, c3687pn.c, b1dVar);
        u1.c = new WeakReference(new C3522je(this));
        Context context2 = relativeLayout2.getContext();
        context2.getClass();
        this.j = new C3720r5(context2, (byte) 9, null);
        Context context3 = relativeLayout2.getContext();
        context3.getClass();
        this.k = new C3720r5(context3, (byte) 10, null);
        b();
        relativeLayout2.setWillNotDraw(true);
        relativeLayout2.setBackgroundColor(0);
        AbstractC3713qn.a(mediaPlayer, u1);
    }

    public final void a(C3720r5 c3720r5, C3720r5 c3720r52) {
        if (Intrinsics.c(c3720r5.getParent(), this.g)) {
            return;
        }
        this.g.removeView(c3720r52);
        S1 s1 = this.d.d;
        float f = this.h;
        s1.getClass();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (s1.b * f), (int) (s1.c * f));
        int i = s1.e;
        if (i == 0) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(10, -1);
        } else if (i == 1) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(10, -1);
        } else if (i == 2) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(12, -1);
        } else if (i == 3) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(12, -1);
        }
        C3572lc c3572lc = s1.d;
        layoutParams.leftMargin = (int) (c3572lc.a * f);
        layoutParams.topMargin = (int) (c3572lc.b * f);
        layoutParams.rightMargin = (int) (c3572lc.c * f);
        layoutParams.bottomMargin = (int) (c3572lc.d * f);
        c3720r5.setLayoutParams(layoutParams);
        this.g.addView(c3720r5);
    }

    public final void b() {
        final int i = 0;
        this.j.setOnClickListener(new View.OnClickListener(this) { // from class: xrm
            public final /* synthetic */ C3652oe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                C3652oe c3652oe = this.b;
                switch (i2) {
                    case 0:
                        C3652oe.a(c3652oe, view);
                        break;
                    default:
                        C3652oe.b(c3652oe, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.k.setOnClickListener(new View.OnClickListener(this) { // from class: xrm
            public final /* synthetic */ C3652oe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                C3652oe c3652oe = this.b;
                switch (i22) {
                    case 0:
                        C3652oe.a(c3652oe, view);
                        break;
                    default:
                        C3652oe.b(c3652oe, view);
                        break;
                }
            }
        });
    }

    public static final void b(C3652oe c3652oe, View view) {
        c3652oe.a();
        c3652oe.f.a();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.c;
        mediaPlayer.getClass();
        try {
            mediaPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (IllegalStateException unused) {
        }
        a(this.j, this.k);
        X4.a(this.e, this.b, new W1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true));
        this.i = true;
    }

    public static final void a(C3652oe c3652oe, View view) {
        X4.a(c3652oe.b, new C3626ne(c3652oe, null));
    }
}
