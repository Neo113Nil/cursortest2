package com.vk.pushes.notifications.base;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.pushes.NotificationUtils;
import com.vk.pushes.notifications.base.PushButton;
import com.vk.pushes.receivers.NotificationDeleteReceiver;
import com.vkontakte.android.R;
import io.appmetrica.analytics.impl.L2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.abq;
import xsna.bpn0;
import xsna.ca70;
import xsna.epx;
import xsna.fai;
import xsna.fkq0;
import xsna.gd70;
import xsna.gz80;
import xsna.hlu0;
import xsna.i35;
import xsna.j1a0;
import xsna.j5g;
import xsna.kvf0;
import xsna.msy;
import xsna.n770;
import xsna.o25;
import xsna.oqh0;
import xsna.orj0;
import xsna.pn00;
import xsna.ri6;
import xsna.t2i0;
import xsna.v57;
import xsna.w8i;
import xsna.x2r0;
import xsna.x870;
import xsna.xpg0;
import xsna.yfb;
import xsna.z260;

/* compiled from: SimpleNotification.kt */
/* loaded from: classes5.dex */
public abstract class a extends ri6 implements w8i {
    public final Context c;
    public final Bitmap d;
    public final Bitmap e;
    public final File f;
    public final bpn0 g;
    public final bpn0 h;
    public final C1751a i;
    public final String j;
    public final int k;
    public final String l;
    public final Map<String, String> m;
    public final CharSequence n;
    public final CharSequence o;
    public final CharSequence p;
    public final Object q;
    public final NotificationUtils.Type r;
    public final String s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final Object w;

    /* compiled from: SimpleNotification.kt */
    /* renamed from: com.vk.pushes.notifications.base.a$a, reason: collision with other inner class name */
    public static class C1751a {
        public final Map<String, String> b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final ArrayList j;
        public final UserId k;
        public final boolean l;

