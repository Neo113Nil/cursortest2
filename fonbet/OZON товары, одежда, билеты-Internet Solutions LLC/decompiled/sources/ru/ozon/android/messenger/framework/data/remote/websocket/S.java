package ru.ozon.android.messenger.framework.data.remote.websocket;

import De.C2862e;
import We.G;
import We.L;
import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ozon.android.messenger.framework.data.requests.b;
import ru.ozon.app.android.messenger.R$raw;
import ru.ozon.fintech.ui.input.CounterView;
import sf.C9684j;
import xe.C10720e0;
import xe.C10727i;
import xe.X0;
import xe.Y;

/* loaded from: classes10.dex */
public final class S implements We.Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J f87955a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Resources f87956b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f87957c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f87958d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f87959e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.WebSocketMock$scheduleEventMockWithId$2", f = "WebSocketMock.kt", l = {181}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f87960d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f87961e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S f87962f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f87963g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, S s11, JSONObject jSONObject, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f87961e = j11;
            this.f87962f = s11;
            this.f87963g = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f87961e, this.f87962f, this.f87963g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f87960d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f87960d = 1;
                if (Y.b(this.f87961e, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            S s11 = this.f87962f;
            We.S s12 = s11.f87955a;
            String jSONObject = this.f87963g.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            s12.onMessage(s11, jSONObject);
            return Unit.f71690a;
        }
    }

    public S(@NotNull J listener, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f87955a = listener;
        this.f87956b = resources;
        this.f87957c = new ArrayList();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = xe.N.a(He.b.f10879b.plus(X0.b()));
        this.f87959e = a11;
        C10727i.c(a11, null, null, new Q(this, null), 3);
    }

    public static final void e(S s11) {
        s11.i(R$raw.m_mock_event_update_header, 5000L, "headerId");
        s11.i(R$raw.m_mock_event_add_footer, 4000L, "footerId2");
        s11.i(R$raw.m_mock_event_add_footer_disclaimer, 5000L, "footerId4");
        s11.i(R$raw.m_mock_event_add_curtain, 6000L, "footerId5");
    }

    public static final void f(S s11) {
        s11.getClass();
        L.a aVar = new L.a();
        aVar.f(CounterView.COUNTER_MAX_DEFAULT);
        G.a aVar2 = new G.a();
        aVar2.k("https://mock.com");
        aVar.r(aVar2.b());
        aVar.o(We.F.HTTP_2);
        aVar.l("mock");
        s11.f87955a.onOpen(s11, aVar.c());
    }

    private final String g(int i11, String str) {
        JSONObject optJSONObject;
        JSONObject h11 = h(i11);
        JSONObject optJSONObject2 = h11.optJSONObject("payload");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("response")) != null) {
            optJSONObject.put("id", str);
        }
        String jSONObject = h11.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    private final JSONObject h(int i11) {
        InputStream openRawResource = this.f87956b.openRawResource(i11);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), 8192);
        try {
            String d11 = bd.q.d(bufferedReader);
            bufferedReader.close();
            return new JSONObject(d11);
        } finally {
        }
    }

    private final void i(int i11, long j11, String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject h11 = h(i11);
        JSONObject optJSONObject3 = h11.optJSONObject("payload");
        JSONObject optJSONObject4 = (optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("events")) == null) ? null : optJSONArray.optJSONObject(0);
        if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("model")) != null && (optJSONObject2 = optJSONObject.optJSONObject("item")) != null) {
            optJSONObject2.put("id", str);
        }
        C10727i.c(this.f87959e, null, null, new a(j11, this, h11, null), 3);
    }

    @Override // We.Q
    public final boolean a(int i11, String str) {
        this.f87955a.onClosed(this, 1000, "");
        Lm0.a.f17149a.d("Closing with code 1000", new Object[0]);
        this.f87958d = true;
        xe.N.c(this.f87959e, null);
        this.f87957c.clear();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // We.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(@NotNull String text) {
        boolean z11;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        JSONObject optJSONObject6;
        JSONObject optJSONObject7;
        JSONObject optJSONObject8;
        JSONObject optJSONObject9;
        JSONArray optJSONArray;
        JSONObject optJSONObject10;
        JSONObject optJSONObject11;
        JSONObject optJSONObject12;
        JSONArray optJSONArray2;
        JSONObject optJSONObject13;
        JSONObject optJSONObject14;
        JSONObject optJSONObject15;
        Intrinsics.checkNotNullParameter(text, "text");
        Lm0.a.f17149a.d(Nk.a.b("send: ", text), new Object[0]);
        if (this.f87958d) {
            return false;
        }
        JSONObject optJSONObject16 = new JSONObject(text).optJSONObject("request");
        String str = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        JSONArray jSONArray = null;
        Pair pair = new Pair(optJSONObject16 != null ? optJSONObject16.getString("method") : null, optJSONObject16 != null ? optJSONObject16.getString("id") : null);
        String str2 = (String) pair.a();
        String str3 = (String) pair.b();
        if (str2 == null || str3 == null) {
            return true;
        }
        if (str2.equals(ru.ozon.android.messenger.framework.data.requests.d.GET_MESSAGES.a())) {
            JSONObject optJSONObject17 = optJSONObject16 != null ? optJSONObject16.optJSONObject("params") : null;
            String optString = optJSONObject17 != null ? optJSONObject17.optString("direction") : null;
            if (optString == null) {
                optString = "";
            }
            str = g(optString.equals(b.a.BACK_AND_FORTH.a()) ? R$raw.m_mock_get_messages_response_test : optString.equals(b.a.FORWARD.a()) ? R$raw.m_mock_get_messages_response_success : optString.equals(b.a.BACKWARD.a()) ? R$raw.m_mock_get_messages_response_success_after : R$raw.m_mock_get_messages_response_error, str3);
        } else if (str2.equals(ru.ozon.android.messenger.framework.data.requests.d.GET_CHATS.a())) {
            str = g(R$raw.m_mock_get_chats_with_groups_response, str3);
        } else {
            if (!str2.equals(ru.ozon.android.messenger.framework.data.requests.d.SET_READ_MESSAGES.a())) {
                if (str2.equals(ru.ozon.android.messenger.framework.data.requests.d.SEND_MESSAGE.a())) {
                    String valueOf = String.valueOf((optJSONObject16 == null || (optJSONObject15 = optJSONObject16.optJSONObject("params")) == null) ? null : optJSONObject15.get("localId"));
                    ArrayList arrayList = this.f87957c;
                    arrayList.contains(valueOf);
                    arrayList.remove(valueOf);
                    if (optJSONObject16 != null && (optJSONObject12 = optJSONObject16.optJSONObject("params")) != null && (optJSONArray2 = optJSONObject12.optJSONArray("blocks")) != null && (optJSONObject13 = optJSONArray2.optJSONObject(0)) != null && (optJSONObject14 = optJSONObject13.optJSONObject("state")) != null) {
                        jSONArray = optJSONObject14.optJSONArray("text");
                    }
                    JSONObject h11 = h(R$raw.m_mock_send_message_response_success);
                    JSONObject optJSONObject18 = h11.optJSONObject("payload");
                    z11 = true;
                    if (optJSONObject18 != null && (optJSONObject6 = optJSONObject18.optJSONObject("response")) != null && (optJSONObject7 = optJSONObject6.optJSONObject("result")) != null && (optJSONObject8 = optJSONObject7.optJSONObject("item")) != null && (optJSONObject9 = optJSONObject8.optJSONObject("model")) != null && (optJSONArray = optJSONObject9.optJSONArray("blocks")) != null && (optJSONObject10 = optJSONArray.optJSONObject(0)) != null && (optJSONObject11 = optJSONObject10.optJSONObject("state")) != null) {
                        optJSONObject11.put("text", jSONArray);
                    }
                    JSONObject optJSONObject19 = h11.optJSONObject("payload");
                    if (optJSONObject19 != null && (optJSONObject5 = optJSONObject19.optJSONObject("response")) != null) {
                        optJSONObject5.put("id", str3);
                    }
                    JSONObject optJSONObject20 = h11.optJSONObject("payload");
                    if (optJSONObject20 != null && (optJSONObject = optJSONObject20.optJSONObject("response")) != null && (optJSONObject2 = optJSONObject.optJSONObject("result")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("item")) != null && (optJSONObject4 = optJSONObject3.optJSONObject("model")) != null) {
                        optJSONObject4.put("localId", valueOf);
                    }
                    str = h11.toString();
                    Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                } else {
                    z11 = true;
                    if (str2.equals(ru.ozon.android.messenger.framework.data.requests.d.START_OR_GET_CHAT.a())) {
                        str = g(R$raw.m_mock_startorgetchat, str3);
                    } else if (str2.equals(ru.ozon.android.messenger.framework.data.requests.d.INITIALIZE_CHAT.a())) {
                        str = g(R$raw.m_mock_initialize_chat_response, str3);
                    }
                }
                if (str != null) {
                    return z11;
                }
                this.f87955a.onMessage(this, str);
                return z11;
            }
            str = g(R$raw.m_mock_empty_response_success, str3);
        }
        z11 = true;
        if (str != null) {
        }
    }

    @Override // We.Q
    public final boolean c(@NotNull C9684j bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter("An operation is not implemented: Not yet implemented", "message");
        throw new Sc.p("An operation is not implemented: Not yet implemented");
    }

    @Override // We.Q
    public final void cancel() {
        this.f87958d = true;
        xe.N.c(this.f87959e, null);
        this.f87957c.clear();
    }
}
