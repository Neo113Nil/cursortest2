package q5;

import androidx.recyclerview.widget.LinearLayoutManager;
import l5.C7873b;
import l5.InterfaceC7874c;
import org.jetbrains.annotations.NotNull;
import p5.m;
import v5.C10234h;
import v5.C10239m;

@kotlin.coroutines.jvm.internal.e(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {199}, m = "decode")
/* renamed from: q5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8987b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8986a f81631d;

    /* renamed from: e, reason: collision with root package name */
    m f81632e;

    /* renamed from: f, reason: collision with root package name */
    C7873b f81633f;

    /* renamed from: g, reason: collision with root package name */
    C10234h f81634g;

    /* renamed from: h, reason: collision with root package name */
    Object f81635h;

    /* renamed from: i, reason: collision with root package name */
    C10239m f81636i;

    /* renamed from: j, reason: collision with root package name */
    InterfaceC7874c f81637j;

    /* renamed from: k, reason: collision with root package name */
    n5.g f81638k;

    /* renamed from: l, reason: collision with root package name */
    int f81639l;

    /* renamed from: m, reason: collision with root package name */
    /* synthetic */ Object f81640m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ C8986a f81641n;

    /* renamed from: o, reason: collision with root package name */
    int f81642o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8987b(C8986a c8986a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f81641n = c8986a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f81640m = obj;
        this.f81642o |= LinearLayoutManager.INVALID_OFFSET;
        return C8986a.b(this.f81641n, null, null, null, null, null, null, this);
    }
}
