package defpackage;

import android.os.Bundle;
import com.sofascore.results.player.PlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ile implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerActivity b;

    public /* synthetic */ ile(PlayerActivity playerActivity, int i) {
        this.a = i;
        this.b = playerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        r1 = false;
        boolean z = false;
        PlayerActivity playerActivity = this.b;
        switch (i) {
            case 0:
                int i2 = PlayerActivity.Z;
                break;
            case 1:
                int i3 = PlayerActivity.Z;
                Bundle extras = playerActivity.getIntent().getExtras();
                break;
            case 2:
                int i4 = PlayerActivity.Z;
                Bundle extras2 = playerActivity.getIntent().getExtras();
                break;
            case 3:
                int i5 = PlayerActivity.Z;
                Bundle extras3 = playerActivity.getIntent().getExtras();
                break;
            case 4:
                int i6 = PlayerActivity.Z;
                Bundle extras4 = playerActivity.getIntent().getExtras();
                if (extras4 != null && extras4.getBoolean("SCROLL_TO_TRANSFERS")) {
                    z = true;
                }
                break;
            case 5:
                int i7 = PlayerActivity.Z;
                playerActivity.N();
                break;
            default:
                int i8 = PlayerActivity.Z;
                playerActivity.a0().F();
                break;
        }
        return Unit.a;
    }
}
