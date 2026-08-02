package ru.ozon.app.android.ugc.widgets.usersGradesV2.core;

import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.composer.compose.widget.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/separator/core/SeparatorViewMapper;", "separatorViewMapper", "Ln20/i;", "UsersGradesComposeWidget", "(Lru/ozon/app/android/separator/core/SeparatorViewMapper;)Ln20/i;", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UsersGradesComposeWidgetKt {
    @NotNull
    public static final i UsersGradesComposeWidget(@NotNull SeparatorViewMapper separatorViewMapper) {
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        return C6020f.a("rpProduct", "usersGrades", k.a(2), new UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1(separatorViewMapper));
    }
}
