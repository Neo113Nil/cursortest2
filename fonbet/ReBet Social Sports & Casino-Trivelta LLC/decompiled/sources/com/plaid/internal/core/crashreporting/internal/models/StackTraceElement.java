package com.plaid.internal.core.crashreporting.internal.models;

import com.plaid.BuildConfig;
import com.plaid.internal.C3556a6;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "", "module", "", "function", "filename", "lineno", "", "in_app", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)V", "Ljava/lang/Boolean;", "equals", "other", "hashCode", "toString", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackTraceElement {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String filename;

    @NotNull
    private final String function;

    @Nullable
    private final Boolean in_app;
    private final int lineno;

    @NotNull
    private final String module;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement$Companion;", "", "()V", "fromStackTraceElement", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "stackTraceElement", "Ljava/lang/StackTraceElement;", "fromStackTraceElements", "", "stackTraceElements", "([Ljava/lang/StackTraceElement;)[Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStackTraceElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceElement.kt\ncom/plaid/internal/core/crashreporting/internal/models/StackTraceElement$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,104:1\n37#2,2:105\n*S KotlinDebug\n*F\n+ 1 StackTraceElement.kt\ncom/plaid/internal/core/crashreporting/internal/models/StackTraceElement$Companion\n*L\n48#1:105,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final StackTraceElement fromStackTraceElement(java.lang.StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            String methodName = stackTraceElement.getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "getMethodName(...)");
            String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            String className2 = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            return new StackTraceElement(className, methodName, fileName, lineNumber, Boolean.valueOf(StringsKt.contains$default((CharSequence) className2, (CharSequence) BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)));
        }

        @NotNull
        public final StackTraceElement[] fromStackTraceElements(@NotNull java.lang.StackTraceElement[] stackTraceElements) {
            Intrinsics.checkNotNullParameter(stackTraceElements, "stackTraceElements");
            ArrayList arrayList = new ArrayList(stackTraceElements.length);
            C3556a6.a.c(C3556a6.f39823a, "Sentry stack trace elements size:  " + arrayList.size());
            int length = stackTraceElements.length;
            for (int i10 = 0; i10 < length; i10++) {
                java.lang.StackTraceElement stackTraceElement = stackTraceElements[i10];
                if (stackTraceElement != null) {
                    arrayList.add(fromStackTraceElement(stackTraceElement));
                }
            }
            return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
        }

        private Companion() {
        }
    }

    public StackTraceElement(@NotNull String module, @NotNull String function, @Nullable String str, int i10, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(function, "function");
        this.module = module;
        this.function = function;
        this.filename = str;
        this.lineno = i10;
        this.in_app = bool;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(StackTraceElement.class, other.getClass())) {
            StackTraceElement stackTraceElement = (StackTraceElement) other;
            if (this.lineno == stackTraceElement.lineno && Intrinsics.areEqual(this.module, stackTraceElement.module) && Intrinsics.areEqual(this.function, stackTraceElement.function) && Intrinsics.areEqual(this.filename, stackTraceElement.filename) && Intrinsics.areEqual(this.in_app, stackTraceElement.in_app)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.module, this.function, this.filename, Integer.valueOf(this.lineno));
    }

    @NotNull
    public String toString() {
        return "SentryStackTraceElement{module='" + this.module + "', function='" + this.function + "', filename='" + this.filename + "', lineno=" + this.lineno + ", in_app=" + this.in_app + "}";
    }

    public /* synthetic */ StackTraceElement(String str, String str2, String str3, int i10, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i10, (i11 & 16) != 0 ? Boolean.FALSE : bool);
    }
}
