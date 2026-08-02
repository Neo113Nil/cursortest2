package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198h7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13875b;

    /* renamed from: c, reason: collision with root package name */
    public final xo f13876c;

    /* renamed from: d, reason: collision with root package name */
    public final C0650z8 f13877d;

    /* renamed from: e, reason: collision with root package name */
    public final C0217i0 f13878e;

    /* renamed from: f, reason: collision with root package name */
    public final J8 f13879f;

    /* renamed from: g, reason: collision with root package name */
    public final C0275k7 f13880g;

    /* renamed from: h, reason: collision with root package name */
    public final P5 f13881h;

    public C0198h7(Context context, Tk tk, int i5, xo xoVar, C0650z8 c0650z8, C0217i0 c0217i0, J8 j82, C0275k7 c0275k7) {
        this.f13874a = context;
        this.f13875b = i5;
        this.f13876c = xoVar;
        this.f13877d = c0650z8;
        this.f13878e = c0217i0;
        this.f13879f = j82;
        this.f13880g = c0275k7;
        this.f13881h = c0650z8.f14987a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C0391on C = C0353na.I.C();
        C0172g7 c0172g7 = new C0172g7(objectRef);
        synchronized (C) {
            C.f14433b.a(c0172g7);
        }
        return (String) objectRef.element;
    }

    public final C0095d7 a() {
        long optLong;
        Io io2;
        Integer valueOf = Integer.valueOf(this.f13881h.f12731e);
        String name = this.f13881h.getName();
        String value = this.f13881h.getValue();
        xo xoVar = this.f13876c;
        int i5 = this.f13875b;
        synchronized (xoVar) {
            try {
                JSONObject a7 = xoVar.f14934a.a();
                JSONObject optJSONObject = a7.optJSONObject("numbers_of_type");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                optLong = optJSONObject.optLong(String.valueOf(i5));
                optJSONObject.put(String.valueOf(i5), 1 + optLong);
                xoVar.f14934a.a(a7.put("numbers_of_type", optJSONObject));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Long valueOf2 = Long.valueOf(optLong);
        C0275k7 c0275k7 = this.f13880g;
        c0275k7.getClass();
        Kb m6 = C0353na.I.m();
        Location userLocation = m6.getUserLocation();
        if (userLocation != null) {
            int i10 = Io.f12395b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            io2 = new Io(location, provider);
        } else {
            Location systemLocation = m6.getSystemLocation();
            io2 = systemLocation != null ? new Io(new Location(systemLocation), "") : null;
        }
        boolean z5 = c0275k7.f14102a.f14125d;
        Double valueOf3 = io2 != null ? Double.valueOf(io2.getLatitude()) : null;
        Double valueOf4 = io2 != null ? Double.valueOf(io2.getLongitude()) : null;
        Long valueOf5 = io2 != null ? Long.valueOf(io2.getTime()) : null;
        Integer valueOf6 = io2 != null ? Integer.valueOf((int) io2.getAccuracy()) : null;
        Integer valueOf7 = io2 != null ? Integer.valueOf((int) io2.getBearing()) : null;
        Integer valueOf8 = io2 != null ? Integer.valueOf((int) io2.getSpeed()) : null;
        C0224i7 c0224i7 = new C0224i7(Boolean.valueOf(z5), valueOf4, valueOf3, io2 != null ? Integer.valueOf((int) io2.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, io2 != null ? io2.getProvider() : null, io2 != null ? io2.f12396a : null);
        String str = this.f13881h.f12729c;
        C0217i0 c0217i0 = this.f13878e;
        String str2 = c0217i0.f13914a;
        Long valueOf9 = Long.valueOf(c0217i0.f13915b);
        Integer valueOf10 = Integer.valueOf(this.f13881h.f12733g);
        Context context = this.f13874a;
        Ce ce2 = Ge.f12262a;
        Integer num = (Integer) Ge.f12264c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Fe()));
        num.intValue();
        String b10 = b();
        I8 i82 = this.f13877d.f14988b;
        P5 p52 = this.f13881h;
        return new C0095d7(valueOf, name, value, valueOf2, c0224i7, str, str2, valueOf9, valueOf10, num, b10, i82, p52.f12734h, p52.f12736k, p52.f12737l, p52.f12739n, p52.f12740o, this.f13879f.fromModel(p52.f12741p));
    }

    public /* synthetic */ C0198h7(Context context, Tk tk, int i5, xo xoVar, C0650z8 c0650z8, C0285kh c0285kh, C0217i0 c0217i0) {
        this(context, tk, i5, xoVar, c0650z8, c0217i0, new J8(), new C0275k7(c0285kh));
    }
}
