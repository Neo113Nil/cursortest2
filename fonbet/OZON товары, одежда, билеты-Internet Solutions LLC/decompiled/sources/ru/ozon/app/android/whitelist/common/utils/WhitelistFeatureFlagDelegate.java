package ru.ozon.app.android.whitelist.common.utils;

import Lm0.a;
import id.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.OnChangeFeatureListener;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.whitelist.common.utils.WhitelistFeatureFlagDelegate;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/whitelist/common/utils/WhitelistFeatureFlagDelegate;", "Lid/e;", "", "", "", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "flag", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)V", "parseDomains", "()Ljava/util/Set;", "thisRef", "Lkotlin/reflect/m;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/m;)Ljava/util/Set;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "cache", "Ljava/util/Set;", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WhitelistFeatureFlagDelegate implements e<Object, Set<? extends String>> {
    private Set<String> cache;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final FeatureFlag flag;

    public WhitelistFeatureFlagDelegate(@NotNull FeatureService featureService, @NotNull FeatureFlag flag) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(flag, "flag");
        this.featureService = featureService;
        this.flag = flag;
        featureService.addOnChangeFeatureListener(new OnChangeFeatureListener() { // from class: OY.a
            @Override // ru.ozon.app.android.network.abtool.OnChangeFeatureListener
            public final void onChangeFeature() {
                WhitelistFeatureFlagDelegate.this.cache = null;
            }
        });
    }

    private final Set<String> parseDomains() {
        String stringKey = this.featureService.getStringKey(this.flag);
        try {
            List l11 = h.l(stringKey, new char[]{','}, 0, 6);
            ArrayList arrayList = new ArrayList(C7714v.z(l11, 10));
            Iterator it = l11.iterator();
            while (it.hasNext()) {
                arrayList.add(h.z0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList2.add(next);
                }
            }
            return C7714v.Y0(arrayList2);
        } catch (Exception unused) {
            a.f17149a.e(V.e.a("Can't parse ", this.flag.getFeatureName(), " = ", stringKey, " to list"), new Object[0]);
            return M.f71699a;
        }
    }

    @Override // id.e
    public /* bridge */ /* synthetic */ Set<? extends String> getValue(Object obj, m mVar) {
        return getValue2(obj, (m<?>) mVar);
    }

    @Override // id.e
    @NotNull
    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    public Set<? extends String> getValue2(@NotNull Object thisRef, @NotNull m<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Set<String> set = this.cache;
        if (set != null) {
            return set;
        }
        Set<String> parseDomains = parseDomains();
        this.cache = parseDomains;
        return parseDomains;
    }
}
