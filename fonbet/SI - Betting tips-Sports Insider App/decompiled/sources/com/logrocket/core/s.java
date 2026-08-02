package com.logrocket.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static ArrayList f6637a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f6638b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f6639c = new AtomicBoolean(false);

    public static void a(boolean z5) {
        f6638b.set(false);
        if (z5) {
            f6639c.set(false);
            f6637a = new ArrayList();
        }
    }
}
