package d6;

import android.content.ComponentName;
import android.content.Context;
import hi.c;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4011a {

    /* renamed from: c, reason: collision with root package name */
    public static final C4011a f45005c = new C4011a();

    /* renamed from: a, reason: collision with root package name */
    public Boolean f45006a;

    /* renamed from: b, reason: collision with root package name */
    public ComponentName f45007b;

    public void a(Context context, int i10) {
        if (this.f45007b == null) {
            this.f45007b = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent();
        }
        b(context, i10);
    }

    public final void b(Context context, int i10) {
        Boolean bool = this.f45006a;
        if (bool != null) {
            if (bool.booleanValue()) {
                c.a(context, i10);
            }
        } else {
            Boolean valueOf = Boolean.valueOf(c.a(context, i10));
            this.f45006a = valueOf;
            if (valueOf.booleanValue()) {
                E6.a.s("ApplicationBadgeHelper", "First attempt to use automatic badger succeeded; permanently enabling method.");
            } else {
                E6.a.s("ApplicationBadgeHelper", "First attempt to use automatic badger failed; permanently disabling method.");
            }
        }
    }
}
