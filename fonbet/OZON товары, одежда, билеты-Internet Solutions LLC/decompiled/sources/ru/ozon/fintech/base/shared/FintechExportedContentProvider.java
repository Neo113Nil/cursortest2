package ru.ozon.fintech.base.shared;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.base.content.BaseSharedPrefsContentProvider;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/fintech/base/shared/FintechExportedContentProvider;", "Lru/ozon/fintech/base/content/BaseSharedPrefsContentProvider;", "<init>", "()V", "", "getAuthoritySuffix", "()Ljava/lang/String;", "Companion", "a", "fintech-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechExportedContentProvider extends BaseSharedPrefsContentProvider {

    @NotNull
    public static final String AUTHORITY_SUFFIX = "ru.ozon.fintech.base.shared";

    @Override // ru.ozon.fintech.base.content.BaseSharedPrefsContentProvider
    @NotNull
    public String getAuthoritySuffix() {
        return AUTHORITY_SUFFIX;
    }
}
