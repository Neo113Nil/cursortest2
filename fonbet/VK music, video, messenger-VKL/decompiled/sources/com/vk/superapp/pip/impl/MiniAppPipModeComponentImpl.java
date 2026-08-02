package com.vk.superapp.pip.impl;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import xsna.b7m;
import xsna.e7m;

/* compiled from: MiniAppPipModeComponentImpl.kt */
/* loaded from: classes6.dex */
public final class MiniAppPipModeComponentImpl implements DiUnscopedComponent {

    /* compiled from: MiniAppPipModeComponentImpl.kt */
    public static final class a implements b7m<Object> {
        public a(Context context) {
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MiniAppPipModeComponentImpl();
        }
    }
}
