package com.google.android.material.sidesheet;

import android.view.View;
import io.sentry.instrumentation.file.f;
import q0.g;
import q0.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements o, io.sentry.instrumentation.file.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5956b;

    public /* synthetic */ c(int i5, Object obj) {
        this.f5956b = obj;
        this.f5955a = i5;
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() {
        f fVar = (f) this.f5956b;
        fVar.f16509a.write(this.f5955a);
        return 1;
    }

    @Override // q0.o
    public boolean perform(View view, g gVar) {
        boolean lambda$createAccessibilityViewCommandForState$2;
        lambda$createAccessibilityViewCommandForState$2 = ((SideSheetBehavior) this.f5956b).lambda$createAccessibilityViewCommandForState$2(this.f5955a, view, null);
        return lambda$createAccessibilityViewCommandForState$2;
    }
}
