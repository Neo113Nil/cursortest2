package defpackage;

import com.sofascore.results.view.BellButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yt1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BellButton b;

    public /* synthetic */ yt1(BellButton bellButton, int i) {
        this.a = i;
        this.b = bellButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BellButton bellButton = this.b;
        switch (i) {
            case 0:
                int i2 = BellButton.h;
                bellButton.setState(xe8.Inactive);
                break;
            case 1:
                int i3 = BellButton.h;
                bellButton.setState(xe8.Muted);
                break;
            default:
                int i4 = BellButton.h;
                bellButton.setState(xe8.Inactive);
                break;
        }
        return Unit.a;
    }
}
