package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.model.chat.AirCashData;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.mvvm.model.chat.ChatImageUrls;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.chat.ChatTranslateActivity;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.view.ChatConnectingView;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.chat.view.FloatingIndicationLabelView;
import com.sofascore.results.profile.LoginScreenActivity;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class h1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractChatFragment b;

    public /* synthetic */ h1(AbstractChatFragment abstractChatFragment, int i) {
        this.a = i;
        this.b = abstractChatFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Message message;
        String string;
        int i = this.a;
        int i2 = 5;
        boolean z = false;
        z = false;
        z = false;
        int i3 = 1;
        AbstractChatFragment abstractChatFragment = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                pq2 D = abstractChatFragment.D();
                xw3.L(un0.z(D), null, null, new nq2(D, r6, z ? 1 : 0), 3);
                break;
            case 1:
                de deVar = abstractChatFragment.E;
                int intValue = ((Integer) obj).intValue();
                if (intValue == R.id.button_overlay) {
                    int i4 = LoginScreenActivity.M;
                    FragmentActivity requireActivity = abstractChatFragment.requireActivity();
                    requireActivity.getClass();
                    deVar.a(wxf.v(requireActivity, null, 6), null);
                } else if (intValue == R.id.upload_button) {
                    de deVar2 = abstractChatFragment.D;
                    z9.h();
                    z9.h();
                    lge lgeVar = new lge();
                    lgeVar.a = zd.a;
                    z9.h();
                    lgeVar.a = ae.a;
                    deVar2.a(lgeVar, null);
                } else if (intValue == R.id.button_add_flag) {
                    if (abstractChatFragment.K().isLoggedIn()) {
                        abstractChatFragment.N();
                    } else {
                        int i5 = LoginScreenActivity.M;
                        FragmentActivity requireActivity2 = abstractChatFragment.requireActivity();
                        requireActivity2.getClass();
                        deVar.a(wxf.v(requireActivity2, null, 6), null);
                    }
                } else if (intValue == R.id.translate_button) {
                    abstractChatFragment.F.a(new Intent(abstractChatFragment.requireContext(), (Class<?>) ChatTranslateActivity.class), null);
                }
                break;
            case 2:
                Message message2 = (Message) obj;
                message2.getClass();
                us2 L = abstractChatFragment.L();
                xw3.L(un0.z(L), null, null, new hy1(L, message2, r6, 12), 3);
                break;
            case 3:
                zj3 zj3Var = (zj3) obj;
                if (!abstractChatFragment.x) {
                    FragmentActivity activity = abstractChatFragment.getActivity();
                    if (activity != null && !activity.isFinishing()) {
                        r1 = zj3Var != null ? o1.a[zj3Var.ordinal()] : -1;
                        if (r1 == 1 || r1 == 2 || r1 == 3) {
                            krk krkVar = abstractChatFragment.l;
                            krkVar.getClass();
                            ((yn8) krkVar).b.j();
                            krk krkVar2 = abstractChatFragment.l;
                            krkVar2.getClass();
                            ChatConnectingView chatConnectingView = ((yn8) krkVar2).b;
                            chatConnectingView.k = true;
                            dd ddVar = chatConnectingView.n;
                            if (chatConnectingView.j) {
                                chatConnectingView.j = false;
                                ((CircularProgressIndicator) ddVar.c).setVisibility(8);
                                ((TextView) ddVar.d).setText(chatConnectingView.getContext().getString(R.string.connected));
                                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                                shapeDrawable.getPaint().setColor(chatConnectingView.h);
                                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{chatConnectingView.getRoot().getBackground(), shapeDrawable});
                                chatConnectingView.getRoot().setBackground(transitionDrawable);
                                transitionDrawable.startTransition(400);
                                chatConnectingView.getRoot().clearAnimation();
                                chatConnectingView.e.postDelayed(new rq2(chatConnectingView, i3), 1000L);
                            }
                            krk krkVar3 = abstractChatFragment.l;
                            krkVar3.getClass();
                            ((yn8) krkVar3).f.n();
                        } else if ((r1 == 4 || r1 == 5) && !abstractChatFragment.L().p && abstractChatFragment.getActivity() != null) {
                            krk krkVar4 = abstractChatFragment.l;
                            krkVar4.getClass();
                            js2 js2Var = ((yn8) krkVar4).f.d;
                            ((ImageView) js2Var.h).setEnabled(false);
                            ((EditText) js2Var.m).setEnabled(false);
                            ((ImageView) js2Var.c).setEnabled(false);
                            js2Var.d.setVisibility(8);
                            ((ImageView) js2Var.b).setEnabled(false);
                            krk krkVar5 = abstractChatFragment.l;
                            krkVar5.getClass();
                            ChatConnectingView chatConnectingView2 = ((yn8) krkVar5).b;
                            chatConnectingView2.k = false;
                            chatConnectingView2.d.removeCallbacksAndMessages(null);
                            new b8(chatConnectingView2, 8).run();
                        }
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                Message message3 = (Message) obj;
                message3.getClass();
                abstractChatFragment.L().p = false;
                if (message3.isMessageValid(abstractChatFragment.K().getId())) {
                    krk krkVar6 = abstractChatFragment.l;
                    krkVar6.getClass();
                    if (((yn8) krkVar6).h.getVisibility() == 0) {
                        krk krkVar7 = abstractChatFragment.l;
                        krkVar7.getClass();
                        ((yn8) krkVar7).h.setVisibility(8);
                    }
                    if (abstractChatFragment.getR().f) {
                        abstractChatFragment.M(message3);
                    }
                    abstractChatFragment.F().G(message3);
                    ChatInterface chatInterface = abstractChatFragment.L().y;
                    r6 = chatInterface != null ? Integer.valueOf(chatInterface.getChatId()) : 0;
                    if (abstractChatFragment.getR().c) {
                        AirCashData airCashData = nm.a;
                        if (nm.b(r6 != 0 ? r6.intValue() : 0) && nm.c(message3.getTimestamp())) {
                            abstractChatFragment.F().G(nm.a());
                        }
                    }
                } else {
                    fhc F = abstractChatFragment.F();
                    F.getClass();
                    if (F.i.contains(message3)) {
                        F.D(message3);
                    }
                }
                if (abstractChatFragment.F().getItemCount() == 0) {
                    krk krkVar8 = abstractChatFragment.l;
                    krkVar8.getClass();
                    if (((yn8) krkVar8).h.getVisibility() != 0) {
                        krk krkVar9 = abstractChatFragment.l;
                        krkVar9.getClass();
                        ((yn8) krkVar9).h.setVisibility(0);
                    }
                }
                if (!message3.getIsDeleted() && !message3.getIsSystem() && message3.isMessageValid(abstractChatFragment.K().getId())) {
                    z = true;
                }
                abstractChatFragment.B = z;
                krk krkVar10 = abstractChatFragment.l;
                krkVar10.getClass();
                abstractChatFragment.t(((yn8) krkVar10).l, new h1(abstractChatFragment, 10));
                break;
            case 5:
                List list = (List) obj;
                list.getClass();
                abstractChatFragment.i.e = Integer.valueOf(list.size());
                abstractChatFragment.F().F(list);
                krk krkVar11 = abstractChatFragment.l;
                krkVar11.getClass();
                ((yn8) krkVar11).h.setVisibility(list.isEmpty() ? 0 : 8);
                if (abstractChatFragment.G) {
                    abstractChatFragment.G = false;
                } else if (!list.isEmpty()) {
                    int itemCount = abstractChatFragment.F().getItemCount() - 1;
                    krk krkVar12 = abstractChatFragment.l;
                    krkVar12.getClass();
                    ((yn8) krkVar12).l.scrollToPosition(itemCount);
                    krk krkVar13 = abstractChatFragment.l;
                    krkVar13.getClass();
                    ((yn8) krkVar13).l.smoothScrollToPosition(itemCount);
                }
                if (abstractChatFragment.getR().f && !list.isEmpty() && (message = (Message) CollectionsKt.j0(list)) != null) {
                    long j = abstractChatFragment.H().getLong(abstractChatFragment.getR().b, 0L);
                    if (j < message.getTimestamp()) {
                        abstractChatFragment.M(message);
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                if (j == ((Message) listIterator.previous()).getTimestamp()) {
                                    r1 = listIterator.nextIndex();
                                }
                            }
                        }
                        krk krkVar14 = abstractChatFragment.l;
                        krkVar14.getClass();
                        ((yn8) krkVar14).l.scrollToPosition(r1);
                    }
                }
                break;
            case 6:
                ErrorResponse errorResponse = (ErrorResponse) obj;
                Integer valueOf = errorResponse != null ? Integer.valueOf(errorResponse.getCode()) : null;
                if (valueOf != null && valueOf.intValue() == 403) {
                    string = abstractChatFragment.getString(R.string.chat_error_403);
                    string.getClass();
                } else if (valueOf != null && valueOf.intValue() == 429) {
                    string = abstractChatFragment.getString(R.string.chat_error_429);
                    string.getClass();
                } else if (errorResponse == null || (string = errorResponse.getMessage()) == null) {
                    string = abstractChatFragment.getString(R.string.error_message_title);
                    string.getClass();
                }
                Calendar calendar = ke0.a;
                Context requireContext = abstractChatFragment.requireContext();
                requireContext.getClass();
                ke0.g(requireContext, string, 1);
                break;
            case 7:
                String str = (String) obj;
                krk krkVar15 = abstractChatFragment.l;
                krkVar15.getClass();
                FloatingIndicationLabelView floatingIndicationLabelView = ((yn8) krkVar15).i;
                str.getClass();
                floatingIndicationLabelView.j(Integer.valueOf(R.drawable.ic_warning), str);
                break;
            case 8:
                ChatImageUrls chatImageUrls = (ChatImageUrls) obj;
                krk krkVar16 = abstractChatFragment.l;
                if (chatImageUrls != null) {
                    krkVar16.getClass();
                    ChatMessageInputView chatMessageInputView = ((yn8) krkVar16).f;
                    String thumbnailUrl = chatImageUrls.getThumbnailUrl();
                    ShapeableImageView shapeableImageView = (ShapeableImageView) chatMessageInputView.d.n;
                    apf a = ajh.a(shapeableImageView.getContext());
                    ht9 ht9Var = new ht9(shapeableImageView.getContext());
                    ht9Var.c = thumbnailUrl;
                    vt9.f(ht9Var, shapeableImageView);
                    ht9Var.d = new sa0(chatMessageInputView, i2);
                    a.a(ht9Var.a());
                } else {
                    krkVar16.getClass();
                    ((yn8) krkVar16).f.p();
                }
                break;
            case 9:
                Message message4 = (Message) obj;
                message4.getClass();
                ChatUser user = message4.getUser();
                abstractChatFragment.O(user != null ? user.getName() : null, message4.getText(), message4.getImage(), message4.getId());
                break;
            case 10:
                ((View) obj).getClass();
                abstractChatFragment.C.run();
                break;
            default:
                ((View) obj).getClass();
                krk krkVar17 = abstractChatFragment.l;
                krkVar17.getClass();
                ((yn8) krkVar17).n.g(true);
                break;
        }
        return Unit.a;
    }
}
