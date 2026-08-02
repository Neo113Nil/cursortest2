package com.vk.di.component.app;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;

/* compiled from: AppContextDiComponent.kt */
/* loaded from: classes.dex */
public final class AppContextDiComponent implements DiScopedComponent<pwj0> {
    public final Context a;

    /* compiled from: AppContextDiComponent.kt */
    public static final class a implements c8m<AppContextDiComponent, pwj0> {
        public final Context a;

        public a(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AppContextDiComponent(this.a);
        }
    }

    public AppContextDiComponent(Context context) {
        this.a = context;
    }
}
