package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C0666a;
import io.appmetrica.analytics.screenshot.impl.C0669d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0669d f15346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0666a(C0669d c0669d) {
        super(0);
        this.f15346a = c0669d;
    }

    public static final void a(C0669d c0669d) {
        ((C0688x) c0669d.f15352b).a("AndroidApiScreenshotCaptor");
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C0669d c0669d = this.f15346a;
        return new Activity.ScreenCaptureCallback() { // from class: ef.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C0666a.a(C0669d.this);
            }
        };
    }
}
