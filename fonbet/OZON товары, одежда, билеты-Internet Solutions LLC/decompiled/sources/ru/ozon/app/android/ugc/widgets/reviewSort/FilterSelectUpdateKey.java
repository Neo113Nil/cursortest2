package ru.ozon.app.android.ugc.widgets.reviewSort;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewSort/FilterSelectUpdateKey;", "LA00/a$J$a;", "", "index", "", "actionId", "<init>", "(ILjava/lang/String;)V", "I", "getIndex", "()I", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FilterSelectUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final String actionId;
    private final int index;

    public FilterSelectUpdateKey(int i11, @NotNull String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.index = i11;
        this.actionId = actionId;
    }

    @NotNull
    public final String getActionId() {
        return this.actionId;
    }

    public final int getIndex() {
        return this.index;
    }
}
