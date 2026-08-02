package ru.rustore.sdk.pushclient.internal.arbiter;

import El0.i;
import El0.l;
import El0.n;
import Pl0.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Za.b;
import Za.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/pushclient/internal/arbiter/ArbiterBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0})
/* loaded from: classes4.dex */
public final class ArbiterBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f97965a = k.b(new a());

    public static final class a extends AbstractC7737t implements Function0<d> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            ArbiterBroadcastReceiver any = ArbiterBroadcastReceiver.this;
            Intrinsics.checkNotNullParameter(any, "any");
            n nVar = e.f22651b;
            return (nVar != null ? nVar.f8117c : new b("VkpnsClientSdk")).a(any);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((d) this.f97965a.getValue()).info("Master update broadcast received");
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 1854594276 && action.equals("com.vk.push.ACTION_MASTER_HOST_UPDATE")) {
            i iVar = i.f8074r;
            if (iVar == null) {
                Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
            } else {
                iVar.f8076b.info("Update master");
                C10727i.c(iVar.f8089o, null, null, new l(iVar, null), 3);
            }
        }
    }
}
