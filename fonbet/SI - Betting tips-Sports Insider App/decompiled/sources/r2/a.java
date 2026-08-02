package r2;

import a2.e;
import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.x;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import md.o;
import q2.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f22199a;

    /* renamed from: b, reason: collision with root package name */
    public final me.a f22200b;

    /* renamed from: c, reason: collision with root package name */
    public final o f22201c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f22202d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22203e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f22204f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22205g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22206h;

    public a(f owner, me.a onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.f22199a = owner;
        this.f22200b = onAttach;
        this.f22201c = new o(3);
        this.f22202d = new LinkedHashMap();
        this.f22206h = true;
    }

    public final void a() {
        f fVar = this.f22199a;
        if (((g0) fVar.getLifecycle()).f2169d != x.f2254b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f22203e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f22200b.invoke();
        fVar.getLifecycle().a(new e(2, this));
        this.f22203e = true;
    }
}
