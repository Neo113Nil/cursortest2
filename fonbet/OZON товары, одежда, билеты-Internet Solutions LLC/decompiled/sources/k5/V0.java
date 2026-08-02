package k5;

import android.content.Context;
import android.os.Build;
import android.telephony.ServiceState;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class V0 {

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet f70664b = C7540m0.a(EnumC7578w.READ_PHONE_STATE);

    /* renamed from: a, reason: collision with root package name */
    private final Context f70665a;

    private static final class a implements InterfaceC7521h1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f70666a;

        private a(int i11) {
            this.f70666a = i11;
        }

        static a a(int i11) {
            return new a(i11);
        }

        static a c(SubscriptionInfo subscriptionInfo) {
            if (Build.VERSION.SDK_INT >= 29) {
                subscriptionInfo.getMccString();
                subscriptionInfo.getMncString();
            } else {
                String.valueOf(subscriptionInfo.getMcc());
                String.valueOf(subscriptionInfo.getMnc());
            }
            subscriptionInfo.getSimSlotIndex();
            return new a(subscriptionInfo.getSubscriptionId());
        }

        @Override // k5.InterfaceC7521h1
        public final int b() {
            return this.f70666a;
        }
    }

    V0(@NonNull Context context) {
        this.f70665a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        r9 = r3.getSubscriptionIds(r8);
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a() {
        int[] subscriptionIds;
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList();
        Context context = this.f70665a;
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
        if (subscriptionManager != null) {
            Iterator it = f70664b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<SubscriptionInfo> it2 = subscriptionManager.getActiveSubscriptionInfoList().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(a.c(it2.next()));
                    }
                } else if (!Gf.d.l(context, ((EnumC7578w) it.next()).a())) {
                    int activeSubscriptionInfoCountMax = subscriptionManager.getActiveSubscriptionInfoCountMax();
                    int defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
                    int i11 = Build.VERSION.SDK_INT;
                    int slotIndex = i11 >= 29 ? SubscriptionManager.getSlotIndex(defaultSubscriptionId) : 0;
                    arrayList3.add(a.a(defaultSubscriptionId));
                    if (i11 >= 29 && activeSubscriptionInfoCountMax > 1) {
                        int i12 = 0;
                        while (i12 < activeSubscriptionInfoCountMax) {
                            if (i12 != slotIndex && subscriptionIds != null) {
                                int length = subscriptionIds.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        break;
                                    }
                                    int i14 = subscriptionIds[i13];
                                    if (i14 != defaultSubscriptionId) {
                                        arrayList3.add(a.a(i14));
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            i12++;
                        }
                    }
                }
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            InterfaceC7521h1 interfaceC7521h1 = (InterfaceC7521h1) it3.next();
            ServiceState a11 = ((C7490I) d3.a(interfaceC7521h1.b(), context)).a();
            int state = a11 != null ? a11.getState() : 3;
            if (state != 3 && state != 1) {
                arrayList2.add(interfaceC7521h1);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList.add(Integer.valueOf(((InterfaceC7521h1) it4.next()).b()));
        }
        return arrayList;
    }
}
