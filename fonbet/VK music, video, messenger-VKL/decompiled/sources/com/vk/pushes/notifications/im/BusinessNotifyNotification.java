package com.vk.pushes.notifications.im;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.core.serialize.Serializer;
import com.vk.pushes.NotificationUtils;
import com.vk.pushes.dto.PushBusinessNotify;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.ca70;
import xsna.cqm0;
import xsna.dfq0;
import xsna.e870;
import xsna.enj;
import xsna.g2v;
import xsna.gz80;
import xsna.j5g;
import xsna.m4;
import xsna.msy;
import xsna.myc0;
import xsna.o0w;
import xsna.p4g;
import xsna.pn00;
import xsna.qo8;
import xsna.wo8;
import xsna.x870;
import xsna.z4g;

/* compiled from: BusinessNotifyNotification.kt */
/* loaded from: classes5.dex */
public final class BusinessNotifyNotification extends dfq0 {
    public final String A;
    public final String B;
    public final NotificationUtils.Type C;
    public final String D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final Object H;
    public final List<PushBusinessNotify> I;
    public final BusinessNotifyNotificationContainer z;

    public BusinessNotifyNotification(Context context, BusinessNotifyNotificationContainer businessNotifyNotificationContainer, Bitmap bitmap, List<PushBusinessNotify> list) {
        super(context, businessNotifyNotificationContainer, bitmap);
        this.z = businessNotifyNotificationContainer;
        x870 x870Var = x870.a;
        this.A = "private_messages_ver2";
        this.B = "business_notify_notification_" + Long.valueOf(businessNotifyNotificationContainer.p);
        this.C = NotificationUtils.Type.PrivateMessages;
        this.D = "business_notify_group";
        this.E = NotificationCompat.CATEGORY_MESSAGE;
        this.F = businessNotifyNotificationContainer.r;
        this.G = businessNotifyNotificationContainer.u;
        this.H = msy.a(LazyThreadSafetyMode.NONE, new m4(this, 11));
        this.I = list;
    }

