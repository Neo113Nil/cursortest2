package io.sentry.react;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherListener;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.android.core.C4683i0;

/* loaded from: classes3.dex */
public class y extends FragmentManager.k {

    /* renamed from: a, reason: collision with root package name */
    public final C4683i0 f52624a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f52625b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f52626c;

    public class a implements EventDispatcherListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EventDispatcher f52627a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f52628b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Runnable f52629c;

        public a(EventDispatcher eventDispatcher, View view, Runnable runnable) {
            this.f52627a = eventDispatcher;
            this.f52628b = view;
            this.f52629c = runnable;
        }

        @Override // com.facebook.react.uimanager.events.EventDispatcherListener
        public void onEventDispatch(Event event) {
            if ("Mc.f".equals(event.getClass().getCanonicalName())) {
                this.f52627a.removeListener(this);
                io.sentry.android.core.internal.util.r.d(this.f52628b, this.f52629c, y.this.f52624a);
            }
        }
    }

    public y(C4683i0 c4683i0, Runnable runnable, ILogger iLogger) {
        this.f52624a = c4683i0;
        this.f52625b = runnable;
        this.f52626c = iLogger;
    }

    public static EventDispatcher p(View view, int i10) {
        return UIManagerHelper.getEventDispatcherForReactTag(UIManagerHelper.getReactContext(view), i10);
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (!"com.swmansion.rnscreens.Y".equals(fragment.getClass().getCanonicalName())) {
            this.f52626c.c(EnumC4788n3.DEBUG, "Fragment is not a ScreenStackFragment, won't listen for the first draw.", new Object[0]);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            this.f52626c.c(EnumC4788n3.WARNING, "Fragment view is not a ViewGroup, won't listen for the first draw.", new Object[0]);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            this.f52626c.c(EnumC4788n3.WARNING, "Fragment view has no children, won't listen for the first draw.", new Object[0]);
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null || !(childAt.getContext() instanceof ReactContext)) {
            this.f52626c.c(EnumC4788n3.WARNING, "Fragment view has no ReactContext, won't listen for the first draw.", new Object[0]);
            return;
        }
        int id2 = childAt.getId();
        if (id2 == -1) {
            this.f52626c.c(EnumC4788n3.WARNING, "Screen has no id, won't listen for the first draw.", new Object[0]);
            return;
        }
        EventDispatcher p10 = p(childAt, id2);
        if (p10 == null) {
            this.f52626c.c(EnumC4788n3.WARNING, "Screen has no event dispatcher, won't listen for the first draw.", new Object[0]);
        } else {
            p10.addListener(new a(p10, view, this.f52625b));
        }
    }
}
