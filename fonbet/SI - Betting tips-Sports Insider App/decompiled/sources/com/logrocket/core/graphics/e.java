package com.logrocket.core.graphics;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.app.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f6529b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6530c;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f6528a = new io.sentry.internal.debugmeta.c(1);

    /* renamed from: d, reason: collision with root package name */
    public String f6531d = "";

    public e(WeakReference weakReference, ArrayList arrayList) {
        this.f6529b = weakReference;
        this.f6530c = arrayList;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        t tVar = new t(9, this, editable);
        io.sentry.internal.debugmeta.c cVar = this.f6528a;
        ScheduledFuture scheduledFuture = (ScheduledFuture) cVar.f16518c;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            ((ScheduledFuture) cVar.f16518c).cancel(false);
        }
        cVar.f16518c = ((ScheduledExecutorService) cVar.f16517b).schedule(tVar, 500L, TimeUnit.MILLISECONDS);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
    }
}
