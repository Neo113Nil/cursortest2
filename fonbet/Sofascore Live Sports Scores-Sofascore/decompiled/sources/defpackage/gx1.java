package defpackage;

import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class gx1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BlazeBaseInlinePlayerContainer b;

    public /* synthetic */ gx1(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, int i) {
        this.a = i;
        this.b = blazeBaseInlinePlayerContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer = this.b;
        switch (i) {
            case 0:
                return BlazeBaseInlinePlayerContainer.e(blazeBaseInlinePlayerContainer);
            case 1:
                return BlazeBaseInlinePlayerContainer.a(blazeBaseInlinePlayerContainer);
            case 2:
                return BlazeBaseInlinePlayerContainer.b(blazeBaseInlinePlayerContainer);
            case 3:
                return BlazeBaseInlinePlayerContainer.d(blazeBaseInlinePlayerContainer);
            case 4:
                return BlazeBaseInlinePlayerContainer.c(blazeBaseInlinePlayerContainer);
            default:
                blazeBaseInlinePlayerContainer.internalDismissPlayer();
                return Unit.a;
        }
    }
}
