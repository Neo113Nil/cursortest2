package com.vk.newsfeed.posting.impl.domain.model;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.agc0;
import xsna.epx;
import xsna.his0;
import xsna.w65;

/* compiled from: PhotoCropExt.kt */
/* loaded from: classes4.dex */
public final class c {
    public static final ImageCropArea a(String str, Uri uri, PostingPreviewRatio postingPreviewRatio, int i, int i2) {
        int i3 = postingPreviewRatio.b;
        int i4 = postingPreviewRatio.c;
        if (i4 <= 0 || i3 <= 0 || i2 <= 0 || i <= 0) {
            return new ImageCropArea(str, uri, 0, 0, i, i2, null, null, PsExtractor.AUDIO_STREAM, null);
        }
        float d = w65.d(postingPreviewRatio);
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        if (f3 < d) {
            return new ImageCropArea(str, uri, 0, (int) Math.floor((f2 - r0) / 2.0f), i, Math.round(i4 * (f / i3)), null, null, PsExtractor.AUDIO_STREAM, null);
        }
        if (f3 <= d) {
            return new ImageCropArea(str, uri, 0, 0, i, i2, null, null, PsExtractor.AUDIO_STREAM, null);
        }
        return new ImageCropArea(str, uri, (int) Math.floor((f - r0) / 2.0f), 0, Math.round(i3 * (f2 / i4)), i2, null, null, PsExtractor.AUDIO_STREAM, null);
    }

    public static final ImageCropArea b(PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, Attachment attachment) {
        List<ImageCropArea> list = photoVideoAttachmentsCropData.b;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ImageCropArea imageCropArea = (ImageCropArea) next;
            if ((attachment instanceof PhotoAttachment) && agc0.d(imageCropArea, (PhotoAttachment) attachment) && w65.m(imageCropArea, photoVideoAttachmentsCropData.e)) {
                obj = next;
                break;
            }
        }
        return (ImageCropArea) obj;
    }

    public static final ImageCropArea c(PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, MediaPickerEntry mediaPickerEntry) {
        PostingPreviewRatio postingPreviewRatio = photoVideoAttachmentsCropData.e;
        List<ImageCropArea> list = photoVideoAttachmentsCropData.b;
        Object obj = null;
        if (mediaPickerEntry instanceof LocalMediaEntry.Image) {
            if (list == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ImageCropArea imageCropArea = (ImageCropArea) next;
                if (epx.f(imageCropArea.c, ((LocalMediaEntry.Image) mediaPickerEntry).b.k) && w65.m(imageCropArea, postingPreviewRatio)) {
                    obj = next;
                    break;
                }
            }
            return (ImageCropArea) obj;
        }
        if (!(mediaPickerEntry instanceof VkMediaEntry$VkPhoto) || list == null) {
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            ImageCropArea imageCropArea2 = (ImageCropArea) next2;
            if (agc0.b(imageCropArea2, ((VkMediaEntry$VkPhoto) mediaPickerEntry).b) && w65.m(imageCropArea2, postingPreviewRatio)) {
                obj = next2;
                break;
            }
        }
        return (ImageCropArea) obj;
    }

    public static final List<ImageCropArea> d(PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, PostingPreviewRatio postingPreviewRatio) {
        List<ImageCropArea> list = photoVideoAttachmentsCropData.b;
        if (list == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (w65.m((ImageCropArea) obj, postingPreviewRatio)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Pair<Integer, Integer> e(PhotoAttachment photoAttachment) {
        if (photoAttachment instanceof LocalPhotoAttachment) {
            LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) photoAttachment;
            return new Pair<>(Integer.valueOf(localPhotoAttachment.z), Integer.valueOf(localPhotoAttachment.A));
        }
        ImageSize k = his0.k(photoAttachment);
        if (k == null) {
            return null;
        }
        Image image = k.d;
        return new Pair<>(Integer.valueOf(image.b), Integer.valueOf(image.c));
    }
}
