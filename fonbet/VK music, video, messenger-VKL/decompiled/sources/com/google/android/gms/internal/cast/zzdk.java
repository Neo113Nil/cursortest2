package com.google.android.gms.internal.cast;

import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzdk implements View.OnTouchListener {
    public zzdk(zzdl zzdlVar) {
        Objects.requireNonNull(zzdlVar);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }
}
