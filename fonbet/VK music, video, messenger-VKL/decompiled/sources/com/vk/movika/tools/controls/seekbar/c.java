package com.vk.movika.tools.controls.seekbar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import xsna.aly;
import xsna.izi0;
import xsna.kly;

/* loaded from: classes3.dex */
public final class c {
    public final a a;
    public final Object b;
    public final aly c;
    public final kly d;
    public final HashMap e;
    public final Set<View> f;
    public Integer g;
    public long h;

    public static final class a {
        public final ViewGroup a;
        public final FrameLayout b;

        public a(ViewGroup viewGroup, FrameLayout frameLayout) {
            this.a = viewGroup;
            this.b = frameLayout;
        }
    }

    public c(a aVar, Map map, aly alyVar, kly klyVar) {
        this.a = aVar;
        this.b = map;
        this.c = alyVar;
        this.d = klyVar;
        new ArrayList();
        this.e = new HashMap();
        this.f = izi0.m(null, null, null, aVar.a, null, aVar.b);
        SeekBarMiscUI$Mode seekBarMiscUI$Mode = SeekBarMiscUI$Mode.COMMON;
        FrameLayout frameLayout = aVar.b;
        if (frameLayout != null) {
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.vk.movika.tools.controls.seekbar.a
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Integer valueOf = Integer.valueOf(((i3 - i) - view.getPaddingStart()) - view.getPaddingEnd());
                    c cVar = c.this;
                    cVar.g = valueOf;
                    cVar.c();
                }
            });
        }
        a(seekBarMiscUI$Mode);
        this.h = 0L;
        c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void a(SeekBarMiscUI$Mode seekBarMiscUI$Mode) {
        Set<View> set = (Set) this.b.get(seekBarMiscUI$Mode);
        Set<View> set2 = this.f;
        if (set == null) {
            set = set2;
        }
        for (View view : set2) {
            view.setVisibility(set.contains(view) ? 0 : 8);
        }
    }

    public final void b(int i, long j, View view) {
        long j2 = this.h;
        if (j2 <= 0 || i == 0) {
            return;
        }
        view.setTranslationX(((j / j2) * i) - (view.getLayoutParams().width / 2));
    }

    public final void c() {
        Integer num;
        HashMap hashMap = this.e;
        if (hashMap.isEmpty() || this.h <= 0 || (num = this.g) == null) {
            return;
        }
        int intValue = num.intValue();
        for (Map.Entry entry : hashMap.entrySet()) {
            b(intValue, ((Number) entry.getKey()).longValue(), (View) entry.getValue());
        }
    }
}
