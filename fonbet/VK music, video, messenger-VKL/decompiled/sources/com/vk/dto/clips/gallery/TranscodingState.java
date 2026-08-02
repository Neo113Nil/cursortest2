package com.vk.dto.clips.gallery;

import java.util.Iterator;
import java.util.Locale;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TranscodingState.kt */
/* loaded from: classes18.dex */
public final class TranscodingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TranscodingState[] $VALUES;
    public static final TranscodingState CAMERA_BACK;
    public static final TranscodingState CAMERA_FRONT;
    public static final a Companion;
    public static final TranscodingState GALLERY_NOT_TRANSCODED;
    public static final TranscodingState GALLERY_TRANSCODED;

    /* compiled from: TranscodingState.kt */
    public static final class a {
        public static TranscodingState a(String str) {
            Object obj;
            Iterator<E> it = TranscodingState.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String name = ((TranscodingState) next).name();
                Locale locale = Locale.ROOT;
                if (name.toLowerCase(locale).equals(str != null ? str.toLowerCase(locale) : null)) {
                    obj = next;
                    break;
                }
            }
            TranscodingState transcodingState = (TranscodingState) obj;
            return transcodingState == null ? TranscodingState.CAMERA_BACK : transcodingState;
        }
    }

    static {
        TranscodingState transcodingState = new TranscodingState("GALLERY_TRANSCODED", 0);
        GALLERY_TRANSCODED = transcodingState;
        TranscodingState transcodingState2 = new TranscodingState("GALLERY_NOT_TRANSCODED", 1);
        GALLERY_NOT_TRANSCODED = transcodingState2;
        TranscodingState transcodingState3 = new TranscodingState("CAMERA_FRONT", 2);
        CAMERA_FRONT = transcodingState3;
        TranscodingState transcodingState4 = new TranscodingState("CAMERA_BACK", 3);
        CAMERA_BACK = transcodingState4;
        TranscodingState[] transcodingStateArr = {transcodingState, transcodingState2, transcodingState3, transcodingState4};
        $VALUES = transcodingStateArr;
        $ENTRIES = new asp(transcodingStateArr);
        Companion = new a();
    }

    public TranscodingState() {
        throw null;
    }

    public static zrp<TranscodingState> h() {
        return $ENTRIES;
    }

    public static TranscodingState valueOf(String str) {
        return (TranscodingState) Enum.valueOf(TranscodingState.class, str);
    }

    public static TranscodingState[] values() {
        return (TranscodingState[]) $VALUES.clone();
    }
}
