package t5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.U;
import l5.InterfaceC7874c;
import n5.EnumC8444d;
import org.jetbrains.annotations.NotNull;
import q5.C8986a;
import q5.k;
import t5.InterfaceC9758c;
import v5.C10234h;
import v5.C10239m;
import v5.C10242p;
import v5.C10243q;
import w5.AbstractC10429a;
import w5.C10435g;
import w5.EnumC10434f;

/* renamed from: t5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9759d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l5.i f99178a;

    public C9759d(@NotNull l5.i iVar, @NotNull C10242p c10242p) {
        this.f99178a = iVar;
    }

    @NotNull
    public static C10243q c(@NotNull k kVar, @NotNull C10234h c10234h, @NotNull InterfaceC9758c.b bVar, @NotNull InterfaceC9758c.C2178c c2178c) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c10234h.l().getResources(), c2178c.a());
        EnumC8444d enumC8444d = EnumC8444d.MEMORY_CACHE;
        Object obj = c2178c.b().get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = c2178c.b().get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z11 = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        int i11 = A5.k.f430d;
        if (kVar != null && kVar.d()) {
            z11 = true;
        }
        return new C10243q(bitmapDrawable, c10234h, enumC8444d, bVar, str, booleanValue, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0110, code lost:
    
        if (r5 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        if (r4 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
    
        if (r2 <= 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        if (java.lang.Math.abs(r8 - r7) <= r3) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC9758c.C2178c a(@NotNull C10234h c10234h, @NotNull InterfaceC9758c.b bVar, @NotNull C10435g c10435g, @NotNull EnumC10434f enumC10434f) {
        InterfaceC9758c.C2178c c2178c;
        InterfaceC9758c.C2178c c2178c2;
        ?? r32;
        if (c10234h.C().a()) {
            InterfaceC9758c g10 = this.f99178a.g();
            InterfaceC9758c.C2178c b11 = g10 != null ? g10.b(bVar) : null;
            if (b11 != null) {
                Bitmap.Config config = b11.a().getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                boolean z11 = false;
                if (C10242p.b(c10234h, config)) {
                    Object obj = b11.b().get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (!c10435g.equals(C10435g.f103580c)) {
                        String str = bVar.b().get("coil#transformation_size");
                        if (str != null) {
                            z11 = str.equals(c10435g.toString());
                        } else {
                            int width = b11.a().getWidth();
                            int height = b11.a().getHeight();
                            AbstractC10429a d11 = c10435g.d();
                            int i11 = d11 instanceof AbstractC10429a.C2245a ? ((AbstractC10429a.C2245a) d11).f103575a : Integer.MAX_VALUE;
                            AbstractC10429a c11 = c10435g.c();
                            int i12 = c11 instanceof AbstractC10429a.C2245a ? ((AbstractC10429a.C2245a) c11).f103575a : Integer.MAX_VALUE;
                            double a11 = n5.f.a(width, height, i11, i12, enumC10434f);
                            boolean a12 = A5.i.a(c10234h);
                            if (a12) {
                                double d12 = a11 > 1.0d ? 1.0d : a11;
                                c2178c = b11;
                                c2178c2 = null;
                                if (Math.abs(i11 - (width * d12)) <= 1.0d || Math.abs(i12 - (d12 * height)) <= 1.0d) {
                                    r32 = 1;
                                    z11 = r32;
                                } else {
                                    r32 = 1;
                                    if (a11 != 1.0d) {
                                    }
                                    if (a11 > 1.0d) {
                                    }
                                    z11 = r32;
                                }
                            } else {
                                c2178c = b11;
                                c2178c2 = null;
                                if (i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE) {
                                    r32 = 1;
                                } else {
                                    int abs = Math.abs(i11 - width);
                                    r32 = 1;
                                    r32 = 1;
                                }
                                if (i12 != Integer.MIN_VALUE && i12 != Integer.MAX_VALUE) {
                                    r32 = r32;
                                }
                                z11 = r32;
                            }
                        }
                    } else if (!booleanValue) {
                        c2178c = b11;
                        r32 = 1;
                        c2178c2 = null;
                        z11 = r32;
                    }
                    return !z11 ? c2178c : c2178c2;
                }
                c2178c = b11;
                c2178c2 = null;
                if (!z11) {
                }
            }
        }
        return null;
    }

    public final InterfaceC9758c.b b(@NotNull C10234h c10234h, @NotNull Object obj, @NotNull C10239m c10239m, @NotNull InterfaceC7874c interfaceC7874c) {
        InterfaceC9758c.b B11 = c10234h.B();
        if (B11 != null) {
            return B11;
        }
        String f7 = this.f99178a.f().f(obj, c10239m);
        if (f7 == null) {
            return null;
        }
        List<y5.b> O11 = c10234h.O();
        Map<String, String> c11 = c10234h.E().c();
        if (O11.isEmpty() && c11.isEmpty()) {
            return new InterfaceC9758c.b(f7, U.c());
        }
        LinkedHashMap u11 = U.u(c11);
        if (!O11.isEmpty()) {
            List<y5.b> O12 = c10234h.O();
            int size = O12.size();
            for (int i11 = 0; i11 < size; i11++) {
                u11.put(Ej.b.a(i11, "coil#transformation_"), O12.get(i11).getCacheKey());
            }
            u11.put("coil#transformation_size", c10239m.n().toString());
        }
        return new InterfaceC9758c.b(f7, u11);
    }

    public final boolean d(InterfaceC9758c.b bVar, @NotNull C10234h c10234h, @NotNull C8986a.C1375a c1375a) {
        InterfaceC9758c g10;
        Bitmap bitmap;
        if (!c10234h.C().b() || (g10 = this.f99178a.g()) == null || bVar == null) {
            return false;
        }
        Drawable d11 = c1375a.d();
        BitmapDrawable bitmapDrawable = d11 instanceof BitmapDrawable ? (BitmapDrawable) d11 : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c1375a.e()));
        String c11 = c1375a.c();
        if (c11 != null) {
            linkedHashMap.put("coil#disk_cache_key", c11);
        }
        g10.c(bVar, new InterfaceC9758c.C2178c(bitmap, linkedHashMap));
        return true;
    }
}
