package androidx.appcompat.widget;

import defpackage.kmi;
import defpackage.r84;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ SearchView a;

    public c(SearchView searchView) {
        this.a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r84 r84Var = this.a.mSuggestionsAdapter;
        if (r84Var instanceof kmi) {
            r84Var.b(null);
        }
    }
}
