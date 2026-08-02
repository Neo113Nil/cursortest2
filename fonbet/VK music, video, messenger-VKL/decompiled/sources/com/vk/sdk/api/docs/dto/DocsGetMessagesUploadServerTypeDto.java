package com.vk.sdk.api.docs.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocsGetMessagesUploadServerTypeDto.kt */
/* loaded from: classes5.dex */
public final class DocsGetMessagesUploadServerTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DocsGetMessagesUploadServerTypeDto[] $VALUES;

    @pmi0("audio_message")
    public static final DocsGetMessagesUploadServerTypeDto AUDIO_MESSAGE;

    @pmi0("doc")
    public static final DocsGetMessagesUploadServerTypeDto DOC;

    @pmi0("graffiti")
    public static final DocsGetMessagesUploadServerTypeDto GRAFFITI;
    private final String value;

    static {
        DocsGetMessagesUploadServerTypeDto docsGetMessagesUploadServerTypeDto = new DocsGetMessagesUploadServerTypeDto("AUDIO_MESSAGE", 0, "audio_message");
        AUDIO_MESSAGE = docsGetMessagesUploadServerTypeDto;
        DocsGetMessagesUploadServerTypeDto docsGetMessagesUploadServerTypeDto2 = new DocsGetMessagesUploadServerTypeDto("DOC", 1, "doc");
        DOC = docsGetMessagesUploadServerTypeDto2;
        DocsGetMessagesUploadServerTypeDto docsGetMessagesUploadServerTypeDto3 = new DocsGetMessagesUploadServerTypeDto("GRAFFITI", 2, "graffiti");
        GRAFFITI = docsGetMessagesUploadServerTypeDto3;
        DocsGetMessagesUploadServerTypeDto[] docsGetMessagesUploadServerTypeDtoArr = {docsGetMessagesUploadServerTypeDto, docsGetMessagesUploadServerTypeDto2, docsGetMessagesUploadServerTypeDto3};
        $VALUES = docsGetMessagesUploadServerTypeDtoArr;
        $ENTRIES = new asp(docsGetMessagesUploadServerTypeDtoArr);
    }

    private DocsGetMessagesUploadServerTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DocsGetMessagesUploadServerTypeDto valueOf(String str) {
        return (DocsGetMessagesUploadServerTypeDto) Enum.valueOf(DocsGetMessagesUploadServerTypeDto.class, str);
    }

    public static DocsGetMessagesUploadServerTypeDto[] values() {
        return (DocsGetMessagesUploadServerTypeDto[]) $VALUES.clone();
    }
}
