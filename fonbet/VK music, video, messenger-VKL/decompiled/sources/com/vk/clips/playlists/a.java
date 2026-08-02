package com.vk.clips.playlists;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.wte;

/* compiled from: ClipsPlaylistsLauncher.kt */
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ClipsPlaylistsLauncher.kt */
    /* renamed from: com.vk.clips.playlists.a$a, reason: collision with other inner class name */
    public interface InterfaceC0623a {
        void a(ClipsPlaylistPickerParams.AddClips addClips);
    }

    void a(Context context, ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams, FragmentManager fragmentManager, wte wteVar);

    void b(Context context, ClipsPlaylistContentLaunchParams clipsPlaylistContentLaunchParams, FragmentManager fragmentManager, gzs<s3q0> gzsVar);

    InterfaceC0623a c(Context context, izs<? super ClipsPlaylist, s3q0> izsVar);

    void d(Context context, ClipsPlaylistPickerParams clipsPlaylistPickerParams);

    void e(ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams, FragmentManager fragmentManager);
}
