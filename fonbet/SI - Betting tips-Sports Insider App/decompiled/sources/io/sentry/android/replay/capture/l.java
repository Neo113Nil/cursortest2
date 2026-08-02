package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import androidx.fragment.app.r;
import io.sentry.android.replay.v;
import io.sentry.c6;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface l {
    void a(MotionEvent motionEvent);

    void b(v vVar);

    void c();

    l d();

    void e(int i5, io.sentry.protocol.v vVar, c6 c6Var);

    void f(boolean z5, r rVar);

    void g(io.sentry.android.replay.m mVar);

    void stop();
}
