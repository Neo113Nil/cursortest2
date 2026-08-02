package ru.ozon.app.android.csma.preload;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/csma/preload/PreloadEntry;", "invoke", "(Lru/ozon/app/android/csma/preload/PreloadEntry;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PreferencesPreloadCache$add$1 extends AbstractC7737t implements Function1<PreloadEntry, Boolean> {
    final /* synthetic */ String $newFileName;
    final /* synthetic */ PreferencesPreloadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesPreloadCache$add$1(PreferencesPreloadCache preferencesPreloadCache, String str) {
        super(1);
        this.this$0 = preferencesPreloadCache;
        this.$newFileName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PreloadEntry it) {
        String extractFileName;
        Intrinsics.checkNotNullParameter(it, "it");
        extractFileName = this.this$0.extractFileName(it.getImageUrl());
        return Boolean.valueOf(extractFileName != null && extractFileName.equals(this.$newFileName));
    }
}
