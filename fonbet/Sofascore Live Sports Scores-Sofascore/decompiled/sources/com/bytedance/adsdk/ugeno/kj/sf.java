package com.bytedance.adsdk.ugeno.kj;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class sf {
    private final DataSetObservable pcc = new DataSetObservable();
    private DataSetObserver sf;

    public void gm() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.sf;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.pcc.notifyChanged();
    }

    public abstract int pcc();

    @Deprecated
    public Object pcc(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean pcc(View view, Object obj);

    public Parcelable sf() {
        return null;
    }

    public int pcc(Object obj) {
        return -1;
    }

    public Object pcc(ViewGroup viewGroup, int i) {
        return pcc((View) viewGroup, i);
    }

    public void pcc(ViewGroup viewGroup, int i, Object obj) {
        pcc((View) viewGroup, i, obj);
    }

    public float pcc(int i) {
        return 1.0f;
    }

    @Deprecated
    public void pcc(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void pcc(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.sf = dataSetObserver;
        }
    }
}
