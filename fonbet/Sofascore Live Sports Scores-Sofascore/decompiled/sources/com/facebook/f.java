package com.facebook;

import defpackage.pic;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ pic a;
    public final /* synthetic */ AccessToken b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ HashSet e;
    public final /* synthetic */ HashSet f;
    public final /* synthetic */ i g;

    public /* synthetic */ f(pic picVar, AccessToken accessToken, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, i iVar) {
        this.a = picVar;
        this.b = accessToken;
        this.c = atomicBoolean;
        this.d = hashSet;
        this.e = hashSet2;
        this.f = hashSet3;
        this.g = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        Date date;
        AccessToken accessToken = this.b;
        AtomicBoolean atomicBoolean = this.c;
        AtomicBoolean atomicBoolean2 = this.g.d;
        pic picVar = this.a;
        String str = (String) picVar.d;
        int i = picVar.a;
        Long l = (Long) picVar.c;
        String str2 = (String) picVar.e;
        try {
            b bVar = i.f;
            if (bVar.i().c != null) {
                AccessToken accessToken2 = bVar.i().c;
                if ((accessToken2 != null ? accessToken2.i : null) == accessToken.i) {
                    if (!atomicBoolean.get() && str == null && i == 0) {
                        atomicBoolean2.set(false);
                        return;
                    }
                    Date date2 = accessToken.a;
                    if (picVar.a != 0) {
                        date = new Date(picVar.a * 1000);
                        j = 1000;
                    } else {
                        if (picVar.b != 0) {
                            j = 1000;
                            date2 = new Date((picVar.b * 1000) + new Date().getTime());
                        } else {
                            j = 1000;
                        }
                        date = date2;
                    }
                    if (str == null) {
                        str = accessToken.e;
                    }
                    String str3 = str;
                    String str4 = accessToken.h;
                    String str5 = accessToken.i;
                    Collection collection = atomicBoolean.get() ? this.d : accessToken.b;
                    Collection collection2 = atomicBoolean.get() ? this.e : accessToken.c;
                    Collection collection3 = atomicBoolean.get() ? this.f : accessToken.d;
                    j jVar = accessToken.f;
                    Date date3 = new Date();
                    Date date4 = l != null ? new Date(l.longValue() * j) : accessToken.j;
                    if (str2 == null) {
                        str2 = accessToken.k;
                    }
                    bVar.i().c(new AccessToken(str3, str4, str5, collection, collection2, collection3, jVar, date, date3, date4, str2), true);
                    atomicBoolean2.set(false);
                }
            }
        } finally {
            atomicBoolean2.set(false);
        }
    }
}
