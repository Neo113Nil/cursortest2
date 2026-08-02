package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010;\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010B\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003Jø\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u00192\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u000eHÖ\u0001J\t\u0010I\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b,\u0010 R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b-\u0010 R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#¨\u0006J"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "", "labels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;", "buttons", "", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "bodyComponents", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/BodyComponent;", "consentVersion", "", "consentLanguage", "errorMessage", "completedModuleCount", "", "totalModuleCount", "documentTypes", "collectionMethods", "uploadFileTypes", "infoModalText", "useCaseType", ApiConstant.DOCUMENT_TYPE, "currentVerificationCount", "totalVerificationCount", "transitionScreenEnabled", "", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getBodyComponents", "()Ljava/util/List;", "getButtons", "getCollectionMethods", "getCompletedModuleCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConsentLanguage", "()Ljava/lang/String;", "getConsentVersion", "getCurrentVerificationCount", "getDocumentType", "getDocumentTypes", "getErrorMessage", "getInfoModalText", "getLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;", "getTotalModuleCount", "getTotalVerificationCount", "getTransitionScreenEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUploadFileTypes", "getUseCaseType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ModuleConfig {
    public static final int $stable = 8;
    private final List<BodyComponent> bodyComponents;
    private final List<Button> buttons;
    private final List<String> collectionMethods;
    private final Integer completedModuleCount;
    private final String consentLanguage;
    private final String consentVersion;
    private final Integer currentVerificationCount;
    private final String documentType;
    private final List<String> documentTypes;
    private final String errorMessage;
    private final String infoModalText;
    private final Labels labels;
    private final Integer totalModuleCount;
    private final Integer totalVerificationCount;
    private final Boolean transitionScreenEnabled;
    private final List<String> uploadFileTypes;
    private final String useCaseType;

    public ModuleConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ ModuleConfig copy$default(ModuleConfig moduleConfig, Labels labels, List list, List list2, String str, String str2, String str3, Integer num, Integer num2, List list3, List list4, List list5, String str4, String str5, String str6, Integer num3, Integer num4, Boolean bool, int i, Object obj) {
        Boolean bool2;
        Integer num5;
        Labels labels2;
        ModuleConfig moduleConfig2;
        Integer num6;
        List list6;
        List list7;
        String str7;
        String str8;
        String str9;
        Integer num7;
        Integer num8;
        List list8;
        List list9;
        List list10;
        String str10;
        String str11;
        String str12;
        Labels labels3 = (i & 1) != 0 ? moduleConfig.labels : labels;
        List list11 = (i & 2) != 0 ? moduleConfig.buttons : list;
        List list12 = (i & 4) != 0 ? moduleConfig.bodyComponents : list2;
        String str13 = (i & 8) != 0 ? moduleConfig.consentVersion : str;
        String str14 = (i & 16) != 0 ? moduleConfig.consentLanguage : str2;
        String str15 = (i & 32) != 0 ? moduleConfig.errorMessage : str3;
        Integer num9 = (i & 64) != 0 ? moduleConfig.completedModuleCount : num;
        Integer num10 = (i & 128) != 0 ? moduleConfig.totalModuleCount : num2;
        List list13 = (i & 256) != 0 ? moduleConfig.documentTypes : list3;
        List list14 = (i & 512) != 0 ? moduleConfig.collectionMethods : list4;
        List list15 = (i & 1024) != 0 ? moduleConfig.uploadFileTypes : list5;
        String str16 = (i & 2048) != 0 ? moduleConfig.infoModalText : str4;
        String str17 = (i & 4096) != 0 ? moduleConfig.useCaseType : str5;
        String str18 = (i & 8192) != 0 ? moduleConfig.documentType : str6;
        Labels labels4 = labels3;
        Integer num11 = (i & 16384) != 0 ? moduleConfig.currentVerificationCount : num3;
        Integer num12 = (i & 32768) != 0 ? moduleConfig.totalVerificationCount : num4;
        if ((i & 65536) != 0) {
            num5 = num12;
            bool2 = moduleConfig.transitionScreenEnabled;
            num6 = num11;
            list6 = list11;
            list7 = list12;
            str7 = str13;
            str8 = str14;
            str9 = str15;
            num7 = num9;
            num8 = num10;
            list8 = list13;
            list9 = list14;
            list10 = list15;
            str10 = str16;
            str11 = str17;
            str12 = str18;
            labels2 = labels4;
            moduleConfig2 = moduleConfig;
        } else {
            bool2 = bool;
            num5 = num12;
            labels2 = labels4;
            moduleConfig2 = moduleConfig;
            num6 = num11;
            list6 = list11;
            list7 = list12;
            str7 = str13;
            str8 = str14;
            str9 = str15;
            num7 = num9;
            num8 = num10;
            list8 = list13;
            list9 = list14;
            list10 = list15;
            str10 = str16;
            str11 = str17;
            str12 = str18;
        }
        return moduleConfig2.copy(labels2, list6, list7, str7, str8, str9, num7, num8, list8, list9, list10, str10, str11, str12, num6, num5, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final Labels getLabels() {
        return this.labels;
    }

    public final List<String> component10() {
        return this.collectionMethods;
    }

    public final List<String> component11() {
        return this.uploadFileTypes;
    }

    /* renamed from: component12, reason: from getter */
    public final String getInfoModalText() {
        return this.infoModalText;
    }

    /* renamed from: component13, reason: from getter */
    public final String getUseCaseType() {
        return this.useCaseType;
    }

    /* renamed from: component14, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getCurrentVerificationCount() {
        return this.currentVerificationCount;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getTotalVerificationCount() {
        return this.totalVerificationCount;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getTransitionScreenEnabled() {
        return this.transitionScreenEnabled;
    }

    public final List<Button> component2() {
        return this.buttons;
    }

    public final List<BodyComponent> component3() {
        return this.bodyComponents;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConsentVersion() {
        return this.consentVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConsentLanguage() {
        return this.consentLanguage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final List<String> component9() {
        return this.documentTypes;
    }

    public final ModuleConfig copy(Labels labels, List<Button> buttons, List<BodyComponent> bodyComponents, String consentVersion, String consentLanguage, String errorMessage, Integer completedModuleCount, Integer totalModuleCount, List<String> documentTypes, List<String> collectionMethods, List<String> uploadFileTypes, String infoModalText, String useCaseType, String documentType, Integer currentVerificationCount, Integer totalVerificationCount, Boolean transitionScreenEnabled) {
        return new ModuleConfig(labels, buttons, bodyComponents, consentVersion, consentLanguage, errorMessage, completedModuleCount, totalModuleCount, documentTypes, collectionMethods, uploadFileTypes, infoModalText, useCaseType, documentType, currentVerificationCount, totalVerificationCount, transitionScreenEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleConfig)) {
            return false;
        }
        ModuleConfig moduleConfig = (ModuleConfig) other;
        return Intrinsics.areEqual(this.labels, moduleConfig.labels) && Intrinsics.areEqual(this.buttons, moduleConfig.buttons) && Intrinsics.areEqual(this.bodyComponents, moduleConfig.bodyComponents) && Intrinsics.areEqual(this.consentVersion, moduleConfig.consentVersion) && Intrinsics.areEqual(this.consentLanguage, moduleConfig.consentLanguage) && Intrinsics.areEqual(this.errorMessage, moduleConfig.errorMessage) && Intrinsics.areEqual(this.completedModuleCount, moduleConfig.completedModuleCount) && Intrinsics.areEqual(this.totalModuleCount, moduleConfig.totalModuleCount) && Intrinsics.areEqual(this.documentTypes, moduleConfig.documentTypes) && Intrinsics.areEqual(this.collectionMethods, moduleConfig.collectionMethods) && Intrinsics.areEqual(this.uploadFileTypes, moduleConfig.uploadFileTypes) && Intrinsics.areEqual(this.infoModalText, moduleConfig.infoModalText) && Intrinsics.areEqual(this.useCaseType, moduleConfig.useCaseType) && Intrinsics.areEqual(this.documentType, moduleConfig.documentType) && Intrinsics.areEqual(this.currentVerificationCount, moduleConfig.currentVerificationCount) && Intrinsics.areEqual(this.totalVerificationCount, moduleConfig.totalVerificationCount) && Intrinsics.areEqual(this.transitionScreenEnabled, moduleConfig.transitionScreenEnabled);
    }

    public int hashCode() {
        Labels labels = this.labels;
        int hashCode = (labels == null ? 0 : labels.hashCode()) * 31;
        List<Button> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BodyComponent> list2 = this.bodyComponents;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.consentVersion;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consentLanguage;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.completedModuleCount;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalModuleCount;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list3 = this.documentTypes;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.collectionMethods;
        int hashCode10 = (hashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.uploadFileTypes;
        int hashCode11 = (hashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str4 = this.infoModalText;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.useCaseType;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.documentType;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.currentVerificationCount;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalVerificationCount;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.transitionScreenEnabled;
        return hashCode16 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ModuleConfig(labels=" + this.labels + ", buttons=" + this.buttons + ", bodyComponents=" + this.bodyComponents + ", consentVersion=" + this.consentVersion + ", consentLanguage=" + this.consentLanguage + ", errorMessage=" + this.errorMessage + ", completedModuleCount=" + this.completedModuleCount + ", totalModuleCount=" + this.totalModuleCount + ", documentTypes=" + this.documentTypes + ", collectionMethods=" + this.collectionMethods + ", uploadFileTypes=" + this.uploadFileTypes + ", infoModalText=" + this.infoModalText + ", useCaseType=" + this.useCaseType + ", documentType=" + this.documentType + ", currentVerificationCount=" + this.currentVerificationCount + ", totalVerificationCount=" + this.totalVerificationCount + ", transitionScreenEnabled=" + this.transitionScreenEnabled + ")";
    }

    public ModuleConfig(Labels labels, List<Button> list, List<BodyComponent> list2, String str, String str2, String str3, Integer num, Integer num2, List<String> list3, List<String> list4, List<String> list5, String str4, String str5, String str6, Integer num3, Integer num4, Boolean bool) {
        this.labels = labels;
        this.buttons = list;
        this.bodyComponents = list2;
        this.consentVersion = str;
        this.consentLanguage = str2;
        this.errorMessage = str3;
        this.completedModuleCount = num;
        this.totalModuleCount = num2;
        this.documentTypes = list3;
        this.collectionMethods = list4;
        this.uploadFileTypes = list5;
        this.infoModalText = str4;
        this.useCaseType = str5;
        this.documentType = str6;
        this.currentVerificationCount = num3;
        this.totalVerificationCount = num4;
        this.transitionScreenEnabled = bool;
    }

    public /* synthetic */ ModuleConfig(Labels labels, List list, List list2, String str, String str2, String str3, Integer num, Integer num2, List list3, List list4, List list5, String str4, String str5, String str6, Integer num3, Integer num4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : labels, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : list4, (i & 1024) != 0 ? null : list5, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : num3, (i & 32768) != 0 ? null : num4, (i & 65536) != 0 ? null : bool);
    }

    public final Labels getLabels() {
        return this.labels;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final List<BodyComponent> getBodyComponents() {
        return this.bodyComponents;
    }

    public final String getConsentVersion() {
        return this.consentVersion;
    }

    public final String getConsentLanguage() {
        return this.consentLanguage;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Integer getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    public final Integer getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final List<String> getDocumentTypes() {
        return this.documentTypes;
    }

    public final List<String> getCollectionMethods() {
        return this.collectionMethods;
    }

    public final List<String> getUploadFileTypes() {
        return this.uploadFileTypes;
    }

    public final String getInfoModalText() {
        return this.infoModalText;
    }

    public final String getUseCaseType() {
        return this.useCaseType;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final Integer getCurrentVerificationCount() {
        return this.currentVerificationCount;
    }

    public final Integer getTotalVerificationCount() {
        return this.totalVerificationCount;
    }

    public final Boolean getTransitionScreenEnabled() {
        return this.transitionScreenEnabled;
    }
}
