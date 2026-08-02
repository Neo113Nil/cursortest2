package ru.ozon.android.messenger.utils.camera;

import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<Context, File, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f91850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar) {
        super(2);
        this.f91850b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Context context, File file) {
        Context context2 = context;
        File file2 = file;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(file2, "file");
        Fi.c.e(context2, file2, new j(this.f91850b));
        return Unit.f71690a;
    }
}
