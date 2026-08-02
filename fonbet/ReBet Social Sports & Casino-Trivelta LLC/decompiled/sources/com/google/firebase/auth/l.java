package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37712a;

    public l(FirebaseAuth firebaseAuth) {
        this.f37712a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f37712a.f37559c.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a(this.f37712a);
        }
    }
}
