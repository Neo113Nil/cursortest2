package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.event.details.EventDetailsFragment;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ux5 implements Function0 {
    public final /* synthetic */ EventDetailsFragment a;
    public final /* synthetic */ x2g b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ WeakReference d;
    public final /* synthetic */ WeakReference e;
    public final /* synthetic */ WeakReference f;

    public ux5(EventDetailsFragment eventDetailsFragment, x2g x2gVar, WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, WeakReference weakReference4) {
        this.a = eventDetailsFragment;
        this.b = x2gVar;
        this.c = weakReference;
        this.d = weakReference2;
        this.e = weakReference3;
        this.f = weakReference4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        u4g I = this.a.I();
        Object obj = ((v2g) this.b).a;
        I.n((ksh) obj, AdType.RewardedInterstitial.EventWhoWillWin, new tx5(0, this.d, this.e, this.f));
        FragmentActivity fragmentActivity = (FragmentActivity) this.c.get();
        if (fragmentActivity != null) {
            ((g19) ((ksh) obj)).a(fragmentActivity);
        }
        return Unit.a;
    }
}
