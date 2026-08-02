package com.appsflyer;

import Ly.RunnableC3601a;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import com.appsflyer.internal.AFg1gSDK;
import com.appsflyer.internal.AFg1hSDK;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ7\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0014J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0014J#\u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0017J#\u0010\u0018\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0017J+\u0010\u0018\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0019J3\u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u001aJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0014J!\u0010\u001c\u001a\u00020\b2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001b\"\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\b2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001b\"\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001dJ'\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!JG\u0010$\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010!J'\u0010'\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010!J'\u0010(\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010!J\u001f\u0010)\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*R\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0003X\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b,\u0010-R\u0019\u00101\u001a\u0006*\u00020/0/8\u0003X\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b0\u0010-"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1hSDK;", "<init>", "()V", "", "p0", "", "p1", "", "afInfoLog", "(Ljava/lang/String;Z)V", "afDebugLog", "", "p2", "p3", "p4", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "afWarnLog", "afVerboseLog", "(Ljava/lang/String;)V", "afRDLog", "afLogForce", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "afErrorLogForExcManagerOnly", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "", "registerClient", "([Lcom/appsflyer/internal/AFg1hSDK;)V", "unregisterClient", "Lcom/appsflyer/internal/AFg1gSDK;", "d", "(Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;Z)V", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;)V", "", "valueOf", "LSc/j;", "values", "Ljava/util/concurrent/ExecutorService;", "AFInAppEventParameterName", "AFKeystoreWrapper", "LogLevel"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFLogger extends AFg1hSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j values = k.b(AnonymousClass6.values);

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j AFKeystoreWrapper = k.b(AnonymousClass5.AFInAppEventType);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "p0", "", "values", "(Lcom/appsflyer/internal/AFg1hSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ AFg1gSDK $AFInAppEventParameterName;
        private /* synthetic */ String $AFKeystoreWrapper;
        private /* synthetic */ boolean $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AFg1gSDK aFg1gSDK, String str, boolean z11) {
            super(1);
            this.$AFInAppEventParameterName = aFg1gSDK;
            this.$AFKeystoreWrapper = str;
            this.$values = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1hSDK aFg1hSDK) {
            values(aFg1hSDK);
            return Unit.f71690a;
        }

        public final void values(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.d(this.$AFInAppEventParameterName, this.$AFKeystoreWrapper, this.$values);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "p0", "", "valueOf", "(Lcom/appsflyer/internal/AFg1hSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $AFKeystoreWrapper;
        private /* synthetic */ boolean $valueOf;
        private /* synthetic */ AFg1gSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AFg1gSDK aFg1gSDK, String str, boolean z11) {
            super(1);
            this.$values = aFg1gSDK;
            this.$AFKeystoreWrapper = str;
            this.$valueOf = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1hSDK aFg1hSDK) {
            valueOf(aFg1hSDK);
            return Unit.f71690a;
        }

        public final void valueOf(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.i(this.$values, this.$AFKeystoreWrapper, this.$valueOf);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "p0", "", "valueOf", "(Lcom/appsflyer/internal/AFg1hSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $AFInAppEventParameterName;
        private /* synthetic */ AFg1gSDK $AFInAppEventType;
        private /* synthetic */ boolean $AFKeystoreWrapper;
        private /* synthetic */ boolean $d;
        private /* synthetic */ boolean $registerClient;
        private /* synthetic */ boolean $valueOf;
        private /* synthetic */ Throwable $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AFg1gSDK aFg1gSDK, String str, Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14) {
            super(1);
            this.$AFInAppEventType = aFg1gSDK;
            this.$AFInAppEventParameterName = str;
            this.$values = th2;
            this.$AFKeystoreWrapper = z11;
            this.$valueOf = z12;
            this.$registerClient = z13;
            this.$d = z14;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1hSDK aFg1hSDK) {
            valueOf(aFg1hSDK);
            return Unit.f71690a;
        }

        public final void valueOf(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.e(this.$AFInAppEventType, this.$AFInAppEventParameterName, this.$values, this.$AFKeystoreWrapper, this.$valueOf, this.$registerClient, this.$d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "p0", "", "AFKeystoreWrapper", "(Lcom/appsflyer/internal/AFg1hSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ AFg1gSDK $AFKeystoreWrapper;
        private /* synthetic */ String $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AFg1gSDK aFg1gSDK, String str) {
            super(1);
            this.$AFKeystoreWrapper = aFg1gSDK;
            this.$values = str;
        }

        public final void AFKeystoreWrapper(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.force(this.$AFKeystoreWrapper, this.$values);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1hSDK aFg1hSDK) {
            AFKeystoreWrapper(aFg1hSDK);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFInAppEventType", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function0<ExecutorService> {
        public static final AnonymousClass5 AFInAppEventType = new AnonymousClass5();

        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00010\u0001*\f\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/appsflyer/internal/AFg1hSDK;", "", "values", "()Ljava/util/Set;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements Function0<Set<AFg1hSDK>> {
        public static final AnonymousClass6 values = new AnonymousClass6();

        AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1hSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "p0", "", "values", "(Lcom/appsflyer/internal/AFg1hSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$8, reason: invalid class name */
    static final class AnonymousClass8 extends AbstractC7737t implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $AFInAppEventParameterName;
        private /* synthetic */ AFg1gSDK $valueOf;
        private /* synthetic */ boolean $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(AFg1gSDK aFg1gSDK, String str, boolean z11) {
            super(1);
            this.$valueOf = aFg1gSDK;
            this.$AFInAppEventParameterName = str;
            this.$values = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1hSDK aFg1hSDK) {
            values(aFg1hSDK);
            return Unit.f71690a;
        }

        public final void values(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.v(this.$valueOf, this.$AFInAppEventParameterName, this.$values);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "p0", "", "values", "(Lcom/appsflyer/internal/AFg1hSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    static final class AnonymousClass9 extends AbstractC7737t implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $AFInAppEventParameterName;
        private /* synthetic */ AFg1gSDK $AFKeystoreWrapper;
        private /* synthetic */ boolean $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(AFg1gSDK aFg1gSDK, String str, boolean z11) {
            super(1);
            this.$AFKeystoreWrapper = aFg1gSDK;
            this.$AFInAppEventParameterName = str;
            this.$valueOf = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AFg1hSDK aFg1hSDK) {
            values(aFg1hSDK);
            return Unit.f71690a;
        }

        public final void values(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.w(this.$AFKeystoreWrapper, this.$AFInAppEventParameterName, this.$valueOf);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "AFInAppEventType", "I", "getLevel", "()I", "level", "p0", "<init>", "(Ljava/lang/String;II)V", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);


        /* renamed from: AFInAppEventType, reason: from kotlin metadata */
        private final int level;

        LogLevel(int i11) {
            this.level = i11;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFg1hSDK[] aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        InterfaceC4008j interfaceC4008j = values;
        Object value = interfaceC4008j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = interfaceC4008j.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(C7705l.j0(aFg1hSDKArr));
            Unit unit = Unit.f71690a;
        }
    }

    @InterfaceC3999a
    public static final void afDebugLog(@NotNull String p02, boolean p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        INSTANCE.d(AFg1gSDK.OTHER, p02, p12);
    }

    @InterfaceC3999a
    public static final void afErrorLog(@NotNull String p02, @NotNull Throwable p12, boolean p22, boolean p32, boolean p42) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        AFg1hSDK.e$default(INSTANCE, AFg1gSDK.OTHER, p02, p12, p22, p32, p42, false, 64, null);
    }

    @InterfaceC3999a
    public static final void afErrorLogForExcManagerOnly(String p02, Throwable p12) {
        AFLogger aFLogger = INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.OTHER;
        if (p02 == null || h.K(p02)) {
            p02 = "null";
        }
        String str = p02;
        if (p12 == null) {
            p12 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1gSDK, str, p12, false, false, true, false, 64, null);
    }

    @InterfaceC3999a
    public static final void afInfoLog(@NotNull String p02, boolean p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        INSTANCE.i(AFg1gSDK.OTHER, p02, p12);
    }

    @InterfaceC3999a
    public static final void afLogForce(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        INSTANCE.force(AFg1gSDK.OTHER, p02);
    }

    @InterfaceC3999a
    public static final void afRDLog(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        INSTANCE.v(AFg1gSDK.OTHER, p02, true);
    }

    @InterfaceC3999a
    public static final void afVerboseLog(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        INSTANCE.v(AFg1gSDK.OTHER, p02, false);
    }

    @InterfaceC3999a
    public static final void afWarnLog(@NotNull String p02, boolean p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        INSTANCE.w(AFg1gSDK.OTHER, p02, p12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFg1hSDK[] aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        InterfaceC4008j interfaceC4008j = values;
        Object value = interfaceC4008j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = interfaceC4008j.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            C7714v.r((Set) value2, aFg1hSDKArr);
            Unit unit = Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC4008j interfaceC4008j = values;
        Object value = interfaceC4008j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            try {
                Object value2 = interfaceC4008j.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                Iterator it = ((Set) value2).iterator();
                while (it.hasNext()) {
                    function1.invoke((AFg1hSDK) it.next());
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        ((ExecutorService) AFKeystoreWrapper.getValue()).execute(new a(new AnonymousClass1(p02, p12, p22), 0));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull AFg1gSDK p02, @NotNull String p12, @NotNull Throwable p22, boolean p32, boolean p42, boolean p52, boolean p62) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p22, "");
        ((ExecutorService) AFKeystoreWrapper.getValue()).execute(new a(new AnonymousClass3(p02, p12, p22, p32, p42, p52, p62), 0));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(@NotNull AFg1gSDK p02, @NotNull String p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        ((ExecutorService) AFKeystoreWrapper.getValue()).execute(new a(new AnonymousClass4(p02, p12), 0));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        ((ExecutorService) AFKeystoreWrapper.getValue()).execute(new a(new AnonymousClass2(p02, p12, p22), 0));
    }

    public final void registerClient(@NotNull AFg1hSDK... p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        ((ExecutorService) AFKeystoreWrapper.getValue()).execute(new RunnableC3601a(p02, 1));
    }

    public final void unregisterClient(@NotNull AFg1hSDK... p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        ((ExecutorService) AFKeystoreWrapper.getValue()).execute(new b(p02, 0));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        ((ExecutorService) AFKeystoreWrapper.getValue()).execute(new a(new AnonymousClass8(p02, p12, p22), 0));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        ((ExecutorService) AFKeystoreWrapper.getValue()).execute(new a(new AnonymousClass9(p02, p12, p22), 0));
    }

    @InterfaceC3999a
    public static final void afDebugLog(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        INSTANCE.d(AFg1gSDK.OTHER, p02, true);
    }

    @InterfaceC3999a
    public static final void afInfoLog(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        INSTANCE.i(AFg1gSDK.OTHER, p02, true);
    }

    @InterfaceC3999a
    public static final void afWarnLog(@NotNull String p02) {
        Intrinsics.checkNotNullParameter(p02, "");
        AFg1hSDK.w$default(INSTANCE, AFg1gSDK.OTHER, p02, false, 4, null);
    }

    @InterfaceC3999a
    public static final void afErrorLog(String p02, Throwable p12) {
        AFLogger aFLogger = INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.OTHER;
        if (p02 == null || h.K(p02)) {
            p02 = "null";
        }
        String str = p02;
        if (p12 == null) {
            p12 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1gSDK, str, p12, false, false, false, false, 120, null);
    }

    @InterfaceC3999a
    public static final void afErrorLogForExcManagerOnly(String p02, Throwable p12, boolean p22) {
        AFLogger aFLogger = INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.OTHER;
        if (p02 == null || h.K(p02)) {
            p02 = "null";
        }
        String str = p02;
        if (p12 == null) {
            p12 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1gSDK, str, p12, false, false, !p22, false, 64, null);
    }

    @InterfaceC3999a
    public static final void afErrorLog(String p02, Throwable p12, boolean p22) {
        AFLogger aFLogger = INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.OTHER;
        if (p02 == null || h.K(p02)) {
            p02 = "null";
        }
        String str = p02;
        if (p12 == null) {
            p12 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1gSDK, str, p12, false, p22, false, false, 104, null);
    }

    @InterfaceC3999a
    public static final void afErrorLog(String p02, Throwable p12, boolean p22, boolean p32) {
        AFLogger aFLogger = INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.OTHER;
        if (p02 == null || h.K(p02)) {
            p02 = "null";
        }
        String str = p02;
        if (p12 == null) {
            p12 = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1gSDK, str, p12, false, p22, p32, false, 72, null);
    }
}
