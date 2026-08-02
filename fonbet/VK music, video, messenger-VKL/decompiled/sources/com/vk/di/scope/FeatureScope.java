package com.vk.di.scope;

import com.vk.di.component.DiWithScopeComponent;
import xsna.pwj0;
import xsna.uaj0;
import xsna.x7m;

/* JADX WARN: Incorrect field signature: TKey; */
/* compiled from: FeatureScopes.kt */
/* loaded from: classes18.dex */
public abstract class FeatureScope<Key extends ParentKey, ParentKey extends uaj0, InnerComponent extends DiWithScopeComponent<Key>> extends x7m<Key, ParentKey> {
    public final uaj0 a;

    /* JADX WARN: Incorrect types in method signature: (TKey;)V */
    public FeatureScope(uaj0 uaj0Var) {
        this.a = uaj0Var;
    }

    @Override // xsna.x7m
    public final pwj0 a() {
        return this.a;
    }
}
