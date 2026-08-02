package com.huawei.hms.common.internal;

import com.huawei.hms.utils.StringUtil;
import com.vk.dto.common.ImageSizeKey;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes13.dex */
public class TransactionIdCreater {
    private static SecureRandom a() {
        try {
            return SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
            return new SecureRandom();
        }
    }

    public static String getId(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtil.addByteForNum(str, 9, ImageSizeKey.SIZE_KEY_UNDEFINED));
        sb.append(StringUtil.addByteForNum(str2, 6, ImageSizeKey.SIZE_KEY_UNDEFINED));
        Locale locale = Locale.ENGLISH;
        sb.append(new SimpleDateFormat("yyyyMMddHHmmssSSS", locale).format(new Date()));
        sb.append(String.format(locale, "%06d", Integer.valueOf(a().nextInt(1000000))));
        return sb.toString();
    }
}
