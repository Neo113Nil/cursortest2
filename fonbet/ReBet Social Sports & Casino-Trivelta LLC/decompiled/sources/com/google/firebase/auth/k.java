package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f37710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ab.b f37711b;

    public k(FirebaseAuth firebaseAuth, Ab.b bVar) {
        this.f37710a = firebaseAuth;
        this.f37711b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f37710a.f37560d.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Iterator it2 = this.f37710a.f37558b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a(this.f37710a);
        }
    }
}
