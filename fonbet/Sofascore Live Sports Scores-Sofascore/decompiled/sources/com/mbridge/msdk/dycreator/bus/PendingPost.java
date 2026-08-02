package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class PendingPost {
    private static final List<PendingPost> d = new ArrayList();
    Object a;
    Subscription b;
    PendingPost c;

    private PendingPost(Object obj, Subscription subscription) {
        this.a = obj;
        this.b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost remove = list.remove(size - 1);
                remove.a = obj;
                remove.b = subscription;
                remove.c = null;
                return remove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.a = null;
        pendingPost.b = null;
        pendingPost.c = null;
        List<PendingPost> list = d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
