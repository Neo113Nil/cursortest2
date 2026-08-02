package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.league.chat.FantasyLeagueChatFragment;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class q37 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyLeagueChatFragment b;

    public /* synthetic */ q37(FantasyLeagueChatFragment fantasyLeagueChatFragment, int i) {
        this.a = i;
        this.b = fantasyLeagueChatFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyLeagueChatFragment fantasyLeagueChatFragment = this.b;
        switch (i) {
            case 0:
                Bundle requireArguments = fantasyLeagueChatFragment.requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "FANTASY_LEAGUE_EXTRA", j67.class);
                if (M != null) {
                    return (j67) M;
                }
                a70.p("Serializable FANTASY_LEAGUE_EXTRA not found");
                return null;
            case 1:
                ChatInterface chatInterface = fantasyLeagueChatFragment.L().y;
                return new dr2(R.string.empty_state_chat_competition, 7290, "preferenceFantasyMessage" + (chatInterface != null ? Integer.valueOf(chatInterface.getChatId()) : null), true);
            case 2:
                ia0 ia0Var = ia0.q;
                boolean c = Intrinsics.c(((j67) fantasyLeagueChatFragment.R.getValue()).d, fc6.e());
                FragmentActivity requireActivity = fantasyLeagueChatFragment.requireActivity();
                requireActivity.getClass();
                int i2 = 4;
                return new gca(requireActivity, fantasyLeagueChatFragment.K(), new m81(c, fantasyLeagueChatFragment, i2), new q37(fantasyLeagueChatFragment, 3), new q37(fantasyLeagueChatFragment, i2), new x16(fantasyLeagueChatFragment, 13), true, c);
            case 3:
                return Boolean.valueOf(fantasyLeagueChatFragment.I());
            default:
                fantasyLeagueChatFragment.P();
                return Unit.a;
        }
    }
}
