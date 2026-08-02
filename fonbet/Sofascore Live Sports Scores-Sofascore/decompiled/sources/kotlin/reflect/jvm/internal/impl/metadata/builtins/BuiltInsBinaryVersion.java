package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import defpackage.k13;
import defpackage.v6a;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final BuiltInsBinaryVersion INSTANCE = new BuiltInsBinaryVersion(1, 0, 7);

    @NotNull
    public static final BuiltInsBinaryVersion INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(@NotNull int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        return isCompatibleTo(INSTANCE);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BuiltInsBinaryVersion readFrom(@NotNull InputStream inputStream) {
            inputStream.getClass();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
            v6a it = intRange.iterator();
            while (it.c) {
                it.nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] R0 = CollectionsKt.R0(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(R0, R0.length));
        }

        private Companion() {
        }
    }
}
