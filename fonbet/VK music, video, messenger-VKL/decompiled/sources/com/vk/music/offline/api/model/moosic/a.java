package com.vk.music.offline.api.model.moosic;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.dto.music.moosic.MoosicAudio;
import xsna.bh10;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.vq;
import xsna.vu5;

/* compiled from: VkMusicOldAudioBookChapterEntity.kt */
/* loaded from: classes3.dex */
public final class a {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final EncryptedFileInfo e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;

    /* compiled from: VkMusicOldAudioBookChapterEntity.kt */
    /* renamed from: com.vk.music.offline.api.model.moosic.a$a, reason: collision with other inner class name */
    public static final class C1328a {
        public static AudioBookChapter a(a aVar, int i) {
            MoosicAudio moosicAudio;
            String str = aVar.b;
            EncryptedFileInfo encryptedFileInfo = aVar.e;
            String str2 = aVar.h;
            AudioBookFile audioBookFile = new AudioBookFile(aVar.d, (int) (aVar.j / 1000));
            int i2 = aVar.m;
            int i3 = aVar.n;
            AudioBooksChapterProgressStatus audioBooksChapterProgressStatus = i3 != 0 ? i3 != 1 ? i3 != 2 ? AudioBooksChapterProgressStatus.UNREAD : AudioBooksChapterProgressStatus.DONE : AudioBooksChapterProgressStatus.IN_PROGRESS : AudioBooksChapterProgressStatus.UNREAD;
            String str3 = encryptedFileInfo.b;
            DownloadingState downloadingState = str3 != null ? DownloadingState.Downloaded.b : DownloadingState.NotLoaded.b;
            if (str3 != null) {
                String str4 = aVar.b;
                long j = aVar.f;
                StringBuilder a = vq.a("photos_cache/", i, '/');
                a.append(aVar.g);
                moosicAudio = new MoosicAudio(i, str4, encryptedFileInfo, j, a.toString());
            } else {
                moosicAudio = null;
            }
            return new AudioBookChapter(str, str2, audioBookFile, i2, audioBooksChapterProgressStatus, "", null, 0, downloadingState, moosicAudio);
        }
    }

    public a(int i, String str, String str2, String str3, EncryptedFileInfo encryptedFileInfo, long j, String str4, String str5, String str6, long j2, long j3, int i2, int i3, int i4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = encryptedFileInfo;
        this.f = j;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = j2;
        this.k = j3;
        this.l = i2;
        this.m = i3;
        this.n = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n;
    }

    public final int hashCode() {
        int a = bh10.a((this.e.hashCode() + urd0.a(urd0.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
        String str = this.g;
        return Integer.hashCode(this.n) + shy.a(this.m, shy.a(this.l, bh10.a(bh10.a(urd0.a(urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMusicOldAudioBookChapterEntity(id=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", audioBookServerId=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", fileInfo=");
        sb.append(this.e);
        sb.append(", size=");
        sb.append(this.f);
        sb.append(", coverId=");
        sb.append(this.g);
        sb.append(", name=");
        sb.append(this.h);
        sb.append(", artistName=");
        sb.append(this.i);
        sb.append(", duration=");
        sb.append(this.j);
        sb.append(", addedAt=");
        sb.append(this.k);
        sb.append(", flags=");
        sb.append(this.l);
        sb.append(", listenProgress=");
        sb.append(this.m);
        sb.append(", listenState=");
        return vu5.b(sb, this.n, ')');
    }
}
