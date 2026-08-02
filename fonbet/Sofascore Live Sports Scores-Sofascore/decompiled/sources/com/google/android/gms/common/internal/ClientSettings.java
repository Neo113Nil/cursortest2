package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.signin.SignInOptions;
import defpackage.dh0;
import defpackage.gh0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class ClientSettings {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final SignInOptions g;
    public Integer h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static final class Builder {
        public Account a;
        public gh0 b;
        public String c;
        public String d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    public ClientSettings(Account account, Set set, dh0 dh0Var, String str, String str2, SignInOptions signInOptions) {
        this.a = account;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = unmodifiableSet;
        dh0 dh0Var2 = dh0Var == null ? Collections.EMPTY_MAP : dh0Var;
        this.d = dh0Var2;
        this.e = str;
        this.f = str2;
        this.g = signInOptions == null ? SignInOptions.a : signInOptions;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = dh0Var2.values().iterator();
        while (it.hasNext()) {
            ((zae) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
