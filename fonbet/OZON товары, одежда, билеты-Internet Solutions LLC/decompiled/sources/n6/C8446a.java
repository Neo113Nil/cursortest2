package n6;

import Bl0.C2646g;
import android.graphics.drawable.Drawable;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8446a implements d<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private C2646g f76552a;

    @Override // n6.d
    public final c a(T5.a aVar) {
        if (aVar == T5.a.MEMORY_CACHE) {
            return b.f76553a;
        }
        if (this.f76552a == null) {
            this.f76552a = new C2646g();
        }
        return this.f76552a;
    }
}
