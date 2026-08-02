package io.ably.lib.types;

import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.Crypto;
import java.util.Map;

/* loaded from: classes9.dex */
public class ChannelOptions {
    public boolean attachOnSubscribe = true;
    public Object cipherParams;
    public boolean encrypted;
    public ChannelMode[] modes;
    public Map<String, String> params;

    public boolean hasModes() {
        ChannelMode[] channelModeArr = this.modes;
        return (channelModeArr == null || channelModeArr.length == 0) ? false : true;
    }

    public boolean hasParams() {
        Map<String, String> map = this.params;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public int getModeFlags() {
        int i = 0;
        for (ChannelMode channelMode : this.modes) {
            i |= channelMode.getMask();
        }
        return i;
    }

    @Deprecated
    public static ChannelOptions fromCipherKey(byte[] bArr) throws AblyException {
        return withCipherKey(bArr);
    }

    @Deprecated
    public static ChannelOptions fromCipherKey(String str) throws AblyException {
        return fromCipherKey(Base64Coder.decode(str));
    }

    public static ChannelOptions withCipherKey(byte[] bArr) throws AblyException {
        ChannelOptions channelOptions = new ChannelOptions();
        channelOptions.encrypted = true;
        channelOptions.cipherParams = Crypto.getDefaultParams(bArr);
        return channelOptions;
    }

    public static ChannelOptions withCipherKey(String str) throws AblyException {
        return withCipherKey(Base64Coder.decode(str));
    }

    public synchronized Crypto.CipherParams getCipherParamsOrDefault() throws AblyException {
        Crypto.CipherParams checkCipherParams;
        checkCipherParams = Crypto.checkCipherParams(this.cipherParams);
        if (this.cipherParams == null) {
            this.cipherParams = checkCipherParams;
        }
        return checkCipherParams;
    }
}
