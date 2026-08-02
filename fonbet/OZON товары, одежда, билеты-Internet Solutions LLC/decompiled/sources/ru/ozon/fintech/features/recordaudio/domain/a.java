package ru.ozon.fintech.features.recordaudio.domain;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.fintech.features.recordaudio.domain.AudioRecordWorker", f = "AudioRecordWorker.kt", l = {48}, m = "doWork")
/* loaded from: classes3.dex */
final class a extends c {

    /* renamed from: d, reason: collision with root package name */
    File f96137d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f96138e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AudioRecordWorker f96139f;

    /* renamed from: g, reason: collision with root package name */
    int f96140g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(AudioRecordWorker audioRecordWorker, c cVar) {
        super(cVar);
        this.f96139f = audioRecordWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f96138e = obj;
        this.f96140g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f96139f.b(this);
    }
}
