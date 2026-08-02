package defpackage;

import android.app.Application;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljqc;", "Ld50;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class jqc extends d50 {
    public final fyk c;
    public final yzc d;
    public final yzc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqc(Application application, fyk fykVar) {
        super(application);
        fykVar.getClass();
        this.c = fykVar;
        yzc yzcVar = new yzc();
        this.d = yzcVar;
        this.e = yzcVar;
    }

    public final void g(Event event, MmaPostMatchVotingOptions mmaPostMatchVotingOptions, String str, int i) {
        Application application = this.b;
        application.getClass();
        z1a.i(application, event.getId(), event.getStartTimestamp(), mmaPostMatchVotingOptions.getChoice(), VoteType.MMA_POST_MATCH_VOTING);
        int id = event.getId();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", id);
        firebaseBundle.putString("position", String.valueOf(i));
        firebaseBundle.putString("type", "mma_who_deserved_to_win");
        firebaseBundle.putString("location", str);
        ia0 ia0Var = ia0.q;
        ((f5d) me4.e()).c("post_match_vote", firebaseBundle);
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(application);
        firebaseAnalytics.getClass();
        firebaseAnalytics.a.e(n9e.K(firebaseBundle), null, "post_match_vote", false);
    }
}
