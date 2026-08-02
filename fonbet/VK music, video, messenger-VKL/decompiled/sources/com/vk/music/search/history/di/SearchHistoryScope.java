package com.vk.music.search.history.di;

import com.vk.di.scope.SharedScope;
import com.vk.dto.common.id.UserId;
import xsna.kvh0;
import xsna.pwj0;
import xsna.uaj0;
import xsna.uuh0;
import xsna.x7m;

/* compiled from: SearchHistoryRepoComponent.kt */
/* loaded from: classes3.dex */
public final class SearchHistoryScope extends x7m<kvh0, uaj0> {
    public final kvh0 a;
    public final SharedScope b = SharedScope.a;

    public SearchHistoryScope(UserId userId, uuh0 uuh0Var) {
        this.a = new kvh0(userId, uuh0Var);
    }

    @Override // xsna.x7m
    public final pwj0 a() {
        return this.a;
    }

    @Override // xsna.x7m
    public final x7m<uaj0, ?> b() {
        return this.b;
    }
}
