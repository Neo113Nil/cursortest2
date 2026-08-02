package ru.ozon.app.android.composer.domain.cache;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ComposerResponseStorageImpl$findResponseMockDirectory$1 extends AbstractC7737t implements Function1<File, Boolean> {
    final /* synthetic */ String $requestName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerResponseStorageImpl$findResponseMockDirectory$1(String str) {
        super(1);
        this.$requestName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(it.getName(), this.$requestName));
    }
}
