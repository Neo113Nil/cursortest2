package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.DeveloperProvidedBillingDetails;
import com.android.billingclient.api.DeveloperProvidedBillingListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.android.billingclient.api.UserChoiceDetails;
import com.android.billingclient.api.m;
import com.android.billingclient.api.zzdc;
import com.google.android.gms.internal.play_billing.a;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzpg;
import java.util.ArrayList;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pko extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public pko(u53 u53Var, boolean z) {
        this.d = u53Var;
        this.c = z;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        zzpg zzpgVar = (zzpg) this.d;
        zzpgVar.m0();
        zzpgVar.d().Q();
        zzpgVar.d().Q();
        if (this.b) {
            zzpgVar.b().o.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                zzpgVar.l.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                zzpgVar.b().g.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public synchronized void c(Context context) {
        if (!this.b) {
            int i = zzc.a;
        } else {
            context.unregisterReceiver(this);
            this.b = false;
        }
    }

    public void d(Bundle bundle, BillingResult billingResult, int i, zzjz zzjzVar, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            lyn lynVar = (lyn) ((u53) this.d).f;
            if (byteArray != null) {
                ((c0l) lynVar).w(zzjl.t(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((c0l) lynVar).w(zzdc.zzb(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i, billingResult, null, zzjzVar), j, z);
            }
        } catch (Throwable unused) {
            int i2 = zzc.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0234  */
    /* JADX WARN: Type inference failed for: r10v1, types: [lyn] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [c0l] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        zzjz zzjzVar;
        BillingResult f;
        BillingResult billingResult;
        BillingResult billingResult2;
        int intValue;
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                zzpg zzpgVar = (zzpg) obj;
                zzpgVar.m0();
                String action = intent.getAction();
                zzpgVar.b().o.b(action, "NetworkBroadcastReceiver received action");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    zzgz zzgzVar = zzpgVar.b;
                    zzpg.U(zzgzVar);
                    boolean U = zzgzVar.U();
                    if (this.c != U) {
                        this.c = U;
                        zzpgVar.d().Z(new x3o(this, U));
                        break;
                    }
                } else {
                    zzpgVar.b().j.b(action, "NetworkBroadcastReceiver received unknown action");
                    break;
                }
                break;
            default:
                u53 u53Var = (u53) obj;
                PurchasesUpdatedListener purchasesUpdatedListener = (PurchasesUpdatedListener) u53Var.c;
                ?? r10 = (lyn) u53Var.f;
                String action2 = intent.getAction();
                int hashCode = action2.hashCode();
                zzjz zzjzVar2 = zzjz.LOCAL_PURCHASES_UPDATED_ACTION;
                zzjz zzjzVar3 = zzjz.PURCHASES_UPDATED_ACTION;
                zzjz zzjzVar4 = zzjz.ALTERNATIVE_BILLING_ACTION;
                if (hashCode == -1484087650) {
                    if (action2.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                        zzjzVar = zzjzVar3;
                    }
                    zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
                } else if (hashCode != -337612916) {
                    if (hashCode == 345207161 && action2.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                        zzjzVar = zzjzVar4;
                    }
                    zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
                } else {
                    if (action2.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                        zzjzVar = zzjzVar2;
                    }
                    zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
                }
                int i2 = (zzjzVar.equals(zzjzVar2) || zzjzVar.equals(zzjzVar4)) ? 2 : zzjzVar.equals(zzjzVar3) ? 32 : 1;
                Bundle extras = intent.getExtras();
                ArrayList arrayList = null;
                if (extras == null) {
                    int i3 = zzc.a;
                    BillingResult billingResult3 = m.h;
                    ((c0l) r10).o(zzdc.zzb(zzjs.NULL_BUNDLE_IN_BROADCAST_RECEIVER, i2, billingResult3, null, zzjzVar));
                    if (purchasesUpdatedListener != null) {
                        purchasesUpdatedListener.onPurchasesUpdated(billingResult3, null);
                        break;
                    }
                } else {
                    if (i2 == 2) {
                        int i4 = zzc.a;
                        BillingResult.Builder newBuilder = BillingResult.newBuilder();
                        newBuilder.setResponseCode(zzc.a(intent.getExtras(), "BillingBroadcastManager"));
                        Bundle extras2 = intent.getExtras();
                        if (extras2 != null) {
                            Object obj2 = extras2.get("SUB_RESPONSE_CODE");
                            if (obj2 == null) {
                                zzc.h("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                            } else if (obj2 instanceof Integer) {
                                intValue = ((Integer) obj2).intValue();
                                newBuilder.setOnPurchasesUpdatedSubResponseCode(intValue);
                                newBuilder.setDebugMessage(zzc.g(intent.getExtras(), "BillingBroadcastManager"));
                                f = newBuilder.build();
                            } else {
                                "Unexpected type for bundle sub response code: ".concat(obj2.getClass().getName());
                            }
                        }
                        intValue = 0;
                        newBuilder.setOnPurchasesUpdatedSubResponseCode(intValue);
                        newBuilder.setDebugMessage(zzc.g(intent.getExtras(), "BillingBroadcastManager"));
                        f = newBuilder.build();
                    } else {
                        f = zzc.f("BillingBroadcastManager", intent);
                    }
                    long j = extras.getLong("billingClientTransactionId", 0L);
                    boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
                    if (!zzjzVar.equals(zzjzVar3) && !zzjzVar.equals(zzjzVar2)) {
                        if (zzjzVar.equals(zzjzVar4)) {
                            if (f.getResponseCode() != 0) {
                                BillingResult billingResult4 = f;
                                d(extras, billingResult4, i2, zzjzVar, j, z);
                                dqn dqnVar = zzca.b;
                                purchasesUpdatedListener.onPurchasesUpdated(billingResult4, a.e);
                                break;
                            } else {
                                zzjz zzjzVar5 = zzjzVar;
                                int i5 = i2;
                                UserChoiceBillingListener userChoiceBillingListener = (UserChoiceBillingListener) u53Var.d;
                                DeveloperProvidedBillingListener developerProvidedBillingListener = (DeveloperProvidedBillingListener) u53Var.e;
                                if (userChoiceBillingListener == null && developerProvidedBillingListener == null) {
                                    BillingResult billingResult5 = m.h;
                                    ((c0l) r10).w(zzdc.zzb(zzjs.NULL_DEVELOPER_MANAGED_BILLING_LISTENER, i5, billingResult5, null, zzjzVar5), j, z);
                                    dqn dqnVar2 = zzca.b;
                                    purchasesUpdatedListener.onPurchasesUpdated(billingResult5, a.e);
                                    break;
                                } else {
                                    String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                                    if (string == null) {
                                        BillingResult billingResult6 = m.h;
                                        ((c0l) r10).w(zzdc.zzb(zzjs.MISSING_ALTERNATIVE_BILLING_USER_CHOICE_DATA, i5, billingResult6, null, zzjzVar5), j, z);
                                        dqn dqnVar3 = zzca.b;
                                        purchasesUpdatedListener.onPurchasesUpdated(billingResult6, a.e);
                                        break;
                                    } else {
                                        try {
                                            if (userChoiceBillingListener != null) {
                                                userChoiceBillingListener.userSelectedAlternativeBilling(new UserChoiceDetails(string));
                                            } else {
                                                developerProvidedBillingListener.onUserSelectedDeveloperBilling(new DeveloperProvidedBillingDetails(string));
                                            }
                                            r10 = (c0l) r10;
                                            r10.y(zzdc.zzc(i5, zzjzVar5), j, z);
                                            break;
                                        } catch (JSONException unused) {
                                            int i6 = zzc.a;
                                            BillingResult billingResult7 = m.h;
                                            ((c0l) r10).w(zzdc.zzb(zzjs.INVALID_ALTERNATIVE_BILLING_USER_CHOICE_DATA, i5, billingResult7, null, zzjzVar5), j, z);
                                            dqn dqnVar4 = zzca.b;
                                            purchasesUpdatedListener.onPurchasesUpdated(billingResult7, a.e);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        BillingResult billingResult8 = f;
                        int i7 = i2;
                        zzjz zzjzVar6 = zzjzVar;
                        zzcf zzcfVar = (zzcf) u53Var.i;
                        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        ArrayList arrayList2 = new ArrayList();
                        if (stringArrayList == null || stringArrayList2 == null) {
                            billingResult = billingResult8;
                            Purchase i8 = zzc.i(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"), zzcfVar);
                            if (i8 == null) {
                                zzc.h("BillingHelper", "Couldn't find single purchase data as well.");
                                if (billingResult.getResponseCode() != 0) {
                                    ((c0l) r10).y(zzdc.zzc(i7, zzjzVar6), j, z);
                                    billingResult2 = billingResult;
                                } else {
                                    billingResult2 = billingResult;
                                    d(extras, billingResult2, i7, zzjzVar6, j, z);
                                }
                                purchasesUpdatedListener.onPurchasesUpdated(billingResult2, arrayList);
                                break;
                            } else {
                                arrayList2.add(i8);
                            }
                        } else {
                            billingResult = billingResult8;
                            zzc.h("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                            for (int i9 = 0; i9 < stringArrayList.size() && i9 < stringArrayList2.size(); i9++) {
                                Purchase i10 = zzc.i(stringArrayList.get(i9), stringArrayList2.get(i9), zzcfVar);
                                if (i10 != null) {
                                    arrayList2.add(i10);
                                }
                            }
                        }
                        arrayList = arrayList2;
                        if (billingResult.getResponseCode() != 0) {
                        }
                        purchasesUpdatedListener.onPurchasesUpdated(billingResult2, arrayList);
                    }
                }
                break;
        }
    }

    public pko(zzpg zzpgVar) {
        this.d = zzpgVar;
    }
}
