package com.vk.id.internal.auth.web;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vk/id/internal/auth/web/DelimitedVersion;", "", "mNumericParts", "", "<init>", "([J)V", "toString", "", "equals", "", "other", "", "hashCode", "", "compareTo", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DelimitedVersion implements Comparable<DelimitedVersion> {

    @NotNull
    private final long[] mNumericParts;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vk/id/internal/auth/web/DelimitedVersion$Companion;", "", "<init>", "()V", "PRIME_HASH_FACTOR", "", "BIT_MASK_32", "", "parse", "Lcom/vk/id/internal/auth/web/DelimitedVersion;", "versionString", "", "compareLongs", "a", "b", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int compareLongs(long a11, long b11) {
            if (a11 < b11) {
                return -1;
            }
            return a11 > b11 ? 1 : 0;
        }

        @NotNull
        public final DelimitedVersion parse(String versionString) {
            Collection collection;
            if (versionString == null) {
                return new DelimitedVersion(new long[0]);
            }
            List i11 = new Regex("[^0-9]+").i(versionString);
            if (!i11.isEmpty()) {
                ListIterator listIterator = i11.listIterator(i11.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = C7714v.K0(i11, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = K.f71697a;
            String[] strArr = (String[]) collection.toArray(new String[0]);
            long[] jArr = new long[strArr.length];
            int i12 = 0;
            for (String str : strArr) {
                if (str.length() != 0) {
                    jArr[i12] = Long.parseLong(str);
                    i12++;
                }
            }
            do {
                i12--;
                if (i12 < 0) {
                    break;
                }
            } while (jArr[i12] <= 0);
            int i13 = i12 + 1;
            long[] jArr2 = new long[i13];
            System.arraycopy(jArr, 0, jArr2, 0, i13);
            return new DelimitedVersion(jArr2);
        }

        private Companion() {
        }
    }

    public DelimitedVersion(@NotNull long[] mNumericParts) {
        Intrinsics.checkNotNullParameter(mNumericParts, "mNumericParts");
        this.mNumericParts = mNumericParts;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && (other instanceof DelimitedVersion) && compareTo((DelimitedVersion) other) == 0;
    }

    public int hashCode() {
        int i11 = 0;
        for (long j11 : this.mNumericParts) {
            i11 = (i11 * 92821) + ((int) j11);
        }
        return i11;
    }

    @NotNull
    public String toString() {
        if (this.mNumericParts.length == 0) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mNumericParts[0]);
        for (int i11 = 1; i11 < this.mNumericParts.length; i11++) {
            sb2.append('.');
            sb2.append(this.mNumericParts[i11]);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DelimitedVersion other) {
        long[] jArr;
        Intrinsics.checkNotNullParameter(other, "other");
        int i11 = 0;
        while (true) {
            jArr = this.mNumericParts;
            if (i11 >= jArr.length) {
                break;
            }
            long[] jArr2 = other.mNumericParts;
            if (i11 >= jArr2.length) {
                break;
            }
            int compareLongs = INSTANCE.compareLongs(jArr[i11], jArr2[i11]);
            if (compareLongs != 0) {
                return compareLongs;
            }
            i11++;
        }
        return INSTANCE.compareLongs(jArr.length, other.mNumericParts.length);
    }
}
