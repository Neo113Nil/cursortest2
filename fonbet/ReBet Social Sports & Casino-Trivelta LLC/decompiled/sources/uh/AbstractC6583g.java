package uh;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: uh.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6583g {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f66719b;

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f66718a = Logger.getLogger(AbstractC6583g.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final List f66720c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f66721d = new Object();

    public static List a() {
        List list;
        synchronized (f66721d) {
            list = f66720c;
        }
        return list;
    }

    public static void b() {
        synchronized (f66721d) {
            f66719b = true;
        }
    }
}
