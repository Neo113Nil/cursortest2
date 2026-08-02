package ru.ozon.fintech.features.recordaudio.domain;

import androidx.recyclerview.widget.LinearLayoutManager;
import g30.InterfaceC6618a;
import java.io.File;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.fintech.features.recordaudio.domain.AudioRecordWorker", f = "AudioRecordWorker.kt", l = {72}, m = "uploadFile")
/* loaded from: classes3.dex */
final class b extends c {

    /* renamed from: d, reason: collision with root package name */
    File f96141d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC6618a f96142e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f96143f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AudioRecordWorker f96144g;

    /* renamed from: h, reason: collision with root package name */
    int f96145h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(AudioRecordWorker audioRecordWorker, c cVar) {
        super(cVar);
        this.f96144g = audioRecordWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object g10;
        this.f96143f = obj;
        this.f96145h |= LinearLayoutManager.INVALID_OFFSET;
        g10 = this.f96144g.g(null, this);
        return g10;
    }
}
