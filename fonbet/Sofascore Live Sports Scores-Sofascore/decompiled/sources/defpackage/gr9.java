package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gr9 implements wke {
    public final /* synthetic */ hr9 a;

    public gr9(hr9 hr9Var) {
        this.a = hr9Var;
    }

    @Override // defpackage.wke
    public final void onPositionDiscontinuity(yke ykeVar, yke ykeVar2, int i) {
        hr9 hr9Var = this.a;
        hr9Var.b();
        hr9Var.a();
    }

    @Override // defpackage.wke
    public final void onRepeatModeChanged(int i) {
        this.a.a();
    }

    @Override // defpackage.wke
    public final void onShuffleModeEnabledChanged(boolean z) {
        this.a.a();
    }

    @Override // defpackage.wke
    public final void onTimelineChanged(mij mijVar, int i) {
        if (mijVar.p()) {
            return;
        }
        hr9 hr9Var = this.a;
        hr9Var.b();
        hr9Var.a();
    }
}
