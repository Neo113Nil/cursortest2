package defpackage;

import androidx.media3.ui.PlayerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ugi implements sxe {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bhi b;
    public final /* synthetic */ PlayerView c;

    public /* synthetic */ ugi(bhi bhiVar, PlayerView playerView) {
        this.b = bhiVar;
        this.c = playerView;
    }

    @Override // defpackage.sxe
    public final void a(boolean z) {
        int i = this.a;
        PlayerView playerView = this.c;
        bhi bhiVar = this.b;
        switch (i) {
            case 0:
                bhi.v(bhiVar, playerView, z);
                break;
            default:
                bhi.t(bhiVar, playerView, z);
                break;
        }
    }

    public /* synthetic */ ugi(PlayerView playerView, bhi bhiVar) {
        this.c = playerView;
        this.b = bhiVar;
    }
}
