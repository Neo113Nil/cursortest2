package com.google.android.material.internal;

import android.view.View;
import io.appmetrica.analytics.impl.Sb;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5919c;

    public /* synthetic */ b(Object obj, boolean z5, int i5) {
        this.f5917a = i5;
        this.f5919c = obj;
        this.f5918b = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5917a) {
            case 0:
                ViewUtils.showKeyboard((View) this.f5919c, this.f5918b);
                break;
            default:
                Sb.a((Sb) this.f5919c, this.f5918b);
                break;
        }
    }
}