        public C1751a(Map<String, String> map) {
            this.b = map;
            String str = map.get("id");
            this.c = str == null ? "local_default" : str;
            this.d = map.get("group_id");
            this.e = map.get("title");
            this.f = map.get("subtitle");
            this.g = map.get("body");
            this.h = map.get("icon");
            this.i = map.get("category");
            String str2 = map.get("buttons");
            ArrayList arrayList = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    ArrayList arrayList2 = new ArrayList(jSONArray.length());
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            Serializer.c<PushButton> cVar = PushButton.CREATOR;
                            arrayList2.add(PushButton.a.a(optJSONObject));
                        }
                    }
                    arrayList = arrayList2;
                } catch (JSONException unused) {
                }
            }
            this.j = arrayList;
            String str3 = map.get("to_id");
            long j = 0;
            if (str3 != null) {
                byte[] bArr = x2r0.a;
                try {
                    j = Long.parseLong(str3);
                } catch (NumberFormatException unused2) {
                }
            }
            this.k = new UserId(j);
            this.l = epx.f(map.get("sound"), "1");
        }

        public final String a(String str) {
            return this.b.get(str);
        }

        public final String d() {
            return this.h;
        }

        public final String getTitle() {
            return this.e;
        }
    }

    public /* synthetic */ a(Context context, C1751a c1751a) {
        this(context, c1751a, null, null, null);
    }

    public final boolean A() {
        return ((v57) this.h.getValue()).g();
    }

    public final CharSequence B(CharSequence charSequence) {
        return A() ? "" : charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0215  */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ri6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Notification a() {
        String str;
        NotificationCompat.h hVar;
        boolean a;
        Bitmap bitmap;
        Bundle bundle;
        Map<String, String> map;
        PendingIntent r;
        String u;
        NotificationCompat.m x;
        CharSequence charSequence;
        int i;
        Notification notification;
        ArrayList arrayList;
        Notification notification2;
        int i2;
        int i3;
        Intent k;
        PushButton.Action action;
        File file;
        NotificationCompat.l lVar;
        C1751a c1751a = this.i;
        String str2 = c1751a.h;
        ArrayList arrayList2 = c1751a.j;
        int o = str2 != null ? fai.o(str2) : 0;
        if (o == 0) {
            o = R.drawable.vk_icon_new_logo_vk_24;
        }
        x870 x870Var = x870.a;
        boolean a2 = gz80.a(26);
        Context context = this.c;
        if (a2) {
            ca70 ca70Var = ca70.a;
            if (ca70.f(context).getNotificationChannel(c()) != null) {
                str = c();
                hVar = new NotificationCompat.h(context, str);
                a = gz80.a(28);
                CharSequence charSequence2 = this.n;
                bitmap = this.d;
                CharSequence charSequence3 = this.p;
                if (a && (file = this.f) != null && file.exists()) {
                    NotificationCompat.m x2 = x();
                    lVar = !(x2 instanceof NotificationCompat.l) ? (NotificationCompat.l) x2 : null;
                    if (lVar != null) {
                        IconCompat c = bitmap != null ? IconCompat.c(bitmap) : null;
                        CharSequence charSequence4 = charSequence3 == null ? "" : charSequence3;
                        j1a0 j1a0Var = new j1a0();
                        j1a0Var.a = charSequence2;
                        j1a0Var.b = c;
                        j1a0Var.c = null;
                        j1a0Var.d = null;
                        j1a0Var.e = false;
                        j1a0Var.f = false;
                        NotificationCompat.l lVar2 = lVar;
                        NotificationCompat.l.d dVar = new NotificationCompat.l.d("", 0L, j1a0Var);
                        abq.a(dVar, file);
                        lVar2.f(dVar);
                        if (charSequence4.length() > 0) {
                            lVar2.f(new NotificationCompat.l.d(charSequence4, 0L, j1a0Var));
                        }
                    }
                }
                hVar.k(charSequence2);
                hVar.j(charSequence3);
                hVar.D(charSequence3);
                hVar.n(2, false);
                Notification notification3 = hVar.I;
                notification3.icon = o;
                hVar.u = q();
                hVar.e(y());
                Bundle bundle2 = new Bundle();
                bundle2.putString("group_id_extra_key", t());
                bundle = hVar.v;
                if (bundle != null) {
                    hVar.v = new Bundle(bundle2);
                } else {
                    bundle.putAll(bundle2);
                }
                int i4 = 1;
                map = this.m;
                if (map != null && map.containsKey("hide_content")) {
                    hVar.J = true;
                    hVar.A(null);
                    hVar.l(0);
                    hVar.k = 0;
                }
                r = r();
                if (r != null) {
                    hVar.g = r;
                }
                notification3.deleteIntent = (PendingIntent) this.b.getValue();
                if (bitmap != null) {
                    hVar.q(bitmap);
                }
                u = u();
                if (u != null) {
                    hVar.r = u;
                }
                x = x();
                if (x != null) {
                    if (A()) {
                        x = n();
                    }
                    hVar.B(x);
                }
                charSequence = this.o;
                if (charSequence != null && charSequence.length() != 0) {
                    hVar.C(charSequence);
                }
                if (A()) {
                    ?? r9 = this.q;
                    if (arrayList2 == null || arrayList2.isEmpty() || !z() || !((Collection) r9.getValue()).isEmpty()) {
                        i = 1;
                        notification = notification3;
                        Collection collection = (Collection) r9.getValue();
                        if ((collection instanceof List) && (collection instanceof RandomAccess)) {
                            List list = (List) collection;
                            int size = list.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                hVar.b((NotificationCompat.a) list.get(i5));
                            }
                        } else {
                            Iterator it = collection.iterator();
                            while (it.hasNext()) {
                                hVar.b((NotificationCompat.a) it.next());
                            }
                        }
                    } else {
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        int size2 = arrayList2.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            PushButton pushButton = (PushButton) arrayList2.get(i6);
                            PushButton.Action action2 = pushButton.c;
                            String str3 = action2 != null ? action2.b : null;
                            int i7 = i4;
                            if (str3 != null) {
                                int hashCode = str3.hashCode();
                                arrayList = arrayList2;
                                i2 = size2;
                                i3 = i6;
                                if (hashCode != -1349088399) {
                                    notification2 = notification3;
                                    if (hashCode != -912007698) {
                                        if (hashCode == 966916451 && str3.equals(CallEventualStatName.API_CALL)) {
                                            k = k(null, CallEventualStatName.API_CALL);
                                            k.putExtra("query", action2.c);
                                            NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(R.drawable.ic_logo_vk_24, pushButton.b, l(k));
                                            action = pushButton.c;
                                            if ("api_call_input".equals(action != null ? action.b : null)) {
                                                c0022a.a(new kvf0("message", context.getString(R.string.reply_to), null, true, 0, new Bundle(), new HashSet()));
                                                Bundle bundle3 = new Bundle();
                                                bundle3.putInt("flags", 5);
                                                c0022a.e.putBundle("android.wearable.EXTENSIONS", bundle3);
                                            }
                                            arrayList3.add(c0022a.b());
                                        }
                                    } else if (str3.equals("api_call_input")) {
                                        k = k(yfb.b(new Pair("query", action2.c), new Pair("url", action2.d)), "api_call_input");
                                        NotificationCompat.a.C0022a c0022a2 = new NotificationCompat.a.C0022a(R.drawable.ic_logo_vk_24, pushButton.b, l(k));
                                        action = pushButton.c;
                                        if ("api_call_input".equals(action != null ? action.b : null)) {
                                        }
                                        arrayList3.add(c0022a2.b());
                                    }
                                } else {
                                    notification2 = notification3;
                                    if (str3.equals("custom")) {
                                        k = k(yfb.b(new Pair("url", action2.d)), "custom");
                                        NotificationCompat.a.C0022a c0022a22 = new NotificationCompat.a.C0022a(R.drawable.ic_logo_vk_24, pushButton.b, l(k));
                                        action = pushButton.c;
                                        if ("api_call_input".equals(action != null ? action.b : null)) {
                                        }
                                        arrayList3.add(c0022a22.b());
                                    }
                                }
                            } else {
                                arrayList = arrayList2;
                                notification2 = notification3;
                                i2 = size2;
                                i3 = i6;
                            }
                            i6 = i3 + 1;
                            i4 = i7;
                            arrayList2 = arrayList;
                            size2 = i2;
                            notification3 = notification2;
                        }
                        i = i4;
                        notification = notification3;
                        int size3 = arrayList3.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            hVar.b((NotificationCompat.a) arrayList3.get(i8));
                        }
                    }
                    hVar.J = !c1751a.l;
                    NotificationCompat.n nVar = new NotificationCompat.n();
                    p(nVar);
                    Bundle bundle4 = new Bundle();
                    if (!nVar.a.isEmpty()) {
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(nVar.a.size());
                        Iterator<NotificationCompat.a> it2 = nVar.a.iterator();
                        while (it2.hasNext()) {
                            NotificationCompat.a next = it2.next();
                            IconCompat a3 = next.a();
                            boolean z = next.d;
                            Bundle bundle5 = next.a;
                            Iterator<NotificationCompat.a> it3 = it2;
                            Notification.Action.Builder builder = new Notification.Action.Builder(a3 == null ? null : a3.l(null), next.i, next.j);
                            Bundle bundle6 = bundle5 != null ? new Bundle(bundle5) : new Bundle();
                            bundle6.putBoolean("android.support.allowGeneratedReplies", z);
                            int i9 = Build.VERSION.SDK_INT;
                            NotificationCompat.n.a.a(builder, z);
                            if (i9 >= 31) {
                                NotificationCompat.n.b.a(builder, next.k);
                            }
                            builder.addExtras(bundle6);
                            kvf0[] kvf0VarArr = next.c;
                            if (kvf0VarArr != null) {
                                for (RemoteInput remoteInput : kvf0.a(kvf0VarArr)) {
                                    builder.addRemoteInput(remoteInput);
                                }
                            }
                            arrayList4.add(builder.build());
                            it2 = it3;
                        }
                        bundle4.putParcelableArrayList("actions", arrayList4);
                    }
                    int i10 = nVar.b;
                    if (i10 != i) {
                        bundle4.putInt("flags", i10);
                    }
                    if (!nVar.c.isEmpty()) {
                        ArrayList<Notification> arrayList5 = nVar.c;
                        bundle4.putParcelableArray("pages", (Parcelable[]) arrayList5.toArray(new Notification[arrayList5.size()]));
                    }
                    Bitmap bitmap2 = nVar.d;
                    if (bitmap2 != null) {
                        bundle4.putParcelable(L2.g, bitmap2);
                    }
                    int i11 = nVar.e;
                    if (i11 != 8388613) {
                        bundle4.putInt("contentIconGravity", i11);
                    }
                    int i12 = nVar.f;
                    if (i12 != -1) {
                        bundle4.putInt("contentActionIndex", i12);
                    }
                    int i13 = nVar.g;
                    if (i13 != 80) {
                        bundle4.putInt("gravity", i13);
                    }
                    if (hVar.v == null) {
                        hVar.v = new Bundle();
                    }
                    hVar.v.putBundle("android.wearable.EXTENSIONS", bundle4);
                    hVar.w = context.getColor(R.color.vk_blue_400);
                } else {
                    notification = notification3;
                }
                o(hVar);
                if (A()) {
                    hVar.j(charSequence3);
                    notification.icon = R.drawable.vk_icon_new_logo_vk_24;
                }
                ca70 ca70Var2 = ca70.a;
                if (System.currentTimeMillis() - Preference.m(0L, "notifications_prefs", "last_notification_timestamp") >= TimeUnit.SECONDS.toMillis(1L)) {
                    NotificationUtils.b(context, hVar, w(), false, true);
                } else {
                    NotificationUtils.b(context, hVar, w(), v(), s());
                }
                return hVar.c();
            }
        }
        str = "default_ver2";
        hVar = new NotificationCompat.h(context, str);
        a = gz80.a(28);
        CharSequence charSequence22 = this.n;
        bitmap = this.d;
        CharSequence charSequence32 = this.p;
        if (a) {
            NotificationCompat.m x22 = x();
            if (!(x22 instanceof NotificationCompat.l)) {
            }
            if (lVar != null) {
            }
        }
        hVar.k(charSequence22);
        hVar.j(charSequence32);
        hVar.D(charSequence32);
        hVar.n(2, false);
        Notification notification32 = hVar.I;
        notification32.icon = o;
        hVar.u = q();
        hVar.e(y());
        Bundle bundle22 = new Bundle();
        bundle22.putString("group_id_extra_key", t());
        bundle = hVar.v;
        if (bundle != null) {
        }
        int i42 = 1;
        map = this.m;
        if (map != null) {
            hVar.J = true;
            hVar.A(null);
            hVar.l(0);
            hVar.k = 0;
        }
        r = r();
        if (r != null) {
        }
        notification32.deleteIntent = (PendingIntent) this.b.getValue();
        if (bitmap != null) {
        }
        u = u();
        if (u != null) {
        }
        x = x();
        if (x != null) {
        }
        charSequence = this.o;
        if (charSequence != null) {
            hVar.C(charSequence);
        }
        if (A()) {
        }
        o(hVar);
        if (A()) {
        }
        ca70 ca70Var22 = ca70.a;
        if (System.currentTimeMillis() - Preference.m(0L, "notifications_prefs", "last_notification_timestamp") >= TimeUnit.SECONDS.toMillis(1L)) {
        }
        return hVar.c();
    }

    @Override // xsna.ri6
    public Intent b() {
        int i = NotificationDeleteReceiver.a;
        C1751a c1751a = this.i;
        return NotificationDeleteReceiver.a.a(this.c, c1751a.a("type"), c1751a.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT), e(), f());
    }

    @Override // xsna.ri6
    public String c() {
        return this.j;
    }

    @Override // xsna.ri6
    public final Map<String, String> d() {
        return this.m;
    }

    @Override // xsna.ri6
    public int e() {
        return this.k;
    }

    @Override // xsna.ri6
    public String f() {
        return this.l;
    }

    public Intent k(Bundle bundle, String str) {
        Set<String> set = n770.a;
        String f = f();
        C1751a c1751a = this.i;
        Intent b = n770.a.b(this.c, new n770.b(str, f, c1751a.a("type"), c1751a.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT), c1751a.a("need_track_interaction"), bundle, 32));
        b.putExtra("target_user_id", c1751a.k);
        return b;
    }

    public final PendingIntent l(Intent intent) {
        i35 i35Var = i35.c;
        intent.putExtra("target_user_id", this.i.k);
        Set<String> set = n770.a;
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        boolean d = n770.a.d(action);
        Context context = this.c;
        return d ? t2i0.a(context, i35Var.e(), intent, 167772160) : t2i0.b(context, i35Var.e(), intent, 167772160);
    }

    public Collection<NotificationCompat.a> m() {
        return EmptyList.b;
    }

    public final NotificationCompat.f n() {
        NotificationCompat.f fVar = new NotificationCompat.f();
        fVar.b = NotificationCompat.h.d(this.n);
        fVar.e = NotificationCompat.h.d(this.p);
        return fVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public void p(NotificationCompat.n nVar) {
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            nVar.d = bitmap;
        }
        nVar.a.addAll(j5g.O0((Collection) this.q.getValue()));
    }

    public String q() {
        return this.t;
    }

    public PendingIntent r() {
        return null;
    }

    public boolean s() {
        return this.v;
    }

    public String t() {
        return this.s;
    }

    public String u() {
        return null;
    }

    public boolean v() {
        return this.u;
    }

    public NotificationUtils.Type w() {
        return this.r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public NotificationCompat.m x() {
        return (NotificationCompat.m) this.w.getValue();
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        boolean a = ((hlu0) this.g.getValue()).a();
        C1751a c1751a = this.i;
        if (a) {
            return fkq0.c(c1751a.k) && o25.a().a(c1751a.k);
        }
        c1751a.getClass();
        return true;
    }

    public a(Context context, C1751a c1751a, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context);
        this.c = context;
        this.d = bitmap;
        this.e = bitmap2;
        this.f = file;
        this.g = new bpn0(new gd70(this, 29));
        this.h = new bpn0(new orj0(this, 0));
        Map<String, String> map = c1751a.b;
        if (A()) {
            pn00.k(new Pair("title", ""), new Pair("subtitle", ""), new Pair("image", ""), new Pair("body", context.getString(R.string.hided_notification_hidden_content)), new Pair("url", ""), new Pair("icon", BuildConfig.FLAVOR), new Pair("sender", ""), new Pair("sound", Boolean.FALSE), new Pair(X3.j.D, ""));
        }
        C1751a c1751a2 = new C1751a(map);
        this.i = c1751a2;
        x870 x870Var = x870.a;
        String str = c1751a2.i;
        this.j = (TextUtils.isEmpty(str) || epx.f(str, BuildConfig.FLAVOR)) ? "default_ver2" : str;
        this.k = 1;
        this.l = c1751a2.c;
        this.m = c1751a2.b;
        CharSequence a = xpg0.a(c1751a2.e);
        this.n = a != null ? B(a) : null;
        CharSequence a2 = xpg0.a(c1751a2.f);
        this.o = a2 != null ? B(a2) : null;
        this.p = A() ? context.getString(R.string.hided_notification_hidden_content) : xpg0.a(c1751a2.g);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, new oqh0(this, 4));
        this.r = NotificationUtils.Type.Default;
        this.s = c1751a2.d;
        this.t = NotificationCompat.CATEGORY_SOCIAL;
        boolean z = c1751a2.l;
        this.u = z;
        this.v = !z;
        this.w = msy.a(lazyThreadSafetyMode, new z260(this, 25));
    }

    public void o(NotificationCompat.h hVar) {
    }
}
