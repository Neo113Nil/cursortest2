package k5;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.HashSet;
import k5.InterfaceC7518g2;

/* renamed from: k5.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7566t extends D0<String> implements InterfaceC7518g2<String>, O0 {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70864e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70865f;

    C7566t(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0) {
        super(Mm0.e.AdvertiserId);
        this.f70864e = context;
        this.f70865f = abstractC7520h0;
    }

    @Override // k5.InterfaceC7518g2
    /* renamed from: c */
    public final InterfaceC7518g2.a mo68c() {
        return new C7562s(this);
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70865f;
    }

    @Override // k5.O0
    @NonNull
    public final HashSet q() {
        return C7540m0.a(C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 41, -110, -114, 116, 44, 103, -43, 28, -1, 112, 110, -98, 1, 33, -92, -4, 108, -93, 2, 47, -11, Byte.MIN_VALUE, -35, 116, 69, -7, 36, 126, -108, 3, 123, -96, -62, -95, 40, 14, 29, 44, 125, -20, -98, -8, -1, 57, 64, -1, 59, -6}), C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, -126, 17, 104, -15, -21, 6, 100, 13, 25, 20, -74, 91, -4, -67, 80, 0, -24, -118, -20, -83, -19, 6, 60, -47, 30, -51, 86, 103, 95, -11, -126, 105, -66, 73, 123, -77, -108, 62, 16, -19, 52, -27, 118, -31, 1, 41, 85, -48}), C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, -51, 118, 17, 73, -42, -74, -114, -94, 58, -67, -5, -127, -96, -127, -86, 24, 10, -121, 12, 15, 48, -126, -122, -28, -109, -61, -45, -43, -15, 96, -23, -85}), C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 41, -110, -114, 116, 44, 103, -43, 28, -1, 112, 110, -98, 1, 33, -92, -4, -56, 68, -75, -124, -70, 77, -17, -75, -35, -17, Byte.MAX_VALUE, 15, 117, -39, 36, 125, 8, -15, 11, 22, -62, -107, 5, 102, 98, 8, 96, 1, 63, -15, -65, -88, -73, 21, 63, 57, 104, 103, 45, -112, 3, 91, 126, -42, -122, 112, 77, -89}), C7563s0.a(new byte[]{-66, -105, -31, -70, -121, -70, -92, 42, -39, -51, -116, -12, 3, -19, 77, -7, 41, -110, -114, 116, 44, 103, -43, 28, -1, 112, 110, -98, 1, 33, -92, -4, -56, 68, -75, -124, -70, 77, -17, -75, -35, -17, Byte.MAX_VALUE, 15, 117, -39, 36, 125, -1, -95, -36, -93, 41, -23, -86, -105, 102, 52, -86, 91, -70, 72, -75, -122, -52, -53, 67, 80, -70, -66, -68, -106, 104, 122, -1, -92, 104, 111, 56, 113}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String str = (String) p(InterfaceC7500c0.f70717a);
        if (str != null && !str.equals("0")) {
            return str;
        }
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f70864e) != 0) {
            throw new P2(C7563s0.a(new byte[]{38, -73, 58, 110, -1, -19, 27, -8, -76, 77, -32, 56, -3, -11, -80, -96, 108, -91, -126, 29, 100, 23, 30, 54, 56, 14, -21, -11, 115, 7, 5, -34, 53, 37, 18, -14, -28, 103, 58, -53, 81, 122, -81, 1, -39, 117, -122, -7, 30, 105, -55, -50, 99, -31, 32, 89, 3, -102, -95, 95, 75, 80, -75, -51, Byte.MIN_VALUE, 107, 87, -10, 101, -118, -22, 73, -28, -31, -22, 21, -70, 104, -10, -101}));
        }
        e();
        throw new P1(C7563s0.a(new byte[]{-103, -75, 14, 84, 69, -13, 108, -7, -111, 8, -91, -65, 8, 77, 23, 37, -119, -24, -98, -123, -58, 2, 22, -11, -46, -113, -60, -89, 96, 60, 110, -110}));
    }
}
