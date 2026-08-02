package com.vk.dto.music.audiobook;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBookChapter;
import java.util.List;
import xsna.bpn0;
import xsna.cqm0;
import xsna.drm0;
import xsna.j5g;

/* compiled from: AudioBookChapter.kt */
/* loaded from: classes18.dex */
public final class a {
    public static final int a(String str) {
        List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
        return Integer.parseInt(((String) c0.get(0)) + ImageSizeKey.SIZE_KEY_UNDEFINED + ((String) c0.get(1)));
    }

    public static final String b(AudioBookChapter audioBookChapter) {
        Serializer.c<AudioBookChapter> cVar = AudioBookChapter.CREATOR;
        return AudioBookChapter.a.a(audioBookChapter.b);
    }

    public static final int c(AudioBookChapter audioBookChapter) {
        String str = (String) j5g.b0(1, drm0.c0(audioBookChapter.b, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
        if (str != null) {
            bpn0 bpn0Var = cqm0.a;
            try {
                return Integer.parseInt(str);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static final MusicTrack d(AudioBook audioBook, AudioBookChapter audioBookChapter) {
        UserId userId = UserId.d;
        Image image = audioBook.j;
        AlbumLink albumLink = new AlbumLink(0, userId, null, null, image != null ? new Thumb(image) : null, null, 32, null);
        int a = a(audioBookChapter.b);
        int i = 0;
        String str = audioBookChapter.c;
        boolean z = audioBook.f;
        AudioBookFile audioBookFile = audioBookChapter.d;
        if (audioBookFile != null) {
            i = audioBookFile.c;
        }
        String str2 = audioBookFile != null ? audioBookFile.b : null;
        String Db = audioBook.Db();
        String str3 = audioBookChapter.g;
        Integer num = audioBookChapter.h;
        MusicTrack musicTrack = new MusicTrack(a, userId, str, null, i, 0, Db, str2, null, 0, false, false, 0, null, false, albumLink, null, z, null, null, null, null, null, str3, 0L, 0, false, 0L, null, false, false, false, null, null, audioBookChapter.j, null, false, false, num != null ? num.intValue() : 0, audioBookChapter, false, 0, false, null, null, false, audioBookChapter.i, audioBookChapter.k, false, null, null, null, -8552664, 999227, null);
        musicTrack.d0 = Integer.valueOf(audioBook.b);
        return musicTrack;
    }
}
