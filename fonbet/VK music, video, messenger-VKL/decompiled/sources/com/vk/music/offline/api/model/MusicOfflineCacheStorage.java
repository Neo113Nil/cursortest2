package com.vk.music.offline.api.model;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateLocation$Guaranteed;
import com.vk.core.files.PrivateLocation$Optional;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.files.c;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e8r;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicOfflineCacheStorage.kt */
/* loaded from: classes.dex */
public abstract class MusicOfflineCacheStorage {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicOfflineCacheStorage[] $VALUES;
    public static final a Companion;
    public static final MusicOfflineCacheStorage EXTERNAL_OR_INTERNAL;
    public static final MusicOfflineCacheStorage SD_CARD;
    private final int defaultPriority;
    private final String key;

    /* compiled from: MusicOfflineCacheStorage.kt */
    public static final class a {
    }

    /* compiled from: MusicOfflineCacheStorage.kt */
    public static final class b extends MusicOfflineCacheStorage {
        @Override // com.vk.music.offline.api.model.MusicOfflineCacheStorage
        public final File h() {
            return e8r.a.b(PrivateSubdir.OFFLINE_MUSIC_PUBLIC_EXTERNAL, PrivateLocation$Guaranteed.EXTERNAL_OR_INTERNAL_STORAGE, true).a;
        }
    }

    /* compiled from: MusicOfflineCacheStorage.kt */
    public static final class c extends MusicOfflineCacheStorage {
        @Override // com.vk.music.offline.api.model.MusicOfflineCacheStorage
        public final File h() {
            PrivateFiles.a aVar;
            PrivateFiles privateFiles = e8r.a;
            PrivateSubdir privateSubdir = PrivateSubdir.OFFLINE_MUSIC_PUBLIC;
            PrivateLocation$Optional privateLocation$Optional = PrivateLocation$Optional.SD_CARD_STORAGE;
            privateFiles.getClass();
            int i = PrivateFiles.b.$EnumSwitchMapping$1[privateLocation$Optional.ordinal()];
            if (i == 1) {
                File d = privateFiles.d(c.b.c, privateSubdir, true);
                if (d != null) {
                    aVar = new PrivateFiles.a(d, PrivateFiles.StorageType.EXTERNAL);
                }
                aVar = null;
            } else if (i == 2) {
                File d2 = privateFiles.d(c.f.c, privateSubdir, true);
                if (d2 != null) {
                    aVar = new PrivateFiles.a(d2, PrivateFiles.StorageType.SD_CARD);
                }
                aVar = null;
            } else if (i == 3) {
                File d3 = privateFiles.d(c.a.c, privateSubdir, true);
                if (d3 != null) {
                    aVar = new PrivateFiles.a(d3, PrivateFiles.StorageType.EXTERNAL);
                }
                aVar = null;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                File d4 = privateFiles.d(c.e.c, privateSubdir, true);
                if (d4 != null) {
                    aVar = new PrivateFiles.a(d4, PrivateFiles.StorageType.SD_CARD);
                }
                aVar = null;
            }
            if (aVar != null) {
                return aVar.a;
            }
            return null;
        }
    }

    static {
        b bVar = new b("EXTERNAL_OR_INTERNAL", 0, "public_cache_external_or_internal", 10);
        EXTERNAL_OR_INTERNAL = bVar;
        c cVar = new c("SD_CARD", 1, "public_cache_sd_card", 20);
        SD_CARD = cVar;
        MusicOfflineCacheStorage[] musicOfflineCacheStorageArr = {bVar, cVar};
        $VALUES = musicOfflineCacheStorageArr;
        $ENTRIES = new asp(musicOfflineCacheStorageArr);
        Companion = new a();
    }

    public MusicOfflineCacheStorage() {
        throw null;
    }

    public MusicOfflineCacheStorage(String str, int i, String str2, int i2) {
        this.key = str2;
        this.defaultPriority = i2;
    }

    public static zrp<MusicOfflineCacheStorage> j() {
        return $ENTRIES;
    }

    public static MusicOfflineCacheStorage valueOf(String str) {
        return (MusicOfflineCacheStorage) Enum.valueOf(MusicOfflineCacheStorage.class, str);
    }

    public static MusicOfflineCacheStorage[] values() {
        return (MusicOfflineCacheStorage[]) $VALUES.clone();
    }

    public abstract File h();

    public final int i() {
        return this.defaultPriority;
    }

    public final String k() {
        return this.key;
    }

    public final boolean l() {
        return h() != null;
    }
}
