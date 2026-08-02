package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.chat.FantasyCompetitionChatFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pp6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyCompetitionChatFragment b;

    public /* synthetic */ pp6(FantasyCompetitionChatFragment fantasyCompetitionChatFragment, int i) {
        this.a = i;
        this.b = fantasyCompetitionChatFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyCompetitionChatFragment fantasyCompetitionChatFragment = this.b;
        switch (i) {
            case 0:
                ChatInterface chatInterface = fantasyCompetitionChatFragment.L().y;
                return new dr2(R.string.empty_state_chat_competition, 7290, "preferenceFantasyMessageGlobal" + (chatInterface != null ? Integer.valueOf(chatInterface.getChatId()) : null), true);
            case 1:
                FantasyCompetitionChatFragment fantasyCompetitionChatFragment2 = this.b;
                FragmentActivity requireActivity = fantasyCompetitionChatFragment2.requireActivity();
                requireActivity.getClass();
                return new gca(requireActivity, fantasyCompetitionChatFragment2.K(), new jo6(fantasyCompetitionChatFragment2, 1), new pp6(fantasyCompetitionChatFragment2, 2), new ny(0, fantasyCompetitionChatFragment2, FantasyCompetitionChatFragment.class, "showChatRules", "showChatRules()V", 0, 26), new x16(fantasyCompetitionChatFragment2, 7), 128);
            default:
                return Boolean.valueOf(fantasyCompetitionChatFragment.I());
        }
    }
}
