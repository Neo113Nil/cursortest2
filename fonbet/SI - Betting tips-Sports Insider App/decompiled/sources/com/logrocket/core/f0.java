package com.logrocket.core;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6445a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6446b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6447c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6448d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6449e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONObject f6450f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONObject f6451g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONArray f6452h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6453i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final JSONArray f6454k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6455l;

    /* renamed from: m, reason: collision with root package name */
    public final y9.d f6456m;

    /* renamed from: n, reason: collision with root package name */
    public final Map f6457n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicInteger f6458o;

    /* renamed from: p, reason: collision with root package name */
    public final long f6459p;
    public final long q;

    /* renamed from: r, reason: collision with root package name */
    public long f6460r;

    /* renamed from: s, reason: collision with root package name */
    public f0 f6461s;

    public f0(String str, String str2, int i5, String str3, JSONObject jSONObject, JSONArray jSONArray) {
        this(str, str2, i5, UUID.randomUUID().toString(), System.currentTimeMillis(), System.currentTimeMillis(), str3, null, jSONObject, jSONArray, null, true, null, null, System.currentTimeMillis(), y9.d.ANONYMOUS, null);
    }

    public static String a() {
        byte[] bArr = new byte[16];
        aa.m.f113a.nextBytes(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(System.currentTimeMillis());
        System.arraycopy(allocate.array(), 2, bArr, 0, 6);
        bArr[6] = (byte) ((bArr[6] & 15) | 112);
        bArr[8] = (byte) ((bArr[8] & Utf8.REPLACEMENT_BYTE) | 128);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        return "6-" + new UUID(wrap.getLong(), wrap.getLong());
    }

    public final boolean b(f0 f0Var) {
        return this.f6445a.equals(f0Var.f6445a) && this.f6446b.equals(f0Var.f6446b) && this.f6447c == f0Var.f6447c && this.f6448d.equals(f0Var.f6448d);
    }

    public final String c() {
        return this.f6445a + "/s/" + this.f6446b + "/" + this.f6447c + "/" + this.f6448d;
    }

    public f0(String str, String str2, int i5, String str3, long j, long j6, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, String str5, boolean z5, JSONArray jSONArray2, String str6, long j10, y9.d dVar, Map map) {
        this.j = false;
        this.f6445a = str;
        this.f6446b = str2;
        this.f6447c = i5;
        this.f6448d = str3;
        this.f6458o = new AtomicInteger(0);
        this.f6459p = j;
        this.f6460r = j6;
        this.f6449e = str4;
        this.f6450f = jSONObject;
        this.f6451g = jSONObject2;
        this.f6452h = jSONArray;
        this.f6453i = str5;
        this.j = z5;
        this.f6454k = jSONArray2;
        this.f6455l = str6;
        this.f6456m = dVar;
        this.f6457n = map;
        this.q = j10;
    }
}
