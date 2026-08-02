package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167g2 implements InterfaceC0313lk, ApplicationStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f13800a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f13801b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f13802c = ApplicationState.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f13803d = new CopyOnWriteArraySet();

    public final void a(int i5) {
        this.f13800a.remove(Integer.valueOf(i5));
        a();
    }

    public final void b(int i5) {
        this.f13801b.add(Integer.valueOf(i5));
        this.f13800a.remove(Integer.valueOf(i5));
        a();
    }

    public final void c(int i5) {
        this.f13800a.add(Integer.valueOf(i5));
        this.f13801b.remove(Integer.valueOf(i5));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.f13802c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0313lk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0313lk
    public final void onDestroy() {
        if (this.f13802c == ApplicationState.VISIBLE) {
            this.f13802c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f13803d.add(applicationStateObserver);
        }
        return this.f13802c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f13800a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f13801b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f13802c != applicationState) {
            this.f13802c = applicationState;
            Iterator it = this.f13803d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f13802c);
            }
        }
    }
}
