package com.tencent.mmkv;

/* loaded from: classes8.dex */
public class MMKVConfig {
    public int mode = 1;
    public boolean aes256 = false;
    public String cryptKey = null;
    public String rootPath = null;
    public long expectedCapacity = 0;
    public Boolean enableKeyExpire = null;
    public int expiredInSeconds = 0;
    public boolean enableCompareBeforeSet = false;
    public MMKVRecoverStrategic recover = null;
    public int itemSizeLimit = 0;
}
