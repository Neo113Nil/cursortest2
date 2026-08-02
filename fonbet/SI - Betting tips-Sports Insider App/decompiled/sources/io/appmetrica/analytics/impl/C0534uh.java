package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.LongCompanionObject;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.uh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534uh implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f14729a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14730b;

    /* renamed from: c, reason: collision with root package name */
    public C0300l7 f14731c;

    /* renamed from: d, reason: collision with root package name */
    public C0251j9 f14732d;

    /* renamed from: e, reason: collision with root package name */
    public final L6 f14733e;

    /* renamed from: f, reason: collision with root package name */
    public List f14734f;

    /* renamed from: g, reason: collision with root package name */
    public int f14735g;

    /* renamed from: h, reason: collision with root package name */
    public int f14736h;

    /* renamed from: i, reason: collision with root package name */
    public int f14737i;
    public C0509th j;

    /* renamed from: k, reason: collision with root package name */
    public final Z2 f14738k;

    /* renamed from: l, reason: collision with root package name */
    public final PublicLogger f14739l;

    /* renamed from: m, reason: collision with root package name */
    public final xo f14740m;

    /* renamed from: n, reason: collision with root package name */
    public final Ra f14741n;

    /* renamed from: o, reason: collision with root package name */
    public final Zg f14742o;

    /* renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f14743p;
    public final C0628yb q;

    /* renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f14744r;

    /* renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f14745s;

    /* renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f14746t;

    /* renamed from: u, reason: collision with root package name */
    public int f14747u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14748v;

    public C0534uh(@NonNull X4 x42, @NonNull Zg zg2, @NonNull C0628yb c0628yb, @NonNull FullUrlFormer<C0285kh> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(x42, zg2, c0628yb, fullUrlFormer, requestDataHolder, responseDataHolder, x42.i(), x42.p(), x42.u(), requestBodyEncrypter);
    }

    public final C0251j9 a(C0509th c0509th, List list, C0285kh c0285kh) {
        C0251j9 c0251j9 = new C0251j9();
        C0045b9 c0045b9 = new C0045b9();
        c0045b9.f13404a = WrapUtils.getOrDefaultIfEmpty(this.f14731c.f14175b, c0285kh.getUuid());
        c0045b9.f13405b = WrapUtils.getOrDefaultIfEmpty(this.f14731c.f14174a, c0285kh.getDeviceId());
        this.f14735g = CodedOutputByteBufferNano.computeMessageSize(4, c0045b9) + this.f14735g;
        c0251j9.f14016b = c0045b9;
        C0391on C = C0353na.I.C();
        C0459rh c0459rh = new C0459rh(this, c0251j9);
        synchronized (C) {
            C.f14432a.a(c0459rh);
        }
        c0251j9.f14015a = (C0174g9[]) c0509th.f14682a.toArray(new C0174g9[0]);
        c0251j9.f14017c = a(c0509th.f14684c);
        c0251j9.f14019e = (String[]) list.toArray(new String[0]);
        Set set = c0285kh.f14143x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c0251j9.f14020f = new byte[strArr.length][];
        for (int i5 = 0; i5 < set.size(); i5++) {
            c0251j9.f14020f[i5] = StringUtils.getUTF8Bytes(strArr[i5]);
        }
        return c0251j9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f14729a.f13143b.f12771b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f14743p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f14744r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f14745s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0285kh) this.f14729a.f13151k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Al) C0353na.I.z()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        Cursor cursor;
        int optInt;
        L6 l6 = this.f14729a.f13146e;
        l6.getClass();
        ArrayList arrayList = new ArrayList();
        l6.f12508a.lock();
        try {
            SQLiteDatabase readableDatabase = l6.f12510c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(AbstractC0522u5.f14702b, null);
                while (cursor.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                            if (!arrayList.isEmpty()) {
                            }
                        } finally {
                            lo.a(cursor);
                            l6.f12508a.unlock();
                        }
                    }
                }
            } else {
                cursor = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.f14730b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f14730b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0300l7 c0300l7 = new C0300l7();
            this.f14731c = c0300l7;
            this.f14742o.f13310c = c0300l7;
        } else {
            try {
                C0300l7 c0300l72 = new C0300l7(new C0150fb(asString));
                this.f14731c = c0300l72;
                this.f14742o.f13310c = c0300l72;
            } catch (Throwable unused3) {
                C0300l7 c0300l73 = new C0300l7();
                this.f14731c = c0300l73;
                this.f14742o.f13310c = c0300l73;
            }
        }
        C0285kh config = this.q.getConfig();
        List list = config.f14142w;
        if (lo.a((Collection) list)) {
            return false;
        }
        this.f14743p.setHosts(config.q);
        if (!config.u() || lo.a((Collection) this.f14743p.getAllHosts())) {
            this.f14748v = true;
            return false;
        }
        this.f14734f = null;
        C0509th a7 = a(config);
        this.j = a7;
        if (a7.f14682a.isEmpty()) {
            return false;
        }
        xo xoVar = this.f14740m;
        synchronized (xoVar) {
            optInt = xoVar.f14934a.a().optInt("report_request_id", -1);
        }
        int i5 = optInt + 1;
        this.f14747u = i5;
        this.f14742o.f13312e = i5;
        C0251j9 a10 = a(this.j, list, config);
        this.f14732d = a10;
        this.f14734f = this.j.f14683b;
        this.f14746t.prepareAndSetPostData(MessageNano.toByteArray(a10));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f14746t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z5) {
        String a7;
        if (z5) {
            a(false);
        } else if (this.f14745s.getResponseCode() == 400) {
            a(true);
        }
        if (z5) {
            for (int i5 = 0; i5 < this.j.f14682a.size(); i5++) {
                for (C0122e9 c0122e9 : ((C0174g9) this.j.f14682a.get(i5)).f13826c) {
                    if (c0122e9 != null && (a7 = Qf.a(c0122e9)) != null) {
                        this.f14739l.info(a7, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f14746t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f14748v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f14748v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C0273k5) this.f14729a.f13156p).f14100d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0273k5) this.f14729a.f13156p).f14100d.set(true);
        if (this.f14748v) {
            ((C0273k5) this.f14729a.f13156p).f();
        }
    }

    public C0534uh(X4 x42, Zg zg2, C0628yb c0628yb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, L6 l6, PublicLogger publicLogger, xo xoVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(x42, publicLogger, l6, zg2, xoVar, c0628yb, new Z2(1024000, "event value in ReportTask", publicLogger), AbstractC0593x1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C0534uh(X4 x42, PublicLogger publicLogger, L6 l6, Zg zg2, xo xoVar, C0628yb c0628yb, Z2 z22, Qj qj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f14730b = new LinkedHashMap();
        this.f14735g = 0;
        this.f14736h = 0;
        this.f14737i = -1;
        this.f14748v = false;
        this.f14746t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f14742o = zg2;
        this.f14729a = x42;
        this.f14733e = l6;
        this.f14739l = publicLogger;
        this.f14738k = z22;
        this.f14740m = xoVar;
        this.q = c0628yb;
        this.f14741n = qj;
        this.f14744r = requestDataHolder;
        this.f14745s = responseDataHolder;
        this.f14743p = fullUrlFormer;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public static Y8[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        Y8[] y8Arr = new Y8[length];
        Iterator<String> keys = jSONObject.keys();
        int i5 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Y8 y82 = new Y8();
                y82.f13215a = next;
                y82.f13216b = jSONObject.getString(next);
                y8Arr[i5] = y82;
            } catch (Throwable unused) {
            }
            i5++;
        }
        return y8Arr;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th2) {
    }

    public final void a(boolean z5) {
        boolean z7;
        xo xoVar = this.f14740m;
        int i5 = this.f14747u;
        synchronized (xoVar) {
            yo yoVar = xoVar.f14934a;
            yoVar.a(yoVar.a().put("report_request_id", i5));
        }
        C0174g9[] c0174g9Arr = this.f14732d.f14015a;
        int i10 = 0;
        while (i10 < c0174g9Arr.length) {
            try {
                C0174g9 c0174g9 = c0174g9Arr[i10];
                long longValue = ((Long) this.f14734f.get(i10)).longValue();
                Vk vk = (Vk) Pf.f12752b.get(c0174g9.f13825b.f13728c);
                if (vk == null) {
                    vk = Vk.FOREGROUND;
                }
                z7 = z5;
                try {
                    this.f14733e.a(longValue, vk.f13072a, c0174g9.f13826c.length, z7);
                    Pf.a(c0174g9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z7 = z5;
            }
            i10++;
            z5 = z7;
        }
        L6 l6 = this.f14733e;
        long a7 = this.f14729a.j.a();
        l6.f12509b.lock();
        try {
            if (AbstractC0572w5.f14820a.booleanValue()) {
                l6.c();
            }
            SQLiteDatabase writableDatabase = l6.f12510c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC0522u5.f14703c, new String[]{String.valueOf(a7)});
            }
        } catch (Throwable unused3) {
        }
        l6.f12509b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6 A[LOOP:1: B:60:0x00e0->B:62:0x00e6, LOOP_END] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0509th a(@NonNull C0285kh c0285kh) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor a7 = a();
            if (a7 != null) {
                JSONObject jSONObject2 = jSONObject;
                C0217i0 c0217i0 = null;
                while (a7.moveToNext() && this.f14736h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a7, contentValues);
                        C0474s7 model = new C0499t7(null, 1, null).toModel(contentValues);
                        Long l6 = model.f14616a;
                        if (l6 != null) {
                            C0449r7 c0449r7 = model.f14619d;
                            C0226i9 a10 = Pf.a(c0449r7.f14547a, c0449r7.f14548b, c0449r7.f14549c);
                            String locale = c0285kh.getLocale();
                            Vk vk = model.f14617b;
                            C0148f9 c0148f9 = new C0148f9();
                            c0148f9.f13726a = a10;
                            c0148f9.f13727b = locale;
                            if (vk != null) {
                                Integer num = (Integer) Pf.f12751a.get(vk);
                                c0148f9.f13728c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.f14735g + CodedOutputByteBufferNano.computeUInt64Size(1, LongCompanionObject.MAX_VALUE);
                            this.f14735g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c0148f9);
                            this.f14735g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            C0484sh a11 = a(l6.longValue(), c0148f9, c0285kh, arrayList3, arrayList.size());
                            if (a11 == null) {
                                continue;
                            } else {
                                if (c0217i0 == null) {
                                    c0217i0 = a11.f14644b;
                                } else if (!c0217i0.equals(a11.f14644b)) {
                                    break;
                                }
                                arrayList2.add(l6);
                                arrayList.add(a11.f14643a);
                                if (!TextUtils.isEmpty(a11.f14644b.f13914a)) {
                                    try {
                                        jSONObject2 = new JSONObject(a11.f14644b.f13914a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a11.f14645c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = a7;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return new C0509th(arrayList, arrayList2, jSONObject);
                        } finally {
                            lo.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            lo.a(a7);
        } catch (Throwable th3) {
            th = th3;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f14741n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C0509th(arrayList, arrayList2, jSONObject);
    }

    public static C0217i0 a(ContentValues contentValues) {
        C0120e7 model = new C0146f7(null, 1, null).toModel(contentValues);
        return new C0217i0((String) WrapUtils.getOrDefault(model.f13648g.f13571g, ""), ((Long) WrapUtils.getOrDefault(model.f13648g.f13572h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:12:0x0025, B:13:0x002b, B:15:0x0032, B:17:0x0038, B:29:0x006c, B:31:0x0072, B:71:0x0094, B:34:0x00a9, B:36:0x00b8, B:41:0x00c4, B:42:0x00c3, B:43:0x00be, B:44:0x00ca, B:47:0x00dc, B:58:0x00e3, B:75:0x00a1, B:57:0x00eb, B:82:0x0065, B:51:0x00f5, B:53:0x00fb), top: B:11:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0484sh a(long j, C0148f9 c0148f9, C0285kh c0285kh, ArrayList arrayList, int i5) {
        Cursor cursor;
        boolean z5;
        C0484sh c0484sh;
        C0122e9 c0122e9;
        int i10;
        Y8[] a7;
        N8 n82;
        U8 u82;
        C0174g9 c0174g9 = new C0174g9();
        c0174g9.f13824a = j;
        c0174g9.f13825b = c0148f9;
        Vk vk = (Vk) Pf.f12752b.get(c0148f9.f13728c);
        if (vk == null) {
            vk = Vk.FOREGROUND;
        }
        try {
            cursor = a(j, vk);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C0217i0 c0217i0 = null;
                    while (true) {
                        z5 = false;
                        if (!cursor.moveToNext() || this.f14736h >= 100) {
                            break;
                        }
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            n82 = new N8(contentValues);
                            EnumC0047bb enumC0047bb = n82.f12637h;
                            if (enumC0047bb != null) {
                                u82 = (U8) Pf.f12754d.get(enumC0047bb);
                            } else {
                                Map map = Pf.f12751a;
                                u82 = null;
                            }
                            if (u82 == null) {
                                u82 = U8.f12960i;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            c0122e9 = u82.a(n82, c0285kh);
                        } catch (Throwable th3) {
                            th = th3;
                            arrayList.add(th);
                            c0122e9 = null;
                            if (c0122e9 == null) {
                            }
                            arrayList2.add(c0122e9);
                            this.f14736h++;
                        }
                        if (c0122e9 == null) {
                            C0217i0 a10 = a(contentValues);
                            if (c0217i0 == null) {
                                if (this.f14737i < 0) {
                                    try {
                                        a7 = a(new JSONObject(a10.f13914a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a7 != null) {
                                        i10 = 0;
                                        for (Y8 y82 : a7) {
                                            i10 += CodedOutputByteBufferNano.computeMessageSize(7, y82);
                                        }
                                        this.f14737i = i10;
                                        this.f14735g += i10;
                                    }
                                    i10 = 0;
                                    this.f14737i = i10;
                                    this.f14735g += i10;
                                }
                                c0217i0 = a10;
                            } else if (!c0217i0.equals(a10)) {
                                z5 = true;
                                break;
                            }
                            Z2 z22 = this.f14738k;
                            byte[] bArr = c0122e9.f13665e;
                            z22.getClass();
                            byte[] a11 = z22.a(bArr);
                            byte[] bArr2 = c0122e9.f13665e;
                            if (bArr2 != a11) {
                                c0122e9.f13669i = ((bArr2 == null ? 0 : bArr2.length) - (a11 == null ? 0 : a11.length)) + c0122e9.f13669i;
                                c0122e9.f13665e = a11;
                            }
                            this.f14735g += CodedOutputByteBufferNano.computeMessageSize(3, c0122e9);
                            if (arrayList2.isEmpty() && i5 == 0) {
                                if (this.f14735g >= 1048576) {
                                    break;
                                }
                            } else if (this.f14735g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c0122e9);
                        this.f14736h++;
                    }
                    if (arrayList2.size() > 0) {
                        c0174g9.f13826c = (C0122e9[]) arrayList2.toArray(new C0122e9[arrayList2.size()]);
                        c0484sh = new C0484sh(c0174g9, c0217i0, z5);
                        return c0484sh;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        arrayList.add(th);
                        lo.a(cursor);
                        return null;
                    } finally {
                        lo.a(cursor);
                    }
                }
            }
            c0484sh = null;
            return c0484sh;
        } catch (Throwable th5) {
            th = th5;
            cursor = null;
        }
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        L6 l6 = this.f14733e;
        LinkedHashMap linkedHashMap = this.f14730b;
        l6.f12508a.lock();
        try {
            readableDatabase = l6.f12510c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, L6.a(linkedHashMap), L6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            l6.f12508a.unlock();
            return cursor;
        }
        cursor = null;
        l6.f12508a.unlock();
        return cursor;
    }

    public final Cursor a(long j, Vk vk) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        L6 l6 = this.f14733e;
        l6.f12508a.lock();
        try {
            readableDatabase = l6.f12510c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(vk.f13072a)}, null, null, "number_in_session ASC", null);
            l6.f12508a.unlock();
            return cursor;
        }
        cursor = null;
        l6.f12508a.unlock();
        return cursor;
    }
}
