package com.twilio.voice;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i10, int i11, String str) {
        if (i10 < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    private static String badPositionIndex(int i10, int i11, String str) {
        if (i10 < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    private static String badPositionIndexes(int i10, int i11, int i12) {
        return (i10 < 0 || i10 > i12) ? badPositionIndex(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? badPositionIndex(i11, i12, "end index") : format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public static void checkApplicationContext(@NonNull Context context, @NonNull String str) {
    }

    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i10, int i11) {
        return checkElementIndex(i10, i11, "index");
    }

    public static <T> T checkNotNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static int checkPositionIndex(int i10, int i11) {
        return checkPositionIndex(i10, i11, "index");
    }

    public static void checkPositionIndexes(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i10, i11, i12));
        }
    }

    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static String format(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) valueOf, i11, indexOf);
            sb2.append(objArr[i10]);
            i11 = indexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) valueOf, i11, valueOf.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i12 = i10 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void checkApplicationContext(@NonNull Context context) {
        checkApplicationContext(context, "Context is not application context");
    }

    public static void checkArgument(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(badElementIndex(i10, i11, str));
        }
        return i10;
    }

    public static <T> T checkNotNull(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(badPositionIndex(i10, i11, str));
        }
        return i10;
    }

    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, objArr));
    }

    public static void checkState(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(format(str, objArr));
        }
    }

    public static void checkArgument(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Character.valueOf(c10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalStateException(format(str, Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Integer.valueOf(i10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalStateException(format(str, Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Long.valueOf(j10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Long.valueOf(j10)));
    }

    public static void checkState(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalStateException(format(str, Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, obj));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, obj));
    }

    public static void checkState(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(format(str, obj));
        }
    }

    public static void checkArgument(boolean z10, String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10, char c11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Character.valueOf(c10), Character.valueOf(c11)));
    }

    public static void checkState(boolean z10, String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalStateException(format(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static void checkArgument(boolean z10, String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Character.valueOf(c10), Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalStateException(format(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, String str, char c10, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Character.valueOf(c10), Long.valueOf(j10)));
    }

    public static void checkState(boolean z10, String str, char c10, long j10) {
        if (!z10) {
            throw new IllegalStateException(format(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z10, String str, char c10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Character.valueOf(c10), obj));
        }
    }

    public static <T> T checkNotNull(T t10, String str, char c10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Character.valueOf(c10), obj));
    }

    public static void checkState(boolean z10, String str, char c10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(format(str, Character.valueOf(c10), obj));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Integer.valueOf(i10), Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalStateException(format(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10, int i11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static void checkState(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalStateException(format(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Integer.valueOf(i10), Long.valueOf(j10)));
    }

    public static void checkState(boolean z10, String str, int i10, long j10) {
        if (!z10) {
            throw new IllegalStateException(format(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z10, String str, int i10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Integer.valueOf(i10), obj));
        }
    }

    public static <T> T checkNotNull(T t10, String str, int i10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Integer.valueOf(i10), obj));
    }

    public static void checkState(boolean z10, String str, int i10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(format(str, Integer.valueOf(i10), obj));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Long.valueOf(j10), Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, String str, long j10, char c10) {
        if (!z10) {
            throw new IllegalStateException(format(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Long.valueOf(j10), Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, String str, long j10, int i10) {
        if (!z10) {
            throw new IllegalStateException(format(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10, long j11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Long.valueOf(j10), Long.valueOf(j11)));
    }

    public static void checkState(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalStateException(format(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void checkArgument(boolean z10, String str, long j10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, Long.valueOf(j10), obj));
        }
    }

    public static <T> T checkNotNull(T t10, String str, long j10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, Long.valueOf(j10), obj));
    }

    public static void checkState(boolean z10, String str, long j10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(format(str, Long.valueOf(j10), obj));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, obj, Character.valueOf(c10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, obj, Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, String str, Object obj, char c10) {
        if (!z10) {
            throw new IllegalStateException(format(str, obj, Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, obj, Integer.valueOf(i10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, obj, Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, String str, Object obj, int i10) {
        if (!z10) {
            throw new IllegalStateException(format(str, obj, Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, obj, Long.valueOf(j10)));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, obj, Long.valueOf(j10)));
    }

    public static void checkState(boolean z10, String str, Object obj, long j10) {
        if (!z10) {
            throw new IllegalStateException(format(str, obj, Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, obj, obj2));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, Object obj2) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, obj, obj2));
    }

    public static void checkState(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalStateException(format(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, obj, obj2, obj3));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, Object obj2, Object obj3) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, obj, obj2, obj3));
    }

    public static void checkState(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z10) {
            throw new IllegalStateException(format(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z10, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z10) {
            throw new IllegalArgumentException(format(str, obj, obj2, obj3, obj4));
        }
    }

    public static <T> T checkNotNull(T t10, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(format(str, obj, obj2, obj3, obj4));
    }

    public static void checkState(boolean z10, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z10) {
            throw new IllegalStateException(format(str, obj, obj2, obj3, obj4));
        }
    }
}
