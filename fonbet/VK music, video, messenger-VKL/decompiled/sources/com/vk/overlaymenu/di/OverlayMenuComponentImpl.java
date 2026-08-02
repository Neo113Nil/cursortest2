package com.vk.overlaymenu.di;

import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.w290;
import xsna.x290;

/* compiled from: OverlayMenuComponentImpl.kt */
/* loaded from: classes4.dex */
public final class OverlayMenuComponentImpl implements OverlayMenuComponent {

    /* compiled from: OverlayMenuComponentImpl.kt */
    public static final class a implements c8m<OverlayMenuComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new OverlayMenuComponentImpl();
        }
    }

    @Override // com.vk.overlaymenu.di.OverlayMenuComponent
    public final w290 Z5() {
        return x290.a;
    }
}
