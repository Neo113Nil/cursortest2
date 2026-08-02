package com.vk.common.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import com.vk.common.view.DotsIndicatorView;

/* compiled from: DotsIndicatorSwipeDetector.kt */
/* loaded from: classes17.dex */
public final class a {
    public final DotsIndicatorView.b a;
    public boolean b;
    public boolean c;
    public int d;
    public int e = -1;
    public float f;
    public float g;
    public final int h;
    public int i;
    public int j;
    public int k;
    public final GestureDetector l;

    public a(Context context, DotsIndicatorView.b bVar) {
        this.a = bVar;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.h = scaledTouchSlop * scaledTouchSlop;
        this.i = 1;
        this.l = new GestureDetector(context, new b(this));
    }

    /* compiled from: DotsIndicatorSwipeDetector.kt */
    /* renamed from: com.vk.common.view.a$a, reason: collision with other inner class name */
    public interface InterfaceC0720a {
        default void a() {
        }

        default void c() {
        }

        default void d() {
        }

        default void b(int i) {
        }
    }
}
