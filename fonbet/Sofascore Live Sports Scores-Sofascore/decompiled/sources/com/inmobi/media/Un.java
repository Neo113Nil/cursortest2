package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Un {
    public static final boolean a(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (Intrinsics.c(parent, viewGroup)) {
                return true;
            }
            parent = parent instanceof ViewGroup ? ((ViewGroup) parent).getParent() : null;
        }
        return false;
    }

    public static final boolean b(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (view.isAttachedToWindow()) {
            return a(view, viewGroup);
        }
        return false;
    }

    public static final void a(ProgressBar progressBar, int i) {
        progressBar.getClass();
        progressBar.setProgress(i, true);
    }

    public static final void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
