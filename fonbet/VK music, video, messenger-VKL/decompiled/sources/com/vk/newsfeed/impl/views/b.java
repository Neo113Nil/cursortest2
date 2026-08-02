package com.vk.newsfeed.impl.views;

import android.content.Context;
import android.view.View;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.ozl;
import xsna.pdv0;
import xsna.s980;
import xsna.u1c0;
import xsna.vtk0;

/* compiled from: TaggedPhotosBottomSheet.kt */
/* loaded from: classes4.dex */
public final class b implements s980 {
    public final /* synthetic */ Context b;

    public b(Context context) {
        this.b = context;
    }

    @Override // xsna.s980
    @ozl
    public final boolean E8(Attachment attachment, NewsEntry newsEntry) {
        return true;
    }

    @Override // xsna.s980
    public final void r8(NewsEntry newsEntry) {
        Photo photo;
        Photos photos = newsEntry instanceof Photos ? (Photos) newsEntry : null;
        Serializer.StreamParcelableAdapter R1 = photos != null ? photos.R1() : null;
        PhotoAttachment photoAttachment = R1 instanceof PhotoAttachment ? (PhotoAttachment) R1 : null;
        if (photoAttachment == null || (photo = photoAttachment.l) == null) {
            return;
        }
        pdv0.a b = vtk0.c().b(photo);
        b.E();
        b.k(this.b);
    }

    @Override // xsna.s980
    @ozl
    public final boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        return false;
    }

    @Override // xsna.hi60
    public final void sa(NewsfeedExternalAction newsfeedExternalAction) {
    }

    @Override // xsna.s980
    public final void U5(NewsEntry newsEntry, boolean z, int i) {
    }

    @Override // xsna.s980
    @ozl
    public final void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
    }

    @Override // xsna.s980
    @ozl
    public final void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
    }

    @Override // xsna.s980
    @ozl
    public final void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
    }
}
