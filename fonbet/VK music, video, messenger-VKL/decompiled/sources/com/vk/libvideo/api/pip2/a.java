package com.vk.libvideo.api.pip2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.libvideo.api.pip2.VideoContainerFragmentEntry;
import xsna.gjs0;

/* compiled from: VideoContainerFragmentEntryFactory.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: VideoContainerFragmentEntryFactory.kt */
    /* renamed from: com.vk.libvideo.api.pip2.a$a, reason: collision with other inner class name */
    public static final class C1198a implements a {
        public static final C1198a a = new C1198a();

        @Override // com.vk.libvideo.api.pip2.a
        public final VideoContainerFragmentEntry a(Fragment fragment, Bundle bundle, gjs0 gjs0Var) {
            return null;
        }

        @Override // com.vk.libvideo.api.pip2.a
        public final VideoContainerFragmentEntry b(VideoContainerFragmentEntry.Type type, Bundle bundle, gjs0 gjs0Var) {
            return null;
        }
    }

    VideoContainerFragmentEntry a(Fragment fragment, Bundle bundle, gjs0 gjs0Var);

    VideoContainerFragmentEntry b(VideoContainerFragmentEntry.Type type, Bundle bundle, gjs0 gjs0Var);
}
