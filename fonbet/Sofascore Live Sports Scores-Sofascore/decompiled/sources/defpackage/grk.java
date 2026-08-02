package defpackage;

import android.content.Intent;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.D;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class grk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideosPlayerActivity b;

    public /* synthetic */ grk(VideosPlayerActivity videosPlayerActivity, int i) {
        this.a = i;
        this.b = videosPlayerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        VideosPlayerActivity videosPlayerActivity = this.b;
        switch (i) {
            case 0:
                VideosPlayerActivity.a aVar = VideosPlayerActivity.u;
                if (cnb.h(videosPlayerActivity)) {
                    int i2 = videosPlayerActivity.getResources().getConfiguration().orientation;
                    videosPlayerActivity.setRequestedOrientation((i2 == 1 || i2 != 2) ? 11 : 12);
                }
                break;
            case 1:
                VideosPlayerActivity.a aVar2 = VideosPlayerActivity.u;
                videosPlayerActivity.v();
                break;
            case 2:
                videosPlayerActivity.s = false;
                break;
            case 3:
                VideosPlayerActivity.a aVar3 = VideosPlayerActivity.u;
                Intent intent = new Intent(videosPlayerActivity, (Class<?>) VideosPlayerActivity.class);
                intent.addFlags(537001984);
                intent.putExtra("exitPipToFullscreen", true);
                videosPlayerActivity.startActivity(intent);
                break;
            case 4:
                a aVar4 = videosPlayerActivity.m;
                if (aVar4 != null) {
                    D d = D.LANDSCAPE;
                    d.getClass();
                    B b = ((w3m) aVar4.getViewModel()).p0;
                    if (b != null) {
                        b.e = d;
                    }
                }
                break;
            default:
                a aVar5 = videosPlayerActivity.m;
                if (aVar5 != null) {
                    D d2 = D.PORTRAIT;
                    d2.getClass();
                    B b2 = ((w3m) aVar5.getViewModel()).p0;
                    if (b2 != null) {
                        b2.e = d2;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
