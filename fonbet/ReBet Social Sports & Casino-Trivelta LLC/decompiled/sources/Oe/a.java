package Oe;

import Ge.h;
import Ye.d;
import a1.C1908a;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import fg.b;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import og.i;
import og.m;
import rd.C6218a;

/* loaded from: classes4.dex */
public final class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0172a f8629c = new C0172a(null);

    /* renamed from: a, reason: collision with root package name */
    public boolean f8630a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8631b;

    /* renamed from: Oe.a$a, reason: collision with other inner class name */
    public static final class C0172a {
        public /* synthetic */ C0172a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0172a() {
        }
    }

    @Override // fg.b
    public String a() {
        String p10 = p();
        String substring = p10.substring(StringsKt.indexOf$default((CharSequence) p10, ".", 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @Override // fg.b
    public HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Pex-Agent", C6218a.X());
        hashMap.put("x-pex-bw", "2097152");
        hashMap.put("x-appkey", MobilistenUtil.d());
        LiveChatUtil.log("PEX | getRequestConnectionHeaders: " + hashMap);
        return hashMap;
    }

    @Override // fg.b
    public HashMap c() {
        HashMap hashMap = new HashMap();
        String g10 = Ed.a.f3035a.g();
        if (g10.length() > 0) {
            hashMap.put("token", g10);
        }
        LiveChatUtil.log("PEX | getRequestConnectionParams: " + hashMap);
        return hashMap;
    }

    @Override // fg.b
    public String d() {
        String p10 = p();
        String substring = p10.substring(0, StringsKt.indexOf$default((CharSequence) p10, ".", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @Override // fg.b
    public void g() {
        super.g();
        LiveChatUtil.log("PEX | onBeforeConnect");
        r(true);
    }

    @Override // fg.b
    public void h(String str, String str2, String str3, String str4, String str5, Hashtable hashtable) {
        Object obj;
        String obj2;
        Long longOrNull;
        super.h(str, str2, str3, str4, str5, hashtable);
        r(false);
        LiveChatUtil.log("PEX | CONNECT");
        if (hashtable != null && (obj = hashtable.get("t")) != null && (obj2 = obj.toString()) != null && (longOrNull = StringsKt.toLongOrNull(obj2)) != null) {
            h.c(d.r(De.a.ServerTime, String.valueOf(System.currentTimeMillis() - longOrNull.longValue())), false, 1, null);
        }
        if (str4 != null && m.d(str4) != null) {
            h.c(d.r(De.a.SessionId, str4), false, 1, null);
        }
        List list = (List) i.a(Q.r());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UTSUtil.handleTrigger((Hashtable) it.next());
            }
        }
        rd.b.e().o(this.f8630a);
        this.f8630a = true;
    }

    @Override // fg.b
    public void i(boolean z10) {
        super.i(z10);
        r(!z10);
        LiveChatUtil.log("PEX | DISCONNECTED isForceDisconnect: " + z10);
        rd.b.e().n(false);
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "wmsconnect");
        intent.putExtra("status", false);
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        C1908a.b(e10).d(intent);
    }

    @Override // fg.b
    public void j(String str) {
        super.j(str);
        LiveChatUtil.log("PEX | onLog: " + str);
    }

    @Override // fg.b
    public void k(Hashtable hashtable) {
        Object obj;
        String obj2;
        Long longOrNull;
        super.k(hashtable);
        r(false);
        LiveChatUtil.log("PEX | onNetworkUp");
        if (hashtable != null && (obj = hashtable.get("t")) != null && (obj2 = obj.toString()) != null && (longOrNull = StringsKt.toLongOrNull(obj2)) != null) {
            h.c(d.r(De.a.ServerTime, String.valueOf(System.currentTimeMillis() - longOrNull.longValue())), false, 1, null);
        }
        rd.b.e().o(true);
    }

    @Override // fg.b
    public void l() {
        super.l();
        LiveChatUtil.log("PEX | onOpen");
    }

    @Override // fg.b
    public void m(String str, long j10) {
        super.m(str, j10);
        LiveChatUtil.log("PEX | onPerfLog: " + str + ", " + j10);
    }

    @Override // fg.b
    public void n(Hashtable hashtable) {
        super.n(hashtable);
        r(false);
        LiveChatUtil.log("PEX | onReconnect");
        rd.b.e().o(true);
    }

    public final Application o() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final String p() {
        if (C6218a.M() != null) {
            SharedPreferences M10 = C6218a.M();
            String string = M10 != null ? M10.getString("wms_server_url", null) : null;
            if (string != null) {
                return string;
            }
        }
        return "wms" + sd.d.a().getDomain() + sd.d.a().getSufix();
    }

    public final boolean q() {
        return this.f8631b;
    }

    public final void r(boolean z10) {
        if (this.f8631b != z10) {
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "wms_status_change");
            C1908a.b(o()).d(intent);
            LiveChatUtil.log("PEX | isConnecting changed to " + z10);
        }
        this.f8631b = z10;
    }

    public final void s(boolean z10) {
        this.f8630a = z10;
    }
}
