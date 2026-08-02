package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SocureMultiStepScreen.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/TertiaryTextData;", "", "fullText", "", "annotatedText", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnnotatedText", "()Ljava/lang/String;", "getFullText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TertiaryTextData {
    public static final int $stable = 0;
    private final String annotatedText;
    private final String fullText;

    public static /* synthetic */ TertiaryTextData copy$default(TertiaryTextData tertiaryTextData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tertiaryTextData.fullText;
        }
        if ((i & 2) != 0) {
            str2 = tertiaryTextData.annotatedText;
        }
        return tertiaryTextData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFullText() {
        return this.fullText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnnotatedText() {
        return this.annotatedText;
    }

    public final TertiaryTextData copy(String fullText, String annotatedText) {
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        return new TertiaryTextData(fullText, annotatedText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TertiaryTextData)) {
            return false;
        }
        TertiaryTextData tertiaryTextData = (TertiaryTextData) other;
        return Intrinsics.areEqual(this.fullText, tertiaryTextData.fullText) && Intrinsics.areEqual(this.annotatedText, tertiaryTextData.annotatedText);
    }

    public int hashCode() {
        int hashCode = this.fullText.hashCode() * 31;
        String str = this.annotatedText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TertiaryTextData(fullText=" + this.fullText + ", annotatedText=" + this.annotatedText + ")";
    }

    public TertiaryTextData(String fullText, String str) {
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        this.fullText = fullText;
        this.annotatedText = str;
    }

    public /* synthetic */ TertiaryTextData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getFullText() {
        return this.fullText;
    }

    public final String getAnnotatedText() {
        return this.annotatedText;
    }
}
