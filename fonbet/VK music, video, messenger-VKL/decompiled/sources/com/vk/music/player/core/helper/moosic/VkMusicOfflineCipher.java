package com.vk.music.player.core.helper.moosic;

import java.security.SecureRandom;
import javax.crypto.SecretKey;
import xsna.ncc;

/* compiled from: VkMusicOfflineCipher.kt */
/* loaded from: classes3.dex */
public final class VkMusicOfflineCipher {
    public final ncc a;
    public SecretKey b;
    public String c;
    public String d;

    /* compiled from: VkMusicOfflineCipher.kt */
    public static final class CipherWrongUserException extends Exception {
    }

    public VkMusicOfflineCipher(ncc nccVar) {
        this.a = nccVar;
        new SecureRandom();
    }
}
