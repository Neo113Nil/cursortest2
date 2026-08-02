package com.plaid.internal;

import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.plaid.internal.C3556a6;
import com.plaid.internal.V3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nConsoleLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsoleLogger.kt\ncom/plaid/core/log/internal/ConsoleLogger\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1109#2,2:191\n1#3:193\n*S KotlinDebug\n*F\n+ 1 ConsoleLogger.kt\ncom/plaid/core/log/internal/ConsoleLogger\n*L\n25#1:191,2\n*E\n"})
/* loaded from: classes3.dex */
public final class P implements Y3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final V3 f39491a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function3<Integer, String, String, Unit> f39492b;

    /* renamed from: c, reason: collision with root package name */
    public final Pattern f39493c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<String> f39494d;

    /* JADX WARN: Multi-variable type inference failed */
    public P(@NotNull V3 minPriority, @Nullable Function3<? super Integer, ? super String, ? super String, Unit> function3) {
        Intrinsics.checkNotNullParameter(minPriority, "minPriority");
        this.f39491a = minPriority;
        this.f39492b = function3;
        this.f39493c = Pattern.compile("(\\$\\d+)+$");
        this.f39494d = CollectionsKt.listOf((Object[]) new String[]{C3556a6.class.getName(), C3556a6.a.class.getName(), P.class.getName()});
    }

    public final void a(int i10, Throwable th2, String str, Object[] objArr, boolean z10) {
        if (z10) {
            return;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.f39494d.contains(stackTraceElement.getClassName())) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                String substringAfterLast$default = StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null);
                Matcher matcher = this.f39493c.matcher(substringAfterLast$default);
                if (matcher.find()) {
                    substringAfterLast$default = matcher.replaceAll("");
                    Intrinsics.checkNotNullExpressionValue(substringAfterLast$default, "replaceAll(...)");
                }
                substringAfterLast$default.length();
                V3.a aVar = V3.Companion;
                V3 v32 = this.f39491a;
                aVar.getClass();
                if (i10 < V3.a.a(v32)) {
                    return;
                }
                if (str == null || str.length() == 0) {
                    if (th2 == null) {
                        return;
                    }
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th2.printStackTrace(printWriter);
                    printWriter.flush();
                    str = stringWriter.toString();
                    Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                } else {
                    if (objArr.length != 0) {
                        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                        str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    }
                    if (th2 != null) {
                        StringWriter stringWriter2 = new StringWriter(256);
                        PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                        th2.printStackTrace(printWriter2);
                        printWriter2.flush();
                        String stringWriter3 = stringWriter2.toString();
                        Intrinsics.checkNotNullExpressionValue(stringWriter3, "toString(...)");
                        str = str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + stringWriter3;
                    }
                }
                try {
                    a(i10, substringAfterLast$default, str);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.plaid.internal.Y3
    public final void b(@Nullable Throwable th2, @Nullable String str, @NotNull Object[] args, boolean z10) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(5, th2, str, Arrays.copyOf(args, args.length), z10);
    }

    @Override // com.plaid.internal.Y3
    public final void c(@Nullable String str, @NotNull Object[] args, boolean z10) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(4, null, str, Arrays.copyOf(args, args.length), z10);
    }

    @Override // com.plaid.internal.Y3
    public final void d(@Nullable String str, @NotNull Object[] args, boolean z10) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(3, null, str, Arrays.copyOf(args, args.length), z10);
    }

    @Override // com.plaid.internal.Y3
    public final void e(@Nullable String str, @NotNull Object[] args, boolean z10) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(5, null, str, Arrays.copyOf(args, args.length), z10);
    }

    @Override // com.plaid.internal.Y3
    public final void b(@Nullable String str, @NotNull Object[] args, boolean z10) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(6, new Throwable(), "Plog.e: " + str, Arrays.copyOf(args, args.length), z10);
    }

    @Override // com.plaid.internal.Y3
    public final void b(@Nullable Throwable th2, boolean z10) {
        a(6, th2, null, new Object[0], z10);
    }

    @Override // com.plaid.internal.Y3
    public final void a(@Nullable String str, @NotNull Object[] args, boolean z10) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(2, null, str, Arrays.copyOf(args, args.length), z10);
    }

    @Override // com.plaid.internal.Y3
    public final void a(@Nullable Throwable th2, boolean z10) {
        a(5, th2, null, new Object[0], z10);
    }

    @Override // com.plaid.internal.Y3
    public final void a(@Nullable Throwable th2, @Nullable String str, @NotNull Object[] args, boolean z10) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(6, th2, str, Arrays.copyOf(args, args.length), z10);
    }

    public final void a(int i10, String str, String str2) {
        int min;
        if (str2.length() < 4000) {
            Function3<Integer, String, String, Unit> function3 = this.f39492b;
            if (function3 != null) {
                function3.invoke(Integer.valueOf(i10), str, str2);
            }
            if (i10 == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i10, str, str2);
                return;
            }
        }
        int length = str2.length();
        int i11 = 0;
        while (i11 < length) {
            String str3 = str2;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str3, '\n', i11, false, 4, (Object) null);
            if (indexOf$default == -1) {
                indexOf$default = length;
            }
            while (true) {
                min = Math.min(indexOf$default, i11 + 4000);
                String substring = str3.substring(i11, min);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                Function3<Integer, String, String, Unit> function32 = this.f39492b;
                if (function32 != null) {
                    function32.invoke(Integer.valueOf(i10), str, substring);
                }
                if (i10 == 7) {
                    Log.wtf(str, substring);
                } else {
                    Log.println(i10, str, substring);
                }
                if (min >= indexOf$default) {
                    break;
                } else {
                    i11 = min;
                }
            }
            i11 = min + 1;
            str2 = str3;
        }
    }
}
