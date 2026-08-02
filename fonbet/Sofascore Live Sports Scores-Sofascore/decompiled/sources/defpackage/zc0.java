package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class zc0 extends dad {
    public final /* synthetic */ AppCompatTextView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(AppCompatTextView appCompatTextView) {
        super(appCompatTextView, 7);
        this.e = appCompatTextView;
    }

    @Override // defpackage.dad, defpackage.yc0
    public final void g(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // defpackage.dad, defpackage.yc0
    public final void n(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }
}
