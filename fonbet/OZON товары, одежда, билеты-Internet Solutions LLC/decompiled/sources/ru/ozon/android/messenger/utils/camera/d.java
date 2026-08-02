package ru.ozon.android.messenger.utils.camera;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<File, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final d f91837b = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(File file) {
        File file2 = file;
        Intrinsics.checkNotNullParameter(file2, "file");
        file2.delete();
        return Unit.f71690a;
    }
}
