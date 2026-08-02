package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class g1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractChatFragment b;

    public /* synthetic */ g1(AbstractChatFragment abstractChatFragment, int i) {
        this.a = i;
        this.b = abstractChatFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        int i2 = 3;
        int i3 = 1;
        switch (this.a) {
            case 0:
                Context requireContext = this.b.requireContext();
                requireContext.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = requireContext.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                return sharedPreferences;
            case 1:
                this.b.H = true;
                return Unit.a;
            case 2:
                AbstractChatFragment abstractChatFragment = this.b;
                us2 L = abstractChatFragment.L();
                xw3.L(un0.z(L), null, null, new t3(L, abstractChatFragment.getR().c, (rq3) null, i2), 3);
                return Unit.a;
            case 3:
                return Boolean.valueOf(this.b.I());
            case 4:
                this.b.P();
                return Unit.a;
            case 5:
                AbstractChatFragment abstractChatFragment2 = this.b;
                Context requireContext2 = abstractChatFragment2.requireContext();
                requireContext2.getClass();
                return new fhc(requireContext2, abstractChatFragment2.H().getBoolean("SHOW_REDESIGNED_CHAT_LAYOUT", false) && abstractChatFragment2.getR().g, new p1(2, abstractChatFragment2, AbstractChatFragment.class, "showChatActionsModal", "showChatActionsModal(Lcom/sofascore/model/chat/Message;Landroid/view/View;)V", 0, 0), new k1(abstractChatFragment2, i));
            case 6:
                Context requireContext3 = this.b.requireContext();
                requireContext3.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = requireContext3.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences2 = a5f.d(applicationContext2);
                        uic.j = sharedPreferences2;
                    }
                    sharedPreferences2.getClass();
                }
                SharedPreferences.Editor i4 = dmi.i(sharedPreferences2, "SHOW_CHAT_RULES", false);
                Unit unit = Unit.a;
                i4.apply();
                return Unit.a;
            case 7:
                krk krkVar = this.b.l;
                krkVar.getClass();
                tba.j(((yn8) krkVar).e, n35.TO_BOTTOM, 0L, 14);
                return Unit.a;
            case 8:
                return new q1(this.b);
            case 9:
                return new eca(this.b.G());
            default:
                AbstractChatFragment abstractChatFragment3 = this.b;
                FragmentActivity requireActivity = abstractChatFragment3.requireActivity();
                requireActivity.getClass();
                return new gca(requireActivity, abstractChatFragment3.K(), new k1(abstractChatFragment3, i3), new g1(abstractChatFragment3, i2), new g1(abstractChatFragment3, 4), new h1(abstractChatFragment3, 9), PsExtractor.AUDIO_STREAM);
        }
    }
}
