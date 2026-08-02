package u7;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6528b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6528b f66195a = new C6528b();

    /* renamed from: b, reason: collision with root package name */
    public static final c f66196b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f66197c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f66198d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f66199e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f66200f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f66201g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f66202h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f66203i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f66204j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f66205k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f66206l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f66207m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f66208n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f66209o;

    /* renamed from: p, reason: collision with root package name */
    public static final List f66210p;

    static {
        c cVar = new c("JPEG", "jpeg");
        f66196b = cVar;
        c cVar2 = new c("PNG", "png");
        f66197c = cVar2;
        c cVar3 = new c("GIF", "gif");
        f66198d = cVar3;
        c cVar4 = new c("BMP", "bmp");
        f66199e = cVar4;
        c cVar5 = new c("ICO", "ico");
        f66200f = cVar5;
        c cVar6 = new c("WEBP_SIMPLE", "webp");
        f66201g = cVar6;
        c cVar7 = new c("WEBP_LOSSLESS", "webp");
        f66202h = cVar7;
        c cVar8 = new c("WEBP_EXTENDED", "webp");
        f66203i = cVar8;
        c cVar9 = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
        f66204j = cVar9;
        c cVar10 = new c("WEBP_ANIMATED", "webp");
        f66205k = cVar10;
        c cVar11 = new c("HEIF", "heif");
        f66206l = cVar11;
        f66207m = new c("DNG", "dng");
        c cVar12 = new c("BINARY_XML", "xml");
        f66208n = cVar12;
        c cVar13 = new c("AVIF", "avif");
        f66209o = cVar13;
        f66210p = CollectionsKt.listOf((Object[]) new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13});
    }

    public static final boolean a(c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == f66201g || imageFormat == f66202h || imageFormat == f66203i || imageFormat == f66204j;
    }

    public static final boolean b(c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return a(imageFormat) || imageFormat == f66205k;
    }
}
