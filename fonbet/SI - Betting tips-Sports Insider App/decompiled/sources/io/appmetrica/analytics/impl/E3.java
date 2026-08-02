package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class E3 extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final Ze f12181a;

    public E3(@NotNull Ze ze2) {
        super(ze2.e(), "[ClientApiTrackingStatusToggle]");
        this.f12181a = ze2;
    }

    public final void a(boolean z5) {
        updateState(z5);
        this.f12181a.f(z5);
    }
}
