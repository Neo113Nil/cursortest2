package defpackage;

import android.R;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum n8j {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(l6g.e, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(l6g.f, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(l6g.g, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(l6g.h, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(l6g.i, Build.VERSION.SDK_INT <= 26 ? com.sofascore.results.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);

    public final Object a;
    public final int b;
    public final int c;

    n8j(Object obj, int i, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
    }
}
