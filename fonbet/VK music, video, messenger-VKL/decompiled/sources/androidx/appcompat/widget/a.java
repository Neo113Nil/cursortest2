package androidx.appcompat.widget;

import androidx.appcompat.widget.AppCompatSpinner;
import xsna.sjj0;
import xsna.v9s;

/* compiled from: AppCompatSpinner.java */
/* loaded from: classes11.dex */
public final class a extends v9s {
    public final /* synthetic */ AppCompatSpinner.e k;
    public final /* synthetic */ AppCompatSpinner l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, AppCompatSpinner.e eVar) {
        super(appCompatSpinner2);
        this.l = appCompatSpinner;
        this.k = eVar;
    }

    @Override // xsna.v9s
    public final sjj0 b() {
        return this.k;
    }

    @Override // xsna.v9s
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.l;
        if (appCompatSpinner.getInternalPopup().isShowing()) {
            return true;
        }
        appCompatSpinner.g.a(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
