package com.vk.story.viewer.impl.presentation.stories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import xsna.f5z;

/* compiled from: StoryViewDialog.java */
/* loaded from: classes6.dex */
public final class d implements f5z {
    public final /* synthetic */ AppCompatActivity b;

    public d(AppCompatActivity appCompatActivity) {
        this.b = appCompatActivity;
    }

    @Override // xsna.f5z
    @NonNull
    public final Lifecycle getLifecycle() {
        return this.b.getLifecycle();
    }
}
