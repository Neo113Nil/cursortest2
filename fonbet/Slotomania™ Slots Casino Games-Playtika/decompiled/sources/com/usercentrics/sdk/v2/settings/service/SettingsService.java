package com.usercentrics.sdk.v2.settings.service;

import androidx.core.app.NotificationCompat;
import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.v2.settings.data.BasicConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.ConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.NewSettingsData;
import com.usercentrics.sdk.v2.settings.data.ServiceConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.SubConsentTemplate;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCategory;
import com.usercentrics.sdk.v2.settings.data.UsercentricsService;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.settings.repository.IAggregatorRepository;
import com.usercentrics.sdk.v2.settings.repository.ISettingsRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SettingsService.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ>\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J8\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\t\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0082@¢\u0006\u0002\u0010$J\u0016\u0010\u000b\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0082@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020)2\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010'J$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010H\u0002J\u0010\u0010,\u001a\u00020!2\u0006\u0010\t\u001a\u00020!H\u0002J6\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0010\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\t\u001a\u00020!2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002J \u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/service/SettingsService;", "Lcom/usercentrics/sdk/v2/settings/service/ISettingsService;", "settingsRepository", "Lcom/usercentrics/sdk/v2/settings/repository/ISettingsRepository;", "aggregatorRepository", "Lcom/usercentrics/sdk/v2/settings/repository/IAggregatorRepository;", "cacheBypassResolver", "Lcom/usercentrics/sdk/v2/settings/service/ICacheBypassResolver;", "(Lcom/usercentrics/sdk/v2/settings/repository/ISettingsRepository;Lcom/usercentrics/sdk/v2/settings/repository/IAggregatorRepository;Lcom/usercentrics/sdk/v2/settings/service/ICacheBypassResolver;)V", "settings", "Lcom/usercentrics/sdk/v2/settings/data/NewSettingsData;", "getSettings", "()Lcom/usercentrics/sdk/v2/settings/data/NewSettingsData;", "setSettings", "(Lcom/usercentrics/sdk/v2/settings/data/NewSettingsData;)V", "aggregateServicesByCategory", "", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;", "consentTemplates", "Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;", "aggregatorServices", "categoriesByCategoriesSlugsMap", "", "", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "basicConsentTemplate", "Lcom/usercentrics/sdk/v2/settings/data/BasicConsentTemplate;", NotificationCompat.CATEGORY_SERVICE, "Lcom/usercentrics/sdk/v2/settings/data/ConsentTemplate;", "getServices", "Lkotlin/Pair;", "", "jsonFileLanguage", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "bypassCache", "", "(Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settingsInitializationParameters", "Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;", "(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSettings", "", "mapCategoriesByCategorySlug", "categories", "removeDeactivatedServices", "servicesAndSubServicesFromSettings", "categoriesMap", "updateService", "aggregatorService", "consentTemplate", "category", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SettingsService implements ISettingsService {
    private final IAggregatorRepository aggregatorRepository;
    private final ICacheBypassResolver cacheBypassResolver;
    private NewSettingsData settings;
    private final ISettingsRepository settingsRepository;

    public SettingsService(ISettingsRepository settingsRepository, IAggregatorRepository aggregatorRepository, ICacheBypassResolver cacheBypassResolver) {
        Intrinsics.checkNotNullParameter(settingsRepository, "settingsRepository");
        Intrinsics.checkNotNullParameter(aggregatorRepository, "aggregatorRepository");
        Intrinsics.checkNotNullParameter(cacheBypassResolver, "cacheBypassResolver");
        this.settingsRepository = settingsRepository;
        this.aggregatorRepository = aggregatorRepository;
        this.cacheBypassResolver = cacheBypassResolver;
    }

    @Override // com.usercentrics.sdk.v2.settings.service.ISettingsService
    public NewSettingsData getSettings() {
        return this.settings;
    }

    public void setSettings(NewSettingsData newSettingsData) {
        this.settings = newSettingsData;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.usercentrics.sdk.v2.settings.service.ISettingsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadSettings(SettingsInitializationParameters settingsInitializationParameters, Continuation<? super Unit> continuation) {
        SettingsService$loadSettings$1 settingsService$loadSettings$1;
        Object coroutine_suspended;
        int i;
        SettingsService settingsService;
        Object services;
        UsercentricsSettings usercentricsSettings;
        SettingsService settingsService2;
        if (continuation instanceof SettingsService$loadSettings$1) {
            settingsService$loadSettings$1 = (SettingsService$loadSettings$1) continuation;
            if ((settingsService$loadSettings$1.label & Integer.MIN_VALUE) != 0) {
                settingsService$loadSettings$1.label -= Integer.MIN_VALUE;
                Object obj = settingsService$loadSettings$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsService$loadSettings$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    settingsService$loadSettings$1.L$0 = this;
                    settingsService$loadSettings$1.L$1 = settingsInitializationParameters;
                    settingsService$loadSettings$1.label = 1;
                    obj = getSettings(settingsInitializationParameters, settingsService$loadSettings$1);
                    if (obj != coroutine_suspended) {
                        settingsService = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    usercentricsSettings = (UsercentricsSettings) settingsService$loadSettings$1.L$1;
                    settingsService2 = (SettingsService) settingsService$loadSettings$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) obj;
                    settingsService2.setSettings(new NewSettingsData(usercentricsSettings, (List) pair.getFirst(), ((Number) pair.getSecond()).intValue()));
                    return Unit.INSTANCE;
                }
                settingsInitializationParameters = (SettingsInitializationParameters) settingsService$loadSettings$1.L$1;
                settingsService = (SettingsService) settingsService$loadSettings$1.L$0;
                ResultKt.throwOnFailure(obj);
                UsercentricsSettings usercentricsSettings2 = (UsercentricsSettings) obj;
                String jsonFileLanguage = settingsInitializationParameters.getJsonFileLanguage();
                boolean bypassCache = settingsService.cacheBypassResolver.getBypassCache();
                settingsService$loadSettings$1.L$0 = settingsService;
                settingsService$loadSettings$1.L$1 = usercentricsSettings2;
                settingsService$loadSettings$1.label = 2;
                services = settingsService.getServices(jsonFileLanguage, usercentricsSettings2, bypassCache, settingsService$loadSettings$1);
                if (services != coroutine_suspended) {
                    obj = services;
                    usercentricsSettings = usercentricsSettings2;
                    settingsService2 = settingsService;
                    Pair pair2 = (Pair) obj;
                    settingsService2.setSettings(new NewSettingsData(usercentricsSettings, (List) pair2.getFirst(), ((Number) pair2.getSecond()).intValue()));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        settingsService$loadSettings$1 = new SettingsService$loadSettings$1(this, continuation);
        Object obj2 = settingsService$loadSettings$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsService$loadSettings$1.label;
        if (i != 0) {
        }
        UsercentricsSettings usercentricsSettings22 = (UsercentricsSettings) obj2;
        String jsonFileLanguage2 = settingsInitializationParameters.getJsonFileLanguage();
        boolean bypassCache2 = settingsService.cacheBypassResolver.getBypassCache();
        settingsService$loadSettings$1.L$0 = settingsService;
        settingsService$loadSettings$1.L$1 = usercentricsSettings22;
        settingsService$loadSettings$1.label = 2;
        services = settingsService.getServices(jsonFileLanguage2, usercentricsSettings22, bypassCache2, settingsService$loadSettings$1);
        if (services != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSettings(SettingsInitializationParameters settingsInitializationParameters, Continuation<? super UsercentricsSettings> continuation) {
        SettingsService$getSettings$1 settingsService$getSettings$1;
        int i;
        SettingsService settingsService;
        if (continuation instanceof SettingsService$getSettings$1) {
            settingsService$getSettings$1 = (SettingsService$getSettings$1) continuation;
            if ((settingsService$getSettings$1.label & Integer.MIN_VALUE) != 0) {
                settingsService$getSettings$1.label -= Integer.MIN_VALUE;
                Object obj = settingsService$getSettings$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsService$getSettings$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ISettingsRepository iSettingsRepository = this.settingsRepository;
                    settingsService$getSettings$1.L$0 = this;
                    settingsService$getSettings$1.L$1 = settingsInitializationParameters;
                    settingsService$getSettings$1.label = 1;
                    obj = iSettingsRepository.fetchSettings(settingsInitializationParameters, settingsService$getSettings$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    settingsService = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    settingsInitializationParameters = (SettingsInitializationParameters) settingsService$getSettings$1.L$1;
                    settingsService = (SettingsService) settingsService$getSettings$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                settingsService.cacheBypassResolver.update(settingsInitializationParameters.getLanguageEtagChanged(), settingsService.settingsRepository.getSettingsEtagChanged());
                return settingsService.removeDeactivatedServices((UsercentricsSettings) obj);
            }
        }
        settingsService$getSettings$1 = new SettingsService$getSettings$1(this, continuation);
        Object obj2 = settingsService$getSettings$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsService$getSettings$1.label;
        if (i != 0) {
        }
        settingsService.cacheBypassResolver.update(settingsInitializationParameters.getLanguageEtagChanged(), settingsService.settingsRepository.getSettingsEtagChanged());
        return settingsService.removeDeactivatedServices((UsercentricsSettings) obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getServices(String str, UsercentricsSettings usercentricsSettings, boolean z, Continuation<? super Pair<? extends List<UsercentricsService>, Integer>> continuation) {
        SettingsService$getServices$1 settingsService$getServices$1;
        int i;
        Map<String, UsercentricsCategory> mapCategoriesByCategorySlug;
        SettingsService settingsService;
        Object obj;
        int i2;
        if (continuation instanceof SettingsService$getServices$1) {
            settingsService$getServices$1 = (SettingsService$getServices$1) continuation;
            if ((settingsService$getServices$1.label & Integer.MIN_VALUE) != 0) {
                settingsService$getServices$1.label -= Integer.MIN_VALUE;
                Object obj2 = settingsService$getServices$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsService$getServices$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    mapCategoriesByCategorySlug = mapCategoriesByCategorySlug(usercentricsSettings.getCategories$usercentrics_release());
                    Pair<List<BasicConsentTemplate>, Integer> servicesAndSubServicesFromSettings = servicesAndSubServicesFromSettings(usercentricsSettings, mapCategoriesByCategorySlug);
                    List<BasicConsentTemplate> first = servicesAndSubServicesFromSettings.getFirst();
                    if (first.isEmpty()) {
                        return new Pair(CollectionsKt.emptyList(), Boxing.boxInt(0));
                    }
                    int intValue = servicesAndSubServicesFromSettings.getSecond().intValue();
                    IAggregatorRepository iAggregatorRepository = this.aggregatorRepository;
                    settingsService$getServices$1.L$0 = this;
                    settingsService$getServices$1.L$1 = usercentricsSettings;
                    settingsService$getServices$1.L$2 = mapCategoriesByCategorySlug;
                    settingsService$getServices$1.I$0 = intValue;
                    settingsService$getServices$1.label = 1;
                    Object fetchServices = iAggregatorRepository.fetchServices(str, first, z, settingsService$getServices$1);
                    if (fetchServices == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    settingsService = this;
                    obj = fetchServices;
                    i2 = intValue;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = settingsService$getServices$1.I$0;
                    Map<String, UsercentricsCategory> map = (Map) settingsService$getServices$1.L$2;
                    UsercentricsSettings usercentricsSettings2 = (UsercentricsSettings) settingsService$getServices$1.L$1;
                    settingsService = (SettingsService) settingsService$getServices$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    mapCategoriesByCategorySlug = map;
                    usercentricsSettings = usercentricsSettings2;
                    obj = obj2;
                }
                return new Pair(settingsService.aggregateServicesByCategory(usercentricsSettings.getConsentTemplates$usercentrics_release(), (List) obj, mapCategoriesByCategorySlug), Boxing.boxInt(i2));
            }
        }
        settingsService$getServices$1 = new SettingsService$getServices$1(this, continuation);
        Object obj22 = settingsService$getServices$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsService$getServices$1.label;
        if (i != 0) {
        }
        return new Pair(settingsService.aggregateServicesByCategory(usercentricsSettings.getConsentTemplates$usercentrics_release(), (List) obj, mapCategoriesByCategorySlug), Boxing.boxInt(i2));
    }

    private final Map<String, UsercentricsCategory> mapCategoriesByCategorySlug(List<UsercentricsCategory> categories) {
        if (categories == null) {
            return MapsKt.emptyMap();
        }
        List<UsercentricsCategory> list = categories;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((UsercentricsCategory) obj).getCategorySlug(), obj);
        }
        return linkedHashMap;
    }

    private final List<UsercentricsService> aggregateServicesByCategory(List<ServiceConsentTemplate> consentTemplates, List<UsercentricsService> aggregatorServices, Map<String, UsercentricsCategory> categoriesByCategoriesSlugsMap) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        List<UsercentricsService> list = aggregatorServices;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (UsercentricsService usercentricsService : list) {
            Iterator<T> it = consentTemplates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(usercentricsService.getTemplateId(), ((ServiceConsentTemplate) obj).getTemplateId())) {
                    break;
                }
            }
            ServiceConsentTemplate serviceConsentTemplate = (ServiceConsentTemplate) obj;
            UsercentricsCategory usercentricsCategory = categoriesByCategoriesSlugsMap.get(serviceConsentTemplate != null ? serviceConsentTemplate.getCategorySlug() : null);
            if (serviceConsentTemplate != null && usercentricsCategory != null) {
                arrayList.add(updateService(usercentricsService, serviceConsentTemplate, usercentricsCategory));
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return arrayList;
    }

    private final UsercentricsService updateService(UsercentricsService aggregatorService, ServiceConsentTemplate consentTemplate, UsercentricsCategory category) {
        List<String> legalBasisList;
        List<String> legalBasisList2 = consentTemplate.getLegalBasisList();
        if (legalBasisList2 != null && !legalBasisList2.isEmpty()) {
            legalBasisList = consentTemplate.getLegalBasisList();
        } else {
            legalBasisList = aggregatorService.getLegalBasisList();
        }
        return UsercentricsService.copy$default(aggregatorService, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, legalBasisList, null, null, null, null, null, null, null, null, null, null, category.getCategorySlug(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, category.isHidden() || consentTemplate.isHidden(), null, consentTemplate.isDeactivated(), consentTemplate.isAutoUpdateAllowed(), consentTemplate.getDisableLegalBasis(), category.isEssential(), -67141633, 1535, null);
    }

    private final UsercentricsSettings removeDeactivatedServices(UsercentricsSettings settings) {
        List<ServiceConsentTemplate> consentTemplates$usercentrics_release = settings.getConsentTemplates$usercentrics_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : consentTemplates$usercentrics_release) {
            if (!Intrinsics.areEqual((Object) ((ServiceConsentTemplate) obj).isDeactivated(), (Object) true)) {
                arrayList.add(obj);
            }
        }
        return UsercentricsSettings.copy$default(settings, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, arrayList, null, -1, 2, null);
    }

    private final Pair<List<BasicConsentTemplate>, Integer> servicesAndSubServicesFromSettings(UsercentricsSettings settings, Map<String, UsercentricsCategory> categoriesMap) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (ServiceConsentTemplate serviceConsentTemplate : settings.getConsentTemplates$usercentrics_release()) {
            if (categoriesMap.containsKey(serviceConsentTemplate.getCategorySlug())) {
                arrayList.add(basicConsentTemplate(serviceConsentTemplate));
                Iterator<T> it = serviceConsentTemplate.getSubConsents().iterator();
                while (it.hasNext()) {
                    arrayList.add(basicConsentTemplate((SubConsentTemplate) it.next()));
                }
                i++;
            }
        }
        return new Pair<>(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.usercentrics.sdk.v2.settings.service.SettingsService$servicesAndSubServicesFromSettings$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((BasicConsentTemplate) t).getTemplateId(), ((BasicConsentTemplate) t2).getTemplateId());
            }
        }), Integer.valueOf(i));
    }

    private final BasicConsentTemplate basicConsentTemplate(ConsentTemplate service) {
        return new BasicConsentTemplate(service.getTemplateId(), service.getVersion());
    }
}
