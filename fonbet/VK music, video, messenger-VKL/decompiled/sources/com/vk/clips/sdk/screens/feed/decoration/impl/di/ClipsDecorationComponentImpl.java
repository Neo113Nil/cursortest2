package com.vk.clips.sdk.screens.feed.decoration.impl.di;

import com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.movika.sdk.base.logic.interactor.f;
import xsna.b7m;
import xsna.c48;
import xsna.e7m;
import xsna.kpe;
import xsna.l7p0;
import xsna.x8l;
import xsna.zod;

/* compiled from: ClipsDecorationComponentImpl.kt */
/* loaded from: classes17.dex */
public final class ClipsDecorationComponentImpl implements ClipsDecorationComponent {
    public final f a;

    /* compiled from: ClipsDecorationComponentImpl.kt */
    public static final class a implements b7m<ClipsDecorationComponent> {
        public final f a;

        public a(f fVar) {
            this.a = fVar;
        }

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsDecorationComponentImpl(this.a);
        }
    }

    public ClipsDecorationComponentImpl(f fVar) {
        this.a = fVar;
    }

    @Override // com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent
    public final c48 A8(ClipsDecorationKey clipsDecorationKey) {
        return Df(clipsDecorationKey).d();
    }

    public final zod Df(ClipsDecorationKey clipsDecorationKey) {
        zod zodVar = (zod) this.a.invoke(clipsDecorationKey);
        return zodVar == null ? zod.a.getSTUB() : zodVar;
    }

    @Override // com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent
    public final l7p0 N3(ClipsDecorationKey clipsDecorationKey) {
        return Df(clipsDecorationKey).a();
    }

    @Override // com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent
    public final kpe j8(ClipsDecorationKey clipsDecorationKey) {
        return Df(clipsDecorationKey).c();
    }

    @Override // com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent
    public final x8l sb(ClipsDecorationKey clipsDecorationKey) {
        return Df(clipsDecorationKey).b();
    }
}
