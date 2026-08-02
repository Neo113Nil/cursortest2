package com.socure.docv.capturesdk.common.network.model.stepup;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateStatusRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\r\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J_\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001d\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)H\u0000¢\u0006\u0002\b*J\t\u0010+\u001a\u00020,HÖ\u0001J\r\u0010-\u001a\u00020\u0003H\u0000¢\u0006\u0002\b.J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u00060"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/Consent;", "", "version", "", "language", "title", "btnLabelAgree", "btnLabelDecline", "warningMsg", "warningBtnLabel", "components", "", "Lcom/socure/docv/capturesdk/common/network/model/stepup/ConsentComponent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBtnLabelAgree", "()Ljava/lang/String;", "getBtnLabelDecline", "getComponents", "()Ljava/util/List;", "getLanguage", "getTitle", "getVersion", "getWarningBtnLabel", "getWarningMsg", "allChecked", "", "allChecked$capturesdk_productionRelease", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "getSelection", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Selection;", "Lkotlin/collections/ArrayList;", "getSelection$capturesdk_productionRelease", "hashCode", "", "selectedArray", "selectedArray$capturesdk_productionRelease", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Consent {
    public static final int $stable = 8;
    private final String btnLabelAgree;
    private final String btnLabelDecline;
    private final List<ConsentComponent> components;
    private final String language;
    private final String title;
    private final String version;
    private final String warningBtnLabel;
    private final String warningMsg;

    public static /* synthetic */ Consent copy$default(Consent consent, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consent.version;
        }
        if ((i & 2) != 0) {
            str2 = consent.language;
        }
        if ((i & 4) != 0) {
            str3 = consent.title;
        }
        if ((i & 8) != 0) {
            str4 = consent.btnLabelAgree;
        }
        if ((i & 16) != 0) {
            str5 = consent.btnLabelDecline;
        }
        if ((i & 32) != 0) {
            str6 = consent.warningMsg;
        }
        if ((i & 64) != 0) {
            str7 = consent.warningBtnLabel;
        }
        if ((i & 128) != 0) {
            list = consent.components;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str5;
        String str10 = str6;
        return consent.copy(str, str2, str3, str4, str9, str10, str8, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBtnLabelAgree() {
        return this.btnLabelAgree;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBtnLabelDecline() {
        return this.btnLabelDecline;
    }

    /* renamed from: component6, reason: from getter */
    public final String getWarningMsg() {
        return this.warningMsg;
    }

    /* renamed from: component7, reason: from getter */
    public final String getWarningBtnLabel() {
        return this.warningBtnLabel;
    }

    public final List<ConsentComponent> component8() {
        return this.components;
    }

    public final Consent copy(String version, String language, String title, @Json(name = "agree_btn_label") String btnLabelAgree, @Json(name = "decline_btn_label") String btnLabelDecline, @Json(name = "mandatory_field_warning_msg") String warningMsg, @Json(name = "mandatory_field_warning_close_label") String warningBtnLabel, List<ConsentComponent> components) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(btnLabelAgree, "btnLabelAgree");
        Intrinsics.checkNotNullParameter(btnLabelDecline, "btnLabelDecline");
        Intrinsics.checkNotNullParameter(warningMsg, "warningMsg");
        Intrinsics.checkNotNullParameter(warningBtnLabel, "warningBtnLabel");
        Intrinsics.checkNotNullParameter(components, "components");
        return new Consent(version, language, title, btnLabelAgree, btnLabelDecline, warningMsg, warningBtnLabel, components);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Consent)) {
            return false;
        }
        Consent consent = (Consent) other;
        return Intrinsics.areEqual(this.version, consent.version) && Intrinsics.areEqual(this.language, consent.language) && Intrinsics.areEqual(this.title, consent.title) && Intrinsics.areEqual(this.btnLabelAgree, consent.btnLabelAgree) && Intrinsics.areEqual(this.btnLabelDecline, consent.btnLabelDecline) && Intrinsics.areEqual(this.warningMsg, consent.warningMsg) && Intrinsics.areEqual(this.warningBtnLabel, consent.warningBtnLabel) && Intrinsics.areEqual(this.components, consent.components);
    }

    public int hashCode() {
        return (((((((((((((this.version.hashCode() * 31) + this.language.hashCode()) * 31) + this.title.hashCode()) * 31) + this.btnLabelAgree.hashCode()) * 31) + this.btnLabelDecline.hashCode()) * 31) + this.warningMsg.hashCode()) * 31) + this.warningBtnLabel.hashCode()) * 31) + this.components.hashCode();
    }

    public String toString() {
        return "Consent(version=" + this.version + ", language=" + this.language + ", title=" + this.title + ", btnLabelAgree=" + this.btnLabelAgree + ", btnLabelDecline=" + this.btnLabelDecline + ", warningMsg=" + this.warningMsg + ", warningBtnLabel=" + this.warningBtnLabel + ", components=" + this.components + ")";
    }

    public Consent(String version, String language, String title, @Json(name = "agree_btn_label") String btnLabelAgree, @Json(name = "decline_btn_label") String btnLabelDecline, @Json(name = "mandatory_field_warning_msg") String warningMsg, @Json(name = "mandatory_field_warning_close_label") String warningBtnLabel, List<ConsentComponent> components) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(btnLabelAgree, "btnLabelAgree");
        Intrinsics.checkNotNullParameter(btnLabelDecline, "btnLabelDecline");
        Intrinsics.checkNotNullParameter(warningMsg, "warningMsg");
        Intrinsics.checkNotNullParameter(warningBtnLabel, "warningBtnLabel");
        Intrinsics.checkNotNullParameter(components, "components");
        this.version = version;
        this.language = language;
        this.title = title;
        this.btnLabelAgree = btnLabelAgree;
        this.btnLabelDecline = btnLabelDecline;
        this.warningMsg = warningMsg;
        this.warningBtnLabel = warningBtnLabel;
        this.components = components;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBtnLabelAgree() {
        return this.btnLabelAgree;
    }

    public final String getBtnLabelDecline() {
        return this.btnLabelDecline;
    }

    public final String getWarningMsg() {
        return this.warningMsg;
    }

    public final String getWarningBtnLabel() {
        return this.warningBtnLabel;
    }

    public final List<ConsentComponent> getComponents() {
        return this.components;
    }

    public final boolean allChecked$capturesdk_productionRelease() {
        List<ConsentComponent> list = this.components;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ConsentComponent consentComponent : list) {
            if (Intrinsics.areEqual((Object) consentComponent.getMandatory(), (Object) true) && !Intrinsics.areEqual((Object) consentComponent.getSelected(), (Object) true)) {
                return false;
            }
        }
        return true;
    }

    public final String selectedArray$capturesdk_productionRelease() {
        StringBuilder sb = new StringBuilder();
        List<ConsentComponent> list = this.components;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((ConsentComponent) obj).getType(), Content.CHECKBOX.getLabel())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(Intrinsics.areEqual((Object) ((ConsentComponent) it.next()).getSelected(), (Object) true) ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public final ArrayList<Selection> getSelection$capturesdk_productionRelease() {
        ArrayList<Selection> arrayList = new ArrayList<>();
        List<ConsentComponent> list = this.components;
        ArrayList<ConsentComponent> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((ConsentComponent) obj).getType(), Content.CHECKBOX.getLabel())) {
                arrayList2.add(obj);
            }
        }
        for (ConsentComponent consentComponent : arrayList2) {
            String id = consentComponent.getId();
            Boolean selected = consentComponent.getSelected();
            if (((id == null || selected == null) ? null : Boolean.valueOf(arrayList.add(new Selection(id, selected.booleanValue())))) == null) {
                LoggerKt.logE$default("SDLT_USR", "id or selected is null in checkbox. ERROR!!", null, 4, null);
                Unit unit = Unit.INSTANCE;
            }
        }
        return arrayList;
    }
}
