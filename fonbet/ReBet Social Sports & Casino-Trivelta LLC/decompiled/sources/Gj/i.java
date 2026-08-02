package Gj;

import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final t f4233a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f4234b;

    /* renamed from: c, reason: collision with root package name */
    public final n f4235c;

    public i(t oreoChecker, AudioManager audioManager, n requestFactory) {
        Intrinsics.checkNotNullParameter(oreoChecker, "oreoChecker");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        this.f4233a = oreoChecker;
        this.f4234b = audioManager;
        this.f4235c = requestFactory;
    }

    public final f a() {
        return this.f4233a.a() ? new l(this.f4234b, this.f4235c) : new h(this.f4234b);
    }
}
