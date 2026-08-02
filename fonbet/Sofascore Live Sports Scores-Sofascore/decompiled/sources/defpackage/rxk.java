package defpackage;

import android.media.VolumeProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rxk extends VolumeProvider {
    public final /* synthetic */ ql5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxk(ql5 ql5Var, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = ql5Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        ql5 ql5Var = this.a;
        ((yz8) ((ejg) ql5Var.g).d).a.post(new wz8(ql5Var, i, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        ql5 ql5Var = this.a;
        ((yz8) ((ejg) ql5Var.g).d).a.post(new wz8(ql5Var, i, 0));
    }
}
