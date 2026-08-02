package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class frk implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideosPlayerActivity b;

    public /* synthetic */ frk(VideosPlayerActivity videosPlayerActivity, int i) {
        this.a = i;
        this.b = videosPlayerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        VideosPlayerActivity videosPlayerActivity = this.b;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                bool.getClass();
                a aVar = videosPlayerActivity.m;
                if (aVar != null) {
                    aVar.v();
                }
                break;
            default:
                boolean booleanValue = bool.booleanValue();
                VideosPlayerActivity.a aVar2 = VideosPlayerActivity.u;
                videosPlayerActivity.u(booleanValue);
                break;
        }
        return Unit.a;
    }
}
