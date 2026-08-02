package com.vk.dto.common;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONObject;
import xsna.asp;
import xsna.myc0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageSizeKey.kt */
/* loaded from: classes18.dex */
public final class ImageSizeKey {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImageSizeKey[] $VALUES;
    public static final a Companion;
    public static final ImageSizeKey SIZE_H_0423;
    public static final ImageSizeKey SIZE_J_0101;
    public static final char SIZE_KEY_BASE = '*';
    public static final char SIZE_KEY_UNDEFINED = '0';
    public static final ImageSizeKey SIZE_M_0130;
    public static final ImageSizeKey SIZE_O_0130;
    public static final ImageSizeKey SIZE_P_0200;
    public static final ImageSizeKey SIZE_Q_0320;
    public static final ImageSizeKey SIZE_R_0510;
    public static final ImageSizeKey SIZE_S_0075;
    public static final ImageSizeKey SIZE_W_2560;
    public static final ImageSizeKey SIZE_X_0604;
    public static final ImageSizeKey SIZE_Y_0807;
    public static final ImageSizeKey SIZE_Z_1080;
    private final int height;
    private final char key;
    private final int width;

    /* compiled from: ImageSizeKey.kt */
    public static final class a {
        public static int a(String str) {
            if (str == null || str.length() == 0) {
                return ImageSizeKey.SIZE_M_0130.getHeight();
            }
            ImageSizeKey b = b(str.charAt(0));
            return b != null ? b.getHeight() : ImageSizeKey.SIZE_M_0130.getHeight();
        }

        public static ImageSizeKey b(char c) {
            for (ImageSizeKey imageSizeKey : ImageSizeKey.values()) {
                if (imageSizeKey.i() == c) {
                    return imageSizeKey;
                }
            }
            return null;
        }

        public static char c(String str, char c) {
            return (str != null && myc0.f(str)) ? str.equals("base") ? ImageSizeKey.SIZE_KEY_BASE : str.charAt(0) : c;
        }

        public static char d(JSONObject jSONObject, char c) {
            return jSONObject == null ? c : c(jSONObject.optString("type", ""), c);
        }

        public static /* synthetic */ char e(a aVar, String str) {
            aVar.getClass();
            return c(str, ImageSizeKey.SIZE_KEY_UNDEFINED);
        }

        public static int f(Character ch) {
            ImageSizeKey b = b(ch.charValue());
            return b != null ? b.getWidth() : ImageSizeKey.SIZE_M_0130.getWidth();
        }

        public static int g(String str) {
            return (str == null || str.length() == 0) ? ImageSizeKey.SIZE_M_0130.getWidth() : f(Character.valueOf(str.charAt(0)));
        }
    }

    static {
        ImageSizeKey imageSizeKey = new ImageSizeKey('s', 0, 75, 68, "SIZE_S_0075");
        SIZE_S_0075 = imageSizeKey;
        ImageSizeKey imageSizeKey2 = new ImageSizeKey('j', 1, 101, 180, "SIZE_J_0101");
        SIZE_J_0101 = imageSizeKey2;
        ImageSizeKey imageSizeKey3 = new ImageSizeKey('h', 2, 423, 752, "SIZE_H_0423");
        SIZE_H_0423 = imageSizeKey3;
        ImageSizeKey imageSizeKey4 = new ImageSizeKey('m', 3, 130, 100, "SIZE_M_0130");
        SIZE_M_0130 = imageSizeKey4;
        ImageSizeKey imageSizeKey5 = new ImageSizeKey('o', 4, 130, 100, "SIZE_O_0130");
        SIZE_O_0130 = imageSizeKey5;
        ImageSizeKey imageSizeKey6 = new ImageSizeKey('p', 5, 200, 154, "SIZE_P_0200");
        SIZE_P_0200 = imageSizeKey6;
        ImageSizeKey imageSizeKey7 = new ImageSizeKey('q', 6, 320, 246, "SIZE_Q_0320");
        SIZE_Q_0320 = imageSizeKey7;
        ImageSizeKey imageSizeKey8 = new ImageSizeKey('r', 7, 510, 392, "SIZE_R_0510");
        SIZE_R_0510 = imageSizeKey8;
        ImageSizeKey imageSizeKey9 = new ImageSizeKey('x', 8, 604, 465, "SIZE_X_0604");
        SIZE_X_0604 = imageSizeKey9;
        ImageSizeKey imageSizeKey10 = new ImageSizeKey('y', 9, 807, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, "SIZE_Y_0807");
        SIZE_Y_0807 = imageSizeKey10;
        ImageSizeKey imageSizeKey11 = new ImageSizeKey('z', 10, 1080, 1024, "SIZE_Z_1080");
        SIZE_Z_1080 = imageSizeKey11;
        ImageSizeKey imageSizeKey12 = new ImageSizeKey('w', 11, 2560, 2048, "SIZE_W_2560");
        SIZE_W_2560 = imageSizeKey12;
        ImageSizeKey[] imageSizeKeyArr = {imageSizeKey, imageSizeKey2, imageSizeKey3, imageSizeKey4, imageSizeKey5, imageSizeKey6, imageSizeKey7, imageSizeKey8, imageSizeKey9, imageSizeKey10, imageSizeKey11, imageSizeKey12};
        $VALUES = imageSizeKeyArr;
        $ENTRIES = new asp(imageSizeKeyArr);
        Companion = new a();
    }

    public ImageSizeKey(char c, int i, int i2, int i3, String str) {
        this.key = c;
        this.width = i2;
        this.height = i3;
    }

    public static zrp<ImageSizeKey> h() {
        return $ENTRIES;
    }

    public static ImageSizeKey valueOf(String str) {
        return (ImageSizeKey) Enum.valueOf(ImageSizeKey.class, str);
    }

    public static ImageSizeKey[] values() {
        return (ImageSizeKey[]) $VALUES.clone();
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final char i() {
        return this.key;
    }
}
