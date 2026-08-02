package ru.ozon.android.messenger.framework.presentation.common.startup;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.common.startup.StartupDelegateImpl", f = "StartupDelegate.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 49}, m = "startupChat$suspendImpl")
/* loaded from: classes10.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    String f91152d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f91153e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f91154f;

    /* renamed from: g, reason: collision with root package name */
    int f91155g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f91154f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f91153e = obj;
        this.f91155g |= LinearLayoutManager.INVALID_OFFSET;
        return f.l(this.f91154f, null, this);
    }
}
