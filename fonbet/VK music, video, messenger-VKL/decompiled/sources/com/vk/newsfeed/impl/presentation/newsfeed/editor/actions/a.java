package com.vk.newsfeed.impl.presentation.newsfeed.editor.actions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.di60;
import xsna.epx;
import xsna.izs;
import xsna.ol60;
import xsna.pn60;
import xsna.qn60;

/* compiled from: UpdatePhotoEditorAction.kt */
/* loaded from: classes4.dex */
public final class a implements qn60.b {
    public final Photo a;
    public final pn60 b;

    /* compiled from: UpdatePhotoEditorAction.kt */
    /* renamed from: com.vk.newsfeed.impl.presentation.newsfeed.editor.actions.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1400a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public a(Photo photo, pn60 pn60Var) {
        this.a = photo;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Object obj;
        Photo photo;
        LinkedHashSet c = aVar.a.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : c) {
            if (obj2 instanceof NewsEntry) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NewsEntry newsEntry = (NewsEntry) it.next();
            boolean z = newsEntry instanceof Photos;
            Photo photo2 = this.a;
            if (z) {
                Photos photos = (Photos) newsEntry;
                Attachment R1 = photos.R1();
                if (R1 instanceof PhotoAttachment) {
                    Photo photo3 = ((PhotoAttachment) R1).l;
                    if (epx.f(photo2.e, photo3.e) && photo2.c == photo3.c) {
                        photos.Nb(photo2);
                        Post R = di60.R(photos);
                        if (R != null) {
                            R.wc(photo2);
                        }
                    }
                }
            } else {
                Post R2 = di60.R(newsEntry);
                if (R2 != null) {
                    Iterator<T> it2 = R2.z.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((EntryAttachment) obj).b instanceof PhotoAttachment) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    EntryAttachment entryAttachment = (EntryAttachment) obj;
                    Serializer.StreamParcelableAdapter streamParcelableAdapter = entryAttachment != null ? entryAttachment.b : null;
                    PhotoAttachment photoAttachment = streamParcelableAdapter instanceof PhotoAttachment ? (PhotoAttachment) streamParcelableAdapter : null;
                    if (photoAttachment != null && (photo = photoAttachment.l) != null && photo.c == photo2.c && photo2.C == R2.n) {
                        R2.wc(photo2);
                    }
                }
            }
        }
        aVar.l(arrayList, new C1400a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
