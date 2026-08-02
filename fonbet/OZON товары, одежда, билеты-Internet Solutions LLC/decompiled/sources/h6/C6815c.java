package h6;

import T5.i;
import V5.v;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import c6.C5753e;

/* renamed from: h6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6815c implements InterfaceC6817e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final W5.d f65026a;

    /* renamed from: b, reason: collision with root package name */
    private final C6813a f65027b;

    /* renamed from: c, reason: collision with root package name */
    private final C6816d f65028c;

    public C6815c(@NonNull W5.d dVar, @NonNull C6813a c6813a, @NonNull C6816d c6816d) {
        this.f65026a = dVar;
        this.f65027b = c6813a;
        this.f65028c = c6816d;
    }

    @Override // h6.InterfaceC6817e
    public final v<byte[]> a(@NonNull v<Drawable> vVar, @NonNull i iVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f65027b.a(C5753e.c(this.f65026a, ((BitmapDrawable) drawable).getBitmap()), iVar);
        }
        if (drawable instanceof g6.c) {
            return this.f65028c.a(vVar, iVar);
        }
        return null;
    }
}
