package com.vk.story.viewer.impl.presentation.stories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import xsna.v1h0;
import xsna.z1h0;

/* compiled from: StoryViewDialog.java */
/* loaded from: classes6.dex */
public final class e implements z1h0 {
    public final /* synthetic */ AppCompatActivity b;

    public e(AppCompatActivity appCompatActivity) {
        this.b = appCompatActivity;
    }

    @Override // xsna.f5z
    @NonNull
    public final Lifecycle getLifecycle() {
        return this.b.getLifecycle();
    }

    @Override // xsna.z1h0
    @NonNull
    public final v1h0 getSavedStateRegistry() {
        return this.b.getSavedStateRegistry();
    }
}
