package com.vk.feed.core.models.attachment;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.EntryTitle;
import com.vk.feed.core.models.OverlayImage;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vk.feed.core.models.actions.HeaderAction;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AttachmentStyle.kt */
/* loaded from: classes18.dex */
public class CompactAttachmentStyle extends AttachmentStyle {
    public static final Serializer.c<CompactAttachmentStyle> CREATOR = new a();
    public final HeaderAction b;
    public final ActionOpenModal.ModalButton c;
    public final List<Image> d;
    public final EntryPhotoStyle e;
    public final String f;
    public final EntryTitle g;
    public final Description h;
    public final OverlayImage i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CompactAttachmentStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CompactAttachmentStyle a(Serializer serializer) {
            HeaderAction headerAction = (HeaderAction) serializer.G(HeaderAction.class.getClassLoader());
            ActionOpenModal.ModalButton modalButton = (ActionOpenModal.ModalButton) serializer.G(ActionOpenModal.ModalButton.class.getClassLoader());
            ArrayList k = serializer.k(Image.class);
            if (k == null) {
                k = new ArrayList();
            }
            EntryPhotoStyle entryPhotoStyle = (EntryPhotoStyle) serializer.C();
            if (entryPhotoStyle == null) {
                entryPhotoStyle = EntryPhotoStyle.Square;
            }
            return new CompactAttachmentStyle(headerAction, modalButton, k, entryPhotoStyle, serializer.H(), (EntryTitle) serializer.G(EntryTitle.class.getClassLoader()), (Description) serializer.G(Description.class.getClassLoader()), (OverlayImage) serializer.G(OverlayImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CompactAttachmentStyle[i];
        }
    }

    public CompactAttachmentStyle(HeaderAction headerAction, ActionOpenModal.ModalButton modalButton, List<Image> list, EntryPhotoStyle entryPhotoStyle, String str, EntryTitle entryTitle, Description description, OverlayImage overlayImage) {
        super(null);
        this.b = headerAction;
        this.c = modalButton;
        this.d = list;
        this.e = entryPhotoStyle;
        this.f = str;
        this.g = entryTitle;
        this.h = description;
        this.i = overlayImage;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.W(this.d);
        serializer.g0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.i0(this.h);
        serializer.i0(this.i);
    }
}
