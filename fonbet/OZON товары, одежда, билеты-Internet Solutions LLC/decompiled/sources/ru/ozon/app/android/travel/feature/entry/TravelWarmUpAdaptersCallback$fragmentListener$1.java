package ru.ozon.app.android.travel.feature.entry;

import Ib.a;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.K;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.travel.feature.entry.flags.TravelHomeWarmupAdaptersFlag;
import ru.ozon.app.android.travel.utils.TravelHostFragment;
import ru.ozon.app.android.warmup.WarmupAdaptersFacade;
import ru.ozon.app.android.warmup.WarmupInfo;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"ru/ozon/app/android/travel/feature/entry/TravelWarmUpAdaptersCallback$fragmentListener$1", "Landroidx/fragment/app/G$m;", "", "warmUpJsonAdapters", "()V", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "getFlags", "()Ljava/util/Set;", "Landroidx/fragment/app/G;", "fm", "Landroidx/fragment/app/m;", "fragment", "Landroid/content/Context;", "context", "onFragmentAttached", "(Landroidx/fragment/app/G;Landroidx/fragment/app/m;Landroid/content/Context;)V", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelWarmUpAdaptersCallback$fragmentListener$1 extends G.m {
    final /* synthetic */ TravelWarmUpAdaptersCallback this$0;

    TravelWarmUpAdaptersCallback$fragmentListener$1(TravelWarmUpAdaptersCallback travelWarmUpAdaptersCallback) {
        this.this$0 = travelWarmUpAdaptersCallback;
    }

    private final Set<FeatureFlag> getFlags() {
        return e0.h(TravelHomeWarmupAdaptersFlag.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void warmUpJsonAdapters() {
        a aVar;
        Moshi moshi;
        aVar = this.this$0.warmupAdaptersFacade;
        List<WarmupInfo> warmupInfos = ((WarmupAdaptersFacade) aVar.get()).getWarmupInfos(getFlags());
        ArrayList<Class> arrayList = new ArrayList();
        Iterator<T> it = warmupInfos.iterator();
        while (it.hasNext()) {
            C7714v.p(((WarmupInfo) it.next()).getDtosToWarmup(), arrayList);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            TravelWarmUpAdaptersCallback travelWarmUpAdaptersCallback = this.this$0;
            for (Class cls : arrayList) {
                moshi = travelWarmUpAdaptersCallback.moshi;
                moshi.c(cls);
            }
            Lm0.a.f17149a.i("Moshi adapters preloaded: " + arrayList, new Object[0]);
        }
    }

    @Override // androidx.fragment.app.G.m
    public void onFragmentAttached(G fm, ComponentCallbacksC5392m fragment, Context context) {
        boolean z11;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(context, "context");
        if (fragment instanceof TravelHostFragment) {
            z11 = this.this$0.isWarmUp;
            if (z11) {
                return;
            }
            this.this$0.isWarmUp = true;
            C10727i.c(K.a(fragment), C10720e0.a(), null, new TravelWarmUpAdaptersCallback$fragmentListener$1$onFragmentAttached$1(this, null), 2);
        }
    }
}
