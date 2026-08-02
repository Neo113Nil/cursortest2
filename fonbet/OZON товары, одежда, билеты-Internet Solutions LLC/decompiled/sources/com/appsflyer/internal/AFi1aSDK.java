package com.appsflyer.internal;

import Sc.r;
import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1aSDK {

    @NotNull
    final Intent AFInAppEventParameterName;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "values", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFi1aSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC7737t implements Function0 {
        private /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$valueOf = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFi1aSDK.this.AFInAppEventParameterName.getParcelableExtra(this.$valueOf);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "values", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFi1aSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<String> {
        private /* synthetic */ String $AFKeystoreWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(0);
            this.$AFKeystoreWrapper = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFi1aSDK.this.AFInAppEventParameterName.getStringExtra(this.$AFKeystoreWrapper);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "AFInAppEventType", "()Landroid/content/Intent;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFi1aSDK$4, reason: invalid class name */
    /* loaded from: classes8.dex */
    static final class AnonymousClass4 extends AbstractC7737t implements Function0<Intent> {
        private /* synthetic */ long $AFInAppEventParameterName;
        private /* synthetic */ String $AFInAppEventType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(String str, long j11) {
            super(0);
            this.$AFInAppEventType = str;
            this.$AFInAppEventParameterName = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFi1aSDK.this.AFInAppEventParameterName.putExtra(this.$AFInAppEventType, this.$AFInAppEventParameterName);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "values", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFi1aSDK$5, reason: invalid class name */
    /* loaded from: classes8.dex */
    static final class AnonymousClass5 extends AbstractC7737t implements Function0<Boolean> {
        private /* synthetic */ String $AFInAppEventParameterName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(String str) {
            super(0);
            this.$AFInAppEventParameterName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFi1aSDK.this.AFInAppEventParameterName.hasExtra(this.$AFInAppEventParameterName));
        }
    }

    public AFi1aSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.AFInAppEventParameterName = intent;
    }

    public final boolean AFInAppEventType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(str);
        StringBuilder sb2 = new StringBuilder("Error while trying to check presence of ");
        sb2.append(str);
        sb2.append(" extra from intent");
        Boolean bool = (Boolean) AFInAppEventType(anonymousClass5, sb2.toString(), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final String AFKeystoreWrapper(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str);
        StringBuilder sb2 = new StringBuilder("Error while trying to read ");
        sb2.append(str);
        sb2.append(" extra from intent");
        return (String) AFInAppEventType(anonymousClass2, sb2.toString(), null, true);
    }

    public final Intent AFInAppEventType(@NotNull String str, long j11) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(str, j11);
        StringBuilder sb2 = new StringBuilder("Error while trying to write ");
        sb2.append(str);
        sb2.append(" extra to intent");
        return (Intent) AFInAppEventType(anonymousClass4, sb2.toString(), null, true);
    }

    public final <T> T AFInAppEventType(Function0<? extends T> function0, String str, T t2, boolean z11) {
        T t11;
        Object a11;
        synchronized (this.AFInAppEventParameterName) {
            try {
                r.Companion companion = Sc.r.INSTANCE;
                t11 = function0.invoke();
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                t11 = (T) Sc.s.a(th2);
            }
            kotlin.reflect.d[] dVarArr = {N.b(ConcurrentModificationException.class), N.b(ArrayIndexOutOfBoundsException.class)};
            Throwable b11 = Sc.r.b(t11);
            if (b11 != null) {
                try {
                } catch (Throwable th3) {
                    r.Companion companion3 = Sc.r.INSTANCE;
                    a11 = Sc.s.a(th3);
                }
                if (!C7705l.m(dVarArr, N.b(b11.getClass()))) {
                    throw b11;
                }
                if (z11) {
                    a11 = AFInAppEventType(function0, str, t2, false);
                } else {
                    AFLogger.afErrorLog(str, b11, false, false);
                    a11 = t2;
                }
                t11 = a11;
            }
            kotlin.reflect.d[] dVarArr2 = {N.b(RuntimeException.class)};
            Throwable b12 = Sc.r.b(t11);
            if (b12 != null) {
                try {
                } catch (Throwable th4) {
                    r.Companion companion4 = Sc.r.INSTANCE;
                    t2 = (T) Sc.s.a(th4);
                }
                if (C7705l.m(dVarArr2, N.b(b12.getClass()))) {
                    AFLogger.afErrorLog(str, b12, false, false);
                    t11 = t2;
                } else {
                    throw b12;
                }
            }
            Sc.s.b(t11);
        }
        return (T) t11;
    }
}
