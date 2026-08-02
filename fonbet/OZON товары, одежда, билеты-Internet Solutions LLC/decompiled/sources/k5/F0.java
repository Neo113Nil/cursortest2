package k5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k5.InterfaceC7518g2;

/* loaded from: classes8.dex */
abstract class F0<T> extends D0<Serializable> implements InterfaceC7542m2, InterfaceC7518g2<a> {

    /* renamed from: i, reason: collision with root package name */
    private static final long f70535i = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f70536j = 0;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70537e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70538f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final InterfaceC7587y0 f70539g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final G0 f70540h;

    static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        ArrayList<InterfaceC7496b0> f70541a;

        /* renamed from: b, reason: collision with root package name */
        long f70542b;

        a() {
            throw null;
        }
    }

    F0(@NonNull Context context, @NonNull Mm0.e eVar, @NonNull AbstractC7520h0 abstractC7520h0, @NonNull InterfaceC7587y0 interfaceC7587y0, @NonNull G0 g02) {
        super(eVar);
        this.f70537e = context;
        this.f70538f = abstractC7520h0;
        this.f70539g = interfaceC7587y0;
        this.f70540h = g02;
    }

    protected final boolean A() {
        Iterator it = r().iterator();
        while (it.hasNext()) {
            if (!Gf.d.l(this.f70537e, ((EnumC7578w) it.next()).a())) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    protected final List<InterfaceC7496b0> B() throws D1 {
        int i11 = Build.VERSION.SDK_INT;
        Context context = this.f70537e;
        if (!(i11 >= 28 ? ((LocationManager) context.getSystemService("location")).isLocationEnabled() : Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0)) {
            throw new C7571u0("The network provider is not activated for location detection in the phone settings");
        }
        if (!D()) {
            throw new P2("The device not support system feature: android.hardware.telephony (for Android 13.0 (Tiramisu) additionally required 'android.hardware.telephony.radio.access'");
        }
        List<InterfaceC7496b0> list = Collections.EMPTY_LIST;
        a w11 = w();
        if (w11 != null) {
            list = w11.f70541a;
        }
        e();
        return list;
    }

    protected final boolean D() {
        PackageManager packageManager = this.f70537e.getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? packageManager.hasSystemFeature("android.hardware.telephony.radio.access") : packageManager.hasSystemFeature("android.hardware.telephony");
    }

    public final void F(a aVar) {
        this.f70538f.c(Mm0.e.CellIdentities, aVar);
    }

    @Override // k5.InterfaceC7542m2
    @NonNull
    public final Context b() {
        return this.f70537e;
    }

    @Override // k5.InterfaceC7518g2
    /* renamed from: c */
    public final InterfaceC7518g2.a mo68c() {
        return new E0(this);
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70538f;
    }

    @Override // k5.InterfaceC7542m2
    @NonNull
    public final HashSet r() {
        return C7540m0.a(EnumC7578w.ACCESS_FINE_LOCATION);
    }

    public final a w() {
        return (a) this.f70538f.a(Mm0.e.CellIdentities, InterfaceC7500c0.f70717a);
    }
}
