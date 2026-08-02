package c0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3296a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f3297b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3298c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3299d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3300e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f3301f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f3302g;

    public q(String str, PendingIntent pendingIntent) {
        IconCompat b10 = IconCompat.b(2131230936);
        Bundle bundle = new Bundle();
        this.f3299d = true;
        this.f3297b = b10;
        if (b10.d() == 2) {
            this.f3300e = b10.c();
        }
        this.f3301f = w.b(str);
        this.f3302g = pendingIntent;
        this.f3296a = bundle;
        this.f3298c = true;
        this.f3299d = true;
    }
}
