package defpackage;

import com.blaze.blazesdk.players.BlazeVideoManager;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k0n implements wke {
    public final /* synthetic */ BlazeVideoManager a;
    public final /* synthetic */ n4m b;
    public final /* synthetic */ Function1 c;

    public k0n(BlazeVideoManager blazeVideoManager, n4m n4mVar, Function1 function1) {
        this.a = blazeVideoManager;
        this.b = n4mVar;
        this.c = function1;
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        ywl ywlVar;
        BlazeVideoManager blazeVideoManager = this.a;
        try {
            if (blazeVideoManager.e(this.b)) {
                ywl[] values = ywl.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        ywlVar = null;
                        break;
                    }
                    ywlVar = values[i2];
                    if (ywlVar.a == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (ywlVar != null) {
                    Function1 function1 = this.c;
                    yda ydaVar = blazeVideoManager.f;
                    if (ydaVar != null) {
                        ydaVar.e(null);
                    }
                    blazeVideoManager.f = null;
                    if (ywlVar == ywl.c) {
                        blazeVideoManager.f = evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new nzm(function1, ywlVar, null), 1, null);
                    } else {
                        function1.invoke(ywlVar);
                    }
                }
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