    @Override // xsna.dfq0
    public final Intent C() {
        o0w b = g2v.c().b();
        BusinessNotifyNotificationContainer businessNotifyNotificationContainer = this.z;
        Intent j = o0w.j(b, this.c, businessNotifyNotificationContainer.t, businessNotifyNotificationContainer.p, null, null, "message_push", g2v.c().b().D(), null, 100638712);
        j.setComponent(new ComponentName(this.c, z4g.d().s()));
        j.putExtra("withoutAnimation", true);
        j.putExtra("from_push", true);
        j.putExtra("push_action", "open_url");
        j.putExtra("notification_tag_id_key", this.B);
        j.putExtra("push_type_key", businessNotifyNotificationContainer.a("type"));
        String a = businessNotifyNotificationContainer.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT);
        if (a != null) {
            j.putExtra("stat_key", a);
        }
        String a2 = businessNotifyNotificationContainer.a("need_track_interaction");
        if (a2 != null) {
            j.putExtra("track_interaction_key", a2);
        }
        return j;
    }

    public final ArrayList D() {
        List<PushBusinessNotify> list = this.I;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((PushBusinessNotify) obj).e) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final Intent b() {
        Intent b = super.b();
        b.setAction("delete_business_notify_cache");
        b.putExtra("peer_id", this.z.p);
        return b;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String c() {
        return this.A;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String f() {
        return this.B;
    }

    @Override // xsna.ri6
    @SuppressLint({"NewApi"})
    public final void g(NotificationManager notificationManager) {
        int b;
        super.g(notificationManager);
        ca70 ca70Var = ca70.a;
        if (!ca70.g() || (b = wo8.b(notificationManager)) <= 1) {
            return;
        }
        new qo8(this.c, b, this.A).g(notificationManager);
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        return EmptyList.b;
    }

    @Override // xsna.dfq0, com.vk.pushes.notifications.base.a
    public final void o(NotificationCompat.h hVar) {
        hVar.e(true);
        PushBusinessNotify pushBusinessNotify = (PushBusinessNotify) j5g.i0(D());
        hVar.D(String.format("%s: %s", Arrays.copyOf(new Object[]{pushBusinessNotify.c, pushBusinessNotify.d}, 2)));
        hVar.j(this.p);
        if (!gz80.a(24) || D().size() <= 1) {
            return;
        }
        String f = enj.f(R.plurals.notification_business_notify_unread, D().size(), this.c);
        if (myc0.f(f)) {
            hVar.C(f);
        }
    }

    @Override // com.vk.pushes.notifications.base.a
    public final void p(NotificationCompat.n nVar) {
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            nVar.d = bitmap;
        }
    }

    @Override // com.vk.pushes.notifications.base.a
    public final String q() {
        return this.E;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final boolean s() {
        return this.G;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final String u() {
        return this.D;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final boolean v() {
        return this.F;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final NotificationUtils.Type w() {
        return this.C;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final NotificationCompat.m x() {
        return (NotificationCompat.m) this.H.getValue();
    }

    /* compiled from: BusinessNotifyNotification.kt */
    public static final class BusinessNotifyNotificationContainer extends dfq0.a implements Serializer.StreamParcelable {
        public static final Serializer.c<BusinessNotifyNotificationContainer> CREATOR = new a();
        public final String o;
        public final long p;
        public final int q;
        public final boolean r;
        public final boolean s;
        public final Long t;
        public boolean u;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<BusinessNotifyNotificationContainer> {
            @Override // com.vk.core.serialize.Serializer.c
            public final BusinessNotifyNotificationContainer a(Serializer serializer) {
                String H = serializer.H();
                String H2 = serializer.H();
                String H3 = serializer.H();
                boolean m = serializer.m();
                String H4 = serializer.H();
                if (H4 == null) {
                    H4 = "";
                }
                BusinessNotifyNotificationContainer businessNotifyNotificationContainer = new BusinessNotifyNotificationContainer(H, H2, H3, m, H4, serializer.w(), serializer.u(), serializer.u() == 1, serializer.u() == 1, serializer.x());
                serializer.o(BusinessNotifyNotificationContainer.class.getClassLoader());
                return businessNotifyNotificationContainer;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessNotifyNotificationContainer[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BusinessNotifyNotificationContainer(String str, String str2, String str3, boolean z, String str4, long j, int i, boolean z2, boolean z3, Long l) {
            this(p4g.h(pn00.k(r5, r6, r7, r8, r9, r10, new Pair("context", e870.h(Integer.valueOf(i), Long.valueOf(j), null)), new Pair("sender", str4), new Pair("sound", String.valueOf(z2 ? 1 : 0)), new Pair("failed", String.valueOf(z3 ? 1 : 0)), new Pair("to_id", String.valueOf(l)))));
            Pair pair = new Pair("type", "business_notify");
            Pair pair2 = new Pair("title", str);
            Pair pair3 = new Pair("body", str2);
            Pair pair4 = new Pair("icon", str3);
            x870 x870Var = x870.a;
            Pair pair5 = new Pair("category", "default_ver2");
            Pair pair6 = new Pair("external_url", String.valueOf(z));
            e870 e870Var = e870.b;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.e);
            serializer.j0(this.g);
            serializer.j0(this.h);
            serializer.j0(this.m);
            serializer.L(this.n ? (byte) 1 : (byte) 0);
            serializer.j0(this.o);
            serializer.Y(this.p);
            serializer.S(this.q);
            serializer.S(this.r ? 1 : 0);
            serializer.S(this.s ? 1 : 0);
            serializer.b0(this.t);
            serializer.K(new Bundle());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        public BusinessNotifyNotificationContainer(Map<String, String> map) {
            super(map);
            JSONObject jSONObject;
            long optLong;
            String str = map.get("sender");
            this.o = str == null ? "" : str;
            this.r = "1".equals(map.get("sound"));
            this.s = "1".equals(map.get("failed"));
            String str2 = map.get("to_id");
            this.t = str2 != null ? cqm0.k(str2) : null;
            String str3 = map.get("context");
            if (str3 != null) {
                jSONObject = new JSONObject(str3);
            } else {
                jSONObject = new JSONObject();
            }
            boolean has = jSONObject.has("chat_id");
            if (has) {
                optLong = jSONObject.optLong("chat_id");
            } else if (!has) {
                optLong = jSONObject.optLong("sender_id");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.p = optLong;
            this.q = jSONObject.optInt("conversation_message_id");
        }
    }
}
