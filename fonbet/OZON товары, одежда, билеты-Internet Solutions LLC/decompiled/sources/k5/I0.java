package k5;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import k5.InterfaceC7518g2;

/* loaded from: classes8.dex */
final class I0 extends D0<Om0.a> implements InterfaceC7518g2<Om0.a> {

    /* renamed from: i, reason: collision with root package name */
    private static final String f70578i = C7563s0.a(new byte[]{12, -92, -14, 97, 42, 62, -75, 46, -12, 119, -98, -59, -12, -15, 32, -67});

    /* renamed from: j, reason: collision with root package name */
    private static final String f70579j = C7563s0.a(new byte[]{85, -121, 73, 68, 100, 116, -47, 17, 59, 36, 117, 9, 34, -35, 119, -6, -13, -22, -31, -105, -108, -35, -99, -83, -64, 98, 48, -83, 124, 86, 46, -108, 32, 0, 58, 45, -94, -118, -87, 2, -32, -100, 26, 7, 90, 29, 113, 106});

    /* renamed from: e, reason: collision with root package name */
    private final String[] f70580e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final HashSet f70581f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final Context f70582g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70583h;

    I0(@NonNull HashSet hashSet, @NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0) {
        super(Mm0.e.GoogleServicesParameters);
        this.f70580e = new String[]{f70578i};
        this.f70581f = hashSet;
        this.f70582g = context;
        this.f70583h = abstractC7520h0;
    }

    @Override // k5.InterfaceC7518g2
    /* renamed from: c */
    public final InterfaceC7518g2.a mo68c() {
        return new H0(this);
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70583h;
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.a s() throws D1 {
        Om0.a aVar = new Om0.a();
        Mm0.e eVar = Mm0.e.GoogleServicesDeviceId;
        if (this.f70581f.contains(eVar)) {
            aVar.put(eVar.name(), this.f70583h.a(eVar, TimeUnit.DAYS.toMillis(30L)));
        }
        return aVar;
    }
}
