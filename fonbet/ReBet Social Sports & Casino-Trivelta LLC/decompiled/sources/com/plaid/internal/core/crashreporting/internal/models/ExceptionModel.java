package com.plaid.internal.core.crashreporting.internal.models;

import com.plaid.internal.C3783x;
import com.plaid.internal.core.crashreporting.internal.models.StackTraceElement;
import com.twilio.voice.EventKeys;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "Ljava/io/Serializable;", "throwable", "", "(Ljava/lang/Throwable;)V", "module", "", "stacktrace", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceInterface;", "type", EventKeys.VALUE_KEY, "equals", "", "other", "", "hashCode", "", "toString", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExceptionModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionModel.kt\ncom/plaid/internal/core/crashreporting/internal/models/ExceptionModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
/* loaded from: classes3.dex */
public final class ExceptionModel implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEFAULT_PACKAGE_NAME = "(default)";

    @Nullable
    private final String module;

    /* renamed from: stacktrace, reason: from kotlin metadata and from toString */
    @NotNull
    private final StackTraceInterface stackTraceInterface;

    @NotNull
    private final String type;

    @Nullable
    private final String value;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel$Companion;", "", "()V", "DEFAULT_PACKAGE_NAME", "", "extractExceptionQueue", "Ljava/util/Queue;", "Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "throwable", "", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Queue<ExceptionModel> extractExceptionQueue(@Nullable Throwable throwable) {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            Throwable th2 = throwable;
            while (th2 != null && hashSet.add(th2)) {
                linkedList.add(new ExceptionModel(th2));
                th2 = throwable != null ? throwable.getCause() : null;
            }
            return linkedList;
        }

        private Companion() {
        }
    }

    public ExceptionModel(@NotNull Throwable throwable) {
        String str;
        java.lang.StackTraceElement[] stackTrace;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Package r02 = throwable.getClass().getPackage();
        String name = throwable.getClass().getName();
        this.value = throwable.getMessage();
        if (r02 != null) {
            Intrinsics.checkNotNull(name);
            name = StringsKt.replace$default(name, r02.getName() + ".", "", false, 4, (Object) null);
        } else {
            Intrinsics.checkNotNull(name);
        }
        this.type = name;
        String canonicalName = throwable.getClass().getCanonicalName();
        if (canonicalName != null) {
            str = StringsKt.removeSuffix(canonicalName, (CharSequence) ("." + throwable.getClass().getSimpleName()));
        } else {
            str = null;
        }
        this.module = str;
        try {
            stackTrace = throwable.getStackTrace();
            Intrinsics.checkNotNull(stackTrace);
            ArraysKt.reverse(stackTrace);
        } catch (NullPointerException e10) {
            stackTrace = e10.getStackTrace();
        }
        StackTraceElement.Companion companion = StackTraceElement.INSTANCE;
        Intrinsics.checkNotNull(stackTrace);
        this.stackTraceInterface = new StackTraceInterface(companion.fromStackTraceElements(stackTrace));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(ExceptionModel.class, other.getClass())) {
            return false;
        }
        ExceptionModel exceptionModel = (ExceptionModel) other;
        if (!Intrinsics.areEqual(this.type, exceptionModel.type)) {
            return false;
        }
        String str = this.value;
        if (str == null ? exceptionModel.value != null : !Intrinsics.areEqual(str, exceptionModel.value)) {
            return false;
        }
        String str2 = this.module;
        if (str2 == null ? exceptionModel.module == null : Intrinsics.areEqual(str2, exceptionModel.module)) {
            return Intrinsics.areEqual(this.stackTraceInterface, exceptionModel.stackTraceInterface);
        }
        return false;
    }

    public int hashCode() {
        String str = this.value;
        int a10 = C3783x.a(this.type, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.module;
        return a10 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SentryException{value='" + this.value + "', type='" + this.type + "', module='" + this.module + "', stackTraceInterface=" + this.stackTraceInterface + "}";
    }
}
