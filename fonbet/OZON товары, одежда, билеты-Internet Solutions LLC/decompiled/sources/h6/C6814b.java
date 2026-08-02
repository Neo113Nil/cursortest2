package h6;

import T5.i;
import V5.v;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import c6.w;

/* renamed from: h6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6814b implements InterfaceC6817e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f65025a;

    public C6814b(@NonNull Resources resources) {
        this.f65025a = resources;
    }

    @Override // h6.InterfaceC6817e
    public final v<BitmapDrawable> a(@NonNull v<Bitmap> vVar, @NonNull i iVar) {
        return w.c(this.f65025a, vVar);
    }
}
