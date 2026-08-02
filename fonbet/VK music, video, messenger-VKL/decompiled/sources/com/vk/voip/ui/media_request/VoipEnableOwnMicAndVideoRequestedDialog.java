package com.vk.voip.ui.media_request;

import xsna.asp;
import xsna.dw20;
import xsna.iah0;
import xsna.xnw0;
import xsna.zrp;
import xsna.zx0;

/* compiled from: VoipEnableOwnMicAndVideoRequestedDialog.kt */
/* loaded from: classes7.dex */
public final class VoipEnableOwnMicAndVideoRequestedDialog {
    public static final int e = iah0.a(56);
    public final boolean a;
    public final zx0 b;
    public dw20 c;
    public xnw0 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipEnableOwnMicAndVideoRequestedDialog.kt */
    public static final class RequestMedia {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RequestMedia[] $VALUES;
        public static final RequestMedia CAMERA_MICROPHONE;
        public static final RequestMedia MICROPHONE;

        static {
            RequestMedia requestMedia = new RequestMedia("CAMERA_MICROPHONE", 0);
            CAMERA_MICROPHONE = requestMedia;
            RequestMedia requestMedia2 = new RequestMedia("MICROPHONE", 1);
            MICROPHONE = requestMedia2;
            RequestMedia[] requestMediaArr = {requestMedia, requestMedia2};
            $VALUES = requestMediaArr;
            $ENTRIES = new asp(requestMediaArr);
        }

        public RequestMedia() {
            throw null;
        }

        public static RequestMedia valueOf(String str) {
            return (RequestMedia) Enum.valueOf(RequestMedia.class, str);
        }

        public static RequestMedia[] values() {
            return (RequestMedia[]) $VALUES.clone();
        }
    }

    public VoipEnableOwnMicAndVideoRequestedDialog(boolean z, zx0 zx0Var) {
        this.a = z;
        this.b = zx0Var;
    }
}
