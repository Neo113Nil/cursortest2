package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import cb.k;
import com.google.crypto.tink.l;
import com.google.crypto.tink.n;
import com.google.crypto.tink.o;
import com.google.crypto.tink.proto.I;
import com.google.crypto.tink.q;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f37016d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final String f37017e = "a";

    /* renamed from: a, reason: collision with root package name */
    public final q f37018a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.crypto.tink.a f37019b;

    /* renamed from: c, reason: collision with root package name */
    public o f37020c;

    /* renamed from: com.google.crypto.tink.integration.android.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0514a {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[I.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Context f37021a = null;

        /* renamed from: b, reason: collision with root package name */
        public String f37022b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f37023c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f37024d = null;

        /* renamed from: e, reason: collision with root package name */
        public com.google.crypto.tink.a f37025e = null;

        /* renamed from: f, reason: collision with root package name */
        public boolean f37026f = true;

        /* renamed from: g, reason: collision with root package name */
        public l f37027g = null;

        /* renamed from: h, reason: collision with root package name */
        public o f37028h;

        public static byte[] h(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public synchronized a f() {
            a aVar;
            try {
                if (this.f37022b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (a.f37016d) {
                    try {
                        byte[] h10 = h(this.f37021a, this.f37022b, this.f37023c);
                        if (h10 == null) {
                            if (this.f37024d != null) {
                                this.f37025e = k();
                            }
                            this.f37028h = g();
                        } else {
                            if (this.f37024d != null && a.e()) {
                                this.f37028h = j(h10);
                            }
                            this.f37028h = i(h10);
                        }
                        aVar = new a(this, null);
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return aVar;
        }

        public final o g() {
            if (this.f37027g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            o a10 = o.i().a(this.f37027g);
            o h10 = a10.h(a10.d().i().T(0).T());
            d dVar = new d(this.f37021a, this.f37022b, this.f37023c);
            if (this.f37025e != null) {
                h10.d().r(dVar, this.f37025e);
                return h10;
            }
            com.google.crypto.tink.c.b(h10.d(), dVar);
            return h10;
        }

        public final o i(byte[] bArr) {
            return o.j(com.google.crypto.tink.c.a(com.google.crypto.tink.b.b(bArr)));
        }

        public final o j(byte[] bArr) {
            try {
                this.f37025e = new c().b(this.f37024d);
                try {
                    return o.j(n.n(com.google.crypto.tink.b.b(bArr), this.f37025e));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    o i10 = i(bArr);
                    Log.w(a.f37017e, "cannot use Android Keystore, it'll be disabled", e11);
                    return i10;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        public final com.google.crypto.tink.a k() {
            if (!a.e()) {
                Log.w(a.f37017e, "Android Keystore requires at least Android M");
                return null;
            }
            c cVar = new c();
            try {
                boolean d10 = c.d(this.f37024d);
                try {
                    return cVar.b(this.f37024d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!d10) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f37024d), e10);
                    }
                    Log.w(a.f37017e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(a.f37017e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public b l(l lVar) {
            this.f37027g = lVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f37026f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f37024d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f37021a = context;
            this.f37022b = str;
            this.f37023c = str2;
            return this;
        }
    }

    public /* synthetic */ a(b bVar, C0514a c0514a) {
        this(bVar);
    }

    public static boolean e() {
        return true;
    }

    public synchronized n d() {
        return this.f37020c.d();
    }

    public a(b bVar) {
        this.f37018a = new d(bVar.f37021a, bVar.f37022b, bVar.f37023c);
        this.f37019b = bVar.f37025e;
        this.f37020c = bVar.f37028h;
    }
}
