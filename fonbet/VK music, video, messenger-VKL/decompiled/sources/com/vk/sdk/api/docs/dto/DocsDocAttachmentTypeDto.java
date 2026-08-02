package com.vk.sdk.api.docs.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocsDocAttachmentTypeDto.kt */
/* loaded from: classes5.dex */
public final class DocsDocAttachmentTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DocsDocAttachmentTypeDto[] $VALUES;

    @pmi0("audio_message")
    public static final DocsDocAttachmentTypeDto AUDIO_MESSAGE;

    @pmi0("doc")
    public static final DocsDocAttachmentTypeDto DOC;

    @pmi0("graffiti")
    public static final DocsDocAttachmentTypeDto GRAFFITI;
    private final String value;

    static {
        DocsDocAttachmentTypeDto docsDocAttachmentTypeDto = new DocsDocAttachmentTypeDto("DOC", 0, "doc");
        DOC = docsDocAttachmentTypeDto;
        DocsDocAttachmentTypeDto docsDocAttachmentTypeDto2 = new DocsDocAttachmentTypeDto("GRAFFITI", 1, "graffiti");
        GRAFFITI = docsDocAttachmentTypeDto2;
        DocsDocAttachmentTypeDto docsDocAttachmentTypeDto3 = new DocsDocAttachmentTypeDto("AUDIO_MESSAGE", 2, "audio_message");
        AUDIO_MESSAGE = docsDocAttachmentTypeDto3;
        DocsDocAttachmentTypeDto[] docsDocAttachmentTypeDtoArr = {docsDocAttachmentTypeDto, docsDocAttachmentTypeDto2, docsDocAttachmentTypeDto3};
        $VALUES = docsDocAttachmentTypeDtoArr;
        $ENTRIES = new asp(docsDocAttachmentTypeDtoArr);
    }

    private DocsDocAttachmentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DocsDocAttachmentTypeDto valueOf(String str) {
        return (DocsDocAttachmentTypeDto) Enum.valueOf(DocsDocAttachmentTypeDto.class, str);
    }

    public static DocsDocAttachmentTypeDto[] values() {
        return (DocsDocAttachmentTypeDto[]) $VALUES.clone();
    }
}
