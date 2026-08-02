package com.usercentrics.sdk.models.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PredefinedUIData.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/usercentrics/sdk/models/settings/PredefinedUIStorageInformationServiceContent;", "Lcom/usercentrics/sdk/models/settings/PredefinedUIServiceContent;", "content", "", "button", "Lcom/usercentrics/sdk/models/settings/PredefinedUIStorageInformationButtonInfo;", "(Ljava/lang/String;Lcom/usercentrics/sdk/models/settings/PredefinedUIStorageInformationButtonInfo;)V", "getButton", "()Lcom/usercentrics/sdk/models/settings/PredefinedUIStorageInformationButtonInfo;", "getContent", "()Ljava/lang/String;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PredefinedUIStorageInformationServiceContent extends PredefinedUIServiceContent {
    private final PredefinedUIStorageInformationButtonInfo button;
    private final String content;

    public final String getContent() {
        return this.content;
    }

    public final PredefinedUIStorageInformationButtonInfo getButton() {
        return this.button;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefinedUIStorageInformationServiceContent(String content, PredefinedUIStorageInformationButtonInfo predefinedUIStorageInformationButtonInfo) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.button = predefinedUIStorageInformationButtonInfo;
    }
}
