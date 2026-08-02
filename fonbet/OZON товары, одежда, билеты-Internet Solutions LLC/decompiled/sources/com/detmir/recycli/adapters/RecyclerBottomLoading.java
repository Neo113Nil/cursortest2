package com.detmir.recycli.adapters;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/detmir/recycli/adapters/RecyclerBottomLoading;", "", "provideButton", "Lcom/detmir/recycli/adapters/RecyclerItem;", "next", "Lkotlin/Function0;", "", "provideDummy", "provideError", DeleteAccountApiResponse.Error.TYPE_RELOAD, "provideProgress", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface RecyclerBottomLoading {
    @NotNull
    RecyclerItem provideButton(@NotNull Function0<Unit> next);

    @NotNull
    RecyclerItem provideDummy();

    @NotNull
    RecyclerItem provideError(@NotNull Function0<Unit> reload);

    @NotNull
    RecyclerItem provideProgress();
}
