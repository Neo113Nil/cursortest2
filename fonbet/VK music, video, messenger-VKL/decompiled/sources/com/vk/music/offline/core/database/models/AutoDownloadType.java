package com.vk.music.offline.core.database.models;

import java.util.Iterator;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoDownloadType.kt */
/* loaded from: classes3.dex */
public final class AutoDownloadType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AutoDownloadType[] $VALUES;
    public static final AutoDownloadType BUFFERED;
    public static final int BUFFERED_TYPE_ID = 0;
    public static final a Companion;
    public static final AutoDownloadType DOWNLOADED;
    public static final int DOWNLOADED_TYPE_ID = 1;
    private final int value;

    /* compiled from: AutoDownloadType.kt */
    public static final class a {
        public static AutoDownloadType a(int i) {
            Object obj;
            Iterator<E> it = AutoDownloadType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AutoDownloadType) obj).i() == i) {
                    break;
                }
            }
            AutoDownloadType autoDownloadType = (AutoDownloadType) obj;
            return autoDownloadType == null ? AutoDownloadType.DOWNLOADED : autoDownloadType;
        }
    }

    static {
        AutoDownloadType autoDownloadType = new AutoDownloadType("BUFFERED", 0, 0);
        BUFFERED = autoDownloadType;
        AutoDownloadType autoDownloadType2 = new AutoDownloadType("DOWNLOADED", 1, 1);
        DOWNLOADED = autoDownloadType2;
        AutoDownloadType[] autoDownloadTypeArr = {autoDownloadType, autoDownloadType2};
        $VALUES = autoDownloadTypeArr;
        $ENTRIES = new asp(autoDownloadTypeArr);
        Companion = new a();
    }

    public AutoDownloadType(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<AutoDownloadType> h() {
        return $ENTRIES;
    }

    public static AutoDownloadType valueOf(String str) {
        return (AutoDownloadType) Enum.valueOf(AutoDownloadType.class, str);
    }

    public static AutoDownloadType[] values() {
        return (AutoDownloadType[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
