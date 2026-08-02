package com.unity3d.services.core.device.reader.pii;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonBehavioralFlag.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "TRUE", "FALSE", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: NonBehavioralFlag.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag$Companion;", "", "()V", "fromString", "Lcom/unity3d/services/core/device/reader/pii/NonBehavioralFlag;", "value", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NonBehavioralFlag fromString(String value) {
            Object m11180constructorimpl;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                String upperCase = value.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                m11180constructorimpl = Result.m11180constructorimpl(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                m11180constructorimpl = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) m11180constructorimpl;
        }
    }
}
