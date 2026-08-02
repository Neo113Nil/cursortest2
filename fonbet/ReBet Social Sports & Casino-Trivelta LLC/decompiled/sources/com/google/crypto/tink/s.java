package com.google.crypto.tink;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f37218a = new CopyOnWriteArrayList();

    public static r a(String str) {
        Iterator it = f37218a.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar.a(str)) {
                return rVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
