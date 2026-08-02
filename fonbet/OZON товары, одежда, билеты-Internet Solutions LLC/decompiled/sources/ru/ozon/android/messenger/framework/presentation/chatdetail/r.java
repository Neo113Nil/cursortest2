package ru.ozon.android.messenger.framework.presentation.chatdetail;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatdetail.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;

/* loaded from: classes10.dex */
public final class r extends RecyclerView.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f89930a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.view.recycler.i f89931b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MessengerMetricsRecyclerView f89932c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ LinearLayoutManager f89933d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89934a;

        static {
            int[] iArr = new int[d.EnumC9455c.values().length];
            try {
                iArr[d.EnumC9455c.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f89934a = iArr;
        }
    }

    r(k kVar, ru.ozon.android.messenger.framework.presentation.common.view.recycler.i iVar, MessengerMetricsRecyclerView messengerMetricsRecyclerView, LinearLayoutManager linearLayoutManager) {
        this.f89930a = kVar;
        this.f89931b = iVar;
        this.f89932c = messengerMetricsRecyclerView;
        this.f89933d = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeInserted(int i11, int i12) {
        boolean z11;
        boolean z12;
        k kVar = this.f89930a;
        z11 = kVar.f89904s;
        final LinearLayoutManager linearLayoutManager = this.f89933d;
        ru.ozon.android.messenger.framework.presentation.common.view.recycler.i iVar = this.f89931b;
        if (!z11 || i12 == 0) {
            z12 = kVar.f89905t;
            if (z12 && i12 != 0) {
                kVar.f89905t = false;
                kVar.f89904s = false;
                return;
            }
            boolean z13 = i12 + i11 == iVar.getShimmersCount();
            boolean z14 = linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 >= i11;
            if (z13 && z14) {
                MessengerMetricsRecyclerView messengerMetricsRecyclerView = this.f89932c;
                Intrinsics.f(messengerMetricsRecyclerView);
                ru.ozon.android.messenger.utils.view.k.a(messengerMetricsRecyclerView, iVar.getShimmersCount(), false, 6);
                return;
            }
            return;
        }
        if (kVar.E() == null || kVar.K()) {
            d.EnumC9455c H11 = kVar.H();
            if ((H11 == null ? -1 : a.f89934a[H11.ordinal()]) == 1) {
                Integer C11 = kVar.C();
                final int intValue = C11 != null ? C11.intValue() : iVar.getShimmersCount() - 1;
                final k kVar2 = this.f89930a;
                final ru.ozon.android.messenger.framework.presentation.common.view.recycler.i iVar2 = this.f89931b;
                final MessengerMetricsRecyclerView messengerMetricsRecyclerView2 = this.f89932c;
                messengerMetricsRecyclerView2.post(new Runnable() { // from class: ru.ozon.android.messenger.framework.presentation.chatdetail.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        linearLayoutManager.scrollToPositionWithOffset(intValue, MessengerMetricsRecyclerView.this.getHeight() / 2);
                        k kVar3 = kVar2;
                        if (kVar3.F()) {
                            iVar2.g(kVar3.G());
                        }
                    }
                });
            } else {
                Integer C12 = kVar.C();
                linearLayoutManager.scrollToPosition(C12 != null ? C12.intValue() : iVar.getShimmersCount());
                if (kVar.F()) {
                    iVar.g(kVar.G());
                }
            }
        } else {
            linearLayoutManager.onRestoreInstanceState(kVar.E());
        }
        kVar.f89904s = false;
        kVar.f89905t = false;
    }
}
