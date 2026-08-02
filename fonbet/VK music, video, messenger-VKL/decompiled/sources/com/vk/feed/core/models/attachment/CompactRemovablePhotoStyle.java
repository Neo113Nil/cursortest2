package com.vk.feed.core.models.attachment;

import com.vk.dto.common.Image;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.EntryTitle;
import com.vk.feed.core.models.OverlayImage;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vk.feed.core.models.actions.HeaderAction;
import java.util.List;

/* compiled from: AttachmentStyle.kt */
/* loaded from: classes18.dex */
public final class CompactRemovablePhotoStyle extends CompactAttachmentStyle {
    public CompactRemovablePhotoStyle(HeaderAction headerAction, ActionOpenModal.ModalButton modalButton, List<Image> list, EntryPhotoStyle entryPhotoStyle, String str, EntryTitle entryTitle, Description description, OverlayImage overlayImage) {
        super(headerAction, modalButton, list, entryPhotoStyle, str, entryTitle, description, overlayImage);
    }
}
