package ru.ozon.pikazon.compose.painter;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.request.PikazonRequestBuilder;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.pikazon.compose.painter.PikazonImagePainter", f = "PikazonImagePainter.kt", l = {255, 277}, m = "load")
/* loaded from: classes7.dex */
final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    PikazonImagePainter f97658d;

    /* renamed from: e, reason: collision with root package name */
    PikazonRequestBuilder f97659e;

    /* renamed from: f, reason: collision with root package name */
    PikazonRequestBuilder f97660f;

    /* renamed from: g, reason: collision with root package name */
    PikazonImagePainter f97661g;

    /* renamed from: h, reason: collision with root package name */
    int f97662h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f97663i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ PikazonImagePainter f97664j;

    /* renamed from: k, reason: collision with root package name */
    int f97665k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(PikazonImagePainter pikazonImagePainter, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97664j = pikazonImagePainter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97663i = obj;
        this.f97665k |= LinearLayoutManager.INVALID_OFFSET;
        return PikazonImagePainter.a(this.f97664j, null, 0, this);
    }
}
