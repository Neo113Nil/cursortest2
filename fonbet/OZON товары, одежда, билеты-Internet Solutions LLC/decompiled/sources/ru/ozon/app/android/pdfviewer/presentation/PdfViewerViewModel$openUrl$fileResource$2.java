package ru.ozon.app.android.pdfviewer.presentation;

import B0.A0;
import bd.h;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "file", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/io/File;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PdfViewerViewModel$openUrl$fileResource$2 extends AbstractC7737t implements Function1<File, Unit> {
    public static final PdfViewerViewModel$openUrl$fileResource$2 INSTANCE = new PdfViewerViewModel$openUrl$fileResource$2();

    PdfViewerViewModel$openUrl$fileResource$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(File file) {
        invoke2(file);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(File file) {
        Intrinsics.f(file);
        if (!Intrinsics.d(h.i(file), "pdf")) {
            throw new IllegalArgumentException(A0.b("Can't open file \"", h.i(file), "\"").toString());
        }
    }
}
