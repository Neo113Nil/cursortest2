package kb;

import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import java.util.HashMap;
import java.util.Set;

/* renamed from: kb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5220e {

    /* renamed from: g, reason: collision with root package name */
    public static final zzal f54386g;

    /* renamed from: a, reason: collision with root package name */
    public final String f54387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54388b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54389c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54390d;

    /* renamed from: e, reason: collision with root package name */
    public final String f54391e;

    /* renamed from: f, reason: collision with root package name */
    public final String f54392f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f54386g = zzal.zza(hashMap);
    }

    public C5220e(String str) {
        String e10 = e(str, "apiKey");
        String e11 = e(str, "oobCode");
        String e12 = e(str, "mode");
        if (e10 == null || e11 == null || e12 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f54387a = AbstractC3191o.g(e10);
        this.f54388b = AbstractC3191o.g(e11);
        this.f54389c = AbstractC3191o.g(e12);
        this.f54390d = e(str, "continueUrl");
        this.f54391e = e(str, "lang");
        this.f54392f = e(str, "tenantId");
    }

    public static C5220e c(String str) {
        AbstractC3191o.g(str);
        try {
            return new C5220e(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(AbstractC3191o.g(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f54388b;
    }

    public int b() {
        zzal zzalVar = f54386g;
        if (zzalVar.containsKey(this.f54389c)) {
            return ((Integer) zzalVar.get(this.f54389c)).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f54392f;
    }
}
