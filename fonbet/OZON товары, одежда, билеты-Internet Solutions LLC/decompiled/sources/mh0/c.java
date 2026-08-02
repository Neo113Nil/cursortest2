package mh0;

import Wh0.d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.messaging.FirebaseMessaging;
import gh0.InterfaceC6738d;
import ht.C6974a;
import java.util.concurrent.CompletableFuture;
import jh0.C7429a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c implements InterfaceC6738d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6738d.b f74889a = InterfaceC6738d.b.FCM;

    static final class a extends AbstractC7737t implements Function1<String, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ jh0.c f74890b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CompletableFuture<InterfaceC6738d.a> f74891c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CompletableFuture completableFuture, jh0.c cVar) {
            super(1);
            this.f74890b = cVar;
            this.f74891c = completableFuture;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            Intrinsics.f(str2);
            jh0.b bVar = jh0.b.FCM;
            jh0.c updateTrigger = this.f74890b;
            d.b result = new d.b(new C7429a(str2, bVar, updateTrigger));
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
            this.f74891c.complete(new InterfaceC6738d.a(bVar, updateTrigger, result));
            return Unit.f71690a;
        }
    }

    @Override // gh0.InterfaceC6738d
    @NotNull
    public final CompletableFuture<InterfaceC6738d.a> a(@NotNull final jh0.c updateTrigger) {
        Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
        final CompletableFuture<InterfaceC6738d.a> completableFuture = new CompletableFuture<>();
        FirebaseMessaging.l().n().addOnSuccessListener(new C6974a(new a(completableFuture, updateTrigger))).addOnFailureListener(new OnFailureListener() { // from class: mh0.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                d.a result = new d.a(exception);
                Intrinsics.checkNotNullParameter(result, "result");
                jh0.c updateTrigger2 = updateTrigger;
                Intrinsics.checkNotNullParameter(updateTrigger2, "updateTrigger");
                completableFuture.complete(new InterfaceC6738d.a(jh0.b.FCM, updateTrigger2, result));
            }
        });
        return completableFuture;
    }

    @Override // gh0.InterfaceC6738d
    @NotNull
    public final InterfaceC6738d.b getType() {
        return this.f74889a;
    }
}
