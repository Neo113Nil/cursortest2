package com.vk.clips.blacklists.impl.di;

import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.tjd;
import xsna.vjd;

/* compiled from: ClipsBlacklistsComponentImpl.kt */
/* loaded from: classes.dex */
public final class ClipsBlacklistsComponentImpl implements ClipsBlacklistsComponent {

    /* compiled from: ClipsBlacklistsComponentImpl.kt */
    public static final class a implements c8m<ClipsBlacklistsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsBlacklistsComponentImpl();
        }
    }

    @Override // com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent
    public final tjd f4() {
        return vjd.b;
    }
}
