package com.inmobi.media;

import android.view.View;
import android.widget.ImageView;
import defpackage.wyb;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.lh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3577lh {
    public static void a(C3525jh c3525jh, Function1 function1) {
        c3525jh.getClass();
        function1.getClass();
        c3525jh.a.getParentView().setOnClickListener(new wyb(1, function1));
        View titleView = c3525jh.a.getTitleView();
        if (titleView != null) {
            titleView.setOnClickListener(new wyb(2, function1));
        }
        View descriptionView = c3525jh.a.getDescriptionView();
        if (descriptionView != null) {
            descriptionView.setOnClickListener(new wyb(3, function1));
        }
        ImageView iconView = c3525jh.a.getIconView();
        if (iconView != null) {
            iconView.setOnClickListener(new wyb(4, function1));
        }
        View ctaView = c3525jh.a.getCtaView();
        if (ctaView != null) {
            ctaView.setOnClickListener(new wyb(5, function1));
        }
        View advertiserView = c3525jh.a.getAdvertiserView();
        if (advertiserView != null) {
            advertiserView.setOnClickListener(new wyb(6, function1));
        }
        View ratingView = c3525jh.a.getRatingView();
        if (ratingView != null) {
            ratingView.setOnClickListener(new wyb(7, function1));
        }
        View view = c3525jh.c;
        if (view != null) {
            view.setOnClickListener(new wyb(8, function1));
        }
    }

    public static final void b(Function1 function1, View view) {
        function1.invoke((short) 3);
    }

    public static final void c(Function1 function1, View view) {
        function1.invoke((short) 4);
    }

    public static final void d(Function1 function1, View view) {
        function1.invoke((short) 5);
    }

    public static final void e(Function1 function1, View view) {
        function1.invoke((short) 6);
    }

    public static final void f(Function1 function1, View view) {
        function1.invoke((short) 9);
    }

    public static final void g(Function1 function1, View view) {
        function1.invoke((short) 8);
    }

    public static final void h(Function1 function1, View view) {
        function1.invoke((short) 7);
    }

    public static final void a(Function1 function1, View view) {
        function1.invoke((short) 2);
    }
}
