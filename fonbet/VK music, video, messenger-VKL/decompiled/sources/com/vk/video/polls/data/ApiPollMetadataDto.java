package com.vk.video.polls.data;

import java.util.List;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ApiPollMetadataDto.kt */
/* loaded from: classes6.dex */
public final class ApiPollMetadataDto {

    @pmi0("allow_skip_open_question")
    private final boolean allowSkipOpenQuestion;

    @pmi0("completion_message")
    private final String completionMessage;

    @pmi0("questions")
    private final List<b> questions;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiPollMetadataDto(List<? extends b> list, String str, boolean z) {
        this.questions = list;
        this.completionMessage = str;
        this.allowSkipOpenQuestion = z;
    }

    public final boolean a() {
        return this.allowSkipOpenQuestion;
    }

    public final String b() {
        return this.completionMessage;
    }

    public final List<b> c() {
        return this.questions;
    }

    public /* synthetic */ ApiPollMetadataDto(List list, String str, boolean z, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z);
    }
}
