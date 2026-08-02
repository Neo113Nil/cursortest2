package lb;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes3.dex */
public final class Z implements kb.F {

    /* renamed from: a, reason: collision with root package name */
    public final String f55727a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55729c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55730d;

    /* renamed from: e, reason: collision with root package name */
    public final long f55731e;

    /* renamed from: f, reason: collision with root package name */
    public String f55732f;

    /* renamed from: g, reason: collision with root package name */
    public FirebaseAuth f55733g;

    public Z(String str, String str2, int i10, int i11, long j10, String str3, FirebaseAuth firebaseAuth) {
        AbstractC3191o.h(str3, "sessionInfo cannot be empty.");
        AbstractC3191o.n(firebaseAuth, "firebaseAuth cannot be null.");
        this.f55727a = AbstractC3191o.h(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f55728b = AbstractC3191o.h(str2, "hashAlgorithm cannot be empty.");
        this.f55729c = i10;
        this.f55730d = i11;
        this.f55731e = j10;
        this.f55732f = str3;
        this.f55733g = firebaseAuth;
    }

    @Override // kb.F
    public final String a() {
        return this.f55732f;
    }

    @Override // kb.F
    public final String b() {
        return this.f55727a;
    }

    @Override // kb.F
    public final String c(String str, String str2) {
        AbstractC3191o.h(str, "accountName cannot be empty.");
        AbstractC3191o.h(str2, "issuer cannot be empty.");
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.f55727a, str2, this.f55728b, Integer.valueOf(this.f55729c));
    }

    @Override // kb.F
    public final void d(String str) {
        AbstractC3191o.h(str, "qrCodeUrl cannot be empty.");
        try {
            e(str);
        } catch (ActivityNotFoundException unused) {
            e("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    public final void e(String str) {
        this.f55733g.i().l().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }
}
