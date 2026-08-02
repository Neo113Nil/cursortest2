package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import defpackage.gz8;
import defpackage.jp5;
import defpackage.km5;
import defpackage.sub;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class KotlinClassHeader {

    @Nullable
    private final String[] data;
    private final int extraInt;

    @Nullable
    private final String extraString;

    @Nullable
    private final String[] incompatibleData;

    @NotNull
    private final Kind kind;

    @NotNull
    private final JvmMetadataVersion metadataVersion;

    @Nullable
    private final String packageName;

    @Nullable
    private final byte[] serializedIr;

    @Nullable
    private final String[] strings;

    public KotlinClassHeader(@NotNull Kind kind, @NotNull JvmMetadataVersion jvmMetadataVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i, @Nullable String str2, @Nullable byte[] bArr) {
        kind.getClass();
        jvmMetadataVersion.getClass();
        this.kind = kind;
        this.metadataVersion = jvmMetadataVersion;
        this.data = strArr;
        this.incompatibleData = strArr2;
        this.strings = strArr3;
        this.extraString = str;
        this.extraInt = i;
        this.packageName = str2;
        this.serializedIr = bArr;
    }

    private final boolean has(int i, int i2) {
        return (i & i2) != 0;
    }

    @Nullable
    public final String[] getData() {
        return this.data;
    }

    @Nullable
    public final String[] getIncompatibleData() {
        return this.incompatibleData;
    }

    @NotNull
    public final Kind getKind() {
        return this.kind;
    }

    @NotNull
    public final JvmMetadataVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    @Nullable
    public final String getMultifileClassName() {
        String str = this.extraString;
        if (this.kind == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @NotNull
    public final List<String> getMultifilePartNames() {
        String[] strArr = this.data;
        List<String> list = null;
        if (this.kind != Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        if (strArr != null) {
            list = Arrays.asList(strArr);
            list.getClass();
        }
        return list == null ? km5.a : list;
    }

    @Nullable
    public final String[] getStrings() {
        return this.strings;
    }

    public final boolean isPreRelease() {
        return has(this.extraInt, 2);
    }

    public final boolean isUnstableFirBinary() {
        return has(this.extraInt, 64) && !has(this.extraInt, 32);
    }

    public final boolean isUnstableJvmIrBinary() {
        return has(this.extraInt, 16) && !has(this.extraInt, 32);
    }

    @NotNull
    public String toString() {
        return this.kind + " version=" + this.metadataVersion;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        private static final /* synthetic */ jp5 $ENTRIES;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final Map<Integer, Kind> entryById;
        private final int id;

        static {
            Kind[] values = values();
            int c = sub.c(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(c < 16 ? 16 : c);
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.id), kind);
            }
            entryById = linkedHashMap;
            $ENTRIES = gz8.G($VALUES);
        }

        Kind(int i) {
            this.id = i;
        }

        @NotNull
        public static final Kind getById(int i) {
            return Companion.getById(i);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Kind getById(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind == null ? Kind.UNKNOWN : kind;
            }

            private Companion() {
            }
        }
    }
}
