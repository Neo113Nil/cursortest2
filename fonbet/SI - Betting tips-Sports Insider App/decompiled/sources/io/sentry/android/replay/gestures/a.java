package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.Window;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.l;
import io.sentry.android.replay.p;
import io.sentry.android.replay.q;
import io.sentry.android.replay.util.d;
import io.sentry.b6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final b6 f16036b;

    /* renamed from: c, reason: collision with root package name */
    public final ReplayIntegration f16037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b6 options, ReplayIntegration replayIntegration, Window.Callback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(options, "options");
        this.f16036b = options;
        this.f16037c = replayIntegration;
    }

    @Override // io.sentry.android.replay.util.d, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l lVar;
        if (motionEvent != null) {
            MotionEvent event = MotionEvent.obtainNoHistory(motionEvent);
            Intrinsics.checkNotNullExpressionValue(event, "obtainNoHistory(...)");
            try {
                ReplayIntegration replayIntegration = this.f16037c;
                Intrinsics.checkNotNullParameter(event, "event");
                if (replayIntegration.f15932k.get()) {
                    p pVar = replayIntegration.q;
                    if ((((q) pVar.f16068a) == q.STARTED || ((q) pVar.f16068a) == q.RESUMED) && (lVar = replayIntegration.f15934m) != null) {
                        lVar.a(event);
                    }
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
