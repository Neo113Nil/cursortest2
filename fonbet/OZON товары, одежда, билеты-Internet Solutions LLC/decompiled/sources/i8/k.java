package i8;

import com.google.android.gms.security.ProviderInstaller;
import i8.l;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class k<T_WRAPPER extends l<JcePrimitiveT>, JcePrimitiveT> {

    /* renamed from: b, reason: collision with root package name */
    public static final k<l.a, Cipher> f66115b = new k<>(new l.a());

    /* renamed from: c, reason: collision with root package name */
    public static final k<l.e, Mac> f66116c = new k<>(new l.e());

    /* renamed from: a, reason: collision with root package name */
    private final d<JcePrimitiveT> f66117a;

    private static class a<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final l<JcePrimitiveT> f66118a;

        a(l lVar) {
            this.f66118a = lVar;
        }

        @Override // i8.k.d
        public final JcePrimitiveT a(String str) throws GeneralSecurityException {
            String[] strArr = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < 2; i11++) {
                Provider provider = Security.getProvider(strArr[i11]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            Iterator it = arrayList.iterator();
            Exception exc = null;
            while (true) {
                boolean hasNext = it.hasNext();
                l<JcePrimitiveT> lVar = this.f66118a;
                if (!hasNext) {
                    return lVar.a(str, null);
                }
                try {
                    return lVar.a(str, (Provider) it.next());
                } catch (Exception e11) {
                    if (exc == null) {
                        exc = e11;
                    }
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    private static class b<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final l<JcePrimitiveT> f66119a;

        b(l lVar) {
            this.f66119a = lVar;
        }

        @Override // i8.k.d
        public final JcePrimitiveT a(String str) throws GeneralSecurityException {
            return this.f66119a.a(str, null);
        }
    }

    /* loaded from: classes9.dex */
    private static class c<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final l<JcePrimitiveT> f66120a;

        c(l lVar) {
            this.f66120a = lVar;
        }

        @Override // i8.k.d
        public final JcePrimitiveT a(String str) throws GeneralSecurityException {
            String[] strArr = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"};
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < 3; i11++) {
                Provider provider = Security.getProvider(strArr[i11]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            Iterator it = arrayList.iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f66120a.a(str, (Provider) it.next());
                } catch (Exception e11) {
                    if (exc == null) {
                        exc = e11;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    private interface d<JcePrimitiveT> {
        JcePrimitiveT a(String str) throws GeneralSecurityException;
    }

    static {
        new k(new l.g());
        new k(new l.f());
        new k(new l.b());
        new k(new l.d());
        new k(new l.c());
    }

    public k(T_WRAPPER t_wrapper) {
        if (X7.a.b()) {
            this.f66117a = new c(t_wrapper);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f66117a = new a(t_wrapper);
        } else {
            this.f66117a = new b(t_wrapper);
        }
    }

    public final JcePrimitiveT a(String str) throws GeneralSecurityException {
        return this.f66117a.a(str);
    }
}
