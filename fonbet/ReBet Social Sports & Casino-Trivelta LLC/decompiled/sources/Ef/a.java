package Ef;

import android.app.Application;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.conversations.data.local.ConversationsLocalDataSource;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import od.AbstractC5884j;
import og.AbstractC5896h;

/* loaded from: classes4.dex */
public final class a implements Hf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0073a f3087a;

    /* renamed from: b, reason: collision with root package name */
    public static a f3088b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3089c;

    /* renamed from: d, reason: collision with root package name */
    public static final Gf.a f3090d;

    /* renamed from: e, reason: collision with root package name */
    public static final ConversationsLocalDataSource f3091e;

    /* renamed from: f, reason: collision with root package name */
    public static final Ae.a f3092f;

    /* renamed from: Ef.a$a, reason: collision with other inner class name */
    public static final class C0073a {
        public /* synthetic */ C0073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Application a() {
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return e10;
        }

        public final a b() {
            a aVar;
            synchronized (a.f3089c) {
                aVar = a.f3088b;
                if (aVar == null) {
                    aVar = new a();
                    a.f3088b = aVar;
                }
            }
            return aVar;
        }

        public C0073a() {
        }
    }

    static {
        C0073a c0073a = new C0073a(null);
        f3087a = c0073a;
        f3089c = new Object();
        f3090d = Gf.a.f3947a.a();
        f3091e = ConversationsLocalDataSource.INSTANCE.getInstance$mobilisten_release();
        f3092f = Ae.a.f447b.b(c0073a.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r10, "LD", false, 2, (java.lang.Object) null) == true) goto L20;
     */
    @Override // Hf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Map map, boolean z10, Continuation continuation) {
        k d10;
        SalesIQChat salesIQChat;
        h r10;
        k d11;
        k d12;
        String str;
        String str2 = (String) map.get("addInfo");
        HashMap hashMap = new HashMap(map);
        k kVar = null;
        if (!AbstractC5884j.w(hashMap) && !z10) {
            return C5582a.C0817a.c(C5582a.f56502b, new Throwable("Not a SalesIQ Notification"), false, 2, null);
        }
        if (str2 != null || z10) {
            if (z10) {
                h d13 = m.d(Yd.a.j().v(hashMap));
                Intrinsics.checkNotNullExpressionValue(d13, "parseString(...)");
                d10 = AbstractC5896h.d(d13);
                hashMap.put("uid", LiveChatUtil.getAnnonID());
                Object obj = hashMap.get("chid");
                String str3 = (String) obj;
                if (str3 != null) {
                    Intrinsics.checkNotNull(str3);
                }
                obj = null;
                String str4 = (String) obj;
                if (str4 == null || (str = f3091e.getChatId(str4)) == null) {
                    str = (String) hashMap.get("chid");
                }
                ConversationsLocalDataSource conversationsLocalDataSource = f3091e;
                salesIQChat = ConversationsLocalDataSource.getChat$default(conversationsLocalDataSource, str, false, 2, null);
                if (salesIQChat == null) {
                    salesIQChat = conversationsLocalDataSource.getChatFromAcknowledgementKey((String) hashMap.get("acknowledgement_key"));
                }
            } else {
                h d14 = m.d(String.valueOf(str2));
                Intrinsics.checkNotNullExpressionValue(d14, "parseString(...)");
                d10 = AbstractC5896h.d(d14);
                if (d10 != null && d10.t("chid")) {
                    ConversationsLocalDataSource conversationsLocalDataSource2 = f3091e;
                    h r11 = d10.r("chid");
                    salesIQChat = ConversationsLocalDataSource.getChat$default(conversationsLocalDataSource2, r11 != null ? AbstractC5896h.f(r11) : null, false, 2, null);
                } else if (d10 == null || (r10 = d10.r("msg")) == null || (d11 = AbstractC5896h.d(r10)) == null || !d11.t("conversation_id")) {
                    salesIQChat = null;
                } else {
                    ConversationsLocalDataSource conversationsLocalDataSource3 = f3091e;
                    h r12 = d10.r("msg");
                    salesIQChat = conversationsLocalDataSource3.getChatFromConversationId(AbstractC5896h.f((r12 == null || (d12 = AbstractC5896h.d(r12)) == null) ? null : d12.r("conversation_id")));
                }
            }
            if (salesIQChat == null) {
                salesIQChat = null;
            }
            kVar = d10;
        } else {
            salesIQChat = null;
        }
        return C5582a.f56502b.d(If.a.a(hashMap, f3092f.I(), kVar, salesIQChat));
    }

    @Override // Hf.a
    public C5582a b() {
        return f3090d.d();
    }
}
