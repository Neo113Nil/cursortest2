package t5;

import android.graphics.Bitmap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import t5.InterfaceC9758c;

/* renamed from: t5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9756a implements InterfaceC9763h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9764i f99169a;

    public C9756a(@NotNull InterfaceC9764i interfaceC9764i) {
        this.f99169a = interfaceC9764i;
    }

    @Override // t5.InterfaceC9763h
    public final void a(int i11) {
    }

    @Override // t5.InterfaceC9763h
    public final InterfaceC9758c.C2178c b(@NotNull InterfaceC9758c.b bVar) {
        return null;
    }

    @Override // t5.InterfaceC9763h
    public final void c(@NotNull InterfaceC9758c.b bVar, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        this.f99169a.c(bVar, bitmap, map, A5.a.a(bitmap));
    }
}
