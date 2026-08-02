package expo.modules.filesystem.fsops;

import expo.modules.filesystem.unifiedfile.UnifiedFileInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utilities.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class UtilitiesKt$copyDirectoryParallel$2 extends FunctionReferenceImpl implements Function2<UnifiedFileInterface, UnifiedFileInterface, Unit> {
    public static final UtilitiesKt$copyDirectoryParallel$2 INSTANCE = new UtilitiesKt$copyDirectoryParallel$2();

    UtilitiesKt$copyDirectoryParallel$2() {
        super(2, UtilitiesKt.class, "copyFileWithChannelFallback", "copyFileWithChannelFallback(Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UnifiedFileInterface unifiedFileInterface, UnifiedFileInterface unifiedFileInterface2) {
        invoke2(unifiedFileInterface, unifiedFileInterface2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UnifiedFileInterface p0, UnifiedFileInterface p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        UtilitiesKt.copyFileWithChannelFallback(p0, p1);
    }
}
