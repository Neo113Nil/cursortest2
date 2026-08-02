package expo.modules.filesystem;

import com.nimbusds.jose.jwk.JWKParameterNames;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FileSystemFileHandle.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0013"}, d2 = {"Lexpo/modules/filesystem/FileMode;", "Lexpo/modules/kotlin/records/Record;", "", "descriptor", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescriptor", "()Ljava/lang/String;", "READ", "WRITE", "APPEND", "TRUNCATE", "READ_WRITE", "rafMode", "getRafMode", "ensureCanRead", "", "ensureCanWrite", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileMode implements Record {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FileMode[] $VALUES;
    private final String descriptor;
    public static final FileMode READ = new FileMode("READ", 0, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
    public static final FileMode WRITE = new FileMode("WRITE", 1, "w");
    public static final FileMode APPEND = new FileMode("APPEND", 2, "wa");
    public static final FileMode TRUNCATE = new FileMode("TRUNCATE", 3, "wt");
    public static final FileMode READ_WRITE = new FileMode("READ_WRITE", 4, "rw");

    /* compiled from: FileSystemFileHandle.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FileMode.values().length];
            try {
                iArr[FileMode.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileMode.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FileMode.WRITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FileMode.APPEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FileMode.TRUNCATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FileMode[] $values() {
        return new FileMode[]{READ, WRITE, APPEND, TRUNCATE, READ_WRITE};
    }

    public static EnumEntries<FileMode> getEntries() {
        return $ENTRIES;
    }

    private FileMode(String str, int i, String str2) {
        this.descriptor = str2;
    }

    public final String getDescriptor() {
        return this.descriptor;
    }

    static {
        FileMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final String getRafMode() {
        return this == READ ? JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR : "rw";
    }

    public final void ensureCanRead() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new Exceptions.IllegalStateException("Cannot read. File opened in write-only mode.", null, 2, null);
    }

    public final void ensureCanWrite() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            throw new Exceptions.IllegalStateException("Cannot write. File opened in read-only mode.", null, 2, null);
        }
        if (i != 2 && i != 3 && i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static FileMode valueOf(String str) {
        return (FileMode) Enum.valueOf(FileMode.class, str);
    }

    public static FileMode[] values() {
        return (FileMode[]) $VALUES.clone();
    }
}
