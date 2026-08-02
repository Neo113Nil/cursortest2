package ru.ozon.composer.compose.widget;

import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00042\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006*\u0016\u0010\u0007\"\b\u0012\u0004\u0012\u00020\u00010\u00032\b\u0012\u0004\u0012\u00020\u00010\u0003¨\u0006\b"}, d2 = {"", "", HammersV3BodyDTO.PLACEHOLDER, "", "Lru/ozon/composer/compose/widget/WidgetPlaceholder;", "a", "([Ljava/lang/String;)Ljava/util/Set;", "WidgetPlaceholder", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {
    @NotNull
    public static final Set<String> a(@NotNull String... placeholder) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        return e0.a(Arrays.copyOf(placeholder, placeholder.length));
    }
}
