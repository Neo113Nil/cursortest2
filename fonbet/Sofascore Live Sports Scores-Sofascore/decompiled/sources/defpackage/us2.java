package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.GoogleTranslate;
import com.sofascore.model.chat.ChatImage;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.DbChatMessage;
import com.sofascore.model.chat.Message;
import com.sofascore.model.chat.TeamOfTheRoundChatInterface;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.chat.ChatImageUrls;
import com.sofascore.model.newNetwork.PostChatMessage;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lus2;", "Ly11;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class us2 extends y11 {
    public final yzc A;
    public final yzc B;
    public final yzc C;
    public final yzc D;
    public final Pattern E;
    public final String F;
    public final Message G;
    public final cs2 q;
    public final s96 r;
    public final cs2 s;
    public final cg4 t;
    public final fdi u;
    public final jof v;
    public final aeh w;
    public final hof x;
    public final ChatInterface y;
    public final ChatUser z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v4, types: [rq3] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence[], java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public us2(cs2 cs2Var, s96 s96Var, cs2 cs2Var2, cg4 cg4Var, Application application, fqg fqgVar) {
        super(application, cs2Var);
        Message message;
        String str;
        String emptyStateMessageText;
        cs2Var.getClass();
        s96Var.getClass();
        cs2Var2.getClass();
        cg4Var.getClass();
        fqgVar.getClass();
        this.q = cs2Var;
        this.r = s96Var;
        this.s = cs2Var2;
        this.t = cg4Var;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        fdi a = gdi.a(null);
        this.u = a;
        this.v = un0.u(a);
        aeh b = beh.b(0, 0, null, 7);
        this.w = b;
        this.x = un0.t(b);
        xw3.L(un0.z(this), null, null, new ps2(this, r1, 0), 3);
        ChatInterface chatInterface = (ChatInterface) fqgVar.a("CHAT_INTERFACE_OBJECT");
        this.y = chatInterface;
        ia0 ia0Var = ia0.q;
        this.z = jca.D(ok3.p().e());
        yzc yzcVar = new yzc();
        this.A = yzcVar;
        this.B = yzcVar;
        yzc yzcVar2 = new yzc();
        this.C = yzcVar2;
        this.D = yzcVar2;
        Pattern compile = Pattern.compile("^[0-9 ?!.:,+/\\-]+$");
        compile.getClass();
        this.E = compile;
        String str2 = (String) fqgVar.a("NATS_CHANNEL_TYPE");
        if (str2 == null) {
            str2 = (chatInterface != null ? chatInterface.getChannelName() : null) + "." + (chatInterface != null ? Integer.valueOf(chatInterface.getChatId()) : null);
        }
        this.F = str2;
        TeamOfTheRoundChatInterface teamOfTheRoundChatInterface = chatInterface instanceof TeamOfTheRoundChatInterface ? (TeamOfTheRoundChatInterface) chatInterface : null;
        String str3 = (teamOfTheRoundChatInterface == null || (emptyStateMessageText = teamOfTheRoundChatInterface.getEmptyStateMessageText()) == null || StringsKt.R(emptyStateMessageText)) ? null : emptyStateMessageText;
        if (str3 != null) {
            String emptyStateMessageUsername = teamOfTheRoundChatInterface.getEmptyStateMessageUsername();
            if (emptyStateMessageUsername != null) {
                str = StringsKt.R(emptyStateMessageUsername) ? null : emptyStateMessageUsername;
            }
            str = "Sofascore";
            message = new Message(str3, new ChatUser("sofascore", str, false, false, false, false, (String) null, (String) null, 0, 0, (UserBadge) null, 2044, (DefaultConstructorMarker) null), System.currentTimeMillis() / 1000, 0, 0, false, 56, null);
            message.setAvatarOverrideRes(teamOfTheRoundChatInterface.getEmptyStateMessageAvatarRes());
        } else {
            CharSequence text = i().getText(R.string.chat_empty_start);
            CharSequence text2 = i().getText(R.string.chat_empty_waiting);
            CharSequence text3 = i().getText(R.string.chat_empty_hot_takes);
            if ((chatInterface instanceof Event) && !Intrinsics.c(chatInterface.getStatusType(), StatusKt.STATUS_FINISHED) && !Intrinsics.c(chatInterface.getStatusType(), StatusKt.STATUS_CANCELED)) {
                r1 = i().getText(R.string.chat_empty_predictions);
            }
            message = new Message(CollectionsKt.A0(ph0.x(new CharSequence[]{text, text2, text3, r1, i().getText(R.string.chat_empty_dull), i().getText(R.string.chat_empty_your_space)}), glf.a).toString(), new ChatUser("sofascore", "Sofascore", false, false, false, false, (String) null, (String) null, 0, 0, (UserBadge) null, 2044, (DefaultConstructorMarker) null), System.currentTimeMillis() / 1000, 0, 0, false, 56, null);
        }
        this.G = message;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Message[] messageArr, sq3 sq3Var) {
        ss2 ss2Var;
        int i;
        ChatInterface chatInterface;
        if (sq3Var instanceof ss2) {
            ss2Var = (ss2) sq3Var;
            int i2 = ss2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ss2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = ss2Var.s;
                lu3 lu3Var = lu3.a;
                i = ss2Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    ss2Var.r = messageArr;
                    ss2Var.u = 1;
                    obj = gz8.U(ss2Var, this.s.a.a, true, false, new b42(15));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    messageArr = ss2Var.r;
                    y6a.M(obj);
                }
                List<DbChatMessage> list = (List) obj;
                chatInterface = this.y;
                if (chatInterface != null) {
                    return Unit.a;
                }
                int chatId = chatInterface.getChatId();
                for (Message message : messageArr) {
                    for (DbChatMessage dbChatMessage : list) {
                        if (dbChatMessage.getEventId() == chatId && dbChatMessage.getMessageTimestamp() == message.getTimestamp()) {
                            if (dbChatMessage.isVoted()) {
                                message.setVoted(true);
                            } else if (dbChatMessage.isReported()) {
                                message.setReported(true);
                            }
                        }
                    }
                }
                return Unit.a;
            }
        }
        ss2Var = new ss2(this, sq3Var);
        Object obj2 = ss2Var.s;
        lu3 lu3Var2 = lu3.a;
        i = ss2Var.u;
        if (i != 0) {
        }
        List<DbChatMessage> list2 = (List) obj2;
        chatInterface = this.y;
        if (chatInterface != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(String str, List list, String str2, Integer num) {
        String str3;
        LinkedHashMap linkedHashMap;
        ChatImage chatImage;
        String str4 = null;
        Object[] objArr = 0;
        if (list == null || list.isEmpty()) {
            str3 = null;
            linkedHashMap = null;
        } else {
            String src = ((GoogleTranslate) CollectionsKt.Y(list)).getSrc();
            int c = sub.c(k13.r(list, 10));
            if (c < 16) {
                c = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleTranslate googleTranslate = (GoogleTranslate) it.next();
                linkedHashMap2.put(googleTranslate.getTargetLang(), googleTranslate.getTranslation());
            }
            str3 = src;
            linkedHashMap = linkedHashMap2;
        }
        yzc yzcVar = this.l;
        ChatImageUrls chatImageUrls = (ChatImageUrls) yzcVar.d();
        if (chatImageUrls != null) {
            ChatImage chatImage2 = new ChatImage(chatImageUrls.getFullUrl(), chatImageUrls.getThumbnailUrl());
            yzcVar.j(null);
            chatImage = chatImage2;
        } else {
            chatImage = null;
        }
        PostChatMessage postChatMessage = new PostChatMessage(str, str3, linkedHashMap, chatImage, str2, num);
        String str5 = this.F;
        str5.getClass();
        xw3.L(un0.z(this), null, null, new g2((Object) this, (Object) str5, (Object) postChatMessage, (rq3) (objArr == true ? 1 : 0), 12), 3);
        ChatInterface chatInterface = this.y;
        if (chatInterface != null) {
            Context i = i();
            boolean z = chatImage != null;
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            firebaseBundle.putInt("id", chatInterface.getChatId());
            if (str.length() > 0 && z) {
                str4 = "text_with_image";
            } else if (str.length() > 0) {
                str4 = "text";
            } else if (z) {
                str4 = "image";
            }
            firebaseBundle.putString("category", str4);
            firebaseBundle.putString("type", nv.u(chatInterface));
            nv.N(i, firebaseBundle, "chat_message");
        }
    }
}
