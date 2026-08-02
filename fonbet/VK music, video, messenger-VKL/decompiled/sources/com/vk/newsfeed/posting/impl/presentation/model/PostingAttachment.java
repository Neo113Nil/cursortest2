package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.id.UserId;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public interface PostingAttachment extends Parcelable {
    int getId();

    AttachmentType getType();

    Attachment nb();

    UserId q();
}
