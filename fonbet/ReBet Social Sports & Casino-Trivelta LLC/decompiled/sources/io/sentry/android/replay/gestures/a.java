package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4765j0;
import io.sentry.android.replay.e;
import io.sentry.android.replay.util.g;
import io.sentry.android.replay.z;
import io.sentry.util.C4843a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f51603a;

    /* renamed from: b, reason: collision with root package name */
    public final c f51604b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f51605c;

    /* renamed from: d, reason: collision with root package name */
    public final C4843a f51606d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f51607e;

    /* renamed from: f, reason: collision with root package name */
    public final C4843a f51608f;

    /* renamed from: io.sentry.android.replay.gestures.a$a, reason: collision with other inner class name */
    public static final class C0758a extends g {

        /* renamed from: b, reason: collision with root package name */
        public final F3 f51609b;

        /* renamed from: c, reason: collision with root package name */
        public volatile c f51610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0758a(F3 options, c cVar, Window.Callback callback) {
            super(callback);
            Intrinsics.checkNotNullParameter(options, "options");
            this.f51609b = options;
            this.f51610c = cVar;
        }

        public final void a() {
            this.f51610c = null;
        }

        @Override // io.sentry.android.replay.util.g, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                Intrinsics.checkNotNullExpressionValue(obtainNoHistory, "obtainNoHistory(...)");
                try {
                    c cVar = this.f51610c;
                    if (cVar != null) {
                        cVar.d(obtainNoHistory);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f51611d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(1);
            this.f51611d = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.get(), this.f51611d));
        }
    }

    public a(F3 options, c touchRecorderCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(touchRecorderCallback, "touchRecorderCallback");
        this.f51603a = options;
        this.f51604b = touchRecorderCallback;
        this.f51605c = new ArrayList();
        this.f51606d = new C4843a();
        this.f51607e = new WeakHashMap();
        this.f51608f = new C4843a();
    }

    public final void a(View view) {
        Window a10 = z.a(view);
        if (a10 == null) {
            this.f51603a.getLogger().c(EnumC4788n3.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        InterfaceC4765j0 d10 = this.f51608f.d();
        try {
            WeakReference weakReference = (WeakReference) this.f51607e.get(a10);
            if ((weakReference != null ? (C0758a) weakReference.get() : null) != null) {
                AutoCloseableKt.closeFinally(d10, null);
                return;
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(d10, null);
            C0758a c0758a = new C0758a(this.f51603a, this.f51604b, a10.getCallback());
            a10.setCallback(c0758a);
            d10 = this.f51608f.d();
            try {
                this.f51607e.put(a10, new WeakReference(c0758a));
                AutoCloseableKt.closeFinally(d10, null);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final void b() {
        InterfaceC4765j0 d10 = this.f51606d.d();
        try {
            Iterator it = this.f51605c.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    Intrinsics.checkNotNull(view);
                    c(view);
                }
            }
            this.f51605c.clear();
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(d10, null);
        } finally {
        }
    }

    public final void c(View view) {
        InterfaceC4765j0 d10;
        Window a10 = z.a(view);
        if (a10 == null) {
            this.f51603a.getLogger().c(EnumC4788n3.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = a10.getCallback();
        if (callback instanceof C0758a) {
            a10.setCallback(((C0758a) callback).f51767a);
            d10 = this.f51608f.d();
            try {
                AutoCloseableKt.closeFinally(d10, null);
                return;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        d10 = this.f51608f.d();
        try {
            WeakReference weakReference = (WeakReference) this.f51607e.get(a10);
            C0758a c0758a = weakReference != null ? (C0758a) weakReference.get() : null;
            AutoCloseableKt.closeFinally(d10, null);
            if (c0758a != null) {
                c0758a.a();
            }
        } catch (Throwable th2) {
        }
    }

    @Override // io.sentry.android.replay.e
    public void d(View root, boolean z10) {
        Intrinsics.checkNotNullParameter(root, "root");
        InterfaceC4765j0 d10 = this.f51606d.d();
        try {
            if (z10) {
                this.f51605c.add(new WeakReference(root));
                a(root);
                Unit unit = Unit.INSTANCE;
            } else {
                c(root);
                CollectionsKt.removeAll((List) this.f51605c, (Function1) new b(root));
            }
            AutoCloseableKt.closeFinally(d10, null);
        } finally {
        }
    }
}
