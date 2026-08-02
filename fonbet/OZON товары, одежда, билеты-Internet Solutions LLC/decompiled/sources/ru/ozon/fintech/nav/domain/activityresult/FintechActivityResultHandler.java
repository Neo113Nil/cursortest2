package ru.ozon.fintech.nav.domain.activityresult;

import android.content.Intent;
import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/nav/domain/activityresult/FintechActivityResultHandler;", "", "isCanHandleRequest", "", "requestCode", "", "handle", "", "result", "data", "Landroid/content/Intent;", "fintech-nav_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FintechActivityResultHandler {
    void handle(int requestCode, int result, Intent data);

    boolean isCanHandleRequest(int requestCode);
}
