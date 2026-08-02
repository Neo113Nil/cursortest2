package io.agora.rtc2.video;

import java.util.ArrayList;

/* loaded from: classes3.dex */
class VideoCaptureFormatParser {
    public static VideoCaptureFormat[] fromString(String str) {
        VideoCaptureFormat fromString;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("/")) {
            if (str2 != null && !str2.isEmpty() && (fromString = VideoCaptureFormat.fromString(str2)) != null) {
                arrayList.add(fromString);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (VideoCaptureFormat[]) arrayList.toArray(new VideoCaptureFormat[arrayList.size()]);
    }

    public static String toString(VideoCaptureFormat[] videoCaptureFormatArr) {
        String str = "";
        if (videoCaptureFormatArr == null) {
            return "";
        }
        for (int i10 = 0; i10 < videoCaptureFormatArr.length; i10++) {
            str = str + videoCaptureFormatArr[i10].toString();
            if (i10 != videoCaptureFormatArr.length - 1) {
                str = str + "/";
            }
        }
        return str;
    }
}
