package com.unity3d.ads.core.data.datasource;

import androidx.credentials.provider.CredentialEntry;
import com.ironsource.adapters.unityads.UnityAdsConstants;
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
import org.json.JSONObject;
import xsna.brm0;
import xsna.epx;

/* compiled from: AndroidDeveloperConsentDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage publicStorage;
    private final SessionRepository sessionRepository;

    public AndroidDeveloperConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage jsonStorage, SessionRepository sessionRepository) {
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = jsonStorage;
        this.sessionRepository = sessionRepository;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(String str, boolean z) {
        DeveloperConsentOptionKt.Dsl _create = DeveloperConsentOptionKt.Dsl.Companion._create(DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder());
        _create.setType(getDeveloperConsentType(str));
        if (_create.getType() == DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            _create.setCustomType(str);
        }
        _create.setValue(getDeveloperConsentChoice(Boolean.valueOf(z)));
        return _create._build();
    }

    private final List<DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() {
        DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption;
        ArrayList arrayList = new ArrayList();
        if (this.sessionRepository.getInitializationConfiguration() != null) {
            if (UnityAds.getNonBehavioral() != null) {
                DeveloperConsentOptionKt.Dsl _create = DeveloperConsentOptionKt.Dsl.Companion._create(DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder());
                _create.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_NON_BEHAVIORAL);
                _create.setValue(getDeveloperConsentChoice(UnityAds.getNonBehavioral()));
                arrayList.add(_create._build());
            }
            if (UnityAds.getUserConsent() != null) {
                DeveloperConsentOptionKt.Dsl _create2 = DeveloperConsentOptionKt.Dsl.Companion._create(DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder());
                _create2.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_CONSENT);
                _create2.setValue(getDeveloperConsentChoice(UnityAds.getUserConsent()));
                arrayList.add(_create2._build());
            }
            if (UnityAds.getUserOptOut() != null) {
                DeveloperConsentOptionKt.Dsl _create3 = DeveloperConsentOptionKt.Dsl.Companion._create(DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder());
                _create3.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_OPT_OUT);
                _create3.setValue(getDeveloperConsentChoice(UnityAds.getUserOptOut()));
                arrayList.add(_create3._build());
                return arrayList;
            }
        } else {
            JSONObject fetchData = fetchData();
            Iterator<String> keys = fetchData.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = fetchData.get(next);
                if (obj instanceof Boolean) {
                    developerConsentOption = createDeveloperConsentOption(next, ((Boolean) obj).booleanValue());
                } else {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (brm0.w(str, "true", true) || brm0.w(str, CredentialEntry.FALSE_STRING, true)) {
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
        return this.publicStorage.getData() != null ? new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke()) : new JSONObject();
    }

    private final DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(Boolean bool) {
        return epx.f(bool, Boolean.TRUE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE : epx.f(bool, Boolean.FALSE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE : DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(String str) {
        if (str == null) {
            return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
        }
        switch (str.hashCode()) {
            case -1998919769:
                if (str.equals("user.nonbehavioral")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case -1078801183:
                if (str.equals("pipl.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                break;
            case -5454905:
                if (str.equals(UnityAdsConstants.UNITYADS_COPPA)) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case 194451659:
                if (str.equals(UnityAdsConstants.CONSENT_GDPR)) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                break;
            case 519433140:
                if (str.equals(UnityAdsConstants.CONSENT_CCPA)) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                break;
            case 2033752033:
                if (str.equals("privacy.useroveragelimit")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                break;
        }
        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
    }

    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        DeveloperConsentKt.Dsl _create = DeveloperConsentKt.Dsl.Companion._create(DeveloperConsentOuterClass.DeveloperConsent.newBuilder());
        _create.plusAssignAllOptions(_create.getOptions(), developerConsentList());
        return _create._build();
    }
}
