package ru.ozon.app.android.composer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/ComposerViewPool;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerViewPoolProviderImpl$lViewPool$1 extends AbstractC7737t implements Function0<ComposerViewPool> {
    public static final ComposerViewPoolProviderImpl$lViewPool$1 INSTANCE = new ComposerViewPoolProviderImpl$lViewPool$1();

    ComposerViewPoolProviderImpl$lViewPool$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ComposerViewPool invoke() {
        return new ComposerViewPool();
    }
}
