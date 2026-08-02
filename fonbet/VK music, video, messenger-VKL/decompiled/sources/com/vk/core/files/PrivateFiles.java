package com.vk.core.files;

import com.vk.core.files.c;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.nbr;
import xsna.z4g;
import xsna.zfd0;
import xsna.zrp;

/* compiled from: PrivateFiles.kt */
/* loaded from: classes.dex */
public final class PrivateFiles {
    public final zfd0 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrivateFiles.kt */
    public static final class StorageType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StorageType[] $VALUES;
        public static final StorageType EXTERNAL;
        public static final StorageType INTERNAL;
        public static final StorageType SD_CARD;

        static {
            StorageType storageType = new StorageType("INTERNAL", 0);
            INTERNAL = storageType;
            StorageType storageType2 = new StorageType("EXTERNAL", 1);
            EXTERNAL = storageType2;
            StorageType storageType3 = new StorageType("SD_CARD", 2);
            SD_CARD = storageType3;
            StorageType[] storageTypeArr = {storageType, storageType2, storageType3};
            $VALUES = storageTypeArr;
            $ENTRIES = new asp(storageTypeArr);
        }

        public StorageType() {
            throw null;
        }

        public static StorageType valueOf(String str) {
            return (StorageType) Enum.valueOf(StorageType.class, str);
        }

        public static StorageType[] values() {
            return (StorageType[]) $VALUES.clone();
        }
    }

    /* compiled from: PrivateFiles.kt */
    public static final class a {
        public final File a;
        public final StorageType b;

        public a(File file, StorageType storageType) {
            this.a = file;
            this.b = storageType;
        }
    }

    /* compiled from: PrivateFiles.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PrivateLocation$Guaranteed.values().length];
            try {
                iArr[PrivateLocation$Guaranteed.INTERNAL_STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivateLocation$Guaranteed.EXTERNAL_OR_INTERNAL_STORAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivateLocation$Guaranteed.SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrivateLocation$Guaranteed.INTERNAL_CACHE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrivateLocation$Guaranteed.EXTERNAL_OR_INTERNAL_CACHE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrivateLocation$Guaranteed.SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PrivateLocation$Optional.values().length];
            try {
                iArr2[PrivateLocation$Optional.EXTERNAL_STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PrivateLocation$Optional.SD_CARD_STORAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PrivateLocation$Optional.EXTERNAL_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PrivateLocation$Optional.SD_CARD_CACHE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public PrivateFiles(zfd0 zfd0Var) {
        this.a = zfd0Var;
    }

    public static File e(PrivateFiles privateFiles, PrivateSubdir privateSubdir, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        PrivateLocation$Guaranteed h = privateSubdir.h();
        privateFiles.getClass();
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis());
        }
        String concat = str2 != null ? ".".concat(str2) : "";
        return nbr.t(privateFiles.b(privateSubdir, h, true).a, str + concat);
    }

    public final void a(PrivateSubdir privateSubdir, Long l) {
        Iterator it = ((List) c.b.getValue()).iterator();
        while (it.hasNext()) {
            File d = d((c) it.next(), privateSubdir, true);
            if (d != null) {
                z4g.b(d, l);
            }
        }
    }

    public final a b(PrivateSubdir privateSubdir, PrivateLocation$Guaranteed privateLocation$Guaranteed, boolean z) {
        switch (b.$EnumSwitchMapping$0[privateLocation$Guaranteed.ordinal()]) {
            case 1:
                return new a(d(c.d.c, privateSubdir, z), StorageType.INTERNAL);
            case 2:
                File d = d(c.b.c, privateSubdir, z);
                return d != null ? new a(d, StorageType.EXTERNAL) : new a(d(c.d.c, privateSubdir, z), StorageType.INTERNAL);
            case 3:
                File d2 = d(c.f.c, privateSubdir, z);
                if (d2 != null) {
                    return new a(d2, StorageType.SD_CARD);
                }
                File d3 = d(c.b.c, privateSubdir, z);
                return d3 != null ? new a(d3, StorageType.EXTERNAL) : new a(d(c.d.c, privateSubdir, z), StorageType.INTERNAL);
            case 4:
                return new a(d(c.C0768c.c, privateSubdir, z), StorageType.INTERNAL);
            case 5:
                File d4 = d(c.a.c, privateSubdir, z);
                return d4 != null ? new a(d4, StorageType.EXTERNAL) : new a(d(c.C0768c.c, privateSubdir, z), StorageType.INTERNAL);
            case 6:
                File d5 = d(c.e.c, privateSubdir, z);
                if (d5 != null) {
                    return new a(d5, StorageType.SD_CARD);
                }
                File d6 = d(c.a.c, privateSubdir, z);
                return d6 != null ? new a(d6, StorageType.EXTERNAL) : new a(d(c.C0768c.c, privateSubdir, z), StorageType.INTERNAL);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final <FileType extends File> FileType d(c<FileType> cVar, PrivateSubdir privateSubdir, boolean z) {
        return cVar.a.invoke(this.a, privateSubdir, Boolean.valueOf(z));
    }
}
