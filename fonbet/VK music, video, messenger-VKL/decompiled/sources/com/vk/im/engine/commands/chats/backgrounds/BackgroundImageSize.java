package com.vk.im.engine.commands.chats.backgrounds;

import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import ru.ok.gl.tf.Tensorflow;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BackgroundImageSize.kt */
/* loaded from: classes2.dex */
public final class BackgroundImageSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BackgroundImageSize[] $VALUES;
    public static final a Companion;
    public static final BackgroundImageSize HDPI;
    public static final BackgroundImageSize XHDPI;
    public static final BackgroundImageSize XXHDPI;
    public static final BackgroundImageSize XXXHDPI;
    public static final BackgroundImageSize XXXXHDPI;
    private final int height;
    private final int width;

    /* compiled from: BackgroundImageSize.kt */
    public static final class a {
    }

    static {
        BackgroundImageSize backgroundImageSize = new BackgroundImageSize("HDPI", 0, 480, 800);
        HDPI = backgroundImageSize;
        BackgroundImageSize backgroundImageSize2 = new BackgroundImageSize("XHDPI", 1, Tensorflow.FRAME_HEIGHT, CoverVideoUploadTask.y);
        XHDPI = backgroundImageSize2;
        BackgroundImageSize backgroundImageSize3 = new BackgroundImageSize("XXHDPI", 2, 1080, 1920);
        XXHDPI = backgroundImageSize3;
        BackgroundImageSize backgroundImageSize4 = new BackgroundImageSize("XXXHDPI", 3, 1440, 2560);
        XXXHDPI = backgroundImageSize4;
        BackgroundImageSize backgroundImageSize5 = new BackgroundImageSize("XXXXHDPI", 4, 1800, 3200);
        XXXXHDPI = backgroundImageSize5;
        BackgroundImageSize[] backgroundImageSizeArr = {backgroundImageSize, backgroundImageSize2, backgroundImageSize3, backgroundImageSize4, backgroundImageSize5};
        $VALUES = backgroundImageSizeArr;
        $ENTRIES = new asp(backgroundImageSizeArr);
        Companion = new a();
    }

    public BackgroundImageSize(String str, int i, int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    public static BackgroundImageSize valueOf(String str) {
        return (BackgroundImageSize) Enum.valueOf(BackgroundImageSize.class, str);
    }

    public static BackgroundImageSize[] values() {
        return (BackgroundImageSize[]) $VALUES.clone();
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
