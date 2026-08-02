package com.vk.ecomm.onlinebooking.impl.services.presentation;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.services.presentation.c;
import com.vk.ecomm.onlinebooking.impl.services.presentation.e;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.dmv;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: BookingServicesScreenTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTaskExecutor$loadAvailableServices$1", f = "BookingServicesScreenTaskExecutor.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ UserId $groupId;
    final /* synthetic */ BookingMaster $master;
    final /* synthetic */ List<BookingServiceModel> $selectedServicesWithCurrent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, UserId userId, List<BookingServiceModel> list, BookingMaster bookingMaster, spj<? super g> spjVar) {
        super(2, spjVar);
        this.this$0 = jVar;
        this.$groupId = userId;
        this.$selectedServicesWithCurrent = list;
        this.$master = bookingMaster;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        g gVar = new g(this.this$0, this.$groupId, this.$selectedServicesWithCurrent, this.$master, spjVar);
        gVar.L$0 = obj;
        return gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j jVar;
        e.j jVar2;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    this.this$0.e(new e.j(true));
                    dmv dmvVar = this.this$0.h;
                    UserId userId = this.$groupId;
                    List<BookingServiceModel> list = this.$selectedServicesWithCurrent;
                    BookingMaster bookingMaster = this.$master;
                    this.L$0 = yvjVar;
                    this.label = 1;
                    obj = dmvVar.c(userId, bookingMaster, list, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                List list2 = (List) obj;
                zvj.e(yvjVar);
                if (!list2.isEmpty()) {
                    this.this$0.e(new e.b(list2));
                }
                jVar = this.this$0;
                jVar2 = new e.j(false);
            } catch (Exception e) {
                zvj.e(yvjVar);
                this.this$0.c(new c.b(e));
                jVar = this.this$0;
                jVar2 = new e.j(false);
            }
            jVar.e(jVar2);
            return s3q0.a;
        } catch (Throwable th) {
            this.this$0.e(new e.j(false));
            throw th;
        }
    }
}
