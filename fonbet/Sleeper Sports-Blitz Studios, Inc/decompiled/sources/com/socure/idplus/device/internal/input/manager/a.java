package com.socure.idplus.device.internal.input.manager;

import android.R;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.socure.idplus.device.internal.input.c;
import com.socure.idplus.device.internal.input.d;
import com.socure.idplus.device.internal.input.e;
import com.socure.idplus.device.internal.input.h;
import com.socure.idplus.device.internal.input.i;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class a implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f862a;
    public final e b;
    public final h c;
    public final c d;
    public final d e;
    public final com.socure.idplus.device.internal.input.manager.monitor.a f;
    public final List g;

    public a(Context context, com.socure.idplus.device.internal.thread.c socureThread) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(socureThread, "socureThread");
        this.f862a = context;
        this.b = new e(socureThread);
        this.c = new h(socureThread);
        c cVar = new c(socureThread);
        this.d = cVar;
        d dVar = new d(socureThread);
        this.e = dVar;
        com.socure.idplus.device.internal.input.manager.monitor.a aVar = new com.socure.idplus.device.internal.input.manager.monitor.a();
        this.f = aVar;
        this.g = CollectionsKt.mutableListOf(new com.socure.idplus.device.internal.input.manager.view.b(context, cVar, dVar, aVar));
        a();
    }

    public final void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        com.socure.idplus.device.internal.logger.b.a("SocureInputHandler", "Adding Window " + window);
        Window.Callback callback = window.getCallback();
        if (callback instanceof i) {
            return;
        }
        window.setCallback(new i(callback, this.c, this.b, this.f));
        ViewGroup viewGroup = (ViewGroup) window.getDecorView().findViewById(R.id.content);
        if (viewGroup == null) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        a(viewGroup, true);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(viewGroup);
        }
    }

    public final void b(Window window) {
        Window.Callback a2;
        Intrinsics.checkNotNullParameter(window, "window");
        com.socure.idplus.device.internal.logger.b.a("SocureInputHandler", "Removing Window " + window);
        Window.Callback callback = window.getCallback();
        if ((callback instanceof i) && (a2 = ((i) callback).a()) != null) {
            window.setCallback(a2);
        }
        ViewGroup viewGroup = (ViewGroup) window.getDecorView().findViewById(R.id.content);
        if (viewGroup == null) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        a(viewGroup, false);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(viewGroup);
        }
    }

    public final void c() {
        Intrinsics.checkNotNullParameter("SocureInputHandler", "tag");
        Intrinsics.checkNotNullParameter("Stopping producers", "msg");
        int ordinal = com.socure.idplus.device.internal.logger.a.f870a.ordinal();
        if (ordinal == 0) {
            Log.e("SocureInputHandler", "Stopping producers");
        } else if (ordinal == 1) {
            Log.i("SocureInputHandler", "Stopping producers");
        }
        this.b.c = false;
        this.c.c = false;
        this.d.c = false;
        this.e.c = false;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        a(view2, true);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        a(view2, false);
    }

    public final void a() {
        if (com.socure.idplus.device.internal.common.utils.a.a()) {
            this.g.add(new com.socure.idplus.device.internal.input.manager.compose.d(this.f862a, this.d, this.e, this.f));
        }
    }

    public final void b() {
        Intrinsics.checkNotNullParameter("SocureInputHandler", "tag");
        Intrinsics.checkNotNullParameter("Starting producers", "msg");
        int ordinal = com.socure.idplus.device.internal.logger.a.f870a.ordinal();
        if (ordinal == 0) {
            Log.e("SocureInputHandler", "Starting producers");
        } else if (ordinal == 1) {
            Log.i("SocureInputHandler", "Starting producers");
        }
        this.b.c = true;
        this.c.c = true;
        this.d.c = true;
        this.e.c = true;
    }

    public final void a(View view, boolean z) {
        if (view == null) {
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(view, z);
        }
        if (view instanceof ViewGroup) {
            a((ViewGroup) view, z);
        }
    }

    public final void a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        if (z) {
            viewGroup.setOnHierarchyChangeListener(this);
        }
        for (int i = 0; i < childCount; i++) {
            a(viewGroup.getChildAt(i), z);
        }
    }
}
