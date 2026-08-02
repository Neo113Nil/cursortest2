package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iuk extends DataSetObserver {
    public final /* synthetic */ suk a;

    public iuk(suk sukVar) {
        this.a = sukVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dataSetChanged();
    }
}
