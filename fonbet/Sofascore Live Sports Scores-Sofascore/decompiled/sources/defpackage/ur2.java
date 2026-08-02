package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.chat.BanReason;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.service.ChatMessageWorker;
import com.sofascore.results.view.SofaTextInputLayout;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ur2 {
    public static void a(final Context context, final us2 us2Var, bq2 bq2Var, final Message message, ChatUser chatUser) {
        context.getClass();
        us2Var.getClass();
        bq2Var.getClass();
        final String str = chatUser.isAdmin() ? "admin" : chatUser.isModerator() ? "moderator" : "user";
        int ordinal = bq2Var.ordinal();
        if (ordinal == 0) {
            final AlertDialog h = lnb.h(R.style.RedesignDialog, context);
            z82 f = z82.f(LayoutInflater.from(context));
            MaterialButton materialButton = (MaterialButton) f.c;
            MaterialButton materialButton2 = (MaterialButton) f.f;
            TextView textView = (TextView) f.g;
            ChatUser user = message.getUser();
            textView.setText(context.getString(R.string.report_user_title, user != null ? user.getName() : null));
            TextView textView2 = (TextView) f.e;
            ChatUser user2 = message.getUser();
            textView2.setText(context.getString(R.string.report_user_description, user2 != null ? user2.getName() : null));
            materialButton2.setText(context.getString(R.string.button_report_user));
            materialButton.setText(context.getString(R.string.cancel));
            materialButton.setOnClickListener(new wn(h, 2));
            final int i = 2;
            materialButton2.setOnClickListener(new View.OnClickListener() { // from class: rr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    Message message2 = message;
                    y11 y11Var = us2Var;
                    String str2 = str;
                    Context context2 = context;
                    AlertDialog alertDialog = h;
                    switch (i2) {
                        case 0:
                            y11 y11Var2 = us2Var;
                            ChatInterface chatInterface = ((us2) y11Var2).y;
                            if (chatInterface != null) {
                                nv.t(context2, "perma_ban", str2, chatInterface);
                            }
                            xw3.L(un0.z(y11Var2), null, null, new w11(y11Var2, message, new BanReason(BanReason.Type.OTHER, "none"), null, 1), 3);
                            alertDialog.dismiss();
                            break;
                        case 1:
                            ChatInterface chatInterface2 = ((us2) y11Var).y;
                            if (chatInterface2 != null) {
                                nv.t(context2, "remove", str2, chatInterface2);
                            }
                            xw3.L(un0.z(y11Var), null, null, new l0(y11Var, message2, null, 19), 3);
                            alertDialog.dismiss();
                            break;
                        case 2:
                            ChatInterface chatInterface3 = ((us2) y11Var).y;
                            if (chatInterface3 != null) {
                                nv.t(context2, "report", str2, chatInterface3);
                            }
                            message2.setReported(true);
                            yzc yzcVar = y11Var.j;
                            Context i3 = y11Var.i();
                            ChatUser user3 = message2.getUser();
                            yzcVar.j(i3.getString(R.string.user_reported, user3 != null ? user3.getName() : null));
                            ChatInterface chatInterface4 = ((us2) y11Var).y;
                            Integer valueOf = chatInterface4 != null ? Integer.valueOf(chatInterface4.getChatId()) : null;
                            if (valueOf != null) {
                                Context i4 = y11Var.i();
                                Pair[] pairArr = {new Pair("ACTION", "CHAT_REPORT_CAST_ACTION"), new Pair("EVENT_ID", valueOf), new Pair("MESSAGE_TIMESTAMP", Long.valueOf(message2.getTimestamp())), new Pair("REPORT_TIMESTAMP", Long.valueOf(System.currentTimeMillis() / 1000))};
                                hpo hpoVar = new hpo(18);
                                for (int i5 = 0; i5 < 4; i5++) {
                                    Pair pair = pairArr[i5];
                                    hpoVar.B(pair.b, (String) pair.a);
                                }
                                md4 l = hpoVar.l();
                                vxd.h(i4).b("ChatMessageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(ChatMessageWorker.class, l).a());
                                int i6 = EventDetailsFragment.U0 + 1;
                                EventDetailsFragment.U0 = i6;
                                xw3.L(un0.z(y11Var), null, null, new x11(y11Var, message2, i6 > 6 ? "virtual-report" : "report", null), 3);
                            }
                            alertDialog.dismiss();
                            break;
                        default:
                            y11 y11Var3 = us2Var;
                            ChatInterface chatInterface5 = ((us2) y11Var3).y;
                            if (chatInterface5 != null) {
                                nv.t(context2, "warn", str2, chatInterface5);
                            }
                            xw3.L(un0.z(y11Var3), null, null, new w11(y11Var3, message, new BanReason(BanReason.Type.OTHER, "none"), null, 2), 3);
                            alertDialog.dismiss();
                            break;
                    }
                }
            });
            h.setView((ConstraintLayout) f.b);
            h.show();
            return;
        }
        if (ordinal == 1) {
            final AlertDialog h2 = lnb.h(R.style.RedesignDialog, context);
            z82 f2 = z82.f(LayoutInflater.from(context));
            MaterialButton materialButton3 = (MaterialButton) f2.c;
            MaterialButton materialButton4 = (MaterialButton) f2.f;
            ((TextView) f2.g).setText(context.getString(R.string.are_you_sure));
            ((TextView) f2.e).setText(context.getString(R.string.chat_delete_message_description, message.getText()));
            materialButton4.setText(context.getString(R.string.button_delete_message));
            materialButton3.setText(context.getString(R.string.cancel));
            materialButton3.setOnClickListener(new wn(h2, 4));
            final int i2 = 1;
            materialButton4.setOnClickListener(new View.OnClickListener() { // from class: rr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i2;
                    Message message2 = message;
                    y11 y11Var = us2Var;
                    String str2 = str;
                    Context context2 = context;
                    AlertDialog alertDialog = h2;
                    switch (i22) {
                        case 0:
                            y11 y11Var2 = us2Var;
                            ChatInterface chatInterface = ((us2) y11Var2).y;
                            if (chatInterface != null) {
                                nv.t(context2, "perma_ban", str2, chatInterface);
                            }
                            xw3.L(un0.z(y11Var2), null, null, new w11(y11Var2, message, new BanReason(BanReason.Type.OTHER, "none"), null, 1), 3);
                            alertDialog.dismiss();
                            break;
                        case 1:
                            ChatInterface chatInterface2 = ((us2) y11Var).y;
                            if (chatInterface2 != null) {
                                nv.t(context2, "remove", str2, chatInterface2);
                            }
                            xw3.L(un0.z(y11Var), null, null, new l0(y11Var, message2, null, 19), 3);
                            alertDialog.dismiss();
                            break;
                        case 2:
                            ChatInterface chatInterface3 = ((us2) y11Var).y;
                            if (chatInterface3 != null) {
                                nv.t(context2, "report", str2, chatInterface3);
                            }
                            message2.setReported(true);
                            yzc yzcVar = y11Var.j;
                            Context i3 = y11Var.i();
                            ChatUser user3 = message2.getUser();
                            yzcVar.j(i3.getString(R.string.user_reported, user3 != null ? user3.getName() : null));
                            ChatInterface chatInterface4 = ((us2) y11Var).y;
                            Integer valueOf = chatInterface4 != null ? Integer.valueOf(chatInterface4.getChatId()) : null;
                            if (valueOf != null) {
                                Context i4 = y11Var.i();
                                Pair[] pairArr = {new Pair("ACTION", "CHAT_REPORT_CAST_ACTION"), new Pair("EVENT_ID", valueOf), new Pair("MESSAGE_TIMESTAMP", Long.valueOf(message2.getTimestamp())), new Pair("REPORT_TIMESTAMP", Long.valueOf(System.currentTimeMillis() / 1000))};
                                hpo hpoVar = new hpo(18);
                                for (int i5 = 0; i5 < 4; i5++) {
                                    Pair pair = pairArr[i5];
                                    hpoVar.B(pair.b, (String) pair.a);
                                }
                                md4 l = hpoVar.l();
                                vxd.h(i4).b("ChatMessageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(ChatMessageWorker.class, l).a());
                                int i6 = EventDetailsFragment.U0 + 1;
                                EventDetailsFragment.U0 = i6;
                                xw3.L(un0.z(y11Var), null, null, new x11(y11Var, message2, i6 > 6 ? "virtual-report" : "report", null), 3);
                            }
                            alertDialog.dismiss();
                            break;
                        default:
                            y11 y11Var3 = us2Var;
                            ChatInterface chatInterface5 = ((us2) y11Var3).y;
                            if (chatInterface5 != null) {
                                nv.t(context2, "warn", str2, chatInterface5);
                            }
                            xw3.L(un0.z(y11Var3), null, null, new w11(y11Var3, message, new BanReason(BanReason.Type.OTHER, "none"), null, 2), 3);
                            alertDialog.dismiss();
                            break;
                    }
                }
            });
            h2.setView((ConstraintLayout) f2.b);
            h2.show();
            return;
        }
        if (ordinal == 2) {
            final AlertDialog h3 = lnb.h(R.style.RedesignDialog, context);
            z82 f3 = z82.f(LayoutInflater.from(context));
            MaterialButton materialButton5 = (MaterialButton) f3.c;
            MaterialButton materialButton6 = (MaterialButton) f3.f;
            ((TextView) f3.g).setText(context.getString(R.string.are_you_sure));
            TextView textView3 = (TextView) f3.e;
            ChatUser user3 = message.getUser();
            textView3.setText(context.getString(R.string.chat_warning_description, user3 != null ? user3.getName() : null));
            materialButton6.setText(context.getString(R.string.button_warn_user));
            materialButton5.setText(context.getString(R.string.cancel));
            materialButton5.setOnClickListener(new wn(h3, 5));
            final int i3 = 3;
            materialButton6.setOnClickListener(new View.OnClickListener() { // from class: rr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i3;
                    Message message2 = message;
                    y11 y11Var = us2Var;
                    String str2 = str;
                    Context context2 = context;
                    AlertDialog alertDialog = h3;
                    switch (i22) {
                        case 0:
                            y11 y11Var2 = us2Var;
                            ChatInterface chatInterface = ((us2) y11Var2).y;
                            if (chatInterface != null) {
                                nv.t(context2, "perma_ban", str2, chatInterface);
                            }
                            xw3.L(un0.z(y11Var2), null, null, new w11(y11Var2, message, new BanReason(BanReason.Type.OTHER, "none"), null, 1), 3);
                            alertDialog.dismiss();
                            break;
                        case 1:
                            ChatInterface chatInterface2 = ((us2) y11Var).y;
                            if (chatInterface2 != null) {
                                nv.t(context2, "remove", str2, chatInterface2);
                            }
                            xw3.L(un0.z(y11Var), null, null, new l0(y11Var, message2, null, 19), 3);
                            alertDialog.dismiss();
                            break;
                        case 2:
                            ChatInterface chatInterface3 = ((us2) y11Var).y;
                            if (chatInterface3 != null) {
                                nv.t(context2, "report", str2, chatInterface3);
                            }
                            message2.setReported(true);
                            yzc yzcVar = y11Var.j;
                            Context i32 = y11Var.i();
                            ChatUser user32 = message2.getUser();
                            yzcVar.j(i32.getString(R.string.user_reported, user32 != null ? user32.getName() : null));
                            ChatInterface chatInterface4 = ((us2) y11Var).y;
                            Integer valueOf = chatInterface4 != null ? Integer.valueOf(chatInterface4.getChatId()) : null;
                            if (valueOf != null) {
                                Context i4 = y11Var.i();
                                Pair[] pairArr = {new Pair("ACTION", "CHAT_REPORT_CAST_ACTION"), new Pair("EVENT_ID", valueOf), new Pair("MESSAGE_TIMESTAMP", Long.valueOf(message2.getTimestamp())), new Pair("REPORT_TIMESTAMP", Long.valueOf(System.currentTimeMillis() / 1000))};
                                hpo hpoVar = new hpo(18);
                                for (int i5 = 0; i5 < 4; i5++) {
                                    Pair pair = pairArr[i5];
                                    hpoVar.B(pair.b, (String) pair.a);
                                }
                                md4 l = hpoVar.l();
                                vxd.h(i4).b("ChatMessageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(ChatMessageWorker.class, l).a());
                                int i6 = EventDetailsFragment.U0 + 1;
                                EventDetailsFragment.U0 = i6;
                                xw3.L(un0.z(y11Var), null, null, new x11(y11Var, message2, i6 > 6 ? "virtual-report" : "report", null), 3);
                            }
                            alertDialog.dismiss();
                            break;
                        default:
                            y11 y11Var3 = us2Var;
                            ChatInterface chatInterface5 = ((us2) y11Var3).y;
                            if (chatInterface5 != null) {
                                nv.t(context2, "warn", str2, chatInterface5);
                            }
                            xw3.L(un0.z(y11Var3), null, null, new w11(y11Var3, message, new BanReason(BanReason.Type.OTHER, "none"), null, 2), 3);
                            alertDialog.dismiss();
                            break;
                    }
                }
            });
            h3.setView((ConstraintLayout) f3.b);
            h3.show();
            return;
        }
        if (ordinal != 3) {
            if (ordinal != 4) {
                zzl.b();
                return;
            }
            final AlertDialog h4 = lnb.h(R.style.RedesignDialog, context);
            z82 f4 = z82.f(LayoutInflater.from(context));
            MaterialButton materialButton7 = (MaterialButton) f4.c;
            MaterialButton materialButton8 = (MaterialButton) f4.f;
            ((TextView) f4.g).setText(context.getString(R.string.permanently_ban_user_title));
            TextView textView4 = (TextView) f4.e;
            ChatUser user4 = message.getUser();
            textView4.setText(context.getString(R.string.permanently_ban_user_description, user4 != null ? user4.getName() : null));
            materialButton8.setText(context.getString(R.string.button_ban_forever));
            materialButton7.setText(context.getString(R.string.cancel));
            materialButton7.setOnClickListener(new wn(h4, 3));
            final int i4 = 0;
            materialButton8.setOnClickListener(new View.OnClickListener() { // from class: rr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i4;
                    Message message2 = message;
                    y11 y11Var = us2Var;
                    String str2 = str;
                    Context context2 = context;
                    AlertDialog alertDialog = h4;
                    switch (i22) {
                        case 0:
                            y11 y11Var2 = us2Var;
                            ChatInterface chatInterface = ((us2) y11Var2).y;
                            if (chatInterface != null) {
                                nv.t(context2, "perma_ban", str2, chatInterface);
                            }
                            xw3.L(un0.z(y11Var2), null, null, new w11(y11Var2, message, new BanReason(BanReason.Type.OTHER, "none"), null, 1), 3);
                            alertDialog.dismiss();
                            break;
                        case 1:
                            ChatInterface chatInterface2 = ((us2) y11Var).y;
                            if (chatInterface2 != null) {
                                nv.t(context2, "remove", str2, chatInterface2);
                            }
                            xw3.L(un0.z(y11Var), null, null, new l0(y11Var, message2, null, 19), 3);
                            alertDialog.dismiss();
                            break;
                        case 2:
                            ChatInterface chatInterface3 = ((us2) y11Var).y;
                            if (chatInterface3 != null) {
                                nv.t(context2, "report", str2, chatInterface3);
                            }
                            message2.setReported(true);
                            yzc yzcVar = y11Var.j;
                            Context i32 = y11Var.i();
                            ChatUser user32 = message2.getUser();
                            yzcVar.j(i32.getString(R.string.user_reported, user32 != null ? user32.getName() : null));
                            ChatInterface chatInterface4 = ((us2) y11Var).y;
                            Integer valueOf = chatInterface4 != null ? Integer.valueOf(chatInterface4.getChatId()) : null;
                            if (valueOf != null) {
                                Context i42 = y11Var.i();
                                Pair[] pairArr = {new Pair("ACTION", "CHAT_REPORT_CAST_ACTION"), new Pair("EVENT_ID", valueOf), new Pair("MESSAGE_TIMESTAMP", Long.valueOf(message2.getTimestamp())), new Pair("REPORT_TIMESTAMP", Long.valueOf(System.currentTimeMillis() / 1000))};
                                hpo hpoVar = new hpo(18);
                                for (int i5 = 0; i5 < 4; i5++) {
                                    Pair pair = pairArr[i5];
                                    hpoVar.B(pair.b, (String) pair.a);
                                }
                                md4 l = hpoVar.l();
                                vxd.h(i42).b("ChatMessageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(ChatMessageWorker.class, l).a());
                                int i6 = EventDetailsFragment.U0 + 1;
                                EventDetailsFragment.U0 = i6;
                                xw3.L(un0.z(y11Var), null, null, new x11(y11Var, message2, i6 > 6 ? "virtual-report" : "report", null), 3);
                            }
                            alertDialog.dismiss();
                            break;
                        default:
                            y11 y11Var3 = us2Var;
                            ChatInterface chatInterface5 = ((us2) y11Var3).y;
                            if (chatInterface5 != null) {
                                nv.t(context2, "warn", str2, chatInterface5);
                            }
                            xw3.L(un0.z(y11Var3), null, null, new w11(y11Var3, message, new BanReason(BanReason.Type.OTHER, "none"), null, 2), 3);
                            alertDialog.dismiss();
                            break;
                    }
                }
            });
            h4.setView((ConstraintLayout) f4.b);
            h4.show();
            return;
        }
        AlertDialog h5 = lnb.h(R.style.RedesignDialog, context);
        int i5 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ban_layout, (ViewGroup) null, false);
        int i6 = R.id.action_button;
        MaterialButton materialButton9 = (MaterialButton) nq8.B(R.id.action_button, inflate);
        if (materialButton9 != null) {
            i6 = R.id.ban_edit_text;
            TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.ban_edit_text, inflate);
            if (textInputEditText != null) {
                i6 = R.id.ban_message;
                TextView textView5 = (TextView) nq8.B(R.id.ban_message, inflate);
                if (textView5 != null) {
                    i6 = R.id.ban_radio_group;
                    RadioGroup radioGroup = (RadioGroup) nq8.B(R.id.ban_radio_group, inflate);
                    if (radioGroup != null) {
                        i6 = R.id.cancel_button;
                        MaterialButton materialButton10 = (MaterialButton) nq8.B(R.id.cancel_button, inflate);
                        if (materialButton10 != null) {
                            i6 = R.id.description_text_layout;
                            if (((SofaTextInputLayout) nq8.B(R.id.description_text_layout, inflate)) != null) {
                                i6 = R.id.title;
                                TextView textView6 = (TextView) nq8.B(R.id.title, inflate);
                                if (textView6 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    ez0 ez0Var = new ez0(constraintLayout, materialButton9, textInputEditText, textView5, radioGroup, materialButton10, textView6);
                                    ChatUser user5 = message.getUser();
                                    textView6.setText(context.getString(R.string.ban_user_title, user5 != null ? user5.getName() : null));
                                    ChatUser user6 = message.getUser();
                                    textView5.setText(context.getString(R.string.ban_user_description, user6 != null ? user6.getName() : null));
                                    radioGroup.setOnCheckedChangeListener(new sr2(i5, ez0Var, context));
                                    textInputEditText.setOnFocusChangeListener(new tr2());
                                    materialButton9.setOnClickListener(new j32(us2Var, ez0Var, message, h5, context, str, 1));
                                    materialButton10.setOnClickListener(new cn(15, ez0Var, h5));
                                    h5.setView(constraintLayout);
                                    h5.show();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
