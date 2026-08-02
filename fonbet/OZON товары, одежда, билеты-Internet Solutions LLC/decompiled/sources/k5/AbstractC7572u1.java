package k5;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.HashSet;
import k5.InterfaceC7518g2;

/* renamed from: k5.u1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC7572u1 extends D0<String> implements InterfaceC7518g2<String>, O0 {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70869e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70870f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private String f70871g;

    /* renamed from: h, reason: collision with root package name */
    private int f70872h;

    AbstractC7572u1(@NonNull Mm0.e eVar, @NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0) {
        super(eVar);
        this.f70871g = "";
        this.f70869e = context;
        this.f70870f = abstractC7520h0;
    }

    @Override // k5.InterfaceC7518g2
    /* renamed from: c */
    public final InterfaceC7518g2.a mo68c() {
        return new C7568t1(this);
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70870f;
    }

    @Override // k5.O0
    @NonNull
    public final HashSet q() {
        return C7540m0.a(J1.f70588a, J1.f70589b, J1.f70590c, J1.f70591d, J1.f70592e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String str = (String) p(InterfaceC7500c0.f70717a);
        if (str != null && !str.equals("0")) {
            return str;
        }
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f70869e) != 0) {
            throw new P2("!GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(mContext)");
        }
        e();
        throw new P1("cachedValue == null");
    }
}
