package androidx.room;

import xsna.cmg0;
import xsna.hyg0;

/* compiled from: RoomOpenDelegate.kt */
/* loaded from: classes.dex */
public abstract class l implements cmg0 {
    public final int a;
    public final String b;
    public final String c;

    /* compiled from: RoomOpenDelegate.kt */
    /* loaded from: classes12.dex */
    public static final class a {
        public final boolean a;
        public final String b;

        public a(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public l(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public abstract void a(hyg0 hyg0Var);

    public abstract void b(hyg0 hyg0Var);

    public abstract void c();

    public abstract void d(hyg0 hyg0Var);

    public abstract void e();

    public abstract void f(hyg0 hyg0Var);

    public abstract a g(hyg0 hyg0Var);
}
