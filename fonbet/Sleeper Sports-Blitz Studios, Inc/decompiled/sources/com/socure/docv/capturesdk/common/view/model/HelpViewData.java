package com.socure.docv.capturesdk.common.view.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BsViewData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/common/view/model/HelpViewData;", "", "title", "Lcom/socure/docv/capturesdk/common/view/model/TextLabel;", "imageResId", "", "instructionList", "", "", "instrTextColor", "continueButton", "Lcom/socure/docv/capturesdk/common/view/model/Button;", "(Lcom/socure/docv/capturesdk/common/view/model/TextLabel;ILjava/util/List;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/view/model/Button;)V", "getContinueButton", "()Lcom/socure/docv/capturesdk/common/view/model/Button;", "getImageResId", "()I", "getInstrTextColor", "()Ljava/lang/String;", "getInstructionList", "()Ljava/util/List;", "getTitle", "()Lcom/socure/docv/capturesdk/common/view/model/TextLabel;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HelpViewData {
    public static final int $stable = 8;
    private final Button continueButton;
    private final int imageResId;
    private final String instrTextColor;
    private final List<String> instructionList;
    private final TextLabel title;

    public static /* synthetic */ HelpViewData copy$default(HelpViewData helpViewData, TextLabel textLabel, int i, List list, String str, Button button, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textLabel = helpViewData.title;
        }
        if ((i2 & 2) != 0) {
            i = helpViewData.imageResId;
        }
        if ((i2 & 4) != 0) {
            list = helpViewData.instructionList;
        }
        if ((i2 & 8) != 0) {
            str = helpViewData.instrTextColor;
        }
        if ((i2 & 16) != 0) {
            button = helpViewData.continueButton;
        }
        Button button2 = button;
        List list2 = list;
        return helpViewData.copy(textLabel, i, list2, str, button2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextLabel getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getImageResId() {
        return this.imageResId;
    }

    public final List<String> component3() {
        return this.instructionList;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInstrTextColor() {
        return this.instrTextColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Button getContinueButton() {
        return this.continueButton;
    }

    public final HelpViewData copy(TextLabel title, int imageResId, List<String> instructionList, String instrTextColor, Button continueButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(instructionList, "instructionList");
        Intrinsics.checkNotNullParameter(instrTextColor, "instrTextColor");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        return new HelpViewData(title, imageResId, instructionList, instrTextColor, continueButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpViewData)) {
            return false;
        }
        HelpViewData helpViewData = (HelpViewData) other;
        return Intrinsics.areEqual(this.title, helpViewData.title) && this.imageResId == helpViewData.imageResId && Intrinsics.areEqual(this.instructionList, helpViewData.instructionList) && Intrinsics.areEqual(this.instrTextColor, helpViewData.instrTextColor) && Intrinsics.areEqual(this.continueButton, helpViewData.continueButton);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + Integer.hashCode(this.imageResId)) * 31) + this.instructionList.hashCode()) * 31) + this.instrTextColor.hashCode()) * 31) + this.continueButton.hashCode();
    }

    public String toString() {
        return "HelpViewData(title=" + this.title + ", imageResId=" + this.imageResId + ", instructionList=" + this.instructionList + ", instrTextColor=" + this.instrTextColor + ", continueButton=" + this.continueButton + ")";
    }

    public HelpViewData(TextLabel title, int i, List<String> instructionList, String instrTextColor, Button continueButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(instructionList, "instructionList");
        Intrinsics.checkNotNullParameter(instrTextColor, "instrTextColor");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        this.title = title;
        this.imageResId = i;
        this.instructionList = instructionList;
        this.instrTextColor = instrTextColor;
        this.continueButton = continueButton;
    }

    public final Button getContinueButton() {
        return this.continueButton;
    }

    public final int getImageResId() {
        return this.imageResId;
    }

    public final String getInstrTextColor() {
        return this.instrTextColor;
    }

    public final List<String> getInstructionList() {
        return this.instructionList;
    }

    public final TextLabel getTitle() {
        return this.title;
    }
}
