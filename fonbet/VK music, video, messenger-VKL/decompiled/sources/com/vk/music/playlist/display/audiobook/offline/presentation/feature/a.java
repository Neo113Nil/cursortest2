package com.vk.music.playlist.display.audiobook.offline.presentation.feature;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.di40;
import xsna.dt70;

/* compiled from: OfflineAudioBookChaptersViewStateMapper.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final dt70 a(OfflineAudioBookChaptersMviState offlineAudioBookChaptersMviState) {
        if (!(offlineAudioBookChaptersMviState instanceof OfflineAudioBookChaptersMviState.Content)) {
            if (offlineAudioBookChaptersMviState instanceof OfflineAudioBookChaptersMviState.Loading) {
                return new dt70.d(((OfflineAudioBookChaptersMviState.Loading) offlineAudioBookChaptersMviState).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        OfflineAudioBookChaptersMviState.Content content = (OfflineAudioBookChaptersMviState.Content) offlineAudioBookChaptersMviState;
        AudioBook audioBook = content.b;
        String str = audioBook.c;
        Image image = audioBook.j;
        Thumb thumb = image != null ? new Thumb(image) : null;
        Iterable iterable = audioBook.k;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (true) {
            if (!it.hasNext()) {
                return new dt70.b(str, thumb, arrayList, new dt70.c(0));
            }
            AudioBookChapter audioBookChapter = (AudioBookChapter) it.next();
            String str2 = audioBookChapter.b;
            String str3 = audioBookChapter.c;
            int i = audioBookChapter.e;
            AudioBooksChapterProgressStatus audioBooksChapterProgressStatus = audioBookChapter.f;
            AudioBookFile audioBookFile = audioBookChapter.d;
            int i2 = audioBookFile != null ? audioBookFile.c : 0;
            DownloadingState downloadingState = content.c.get(str2);
            if (downloadingState == null) {
                downloadingState = audioBookChapter.j;
            }
            arrayList.add(new dt70.a(str2, str3, i, audioBooksChapterProgressStatus, i2, di40.a(downloadingState)));
        }
    }
}
