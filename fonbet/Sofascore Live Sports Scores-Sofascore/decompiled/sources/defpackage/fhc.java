package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.model.Section;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.results.R;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fhc extends g7 implements vqf {
    public boolean l;
    public final p1 m;
    public final k1 n;
    public final LayoutInflater o;
    public final SharedPreferences p;
    public String q;
    public Set r;
    public boolean s;
    public ChatUser t;
    public final ArrayList u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhc(Context context, boolean z, p1 p1Var, k1 k1Var) {
        super(context);
        SharedPreferences d;
        context.getClass();
        this.l = z;
        this.m = p1Var;
        this.n = k1Var;
        this.o = LayoutInflater.from(context);
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        this.p = sharedPreferences;
        this.u = new ArrayList();
    }

    @Override // defpackage.g7
    public final void F(List list) {
        Section H;
        ArrayList k = me4.k(list);
        int i = 0;
        Object obj = null;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            ArrayList arrayList = this.u;
            if (i == 0) {
                Message message = obj2 instanceof Message ? (Message) obj2 : null;
                if (message != null) {
                    long timestamp = message.getTimestamp();
                    long timestamp2 = message.getTimestamp();
                    bi4 bi4Var = bi4.PATTERN_DMY;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    k.add(new Section(I(timestamp, fc6.i(timestamp2, hk4.a(bi4Var.d())))));
                    arrayList.add(Integer.valueOf(k.size() - 1));
                }
            }
            if ((obj instanceof Message) && (obj2 instanceof Message) && (H = H(((Message) obj).getTimestamp(), ((Message) obj2).getTimestamp())) != null) {
                k.add(H);
                arrayList.add(Integer.valueOf(k.size() - 1));
            }
            k.add(obj2);
            obj = obj2;
            i = i2;
        }
        super.F(k);
    }

    public final void G(Message message) {
        Section H;
        boolean isDeleted = message.getIsDeleted();
        ArrayList arrayList = this.u;
        ArrayList arrayList2 = this.i;
        if (isDeleted) {
            int indexOf = arrayList2.indexOf(message);
            int i = indexOf - 1;
            if (CollectionsKt.a0(i, arrayList2) instanceof Section) {
                int i2 = indexOf + 1;
                if ((CollectionsKt.a0(i2, arrayList2) instanceof Section) || i2 == arrayList2.size()) {
                    i5k.a(arrayList).remove(arrayList2.get(i));
                    Object obj = arrayList2.get(i);
                    obj.getClass();
                    D(obj);
                }
            }
            D(message);
            return;
        }
        if (arrayList2.contains(message)) {
            int indexOf2 = arrayList2.indexOf(message);
            if (indexOf2 > -1) {
                arrayList2.set(indexOf2, message);
                notifyItemChanged(this.g.size() + indexOf2);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (!arrayList3.isEmpty()) {
            Object j0 = CollectionsKt.j0(arrayList3);
            Message message2 = j0 instanceof Message ? (Message) j0 : null;
            if (message2 != null && (H = H(message2.getTimestamp(), message.getTimestamp())) != null) {
                arrayList3.add(H);
                arrayList.add(Integer.valueOf(arrayList3.size() - 1));
            }
        }
        arrayList3.add(message);
        super.F(arrayList3);
    }

    public final Section H(long j, long j2) {
        bi4 bi4Var = bi4.PATTERN_DMY;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String i = fc6.i(j2, hk4.a(bi4Var.d()));
        String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(j));
        format.getClass();
        if (format.equals(i)) {
            return null;
        }
        return new Section(I(j2, i));
    }

    public final String I(long j, String str) {
        boolean u = ug5.u(j);
        Context context = this.b;
        if (u) {
            String string = context.getString(R.string.today);
            string.getClass();
            return string;
        }
        if (ug5.w(j)) {
            String string2 = context.getString(R.string.yesterday);
            string2.getClass();
            return string2;
        }
        Instant now = Instant.now();
        Instant ofEpochSecond = Instant.ofEpochSecond(j);
        Instant minus = now.minus((TemporalAmount) Duration.ofHours(168L));
        if (!ofEpochSecond.isAfter(minus) && !ofEpochSecond.equals(minus)) {
            return str;
        }
        bi4 bi4Var = bi4.PATTERN_DAY;
        Locale locale = Locale.getDefault();
        locale.getClass();
        ZoneId systemDefault = ZoneId.systemDefault();
        systemDefault.getClass();
        return fc6.i(j, DateTimeFormatter.ofPattern(bi4Var.d(), locale).withZone(systemDefault).withDecimalStyle(DecimalStyle.of(locale)));
    }

    public final ChatUser J() {
        ChatUser chatUser = this.t;
        if (chatUser != null) {
            return chatUser;
        }
        Intrinsics.i("user");
        throw null;
    }

    @Override // defpackage.vqf
    public final Object f(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).intValue() <= i && i != 0) {
                arrayList.add(next);
            }
        }
        Integer num = (Integer) CollectionsKt.k0(arrayList);
        if (num == null) {
            return null;
        }
        Object obj = this.i.get(num.intValue());
        if (obj instanceof Section) {
            return (Section) obj;
        }
        return null;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 5);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (!(obj instanceof Message)) {
            if (obj instanceof Section) {
                ehc[] ehcVarArr = ehc.a;
                return 5;
            }
            ilg.c();
            return 0;
        }
        if (this.l && !((Message) obj).getIsSystem()) {
            ehc[] ehcVarArr2 = ehc.a;
            return 4;
        }
        if (this.l && ((Message) obj).getIsSystem()) {
            ehc[] ehcVarArr3 = ehc.a;
            return 1;
        }
        Message message = (Message) obj;
        if (message.getIsSystem()) {
            ehc[] ehcVarArr4 = ehc.a;
            return 0;
        }
        ChatUser user = message.getUser();
        if (Intrinsics.c(user != null ? user.getId() : null, J().getId())) {
            ehc[] ehcVarArr5 = ehc.a;
            return 2;
        }
        ehc[] ehcVarArr6 = ehc.a;
        return 3;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        ehc[] ehcVarArr = ehc.a;
        int i2 = R.id.user_message;
        LayoutInflater layoutInflater = this.o;
        ejg ejgVar = this.a;
        if (i == 2) {
            View inflate = layoutInflater.inflate(R.layout.chat_message_user, viewGroup, false);
            int i3 = R.id.auto_translated;
            if (((TextView) nq8.B(R.id.auto_translated, inflate)) != null) {
                i3 = R.id.flag;
                if (((ImageView) nq8.B(R.id.flag, inflate)) != null) {
                    if (((CircularProgressIndicator) nq8.B(R.id.progress_chat, inflate)) != null) {
                        i3 = R.id.replied_text_message;
                        View B = nq8.B(R.id.replied_text_message, inflate);
                        if (B != null) {
                            e92.a(B);
                            i3 = R.id.separator;
                            if (nq8.B(R.id.separator, inflate) != null) {
                                i3 = R.id.text_container;
                                if (((MaterialCardView) nq8.B(R.id.text_container, inflate)) != null) {
                                    if (((ShapeableImageView) nq8.B(R.id.thumbnail, inflate)) != null) {
                                        i3 = R.id.timestamp;
                                        if (((TextView) nq8.B(R.id.timestamp, inflate)) != null) {
                                            i3 = R.id.user_logo;
                                            View B2 = nq8.B(R.id.user_logo, inflate);
                                            if (B2 != null) {
                                                dd.a(B2);
                                                if (((TextView) nq8.B(R.id.user_message, inflate)) != null) {
                                                    i2 = R.id.user_name;
                                                    if (((TextView) nq8.B(R.id.user_name, inflate)) != null) {
                                                        i2 = R.id.user_role;
                                                        if (((TextView) nq8.B(R.id.user_role, inflate)) != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                            constraintLayout.getClass();
                                                            return new nr2(constraintLayout, true, new tj4(0, 16, fhc.class, this, "user", "getUser()Lcom/sofascore/model/chat/ChatUser;"), new tj4(0, 17, fhc.class, this, "excludedSet", "getExcludedSet()Ljava/util/Set;"), new tj4(0, 18, fhc.class, this, "language", "getLanguage()Ljava/lang/String;"), new dhc(this, 0), (ct8) ejgVar.d, null);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = R.id.thumbnail;
                                    }
                                }
                            }
                        }
                    } else {
                        i2 = R.id.progress_chat;
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                    return null;
                }
            }
            i2 = i3;
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i == 3) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) zl.b(layoutInflater.inflate(R.layout.chat_message, viewGroup, false)).b;
            constraintLayout2.getClass();
            return new nr2(constraintLayout2, false, new tj4(0, 19, fhc.class, this, "user", "getUser()Lcom/sofascore/model/chat/ChatUser;"), new tj4(0, 20, fhc.class, this, "excludedSet", "getExcludedSet()Ljava/util/Set;"), new tj4(0, 21, fhc.class, this, "language", "getLanguage()Ljava/lang/String;"), new dhc(this, 1), (ct8) ejgVar.d, new faa(this, 23));
        }
        if (i == 4) {
            View inflate2 = layoutInflater.inflate(R.layout.chat_message_redesign, viewGroup, false);
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.progress_chat, inflate2);
            if (circularProgressIndicator != null) {
                ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.thumbnail, inflate2);
                if (shapeableImageView != null) {
                    TextView textView = (TextView) nq8.B(R.id.user_message, inflate2);
                    if (textView != null) {
                        return new mr2(new ez0((ConstraintLayout) inflate2, circularProgressIndicator, shapeableImageView, textView, 3), new tj4(0, 11, fhc.class, this, "user", "getUser()Lcom/sofascore/model/chat/ChatUser;"), new tj4(0, 12, fhc.class, this, "excludedSet", "getExcludedSet()Ljava/util/Set;"), new tj4(0, 13, fhc.class, this, "language", "getLanguage()Ljava/lang/String;"), new dhc(this, 2), (ct8) ejgVar.d, this.m);
                    }
                } else {
                    i2 = R.id.thumbnail;
                }
            } else {
                i2 = R.id.progress_chat;
            }
            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            return null;
        }
        Context context = this.b;
        if (i == 0) {
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.chat_system_message, viewGroup, false);
            TextView textView2 = (TextView) nq8.B(R.id.message, inflate3);
            if (textView2 != null) {
                return new gri(new dk2((LinearLayout) inflate3, textView2, 1), new tj4(0, 14, fhc.class, this, "user", "getUser()Lcom/sofascore/model/chat/ChatUser;"), (ct8) ejgVar.d);
            }
            yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(R.id.message)));
            return null;
        }
        if (i != 1) {
            if (i == 5) {
                return new ja9(cr2.a(LayoutInflater.from(context), viewGroup));
            }
            ilg.c();
            return null;
        }
        View inflate4 = LayoutInflater.from(context).inflate(R.layout.chat_system_redesign_message, viewGroup, false);
        TextView textView3 = (TextView) nq8.B(R.id.message, inflate4);
        if (textView3 != null) {
            return new iri(new dk2((LinearLayout) inflate4, textView3, 2), new tj4(0, 15, fhc.class, this, "user", "getUser()Lcom/sofascore/model/chat/ChatUser;"));
        }
        yhk.s("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(R.id.message)));
        return null;
    }
}
