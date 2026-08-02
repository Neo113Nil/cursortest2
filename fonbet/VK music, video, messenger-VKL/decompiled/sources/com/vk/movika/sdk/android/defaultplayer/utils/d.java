package com.vk.movika.sdk.android.defaultplayer.utils;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PostAttachment;
import java.util.ArrayList;
import java.util.Collections;
import xsna.g2v;
import xsna.wzs;

/* loaded from: classes3.dex */
public final class d {
    public static void a(Context context, UserId userId, Attachment attachment) {
        g2v.c().b().B(context, com.vk.dto.common.a.a(userId), "", attachment != null ? Collections.singletonList(attachment) : null, "post_write_author", null, true);
    }

    public static void b(Context context, NewsEntry newsEntry, boolean z) {
        Owner owner;
        Owner owner2;
        if (newsEntry instanceof Post) {
            c(context, (Post) newsEntry, Boolean.valueOf(z));
            return;
        }
        if (newsEntry instanceof Photos) {
            Photos photos = (Photos) newsEntry;
            if (photos.q.size() == 1 && (owner2 = photos.o) != null && owner2.o) {
                UserId userId = owner2.b;
                Attachment R1 = photos.R1();
                if (R1 == null) {
                    return;
                }
                a(context, userId, R1);
                return;
            }
            return;
        }
        if (!(newsEntry instanceof Videos)) {
            if (newsEntry instanceof PromoPost) {
                c(context, ((PromoPost) newsEntry).n, Boolean.FALSE);
                return;
            }
            return;
        }
        Videos videos = (Videos) newsEntry;
        ArrayList<EntryAttachment> arrayList = videos.o;
        if (arrayList == null || arrayList.size() != 1 || (owner = videos.m) == null || !owner.o) {
            return;
        }
        UserId userId2 = owner.b;
        Attachment R12 = videos.R1();
        if (R12 == null) {
            return;
        }
        a(context, userId2, R12);
    }

    public static void c(Context context, Post post, Boolean bool) {
        UserId userId;
        Owner owner = post.q;
        Owner owner2 = post.o;
        if (owner == null || !owner.o) {
            userId = owner2.o ? owner2.b : null;
            if (userId == null) {
                return;
            }
        } else {
            userId = owner.b;
        }
        a(context, userId, bool.equals(Boolean.TRUE) ? null : new PostAttachment(post));
    }

    public static c d(View view, Object obj, wzs wzsVar, int i) {
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            wzsVar = null;
        }
        return new c(view, obj, z, wzsVar);
    }
}
