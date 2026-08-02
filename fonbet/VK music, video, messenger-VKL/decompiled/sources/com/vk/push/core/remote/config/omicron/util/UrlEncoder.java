package com.vk.push.core.remote.config.omicron.util;

import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes.dex */
public class UrlEncoder {
    public static String encodeUtf8(@NonNull Object obj) {
        try {
            return URLEncoder.encode(obj.toString(), C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
