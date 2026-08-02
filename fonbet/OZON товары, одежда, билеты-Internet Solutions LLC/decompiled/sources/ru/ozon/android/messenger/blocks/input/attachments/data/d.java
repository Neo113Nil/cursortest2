package ru.ozon.android.messenger.blocks.input.attachments.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.attachments.data.FileUploaderImpl", f = "FileUploader.kt", l = {79}, m = "constructRequestAndUpload")
/* loaded from: classes10.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f85358d;

    /* renamed from: e, reason: collision with root package name */
    l f85359e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f85360f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f85361g;

    /* renamed from: h, reason: collision with root package name */
    int f85362h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f85361g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object e11;
        this.f85360f = obj;
        this.f85362h |= LinearLayoutManager.INVALID_OFFSET;
        e11 = this.f85361g.e(null, null, this);
        return e11;
    }
}
