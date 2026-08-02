package com.tencent.mmkv;

/* loaded from: classes8.dex */
public final class NameSpace {
    private final String rootDir;

    NameSpace(String str) {
        this.rootDir = str;
    }

    public String getRootDir() {
        return this.rootDir;
    }

    public MMKV mmkvWithID(String str) throws RuntimeException {
        return mmkvWithID(str, new MMKVConfig());
    }

    public MMKV mmkvWithID(String str, MMKVConfig mMKVConfig) throws RuntimeException {
        return MMKV.checkProcessMode(MMKV.getMMKVWithID(str, mMKVConfig.mode, mMKVConfig.cryptKey, this.rootDir, mMKVConfig.expectedCapacity, mMKVConfig.aes256, mMKVConfig.enableKeyExpire != null ? mMKVConfig.enableKeyExpire.booleanValue() ? 1 : 0 : -1, mMKVConfig.expiredInSeconds, mMKVConfig.enableCompareBeforeSet, mMKVConfig.recover == null ? -1 : mMKVConfig.recover == MMKVRecoverStrategic.OnErrorDiscard ? 0 : 1, mMKVConfig.itemSizeLimit), str, mMKVConfig.mode);
    }

    public MMKV mmkvWithID(String str, int i) throws RuntimeException {
        MMKVConfig mMKVConfig = new MMKVConfig();
        mMKVConfig.mode = i;
        return mmkvWithID(str, mMKVConfig);
    }

    public MMKV mmkvWithID(String str, int i, long j) throws RuntimeException {
        MMKVConfig mMKVConfig = new MMKVConfig();
        mMKVConfig.mode = i;
        mMKVConfig.expectedCapacity = j;
        return mmkvWithID(str, mMKVConfig);
    }

    public MMKV mmkvWithID(String str, int i, String str2) throws RuntimeException {
        MMKVConfig mMKVConfig = new MMKVConfig();
        mMKVConfig.mode = i;
        mMKVConfig.cryptKey = str2;
        return mmkvWithID(str, mMKVConfig);
    }

    public MMKV mmkvWithID(String str, int i, String str2, boolean z) throws RuntimeException {
        MMKVConfig mMKVConfig = new MMKVConfig();
        mMKVConfig.mode = i;
        mMKVConfig.aes256 = z;
        mMKVConfig.cryptKey = str2;
        return mmkvWithID(str, mMKVConfig);
    }

    public MMKV mmkvWithID(String str, int i, String str2, long j) throws RuntimeException {
        MMKVConfig mMKVConfig = new MMKVConfig();
        mMKVConfig.mode = i;
        mMKVConfig.cryptKey = str2;
        mMKVConfig.expectedCapacity = j;
        return mmkvWithID(str, mMKVConfig);
    }

    public MMKV mmkvWithID(String str, int i, String str2, boolean z, long j) throws RuntimeException {
        MMKVConfig mMKVConfig = new MMKVConfig();
        mMKVConfig.mode = i;
        mMKVConfig.aes256 = z;
        mMKVConfig.cryptKey = str2;
        mMKVConfig.expectedCapacity = j;
        return mmkvWithID(str, mMKVConfig);
    }

    public boolean backupOneToDirectory(String str, String str2) {
        return MMKV.backupOneToDirectory(str, str2, this.rootDir);
    }

    public boolean restoreOneMMKVFromDirectory(String str, String str2) {
        return MMKV.restoreOneMMKVFromDirectory(str, str2, this.rootDir);
    }

    public boolean isFileValid(String str) {
        return MMKV.isFileValid(str, this.rootDir);
    }

    public boolean removeStorage(String str) {
        return MMKV.removeStorage(str, this.rootDir);
    }

    public boolean checkExist(String str) {
        return MMKV.checkExist(str, this.rootDir);
    }
}
