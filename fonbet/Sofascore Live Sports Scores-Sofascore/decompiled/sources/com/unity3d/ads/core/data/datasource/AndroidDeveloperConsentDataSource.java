package com.unity3d.ads.core.data.datasource;

import com.ironsource.U3;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002J\u0017\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDeveloperConsentDataSource;", "Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;", "flattenerRulesUseCase", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "publicStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;Lcom/unity3d/services/core/misc/JsonStorage;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "developerConsent", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "developerConsentList", "", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentOption;", "createDeveloperConsentOption", U3.i.W, "", U3.i.X, "", "fetchData", "Lorg/json/JSONObject;", "getDeveloperConsentType", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentType;", "type", "getDeveloperConsentChoice", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "choice", "(Ljava/lang/Boolean;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsentChoice;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {

    @NotNull
    private final FlattenerRulesUseCase flattenerRulesUseCase;

    @NotNull
    private final JsonStorage publicStorage;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidDeveloperConsentDataSource(@NotNull FlattenerRulesUseCase flattenerRulesUseCase, @NotNull JsonStorage jsonStorage, @NotNull SessionRepository sessionRepository) {
        flattenerRulesUseCase.getClass();
        jsonStorage.getClass();
        sessionRepository.getClass();
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = jsonStorage;
        this.sessionRepository = sessionRepository;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(String key, boolean value) {
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.INSTANCE;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        newBuilder.getClass();
        DeveloperConsentOptionKt.Dsl _create = companion._create(newBuilder);
        _create.setType(getDeveloperConsentType(key));
        if (_create.getType() == DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            _create.setCustomType(key);
        }
        _create.setValue(getDeveloperConsentChoice(Boolean.valueOf(value)));
        return _create._build();
    }

    private final List<DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() {
        DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption;
        ArrayList arrayList = new ArrayList();
        if (this.sessionRepository.getInitializationConfiguration() != null) {
            if (UnityAds.getNonBehavioral() != null) {
                DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.INSTANCE;
                DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
                newBuilder.getClass();
                DeveloperConsentOptionKt.Dsl _create = companion._create(newBuilder);
                _create.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_NON_BEHAVIORAL);
                _create.setValue(getDeveloperConsentChoice(UnityAds.getNonBehavioral()));
                arrayList.add(_create._build());
            }
            if (UnityAds.getUserConsent() != null) {
                DeveloperConsentOptionKt.Dsl.Companion companion2 = DeveloperConsentOptionKt.Dsl.INSTANCE;
                DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder2 = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
                newBuilder2.getClass();
                DeveloperConsentOptionKt.Dsl _create2 = companion2._create(newBuilder2);
                _create2.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_CONSENT);
                _create2.setValue(getDeveloperConsentChoice(UnityAds.getUserConsent()));
                arrayList.add(_create2._build());
            }
            if (UnityAds.getUserOptOut() != null) {
                DeveloperConsentOptionKt.Dsl.Companion companion3 = DeveloperConsentOptionKt.Dsl.INSTANCE;
                DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder3 = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
                newBuilder3.getClass();
                DeveloperConsentOptionKt.Dsl _create3 = companion3._create(newBuilder3);
                _create3.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_OPT_OUT);
                _create3.setValue(getDeveloperConsentChoice(UnityAds.getUserOptOut()));
                arrayList.add(_create3._build());
                return arrayList;
            }
        } else {
            JSONObject fetchData = fetchData();
            Iterator<String> keys = fetchData.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = fetchData.get(next);
                if (obj instanceof Boolean) {
                    next.getClass();
                    developerConsentOption = createDeveloperConsentOption(next, ((Boolean) obj).booleanValue());
                } else {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
                            next.getClass();
                            developerConsentOption = createDeveloperConsentOption(next, Boolean.parseBoolean(str));
                        }
                    }
                    developerConsentOption = null;
                }
                if (developerConsentOption != null) {
                    arrayList.add(developerConsentOption);
                }
            }
        }
        return arrayList;
    }

    private final JSONObject fetchData() {
        if (this.publicStorage.getData() == null) {
            return new JSONObject();
        }
        JSONObject flattenJson = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
        flattenJson.getClass();
        return flattenJson;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(Boolean choice) {
        return Intrinsics.c(choice, Boolean.TRUE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE : Intrinsics.c(choice, Boolean.FALSE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE : DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(String type) {
        if (type == null) {
            return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
        }
        switch (type.hashCode()) {
            case -1998919769:
                if (type.equals("user.nonbehavioral")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case -1078801183:
                if (type.equals("pipl.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                break;
            case -5454905:
                if (type.equals("user.nonBehavioral")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case 194451659:
                if (type.equals("gdpr.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                break;
            case 519433140:
                if (type.equals("privacy.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                break;
            case 2033752033:
                if (type.equals("privacy.useroveragelimit")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                break;
        }
        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
    }

    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    @NotNull
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.INSTANCE;
        DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        newBuilder.getClass();
        DeveloperConsentKt.Dsl _create = companion._create(newBuilder);
        _create.addAllOptions(_create.getOptions(), developerConsentList());
        return _create._build();
    }
}
