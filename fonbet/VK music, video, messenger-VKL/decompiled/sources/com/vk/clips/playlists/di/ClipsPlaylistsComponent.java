package com.vk.clips.playlists.di;

import com.vk.clips.playlists.di.stub.ClipsPlaylistsComponentStub;
import com.vk.di.component.DiUnscopedComponent;
import xsna.awe;
import xsna.due;
import xsna.fqe;

/* compiled from: ClipsPlaylistsComponent.kt */
/* loaded from: classes16.dex */
public interface ClipsPlaylistsComponent extends DiUnscopedComponent {
    public static final a Companion = a.a;

    /* compiled from: ClipsPlaylistsComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ClipsPlaylistsComponentStub STUB = new ClipsPlaylistsComponentStub();

        public final ClipsPlaylistsComponentStub getSTUB() {
            return STUB;
        }
    }

    fqe N9();

    awe S0();

    due b();

    com.vk.clips.playlists.a e();
}
