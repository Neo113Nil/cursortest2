package com.vk.push.core.utils;

import java.util.Random;

/* compiled from: RandomUtils.kt */
/* loaded from: classes5.dex */
public final class RandomUtils {
    public static final RandomUtils INSTANCE = new RandomUtils();
    public static final Random a = new Random();

    public final double nextGaussian() {
        return a.nextGaussian();
    }
}
