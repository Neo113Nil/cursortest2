package com.vk.media.pipeline.transcoder;

import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DecodedSampleStatus.kt */
/* loaded from: classes3.dex */
public final class DecodedSampleStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DecodedSampleStatus[] $VALUES;
    public static final DecodedSampleStatus CONSUMED;
    public static final DecodedSampleStatus END_OF_MEDIA;
    public static final DecodedSampleStatus END_OF_STREAM;
    public static final DecodedSampleStatus RENDER;
    public static final DecodedSampleStatus SKIP;

    static {
        DecodedSampleStatus decodedSampleStatus = new DecodedSampleStatus(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 0);
        SKIP = decodedSampleStatus;
        DecodedSampleStatus decodedSampleStatus2 = new DecodedSampleStatus("RENDER", 1);
        RENDER = decodedSampleStatus2;
        DecodedSampleStatus decodedSampleStatus3 = new DecodedSampleStatus("END_OF_MEDIA", 2);
        END_OF_MEDIA = decodedSampleStatus3;
        DecodedSampleStatus decodedSampleStatus4 = new DecodedSampleStatus("END_OF_STREAM", 3);
        END_OF_STREAM = decodedSampleStatus4;
        DecodedSampleStatus decodedSampleStatus5 = new DecodedSampleStatus("CONSUMED", 4);
        CONSUMED = decodedSampleStatus5;
        DecodedSampleStatus[] decodedSampleStatusArr = {decodedSampleStatus, decodedSampleStatus2, decodedSampleStatus3, decodedSampleStatus4, decodedSampleStatus5};
        $VALUES = decodedSampleStatusArr;
        $ENTRIES = new asp(decodedSampleStatusArr);
    }

    public DecodedSampleStatus() {
        throw null;
    }

    public static DecodedSampleStatus valueOf(String str) {
        return (DecodedSampleStatus) Enum.valueOf(DecodedSampleStatus.class, str);
    }

    public static DecodedSampleStatus[] values() {
        return (DecodedSampleStatus[]) $VALUES.clone();
    }
}
