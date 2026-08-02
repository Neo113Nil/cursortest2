package defpackage;

import android.content.Context;
import com.sofascore.results.event.lineups.EventPreMatchLineupsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class v56 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventPreMatchLineupsFragment b;

    public /* synthetic */ v56(EventPreMatchLineupsFragment eventPreMatchLineupsFragment, int i) {
        this.a = i;
        this.b = eventPreMatchLineupsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EventPreMatchLineupsFragment eventPreMatchLineupsFragment = this.b;
        switch (i) {
            case 0:
                Context requireContext = eventPreMatchLineupsFragment.requireContext();
                requireContext.getClass();
                return new u56(requireContext, eventPreMatchLineupsFragment.C());
            case 1:
                Context requireContext2 = eventPreMatchLineupsFragment.requireContext();
                requireContext2.getClass();
                return new ykc(requireContext2);
            default:
                eventPreMatchLineupsFragment.n();
                return Unit.a;
        }
    }
}
