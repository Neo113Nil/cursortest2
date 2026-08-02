package ru.ozon.app.android.fresh.feature.entry.data;

import He.b;
import Ib.a;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshDefaultTabs;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabBarApi;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigMapper;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabData;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/entry/data/OzonFreshTabConfigRepository;", "", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabBarApi;", "freshTabBarApi", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigMapper;", "mapper", "LIb/a;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshDefaultTabs;", "defaultTabs", "<init>", "(Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabBarApi;Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigMapper;LIb/a;)V", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "getTabConfig", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabBarApi;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigMapper;", "LIb/a;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonFreshTabConfigRepository {

    @NotNull
    private final a<FreshDefaultTabs> defaultTabs;

    @NotNull
    private final FreshTabBarApi freshTabBarApi;

    @NotNull
    private final FreshTabConfigMapper mapper;

    public OzonFreshTabConfigRepository(@NotNull FreshTabBarApi freshTabBarApi, @NotNull FreshTabConfigMapper mapper, @NotNull a<FreshDefaultTabs> defaultTabs) {
        Intrinsics.checkNotNullParameter(freshTabBarApi, "freshTabBarApi");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(defaultTabs, "defaultTabs");
        this.freshTabBarApi = freshTabBarApi;
        this.mapper = mapper;
        this.defaultTabs = defaultTabs;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTabConfig(@NotNull d<? super FreshTabData> dVar) {
        OzonFreshTabConfigRepository$getTabConfig$1 ozonFreshTabConfigRepository$getTabConfig$1;
        int i11;
        OzonFreshTabConfigRepository ozonFreshTabConfigRepository;
        if (dVar instanceof OzonFreshTabConfigRepository$getTabConfig$1) {
            ozonFreshTabConfigRepository$getTabConfig$1 = (OzonFreshTabConfigRepository$getTabConfig$1) dVar;
            int i12 = ozonFreshTabConfigRepository$getTabConfig$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                ozonFreshTabConfigRepository$getTabConfig$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = ozonFreshTabConfigRepository$getTabConfig$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = ozonFreshTabConfigRepository$getTabConfig$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        b bVar = b.f10879b;
                        OzonFreshTabConfigRepository$getTabConfig$2 ozonFreshTabConfigRepository$getTabConfig$2 = new OzonFreshTabConfigRepository$getTabConfig$2(this, null);
                        ozonFreshTabConfigRepository$getTabConfig$1.L$0 = this;
                        ozonFreshTabConfigRepository$getTabConfig$1.label = 1;
                        obj = C10727i.f(bVar, ozonFreshTabConfigRepository$getTabConfig$2, ozonFreshTabConfigRepository$getTabConfig$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                        ozonFreshTabConfigRepository = this;
                    } catch (Throwable unused) {
                        ozonFreshTabConfigRepository = this;
                        return ozonFreshTabConfigRepository.defaultTabs.get().getData();
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ozonFreshTabConfigRepository = (OzonFreshTabConfigRepository) ozonFreshTabConfigRepository$getTabConfig$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Throwable unused2) {
                        return ozonFreshTabConfigRepository.defaultTabs.get().getData();
                    }
                }
                return (FreshTabData) obj;
            }
        }
        ozonFreshTabConfigRepository$getTabConfig$1 = new OzonFreshTabConfigRepository$getTabConfig$1(this, dVar);
        Object obj2 = ozonFreshTabConfigRepository$getTabConfig$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = ozonFreshTabConfigRepository$getTabConfig$1.label;
        if (i11 != 0) {
        }
        return (FreshTabData) obj2;
    }
}
