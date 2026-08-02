package com.vk.clips.favorites.api.di;

import com.vk.clips.favorites.api.stub.ClipsFavoritesComponentStub;
import com.vk.di.component.DiUnscopedComponent;
import xsna.c5e;
import xsna.j5e;
import xsna.m5e;

/* compiled from: ClipsFavoritesComponent.kt */
/* loaded from: classes16.dex */
public interface ClipsFavoritesComponent extends DiUnscopedComponent {
    public static final a Companion = a.a;

    /* compiled from: ClipsFavoritesComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ClipsFavoritesComponentStub STUB = new ClipsFavoritesComponentStub();

        public final ClipsFavoritesComponentStub getSTUB() {
            return STUB;
        }
    }

    c5e b();

    m5e b8();

    j5e e();
}
